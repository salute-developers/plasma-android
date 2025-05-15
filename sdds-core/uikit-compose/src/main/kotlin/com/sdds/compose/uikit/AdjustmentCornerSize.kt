package com.sdds.compose.uikit

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.platform.InspectableValue
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Подвид [CornerSize], который умеет корректировать другие [CornerSize]
 *
 * @param other другой [CornerSize], который нужно скорректировать
 * @param adjustmentPx значение корректировки в пикселях
 */
data class AdjustmentCornerSize(
    private val other: CornerSize,
    private val adjustmentPx: Float,
) : CornerSize, InspectableValue {

    override fun toPx(shapeSize: Size, density: Density): Float {
        val otherPx = other.toPx(shapeSize, density)
        if (isCircle(shapeSize, otherPx)) return otherPx
        val result = otherPx + adjustmentPx
        return if (result > 0) result else otherPx
    }

    private fun isCircle(shapeSize: Size, otherPx: Float): Boolean {
        return shapeSize.minDimension / 2 == otherPx
    }
}

/**
 * Корректирует [CornerBasedShape] на указанные значения.
 * Корректировки указываются в Px.
 * @param topStartPx корректировка верхнего начального угла
 * @param topEndPx корректировка верхнего конечного угла
 * @param bottomEndPx корректировка нижнего конечного угла
 * @param bottomStartPx корректировка нижнего начального угла
 */
fun CornerBasedShape.adjustBy(
    topStartPx: Float = 0f,
    topEndPx: Float = 0f,
    bottomEndPx: Float = 0f,
    bottomStartPx: Float = 0f,
): CornerBasedShape {
    if (topStartPx + topEndPx + bottomStartPx + bottomEndPx == 0f) return this
    return copy(
        topStart = this.topStart.adjust(topStartPx),
        topEnd = this.topEnd.adjust(topEndPx),
        bottomEnd = this.bottomEnd.adjust(bottomEndPx),
        bottomStart = this.bottomStart.adjust(bottomStartPx),
    )
}

/**
 * Корректирует [CornerBasedShape] на указанные значения.
 * Корректировки указываются в [Dp].
 * @param topStart корректировка верхнего начального угла
 * @param topEnd корректировка верхнего конечного угла
 * @param bottomEnd корректировка нижнего конечного угла
 * @param bottomStart корректировка нижнего начального угла
 */
@Composable
fun CornerBasedShape.adjustBy(
    topStart: Dp = 0.dp,
    topEnd: Dp = 0.dp,
    bottomEnd: Dp = 0.dp,
    bottomStart: Dp = 0.dp,
): CornerBasedShape =
    adjustBy(
        topStartPx = topStart.floatPx,
        topEndPx = topEnd.floatPx,
        bottomEndPx = bottomEnd.floatPx,
        bottomStartPx = bottomStart.floatPx,
    )

/**
 * Корректирует [CornerBasedShape] на значение [allPx].
 */
fun CornerBasedShape.adjustBy(allPx: Float): CornerBasedShape = this.adjustBy(allPx, allPx, allPx, allPx)

/**
 * Корректирует [CornerBasedShape] на значение [all].
 */
@Composable
fun CornerBasedShape.adjustBy(all: Dp): CornerBasedShape = this.adjustBy(all.floatPx)

private fun CornerSize.adjust(adjustmentPx: Float): CornerSize =
    AdjustmentCornerSize(this, adjustmentPx)
