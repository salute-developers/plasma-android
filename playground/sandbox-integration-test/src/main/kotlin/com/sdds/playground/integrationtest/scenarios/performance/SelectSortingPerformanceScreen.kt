package com.sdds.playground.integrationtest.scenarios.performance

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.Select
import com.sdds.compose.uikit.SelectButton
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.testtags.PerformanceScenarioTags
import com.sdds.serv.styles.select.M
import com.sdds.serv.styles.select.SelectSingleNormal

private val sortOptions = listOf(
    "Recommended",
    "Newest first",
    "Price: low to high",
    "Price: high to low",
    "Most popular",
    "Highest rated",
    "Available today",
    "Nearest first",
)
private const val TARGET_SORT_INDEX = 1

/** A deterministic user flow that chooses one sorting option from a Select. */
@Composable
internal fun SelectSortingPerformanceScreen() {
    val selectState = remember { SelectState() }
    var selectedOption by remember { mutableStateOf(sortOptions.first()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
    ) {
        Text(text = "Catalog sorting")
        Select(
            modifier = Modifier.fillMaxWidth(),
            style = SelectSingleNormal.M.style(),
            state = selectState,
            trigger = {
                SelectButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag(PerformanceScenarioTags.SELECT_TRIGGER),
                    label = selectedOption,
                )
            },
            listContent = {
                itemsIndexed(
                    items = sortOptions,
                    key = { _, option -> option },
                ) { index, option ->
                    SelectItem(
                        modifier = Modifier
                            .fillMaxWidth()
                            .semantics { testTagsAsResourceId = true }
                            .then(
                                if (index == TARGET_SORT_INDEX) {
                                    Modifier.testTag(PerformanceScenarioTags.SELECT_TARGET_ITEM)
                                } else {
                                    Modifier
                                },
                            ),
                        checked = selectedOption == option,
                        onClick = {
                            selectedOption = option
                            selectState.close()
                        },
                    ) {
                        Cell(
                            title = AnnotatedString(option),
                            disclosureIconRes = null,
                        )
                    }
                }
            },
        )
        Text(
            text = "Selected: $selectedOption",
            modifier = Modifier.then(
                if (selectedOption == sortOptions[TARGET_SORT_INDEX]) {
                    Modifier.testTag(PerformanceScenarioTags.SELECT_RESULT)
                } else {
                    Modifier
                },
            ),
        )
    }
}
