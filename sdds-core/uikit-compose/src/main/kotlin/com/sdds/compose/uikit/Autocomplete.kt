package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties

/**
 * Поле ввода с возможностью подстановки значения из предварительно заполненного выпадающего списка по мере ввода данных
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param field слот для текстового поля
 * @param showDropdown показан dropdown или нет
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне меню
 * @param showEmptyState будет ли показано пустое состояние [emptyState]. Если true - основной контент [listContent] скрывается.
 * @param popupProperties настройки [PopupProperties]
 * @param dropdownWidth настройки ширины dropdown
 * @param dropdownHeight настройки высоты dropdown
 * @param emptyState слот для пустого состояния. Будет показано, если [showEmptyState] == true
 * @param footer слот для footer в dropdown (состояние загрузки, кнопка "обновить" и т.д.)
 * @param listContent список данных в [DropdownMenu]
 */
@Composable
fun Autocomplete(
    modifier: Modifier = Modifier,
    style: AutocompleteStyle = LocalAutocompleteStyle.current,
    field: @Composable () -> Unit,
    showDropdown: Boolean = false,
    onDismissRequest: () -> Unit = {},
    showEmptyState: Boolean = false,
    popupProperties: PopupProperties = PopupProperties(),
    dropdownWidth: AutocompleteDropdownWidth = AutocompleteDropdownWidth.TriggerWidth,
    dropdownHeight: AutocompleteDropdownHeight = AutocompleteDropdownHeight.Strict(400.dp),
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    listContent: LazyListScope.() -> Unit = {},
) {
    val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
    Box(modifier = modifier.popoverTrigger(triggerInfo)) {
        CompositionLocalProvider(LocalTextFieldStyle provides style.textFieldStyle) {
            field.invoke()
        }
    }
    val scrollState = rememberLazyListState()
    DropdownMenu(
        offset = 0.dp,
        modifier = Modifier
            .width(
                when (dropdownWidth) {
                    is AutocompleteDropdownWidth.TriggerWidth -> triggerInfo.value.size.width.toDp()
                    is AutocompleteDropdownWidth.Exactly -> dropdownWidth.width
                },
            )
            .then(
                when (dropdownHeight) {
                    is AutocompleteDropdownHeight.Loose -> Modifier
                    is AutocompleteDropdownHeight.Strict -> Modifier.heightIn(max = dropdownHeight.maxHeight)
                },
            ),
        opened = showDropdown,
        scrollState = scrollState,
        style = style.dropdownStyle,
        onDismissRequest = onDismissRequest,
        triggerInfo = triggerInfo.value,
        placement = PopoverPlacement.Bottom,
        placementMode = PopoverPlacementMode.Strict,
        popupProperties = popupProperties,
        emptyState = emptyState,
        showEmptyState = showEmptyState,
        footer = footer,
    ) {
        List(
            modifier = Modifier.fillMaxWidth(),
            state = scrollState,
        ) {
            listContent.invoke(this)
        }
    }
}

/**
 * Настройки высоты [DropdownMenu] в [Autocomplete]
 */
sealed class AutocompleteDropdownHeight {
    /**
     * Высота [DropdownMenu] не ограничена
     */
    object Loose : AutocompleteDropdownHeight()

    /**
     * Высота [DropdownMenu] ограничена значением [maxHeight]
     */
    data class Strict(val maxHeight: Dp = 400.dp) : AutocompleteDropdownHeight()
}

/**
 * Настройки ширины [DropdownMenu] в [Autocomplete]
 */
sealed class AutocompleteDropdownWidth {
    /**
     * Ширина [DropdownMenu] равна ширины триггера
     */
    object TriggerWidth : AutocompleteDropdownWidth()

    /**
     * Ширина [DropdownMenu] имеет определенное значение [width]
     */
    data class Exactly(val width: Dp = 240.dp) : AutocompleteDropdownWidth()
}

@Composable
private fun Int.toDp(): Dp {
    return with(LocalDensity.current) {
        this@toDp.toDp()
    }
}
