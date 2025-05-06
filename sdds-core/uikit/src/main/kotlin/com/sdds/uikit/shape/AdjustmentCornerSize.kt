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
        val otherPx = other.getSize(bounds)
        return if (isCircle(bounds, otherPx)) {
            otherPx
        } else {
            otherPx + adjustmentPx
        }
    }

    private fun isCircle(bounds: RectF, otherPx: Float): Boolean {
        val half = minOf(bounds.width(), bounds.height()) / 2f
        return otherPx == half
    }
}

/**
 * Корректирует [CornerSize] на значение [adjustmentPx].
 */
fun CornerSize.adjust(adjustmentPx: Float): CornerSize =
    if (adjustmentPx != 0f) {
        AdjustmentCornerSize(this, adjustmentPx)
    } else {
        this
    }
