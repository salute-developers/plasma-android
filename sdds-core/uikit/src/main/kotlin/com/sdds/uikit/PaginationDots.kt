package com.sdds.uikit

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.os.SystemClock
import android.util.AttributeSet
import androidx.core.animation.addListener
import androidx.core.content.withStyledAttributes
import androidx.core.graphics.withScale
import androidx.core.graphics.withTranslation
import com.sdds.uikit.drawable.IndicatorDrawable
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.base.AnimationUtils.lerp
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.NumberStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.getIntForState
import com.sdds.uikit.statelist.getNumberStateList

/**
 * Класс PaginationDots — кастомный View для отображения пагинационных индикаторов (точек) с поддержкой анимаций,
 * адаптивного количества видимых точек, масштабирования краевых индикаторов и других пользовательских настроек.
 *
 * Позволяет отображать общее количество элементов, выделять текущий элемент, а также анимировать переходы между ними.
 *
 * @constructor
 * @param context Контекст для инициализации View.
 * @param attrs Атрибуты XML для настройки компонента.
 * @param defStyleAttr Стиль по умолчанию.
 * @param defStyleRes Ресурс стиля по умолчанию.
 */
open class PaginationDots @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_paginationDotsStyle,
    defStyleRes: Int = R.style.Sdds_Components_PaginationDots,
) : View(context, attrs, defStyleAttr) {

    private var _maxIndicatorWidth: Float = 0f
    private var _maxIndicatorHeight: Float = 0f
    private val _dotsPool: ArrayDeque<DotDrawable> = ArrayDeque()
    private var _itemCount: Int = 0
    private var _visibleItemCount: Int = 0
    private var _currentIndex: Int = 0
    private var _prevIndex: Int = 0
    private var _gap: Int = 0
    private var _dotWidthList: NumberStateList? = null
    private var _dotHeightList: NumberStateList? = null
    private var _dotBackground: ColorValueStateList? = null
    private var _windowStart: Int = 0
    private var _origin: Int = 0
    private var _orientation: Int = ORIENTATION_HORIZONTAL

    private val edgeIndicatorEnabled: Boolean
        get() = _edgeIndicatorCount > 0
    private var _edgeIndicatorCount: Int = 0
    private var _edgeIndicatorShrinkFactor: Float = 0f

    private var _scrollShiftPx: Float = 0f

    // Debounce for currentIndex
    private var _lastIndexSetAt: Long = 0L
    private var _pendingIndex: Int? = null
    private val _applyPendingIndex = Runnable {
        val pending = _pendingIndex ?: return@Runnable
        _pendingIndex = null
        _prevIndex = _currentIndex
        _currentIndex = pending
        _lastIndexSetAt = SystemClock.uptimeMillis()
        updateActiveDot()
    }

    private var _animating: Boolean = false
    private var _scrollAnimationCanceled: Boolean = false
    private var _animFromWindowStart: Int = 0
    private var _animToWindowStart: Int = 0
    private var _edgeScaleProgress: Float = 0f
    private var _baseScrollOffset: Float = 0f
    private val _clipBounds = Rect()

    private val prefetchSize: Int
        get() = if (visibleItemCount != itemCount) PREFETCH_SIZE else 0

    private val startThreshold: Float
        get() = when (_orientation) {
            ORIENTATION_HORIZONTAL -> _clipBounds.left
            else -> _clipBounds.top
        } - _baseScrollOffset * prefetchSize

    private val endThreshold: Float
        get() = when (_orientation) {
            ORIENTATION_HORIZONTAL -> _clipBounds.right
            else -> _clipBounds.bottom
        } + _baseScrollOffset * prefetchSize

    private val _edgesAnimator: ValueAnimator by unsafeLazy {
        ValueAnimator.ofFloat().apply {
            duration = AnimationUtils.DEFAULT_DURATION
            interpolator = AnimationUtils.ACCELERATE_DECELERATE_INTERPOLATOR
            addUpdateListener { anim ->
                _edgeScaleProgress = anim.animatedFraction
                invalidate()
            }
        }
    }

    private val _scrollAnimator: ValueAnimator by unsafeLazy {
        ValueAnimator.ofFloat().apply {
            duration = AnimationUtils.DEFAULT_DURATION
            interpolator = AnimationUtils.ACCELERATE_DECELERATE_INTERPOLATOR
            addUpdateListener { anim ->
                _edgeScaleProgress = anim.animatedFraction
                _scrollShiftPx = anim.animatedValue as Float
                invalidate()
            }
            addListener(
                onStart = {
                    _animating = true
                    _scrollAnimationCanceled = false
                },
                onEnd = {
                    _animating = false
                    _edgeScaleProgress = 1f
                    if (!_scrollAnimationCanceled) {
                        _windowStart = _animToWindowStart
                        _scrollShiftPx = 0f
                    }
                    updateActiveDot(
                        animate = false,
                        windowChanged = true,
                    )
                    if (!_scrollAnimationCanceled) {
                        _animFromWindowStart = _windowStart
                        _animToWindowStart = _windowStart
                    }
                },
                onCancel = {
                    _animating = false
                    _scrollAnimationCanceled = true
                },
            )
        }
    }

    /**
     * Общее количество элементов (точек) пагинации.
     *
     * При изменении значения происходит перерасчет и перерисовка индикаторов.
     */
    var itemCount: Int
        get() = _itemCount
        set(value) {
            if (_itemCount != value) {
                val newCount = value.coerceAtLeast(0)
                if (newCount == _itemCount) return
                _itemCount = newCount
                currentIndex = currentIndex.coerceIn(0, (_itemCount - 1).coerceAtLeast(0))
                reset()
            }
        }

    /**
     * Количество одновременно отображаемых индикаторов (точек).
     *
     * Если элементов больше, чем видимых точек, используется окно прокрутки.
     */
    var visibleItemCount: Int
        get() = _visibleItemCount
        set(value) {
            val newVisible = value.coerceAtLeast(0)
            if (newVisible == visibleItemCount) return
            _visibleItemCount = newVisible
            reset()
        }

    /**
     * Индекс текущего активного элемента (точки).
     *
     * Значение автоматически ограничивается диапазоном [0, itemCount - 1].
     * Имеет debounce для предотвращения "скачков" анимации при быстром изменении.
     */
    var currentIndex: Int
        get() = _currentIndex
        set(value) {
            val clamped = value.coerceIn(0, (itemCount - 1).coerceAtLeast(0))
            if (clamped == _currentIndex) return

            val now = SystemClock.uptimeMillis()
            val elapsed = now - _lastIndexSetAt

            if (elapsed < INDEX_DEBOUNCE_MS) {
                _pendingIndex = clamped
                removeCallbacks(_applyPendingIndex)
                postDelayed(_applyPendingIndex, INDEX_DEBOUNCE_MS - elapsed)
                return
            }

            removeCallbacks(_applyPendingIndex)
            _pendingIndex = null
            _prevIndex = _currentIndex
            _currentIndex = clamped
            _lastIndexSetAt = now
            updateActiveDot()
        }

    /**
     * Расстояние между индикаторами (точками) в пикселях.
     */
    var gap: Int
        get() = _gap
        set(value) {
            if (_gap != value) {
                _gap = value
                reset()
            }
        }

    /**
     * Количество краевых индикаторов, которые будут уменьшаться в масштабе.
     *
     * Краевые индикаторы используются для визуального обозначения наличия скрытых элементов за пределами окна.
     */
    var edgeIndicatorCount: Int
        get() = getClampedEdgeIndicatorCount()
        set(value) {
            if (_edgeIndicatorCount != value) {
                _edgeIndicatorCount = value
                reset()
            }
        }

    /**
     * Коэффициент уменьшения масштаба для краевых индикаторов.
     *
     * Значение от 0 (без уменьшения) до 1 (полное исчезновение).
     */
    var edgeIndicatorShrinkFactor: Float
        get() = _edgeIndicatorShrinkFactor
        set(value) {
            if (_edgeIndicatorShrinkFactor != value) {
                _edgeIndicatorShrinkFactor = value
                reset()
            }
        }

    init {
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        var mainSize = 0
        var crossSize = 0
        _dotsPool.forEachIndexed { i, indicator ->
            indicator.setBounds(0, 0, indicator.intrinsicWidth, indicator.intrinsicHeight)
            if (i in prefetchSize until (_dotsPool.size - prefetchSize)) {
                mainSize += when {
                    i == prefetchSize && _orientation == ORIENTATION_HORIZONTAL -> _maxIndicatorWidth.toInt() + gap
                    i == prefetchSize && _orientation == ORIENTATION_VERTICAL -> _maxIndicatorHeight.toInt() + gap
                    _orientation == ORIENTATION_HORIZONTAL -> indicator.intrinsicWidth + gap
                    else -> indicator.intrinsicHeight + gap
                }
            }
            crossSize = if (_orientation == ORIENTATION_HORIZONTAL) {
                maxOf(indicator.intrinsicHeight, crossSize)
            } else {
                maxOf(indicator.intrinsicWidth, crossSize)
            }
        }

        val desiredHeight = if (_orientation == ORIENTATION_HORIZONTAL) crossSize else mainSize - gap
        val desiredWidth = if (_orientation == ORIENTATION_HORIZONTAL) mainSize - gap else crossSize

        _clipBounds.set(0, 0, desiredWidth, desiredHeight)
        setMeasuredDimension(
            resolveSize(desiredWidth + paddingLeft + paddingRight, widthMeasureSpec),
            resolveSize(desiredHeight + paddingTop + paddingBottom, heightMeasureSpec),
        )

        when (_orientation) {
            ORIENTATION_HORIZONTAL -> {
                _origin = (measuredWidth - desiredWidth) / 2
                _clipBounds.offsetTo(_origin, _clipBounds.top)
            }

            else -> {
                _origin = (measuredHeight - desiredHeight) / 2
                _clipBounds.offsetTo((measuredWidth - desiredWidth) / 2, _origin)
            }
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val count = canvas.save()
        if (!DRAW_DEBUG) canvas.clipRect(_clipBounds)

        when (_orientation) {
            ORIENTATION_HORIZONTAL -> drawHorizontal(canvas)
            else -> drawVertical(canvas)
        }

        if (DRAW_DEBUG) drawDebugGuidelines(canvas)
        canvas.restoreToCount(count)
    }

    private fun drawDebugGuidelines(canvas: Canvas) {
        canvas.drawRect(_clipBounds, DebugPaint.configure(color = Color.GREEN))
        when (_orientation) {
            ORIENTATION_HORIZONTAL -> {
                canvas.drawLine(
                    startThreshold,
                    0f,
                    startThreshold,
                    measuredHeight.toFloat(),
                    DebugPaint.configure(color = Color.RED),
                )
                canvas.drawLine(endThreshold, 0f, endThreshold, measuredHeight.toFloat(), DebugPaint)
            }

            else -> {
                canvas.drawLine(
                    0f,
                    startThreshold,
                    measuredWidth.toFloat(),
                    startThreshold,
                    DebugPaint.configure(color = Color.RED),
                )
                canvas.drawLine(0f, endThreshold, measuredWidth.toFloat(), endThreshold, DebugPaint)
            }
        }
    }

    private fun getScrollOffset(): Float =
        _scrollShiftPx + prefetchSize * _baseScrollOffset

    private fun drawHorizontal(canvas: Canvas) {
        val countToDraw = _dotsPool.size
        if (countToDraw <= 0) return

        var dotX = _origin.toFloat() - getScrollOffset()

        for (i in 0 until countToDraw) {
            val dot = _dotsPool[i]
            val dotY = (measuredHeight - dot.bounds.height()) / 2f
            dot.draw(canvas, dotX, dotY, i)
            dotX += dot.bounds.width() + gap
        }
    }

    private fun drawVertical(canvas: Canvas) {
        val countToDraw = _dotsPool.size
        if (countToDraw <= 0) return

        var dotY = _origin.toFloat() - getScrollOffset()

        for (i in 0 until countToDraw) {
            val dot = _dotsPool[i]
            val dotX = (measuredWidth - dot.bounds.width()) / 2f
            dot.draw(canvas, dotX, dotY, i)
            dotY += dot.bounds.height() + gap
        }
    }

    private fun DotDrawable.draw(canvas: Canvas, x: Float, y: Float, index: Int) {
        canvas.withTranslation(
            x = x,
            y = y,
        ) {
            val scale = computeEdgeScale(index)
            val pivotX = bounds.width() / 2f
            val pivotY = bounds.height() / 2f
            canvas.withScale(scale, scale, pivotX, pivotY) {
                draw(canvas)
            }
        }
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || _dotsPool.contains(who)
    }

    private fun reset() {
        _scrollAnimator.cancel()
        _scrollShiftPx = 0f
        removeCallbacks(_applyPendingIndex)
        _pendingIndex = null
        _lastIndexSetAt = 0L
        _maxIndicatorWidth = _dotWidthList?.allValues()?.maxOfOrNull { it.toFloat() } ?: 0f
        _maxIndicatorHeight = _dotHeightList?.allValues()?.maxOfOrNull { it.toFloat() } ?: 0f
        _baseScrollOffset = when (_orientation) {
            ORIENTATION_HORIZONTAL -> _dotWidthList?.getDefaultValue()?.toFloat() ?: 0f
            else -> _dotHeightList?.getDefaultValue()?.toFloat() ?: 0f
        } + gap
        createDots()
        updateActiveDot()
    }

    private fun createDots() {
        _dotsPool.clear()
        val poolSize = minOf(visibleItemCount, itemCount).let { size ->
            if (size < itemCount) size + prefetchSize * 2 else size
        }
        for (i in 0 until poolSize) {
            _dotsPool.add(createIndicator(context))
        }
        requestLayout()
        invalidate()
    }

    private fun consumeScrollShiftIntoWindow() {
        if (_baseScrollOffset == 0f) return
        _scrollShiftPx = 0f
        _windowStart = _animToWindowStart
        _animFromWindowStart = _windowStart
    }

    private fun getClampedEdgeIndicatorCount(): Int {
        val max = when (visibleItemCount) {
            2, 4 -> 1
            else -> visibleItemCount / 2
        }
        return _edgeIndicatorCount.coerceAtMost(max)
    }

    private fun getMaxWindowStart(): Int =
        (itemCount - visibleItemCount).coerceAtLeast(0)

    private fun ensureIndexVisible(): Boolean {
        if (itemCount <= 0 || visibleItemCount <= 0) return false

        _scrollAnimator.cancel()
        consumeScrollShiftIntoWindow()

        val maxStart = getMaxWindowStart()
        val newWindowStart = (currentIndex - visibleItemCount / 2).coerceIn(0, maxStart)

        if (newWindowStart == _windowStart) {
            return false
        }

        val steps = (newWindowStart - _windowStart)
        val shiftEnd = steps * _baseScrollOffset

        _animFromWindowStart = _windowStart
        _animToWindowStart = newWindowStart
        _edgeScaleProgress = 0f

        _scrollAnimator.setFloatValues(_scrollShiftPx, shiftEnd)
        _scrollAnimator.start()
        return true
    }

    private fun updateActiveDot(animate: Boolean = true, windowChanged: Boolean = false) {
        updateDots(animate)
        if (windowChanged || ensureIndexVisible()) return
        if (animate) adjustEdges()
        invalidate()
    }

    private fun updateDots(animate: Boolean) {
        _dotsPool.forEach { it.setActivated(false, animate) }
        setDotActive(currentIndex, true, animate)
    }

    private fun setDotActive(index: Int, active: Boolean, animate: Boolean, windowStart: Int = _animToWindowStart) {
        var indexInWindow = index + prefetchSize - windowStart
        val range = prefetchSize.._dotsPool.size - prefetchSize
        if (range.isEmpty()) return
        indexInWindow = indexInWindow.coerceIn(range)
        _dotsPool.getOrNull(indexInWindow)?.apply {
            setActivated(
                active = active,
                animation = animate,
            )
        }
    }

    private fun adjustEdges() {
        _edgesAnimator.cancel()
        _edgesAnimator.setFloatValues(0f, 1f)
        _edgesAnimator.start()
    }

    private fun computeEdgeScaleAt(windowStart: Int, indexInWindow: Int, currentIndex: Int): Float {
        val size = _dotsPool.size

        val clampedCount = getClampedEdgeIndicatorCount()
        if (clampedCount <= 0) return 1f
        var scale = 1f

        val hasLeft = currentIndex - windowStart > 1 || windowStart > 0
        if (hasLeft && indexInWindow <= clampedCount) {
            val step = (clampedCount + prefetchSize - indexInWindow).toFloat()
            val s = (1f - _edgeIndicatorShrinkFactor * step)
            scale = minOf(scale, s)
        }

        val hasRight = (windowStart + visibleItemCount - 1 - currentIndex) > 1 ||
            windowStart + visibleItemCount < itemCount

        if (hasRight && indexInWindow >= (size - clampedCount - prefetchSize)) {
            val step = (clampedCount + prefetchSize - (size - 1 - indexInWindow)).toFloat()
            val s = (1f - _edgeIndicatorShrinkFactor * step)
            scale = minOf(scale, s)
        }
        return scale.coerceIn(0f..1f)
    }

    private fun computeEdgeScale(indexInWindow: Int): Float {
        if (!edgeIndicatorEnabled || visibleItemCount == itemCount) return 1f
        val delta = _animToWindowStart - _animFromWindowStart
        val fromIndexInWindow: Int
        val fromCurrentIndex: Int
        val toIndexInWindow: Int
        val toCurrentIndex: Int

        if (_scrollAnimator.isRunning) {
            fromIndexInWindow = indexInWindow
            toIndexInWindow = indexInWindow - delta
            fromCurrentIndex = currentIndex
            toCurrentIndex = currentIndex
        } else {
            fromIndexInWindow = indexInWindow
            toIndexInWindow = indexInWindow
            fromCurrentIndex = _prevIndex
            toCurrentIndex = currentIndex
        }

        val a = computeEdgeScaleAt(_animFromWindowStart, fromIndexInWindow, fromCurrentIndex)
        val b = computeEdgeScaleAt(_animToWindowStart, toIndexInWindow, toCurrentIndex)

        return lerp(a, b, _edgeScaleProgress)
    }

    private fun createIndicator(context: Context): DotDrawable = DotDrawable(context).apply {
        setColorAnimationEnabled(true)
        dotWidthList = _dotWidthList
        dotHeightList = _dotHeightList
        setTintValue(_dotBackground)
        callback = this@PaginationDots
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(attrs, R.styleable.PaginationDots, defStyleAttr, defStyleRes) {
            _dotWidthList = getNumberStateList(context, R.styleable.PaginationDots_sd_dotWidth)
            _dotHeightList = getNumberStateList(context, R.styleable.PaginationDots_sd_dotHeight)
            _gap = getDimensionPixelSize(R.styleable.PaginationDots_sd_gap, 0)
            _dotBackground = getColorValueStateList(context, R.styleable.PaginationDots_sd_dotBackground)

            itemCount = getInt(R.styleable.PaginationDots_sd_itemCount, 0)
            visibleItemCount = getInt(R.styleable.PaginationDots_sd_visibleItemCount, 0)
            currentIndex = getInt(R.styleable.PaginationDots_sd_currentItem, 0)
            _edgeIndicatorCount = getInt(R.styleable.PaginationDots_sd_edgeIndicatorCount, 0)
            _edgeIndicatorShrinkFactor = getFloat(R.styleable.PaginationDots_sd_edgeIndicatorShrinkFactor, 0f)
            _orientation = getInt(R.styleable.PaginationDots_android_orientation, ORIENTATION_HORIZONTAL)
        }
    }

    private class DotDrawable(context: Context) : IndicatorDrawable(context), AnimatorListener {

        var dotWidthList: NumberStateList? = null
        var dotHeightList: NumberStateList? = null

        private val _prevBounds: Rect = Rect()
        private var _width: Int = 0
        private var _height: Int = 0
        private var _isActivated: Boolean = false
        private var _isBoundsAnimationEnabled: Boolean = true
        private val _boundsAnimator: ValueAnimator by unsafeLazy {
            ValueAnimator.ofFloat().apply {
                duration = AnimationUtils.DEFAULT_DURATION
                interpolator = AnimationUtils.ACCELERATE_DECELERATE_INTERPOLATOR
                addUpdateListener {
                    val progress = it.animatedFraction
                    setBounds(
                        0,
                        0,
                        lerp(_prevBounds.width(), _width, progress),
                        lerp(_prevBounds.height(), _height, progress),
                    )
                    invalidateSelf()
                }
            }
        }

        init {
            addColorAnimationListener(this)
        }

        fun setActivated(active: Boolean, animation: Boolean = true) {
            if (_isActivated != active) {
                _isActivated = active
                updateActivated(active, animation)
            }
        }

        private fun updateActivated(active: Boolean, animation: Boolean) {
            setColorAnimationEnabled(animation)
            _isBoundsAnimationEnabled = animation
            if (active) {
                state += android.R.attr.state_activated
            } else {
                state = state.filter { it != android.R.attr.state_activated }.toIntArray()
            }
            setColorAnimationEnabled(true)
            _isBoundsAnimationEnabled = true
        }

        override fun getIntrinsicWidth(): Int {
            return dotWidthList?.getIntForState(state) ?: 0
        }

        override fun getIntrinsicHeight(): Int {
            return dotHeightList?.getIntForState(state) ?: 0
        }

        override fun onStateChange(state: IntArray): Boolean {
            val result = super.onStateChange(state)
            var sizeChanged = false
            dotWidthList?.getIntForState(state)?.let { newWidth ->
                if (_width != newWidth) {
                    _width = newWidth
                    sizeChanged = true
                }
            }
            dotHeightList?.getIntForState(state)?.let { newHeight ->
                if (_height != newHeight) {
                    _height = newHeight
                    sizeChanged = true
                }
            }
            if (sizeChanged) {
                updateBounds()
            }
            return result || sizeChanged
        }

        private fun updateBounds() {
            val animate = bounds.width() > 0 && bounds.height() > 0 && _isBoundsAnimationEnabled
            _prevBounds.set(0, 0, bounds.width(), bounds.height())
            if (animate) {
                _boundsAnimator.cancel()
                _boundsAnimator.setFloatValues(0f, 1f)
                _boundsAnimator.start()
            } else {
                setBounds(0, 0, _width, _height)
            }
        }

        override fun onAnimationStart(animation: Animator) = Unit

        override fun onAnimationEnd(animation: Animator) {
            setColorAnimationEnabled(true)
        }

        override fun onAnimationCancel(animation: Animator) = Unit

        override fun onAnimationRepeat(animation: Animator) = Unit
    }

    companion object {
        /**
         * Константа, задающая горизонтальную ориентацию индикаторов.
         */
        const val ORIENTATION_HORIZONTAL = 0

        /**
         * Константа, задающая вертикальную ориентацию индикаторов.
         */
        const val ORIENTATION_VERTICAL = 1

        /**
         * Время задержки (debounce) в миллисекундах для смены индекса.
         *
         * На 50мс больше длительности анимации. Предотвращает скачки анимации при очень частом и быстром изменении индекса.
         */
        private const val INDEX_DEBOUNCE_MS = AnimationUtils.DEFAULT_DURATION + 50

        private const val PREFETCH_SIZE = 1
        private const val DRAW_DEBUG = false
        private val DebugPaint = Paint()
            .configure(style = Paint.Style.STROKE, color = Color.RED, strokeWidth = 1.dp.toFloat())
    }
}
