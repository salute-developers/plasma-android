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
    private val paint: Paint by lazy {
        Paint().configure(
            strokeWidth = strokeWidth,
            style = Paint.Style.STROKE,
            strokeCap = Paint.Cap.ROUND,
            isAntiAlias = true,
        ).apply {
            shader = SweepGradient(
                0f, 0f,
                intArrayOf(
                    COLOR_SEMITRANSPARENT_BLACK,
                    Color.BLACK,
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

    override fun draw(canvas: Canvas) {
        if (!isRunning) {
            start()
        }
        with(canvas) {
            save()
            translate(bounds.exactCenterX(), bounds.exactCenterY())
            rotate(rotationDegrees)
            drawArc(boundsF, strokeCapDegrees, 360 - 2 * strokeCapDegrees, false, paint)
            restore()
        }
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

    override fun setState(stateSet: IntArray): Boolean {
        val handled = super.setState(stateSet)
        updateTint(stateSet)
        return handled
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        val radius = (minOf(bounds.width(), bounds.height()) - strokeWidth) / 2
        boundsF.set(-radius, -radius, radius, radius)
        strokeCapDegrees = Math.toDegrees(strokeWidth.toDouble() / radius).toFloat()
    }

    private fun updateTint(state: IntArray) {
        val tint = this.tint
        if (tint == null) {
            paint.colorFilter = null
            return
        }
        val color = tint.getColorForState(state, tint.defaultColor)
        paint.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)
    }

    private companion object {
        val COLOR_SEMITRANSPARENT_BLACK = Color.argb(3, 0, 0, 0)
        const val ANIMATION_DURATION = 1000L
    }
}
