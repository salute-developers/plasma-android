package com.sdds.uikit.shape

import android.content.Context
import android.graphics.RectF
import android.graphics.drawable.shapes.RoundRectShape
import android.graphics.drawable.shapes.Shape
import androidx.annotation.StyleRes
import com.sdds.uikit.R

/**
 * Модель, описывающая форму для [ShapeDrawable].
 * @property cornerSizeTopLeft [CornerSize] размер для верхнего левого угла
 * @property cornerSizeTopRight [CornerSize] размер для верхнего правого угла
 * @property cornerSizeBottomRight [CornerSize] размер для нижнего правого угла
 * @property cornerSizeBottomLeft [CornerSize] размер для нижнего левого угла
 * @author Малышев Александр on 12.08.2024
 */
data class ShapeModel(
    val cornerSizeTopLeft: CornerSize = SimpleRect,
    val cornerSizeTopRight: CornerSize = SimpleRect,
    val cornerSizeBottomRight: CornerSize = SimpleRect,
    val cornerSizeBottomLeft: CornerSize = SimpleRect,
) {
    private var _currentBounds: RectF = RectF()
    private var _currentShape: Shape = NullShape

    /**
     * Возвращает [Shape] согласно границам [bounds]
     */
    fun getShape(bounds: RectF): Shape {
        if (bounds == _currentBounds && _currentShape != NullShape) return _currentShape
        _currentBounds.set(bounds)
        val topLeft = cornerSizeTopLeft.getSize(bounds)
        val topRight = cornerSizeTopRight.getSize(bounds)
        val bottomRight = cornerSizeBottomRight.getSize(bounds)
        val bottomLeft = cornerSizeBottomLeft.getSize(bounds)
        return RoundRectShape(
            floatArrayOf(
                topLeft,
                topLeft,
                topRight,
                topRight,
                bottomRight,
                bottomRight,
                bottomLeft,
                bottomLeft,
            ),
            null,
            null,
        ).also { _currentShape = it }
    }

    /**
     * Семейство углов.
     */
    enum class CornerFamily {
        /**
         * Скругленные углы
         */
        ROUNDED,
    }

    companion object {

        /**
         * Простой прямоугольник без скруглений
         */
        val SimpleRect = AbsoluteCornerSize(0f)

        private val NullShape = RoundRectShape(null, null, null)

        /**
         * Создает [ShapeModel] согласно атрибутам стиля с идентификатором [shapeAppearanceResId]
         * @param context контекст
         * @param shapeAppearanceResId идентификатор ресурса стиля, описывающего форму
         */
        fun create(
            context: Context,
            @StyleRes shapeAppearanceResId: Int,
        ): ShapeModel {
            val typedArray = context.obtainStyledAttributes(shapeAppearanceResId, R.styleable.SdShapeAppearance)
            val cornerFamily = CornerFamily.values().getOrElse(
                typedArray.getInt(R.styleable.SdShapeAppearance_sd_cornerFamily, 0),
            ) { CornerFamily.ROUNDED }
            if (cornerFamily != CornerFamily.ROUNDED) {
                throw IllegalArgumentException("Only ${CornerFamily.ROUNDED} is supported.")
            }
            val defaultCornerSize = typedArray.getCornerSize(R.styleable.SdShapeAppearance_sd_cornerSize)
            val cornerSizeTopLeft = typedArray.getCornerSize(
                R.styleable.SdShapeAppearance_sd_cornerSizeTopLeft,
                defaultCornerSize,
            )
            val cornerSizeTopRight = typedArray.getCornerSize(
                R.styleable.SdShapeAppearance_sd_cornerSizeTopRight,
                defaultCornerSize,
            )
            val cornerSizeBottomRight = typedArray.getCornerSize(
                R.styleable.SdShapeAppearance_sd_cornerSizeBottomRight,
                defaultCornerSize,
            )
            val cornerSizeBottomLeft = typedArray.getCornerSize(
                R.styleable.SdShapeAppearance_sd_cornerSizeBottomLeft,
                defaultCornerSize,
            )
            typedArray.recycle()
            return ShapeModel(cornerSizeTopLeft, cornerSizeTopRight, cornerSizeBottomRight, cornerSizeBottomLeft)
        }
    }
}