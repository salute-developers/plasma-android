package com.sdds.playground.integrationtest.scenarios.performance

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.Wheel
import com.sdds.compose.uikit.WheelDataSet
import com.sdds.compose.uikit.WheelItemData
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.HalfExpandedSettings
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.testtags.PerformanceScenarioTags
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import kotlinx.coroutines.launch
import com.sdds.serv.styles.bottomsheet.Default as BottomSheetDefault
import com.sdds.serv.styles.bottomsheet.ModalBottomSheet as ServModalBottomSheet

private val wheelItems = List(100) { index -> WheelItemData(text = "Item ${index + 1}") }

/** A deterministic BottomSheet containing a one-column Wheel with 100 items. */
@Composable
internal fun BottomSheetWheelPerformanceScreen() {
    val sheetState = rememberModalBottomSheetState(
        initialValue = BottomSheetValue.Hidden,
        halfExpandedSettings = HalfExpandedSettings.Skip,
    )
    val scope = rememberCoroutineScope()
    val wheelStyle = performanceWheelStyle()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(16.dp)
            .semantics { testTagsAsResourceId = true },
        contentAlignment = Alignment.Center,
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .testTag(PerformanceScenarioTags.BOTTOM_SHEET_OPEN_BUTTON),
            style = BasicButton.M.Default.style(),
            label = "Open BottomSheet with Wheel",
            onClick = { scope.launch { sheetState.show() } },
        )

        ModalBottomSheet(
            style = ServModalBottomSheet.BottomSheetDefault.style(),
            sheetState = sheetState,
            sheetGesturesEnabled = false,
            handlePlacement = BottomSheetHandlePlacement.Inner,
            edgeToEdge = false,
            fitContent = true,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .navigationBarsPadding()
                    .semantics { testTagsAsResourceId = true }
                    .testTag(PerformanceScenarioTags.BOTTOM_SHEET_CONTENT),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Wheel(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(260.dp)
                        .testTag(PerformanceScenarioTags.BOTTOM_SHEET_WHEEL),
                    style = wheelStyle,
                    wheelCount = 1,
                    visibleItemsCount = 5,
                    hasControls = false,
                ) {
                    WheelDataSet(
                        dataSet = wheelItems,
                        initialIndex = wheelItems.size / 2,
                        description = "100 deterministic items",
                    )
                }
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag(PerformanceScenarioTags.BOTTOM_SHEET_CLOSE_BUTTON),
                    style = BasicButton.M.Default.style(),
                    label = "Close BottomSheet",
                    onClick = { scope.launch { sheetState.hide() } },
                )
            }
        }
    }
}

@Composable
private fun performanceWheelStyle(): WheelStyle = WheelStyle.builder()
    .wheelCount(1)
    .visibleItemsCount(5)
    .itemTextStyle(TextStyle(fontSize = 18.sp))
    .descriptionStyle(TextStyle(fontSize = 14.sp))
    .selectionIndicatorEnabled(true)
    .selectionIndicatorShape(RoundedCornerShape(12.dp))
    .colors {
        itemTextColor(Color.Black)
        descriptionColor(Color.DarkGray)
        selectionIndicatorColor(Color(0xFFE8E8E8))
    }
    .dimensions {
        itemMinSpacing(12.dp)
        descriptionPadding(8.dp)
        selectionIndicatorPaddingStart(8.dp)
        selectionIndicatorPaddingEnd(8.dp)
    }
    .style()
