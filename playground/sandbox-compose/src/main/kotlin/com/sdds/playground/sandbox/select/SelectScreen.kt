package com.sdds.playground.sandbox.select

import android.util.Log
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.EmptyState
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Select
import com.sdds.compose.uikit.SelectButton
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectItemType
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.SelectTextField
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.rememberSelectMultipleDataStateManager
import com.sdds.compose.uikit.rememberSelectSingleDataStateManager
import com.sdds.icons.R
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с компонентом [Select]
 */
@Composable
@Suppress("LongMethod")
internal fun SelectScreen(componentKey: ComponentKey = ComponentKey.Select) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<SelectViewModel>(
            factory = SelectViewModelFactory(SelectUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { selectUiState, style ->
            Box(
                modifier = Modifier.fillMaxSize(),
            ) {
                val state = remember(selectUiState) { SelectState() }
                val itemType = style.selectItemStyle.itemType
                val stateManager = if (itemType == SelectItemType.Multiple) {
                    rememberSelectMultipleDataStateManager(SelectList)
                } else {
                    rememberSelectSingleDataStateManager(SelectList)
                }

                Select(
                    modifier = Modifier.align(selectUiState.triggerAlignment.alignment),
                    state = state,
                    style = style,
                    enabled = selectUiState.enabled,
                    readOnly = selectUiState.readOnly,
                    dropdownProperties = selectUiState.dropdownProperties,
                    trigger = {
                        when (selectUiState.triggerType) {
                            TriggerType.TextField -> {
                                SelectTextField(
                                    modifier = Modifier.width(260.dp),
                                    value = getTextFieldValue(itemType, stateManager.selectedItems),
                                    readOnly = selectUiState.readOnly,
                                    enabled = selectUiState.enabled,
                                    placeholderText = "Сотрудник",
                                    captionText = "Выберите имя",
                                    iconOpened = com.sdds.icons.R.drawable.ic_chevron_up_24,
                                    iconClosed = com.sdds.icons.R.drawable.ic_chevron_down_24,
                                    chipsContent = getChipsContent(itemType, stateManager.selectedItems),
                                    startContent = {
                                        Icon(
                                            painterResource(R.drawable.ic_search_24),
                                            "",
                                        )
                                    },
                                )
                            }
                            TriggerType.Button -> {
                                SelectButton(
                                    modifier = Modifier.width(260.dp),
                                    label = getButtonValue(itemType, stateManager.selectedItems),
                                    readonly = selectUiState.readOnly,
                                    enabled = selectUiState.enabled,
                                    iconOpened = com.sdds.icons.R.drawable.ic_chevron_up_24,
                                    iconClosed = com.sdds.icons.R.drawable.ic_chevron_down_24,
                                )
                            }
                        }
                    },
                    showEmptyState = selectUiState.showEmptyState,
                    emptyState = {
                        EmptyState(
                            iconRes = R.drawable.ic_plasma_36,
                            description = "Empty State",
                            buttonLabel = "Action",
                        )
                    },
                    footer = if (selectUiState.showLoading) {
                        { Loading() }
                    } else {
                        null
                    },
                    listContent = {
                        items(SelectList.size) {
                            SelectItem(
                                modifier = Modifier.fillMaxWidth(),
                                checked = stateManager.isSelected(SelectList[it]),
                                onClick = {
                                    Log.d("Select", "Item $it was selected")
                                    stateManager.onItemPressed(SelectList[it])
                                },
                            ) {
                                Cell(
                                    title = AnnotatedString(SelectList[it]),
                                    disclosureIconRes = null,
                                )
                            }
                        }
                    },
                )
            }
        },
    )
}

@Composable
internal fun SelectPreview(style: SelectStyle) {
    var state by remember { mutableStateOf(SelectState()) }
    val stateManager = rememberSelectSingleDataStateManager(SelectList, SelectList[1])
    Select(
        style = style,
        state = state,
        trigger = {
            SelectButton(
                modifier = Modifier.width(260.dp),
                label = getButtonValue(SelectItemType.Single, stateManager.selectedItems),
                iconOpened = com.sdds.icons.R.drawable.ic_chevron_up_24,
                iconClosed = com.sdds.icons.R.drawable.ic_chevron_down_24,
            )
        },
        listContent = {
            items(SelectList.size) {
                SelectItem(
                    modifier = Modifier.fillMaxWidth(),
                    checked = stateManager.isSelected(SelectList[it]),
                    onClick = {
                        Log.d("Select", "Item $it was selected")
                        stateManager.onItemPressed(SelectList[it])
                    },
                ) {
                    Cell(
                        title = AnnotatedString(SelectList[it]),
                        disclosureIconRes = null,
                    )
                }
            }
        },
    )
}

private fun getChipsContent(
    selectItemType: SelectItemType,
    selectedItems: List<String>,
): (@Composable () -> Unit)? {
    return if (selectItemType == SelectItemType.Multiple && selectedItems.isNotEmpty()) {
        {
            selectedItems.forEach { Chip(label = it) }
        }
    } else {
        null
    }
}

private fun getTextFieldValue(
    selectItemType: SelectItemType,
    selectedItems: List<String>,
): String {
    return if (selectItemType == SelectItemType.Multiple) {
        ""
    } else {
        selectedItems.firstOrNull() ?: ""
    }
}

private fun getButtonValue(
    selectItemType: SelectItemType,
    selectedItems: List<String>,
): String {
    return if (selectItemType == SelectItemType.Multiple) {
        selectedItems.joinToString(", ").ifEmpty { "Value" }
    } else {
        selectedItems.firstOrNull() ?: "Value"
    }
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
            text = label,
        )
    }
}

private val SelectList = listOf(
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
