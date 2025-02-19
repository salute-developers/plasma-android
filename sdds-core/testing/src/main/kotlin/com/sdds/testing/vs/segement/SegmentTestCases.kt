package com.sdds.testing.vs.segement

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Segment
import com.sdds.uikit.SegmentItem

/**
 * Тест-кейсы для [Segment] и [SegmentItem]
 * @author Малышев Александр on 14.02.2025
 */
@Suppress("UndocumentedPublicFunction")
abstract class SegmentTestCases(mode: String) : RoborazziConfig(mode) {

    abstract fun testSegmentSizeL()

    abstract fun testSegmentSizeMPilled()

    abstract fun testSegmentSizeS()

    abstract fun testSegmentSizeXS()

    abstract fun testSegmentOrientationVertical()

    abstract fun testSegmentDisabled()

    abstract fun testSegmentSizeSStretch()

    abstract fun testSegmentSizeLCounter()

    abstract fun testSegmentItemSizeLPrimary()

    abstract fun testSegmentItemSizeMSecondary()

    abstract fun testSegmentItemSizeSDefault()

    abstract fun testSegmentItemSizeXSPrimaryCounter()

    abstract fun testSegmentItemDisabled()

    fun ComponentScope.segmentSizeL(style: Int): Segment =
        segment(
            context,
            style,
            SegmentUiState(
                amount = 3,
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = false,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )

    fun ComponentScope.segmentSizeMPilled(style: Int): Segment =
        segment(
            context,
            style,
            SegmentUiState(
                amount = 3,
                icon = SegmentItemIcon.Start,
                segmentItemLabel = "Label",
                segmentItemValue = "Value",
                enabled = true,
                stretch = false,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )

    fun ComponentScope.segmentSizeS(style: Int): Segment =
        segment(
            context,
            style,
            SegmentUiState(
                amount = 3,
                icon = SegmentItemIcon.Start,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = false,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )

    fun ComponentScope.segmentSizeXS(style: Int): Segment =
        segment(
            context,
            style,
            SegmentUiState(
                amount = 3,
                icon = SegmentItemIcon.End,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = false,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )

    fun ComponentScope.segmentOrientationVertical(style: Int): Segment =
        segment(
            context,
            style,
            SegmentUiState(
                amount = 3,
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = false,
                orientation = SegmentOrientation.VERTICAL,
            ),
        )

    fun ComponentScope.segmentDisabled(style: Int): Segment =
        segment(
            context,
            style,
            SegmentUiState(
                amount = 3,
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = false,
                stretch = false,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )

    fun ComponentScope.segmentSizeSStretch(style: Int): Segment =
        segment(
            context,
            style,
            SegmentUiState(
                amount = 3,
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = true,
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )

    fun ComponentScope.segmentSizeLCounter(style: Int): Segment =
        segment(
            context,
            style,
            SegmentUiState(
                amount = 3,
                icon = SegmentItemIcon.Start,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                stretch = false,
                counter = true,
                count = "123",
                orientation = SegmentOrientation.HORIZONTAL,
            ),
        )

    fun ComponentScope.segmentItemSizeLPrimary(style: Int): SegmentItem =
        segmentItem(
            context,
            style,
            SegmentUiState(
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                checked = true,
            ),
        )

    fun ComponentScope.segmentItemSizeMSecondary(style: Int): SegmentItem =
        segmentItem(
            context,
            style,
            SegmentUiState(
                icon = SegmentItemIcon.Start,
                segmentItemLabel = "Label",
                segmentItemValue = "Value",
                enabled = true,
                checked = true,
            ),
        )

    fun ComponentScope.segmentItemSizeSDefault(style: Int): SegmentItem =
        segmentItem(
            context,
            style,
            SegmentUiState(
                icon = SegmentItemIcon.End,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                checked = false,
            ),
        )

    fun ComponentScope.segmentItemSizeXSPrimaryCounter(style: Int): SegmentItem =
        segmentItem(
            context,
            style,
            SegmentUiState(
                icon = SegmentItemIcon.Start,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                enabled = true,
                checked = true,
                counter = true,
                count = "123",
            ),
        )

    fun ComponentScope.segmentItemDisabled(style: Int): SegmentItem =
        segmentItem(
            context,
            style,
            SegmentUiState(
                icon = SegmentItemIcon.No,
                segmentItemLabel = "Label",
                segmentItemValue = "",
                checked = true,
                enabled = false,
            ),
        )
}
