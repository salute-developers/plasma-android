package com.sdds.playground.integrationtest.scenarios.performance

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.items
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
import com.sdds.compose.uikit.ComboBox
import com.sdds.compose.uikit.ComboBoxTextField
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.style.style
import com.sdds.playground.integrationtest.testtags.PerformanceScenarioTags
import com.sdds.serv.styles.combobox.ComboBoxSingleNormal
import com.sdds.serv.styles.combobox.M

private val cityOptions = listOf(
    "Amsterdam",
    "Berlin",
    "Brussels",
    "Copenhagen",
    "Helsinki",
    "Lisbon",
    "London",
    "Madrid",
    "Milan",
    "Moscow",
    "Munich",
    "Oslo",
    "Paris",
    "Prague",
    "Riga",
    "Rome",
    "Stockholm",
    "Tallinn",
    "Vienna",
    "Warsaw",
)
private const val TARGET_CITY = "Moscow"

/** A searchable selection flow that filters a ComboBox and chooses a city. */
@Composable
internal fun ComboBoxSearchPerformanceScreen() {
    val comboBoxState = remember { SelectState() }
    var query by remember { mutableStateOf("") }
    var selectedCity by remember { mutableStateOf<String?>(null) }
    val filteredCities = remember(query) {
        cityOptions.filter { city -> city.contains(query, ignoreCase = true) }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
    ) {
        Text(text = "Delivery city")
        ComboBox(
            modifier = Modifier.fillMaxWidth(),
            style = ComboBoxSingleNormal.M.style(),
            state = comboBoxState,
            trigger = {
                ComboBoxTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag(PerformanceScenarioTags.COMBOBOX_INPUT),
                    value = query,
                    onValueChange = { value ->
                        query = value
                        selectedCity = null
                    },
                    placeholderText = "Enter a city",
                    captionText = "Type 'mos' and choose a result",
                    focusSelectorSettings = FocusSelectorSettings.None,
                )
            },
            showEmptyState = filteredCities.isEmpty(),
            listContent = {
                items(
                    items = filteredCities,
                    key = { city -> city },
                ) { city ->
                    SelectItem(
                        modifier = Modifier
                            .fillMaxWidth()
                            .semantics { testTagsAsResourceId = true }
                            .then(
                                if (city == TARGET_CITY) {
                                    Modifier.testTag(PerformanceScenarioTags.COMBOBOX_TARGET_ITEM)
                                } else {
                                    Modifier
                                },
                            ),
                        checked = selectedCity == city,
                        onClick = {
                            selectedCity = city
                            query = city
                            comboBoxState.close()
                        },
                    ) {
                        Cell(
                            title = AnnotatedString(city),
                            disclosureIconRes = null,
                        )
                    }
                }
            },
        )
        Text(
            text = selectedCity?.let { "Selected: $it" } ?: "City is not selected",
            modifier = Modifier.then(
                if (selectedCity == TARGET_CITY) {
                    Modifier.testTag(PerformanceScenarioTags.COMBOBOX_RESULT)
                } else {
                    Modifier
                },
            ),
        )
    }
}
