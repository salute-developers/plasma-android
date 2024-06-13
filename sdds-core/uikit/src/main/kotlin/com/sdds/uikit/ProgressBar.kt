package com.sdds.uikit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.LayoutDirection
import android.view.View
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.appcompat.content.res.AppCompatResources
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.internal.base.wrapWithInset
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
    defStyleRes: Int = 0,
) : View(context, attrs, defStyleAttr) {

    private val _progressDrawable: LineDrawable by unsafeLazy {
        LineDrawable().apply {
            callback = this@ProgressBar
            startFraction = 0f
            endFraction = progress / maxProgress
        }
    }

    private var _backgroundDrawable: Drawable

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
        _backgroundDrawable = LineDrawable().apply {
            callback = this@ProgressBar
        }
        obtainAttributes(context, attrs, defStyleAttr, defStyleRes)
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
        _progressDrawable.setBounds(
            paddingStart,
            paddingTop,
            measuredWidth - paddingEnd,
            measuredHeight - paddingBottom,
        )
        _backgroundDrawable.setBounds(
            paddingStart,
            paddingTop,
            measuredWidth - paddingEnd,
            measuredHeight - paddingBottom,
        )
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
        _progressDrawable.setTintList(typedArray.getColorStateList(R.styleable.ProgressBar_android_progressTint))
        _backgroundDrawable.setTintList(typedArray.getColorStateList(R.styleable.ProgressBar_backgroundTint))

        _inset = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_inset, 0)
        _insetLeft = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_insetLeft, _inset)
        _insetTop = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_insetTop, _inset)
        _insetRight = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_insetRight, _inset)
        _insetBottom = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_insetBottom, _inset)

        _maxHeight = typedArray.getDimensionPixelSize(R.styleable.ProgressBar_android_maxHeight, 0)

        _backgroundDrawable = _backgroundDrawable.wrapWithInset(
            _insetLeft,
            _insetTop,
            _insetRight,
            _insetBottom,
        )

        typedArray.recycle()
        updateProgress()
    }

    private fun updateProgress() {
        _progressDrawable.apply {
            endFraction = progress / maxProgress
        }
        invalidate()
    }

    private class LineDrawable : Drawable() {

        var startFraction: Float = 0f
        var endFraction: Float = 1f

        private var tint: ColorStateList? = null

        private val paint: Paint by unsafeLazy {
            Paint().apply {
                isAntiAlias = true
                strokeCap = Paint.Cap.ROUND
            }
        }

        override fun draw(canvas: Canvas) {
            val colors = tint ?: return
            canvas.save()
            val strokeWidth = bounds.height().toFloat()
            canvas.translate(bounds.left + strokeWidth / 2f, bounds.exactCenterY())
            // рисуем фон
            canvas.drawLineIndicator(
                startFraction,
                endFraction,
                paint.configure(
                    strokeWidth = strokeWidth,
                    color = colors.getColorForState(state, colors.defaultColor),
                ),
            )
            canvas.restore()
        }

        override fun setAlpha(alpha: Int) {
            paint.alpha = alpha
        }

        override fun setColorFilter(colorFilter: ColorFilter?) {
            paint.colorFilter = colorFilter
        }

        override fun setTintList(tint: ColorStateList?) {
            super.setTintList(tint)
            if (this.tint != tint && tint != null) {
                this.tint = tint
            }
        }

        @Suppress("OVERRIDE_DEPRECATION")
        override fun getOpacity(): Int = PixelFormat.OPAQUE

        private fun Canvas.drawLineIndicator(
            startFraction: Float,
            endFraction: Float,
            paint: Paint,
        ) {
            val width = bounds.width() - paint.strokeWidth

            val isLtr = layoutDirection == LayoutDirection.LTR
            val barStart = (if (isLtr) startFraction else 1f - endFraction) * width
            val barEnd = (if (isLtr) endFraction else 1f - startFraction) * width

            drawLine(
                barStart,
                0f,
                barEnd,
                0f,
                paint,
            )
        }
    }

    private companion object {
        const val MAX_PROGRESS = 1f
        const val MIN_PROGRESS = 0f
    }
}
