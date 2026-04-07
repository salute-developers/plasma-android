package com.sdds.compose.uikit.fixtures.testcases

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
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
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
import com.sdds.compose.uikit.rememberSelectMultipleDataStateManager
import com.sdds.icons.R

/**
 * Тест-кейсы для [Select]
 */

/**
 * PLASMA-T2578
 */
@Composable
fun SelectSingleNormalXlTopStart(style: SelectStyle) {
    SelectTextFieldCommon(
        style = style,
        alignment = Alignment.TopStart,
    )
}

/**
 * PLASMA-T2579
 */
@Composable
fun SelectSingleTightLTopEnd(style: SelectStyle) {
    val state = remember { SelectState(initialState = true) }
    SelectTextFieldCommon(
        style = style,
        alignment = Alignment.TopEnd,
        triggerType = SelectTriggerType.Button,
        placement = PopoverPlacement.Top,
    )
}

/**
 * PLASMA-T2580
 */
@Composable
fun SelectMultipleNormalMTopCenter(style: SelectStyle) {
    SelectTextFieldCommon(
        style = style,
        alignment = Alignment.TopCenter,
        triggerType = SelectTriggerType.TextField,
        placement = PopoverPlacement.End,
        showEmptyState = true,
    )
}

/**
 * PLASMA-T2581
 */
@Composable
fun SelectMultipleTightSCenter(style: SelectStyle) {
    SelectTextFieldCommon(
        style = style,
        alignment = Alignment.Center,
        triggerType = SelectTriggerType.Button,
        placement = PopoverPlacement.Top,
        placementMode = PopoverPlacementMode.Strict,
    )
}

/**
 * PLASMA-T2582
 */
@Composable
fun SelectSingleNormalXsCenterStart(style: SelectStyle) {
    SelectTextFieldCommon(
        style = style,
        alignment = Alignment.CenterStart,
        triggerType = SelectTriggerType.TextField,
        placement = PopoverPlacement.End,
        placementMode = PopoverPlacementMode.Strict,
    )
}

/**
 * PLASMA-T2583
 */
@Composable
fun SelectSingleTightLCenterEnd(style: SelectStyle) {
    SelectTextFieldCommon(
        style = style,
        alignment = Alignment.CenterEnd,
        triggerType = SelectTriggerType.Button,
        placement = PopoverPlacement.Bottom,
        placementMode = PopoverPlacementMode.Loose,
        showEmptyState = true,
    )
}

/**
 * PLASMA-T2584
 */
@Composable
fun SelectMultipleNormalLShowLoadingBottomStart(
    style: SelectStyle,
    spinnerStyle: SpinnerStyle,
) {
    SelectTextFieldCommon(
        style = style,
        alignment = Alignment.BottomStart,
        triggerType = SelectTriggerType.TextField,
        placement = PopoverPlacement.Bottom,
        footer = { Loading(spinnerStyle = spinnerStyle) },
    )
}

/**
 * PLASMA-T2585
 */
@Composable
fun SelectMultipleTightLBottomEnd(style: SelectStyle) {
    SelectTextFieldCommon(
        style = style,
        alignment = Alignment.BottomEnd,
        triggerType = SelectTriggerType.TextField,
        placement = PopoverPlacement.Bottom,
        initialSelection = listOf(
            "Иван Иванов",
            "Пётр Петров",
        ),

    )
}

/**
 * PLASMA-T2586
 */
@Composable
fun SelectMultipleNormalDisabled(style: SelectStyle) {
    SelectTextFieldCommon(
        style = style,
        alignment = Alignment.Center,
        selectTextFieldEnabled = false,
        triggerType = SelectTriggerType.TextField,
        placement = PopoverPlacement.Bottom,
        placementMode = PopoverPlacementMode.Strict,
        initialSelection = listOf(
            "Иван Иванов",
            "Пётр Петров",
        ),
    )
}

/**
 * PLASMA-T2592
 */
@Composable
fun SelectMultipleNormalReadOnly(style: SelectStyle) {
    SelectTextFieldCommon(
        style = style,
        alignment = Alignment.Center,
        selectTextFieldReadOnly = true,
        triggerType = SelectTriggerType.TextField,
        placement = PopoverPlacement.Bottom,
        placementMode = PopoverPlacementMode.Strict,
        initialSelection = listOf(
            "Иван Иванов",
            "Пётр Петров",
        ),
    )
}

/**
 * Select common тест-кейс
 */
@Composable
fun SelectTextFieldCommon(
    alignment: Alignment,
    style: SelectStyle,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    placementMode: PopoverPlacementMode = PopoverPlacementMode.Loose,
    placement: PopoverPlacement = PopoverPlacement.Start,
    showEmptyState: Boolean = false,
    footer: (@Composable () -> Unit)? = null,
    triggerType: SelectTriggerType = SelectTriggerType.TextField,
    initialSelection: List<String> = emptyList(),
    selectTextFieldEnabled: Boolean = true,
    selectTextFieldReadOnly: Boolean = false,
) {
    val state = remember { SelectState(initialState = false) }
    val checkedStateManager = rememberSelectMultipleDataStateManager(SelectList, { false })
    LaunchedEffect(Unit) {
        initialSelection.forEach { checkedStateManager.onItemPressed(it) }
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Select(
            modifier = Modifier
                .testTag("Select")
                .align(alignment),
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
                    iconRes = R.drawable.ic_plasma_36,
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
                items(SelectList.size) {
                    SelectItem(
                        modifier = Modifier
                            .fillMaxWidth(),
                        checked = checkedStateManager.isSelected(SelectList[it]),
                        onClick = { checkedStateManager.onItemPressed(SelectList[it]) },
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
}

@Composable
private fun SelectScope.TriggerContent(
    triggerType: SelectTriggerType,
    selectedItems: List<String>,
    selectTextFieldEnabled: Boolean,
    selectTextFieldReadOnly: Boolean,
) {
    when (triggerType) {
        SelectTriggerType.TextField -> {
            SelectTextField(
                modifier = Modifier
                    .width(260.dp),
                value = "",
                enabled = selectTextFieldEnabled,
                readOnly = selectTextFieldReadOnly,
                placeholderText = "Сотрудник",
                iconOpened = R.drawable.ic_chevron_up_24,
                iconClosed = R.drawable.ic_chevron_down_24,
                chipsContent = if (selectedItems.isNotEmpty()) {
                    { selectedItems.forEach { Chip(label = it) } }
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
        }

        SelectTriggerType.Button -> {
            SelectButton(
                modifier = Modifier.width(260.dp),
                label = selectedItems.firstOrNull() ?: "Value",
                iconOpened = R.drawable.ic_chevron_up_24,
                iconClosed = R.drawable.ic_chevron_down_24,
            )
        }
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

/**
 * Тип триггера Select
 */
enum class SelectTriggerType {
    TextField,
    Button,
}
