package com.sdds.testing.vs.segement

import android.content.Context
import android.view.ContextThemeWrapper
import com.sdds.uikit.Segment

/**
 * Фабрика для создания Segment
 */
fun segmentItemFactory(
    context: Context,
    amount: Int = 0,
    label: String = "Label",
    value: String? = null,
    icon: SegmentItemIcon? = null,
    segmentId: Int = 0,
    segmentStyle: Int = 0,
    isEnabled: Boolean = true,
    isChecked: Boolean = false,
    stretch: Boolean = false,
    orientation: SegmentOrientation = SegmentOrientation.HORIZONTAL,
    counter: Boolean = false,
    count: String = "1",
): Segment {
    return Segment(ContextThemeWrapper(context, segmentStyle)).apply {
        this.id = segmentId
        this.isEnabled = isEnabled
        this.isStretch = isStretch
    }
}

/**
 * Вертикальное и горизонтальное состояние Segment
 */
enum class SegmentOrientation(val orientationState: Int) {

    /**
     * Горизонтальное состояние
     */
    HORIZONTAL(Segment.HORIZONTAL),

    /**
     * Вертикальное состояние
     */
    VERTICAL(Segment.VERTICAL),
}

/**
 * Положение иконки в Segment
 */
sealed class SegmentItemIcon(val iconId: Int = com.sdds.icons.R.drawable.ic_plasma_24) {
    /**
     * Иконка вначале
     */
    object Start : SegmentItemIcon()

    /**
     * Иконка вконце
     */
    object End : SegmentItemIcon()

    /**
     * Отсутствие иконки
     */
    object No : SegmentItemIcon(0)
}
