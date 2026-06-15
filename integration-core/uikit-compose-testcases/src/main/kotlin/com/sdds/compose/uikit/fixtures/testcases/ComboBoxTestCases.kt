package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ComboBox
import com.sdds.compose.uikit.ComboBoxStyle
import com.sdds.compose.uikit.ComboBoxTextField
import com.sdds.compose.uikit.DropdownProperties
import com.sdds.compose.uikit.DropdownScope
import com.sdds.compose.uikit.EmptyState
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fixtures.stories.combobox.ComboBoxTriggerAlignment
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.rememberSelectMultipleDataStateManager
import com.sdds.compose.uikit.rememberSelectSingleDataStateManager
import com.sdds.icons.R

/**
 * Тест-кейсы для [ComboBox]
 */

/**
 * PLASMA-T2643
 */
@Composable
fun ComboBoxSingleNormalTopStartPlacementStartLoose(
    style: ComboBoxStyle,
) {
    ComboBoxCommon(
        style = style,
        selectionMode = ComboBoxSelectionMode.Single,
        triggerAlignment = ComboBoxTriggerAlignment.TopStart,
        placement = PopoverPlacement.Start,
    )
}

/**
 * PLASMA-T2648
 */
@Composable
fun ComboBoxSingleTightTopEndPlacementTopLoose(
    style: ComboBoxStyle,
) {
    ComboBoxCommon(
        style = style,
        selectionMode = ComboBoxSelectionMode.Single,
        triggerAlignment = ComboBoxTriggerAlignment.TopEnd,
        placement = PopoverPlacement.Top,
    )
}

/**
 * PLASMA-T2649
 */
@Composable
fun ComboBoxMultipleNormalTopCenterShowLoadingPlacementEnd(
    style: ComboBoxStyle,
    spinnerStyle: SpinnerStyle,
) {
    ComboBoxCommon(
        style = style,
        selectionMode = ComboBoxSelectionMode.Multiple,
        triggerAlignment = ComboBoxTriggerAlignment.TopCenter,
        placement = PopoverPlacement.End,
        loadingComponent = { Loading(spinnerStyle = spinnerStyle) },
    )
}

/**
 * PLASMA-T2650
 */
@Composable
fun ComboBoxMultipleTightCenterPlacementBottom(
    style: ComboBoxStyle,
) {
    ComboBoxCommon(
        style = style,
        selectionMode = ComboBoxSelectionMode.Multiple,
        triggerAlignment = ComboBoxTriggerAlignment.Center,
        placement = PopoverPlacement.Bottom,
    )
}

/**
 * PLASMA-T2651
 */
@Composable
fun ComboBoxSingleNormalCenterStartPlacementStart(
    style: ComboBoxStyle,
) {
    ComboBoxCommon(
        style = style,
        selectionMode = ComboBoxSelectionMode.Single,
        triggerAlignment = ComboBoxTriggerAlignment.CenterStart,
        placement = PopoverPlacement.Start,
        initialSelectedItems = setOf("Иван Иванов"),
    )
}

/**
 * PLASMA-T2652
 */
@Composable
fun ComboBoxSingleTightCenterEndPlacementTopStrict(
    style: ComboBoxStyle,
) {
    ComboBoxCommon(
        style = style,
        selectionMode = ComboBoxSelectionMode.Single,
        triggerAlignment = ComboBoxTriggerAlignment.CenterEnd,
        placement = PopoverPlacement.Top,
        placementMode = PopoverPlacementMode.Strict,
    )
}

/**
 * PLASMA-T2653
 */
@Composable
fun ComboBoxMultipleNormalBottomStartPlacementEnd(
    style: ComboBoxStyle,
) {
    ComboBoxCommon(
        style = style,
        selectionMode = ComboBoxSelectionMode.Multiple,
        triggerAlignment = ComboBoxTriggerAlignment.BottomStart,
        placement = PopoverPlacement.End,
    )
}

/**
 * PLASMA-T2654
 */
@Composable
fun ComboBoxMultipleTightReadOnly(
    style: ComboBoxStyle,
) {
    ComboBoxCommon(
        style = style,
        selectionMode = ComboBoxSelectionMode.Multiple,
        triggerAlignment = ComboBoxTriggerAlignment.BottomEnd,
        readOnly = true,
        initialSelectedItems = setOf("Иванов Иван", "Пётр Петров", "Сергей Сергеев"),
    )
}

/**
 * PLASMA-T2655
 */
@Composable
fun ComboBoxSingleNormalBottomCenterPlacementStart(
    style: ComboBoxStyle,
) {
    ComboBoxCommon(
        style = style,
        showEmptyState = true,
        selectionMode = ComboBoxSelectionMode.Single,
        triggerAlignment = ComboBoxTriggerAlignment.BottomCenter,
        placement = PopoverPlacement.Start,
    )
}

/**
 * PLASMA-T2677
 */
@Composable
fun ComboBoxDisabled(
    style: ComboBoxStyle,
) {
    ComboBoxCommon(
        style = style,
        enabled = false,
        selectionMode = ComboBoxSelectionMode.Multiple,
        triggerAlignment = ComboBoxTriggerAlignment.TopCenter,
        placement = PopoverPlacement.End,
        initialSelectedItems = setOf("Иванов Иван", "Пётр Петров", "Сергей Сергеев"),
    )
}

/**
 * Общий тест-кейс для ComboBox
 */
