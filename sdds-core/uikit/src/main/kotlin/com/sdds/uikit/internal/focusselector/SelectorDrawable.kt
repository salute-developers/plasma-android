package com.sdds.uikit.internal.focusselector

import android.content.Context
import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.Shader
import android.graphics.drawable.Drawable
import android.view.View
import android.view.View.OnScrollChangeListener
import com.google.android.material.shape.AdjustedCornerSize
import com.google.android.material.shape.ShapeAppearanceModel
import com.google.android.material.shape.ShapeAppearancePathProvider
import com.sdds.uikit.R
import com.sdds.uikit.colorFromAttr

/**
 * Drawable отрисовывающий контур фокусировки когда state_focused
 */
@Suppress("RestrictedApi")
internal class SelectorDrawable : Drawable, OnScrollChangeListener {

    private val borderPaint = Paint()
    private val gradientColors: IntArray
    private val shapeAppearanceModel: ShapeAppearanceModel
    private val shapePath = Path()
    private val shapeAppearancePathProvider = ShapeAppearancePathProvider()
    private var scrollX: Float = 0f
    private var scrollY: Float = 0f

    /**
     * отступ отрисовки селектора (внутрь)
     * нужен, чтобы селектор не выходил за границы контейнера и идеально ложился на его края
     */
    private val offset: Float

    /**
     * @param context контекст
     * @param strokeWidth ширина селектора в пикселях
     * @param shapeAppearanceModel модель описывающая форму
     */
    constructor(context: Context, strokeWidth: Float, shapeAppearanceModel: ShapeAppearanceModel) : super() {
        val tertiaryColor = context.colorFromAttr(R.attr.sd_focusAdditionalColor)
        gradientColors = intArrayOf(tertiaryColor, context.colorFromAttr(android.R.attr.colorPrimary), tertiaryColor)
        this.shapeAppearanceModel = shapeAppearanceModel.withTransformedCornerSizes { cornerSize ->
            AdjustedCornerSize(
                context.resources.getDimension(R.dimen.sdds_spacer_1_5x),
                cornerSize,
            )
        }
        borderPaint.strokeWidth = strokeWidth
        offset = strokeWidth / 2f
    }

    /**
     * @param context контекст
     * @param strokeWidth ширина селектора в пикселях
     * @param cornerRadius радиус закругления селектора в пикселях
     */
    constructor(
        context: Context,
        strokeWidth: Float,
        cornerRadius: Float,
    ) : this(context, strokeWidth, createShapeModel(cornerRadius))

    init {
        borderPaint.style = Paint.Style.STROKE
        borderPaint.isAntiAlias = true
    }

    private val drawingRect = RectF()

    private var focused = false

    override fun draw(canvas: Canvas) {
        if (!focused) return
        canvas.save()
        canvas.translate(scrollX, scrollY)
        if (shapeAppearanceModel.isRoundRect(drawingRect)) {
            val cornerSize = shapeAppearanceModel.topLeftCornerSize.getCornerSize(drawingRect)
            canvas.drawRoundRect(drawingRect, cornerSize, cornerSize, borderPaint)
        } else {
            canvas.drawPath(shapePath, borderPaint)
        }
        canvas.restore()
    }

    override fun onStateChange(state: IntArray): Boolean {
        val focused = state.contains(android.R.attr.state_focused)
        val needDraw = focused != this.focused
        this.focused = focused
        return needDraw
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        drawingRect.set(bounds)
        drawingRect.left += offset
        drawingRect.top += offset
        drawingRect.right -= offset
        drawingRect.bottom -= offset
        if (shapeAppearanceModel.isRoundRect(drawingRect)) {
            shapePath.reset()
            val cornerSize = shapeAppearanceModel.topLeftCornerSize.getCornerSize(drawingRect)
            shapePath.addRoundRect(drawingRect, cornerSize, cornerSize, Path.Direction.CW)
            shapePath.close()
        } else {
            shapeAppearancePathProvider.calculatePath(
                shapeAppearanceModel,
                1f,
                drawingRect,
                shapePath,
            )
        }
        borderPaint.shader = LinearGradient(
            0f,
            0f,
            bounds.width().toFloat(),
            bounds.height().toFloat(),
            gradientColors,
            null,
            Shader.TileMode.MIRROR,
        )
    }

    override fun setAlpha(alpha: Int) = Unit

    override fun setColorFilter(colorFilter: ColorFilter?) = Unit

    override fun getOpacity(): Int = PixelFormat.OPAQUE

    override fun isStateful(): Boolean = true
    override fun onScrollChange(v: View?, scrollX: Int, scrollY: Int, oldScrollX: Int, oldScrollY: Int) {
        this.scrollX = scrollX.toFloat()
        this.scrollY = scrollY.toFloat()
    }

    companion object {

        private fun createShapeModel(cornerRadius: Float) = ShapeAppearanceModel.builder()
            .setAllCornerSizes(cornerRadius)
            .build()
    }
}
