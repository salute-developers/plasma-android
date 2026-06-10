package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.DropdownProperties.Height
import com.sdds.compose.uikit.DropdownProperties.Width
import com.sdds.compose.uikit.internal.toDp
import kotlinx.coroutines.delay

/**
 * Компонент ComboBox - текстовое поле с выпадающим списком для ввода
 * и выбора значений.
 *
 * В отличие от [Select], [ComboBox] использует текстовое поле в качестве триггера,
 * что позволяет пользователю вводить произвольный текст и одновременно выбирать
 * значения из предложенного списка.
 *
 * @param trigger Контент триггера — текстовое поле [ComboBoxTextField]
 * @param listContent Контент списка элементов в [LazyListScope]
 * @param modifier Модификатор для настройки внешнего вида и поведения компонента
 * @param style Стиль компонента, по умолчанию берётся из [LocalComboBoxStyle]
 * @param state Состояние компонента, управляющее открытием/закрытием выпадающего списка
 * @param enabled Флаг доступности компонента для взаимодействия
 * @param readOnly Флаг, делающий компонент только для чтения (выпадающий список не открывается)
 * @param showEmptyState Флаг отображения состояния «пусто», когда список не содержит элементов
 * @param emptyState Контент состояния «пусто», отображаемый внутри выпадающего меню
 * @param header Контент заголовка выпадающего списка
 * @param footer Контент футера выпадающего списка
 * @param dropdownProperties Свойства конфигурации выпадающего меню
 */
@Composable
fun ComboBox(
    trigger: @Composable ComboBoxScope.() -> Unit,
    listContent: LazyListScope.() -> Unit,
    modifier: Modifier = Modifier,
    style: ComboBoxStyle = LocalComboBoxStyle.current,
    state: SelectState = remember { SelectState() },
    enabled: Boolean = true,
    readOnly: Boolean = false,
    showEmptyState: Boolean = false,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    header: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    dropdownProperties: DropdownProperties = ComboBoxDefaultDropdownProperties,
) {
    val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
    val scrollState = rememberLazyListState()
    val dismissState = remember { ComboBoxDismissState() }
    ResetRecentPopupDismiss(dismissState)

    Box(modifier = modifier.popoverTrigger(triggerInfo)) {
        CompositionLocalProvider(
            LocalTextFieldStyle provides style.textFieldStyle,
            LocalSelectState provides state,
            LocalComboBoxDismissState provides dismissState,
        ) {
            ComboBoxScopeImpl.trigger()
        }
    }

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
        opened = state.isOpened && enabled && !readOnly,
        scrollState = scrollState,
        style = style.dropdownStyle,
        onDismissRequest = {
            dismissState.markDismissed()
            state.close()
        },
        triggerInfo = triggerInfo.value,
        clipWidth = false,
        clipHeight = true,
        placement = dropdownProperties.placement,
        placementMode = dropdownProperties.placementMode,
        popupProperties = dropdownProperties.popupProperties,
        emptyState = emptyState,
        showEmptyState = showEmptyState,
        footer = footer,
        header = header,
    ) {
        CompositionLocalProvider(LocalSelectItemStyle provides style.selectItemStyle) {
            List(
                modifier = Modifier.fillMaxWidth(),
                state = scrollState,
            ) {
                listContent.invoke(this)
            }
        }
    }
}

/**
 * Маркерный интерфейс для области видимости компонента ComboBox.
 * Используется для ограничения области видимости триггера.
 */
interface ComboBoxScope

private object ComboBoxScopeImpl : ComboBoxScope

/**
 * Состояние последнего dismiss-события выпадающего списка.
 *
 * Используется, чтобы отличить обычный клик по иконке открытия от клика,
 * который сначала закрыл popup через `onDismissRequest`, а затем дошел до
 * обработчика иконки. В таком сценарии следующий клик по иконке должен
 * поглотить недавний dismiss и не открывать список обратно тем же тапом.
 */
@Stable
internal class ComboBoxDismissState {
    var dismissEventCount by mutableIntStateOf(0)
        private set
    private var recentlyDismissed by mutableStateOf(false)

    fun markDismissed() {
        dismissEventCount += 1
        recentlyDismissed = true
    }

    fun reset() {
        recentlyDismissed = false
    }

    fun consumeRecentDismiss(): Boolean {
        if (!recentlyDismissed) return false
        recentlyDismissed = false
        return true
    }
}

internal val LocalComboBoxDismissState = staticCompositionLocalOf<ComboBoxDismissState?> { null }

/**
 * Сбрасывает маркер недавнего dismiss-события после короткой задержки.
 *
 * Задержка оставляет время для `onClick` иконки, который может прийти сразу
 * после `onDismissRequest` от popup. После сброса последующие клики снова
 * обрабатываются как обычные открытия списка.
 */
@Composable
private fun ResetRecentPopupDismiss(
    dismissState: ComboBoxDismissState,
) {
    LaunchedEffect(dismissState.dismissEventCount) {
        if (dismissState.dismissEventCount > 0) {
            delay(RECENT_POPUP_DISMISS_TIMEOUT)
            dismissState.reset()
        }
    }
}

private val ComboBoxDefaultDropdownProperties = DropdownProperties(
    popupProperties = PopupProperties(
        clippingEnabled = false,
        focusable = false,
        dismissOnClickOutside = false,
        usePlatformDefaultWidth = true,
    ),
)

private const val RECENT_POPUP_DISMISS_TIMEOUT = 300L