@Composable
fun ComboBoxCommon(
    style: ComboBoxStyle,
    selectionMode: ComboBoxSelectionMode,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    showEmptyState: Boolean = false,
    triggerAlignment: ComboBoxTriggerAlignment = ComboBoxTriggerAlignment.TopStart,
    placement: PopoverPlacement = PopoverPlacement.Bottom,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    loadingComponent: @Composable (() -> Unit)? = null,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    initialSelectedItems: Set<String> = emptySet(),
) {
    when (selectionMode) {
        ComboBoxSelectionMode.Single -> ComboBoxCommonSingle(
            style = style,
            enabled = enabled,
            readOnly = readOnly,
            showEmptyState = showEmptyState,
            triggerAlignment = triggerAlignment,
            placement = placement,
            placementMode = placementMode,
            loadingComponent = loadingComponent,
            emptyState = emptyState,
            initiallySelected = initialSelectedItems,
        )

        ComboBoxSelectionMode.Multiple -> ComboBoxCommonMultiple(
            style = style,
            enabled = enabled,
            readOnly = readOnly,
            showEmptyState = showEmptyState,
            triggerAlignment = triggerAlignment,
            placement = placement,
            placementMode = placementMode,
            loadingComponent = loadingComponent,
            emptyState = emptyState,
            initiallySelected = initialSelectedItems,
        )
    }
}

@Composable
private fun ComboBoxCommonSingle(
    style: ComboBoxStyle,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    showEmptyState: Boolean = false,
    triggerAlignment: ComboBoxTriggerAlignment = ComboBoxTriggerAlignment.TopStart,
    placement: PopoverPlacement = PopoverPlacement.Bottom,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    loadingComponent: @Composable (() -> Unit)? = null,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    initiallySelected: Set<String> = emptySet(),
) {
    val comboBoxList = comboBoxSampleList()
    val initialSelectedItem = remember(initiallySelected, comboBoxList) {
        initiallySelected.firstOrNull { it in comboBoxList }
    }
    val state = remember { SelectState(initialState = false) }
    val checkedStateManager =
        rememberSelectSingleDataStateManager(comboBoxList, initialSelectedItem)
    var value by remember(initialSelectedItem) { mutableStateOf(initialSelectedItem.orEmpty()) }
    val filteredList = remember(value, state.isOpened) {
        comboBoxList.filteredBy(value, state.isOpened)
    }
    val dropdownProperties = remember(placement, placementMode) {
        DropdownProperties(placement = placement, placementMode = placementMode)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .align(triggerAlignment.alignment),
        ) {
            ComboBox(
                modifier = Modifier.testTag("comboBoxSingle"),
                style = style,
                state = state,
                enabled = enabled,
                readOnly = readOnly,
                dropdownProperties = dropdownProperties,
                trigger = {
                    ComboBoxTextField(
                        modifier = Modifier
                            .testTag("comboBoxTextField")
                            .width(260.dp),
                        value = value,
                        onValueChange = { value = it },
                        placeholderText = if (value.isEmpty()) "Сотрудник" else null,
                        captionText = "Введите или выберите имя",
                        iconOpened = R.drawable.ic_chevron_up_24,
                        iconClosed = R.drawable.ic_chevron_down_24,
                        focusSelectorSettings = FocusSelectorSettings.None,
                        startContent = {
                            Icon(
                                painterResource(R.drawable.ic_search_24),
                                "",
                            )
                        },
                    )
                },
                showEmptyState = showEmptyState && filteredList.isEmpty(),
                footer = loadingComponent,
                emptyState = emptyState ?: {
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
}

@Composable
private fun ComboBoxCommonMultiple(
    style: ComboBoxStyle,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    showEmptyState: Boolean = false,
    triggerAlignment: ComboBoxTriggerAlignment = ComboBoxTriggerAlignment.TopStart,
    placement: PopoverPlacement = PopoverPlacement.Bottom,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    loadingComponent: @Composable (() -> Unit)? = null,
    initiallySelected: Set<String> = emptySet(),
) {
    val comboBoxList = comboBoxSampleList()
    val state = remember { SelectState(initialState = false) }
    val checkedStateManager = rememberSelectMultipleDataStateManager(
        comboBoxList,
        { item ->
            item in initiallySelected
        },
    )
    var value by remember { mutableStateOf(TextFieldValue()) }
    val filteredList = remember(value.text, state.isOpened) {
        comboBoxList.filteredBy(value.text, state.isOpened)
    }
    val dropdownProperties = remember(placement, placementMode) {
        DropdownProperties(placement = placement, placementMode = placementMode)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.align(triggerAlignment.alignment),
        ) {
            ComboBox(
                modifier = Modifier.testTag("comboBoxMultiple"),
                style = style,
                state = state,
                enabled = enabled,
                readOnly = readOnly,
                dropdownProperties = dropdownProperties,
                trigger = {
                    ComboBoxTextField(
                        modifier = Modifier
                            .testTag("comboBoxTextField")
                            .width(260.dp),
                        value = value,
                        onValueChange = { value = it },
                        placeholderText = "Сотрудник",
                        captionText = "Введите или выберите имя",
                        iconOpened = R.drawable.ic_chevron_up_24,
                        iconClosed = R.drawable.ic_chevron_down_24,
                        focusSelectorSettings = FocusSelectorSettings.None,
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
                showEmptyState = showEmptyState && filteredList.isEmpty(),
                footer = loadingComponent,
                emptyState = emptyState ?: {
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
                                value = TextFieldValue()
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
}

/**
 * Режимы выбора ComboBox
 */
enum class ComboBoxSelectionMode {
    Single, Multiple
}

private fun comboBoxSampleList(): List<String> {
    return listOf(
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
                            modifier = Modifier
                                .testTag("closeChip")
                                .clickable(
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
