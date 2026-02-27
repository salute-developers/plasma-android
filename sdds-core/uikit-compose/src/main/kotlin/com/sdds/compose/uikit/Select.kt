package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import com.sdds.compose.uikit.DropdownProperties.Height
import com.sdds.compose.uikit.DropdownProperties.Width
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Компонент выбора (Select) для Compose UI, предоставляющий функциональность выпадающего списка.
 *
 * @param modifier Модификатор для настройки внешнего вида и поведения компонента
 * @param style Стиль компонента выбора, по умолчанию берется из [LocalSelectStyle]
 * @param state Состояние компонента выбора, управляющее открытием/закрытием
 * @param dropdownProperties Свойства конфигурации выпадающего меню
 * @param enabled Флаг доступности компонента для взаимодействия
 * @param readOnly Флаг, делающий компонент только для чтения
 * @param showEmptyState Флаг отображения состояния "пусто", когда нет элементов
 * @param trigger контент триггера (поле ввода [SelectTextField] или кнопка [SelectButton])
 * @param emptyState Контент состояния "пусто"
 * @param header Контент заголовка выпадающего списка
 * @param footer Контент футера выпадающего списка
 * @param listContent Контент списка элементов в [LazyListScope]
 */
@Composable
fun Select(
    modifier: Modifier = Modifier,
    style: SelectStyle = LocalSelectStyle.current,
    state: SelectState = remember { SelectState() },
    dropdownProperties: DropdownProperties = DefaultDropdownProperties,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    showEmptyState: Boolean = false,
    trigger: @Composable SelectScope.() -> Unit,
    emptyState: (@Composable DropdownScope.() -> Unit)? = null,
    header: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    listContent: LazyListScope.() -> Unit,
) {
    val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
    val scrollState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    Box(modifier = modifier.popoverTrigger(triggerInfo)) {
        CompositionLocalProvider(
            LocalTextFieldStyle provides style.textFieldStyle,
            LocalButtonStyle provides style.buttonStyle,
            LocalSelectState provides state,
        ) { SelectScopeImpl.trigger() }
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
            coroutineScope.launch {
                delay(150)
                state.close()
            }
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
 * Маркерный интерфейс для области видимости компонента Select.
 * Используется для ограничения области видимости триггера.
 */
interface SelectScope

/**
 * Класс состояния для управления открытием/закрытием компонента Select.
 *
 * @param initialState Начальное состояние (открыт/закрыт), по умолчанию false
 */
@Stable
class SelectState(initialState: Boolean = false) {

    /**
     * Флаг, указывающий, открыт ли компонент Select.
     */
    var isOpened by mutableStateOf(initialState)
        private set

    /**
     * Открывает выпадающий список.
     */
    fun open() {
        isOpened = true
    }

    /**
     * Закрывает выпадающий список.
     */
    fun close() {
        isOpened = false
    }

    /**
     * Переключает состояние выпадающего списка (открыт/закрыт).
     */
    fun toggle() {
        isOpened = !isOpened
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SelectState) return false
        return isOpened == other.isOpened
    }

    override fun hashCode(): Int = isOpened.hashCode()

    override fun toString(): String = "SelectState(isOpened=$isOpened)"
}

/**
 * Интерфейс менеджера состояния данных для компонента Select.
 * Управляет выбором элементов в списке.
 *
 * @param T Тип данных элементов
 */
interface SelectDataStateManager<T> {

    /**
     * Список выбранных элементов.
     */
    val selectedItems: List<T>

    /**
     * Проверяет, выбран ли указанный элемент.
     *
     * @param item Элемент для проверки
     * @return true, если элемент выбран, иначе false
     */
    fun isSelected(item: T): Boolean

    /**
     * Обработчик нажатия на элемент.
     *
     * @param item Элемент, на который произошло нажатие
     */
    fun onItemPressed(item: T)
}

/**
 * Создает и запоминает [SelectDataStateManager] для режима одиночного выбора.
 *
 * @param data Список доступных для выбора элементов
 * @param initialChecked Начальный выбранный элемент (может быть null)
 * @return Менеджер состояния для одиночного выбора
 */
@Composable
fun <T> rememberSelectSingleDataStateManager(
    data: List<T>,
    initialChecked: T? = null,
): SelectDataStateManager<T> {
    return remember(data, initialChecked) {
        SelectSingleDataStateManager(data, initialChecked)
    }
}

/**
 * Создает и запоминает [SelectDataStateManager] для режима множественного выбора.
 *
 * @param data Список доступных для выбора элементов
 * @param valueInitializer Функция-инициализатор, определяющая начальное состояние выбора для каждого элемента
 * @return Менеджер состояния для множественного выбора
 */
@Composable
fun <T> rememberSelectMultipleDataStateManager(
    data: List<T>,
    valueInitializer: (T) -> Boolean = { false },
): SelectDataStateManager<T> {
    return remember(data, valueInitializer) {
        SelectMultipleDataStateManager(data, valueInitializer)
    }
}

internal val LocalSelectState = compositionLocalOf { SelectState() }

private object SelectScopeImpl : SelectScope

@Composable
private fun Int.toDp(): Dp {
    return with(LocalDensity.current) {
        this@toDp.toDp()
    }
}

private val DefaultDropdownProperties = DropdownProperties(
    popupProperties = PopupProperties(
        clippingEnabled = false,
        focusable = true,
        usePlatformDefaultWidth = true,
    ),
)

@Stable
private class SelectSingleDataStateManager<T>(
    private val data: List<T>,
    private val initialChecked: T? = null,
) : SelectDataStateManager<T> {
    private val _checkboxStates = mutableStateMapOf<T, Boolean>()
        .apply { putAll(data.associateWith { it == initialChecked }) }

    override val selectedItems: List<T>
        get() = _checkboxStates.filter { it.value }.keys.toList()

    override fun isSelected(item: T): Boolean {
        return _checkboxStates[item] ?: false
    }

    override fun onItemPressed(item: T) {
        if (_checkboxStates[item] == true) {
            _checkboxStates[item] = false
        } else {
            for (key in _checkboxStates.keys) {
                _checkboxStates[key] = key == item
            }
        }
    }
}

@Stable
private class SelectMultipleDataStateManager<T>(
    private val data: List<T>,
    private val valueInitializer: (T) -> Boolean = { false },
) : SelectDataStateManager<T> {

    override val selectedItems: List<T>
        get() = _checkboxStates.filter { it.value }.keys.toList()
    private val _checkboxStates = mutableStateMapOf<T, Boolean>()
        .apply { putAll(data.associateWith(valueInitializer)) }

    override fun isSelected(item: T): Boolean {
        return _checkboxStates[item] ?: false
    }

    override fun onItemPressed(item: T) {
        _checkboxStates[item]?.let { _checkboxStates[item] = !it }
    }
}
