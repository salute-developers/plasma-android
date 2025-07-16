package com.sdds.testing.vs.wheel

import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Wheel

/**
 * Тест-кейсы для компонента [Wheel]
 */
@Suppress("UndocumentedPublicFunction")
abstract class WheelTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2118
     */
    abstract fun testWheelH1MixedAlignLabelHasControlsWheelCount3()

    /**
     * PLASMA-T2119
     */
    abstract fun testWheelH1LeftAlignLabelHasInfiniteScrollWheelCount2Divider()

    /**
     * PLASMA-T2120
     */
    abstract fun testWheelCenterAlignDescriptionHasControlsWheelCount2Dots()

    /**
     * PLASMA-T2121
     */
    abstract fun testwheelH1RightAlignLabelTAHasControlsWheelCount1()

    /**
     * PLASMA-T2122
     */
    abstract fun testWheelCenterAlignHasInfiniteScrollWheelCount4EntriesCount0()

    /**
     * PLASMA-T2123
     */
    abstract fun testWheelH1CenterAlignLabelsHasInfiniteScrollWheelCount3()

    fun ComponentScope.wheelH1MixedAlignLabelHasControlsWheelCount3(style: Int): Wheel =
        wheel(
            context = context,
            style = style,
            WheelUiState(
                variant = "",
                itemLabel = "Label",
                itemTextAfter = "",
                description = "description",
                hasControls = true,
                wheelCount = 3,
                visibleItemsCount = 5,
                separatorType = WheelSeparatorType.NONE,
                hasInfiniteScroll = false,
            ),
        ).apply { id = R.id.wheel }

    fun ComponentScope.wheelH1LeftAlignLabelHasInfiniteScrollWheelCount2Divider(style: Int): Wheel =
        wheel(
            context = context,
            style = style,
            WheelUiState(
                variant = "",
                itemLabel = "Label",
                itemTextAfter = "TA",
                description = "description",
                hasControls = true,
                wheelCount = 2,
                visibleItemsCount = 9,
                separatorType = WheelSeparatorType.DIVIDER,
                hasInfiniteScroll = true,
            ),
        ).apply { id = R.id.wheel }

    fun ComponentScope.wheelCenterAlignDescriptionHasControlsWheelCount2Dots(style: Int): Wheel =
        wheel(
            context = context,
            style = style,
            WheelUiState(
                variant = "",
                itemLabel = "",
                itemTextAfter = "TA",
                description = "description",
                hasControls = true,
                wheelCount = 2,
                visibleItemsCount = 1,
                separatorType = WheelSeparatorType.DOTS,
                hasInfiniteScroll = false,
            ),
        ).apply { id = R.id.wheel }

    fun ComponentScope.wheelH1RightAlignLabelTAHasControlsWheelCount1(style: Int): Wheel =
        wheel(
            context = context,
            style = style,
            WheelUiState(
                variant = "",
                itemLabel = "Label",
                itemTextAfter = "TA",
                description = "",
                hasControls = true,
                wheelCount = 1,
                visibleItemsCount = 2,
                separatorType = WheelSeparatorType.NONE,
                hasInfiniteScroll = false,
            ),
        ).apply { id = R.id.wheel }

    fun ComponentScope.wheelCenterAlignHasInfiniteScrollWheelCount4EntriesCount0(style: Int): Wheel =
        wheel(
            context = context,
            style = style,
            WheelUiState(
                variant = "",
                itemLabel = "Label",
                itemTextAfter = "",
                description = "description",
                hasControls = false,
                wheelCount = 4,
                visibleItemsCount = 0,
                separatorType = WheelSeparatorType.DOTS,
                hasInfiniteScroll = true,
            ),
        ).apply { id = R.id.wheel }

    fun ComponentScope.wheelH1CenterAlignLabelsHasInfiniteScrollWheelCount3(style: Int): Wheel =
        wheel(
            context = context,
            style = style,
            WheelUiState(
                variant = "",
                itemLabel = "Label",
                itemTextAfter = "",
                description = "description",
                hasControls = true,
                wheelCount = 3,
                visibleItemsCount = 0,
                separatorType = WheelSeparatorType.DIVIDER,
                hasInfiniteScroll = true,
            ),
        ).apply { id = R.id.wheel }
}
