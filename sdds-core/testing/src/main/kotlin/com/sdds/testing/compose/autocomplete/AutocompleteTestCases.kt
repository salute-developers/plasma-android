package com.sdds.testing.compose.autocomplete

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Autocomplete
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.DropdownProperties
import com.sdds.compose.uikit.DropdownScope
import com.sdds.compose.uikit.EmptyState
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.fs.FocusSelectorSettings

/**
 * Тест-кейсы для компонента [Autocomplete]
 */

/**
 * PLASMA-T2427
 */
@Composable
fun AutoCompleteLoadingTopStart(
    style: AutocompleteStyle,
    spinnerStyle: SpinnerStyle,
) {
    CommonAutocompleteForTest(
        alignment = Alignment.TopStart,
        style = style,
        loadingComponent = { Loading(spinnerStyle = spinnerStyle) },
    )
}

/**
 * PLASMA-T2428
 */
@Composable
fun AutoCompleteEmptyStateCenterStart(style: AutocompleteStyle) {
    CommonAutocompleteForTest(
        alignment = Alignment.CenterStart,
        style = style,
        emptyState = {
            EmptyState(
                iconRes = com.sdds.icons.R.drawable.ic_plasma_36,
                description = "Empty State",
                buttonLabel = "Action",
            )
        },
    )
}

/**
 * PLASMA-T2429
 */
@Composable
fun AutoCompleteBottomStart(style: AutocompleteStyle) {
    CommonAutocompleteForTest(
        alignment = Alignment.BottomStart,
        style = style,
        placementMode = PopoverPlacementMode.Loose,
    )
}

/**
 * PLASMA-T2430
 */
@Composable
fun AutoCompleteTopCenter(style: AutocompleteStyle) {
    CommonAutocompleteForTest(
        alignment = Alignment.TopCenter,
        style = style,
    )
}

/**
 * PLASMA-T2431
 */
@Composable
fun AutoCompleteCenter(style: AutocompleteStyle) {
    CommonAutocompleteForTest(
        alignment = Alignment.Center,
        style = style,
    )
}

/**
 * PLASMA-T2432
 */
@Composable
fun AutoCompleteBottomCenter(style: AutocompleteStyle) {
    CommonAutocompleteForTest(
        alignment = Alignment.BottomCenter,
        style = style,
        emptyState = null,
    )
}

/**
 * PLASMA-T2433
 */
@Composable
fun AutoCompleteTopEnd(style: AutocompleteStyle) {
    CommonAutocompleteForTest(
        alignment = Alignment.TopEnd,
        style = style,
    )
}

/**
 * PLASMA-T2434
 */
@Composable
fun AutoCompleteCenterEnd(style: AutocompleteStyle) {
    CommonAutocompleteForTest(
        alignment = Alignment.CenterEnd,
        style = style,
    )
}

/**
 * PLASMA-T2435
 */
@Composable
fun AutoCompleteBottomEnd(style: AutocompleteStyle) {
    CommonAutocompleteForTest(
        alignment = Alignment.BottomEnd,
        style = style,
    )
}

/**
 * Общий autocomplete для тестов
 */
@Composable
private fun CommonAutocompleteForTest(
    alignment: Alignment,
    style: AutocompleteStyle,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Strict,
    loadingComponent: @Composable (() -> Unit)? = null,
    emptyState: @Composable (DropdownScope.() -> Unit)? = null,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        var showDropdown by remember { mutableStateOf(false) }
        var text by remember { mutableStateOf(TextFieldValue()) }
        val textFieldInteractionSource = remember { MutableInteractionSource() }
        val filteredList =
            remember {
                mutableListOf<String>().apply {
                    addAll(
                        AutocompleteSuggestions.filterSuggestions(text.text),
                    )
                }
            }
        val showEmptyState = emptyState != null && filteredList.isEmpty()

        Autocomplete(
            modifier = Modifier
                .align(alignment)
                .testTag("Autocomplete"),
            showDropdown = showDropdown,
            dropdownProperties = DropdownProperties(placementMode = placementMode),
            onDismissRequest = { showDropdown = false },
            style = style,
            field = {
                TextFieldForTest(
                    text = text,
                    onValueChange = {
                        text = it
                        filteredList.clear()
                        filteredList.addAll(AutocompleteSuggestions.filterSuggestions(text.text))
                        showDropdown = filteredList.isNotEmpty() || emptyState != null
                    },
                    interactionSource = textFieldInteractionSource,
                )
            },
            showEmptyState = showEmptyState,
            emptyState = emptyState,
            footer = loadingComponent,
        ) {
            items(filteredList.size) { index ->
                DropdownForTest(
                    text = filteredList[index],
                    modifier = Modifier.testTag("DropdownItem_$index"),
                ) {
                    text = TextFieldValue(
                        text = filteredList[index],
                        selection = TextRange(filteredList[index].length),
                    )
                    showDropdown = false
                }
            }
        }
    }
}

@Composable
private fun TextFieldForTest(
    text: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    interactionSource: MutableInteractionSource,
    modifier: Modifier = Modifier,
) {
    TextField(
        modifier = Modifier.width(240.dp),
        value = text,
        placeholderText = "Сотрудник",
        captionText = "Введите имя Алексей",
        onValueChange = onValueChange,
        endContent = {
            Icon(painter = painterResource(com.sdds.icons.R.drawable.ic_search_24), "")
        },
        focusSelectorSettings = FocusSelectorSettings.None,
        interactionSource = interactionSource,
    )
}

@Composable
private fun DropdownForTest(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    ListItem(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() },
            ) { onClick() },
        text = text,
    )
}

private val AutocompleteSuggestions = setOf(
    "Иван Иванов",
    "Пётр Петров",
    "Сергей Сергеев",
    "Алексей Алексеев",
    "Анна Смирнова",
    "Мария Кузнецова",
    "Дмитрий Попов",
    "Елена Соколова",
    "Ольга Морозова",
    "Николай Волков",
)

private fun Set<String>.filterSuggestions(text: String): List<String> {
    return this.filter { suggestion -> suggestion.contains(text, ignoreCase = true) }
}

@Composable
private fun Loading(
    label: String = "Загрузка",
    spinnerStyle: SpinnerStyle,
) {
    Row(
        modifier = Modifier.height(40.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Spinner(style = spinnerStyle)
        Text(
            modifier = Modifier.padding(start = 4.dp),
            text = label,
        )
    }
}
