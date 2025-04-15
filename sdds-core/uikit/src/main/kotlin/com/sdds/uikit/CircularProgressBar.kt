package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.drawable.Drawable
import android.text.Spannable
import android.text.TextPaint
import android.text.style.CharacterStyle
import android.text.style.UpdateAppearance
import android.util.AttributeSet
import android.view.Gravity
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.core.text.buildSpannedString
import androidx.core.view.isVisible
import androidx.dynamicanimation.animation.FloatPropertyCompat
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import com.sdds.uikit.colorstate.ColorState
import com.sdds.uikit.colorstate.ColorState.Companion.isDefined
import com.sdds.uikit.colorstate.ColorStateHolder
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.shader.CachedShaderFactory
import com.sdds.uikit.statelist.ColorValueStateList
import com.sdds.uikit.statelist.NumberStateList
import com.sdds.uikit.statelist.getColorValueStateList
import com.sdds.uikit.statelist.getFloatForState
import com.sdds.uikit.statelist.getNumberStateList
import com.sdds.uikit.statelist.setColorValue
import kotlin.math.min
import kotlin.math.roundToInt

/**
 * Круглый индикатор прогресса от [minProgress] до [maxProgress].
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr атрибут стиля по-умолчанию
 * @author Малышев Александр on 12.04.2025
 */
