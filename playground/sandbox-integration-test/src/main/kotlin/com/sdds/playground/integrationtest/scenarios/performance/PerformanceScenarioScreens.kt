package com.sdds.playground.integrationtest.scenarios.performance

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.Popover
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.testtags.PerformanceScenarioTags
import com.sdds.serv.styles.basicbutton.BasicButton as BasicButtonStyle
import com.sdds.serv.styles.basicbutton.Default as BasicButtonDefault
import com.sdds.serv.styles.basicbutton.M as BasicButtonM
import com.sdds.serv.styles.cell.Cell as CellStyle
import com.sdds.serv.styles.cell.M as CellM
import com.sdds.serv.styles.checkbox.CheckBox as CheckBoxStyle
import com.sdds.serv.styles.checkbox.Default as CheckBoxDefault
import com.sdds.serv.styles.checkbox.M as CheckBoxM
import com.sdds.serv.styles.popover.Default as PopoverDefault
import com.sdds.serv.styles.popover.M as PopoverM
import com.sdds.serv.styles.popover.Popover as PopoverStyle

private val componentsFeedItems = List(200) { index -> "Feed item ${index + 1}" }
private val massUpdateItems = List(20) { index -> "State item ${index + 1}" }
private val popoverTriggerItems = List(100) { index -> "Popover trigger ${index + 1}" }
private const val BENCHMARK_POPOVER_TRIGGER_COUNT = 5

@Composable
internal fun ComponentsFeedPerformanceScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .testTag(PerformanceScenarioTags.COMPONENTS_FEED),
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        items(
            items = componentsFeedItems,
            key = { it },
        ) { title ->
            Cell(
                modifier = Modifier.fillMaxWidth(),
                style = CellStyle.CellM.style(),
                title = AnnotatedString(title),
                subtitle = AnnotatedString("Fixed benchmark content"),
                disclosureContentEnabled = true,
            )
        }
    }
}

@Composable
internal fun MassStateUpdatePerformanceScreen() {
    var selectedItemIds by remember { mutableStateOf(emptySet<Int>()) }
    val allItemsSelected = selectedItemIds.size == massUpdateItems.size

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .testTag(PerformanceScenarioTags.MASS_UPDATE_BUTTON),
            style = BasicButtonStyle.BasicButtonM.BasicButtonDefault.style(),
            label = if (allItemsSelected) "Clear selection" else "Select all ${massUpdateItems.size} items",
            onClick = {
                selectedItemIds = if (allItemsSelected) {
                    emptySet()
                } else {
                    massUpdateItems.indices.toSet()
                }
            },
        )
        Text(text = "Selected: ${selectedItemIds.size} / ${massUpdateItems.size}")
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .testTag(PerformanceScenarioTags.MASS_UPDATE_CONTENT),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            itemsIndexed(
                items = massUpdateItems,
                key = { index, _ -> index },
            ) { index, title ->
                val selected = index in selectedItemIds
                Cell(
                    modifier = Modifier.fillMaxWidth(),
                    style = CellStyle.CellM.style(),
                    title = AnnotatedString(title),
                    subtitle = AnnotatedString(if (selected) "Selected" else "Not selected"),
                    startContent = {
                        CheckBox(
                            checked = selected,
                            style = CheckBoxStyle.CheckBoxM.CheckBoxDefault.style(),
                        )
                    },
                )
            }
        }
    }
}

@Composable
internal fun PopoverTriggersPerformanceScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .testTag(PerformanceScenarioTags.POPOVER_TRIGGERS_LIST),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        itemsIndexed(
            items = popoverTriggerItems,
            key = { _, title -> title },
        ) { index, title ->
            PopoverTriggerItem(
                title = title,
                benchmarkTriggerNumber = (index + 1)
                    .takeIf { it <= BENCHMARK_POPOVER_TRIGGER_COUNT },
            )
        }
    }
}

@Composable
private fun PopoverTriggerItem(
    title: String,
    benchmarkTriggerNumber: Int?,
) {
    var showPopover by remember { mutableStateOf(false) }
    val triggerInfo = remember { mutableStateOf(TriggerInfo()) }

    Box(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .popoverTrigger(triggerInfo)
                .then(
                    if (benchmarkTriggerNumber != null) {
                        Modifier.testTag(
                            "${PerformanceScenarioTags.POPOVER_TRIGGER_PREFIX}_$benchmarkTriggerNumber",
                        )
                    } else {
                        Modifier
                    },
                ),
            style = BasicButtonStyle.BasicButtonM.BasicButtonDefault.style(),
            label = title,
            onClick = { showPopover = true },
        )

        Popover(
            show = showPopover,
            onDismissRequest = { showPopover = false },
            triggerInfo = triggerInfo.value,
            style = PopoverStyle.PopoverM.PopoverDefault.style(),
            placement = PopoverPlacement.Bottom,
            placementMode = PopoverPlacementMode.Loose,
            alignment = PopoverAlignment.Center,
            duration = null,
        ) {
            Text(
                text = "$title content",
                modifier = Modifier
                    .semantics { testTagsAsResourceId = true }
                    .testTag(PerformanceScenarioTags.POPOVER_CONTENT)
                    .padding(horizontal = 16.dp, vertical = 10.dp),
            )
        }
    }
}
