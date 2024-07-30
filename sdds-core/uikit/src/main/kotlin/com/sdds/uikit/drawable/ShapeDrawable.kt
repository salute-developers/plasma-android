package com.sdds.uikit.drawable

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.annotation.StyleRes
import com.google.android.material.shape.ShapeAppearanceModel
import com.google.android.material.shape.ShapeAppearancePathProvider
import com.sdds.uikit.R
import com.sdds.uikit.internal.base.colorForState
import com.sdds.uikit.internal.base.configure

/**
 * Drawable рисующий форму.
 * @param context контекст
 * @param attributeSet набор атрибутов
 * @author Малышев Александр on 29.07.2024
 */
@Suppress("RestrictedApi")
open class ShapeDrawable(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : Drawable() {

    private val drawingRect = RectF()
    private val paint = Paint()
    private val strokePaint = Paint()
    private val shapeAppearanceModel: ShapeAppearanceModel
    private val shapePath = Path()
    private val shapeAppearancePathProvider = ShapeAppearancePathProvider()
    private val offset: Float get() = _strokeWidth
    private var _strokeWidth: Float = 0f
    private var _strokeTint: ColorStateList? = null
    private var _tintList: ColorStateList? = null

    private val drawStroke: Boolean
        get() = _strokeWidth > 0 && strokePaint.color != Color.TRANSPARENT

    init {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.SdShape, defStyleAttr, defStyleRes)
        this.shapeAppearanceModel = context.getShapeModel(
            typedArray.getResourceId(R.styleable.SdShape_sd_shapeAppearance, 0),
        )
        _strokeTint = typedArray.getColorStateList(R.styleable.SdShape_sd_strokeColor)
        _strokeWidth = typedArray.getDimension(R.styleable.SdShape_sd_strokeWidth, 0f)
        typedArray.recycle()
        paint.configure(style = Paint.Style.FILL, color = _tintList.colorForState(state))
        strokePaint.configure(
            style = Paint.Style.STROKE,
            color = _strokeTint.colorForState(state),
            strokeWidth = _strokeWidth,
        )
    }

    /**
     * Устанавливает ширину линии границы
     * @param width ширина линии
     */
    open fun setStrokeWidth(width: Float) {
        if (_strokeWidth != width) {
            _strokeWidth = width
            strokePaint.configure(strokeWidth = width)
            invalidateSelf()
        }
    }

    /**
     * Устанавливает цвета линии границы
     * @param tint цвета линии
     */
    open fun setStrokeTint(tint: ColorStateList?) {
        if (_strokeTint != tint) {
            _strokeTint = tint
            strokePaint.color = tint.colorForState(state)
            invalidateSelf()
        }
    }

    override fun draw(canvas: Canvas) {
        if (shapeAppearanceModel.isRoundRect(drawingRect)) {
            val cornerSize = shapeAppearanceModel.topLeftCornerSize.getCornerSize(drawingRect)
            canvas.drawRoundRect(drawingRect, cornerSize, cornerSize, paint)
            if (drawStroke) {
                canvas.drawRoundRect(drawingRect, cornerSize, cornerSize, strokePaint)
            }
        } else {
            canvas.drawPath(shapePath, paint)
            if (drawStroke) {
                canvas.drawPath(shapePath, strokePaint)
            }
        }
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
    }

    override fun onStateChange(state: IntArray): Boolean {
        val newColor = _tintList.colorForState(state)
        var stateChanged = false
        if (newColor != paint.color) {
            paint.color = newColor
            stateChanged = true
        }
        val borderColor = _strokeTint.colorForState(state)
        if (borderColor != strokePaint.color) {
            strokePaint.color = borderColor
            stateChanged = true
        }
        return super.onStateChange(state) || stateChanged
    }

    override fun setAlpha(alpha: Int) {
        paint.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        paint.colorFilter = colorFilter
    }

    override fun setTintList(tint: ColorStateList?) {
        super.setTintList(tint)
        if (_tintList != tint) {
            _tintList = tint
        }
    }

    @Deprecated("Deprecated in Java", ReplaceWith("PixelFormat.OPAQUE", "android.graphics.PixelFormat"))
    override fun getOpacity(): Int = PixelFormat.OPAQUE

    private companion object {

        fun Context.getShapeModel(@StyleRes shapeAppearanceResId: Int) =
            ShapeAppearanceModel
                .builder(this, shapeAppearanceResId, 0)
                .build()
    }
}
