package com.sdds.compose.uikit.fixtures.samples.combobox

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ComboBox
import com.sdds.compose.uikit.ComboBoxStyle
import com.sdds.compose.uikit.ComboBoxTextField
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.EmptyState
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.rememberSelectMultipleDataStateManager
import com.sdds.compose.uikit.rememberSelectSingleDataStateManager
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = false)
fun ComboBox_Single() {
    composableCodeSnippet {
        val comboBoxList = comboBoxSampleList()
        val state = remember { SelectState(initialState = true) }
        val checkedStateManager = rememberSelectSingleDataStateManager(comboBoxList)
        var value by remember { mutableStateOf("") }
        val filteredList = remember(value, state.isOpened) {
            comboBoxList.filteredBy(value, state.isOpened)
        }

        ComboBox(
            state = state,
            trigger = {
                ComboBoxTextField(
                    modifier = Modifier.width(260.dp),
                    value = value,
                    onValueChange = { value = it },
                    placeholderText = if (value.isEmpty()) "Сотрудник" else null,
                    captionText = "Введите или выберите имя",
                    iconOpened = R.drawable.ic_chevron_up_24,
                    iconClosed = R.drawable.ic_chevron_down_24,
                    startContent = {
                        Icon(
                            painterResource(R.drawable.ic_search_24),
                            "",
                        )
                    },
                )
            },
            showEmptyState = filteredList.isEmpty(),
            emptyState = {
                EmptyState(
                    iconRes = R.drawable.ic_plasma_36,
                    description = "Empty State",
                )
            },
            listContent = {
                items(filteredList.size) {
                    val item = filteredList[it]
                    SelectItem(
                        modifier = Modifier.fillMaxWidth(),
                        checked = checkedStateManager.isSelected(item),
                        onClick = {
                            checkedStateManager.onItemPressed(item)
                            value = item
                            state.close()
                        },
                    ) {
                        Cell(
                            title = AnnotatedString(item),
                            disclosureIconRes = null,
                        )
                    }
                }
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun ComboBox_Multiple() {
    composableCodeSnippet {
        val comboBoxList = comboBoxSampleList()
        val state = remember { SelectState(initialState = true) }
        val checkedStateManager = rememberSelectMultipleDataStateManager(
            comboBoxList,
            { it == comboBoxList.first() },
        )
        var value by remember { mutableStateOf("") }
        val filteredList = remember(value, state.isOpened) {
            comboBoxList.filteredBy(value, state.isOpened)
        }

        ComboBox(
            state = state,
            trigger = {
                ComboBoxTextField(
                    modifier = Modifier.width(260.dp),
                    value = value,
                    onValueChange = { value = it },
                    placeholderText = if (value.isEmpty()) "Сотрудник" else null,
                    captionText = "Введите или выберите имя",
                    iconOpened = R.drawable.ic_chevron_up_24,
                    iconClosed = R.drawable.ic_chevron_down_24,
                    chipsContent = comboBoxChipsContent(
                        checkedStateManager.selectedItems,
                        checkedStateManager::onItemPressed,
                    ),
                    startContent = {
                        Icon(
                            painterResource(R.drawable.ic_search_24),
                            "",
                        )
                    },
                )
            },
            showEmptyState = filteredList.isEmpty(),
            emptyState = {
                EmptyState(
                    iconRes = R.drawable.ic_plasma_36,
                    description = "Empty State",
                )
            },
            listContent = {
                items(filteredList.size) {
                    val item = filteredList[it]
                    SelectItem(
                        modifier = Modifier.fillMaxWidth(),
                        checked = checkedStateManager.isSelected(item),
                        onClick = {
                            checkedStateManager.onItemPressed(item)
                            value = ""
                        },
                    ) {
                        Cell(
                            title = AnnotatedString(item),
                            disclosureIconRes = null,
                        )
                    }
                }
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun ComboBox_Style() {
    composableCodeSnippet {
        ComboBoxStyle.builder()
            .textFieldStyle(
                placeholder(
                    TextFieldStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .dropdownStyle(
                placeholder(
                    DropdownMenuStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .selectItemStyle(
                placeholder(
                    SelectItemStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .style()
    }
}

private fun comboBoxSampleList(): List<String> {
    return listOf(
        "Иван Иванов",
        "Пётр Петров",
        "Сергей Сергеев",
        "Анна Смирнова",
        "Мария Соколова",
    )
}

private fun List<String>.filteredBy(
    value: String,
    isOpened: Boolean,
): List<String> {
    return if (isOpened && value.isEmpty()) {
        this
    } else {
        filter { it.contains(value, ignoreCase = true) }
    }
}

private fun comboBoxChipsContent(
    selectedItems: List<String>,
    onRemove: (String) -> Unit,
): (@Composable () -> Unit)? {
    return if (selectedItems.isNotEmpty()) {
        {
            selectedItems.forEach { item ->
                Chip(
                    label = item,
                    endContent = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_close_24),
                            contentDescription = "",
                            modifier = Modifier.clickable(
                                indication = null,
                                interactionSource = remember { MutableInteractionSource() },
                            ) {
                                onRemove(item)
                            },
                        )
                    },
                )
            }
        }
    } else {
        null
    }
}
