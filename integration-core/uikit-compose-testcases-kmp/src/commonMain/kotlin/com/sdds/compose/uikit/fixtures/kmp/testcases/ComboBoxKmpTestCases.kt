package com.sdds.compose.uikit.fixtures.kmp.testcases

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
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.rememberSelectMultipleDataStateManager
import com.sdds.compose.uikit.rememberSelectSingleDataStateManager
import com.sdds.icons.compose.ChevronDown24
import com.sdds.icons.compose.ChevronUp24
import com.sdds.icons.compose.Close24
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.SddsIcons
import com.sdds.icons.compose.Search24

/**
 * PLASMA-T2643
 */
@Composable
fun ComboBoxSingleNormalTopStartPlacementStartLooseKmp(style: ComboBoxStyle) {
    ComboBoxCommonKmp(
        style = style,
        selectionMode = ComboBoxSelectionModeKmp.Single,
        triggerAlignment = ComboBoxTriggerAlignmentKmp.TopStart,
        placement = PopoverPlacement.Start,
    )
}

/**
 * PLASMA-T2648
 */
@Composable
fun ComboBoxSingleTightTopEndPlacementTopLooseKmp(style: ComboBoxStyle) {
    ComboBoxCommonKmp(
        style = style,
        selectionMode = ComboBoxSelectionModeKmp.Single,
        triggerAlignment = ComboBoxTriggerAlignmentKmp.TopEnd,
        placement = PopoverPlacement.Top,
    )
}

/**
 * PLASMA-T2649
 */
@Composable
fun ComboBoxMultipleNormalTopCenterShowLoadingPlacementEndKmp(
    style: ComboBoxStyle,
    spinnerStyle: SpinnerStyle,
) {
    ComboBoxCommonKmp(
        style = style,
        selectionMode = ComboBoxSelectionModeKmp.Multiple,
        triggerAlignment = ComboBoxTriggerAlignmentKmp.TopCenter,
        placement = PopoverPlacement.End,
        loadingComponent = { Loading(spinnerStyle = spinnerStyle) },
    )
}

/**
 * PLASMA-T2653
 */
@Composable
fun ComboBoxMultipleNormalBottomStartPlacementEndKmp(style: ComboBoxStyle) {
    ComboBoxCommonKmp(
        style = style,
        selectionMode = ComboBoxSelectionModeKmp.Multiple,
        triggerAlignment = ComboBoxTriggerAlignmentKmp.BottomStart,
        placement = PopoverPlacement.End,
    )
}

/**
 * Common ComboBox
 */
@Composable
fun ComboBoxCommonKmp(
    style: ComboBoxStyle,
    selectionMode: ComboBoxSelectionModeKmp,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    showEmptyState: Boolean = false,
    triggerAlignment: ComboBoxTriggerAlignmentKmp = ComboBoxTriggerAlignmentKmp.TopStart,
    placement: PopoverPlacement = PopoverPlacement.Bottom,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    loadingComponent: @Composable (() -> Unit)? = null,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    initialSelectedItems: Set<String> = emptySet(),
) {
    when (selectionMode) {
        ComboBoxSelectionModeKmp.Single -> ComboBoxCommonSingle(
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

        ComboBoxSelectionModeKmp.Multiple -> ComboBoxCommonMultiple(
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

/**
 * Common ComboBox single
 */
@Composable
private fun ComboBoxCommonSingle(
    style: ComboBoxStyle,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    showEmptyState: Boolean = false,
    triggerAlignment: ComboBoxTriggerAlignmentKmp = ComboBoxTriggerAlignmentKmp.TopStart,
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
    val state = remember { SelectState(initialState = true) }
    val checkedStateManager = rememberSelectSingleDataStateManager(comboBoxList, initialSelectedItem)
    var value by remember(initialSelectedItem) { mutableStateOf(initialSelectedItem.orEmpty()) }
    val filteredList = remember(value, state.isOpened) {
        comboBoxList.filteredBy(value, state.isOpened)
    }
    val dropdownProperties = remember(placement, placementMode) {
        DropdownProperties(placement = placement, placementMode = placementMode)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(triggerAlignment.alignment)) {
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
                        iconOpened = imageVectorSource(SddsIcons.ChevronUp24),
                        iconClosed = imageVectorSource(SddsIcons.ChevronDown24),
                        focusSelectorSettings = FocusSelectorSettings.None,
                        startContent = { SearchIcon() },
                    )
                },
                showEmptyState = showEmptyState && filteredList.isEmpty(),
                footer = loadingComponent,
                emptyState = emptyState ?: {
                    EmptyState(
                        iconSource = imageVectorSource(SddsIcons.Plasma24),
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
                                disclosureEnabled = false,
                            )
                        }
                    }
                },
            )
        }
    }
}

/**
 * Common ComboBox multiple
 */
@Composable
private fun ComboBoxCommonMultiple(
    style: ComboBoxStyle,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    showEmptyState: Boolean = false,
    triggerAlignment: ComboBoxTriggerAlignmentKmp = ComboBoxTriggerAlignmentKmp.TopStart,
    placement: PopoverPlacement = PopoverPlacement.Bottom,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    loadingComponent: @Composable (() -> Unit)? = null,
    initiallySelected: Set<String> = emptySet(),
) {
    val comboBoxList = comboBoxSampleList()
    val state = remember { SelectState(initialState = true) }
    val checkedStateManager = rememberSelectMultipleDataStateManager(
        comboBoxList,
        { item -> item in initiallySelected },
    )
    var value by remember { mutableStateOf(TextFieldValue()) }
    val filteredList = remember(value.text, state.isOpened) {
        comboBoxList.filteredBy(value.text, state.isOpened)
    }
    val dropdownProperties = remember(placement, placementMode) {
        DropdownProperties(placement = placement, placementMode = placementMode)
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(triggerAlignment.alignment)) {
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
                        iconOpened = imageVectorSource(SddsIcons.ChevronUp24),
                        iconClosed = imageVectorSource(SddsIcons.ChevronDown24),
                        focusSelectorSettings = FocusSelectorSettings.None,
                        chipsContent = comboBoxChipsContent(
                            checkedStateManager.selectedItems,
                            checkedStateManager::onItemPressed,
                        ),
                        startContent = { SearchIcon() },
                    )
                },
                showEmptyState = showEmptyState && filteredList.isEmpty(),
                footer = loadingComponent,
                emptyState = emptyState ?: {
                    EmptyState(
                        iconSource = imageVectorSource(SddsIcons.Plasma24),
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
                                disclosureEnabled = false,
                            )
                        }
                    }
                },
            )
        }
    }
}

/**
 * Иконка поиска
 */
@Composable
private fun SearchIcon() {
    Icon(
        imageVector = SddsIcons.Search24,
        contentDescription = "",
    )
}

/**
 * Выбор режима
 */
enum class ComboBoxSelectionModeKmp {
    Single,
    Multiple,
}

@Suppress("UndocumentedPublicClass", "UndocumentedPublicProperty")
enum class ComboBoxTriggerAlignmentKmp(
    val alignment: Alignment,
) {
    TopStart(Alignment.TopStart),
    TopCenter(Alignment.TopCenter),
    TopEnd(Alignment.TopEnd),
    BottomStart(Alignment.BottomStart),
}

/**
 * Список для dropdown
 */
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

/**
 * Фильтрация списка
 */
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

/**
 * Компонент для отображения выбранных элементов
 */
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
                            imageVector = SddsIcons.Close24,
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

/**
 * Компонент для отображения лоадера
 */
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
