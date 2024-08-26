package com.sdds.uikit.shape

import android.graphics.RectF

/**
 * Подвид [CornerSize], который умеет корректировать другие [CornerSize]
 *
 * @param other другой [CornerSize], который нужно скорректировать
 * @param adjustmentPx значение корректировки в пикселях
 */
data class AdjustmentCornerSize(
    private val other: CornerSize,
    private val adjustmentPx: Float,
) : CornerSize {

    override fun getSize(bounds: RectF): Float {
        return other.getSize(bounds) + adjustmentPx
    }
}

/**
 * Корректирует [CornerSize] на значение [adjustmentPx].
 */
fun CornerSize.adjust(adjustmentPx: Float): CornerSize =
    if (adjustmentPx > 0) {
        AdjustmentCornerSize(this, adjustmentPx)
    } else {
        this
    }
