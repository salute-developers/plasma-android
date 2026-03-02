package com.sdds.compose.uikit.fixtures.samples.select

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Select
import com.sdds.compose.uikit.SelectButton
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.SelectTextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.rememberSelectMultipleDataStateManager
import com.sdds.compose.uikit.rememberSelectSingleDataStateManager
import com.sdds.docs.DocSample
import com.sdds.icons.R
import kotlin.text.ifEmpty

@Composable
@DocSample(needScreenshot = true)
fun Select_MultipleTextFieldLike() {
    composableCodeSnippet {
        val selectList = listOf(
            "Иван Иванов",
            "Пётр Петров",
            "Сергей Сергеев",
        )
        val state = remember { SelectState(initialState = true) }
        val checkedStateManager = rememberSelectMultipleDataStateManager(selectList, { true })

        Select(
            state = state,
            trigger = {
                SelectTextField(
                    modifier = Modifier.width(260.dp),
                    value = "",
                    placeholderText = "Сотрудник",
                    iconOpened = com.sdds.icons.R.drawable.ic_chevron_up_24,
                    iconClosed = com.sdds.icons.R.drawable.ic_chevron_down_24,
                    chipsContent = if (checkedStateManager.selectedItems.isNotEmpty()) {
                        { checkedStateManager.selectedItems.forEach { Chip(label = it) } }
                    } else {
                        null
                    },
                    startContent = {
                        Icon(
                            painterResource(R.drawable.ic_search_24),
                            "",
                        )
                    },
                )
            },
            listContent = {
                items(selectList.size) {
                    SelectItem(
                        modifier = Modifier.fillMaxWidth(),
                        checked = checkedStateManager.isSelected(selectList[it]),
                        onClick = { checkedStateManager.onItemPressed(selectList[it]) },
                    ) {
                        Cell(
                            title = AnnotatedString(selectList[it]),
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
fun Select_SingleTextFieldLike() {
    composableCodeSnippet {
        val selectList = listOf(
            "Иван Иванов",
            "Пётр Петров",
            "Сергей Сергеев",
        )
        val state = remember { SelectState(initialState = true) }
        val checkedStateManager = rememberSelectSingleDataStateManager(selectList, selectList[0])

        Select(
            state = state,
            trigger = {
                SelectTextField(
                    modifier = Modifier.width(260.dp),
                    value = checkedStateManager.selectedItems.firstOrNull().orEmpty(),
                    placeholderText = "Сотрудник",
                    iconOpened = com.sdds.icons.R.drawable.ic_chevron_up_24,
                    iconClosed = com.sdds.icons.R.drawable.ic_chevron_down_24,
                    startContent = {
                        Icon(
                            painterResource(R.drawable.ic_search_24),
                            "",
                        )
                    },
                )
            },
            listContent = {
                items(selectList.size) {
                    SelectItem(
                        modifier = Modifier.fillMaxWidth(),
                        checked = checkedStateManager.isSelected(selectList[it]),
                        onClick = { checkedStateManager.onItemPressed(selectList[it]) },
                    ) {
                        Cell(
                            title = AnnotatedString(selectList[it]),
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
fun Select_SingleButtonLike() {
    composableCodeSnippet {
        val selectList = listOf(
            "Иван Иванов",
            "Пётр Петров",
            "Сергей Сергеев",
        )
        val state = remember { SelectState(initialState = true) }
        val checkedStateManager = rememberSelectSingleDataStateManager(selectList, selectList[0])

        Select(
            state = state,
            trigger = {
                SelectButton(
                    modifier = Modifier.width(260.dp),
                    label = checkedStateManager.selectedItems.firstOrNull() ?: "Value",
                    iconOpened = com.sdds.icons.R.drawable.ic_chevron_up_24,
                    iconClosed = com.sdds.icons.R.drawable.ic_chevron_down_24,
                )
            },
            listContent = {
                items(selectList.size) {
                    SelectItem(
                        modifier = Modifier.fillMaxWidth(),
                        checked = checkedStateManager.isSelected(selectList[it]),
                        onClick = { checkedStateManager.onItemPressed(selectList[it]) },
                    ) {
                        Cell(
                            title = AnnotatedString(selectList[it]),
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
fun Select_MultipleButtonLike() {
    composableCodeSnippet {
        val selectList = listOf(
            "Иван Иванов",
            "Пётр Петров",
            "Сергей Сергеев",
        )
        val state = remember { SelectState(initialState = true) }
        val checkedStateManager = rememberSelectMultipleDataStateManager(
            selectList,
            { true },
        )

        Select(
            state = state,
            trigger = {
                SelectButton(
                    modifier = Modifier.width(260.dp),
                    label = checkedStateManager.selectedItems
                        .joinToString(", ")
                        .ifEmpty { "Value" },
                    iconOpened = com.sdds.icons.R.drawable.ic_chevron_up_24,
                    iconClosed = com.sdds.icons.R.drawable.ic_chevron_down_24,
                )
            },
            listContent = {
                items(selectList.size) {
                    SelectItem(
                        modifier = Modifier.fillMaxWidth(),
                        checked = checkedStateManager.isSelected(selectList[it]),
                        onClick = { checkedStateManager.onItemPressed(selectList[it]) },
                    ) {
                        Cell(
                            title = AnnotatedString(selectList[it]),
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
fun Select_Style() {
    composableCodeSnippet {
        SelectStyle.builder()
            .textFieldStyle(
                placeholder(
                    TextFieldStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .buttonStyle(
                placeholder(
                    ButtonStyle.basicButtonBuilder().style(),
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
