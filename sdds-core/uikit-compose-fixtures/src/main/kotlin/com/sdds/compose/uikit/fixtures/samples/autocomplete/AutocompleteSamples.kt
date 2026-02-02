package com.sdds.compose.uikit.fixtures.samples.autocomplete

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Autocomplete
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.EmptyState
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = false)
fun Autocomplete_Style() {
    composableCodeSnippet {
        AutocompleteStyle.builder()
            .textFieldStyle(placeholder(TextFieldStyle.builder().style(), "/** Стиль компонента */"))
            .dropdownStyle(placeholder(DropdownMenuStyle.builder().style(), "/** Стиль компонента */"))
            .style()
    }
}

@Composable
@DocSample
fun Autocomplete_Simple() {
    composableCodeSnippet {
        var text by remember { mutableStateOf(TextFieldValue()) }
        var showDropdown by remember { mutableStateOf(false) }
        val filteredList = AutocompleteSuggestions.filterSuggestions(text.text)
        val showEmptyState = filteredList.isEmpty()
        Autocomplete(
            showDropdown = showDropdown,
            onDismissRequest = { showDropdown = false },
            field = {
                TextField(
                    modifier = Modifier.width(240.dp),
                    value = text,
                    placeholderText = "Сотрудник",
                    captionText = "Введите имя",
                    onValueChange = {
                        text = it
                        showDropdown = true
                    },
                    focusSelectorSettings = FocusSelectorSettings.None,
                )
            },
            showEmptyState = showEmptyState,
            emptyState = {
                EmptyState(
                    iconRes = com.sdds.icons.R.drawable.ic_plasma_36,
                    description = "Empty State",
                    buttonLabel = "Action",
                )
            },
            footer = { Loading() },
            listContent = {
                items(filteredList.size) { index ->
                    ListItem(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable(
                                indication = null,
                                interactionSource = remember { MutableInteractionSource() },
                            ) {
                                text = TextFieldValue(
                                    text = filteredList[index],
                                    selection = TextRange(filteredList[index].length),
                                )
                                showDropdown = false
                            },
                        text = filteredList[index],
                    )
                }
            },
        )
    }
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
) {
    Row(
        modifier = Modifier.height(40.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Spinner()
        Text(
            modifier = Modifier.padding(start = 4.dp),
            text = "Загрузка",
        )
    }
}
