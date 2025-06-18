package com.sdds.uikit.shape

import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Outline
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.graphics.drawable.shapes.RectShape
import androidx.core.graphics.toRect
import com.sdds.uikit.shape.CornerShape.Companion.TAIL_ALIGNMENT_START
import com.sdds.uikit.shape.CornerShape.Companion.TAIL_PLACEMENT_BOTTOM
import com.sdds.uikit.shape.CornerShape.Companion.TAIL_PLACEMENT_END
import com.sdds.uikit.shape.CornerShape.Companion.TAIL_PLACEMENT_NONE
import com.sdds.uikit.shape.CornerShape.Companion.TAIL_PLACEMENT_START
import com.sdds.uikit.shape.CornerShape.Companion.TAIL_PLACEMENT_TOP
import com.sdds.uikit.shape.ShapeModel.CornerFamily

/**
 * Конфигурация хвоста для фигуры [CornerShape].
 * Позволяет задать положение, выравнивание, размеры и смещение хвоста.
 *
 * @property placement Расположение хвоста (NONE, START, TOP, END, BOTTOM)
 * @property alignment Выравнивание хвоста (START, CENTER, END) относительно стороны
 * @property tailWidth Ширина хвоста
 * @property tailHeight Высота хвоста
 * @property tailOffset Смещение хвоста вдоль стороны
 */
data class TailConfig(
    val placement: Int = TAIL_PLACEMENT_NONE,
    val alignment: Int = TAIL_ALIGNMENT_START,
    val tailWidth: Float = 0f,
    val tailHeight: Float = 0f,
    val tailOffset: Float = 0f,
)

/**
 * Возвращает `true`, если хвост располагается вначале или вконце [CornerShape]
 */
fun TailConfig.isHorizontalPlacement(): Boolean {
    return placement == TAIL_PLACEMENT_START || placement == TAIL_PLACEMENT_END
}

/**
 * Возвращает `true`, если хвост располагается сверху или снизу [CornerShape]
 */
fun TailConfig.isVerticalPlacement(): Boolean {
    return placement == TAIL_PLACEMENT_TOP || placement == TAIL_PLACEMENT_BOTTOM
}

/**
 * Кастомная фигура, основанная на [RectShape], с возможностью скругления углов и добавления "хвоста".
 *
 * Используется для отрисовки прямоугольников с настраиваемыми углами и опциональным элементом "хвоста",
 * который может размещаться на любой из сторон (сверху, снизу, слева, справа) и служит, например,
 * визуальным указателем (как в tooltip).
 *
 * @param cornerFamily Тип скругления углов ([CornerFamily])
 * @param corners Радиусы скругления углов (по часовой стрелке, начиная с верхнего левого)
 * @param tailConfig Конфигурация хвоста (если null — хвост не рисуется)
 */
open class CornerShape(
    private val cornerFamily: CornerFamily,
    private val corners: FloatArray?,
    private val tailConfig: TailConfig? = null,
) : RectShape() {

    private val combinedPath: Path = Path()
    private val tailPath: Path = Path()
    private val canGetCorrectOutline: Boolean =
        cornerFamily == CornerFamily.ROUNDED && corners != null && corners.all { it == corners.first() }
    private val outlineCorners: Float = corners?.first() ?: 0f

    override fun draw(canvas: Canvas, paint: Paint) {
        canvas.drawPath(combinedPath, paint)
    }

    override fun onResize(width: Float, height: Float) {
        super.onResize(width, height)
        val rect = rect()
        combinedPath.reset()

        if (corners != null && cornerFamily == CornerFamily.ROUNDED) {
            combinedPath.addRoundRect(rect, corners, Path.Direction.CW)
        } else {
            combinedPath.addRect(rect, Path.Direction.CW)
        }

        if (tailConfig != null && tailConfig.placement != TAIL_PLACEMENT_NONE) {
            tailPath.addTail(width, height, tailConfig)
            combinedPath.op(tailPath, Path.Op.UNION)
        }
    }

    override fun getOutline(outline: Outline) {
        super.getOutline(outline)
        val rect = rect().toRect()
        if (canGetCorrectOutline) {
            outline.setRoundRect(rect, outlineCorners)
        } else {
            outline.setRect(rect)
        }
    }

    private fun createTailTransformMatrix(width: Float, height: Float, tailConfig: TailConfig): Matrix {
        val matrix = Matrix()
        var tailX = 0f
        var tailY = 0f
        var rotation = 0f
        when (tailConfig.placement) {
            TAIL_PLACEMENT_BOTTOM -> {
                rotation = 180f
                tailX = resolveAlignedPosition(width, tailConfig)
                tailY = height
            }

            TAIL_PLACEMENT_TOP -> {
                rotation = 0f
                tailX = resolveAlignedPosition(width, tailConfig)
                tailY = 0f
            }

            TAIL_PLACEMENT_START -> {
                rotation = 270f
                tailY = resolveAlignedPosition(height, tailConfig)
                tailX = 0f
            }

            TAIL_PLACEMENT_END -> {
                rotation = 90f
                tailY = resolveAlignedPosition(height, tailConfig)
                tailX = width
            }
        }
        return matrix.apply {
            setRotate(rotation)
            postTranslate(tailX, tailY)
        }
    }

    private fun Path.addTail(width: Float, height: Float, tailConfig: TailConfig) {
        reset()
        val leftOval = RectF(-tailConfig.tailWidth, -2 * tailConfig.tailHeight, 0f, 0f)
        addArc(
            leftOval,
            0f,
            90f,
        )
        val rightOval = RectF(0f, -2 * tailConfig.tailHeight, tailConfig.tailWidth, 0f)
        lineTo(tailConfig.tailWidth / 2, 0f)
        addArc(
            rightOval,
            90f,
            90f,
        )
        transform(createTailTransformMatrix(width, height, tailConfig))
        close()
    }

    private fun resolveAlignedPosition(total: Float, tailConfig: TailConfig): Float {
        if (tailConfig.tailOffset + tailConfig.tailWidth >= total) {
            return total / 2
        }
        return when (tailConfig.alignment) {
            TAIL_ALIGNMENT_CENTER -> total / 2f
            TAIL_ALIGNMENT_END -> total - tailConfig.tailOffset - tailConfig.tailWidth / 2
            else -> tailConfig.tailOffset + tailConfig.tailWidth / 2
        }
    }

    override fun toString(): String {
        return "CornerShape(cornerFamily=$cornerFamily, corners=${corners?.contentToString()}, tailConfig=$tailConfig)"
    }

    companion object {
        /**
         * Без хвоста.
         */
        const val TAIL_PLACEMENT_NONE = -1

        /**
         * Хвост располагается слева (START).
         */
        const val TAIL_PLACEMENT_START = 0

        /**
         * Хвост располагается сверху (TOP).
         */
        const val TAIL_PLACEMENT_TOP = 1

        /**
         * Хвост располагается справа (END).
         */
        const val TAIL_PLACEMENT_END = 2

        /**
         * Хвост располагается снизу (BOTTOM).
         */
        const val TAIL_PLACEMENT_BOTTOM = 3

        /**
         * Выравнивание хвоста по началу стороны.
         */
        const val TAIL_ALIGNMENT_START = 0

        /**
         * Выравнивание хвоста по центру стороны.
         */
        const val TAIL_ALIGNMENT_CENTER = 1

        /**
         * Выравнивание хвоста по концу стороны.
         */
        const val TAIL_ALIGNMENT_END = 2
    }
}
