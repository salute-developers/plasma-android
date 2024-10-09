package com.sdds.uikit.internal.base.shape

import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Outline
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.graphics.Rect
import android.graphics.RectF
import android.view.View
import android.view.ViewOutlineProvider
import androidx.annotation.Dimension
import com.sdds.uikit.ImageView
import com.sdds.uikit.internal.base.unsafeLazy
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.ShapeModelPathProvider
import com.sdds.uikit.shape.Shapeable

/**
 * Делегат, добавляющий [ImageView] возможность изменять форму и рисовать границу
 * @param imageView целевой [ImageView]
 * @author Малышев Александр on 03.06.2024
 */
internal class ShapeableImageDelegate(private val imageView: ImageView) : Shapeable {

    private val pathProvider: ShapeModelPathProvider by unsafeLazy { ShapeModelPathProvider() }
    private val borderPaint: Paint by unsafeLazy {
        Paint().apply {
            style = Paint.Style.STROKE
            isAntiAlias = true
        }
    }
    private val clearPaint: Paint by unsafeLazy {
        Paint().apply {
            color = Color.WHITE
            isAntiAlias = true
            xfermode = PorterDuffXfermode(PorterDuff.Mode.DST_OUT)
        }
    }
    private val destination: RectF = RectF()
    private val maskRect: RectF = RectF()
    private val maskPath: Path = Path()
    private val path: Path = Path()
    private val borderPath: Path = Path()
    private val borderTransformation: Matrix = Matrix()

    @Dimension
    private var strokeWidth = 0f
    private var strokeColor: ColorStateList? = null
    private var shapeModel: ShapeModel? = null
    private var shadowDrawable: ShapeDrawable? = null

    /**
     * @see Shapeable
     */
    override val shape: ShapeModel?
        get() = shapeModel

    /**
     * Устанавливает форму [shape].
     * Если [invalidate] == true, то [imageView] будет перерисована.
     * @param shape [ShapeModel]
     * @param invalidate нужно ли перерисовать [imageView]
     */
    fun setShape(shape: ShapeModel, invalidate: Boolean = false) {
        shapeModel = shape
        imageView.outlineProvider = OutlineProvider()

        shadowDrawable?.setShapeModel(shape)
        updateShapeMask(imageView.width, imageView.height)
        if (invalidate) invalidate()
    }

    /**
     * Устанавливает цвета границы. Если [invalidate] == true, то [imageView] будет перерисована.
     * @param colorStateList набор цветов [ColorStateList]
     * @param invalidate нужно ли перерисовать [imageView]
     */
    fun setStrokeColor(colorStateList: ColorStateList?, invalidate: Boolean = false) {
        if (strokeColor != colorStateList) {
            strokeColor = colorStateList
            if (invalidate) invalidate()
        }
    }

    /**
     * Устанавливает толщину линии границы. Если [invalidate] == true, то [imageView] будет перерисована.
     * @param strokeWidth толщина линии границы
     * @param invalidate нужно ли перерисовать [imageView]
     */
    fun setStrokeWidth(@Dimension strokeWidth: Float, invalidate: Boolean = false) {
        if (this.strokeWidth != strokeWidth) {
            this.strokeWidth = strokeWidth
            if (invalidate) invalidate()
        }
    }

    /**
     * Рисует границу и маску формы на [canvas]
     * @param canvas см. [Canvas]
     */
    fun draw(canvas: Canvas) {
        canvas.drawPath(maskPath, clearPaint)
        drawStroke(canvas)
    }

    /**
     *  Обновляет маску формы
     *  @param width ширина маски
     *  @param height высота маски
     */
    fun updateShapeMask(width: Int, height: Int) = with(imageView) {
        destination[paddingLeft.toFloat(), paddingTop.toFloat(), (width - paddingRight).toFloat()] =
            (height - paddingBottom).toFloat()
        pathProvider.providePath(shapeModel, destination, path)
        // Remove path from rect to draw with clear paint.
        maskPath.rewind()
        borderPath.rewind()
        maskPath.addPath(path)
        // Do not include padding to clip the background too.
        maskRect[0f, 0f, width.toFloat()] = height.toFloat()
        maskPath.addRect(maskRect, Path.Direction.CCW)
        borderPath.addPath(
            path,
            borderTransformation.apply {
                reset()
                val scaledWidth = width - strokeWidth
                val scaledHeight = height - strokeWidth
                postScale(scaledWidth / width, scaledHeight / height, width / 2f, height / 2f)
            },
        )
    }

    internal fun getShapePath(): Path = path

    private fun drawStroke(canvas: Canvas) {
        val color = strokeColor ?: return
        borderPaint.strokeWidth = strokeWidth
        val colorForState = color.getColorForState(imageView.drawableState, color.defaultColor)

        if (strokeWidth > 0 && colorForState != Color.TRANSPARENT) {
            borderPaint.color = colorForState
            canvas.drawPath(borderPath, borderPaint)
        }
    }

    private fun invalidate() {
        imageView.invalidate()
        imageView.invalidateOutline()
    }

    private inner class OutlineProvider : ViewOutlineProvider() {
        private val rect = Rect()
        override fun getOutline(view: View, outline: Outline) {
            if (shapeModel == null) {
                return
            }
            val drawable = shadowDrawable
                ?: ShapeDrawable(shapeModel ?: return)
                    .also { shadowDrawable = it }

            destination.round(rect)
            drawable.bounds = rect
            drawable.getOutline(outline)
        }
    }
}
