package com.sdds.uikit.internal.base.drawable

import android.animation.ValueAnimator
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.SweepGradient
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.view.animation.LinearInterpolator
import com.sdds.uikit.Spinner
import com.sdds.uikit.internal.base.colorForState
import com.sdds.uikit.internal.base.configure

/**
 * Drawable с вращающейся окружностью.
 * Используется в качестве индикатора долгой работы, например загрузки.
 * @param strokeWidth ширина линии окружности
 * @author Малышев Александр on 31.05.2024
 */
internal class SpinnerDrawable(private val strokeWidth: Float) : Drawable(), Animatable {

    internal var isInEditMode: Boolean = false

    private var rotationDegrees: Float = 0f
    private var strokeCapDegrees: Float = 0f
    private var tint: ColorStateList? = null
    private var currentColor: Int = Color.TRANSPARENT
    private var _startColorList: ColorStateList? = null
    private var _endColorList: ColorStateList? = null
    private var _startColor: Int = Color.BLACK
    private var _endColor: Int = COLOR_SEMITRANSPARENT_BLACK
    private var _sweepAngle: Float = 360f
    private var _strokeCap: Spinner.StrokeCap = Spinner.StrokeCap.Round
    private val paint: Paint by lazy {
        Paint().configure(
            strokeWidth = strokeWidth,
            style = Paint.Style.STROKE,
            strokeCap = _strokeCap.paintCap,
            isAntiAlias = true,
        ).apply {
            shader = SweepGradient(
                0f, 0f,
                intArrayOf(
                    _endColor,
                    _startColor,
                ),
                floatArrayOf(0f, 1f),
            )
        }
    }
    private val boundsF = RectF()

    private val animator by lazy {
        ValueAnimator.ofFloat(0f, 360f).apply {
            repeatMode = ValueAnimator.RESTART
            repeatCount = ValueAnimator.INFINITE
            duration = ANIMATION_DURATION
            interpolator = LinearInterpolator()
            addUpdateListener {
                rotationDegrees = it.animatedValue as Float
                invalidateSelf()
            }
        }
    }

    /**
     * Форма начала и конца дуги спиннера
     */
    var strokeCap: Spinner.StrokeCap
        get() = _strokeCap
        set(value) {
            if (_strokeCap != value) {
                _strokeCap = value
                paint.strokeCap = _strokeCap.paintCap
                invalidateSelf()
            }
        }

    /**
     * Угол дуги спиннера
     */
    var sweepAngle: Float
        get() = _sweepAngle
        set(value) {
            if (_sweepAngle != value) {
                _sweepAngle = value
                invalidateSelf()
            }
        }

    /**
     * Устанавливает цвет начала градиента
     * @param colorList цвета начала градиента
     */
    fun setStartTintList(colorList: ColorStateList?) {
        if (_startColorList != colorList) {
            _startColorList = colorList
            _startColor = colorList.colorForState(state)
            updateShader()
            invalidateSelf()
        }
    }

    /**
     * Устанавливает цвет в конце градиента
     * @param colorList цвета в конце градиента
     */
    fun setEndTintList(colorList: ColorStateList?) {
        if (_endColorList != colorList) {
            _endColorList = colorList
            _endColor = colorList.colorForState(state)
            updateShader()
            invalidateSelf()
        }
    }

    /**
     * Устанавливает цвета градиента
     * @param startColorList цвета начала градиента
     * @param endColorList цвета в конце градиента
     */
    fun setStrokeGradient(startColorList: ColorStateList?, endColorList: ColorStateList?) {
        val start = _startColorList != startColorList
        val end = _endColorList != endColorList
        if (start || end) {
            _startColorList = startColorList
            _startColor = startColorList.colorForState(state)
            _endColorList = endColorList
            _endColor = endColorList.colorForState(state)
            updateShader()
            invalidateSelf()
        }
    }

    /**
     * Устанавливает скорость вращения дуги
     * @param duration длительность вращения в мс
     */
    fun setDuration(duration: Long) {
        if (animator.duration != duration) {
            animator.duration = duration
            invalidateSelf()
        }
    }

    override fun draw(canvas: Canvas) {
        if (!isRunning) {
            start()
        }
        with(canvas) {
            save()
            translate(bounds.exactCenterX(), bounds.exactCenterY())
            rotate(rotationDegrees)
            drawArc(boundsF, strokeCapDegrees, sweepAngle - 2 * strokeCapDegrees, false, paint)
            restore()
        }
    }

    override fun onStateChange(state: IntArray): Boolean {
        var change = false
        var gradientChange = false
        if (updateTint(state)) change = true
        _startColorList?.let {
            val sColor = _startColorList.colorForState(state)
            if (sColor != _startColor) {
                _startColor = sColor
                gradientChange = true
                change = true
            }
        }
        _endColorList?.let {
            val sColor = _endColorList.colorForState(state)
            if (sColor != _endColor) {
                _endColor = sColor
                gradientChange = true
                change = true
            }
        }
        if (gradientChange) updateShader()
        if (change) invalidateSelf()
        return super.onStateChange(state) || change
    }

    override fun setAlpha(alpha: Int) {
        paint.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        paint.colorFilter = colorFilter
    }

    override fun getOpacity(): Int = PixelFormat.OPAQUE

    override fun start() = if (!isInEditMode) {
        animator.start()
    } else {
        Unit
    }

    override fun stop() = animator.cancel()

    override fun isRunning(): Boolean = animator.isRunning

    override fun setTintList(tint: ColorStateList?) {
        super.setTintList(tint)
        this.tint = tint
        updateTint(state)
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        val radius = (minOf(bounds.width(), bounds.height()) - strokeWidth) / 2
        boundsF.set(-radius, -radius, radius, radius)
        strokeCapDegrees = Math.toDegrees(strokeWidth / 2.0 / radius).toFloat()
    }

    private fun updateTint(state: IntArray): Boolean {
        val tint = this.tint
        var change = false
        if (tint == null) {
            if (paint.colorFilter != null) {
                paint.colorFilter = null
                change = true
            }
        } else {
            val color = tint.getColorForState(state, tint.defaultColor)
            if (color != currentColor) {
                currentColor = color
                paint.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)
                change = true
            }
        }
        return change
    }

    private fun updateShader() {
        paint.shader = SweepGradient(
            0f, 0f,
            intArrayOf(
                _endColor,
                _startColor,
            ),
            floatArrayOf(0f, 1f),
        )
    }

    private companion object {
        val COLOR_SEMITRANSPARENT_BLACK = Color.argb(3, 0, 0, 0)
        const val ANIMATION_DURATION = 1000L
    }
}
