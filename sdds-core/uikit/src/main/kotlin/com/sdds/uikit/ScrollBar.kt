package com.sdds.uikit

import android.animation.ValueAnimator
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.annotation.ColorInt
import androidx.core.content.withStyledAttributes
import androidx.recyclerview.widget.RecyclerView
import com.sdds.uikit.internal.scrollbar.RecyclerViewScrollAdapter
import com.sdds.uikit.internal.scrollbar.ScrollBarAdapter
import com.sdds.uikit.internal.scrollbar.ScrollBarDrawable
import com.sdds.uikit.internal.scrollbar.ScrollViewScrollAdapter

/**
 * Класс для отображения скролла в контейнерах поддерживающих скроллинг.
 * @param context контекст.
 * @param attrs аттрибуты view.
 * @param defStyleAttr атрибут стиля по-умолчанию.
 * @param defStyleRes стиль по умолчанию.
 */
open class ScrollBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_scrollBarStyle,
    defStyleRes: Int = R.style.Sdds_Components_ScrollBar,
) : View(context, attrs, defStyleAttr) {

    private var _scrollBarDrawable: ScrollBarDrawable = ScrollBarDrawable(context, attrs, defStyleAttr)
        .apply { callback = this@ScrollBar }
    private var _adapter: ScrollBarAdapter? = null
    private var trackLength: Int = 0
    private var _autoHide: Boolean = true
    private var isDragging: Boolean = false
    private var dragOffset: Float = 0f
    private var _hoverExpand: Boolean = true
    private var _expandFactor: Float = 0f

    init {
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
    }

    /**
     * Возвращает true если ориентация ScrollBar вертикальная.
     */
    open val isVertical: Boolean
        get() = orientation == ScrollBarDrawable.VERTICAL

    /**
     * Возвращает true если ориентация ScrollBar горизонтальная.
     */
    open val isHorizontal: Boolean
        get() = orientation == ScrollBarDrawable.HORIZONTAL

    /**
     * Устанавливает автоматическое скрытие ScrollBar при бездействии.
     */
    open var autoHide: Boolean
        get() = _autoHide
        set(value) {
            if (_autoHide != value) {
                _autoHide = value
                if (!_autoHide) {
                    animate().cancel()
                    alpha = 1f
                }
            }
        }

    /**
     * Включает отображение track у ScrollBar.
     */
    open var hasTrack: Boolean
        get() = _scrollBarDrawable.hasTrack
        set(value) {
            _scrollBarDrawable.hasTrack = value
        }

    /**
     * Включает увеличение ScrollBar при взаимодействии с ним.
     */
    open var hoverExpand: Boolean
        get() = _hoverExpand
        set(value) {
            if (_hoverExpand != value) {
                _hoverExpand = value
            }
        }

    /**
     * Устанавливате значение, во сколько раз будет увеличиваться ScrollBar при взаимодействии с ним.
     */
    open var expandFactor: Float
        get() = _expandFactor
        set(value) {
            if (_expandFactor != value) {
                _expandFactor = value
            }
        }

    /**
     * Устанавливате толщину ScrollBar.
     */
    open var thickness: Int
        get() = _scrollBarDrawable.thickness
        set(value) {
            _scrollBarDrawable.thickness = value
        }

    /**
     * Устанавливает ориентацию ScrollBar.
     */
    var orientation: Int
        get() = _scrollBarDrawable.orientation
        set(value) {
            _scrollBarDrawable.orientation = value
        }

    /**
     * Устанавливает цвета для [ScrollBarDrawable].
     * @param trackColorList цвета неподвижной части.
     * @param thumbColorList цвета подвижной части.
     */
    open fun setScrollBarColors(
        trackColorList: ColorStateList?,
        thumbColorList: ColorStateList?,
    ): Unit = _scrollBarDrawable.run {
        setThumbColor(thumbColorList)
        setTrackColor(trackColorList)
    }

    /**
     * Устанавливает цвета для track в [ScrollBarDrawable].
     * @param trackColorList цвета неподвижной части.
     */
    fun setTrackColorList(trackColorList: ColorStateList) {
        _scrollBarDrawable.setTrackColor(trackColorList)
    }

    /**
     * Устанавливает цвет для track в [ScrollBarDrawable].
     * @param trackColor цвет track.
     */
    fun setTrackColor(@ColorInt trackColor: Int) {
        setTrackColorList(ColorStateList.valueOf(trackColor))
    }

    /**
     * Устанавливает цвета для thumb в [ScrollBarDrawable].
     * @param thumbColorList цвета подвижной части.
     */
    fun setThumbColorList(thumbColorList: ColorStateList) {
        _scrollBarDrawable.setThumbColor(thumbColorList)
    }

    /**
     * Устанавливает цвет для thumb в [ScrollBarDrawable].
     * @param thumbColor цвет thumb.
     */
    fun setThumbColor(@ColorInt thumbColor: Int) {
        setThumbColorList(ColorStateList.valueOf(thumbColor))
    }

    /**
     * Устанавливает ScrollBar в RecyclerView.
     * @param recyclerView ссылка на RecyclerView.
     * @param orientation ориентация скролла, параметр необходим в случае, когда возможен
     * горизонтальный и вертикальный скролл одновременно.
     */
    open fun attachToRecyclerView(recyclerView: RecyclerView, orientation: Int = ScrollBarDrawable.UNKNOWN) {
        _adapter = RecyclerViewScrollAdapter(recyclerView, orientation)
        recyclerView.isVerticalScrollBarEnabled = false
        recyclerView.isHorizontalScrollBarEnabled = false
        recyclerView.addOnScrollListener(
            object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    updateThumb()
                }
            },
        )
        recyclerView.addOnLayoutChangeListener { _, _, _, _, _, _, _, _, _ ->
            invalidateScroll()
        }
        recyclerView.post {
            requestLayout()
            invalidateScroll()
        }
    }

    /**
     * Устанавливает ScrollBar в ScrollView.
     * @param scrollView ссылка на ScrollView или HorizontalScrollView.
     */
    open fun attachToScrollView(scrollView: ViewGroup) {
        _adapter = ScrollViewScrollAdapter(scrollView)
        if (scrollView is ScrollView || scrollView is HorizontalScrollView) {
            scrollView.isVerticalScrollBarEnabled = false
            scrollView.isHorizontalScrollBarEnabled = false
        }
        scrollView.setOnScrollChangeListener { _, _, _, _, _ ->
            updateThumb()
        }
        scrollView.addOnLayoutChangeListener { _, _, _, _, _, _, _, _, _ ->
            invalidateScroll()
        }
        scrollView.post {
            requestLayout()
            invalidateScroll()
        }
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        invalidateScroll()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = if (isVertical) {
            _scrollBarDrawable.thickness + paddingLeft + paddingRight
        } else {
            MeasureSpec.getSize(widthMeasureSpec).takeIf { it > 0 } ?: suggestedMinimumWidth
        }
        val height = if (isVertical) {
            MeasureSpec.getSize(heightMeasureSpec).takeIf { it > 0 } ?: suggestedMinimumHeight
        } else {
            _scrollBarDrawable.thickness + paddingTop + paddingBottom
        }
        setMeasuredDimension(width, height)
    }

    override fun onDraw(canvas: Canvas) {
        if (orientation != ScrollBarDrawable.UNKNOWN) {
            _scrollBarDrawable.setBounds(0, 0, width, height)
            _scrollBarDrawable.draw(canvas)
        }
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _scrollBarDrawable
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val adapter = _adapter ?: return super.onTouchEvent(event)
        var handled = false
        when (event?.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                if (isOnThumb(event)) {
                    isDragging = true
                    parent.requestDisallowInterceptTouchEvent(true)
                    dragOffset = if (isVertical) {
                        _scrollBarDrawable.calculateDragOffset(event.y)
                    } else {
                        _scrollBarDrawable.calculateDragOffset(event.x)
                    }
                    if (hoverExpand) animateExpand(true)
                    handled = true
                }
            }

            MotionEvent.ACTION_MOVE -> {
                if (isDragging) {
                    updateScrollFromDrag(event, adapter)
                    handled = true
                }
            }

            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                if (isDragging) {
                    isDragging = false
                    parent.requestDisallowInterceptTouchEvent(false)
                    if (hoverExpand) animateExpand(false)
                }
                if (event.actionMasked == MotionEvent.ACTION_UP) {
                    performClick()
                }
                handled = true
            }
        }
        return handled || super.onTouchEvent(event)
    }

    override fun performClick(): Boolean {
        return super.performClick()
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(attrs, R.styleable.ScrollBar, defStyleAttr, defStyleRes) {
            setScrollBarColors(
                trackColorList = getColorStateList(R.styleable.ScrollBar_sd_trackColor),
                thumbColorList = getColorStateList(R.styleable.ScrollBar_sd_thumbColor),
            )
            _hoverExpand = getBoolean(R.styleable.ScrollBar_sd_hoverExpand, true)
            _expandFactor = getFloat(R.styleable.ScrollBar_sd_expandFactor, 1f)
            orientation = getInt(R.styleable.ScrollBar_sd_orientation, 2)
            autoHide = getBoolean(R.styleable.ScrollBar_sd_autoHide, true)
        }
    }

    private fun invalidateScroll() {
        val adapter = _adapter ?: return
        val newOrientation = adapter.orientation
        if (orientation != newOrientation) {
            orientation = adapter.orientation
            requestLayout()
        }
        updateDrawableSize()
        updateThumb()
    }

    private fun updateDrawableSize() {
        val adapter = _adapter ?: return
        trackLength = if (isVertical) {
            height - paddingTop - paddingBottom
        } else {
            width - paddingLeft - paddingRight
        }
        _scrollBarDrawable.updateThumbLength(trackLength, adapter.scrollRange, adapter.scrollExtent)
        invalidate()
    }

    private fun updateThumb() {
        val adapter = _adapter ?: return
        _scrollBarDrawable.updateThumbOffset(
            trackLength,
            adapter.scrollRange,
            adapter.scrollExtent,
            adapter.scrollOffset,
        )
        showScrollBar()
        scheduleAutoHide()
        invalidate()
    }

    private fun showScrollBar() {
        if (alpha == 1f) return
        animate().cancel()
        alpha = 1f
    }

    private fun scheduleAutoHide() {
        if (!_autoHide || alpha == 0f) return
        animate().cancel()
        animate()
            .alpha(0f)
            .setStartDelay(HIDE_DELAY)
            .setDuration(1000)
            .start()
    }

    private fun isOnThumb(event: MotionEvent): Boolean {
        return _scrollBarDrawable.isTouchOnThumb(event.x, event.y)
    }

    private fun updateScrollFromDrag(event: MotionEvent, adapter: ScrollBarAdapter) {
        val position = if (isVertical) {
            ((event.y - dragOffset) / trackLength * adapter.scrollRange).toInt()
        } else {
            ((event.x - dragOffset) / trackLength * adapter.scrollRange).toInt()
        }
        adapter.scrollTo(position)
        updateThumb()
    }

    private fun animateExpand(expand: Boolean) {
        if (isVertical) {
            pivotX = width.toFloat()
            pivotY = height / 2f
        } else {
            pivotX = width / 2f
            pivotY = height.toFloat()
        }
        val start = if (isVertical) scaleX else scaleY
        val end = if (expand) expandFactor else 1f
        ValueAnimator.ofFloat(start, end).apply {
            duration = 300
            addUpdateListener {
                val value = it.animatedValue as Float
                if (isVertical) scaleX = value else scaleY = value
            }
            start()
        }
    }

    private companion object {
        private const val HIDE_DELAY = 2000L
    }
}
