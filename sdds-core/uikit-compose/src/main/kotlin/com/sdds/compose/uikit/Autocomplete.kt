package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.DropdownProperties.Height
import com.sdds.compose.uikit.DropdownProperties.Width

/**
 * Поле ввода с возможностью подстановки значения из предварительно заполненного выпадающего списка по мере ввода данных
 *
 * @param modifier модификатор текстового поля
 * @param style стиль компонента
 * @param field слот для текстового поля
 * @param showDropdown показан dropdown или нет
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне меню
 * @param showEmptyState будет ли показано пустое состояние [emptyState]. Если true - основной контент [listContent] скрывается.
 * @param dropdownProperties настройки dropdown [DropdownProperties]
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
    dropdownProperties: DropdownProperties = DropdownProperties(),
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
                when (dropdownProperties.width) {
                    is Width.TriggerWidth -> triggerInfo.value.size.width.toDp()
                    is Width.Exactly -> dropdownProperties.width.width
                },
            )
            .then(
                when (dropdownProperties.height) {
                    is Height.Constrained -> Modifier.heightIn(max = dropdownProperties.height.maxHeight)
                    else -> Modifier
                },
            ),
        opened = showDropdown,
        scrollState = scrollState,
        style = style.dropdownStyle,
        onDismissRequest = onDismissRequest,
        triggerInfo = triggerInfo.value,
        clipWidth = false,
        clipHeight = true,
        placement = dropdownProperties.placement,
        placementMode = dropdownProperties.placementMode,
        popupProperties = dropdownProperties.popupProperties,
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
 * Настройки дропдауна
 *
 * @property width настройки ширины dropdown
 * @property height настройки высоты dropdown
 * @property popupProperties настройки [PopupProperties]
 * @property placement расположение дропдауна относительно текстового поля
 * @property placementMode режим расположения dropdown [PopoverPlacementMode]
 */
@Immutable
data class DropdownProperties(
    val height: Height = Height.FullHeight,
    val width: Width = Width.TriggerWidth,
    val popupProperties: PopupProperties = PopupProperties(clippingEnabled = false),
    val placement: PopoverPlacement = PopoverPlacement.Bottom,
    val placementMode: PopoverPlacementMode = PopoverPlacementMode.Strict,
) {
    /**
     * Настройки высоты [DropdownMenu] в [Autocomplete]
     */
    sealed class Height {
        /**
         * Высота [DropdownMenu] ограничена доступным пространством на экране
         */
        object FullHeight : Height()

        /**
         * Высота [DropdownMenu] ограничена значением [maxHeight]
         */
        data class Constrained(val maxHeight: Dp = 400.dp) : Height()
    }

    /**
     * Настройки ширины [DropdownMenu] в [Autocomplete]
     */
    sealed class Width {
        /**
         * Ширина [DropdownMenu] равна ширины триггера
         */
        object TriggerWidth : Width()

        /**
         * Ширина [DropdownMenu] имеет определенное значение [width]
         */
        data class Exactly(val width: Dp = 240.dp) : Width()
    }
}

@Composable
private fun Int.toDp(): Dp {
    return with(LocalDensity.current) {
        this@toDp.toDp()
    }
}
