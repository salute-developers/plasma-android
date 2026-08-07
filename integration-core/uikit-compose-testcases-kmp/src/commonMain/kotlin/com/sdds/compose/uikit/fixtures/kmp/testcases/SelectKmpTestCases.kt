package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.DropdownProperties
import com.sdds.compose.uikit.EmptyState
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.Select
import com.sdds.compose.uikit.SelectButton
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectScope
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.SelectTextField
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.rememberSelectMultipleDataStateManager
import com.sdds.icons.compose.ChevronDown24
import com.sdds.icons.compose.ChevronUp24
import com.sdds.icons.compose.Plasma24
import com.sdds.icons.compose.SddsIcons
import com.sdds.icons.compose.Search24

/**
 * PLASMA-T2578
 */
@Composable
fun SelectSingleNormalXlTopStartKmp(style: SelectStyle) {
    SelectTextFieldCommonKmp(
        style = style,
        alignment = Alignment.TopStart,
    )
}

/**
 * PLASMA-T2580
 */
@Composable
fun SelectMultipleNormalMTopCenterKmp(style: SelectStyle) {
    SelectTextFieldCommonKmp(
        style = style,
        alignment = Alignment.TopCenter,
        triggerType = SelectTriggerTypeKmp.TextField,
        placement = PopoverPlacement.End,
        showEmptyState = true,
    )
}

/**
 * PLASMA-T2586
 */
@Composable
fun SelectMultipleNormalDisabledKmp(style: SelectStyle) {
    SelectTextFieldCommonKmp(
        style = style,
        alignment = Alignment.Center,
        selectTextFieldEnabled = false,
        triggerType = SelectTriggerTypeKmp.TextField,
        placement = PopoverPlacement.Bottom,
        placementMode = PopoverPlacementMode.Strict,
        initialSelection = listOf("Иван Иванов", "Пётр Петров"),
    )
}

/**
 * PLASMA-T2592
 */
@Composable
fun SelectMultipleNormalReadOnlyKmp(style: SelectStyle) {
    SelectTextFieldCommonKmp(
        style = style,
        alignment = Alignment.Center,
        selectTextFieldReadOnly = true,
        triggerType = SelectTriggerTypeKmp.TextField,
        placement = PopoverPlacement.Bottom,
        placementMode = PopoverPlacementMode.Strict,
        initialSelection = listOf("Иван Иванов", "Пётр Петров"),
    )
}

/**
 * Common Select
 */
@Composable
fun SelectTextFieldCommonKmp(
    alignment: Alignment,
    style: SelectStyle,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    placement: PopoverPlacement = PopoverPlacement.Start,
    showEmptyState: Boolean = false,
    footer: (@Composable () -> Unit)? = null,
    triggerType: SelectTriggerTypeKmp = SelectTriggerTypeKmp.TextField,
    initialSelection: List<String> = emptyList(),
    selectTextFieldEnabled: Boolean = true,
    selectTextFieldReadOnly: Boolean = false,
) {
    val state = remember { SelectState(initialState = true) }
    val checkedStateManager = rememberSelectMultipleDataStateManager(SelectListKmp) { false }
    LaunchedEffect(Unit) {
        initialSelection.forEach { checkedStateManager.onItemPressed(it) }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Select(
            modifier = Modifier.align(alignment),
            style = style,
            state = state,
            showEmptyState = showEmptyState,
            dropdownProperties = DropdownProperties(
                placementMode = placementMode,
                placement = placement,
            ),
            enabled = enabled,
            readOnly = readOnly,
            emptyState = {
                EmptyState(
                    iconSource = imageVectorSource(SddsIcons.Plasma24),
                    description = "Empty State",
                    buttonLabel = "Action",
                )
            },
            footer = footer,
            trigger = {
                TriggerContent(
                    triggerType = triggerType,
                    selectedItems = checkedStateManager.selectedItems,
                    selectTextFieldEnabled = selectTextFieldEnabled,
                    selectTextFieldReadOnly = selectTextFieldReadOnly,
                )
            },
            listContent = {
                items(SelectListKmp.size) {
                    val item = SelectListKmp[it]
                    SelectItem(
                        modifier = Modifier.fillMaxWidth(),
                        checked = checkedStateManager.isSelected(item),
                        onClick = { checkedStateManager.onItemPressed(item) },
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

/**
 * Триггер content для dropdown
 */
@Composable
private fun SelectScope.TriggerContent(
    triggerType: SelectTriggerTypeKmp,
    selectedItems: List<String>,
    selectTextFieldEnabled: Boolean,
    selectTextFieldReadOnly: Boolean,
) {
    val iconOpened = imageVectorSource(SddsIcons.ChevronUp24)
    val iconClosed = imageVectorSource(SddsIcons.ChevronDown24)
    when (triggerType) {
        SelectTriggerTypeKmp.TextField -> {
            SelectTextField(
                modifier = Modifier.width(260.dp),
                value = "",
                enabled = selectTextFieldEnabled,
                readOnly = selectTextFieldReadOnly,
                placeholderText = "Сотрудник",
                iconOpened = iconOpened,
                iconClosed = iconClosed,
                focusSelectorSettings = FocusSelectorSettings.None,
                chipsContent = if (selectedItems.isNotEmpty()) {
                    { selectedItems.forEach { Chip(label = it) } }
                } else {
                    null
                },
                startContent = {
                    Icon(
                        imageVector = SddsIcons.Search24,
                        contentDescription = "",
                    )
                },
            )
        }

        SelectTriggerTypeKmp.Button -> {
            SelectButton(
                modifier = Modifier.width(260.dp),
                label = selectedItems.firstOrNull() ?: "Value",
                iconOpened = iconOpened,
                iconClosed = iconClosed,
            )
        }
    }
}

/**
 * Загрузка для dropdown
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

/**
 * Список для dropdown
 */
private val SelectListKmp = listOf(
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

/**
 * Выбор типа триггера
 */
enum class SelectTriggerTypeKmp {
    TextField,
    Button,
}
