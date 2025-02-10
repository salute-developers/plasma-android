package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.graphics.drawable.DrawableWrapper
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.dynamicanimation.animation.FloatPropertyCompat
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import com.sdds.uikit.internal.base.wrapWithInset
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel
import kotlin.math.min

/**
 * Индикатор прогресса от [minProgress] до [maxProgress].
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr атрибут стиля по-умолчанию
 * @author Малышев Александр on 11.06.2024
 */
open class ProgressBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.progressBarStyle,
    defStyleRes: Int = R.style.Sdds_Components_ProgressBar,
) : View(context, attrs, defStyleAttr) {

    private lateinit var _progressDrawable: LineDrawable
    private lateinit var _backgroundDrawable: Drawable
    private var _progressListener: ProgressListener? = null

    @Suppress("LeakingThis")
    private var _progressAnimator: SpringAnimation = SpringAnimation(this, PropertyHolder).apply {
        spring = SpringForce().apply {
            dampingRatio = SpringForce.DAMPING_RATIO_NO_BOUNCY
            stiffness = SpringForce.STIFFNESS_VERY_LOW
        }
        addUpdateListener { _, value, _ ->
            _currentProgress = value
            Log.e("Progress", "onUpdate: $value")
            _progressListener?.onProgressChanged(_currentProgress)
            updateProgress()
        }
    }

    private var _currentProgress: Float = 0f
    private var _maxProgress: Float = MAX_PROGRESS
    private var _minProgress: Float = MIN_PROGRESS
    private var _inset: Int = 0
    private var _insetLeft: Int = 0
    private var _insetTop: Int = 0
    private var _insetRight: Int = 0
    private var _insetBottom: Int = 0
    private var _maxWidth: Int = 0
    private var _maxHeight: Int = 0

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

    init {
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
    open fun setProgressTintList(tint: ColorStateList?) {
        _progressDrawable.setTintList(tint)
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
     * @param tint цвета фона
     */
    override fun setBackgroundTintList(tint: ColorStateList?) {
        _backgroundDrawable.setTintList(tint)
    }

    override fun setBackground(background: Drawable?) {
        super.setBackground(null)
    }

    /**
     * Устанавливает цвет фона (неподвижной линии индикатора)
     * @param color цвета фона
     */
    override fun setBackgroundColor(color: Int) {
        backgroundTintList = ColorStateList.valueOf(color)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val newWidth = if (MeasureSpec.getMode(widthMeasureSpec) != MeasureSpec.EXACTLY) {
            min(measuredWidth, _maxWidth)
        } else {
            measuredWidth
        }
        val newHeight = if (MeasureSpec.getMode(heightMeasureSpec) != MeasureSpec.EXACTLY) {
            min(measuredHeight, _maxHeight)
        } else {
            measuredHeight
        }
        setMeasuredDimension(newWidth, newHeight)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        _progressDrawable.setBounds(
            paddingStart,
            paddingTop,
            w - paddingEnd,
            h - paddingBottom,
        )
        _backgroundDrawable.setBounds(
            paddingStart,
            paddingTop,
            w - paddingEnd,
            h - paddingBottom,
        )
        _progressAnimator.minimumVisibleChange = 1f / _progressDrawable.bounds.width()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        _backgroundDrawable.draw(canvas)
        _progressDrawable.draw(canvas)
    }

    override fun verifyDrawable(who: Drawable): Boolean {
        return super.verifyDrawable(who) || who == _progressDrawable || who == _backgroundDrawable
    }

    override fun drawableStateChanged() {
        super.drawableStateChanged()
        _progressDrawable.state = drawableState
        _backgroundDrawable.state = drawableState
    }

    private fun obtainAttributes(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.ProgressBar, defStyleAttr, defStyleRes)
        _maxProgress = typedArray.getFloat(R.styleable.ProgressBar_sd_maxProgress, MAX_PROGRESS)
        _minProgress = typedArray.getFloat(R.styleable.ProgressBar_sd_minProgress, MIN_PROGRESS)
        _currentProgress = typedArray.getFloat(R.styleable.ProgressBar_sd_progress, 0f)
            .coerceIn(_minProgress, _maxProgress)

        _inset = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_inset, 0)
        _insetLeft = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_insetLeft, _inset)
        _insetTop = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_insetTop, _inset)
        _insetRight = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_insetRight, _inset)
        _insetBottom = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_insetBottom, _inset)

        _maxHeight = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_maxHeight, 0)
        val shapeModel = ShapeModel.create(context, attrs, defStyleAttr, defStyleRes)

        val background = (typedArray.getDrawable(R.styleable.ProgressBar_android_background) as? ShapeDrawable)
            ?.apply { setShapeModel(shapeModel) }
            ?: ShapeDrawable(shapeModel)
        _backgroundDrawable = background
            .wrapLine(this)
            .wrapWithInset(
                _insetLeft,
                _insetTop,
                _insetRight,
                _insetBottom,
            )
        _backgroundDrawable.setTintList(typedArray.getColorStateList(R.styleable.ProgressBar_backgroundTint))

        val progressDrawable =
            (typedArray.getDrawable(R.styleable.ProgressBar_android_progressDrawable) as? ShapeDrawable)
                ?.apply { setShapeModel(shapeModel) }
                ?: ShapeDrawable(shapeModel)
        _progressDrawable = progressDrawable.wrapLine(this)
        _progressDrawable.setTintList(typedArray.getColorStateList(R.styleable.ProgressBar_android_progressTint))
        typedArray.recycle()
        updateProgress()
    }

    private fun updateProgress() {
        _progressDrawable.updateFraction(progress / maxProgress)
        postInvalidateOnAnimation()
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

    private class LineDrawable(private val shapeDrawable: ShapeDrawable) : DrawableWrapper(shapeDrawable) {

        private var _skipDraw: Boolean = false
        private var _fraction: Float = MAX_PROGRESS

        override fun draw(canvas: Canvas) {
            if (_skipDraw) return
            super.draw(canvas)
        }

        @Suppress("OVERRIDE_DEPRECATION")
        override fun getOpacity(): Int = PixelFormat.OPAQUE

        override fun onBoundsChange(bounds: Rect) {
            super.onBoundsChange(bounds)
            invalidateShape()
        }

        fun updateFraction(fraction: Float) {
            if (_fraction == fraction) return
            _fraction = fraction
            invalidateShape()
        }

        private fun invalidateShape() {
            val width = bounds.width() * _fraction
            val height = bounds.height().toFloat()
            _skipDraw = width == 0f
            shapeDrawable.resizeShape(width, height)
        }
    }

    private object PropertyHolder : FloatPropertyCompat<ProgressBar>("progress") {
        override fun getValue(progressBar: ProgressBar): Float {
            return progressBar._currentProgress
        }

        override fun setValue(progressBar: ProgressBar, value: Float) {
            progressBar._currentProgress = value
        }
    }

    private companion object {
        const val MAX_PROGRESS = 1f
        const val MIN_PROGRESS = 0f

        fun ShapeDrawable.wrapLine(callback: Drawable.Callback): LineDrawable =
            LineDrawable(this).apply {
                this.callback = callback
            }
    }
}
