package com.sdds.uikit.internal.focusselector

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.Shader
import android.graphics.drawable.Drawable
import android.graphics.drawable.shapes.Shape
import android.view.View
import android.view.View.OnScrollChangeListener
import com.sdds.uikit.R
import com.sdds.uikit.colorFromAttr
import com.sdds.uikit.internal.base.configure
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.ShapeModel.Companion.adjust
import com.sdds.uikit.shape.toPath

/**
 * Drawable отрисовывающий контур фокусировки когда state_focused
 */
internal class SelectorDrawable : Drawable, OnScrollChangeListener {

    private val borderPaint = Paint().configure(style = Paint.Style.STROKE, isAntiAlias = true)
    private val colors: IntArray
    private val shapeModel: ShapeModel
    private val shapePath = Path()
    private var scrollX: Float = 0f
    private var scrollY: Float = 0f
    private val drawingRect = RectF()
    private var focused = false
    private var shape: Shape? = null

    /*
     * отступ отрисовки селектора (внутрь)
     * нужен, чтобы селектор не выходил за границы контейнера и идеально ложился на его края
     */
    private val offset: Float

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
        additionalColor: Int = 0,
    ) : super() {
        colors = if (additionalColor != 0) {
            intArrayOf(additionalColor, mainColor, additionalColor)
        } else {
            intArrayOf(mainColor)
        }
        offset = strokeWidth / 2f + insets
        this.shapeModel = shapeModel.adjust(offset)
        borderPaint.strokeWidth = strokeWidth
    }

    override fun draw(canvas: Canvas) {
        if (!focused) return
        canvas.save()
        canvas.translate(scrollX + drawingRect.left, scrollY + drawingRect.top)
        shape?.draw(canvas, borderPaint)
        canvas.restore()
    }

    override fun onStateChange(state: IntArray): Boolean {
        val focused = state.contains(android.R.attr.state_focused)
        val needDraw = focused != this.focused
        this.focused = focused
        if (needDraw) {
            invalidateSelf()
        }
        return needDraw
    }

    override fun onBoundsChange(bounds: Rect) {
        super.onBoundsChange(bounds)
        drawingRect.set(bounds)
        drawingRect.inset(-offset, -offset)
        shapePath.reset()
        shapeModel.toPath(drawingRect, shapePath)
        shapePath.close()
        shape = shapeModel.getShape(drawingRect)
        shape?.resize(drawingRect.width(), drawingRect.height())
        if (colors.size > 1) {
            borderPaint.shader = LinearGradient(
                0f,
                0f,
                bounds.width().toFloat(),
                bounds.height().toFloat(),
                colors,
                null,
                Shader.TileMode.MIRROR,
            )
        } else {
            borderPaint.color = colors.firstOrNull() ?: Color.TRANSPARENT
        }
    }

    override fun setAlpha(alpha: Int) = Unit

    override fun setColorFilter(colorFilter: ColorFilter?) = Unit

    override fun getOpacity(): Int = PixelFormat.OPAQUE

    override fun isStateful(): Boolean = true
    override fun onScrollChange(v: View?, scrollX: Int, scrollY: Int, oldScrollX: Int, oldScrollY: Int) {
        this.scrollX = scrollX.toFloat()
        this.scrollY = scrollY.toFloat()
    }
}
