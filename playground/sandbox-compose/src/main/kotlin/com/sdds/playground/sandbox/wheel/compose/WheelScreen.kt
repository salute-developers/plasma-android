package com.sdds.playground.sandbox.wheel.compose

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.DataEdgePlacement
import com.sdds.compose.uikit.Wheel
import com.sdds.compose.uikit.WheelAlignment
import com.sdds.compose.uikit.WheelDataSet
import com.sdds.compose.uikit.WheelItemData
import com.sdds.compose.uikit.WheelSeparator
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.stylessalute.styles.divider.Default
import com.sdds.stylessalute.styles.divider.Divider

/**
 * Экран с компонентом [Wheel]
 */
@Composable
internal fun WheelScreen(componentKey: ComponentKey = ComponentKey.Wheel) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<WheelViewModel>(
            factory = WheelViewModelFactory(
                defaultState = WheelUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { wheelUiState, style ->
            Wheel(
                modifier = Modifier,
                style = style,
                hasControls = wheelUiState.hasControls,
                wheelCount = wheelUiState.wheelCount,
                visibleItemsCount = wheelUiState.visibleItemsCount,
                wheelSeparator = wheelUiState.separatorType,
                onItemSelected = { wheelIndex, itemIndex ->
                    println("item selected: $itemIndex in wheel $wheelIndex")
                },
            ) { wheelIndex ->
                WheelDataSet(
                    dataSet = List(10) {
                        WheelItemData(
                            text = "${wheelUiState.itemLabel}$wheelIndex",
                            textAfter = wheelUiState.itemTextAfter,
                        )
                    },
                    description = wheelUiState.description,
                )
            }
        },
    )
}

@Composable
internal fun WheelPreview(style: WheelStyle) {
    Wheel(
        style = style,
        hasControls = true,
        wheelCount = 1,
        visibleItemsCount = 3,
        wheelSeparator = WheelSeparator.None,
    ) { wheelIndex ->
        WheelDataSet(
            List(20) {
                WheelItemData(
                    "Label",
                    "TA",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun WheelTest() {
    Wheel(
        modifier = Modifier,
        style = WheelStyle.builder()
            .wheelCount(3)
            .dividerStyle(Divider.Default.style())
            .visibleItemsCount(5)
            .itemAlignment(WheelAlignment.Mixed)
            .controlIconUp(com.sdds.icons.R.drawable.ic_disclosure_up_fill_36)
            .controlIconDown(com.sdds.icons.R.drawable.ic_disclosure_down_fill_36)
            .colors {
                controlIconUpColor(Color.Red)
                controlIconDownColor(Color.Blue)
            }
            .style(),
        dataEdgePlacement = DataEdgePlacement.WheelCenter,
        hasControls = true,
        wheelSeparator = WheelSeparator.Divider,
        onItemSelected = { wheelIndex, index ->
            Log.d("testtag", "Selected on wheel $wheelIndex at index $index")
        },
    ) { wheelIndex ->
        WheelDataSet(
            dataSet = listOf(
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("LabelLong$wheelIndex", textAfter = "ta$wheelIndex"),
                WheelItemData("Label$wheelIndex", textAfter = "ta$wheelIndex"),
            ),
            description = "description$wheelIndex",
            initialIndex = 0,
        )
    }
}
