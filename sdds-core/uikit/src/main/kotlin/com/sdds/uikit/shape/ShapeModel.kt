package com.sdds.uikit.shape

import android.content.Context
import android.graphics.Path
import android.graphics.RectF
import android.graphics.drawable.shapes.RoundRectShape
import android.graphics.drawable.shapes.Shape
import android.util.AttributeSet
import androidx.annotation.StyleRes
import com.sdds.uikit.R
import com.sdds.uikit.shape.ShapeModel.CornerFamily

/**
 * Модель, описывающая форму для [ShapeDrawable].
 * @property cornerSizeTopLeft [CornerSize] размер для верхнего левого угла
 * @property cornerSizeTopRight [CornerSize] размер для верхнего правого угла
 * @property cornerSizeBottomRight [CornerSize] размер для нижнего правого угла
 * @property cornerSizeBottomLeft [CornerSize] размер для нижнего левого угла
 * @property cornerFamily семейство углов [CornerFamily]
 * @author Малышев Александр on 12.08.2024
 */
data class ShapeModel(
    val cornerSizeTopLeft: CornerSize = SimpleRect,
    val cornerSizeTopRight: CornerSize = SimpleRect,
    val cornerSizeBottomRight: CornerSize = SimpleRect,
    val cornerSizeBottomLeft: CornerSize = SimpleRect,
    val cornerFamily: CornerFamily = CornerFamily.ROUNDED,
) {
    private var _currentBounds: RectF = RectF()
    private var _currentShape: Shape = NullShape
    private var _currentTailConfig: TailConfig? = null

    /**
     * Возвращает [Shape] согласно границам [bounds]
     */
    fun getShape(bounds: RectF, tail: TailConfig? = null): Shape {
        if (bounds == _currentBounds && _currentShape != NullShape && tail == _currentTailConfig) return _currentShape
        _currentBounds.set(bounds)
        _currentTailConfig = tail
        val topLeft = cornerSizeTopLeft.getSize(bounds)
        val topRight = cornerSizeTopRight.getSize(bounds)
        val bottomRight = cornerSizeBottomRight.getSize(bounds)
        val bottomLeft = cornerSizeBottomLeft.getSize(bounds)
        return CornerShape(
            cornerFamily = cornerFamily,
            tailConfig = tail,
            corners = floatArrayOf(
                topLeft,
                topLeft,
                topRight,
                topRight,
                bottomRight,
                bottomRight,
                bottomLeft,
                bottomLeft,
            ),
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
         * Возвращает новую [ShapeModel] с измененными на некоторое значение пикселей [adjustmentPx] углами
         */
        fun ShapeModel.adjust(adjustmentPx: Float): ShapeModel {
            if (adjustmentPx == 0f) return this
            return this.copy(
                cornerSizeTopLeft = cornerSizeTopLeft.adjust(adjustmentPx),
                cornerSizeTopRight = cornerSizeTopRight.adjust(adjustmentPx),
                cornerSizeBottomRight = cornerSizeBottomRight.adjust(adjustmentPx),
                cornerSizeBottomLeft = cornerSizeBottomLeft.adjust(adjustmentPx),
                cornerFamily = cornerFamily,
            )
        }

        /**
         * Создает [ShapeModel]
         * @param context контекст
         * @param attributeSet набор атрибутов
         * @param attributeSet атрибут стиля по умолчанию
         * @param defStyleRes стиль по умолчанию
         */
        fun create(
            context: Context,
            attributeSet: AttributeSet? = null,
            defStyleAttr: Int = 0,
            defStyleRes: Int = 0,
        ): ShapeModel {
            val typedArray = context.obtainStyledAttributes(
                attributeSet,
                R.styleable.SdShape,
                defStyleAttr,
                defStyleRes,
            )
            val adjustment =
                typedArray.getDimension(R.styleable.SdShape_sd_shapeAppearanceAdjustment, 0f)
            val shapeResId = typedArray.getResourceId(R.styleable.SdShape_sd_shapeAppearance, 0)
            val baselineOrdinal =
                typedArray.getInt(R.styleable.SdShape_sd_shapeAppearanceBaseline, 0)
            typedArray.recycle()
            val baseline =
                CornerSizeBaseline.values().getOrNull(baselineOrdinal) ?: CornerSizeBaseline.AUTO
            return create(context, shapeResId, baseline).adjust(adjustment)
        }

        /**
         * Создает [ShapeModel] согласно атрибутам стиля с идентификатором [shapeAppearanceResId]
         * @param context контекст
         * @param shapeAppearanceResId идентификатор ресурса стиля, описывающего форму
         */
        fun create(
            context: Context,
            @StyleRes shapeAppearanceResId: Int,
            cornerSizeBaseline: CornerSizeBaseline = CornerSizeBaseline.AUTO,
        ): ShapeModel {
            val typedArray =
                context.obtainStyledAttributes(shapeAppearanceResId, R.styleable.SdShapeAppearance)
            val cornerFamily = CornerFamily.values().getOrElse(
                typedArray.getInt(R.styleable.SdShapeAppearance_sd_cornerFamily, 0),
            ) { CornerFamily.ROUNDED }
            if (cornerFamily != CornerFamily.ROUNDED) {
                throw IllegalArgumentException("Only ${CornerFamily.ROUNDED} is supported.")
            }
            val defaultCornerSize = typedArray.getCornerSize(
                R.styleable.SdShapeAppearance_sd_cornerSize,
                cornerSizeBaseline,
            )
            val cornerSizeTopLeft = typedArray.getCornerSize(
                R.styleable.SdShapeAppearance_sd_cornerSizeTopLeft,
                cornerSizeBaseline,
                defaultCornerSize,
            )
            val cornerSizeTopRight = typedArray.getCornerSize(
                R.styleable.SdShapeAppearance_sd_cornerSizeTopRight,
                cornerSizeBaseline,
                defaultCornerSize,
            )
            val cornerSizeBottomRight = typedArray.getCornerSize(
                R.styleable.SdShapeAppearance_sd_cornerSizeBottomRight,
                cornerSizeBaseline,
                defaultCornerSize,
            )
            val cornerSizeBottomLeft = typedArray.getCornerSize(
                R.styleable.SdShapeAppearance_sd_cornerSizeBottomLeft,
                cornerSizeBaseline,
                defaultCornerSize,
            )
            typedArray.recycle()
            return ShapeModel(
                cornerSizeTopLeft,
                cornerSizeTopRight,
                cornerSizeBottomRight,
                cornerSizeBottomLeft,
            )
        }
    }
}

/**
 * Добавляет [ShapeModel] в [path]
 */
fun ShapeModel.toPath(bounds: RectF, path: Path) {
    if (cornerFamily != CornerFamily.ROUNDED) return
    val topLeft = cornerSizeTopLeft.getSize(bounds)
    val topRight = cornerSizeTopRight.getSize(bounds)
    val bottomRight = cornerSizeBottomRight.getSize(bounds)
    val bottomLeft = cornerSizeBottomLeft.getSize(bounds)
    path.addRoundRect(
        bounds,
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
        Path.Direction.CW,
    )
}