open class CircularProgressBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_circularProgressBarStyle,
    defStyleRes: Int = R.style.Sdds_Components_CircularProgressBar,
) : FrameLayout(context, attrs, defStyleAttr), ColorStateHolder {

    private lateinit var _progressDrawable: LineDrawable
    private lateinit var _trackDrawable: LineDrawable
    private var _progressListener: ProgressListener? = null

    @Suppress("LeakingThis")
    private var _progressAnimator: SpringAnimation = SpringAnimation(this, PropertyHolder).apply {
        spring = SpringForce().apply {
            dampingRatio = SpringForce.DAMPING_RATIO_NO_BOUNCY
            stiffness = SpringForce.STIFFNESS_VERY_LOW
        }
        addUpdateListener { _, value, _ ->
            _currentProgress = value
            _progressListener?.onProgressChanged(_currentProgress)
            updateProgress()
        }
    }

    private var _currentProgress: Float = 0f
    private var _maxProgress: Float = MAX_PROGRESS
    private var _minProgress: Float = MIN_PROGRESS
    private var _trackEnabled: Boolean = true

    private val _valueTextView: TextView = TextView(context)
    private var _progressValueSuffix: String? = VALUE_SUFFIX
    private var _progressValueSuffixTint: ColorValueStateList? = null
    private val _progressValueSuffixSpan: ColorStateListSpan = ColorStateListSpan()

    /**
     * Текущий прогресс
     */
    open var progress: Float
        get() = _currentProgress
        set(value) {
            if (_currentProgress != value) {
                _currentProgress = value.coerceIn(_minProgress, _maxProgress)
                updateProgress()
            }
        }

    /**
     * Максимальный прогресс
     */
    open var maxProgress: Float
        get() = _maxProgress
        set(value) {
            if (_maxProgress != value) {
                _maxProgress = value
                // обновляем значение, чтобы отрегулировать его согласно новым границам
                progress = _currentProgress
            }
        }

    /**
     * Минимальный прогресс
     */
    open var minProgress: Float
        get() = _minProgress
        set(value) {
            if (_minProgress != value) {
                _minProgress = value
                // обновляем значение, чтобы отрегулировать его согласно новым границам
                progress = _currentProgress
            }
        }

    /**
     * Включает/выключает отображение значение прогресса
     */
    open var valueEnabled: Boolean
        get() = _valueTextView.isVisible
        set(value) {
            _valueTextView.isVisible = value
        }

    /**
     * Включает/выключает отображение линии фона прогресса
     */
    open var trackEnabled: Boolean
        get() = _trackEnabled
        set(value) {
            if (_trackEnabled != value) {
                _trackEnabled = value
                invalidate()
            }
        }

    /**
     * @see ColorStateHolder.colorState
     */
    override var colorState: ColorState? = ColorState.obtain(context, attrs, defStyleAttr)
        set(value) {
            if (field != value) {
                field = value
                refreshDrawableState()
            }
        }

    init {
        setWillNotDraw(false)
        addView(
            _valueTextView,
            LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT).apply {
                gravity = Gravity.CENTER
            },
        )
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
    }

    /**
     * Устанавливает текущий прогресс с анимацией, если [animate] == true
     * @param progress текущий прогресс
     * @param animate включена ли анимация
     */
    open fun setProgress(progress: Float, animate: Boolean) {
        if (!animate) {
            this.progress = progress
            return
        }
        _progressAnimator.setStartValue(_currentProgress)
        _progressAnimator.animateToFinalPosition(progress)
    }

    /**
     * Устанавливает слушателя изменения прогресса
     */
    fun setProgressListener(progressListener: ProgressListener?) {
        this._progressListener = progressListener
    }

    /**
     * Устанавливает цвета индикатора прогресса
     * @param tint цвета индикатора прогресса
     */
    open fun setProgressTintList(tint: ColorValueStateList?) {
        _progressDrawable.setTint(tint)
    }

    /**
     * Устанавливает цвета индикатора прогресса
     * @param tint цвета индикатора прогресса
     */
    open fun setProgressTintList(tint: ColorStateList?) {
        setProgressTintList(ColorValueStateList.valueOf(tint))
    }

    /**
     * Устанавливает цвет индикатора прогресса
     * @param color цвет индикатора прогресса
     */
    open fun setProgressColor(@ColorInt color: Int) {
        setProgressTintList(ColorStateList.valueOf(color))
    }

    /**
     * Устанавливает цвет индикатора прогресса по идентификатору ресурса
     * @param colorRes идентификатор ресурса цвета индикатора прогресса
     */
    open fun setProgressColorRes(@ColorRes colorRes: Int) {
        setProgressTintList(AppCompatResources.getColorStateList(context, colorRes))
    }

    /**
     * Устанавливает цвета фона (неподвижной линии индикатора)
     * @param color цвета фона
     */
    open fun setTrackColor(@ColorInt color: Int) {
        setTrackTintList(ColorValueStateList.valueOf(color))
    }

    /**
     * Устанавливает цвета фона (неподвижной линии индикатора)
     * @param colorRes ресурс цвета фона
     */
    open fun setTrackColorRes(@ColorRes colorRes: Int) {
        setTrackColor(ContextCompat.getColor(context, colorRes))
    }

    /**
     * Устанавливает цвета фона (неподвижной линии индикатора)
     * @param tint цвета фона
     */
    open fun setTrackTintList(tint: ColorStateList?) {
        setTrackTintList(ColorValueStateList.valueOf(tint))
    }

    /**
     * Устанавливает цвета фона (неподвижной линии индикатора)
     * @param tint цвета фона
     */
    open fun setTrackTintList(tint: ColorValueStateList?) {
        _trackDrawable.setTint(tint)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(
            measuredWidth.coerceAtLeast(minimumWidth),
            measuredHeight.coerceAtLeast(minimumHeight),
        )
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        _progressDrawable.setBounds(
            paddingStart,
            paddingTop,
            w - paddingEnd,
            h - paddingBottom,
        )
        _trackDrawable.setBounds(
            paddingStart,
            paddingTop,
            w - paddingEnd,
            h - paddingBottom,
        )
        _progressAnimator.minimumVisibleChange = 1f / _progressDrawable.bounds.width()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (trackEnabled) {
            _trackDrawable.draw(canvas)
        }
        _progressDrawable.draw(canvas)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _progressDrawable || who == _trackDrawable
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        val drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (colorState?.isDefined() == true) {
            mergeDrawableStates(drawableState, colorState?.attrs)
        }
        return drawableState
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        _progressDrawable.state = drawableState
        _trackDrawable.state = drawableState
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.CircularProgressBar,
            defStyleAttr,
            defStyleRes,
        )
        _maxProgress = typedArray.getFloat(R.styleable.CircularProgressBar_sd_maxProgress, MAX_PROGRESS)
        _minProgress = typedArray.getFloat(R.styleable.CircularProgressBar_sd_minProgress, MIN_PROGRESS)
        _currentProgress = typedArray.getFloat(R.styleable.CircularProgressBar_sd_progress, 0f)
            .coerceIn(_minProgress, _maxProgress)

        if (typedArray.hasValue(R.styleable.CircularProgressBar_android_minWidth)) {
            minimumWidth = typedArray.getDimensionPixelSize(R.styleable.CircularProgressBar_android_minWidth, 0)
        }
        if (typedArray.hasValue(R.styleable.CircularProgressBar_android_minHeight)) {
            minimumHeight = typedArray.getDimensionPixelSize(R.styleable.CircularProgressBar_android_minHeight, 0)
        }

        _trackDrawable = LineDrawable().apply {
            callback = this@CircularProgressBar
            setTint(typedArray.getColorValueStateList(context, R.styleable.CircularProgressBar_sd_trackColor))
            setThickness(typedArray.getNumberStateList(context, R.styleable.CircularProgressBar_sd_trackThickness))
        }
        _progressDrawable = LineDrawable().apply {
            callback = this@CircularProgressBar
            setTint(typedArray.getColorValueStateList(context, R.styleable.CircularProgressBar_sd_progressColor))
            setThickness(typedArray.getNumberStateList(context, R.styleable.CircularProgressBar_sd_progressThickness))
        }
        valueEnabled = typedArray.getBoolean(R.styleable.CircularProgressBar_sd_progressValueEnabled, true)
        _progressValueSuffix = typedArray.getString(R.styleable.CircularProgressBar_sd_progressValueSuffix)
        _progressValueSuffixTint = typedArray.getColorValueStateList(
            context, R.styleable.CircularProgressBar_sd_progressValueSuffixColor,
        )

        _valueTextView.apply {
            setTextColor(
                typedArray.getColorValueStateList(context, R.styleable.CircularProgressBar_sd_progressValueColor),
            )
            setTextAppearance(typedArray.getResourceId(R.styleable.CircularProgressBar_sd_progressValueAppearance, 0))
            this.isDuplicateParentStateEnabled = true
        }
        typedArray.recycle()
        updateProgress()
    }

    private fun updateProgress() {
        _progressDrawable.updateFraction(progress / maxProgress)
        if (valueEnabled) {
            updateProgressValue()
        }
        postInvalidateOnAnimation()
    }

    private fun updateProgressValue() {
        _valueTextView.text = buildSpannedString {
            append((progress * MAX_PROGRESS_INT).roundToInt().coerceIn(0..MAX_PROGRESS_INT).toString())
            _progressValueSuffix?.let {
                val valueStartIndex = length
                append(it)
                setSpan(
                    _progressValueSuffixSpan,
                    valueStartIndex,
                    length,
                    Spannable.SPAN_INCLUSIVE_EXCLUSIVE,
                )
            }
        }
    }

    /**
     * Слушатель прогресса
     */
    fun interface ProgressListener {

        /**
         * Колбэк изменения прогресса
         * @param progress текущее значение прогресса
         */
        fun onProgressChanged(progress: Float)
    }

    private inner class ColorStateListSpan : CharacterStyle(), UpdateAppearance {
        private val _shaderFactoryDelegate: CachedShaderFactory = CachedShaderFactory.create()

        override fun updateDrawState(tp: TextPaint?) {
            if (tp == null) return
            val colorState = _progressValueSuffixTint ?: return
            tp.setColorValue(colorState, drawableState, _shaderFactoryDelegate)
        }
    }

    private class LineDrawable : Drawable() {

        private var _skipDraw: Boolean = false
        private var _fraction: Float = MAX_PROGRESS
        private val _paint = Paint().configure(
            isAntiAlias = true,
            style = Paint.Style.STROKE,
            strokeCap = Paint.Cap.ROUND,
        )
        private val _oval = RectF()
        private var _tintList: ColorValueStateList? = null
        private var _thicknessList: NumberStateList? = null
        private val _shaderFactoryDelegate = CachedShaderFactory.create()

        fun setTint(tint: ColorValueStateList?) {
            _tintList = tint
        }

        fun setThickness(thicknessList: NumberStateList?) {
            _thicknessList = thicknessList
        }

        override fun draw(canvas: Canvas) {
            if (_skipDraw) return
            val sweepAngle = MAX_PROGRESS_ANGLE * _fraction
            canvas.drawArc(_oval, START_PROGRESS_ANGLE, sweepAngle, false, _paint)
        }

        override fun setAlpha(alpha: Int) {
            _paint.alpha = alpha
        }

        override fun setColorFilter(colorFilter: ColorFilter?) {
            _paint.colorFilter = colorFilter
        }

        @Suppress("OVERRIDE_DEPRECATION")
        override fun getOpacity(): Int = PixelFormat.OPAQUE

        override fun onBoundsChange(bounds: Rect) {
            super.onBoundsChange(bounds)
            val size = min(bounds.width(), bounds.height())
            val cx = bounds.exactCenterX()
            val cy = bounds.exactCenterY()
            val radius = size / 2f
            val halfStroke = _paint.strokeWidth / 2
            _oval.set(
                cx - radius + halfStroke,
                cy - radius + halfStroke,
                cx + radius - halfStroke,
                cy + radius - halfStroke,
            )
            _shaderFactoryDelegate.updateBounds(_oval)
        }

        override fun onStateChange(state: IntArray): Boolean {
            var changed = super.onStateChange(state)
            if (_paint.setColorValue(_tintList, state, _shaderFactoryDelegate)) {
                changed = true
            }
            val newThickness = _thicknessList?.getFloatForState(state) ?: 0f
            if (newThickness != _paint.strokeWidth) {
                _paint.strokeWidth = newThickness
                changed = true
            }

            if (changed) {
                invalidateSelf()
            }
            return changed
        }

        fun updateFraction(fraction: Float) {
            if (_fraction == fraction) return
            _fraction = fraction
        }
    }

    private object PropertyHolder : FloatPropertyCompat<CircularProgressBar>("progress") {
        override fun getValue(progressBar: CircularProgressBar): Float {
            return progressBar._currentProgress
        }

        override fun setValue(progressBar: CircularProgressBar, value: Float) {
            progressBar._currentProgress = value
        }
    }

    private companion object {
        const val MAX_PROGRESS_ANGLE = 360
        const val START_PROGRESS_ANGLE = -90f
        const val MAX_PROGRESS_INT = 100
        const val MAX_PROGRESS = 1f
        const val MIN_PROGRESS = 0f
        const val VALUE_SUFFIX = "%"
    }
}
