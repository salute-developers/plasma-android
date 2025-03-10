package com.sdds.uikit.internal.focusselector

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PathMeasure
import android.graphics.PixelFormat
import android.graphics.RadialGradient
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.Shader
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.view.View
import android.view.View.OnScrollChangeListener
import android.view.animation.LinearInterpolator
import com.sdds.uikit.R
import com.sdds.uikit.colorFromAttr
import com.sdds.uikit.shape.ShapeModel
import kotlin.math.max
import kotlin.math.min

/**
 * Drawable анимированного контура фокусировки когда state_focused
 */
@Suppress("RestrictedApi")
internal class AnimatedSelectorDrawable : Drawable, Animatable, OnScrollChangeListener {

    private val borderPaint = Paint()
    private val animationPaint = Paint()
    private val gradientColors: IntArray
    private val shapeModel: ShapeModel
    private val shapePath = Path()
    private val pathMeasure = PathMeasure()
    private val pathMatrix = Matrix()
    private var lineLength: Float = 0f
    private val shaders = arrayOfNulls<RadialGradient>(2)
    private val tempPositions = FloatArray(2)
    private val drawingRect = RectF()
    private val offset: Float
    private var scrollX: Float = 0f
    private var scrollY: Float = 0f
    private val animator by lazy {
        ValueAnimator.ofFloat(0f, 1f).apply {
            repeatMode = ValueAnimator.RESTART
            repeatCount = ValueAnimator.INFINITE
            duration = ANIMATION_DURATION
            startDelay = 0L
            interpolator = LinearInterpolator()
            addUpdateListener {
                val animValue = it.animatedValue as Float
                val startFirstLine = (pathMeasure.length / 2) * animValue
                val startSecondLine = startFirstLine + pathMeasure.length / 2

                shaders[0]?.updateShader(startFirstLine)
                shaders[1]?.updateShader(startSecondLine)
                invalidateSelf()
            }
        }
    }
    private var focused = false

    /**
     * @param context контекст
     * @param strokeWidth ширина селектора в пикселях
     * @param shapeModel модель описывающая форму
     */
    constructor(
        context: Context,
        strokeWidth: Float,
        shapeModel: ShapeModel,
        insets: Int = 0,
        mainColor: Int = context.colorFromAttr(R.attr.sd_fsMainColor),
        additionalColor: Int = context.colorFromAttr(R.attr.sd_fsAdditionalColor),
    ) : super() {
        gradientColors = intArrayOf(mainColor, 0)
        borderPaint.color = additionalColor
        this.shapeModel = shapeModel
        borderPaint.applyStroke(strokeWidth)
        animationPaint.applyStroke(strokeWidth)
        offset = strokeWidth / 2f - insets
    }

    override fun start() {
        animator.start()
    }

    override fun stop() {
        animator.cancel()
    }

    override fun isRunning(): Boolean =
        animator.isRunning

    override fun draw(canvas: Canvas) {
        if (!focused) return
        canvas.save()
        canvas.translate(scrollX, scrollY)
        drawShape(canvas, borderPaint)
        animationPaint.shader = shaders[0]
        drawShape(canvas, animationPaint)
        animationPaint.shader = shaders[1]
        drawShape(canvas, animationPaint)
        canvas.restore()
    }

    override fun onStateChange(state: IntArray): Boolean {
        val focused = state.contains(android.R.attr.state_focused)
        val needDraw = focused != this.focused
        this.focused = focused
        if (needDraw) {
            if (focused) {
                start()
            } else {
                stop()
            }
        }
        return needDraw
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        drawingRect.set(bounds)
        drawingRect.offset(offset)
        shapePath.reset()
        val cornerSize = shapeModel.cornerSizeTopLeft.getSize(drawingRect)
        shapePath.addRoundRect(drawingRect, cornerSize, cornerSize, Path.Direction.CW)
        shapePath.close()
        pathMeasure.setPath(shapePath, true)
        updateLineLength()
        val radius = lineLength / 2
        for (i in shaders.indices) {
            shaders[i] = RadialGradient(
                0f,
                0f,
                radius,
                gradientColors,
                floatArrayOf(0f, radius * 0.15f),
                Shader.TileMode.CLAMP,
            )
        }
    }

    override fun setAlpha(alpha: Int) = Unit

    override fun setColorFilter(colorFilter: ColorFilter?) = Unit

    override fun getOpacity(): Int = PixelFormat.OPAQUE

    override fun isStateful(): Boolean = true

    override fun onScrollChange(
        v: View?,
        scrollX: Int,
        scrollY: Int,
        oldScrollX: Int,
        oldScrollY: Int,
    ) {
        this.scrollX = scrollX.toFloat()
        this.scrollY = scrollY.toFloat()
    }

    private fun drawShape(canvas: Canvas, paint: Paint) {
        val cornerSize = shapeModel.cornerSizeTopLeft.getSize(drawingRect)
        canvas.drawRoundRect(drawingRect, cornerSize, cornerSize, paint)
    }

    private fun Shader.updateShader(shaderStart: Float) {
        // Обновляем позицию шейдера
        pathMatrix.reset()
        pathMeasure.getPosTan(shaderStart, tempPositions, null)
        pathMatrix.setTranslate(tempPositions[0], tempPositions[1])
        this.setLocalMatrix(pathMatrix)
    }

    private fun updateLineLength() {
        val min = min(drawingRect.width(), drawingRect.height())
        val max = max(drawingRect.width(), drawingRect.height())
        val ratio = max / min
        lineLength = if (ratio >= MAX_RATION) {
            min
        } else {
            pathMeasure.length * LENGTH_COEFFICIENT
        }
    }

    private companion object {
        const val ANIMATION_DURATION = 2500L
        const val LENGTH_COEFFICIENT = 0.1f
        const val MAX_RATION = 4

        fun RectF.offset(offset: Float) {
            left += offset
            top += offset
            right -= offset
            bottom -= offset
        }

        fun Paint.applyStroke(strokeWidth: Float) {
            isAntiAlias = true
            style = Paint.Style.STROKE
            this.strokeWidth = strokeWidth
        }
    }
}
