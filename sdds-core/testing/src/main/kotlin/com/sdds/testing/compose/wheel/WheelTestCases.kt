package com.sdds.testing.compose.wheel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import com.sdds.compose.uikit.DataEdgePlacement
import com.sdds.compose.uikit.Wheel
import com.sdds.compose.uikit.WheelAlignment
import com.sdds.compose.uikit.WheelDataSet
import com.sdds.compose.uikit.WheelItemData
import com.sdds.compose.uikit.WheelSeparator
import com.sdds.compose.uikit.WheelStyle

/**
 * Тест-кейсы для компонента [Wheel]
 */

/**
 * PLASMA-T2118
 */
@Composable
fun WheelThreeVisibleEntriesFiveLabelHasControls(style: WheelStyle) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Wheel(
            style = style,
            wheelCount = 3,
            hasControls = true,
            visibleItemsCount = 5,
            wheelSeparator = WheelSeparator.None,
            alignment = WheelAlignment.Mixed,
            dataEdgePlacement = DataEdgePlacement.WheelEdge,
            onItemSelected = { wheelIndex, index -> },
            modifier = Modifier
                .semantics(mergeDescendants = false) {
                    testTag = "wheel"
                }
                .align(Alignment.Center),
        ) { wheelIndex ->
            WheelDataSet(
                dataSet = listOf(
                    WheelItemData("Label$wheelIndex"),
                    WheelItemData("Label2"),
                    WheelItemData("Label3"),
                    WheelItemData("Label4"),
                    WheelItemData("Label5"),
                    WheelItemData("Label6"),
                    WheelItemData("Label7"),
                    WheelItemData("Label8"),
                    WheelItemData("Label9"),
                ),
                description = "",
                initialIndex = 1,
            )
        }
    }
}

/**
 * PLASMA-T2119
 */
@Composable
fun WheelTwoVisibleEntriesNineTADivider(style: WheelStyle) {
    Box {
        Wheel(
            style = style,
            wheelCount = 2,
            hasControls = true,
            visibleItemsCount = 9,
            wheelSeparator = WheelSeparator.Divider,
            alignment = WheelAlignment.Start,
            dataEdgePlacement = DataEdgePlacement.WheelEdge,
            onItemSelected = { wheelIndex, index -> },
            modifier = Modifier.semantics {
                testTag = "wheel"
            },
        ) {
            WheelDataSet(
                dataSet = listOf(
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                ),
                description = "",
                initialIndex = 1,
            )
        }
    }
}

/**
 * PLASMA-T2120
 */
@Composable
fun WheelTwoVisibleEntriesOneDescriptionDots(style: WheelStyle) {
    Box {
        Wheel(
            style = style,
            wheelCount = 2,
            hasControls = true,
            visibleItemsCount = 1,
            wheelSeparator = WheelSeparator.Dots,
            alignment = WheelAlignment.Center,
            dataEdgePlacement = DataEdgePlacement.WheelEdge,
            onItemSelected = { wheelIndex, index -> },
            modifier = Modifier.semantics {
                testTag = "wheel"
            },
        ) {
            WheelDataSet(
                dataSet = listOf(
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                ),
                description = "Description",
                initialIndex = 1,
            )
        }
    }
}

/**
 * PLASMA-T2121
 */
@Composable
fun WheelCountOneSeparatorNone(style: WheelStyle) {
    Box {
        Wheel(
            style = style,
            wheelCount = 1,
            hasControls = true,
            visibleItemsCount = 1,
            wheelSeparator = WheelSeparator.None,
            alignment = WheelAlignment.End,
            dataEdgePlacement = DataEdgePlacement.WheelEdge,
            onItemSelected = { wheelIndex, index -> },
            modifier = Modifier.semantics {
                testTag = "wheel"
            },
        ) {
            WheelDataSet(
                dataSet = listOf(
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                    WheelItemData("Label", "TA"),
                ),
                description = "",
                initialIndex = 1,
            )
        }
    }
}

/**
 * PLASMA-T2122
 */
@Composable
fun WheelCountFourDescriptionDots(style: WheelStyle) {
    Box {
        Wheel(
            style = style,
            wheelCount = 4,
            hasControls = false,
            visibleItemsCount = 1,
            wheelSeparator = WheelSeparator.Dots,
            alignment = WheelAlignment.Center,
            dataEdgePlacement = DataEdgePlacement.WheelEdge,
            onItemSelected = { wheelIndex, index -> },
            modifier = Modifier.semantics {
                testTag = "wheel"
            },
        ) {
            WheelDataSet(
                dataSet = listOf(
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                ),
                description = "Description",
                initialIndex = 1,
            )
        }
    }
}

/**
 * PLASMA-T2123
 */
@Composable
fun WheelCountThreeDescriptionDivider(style: WheelStyle) {
    Box {
        Wheel(
            style = style,
            wheelCount = 3,
            hasControls = true,
            visibleItemsCount = 1,
            wheelSeparator = WheelSeparator.Divider,
            alignment = WheelAlignment.Center,
            dataEdgePlacement = DataEdgePlacement.WheelEdge,
            onItemSelected = { wheelIndex, index -> },
            modifier = Modifier.semantics {
                testTag = "wheel"
            },
        ) {
            WheelDataSet(
                dataSet = listOf(
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                    WheelItemData("Label"),
                ),
                description = "Description",
                initialIndex = 1,
            )
        }
    }
}
