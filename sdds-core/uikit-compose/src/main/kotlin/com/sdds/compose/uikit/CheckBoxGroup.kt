package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Компонент [CheckBoxGroup] с поддержкой управления состоянием рутового/дочерних checkbox
 *
 * @param items список дочерних checkbox
 * @param modifier модификатор
 * @param rootItem рутовый checkbox
 * @param startIndent отступ для дочерних checkbox. Если рутовый checkbox [rootItem] отсутствует, отступ игнорируется (не применяется к дочерним).
 * @param verticalArrangement расположение элементов по вертикали
 * @param onRootStateChanged колбэк, сообщающий об имзенении состояния рутового checkbox
 * @param onChildCheckedChanged колбэк, сообщающий об имзенении состояния дочернего checkbox
 * @param enabled включен ли компонент
 * @param labelColor цвет лейбла
 * @param descriptionColor цвет описания
 * @param idleColor цвет бордера CheckBox, когда checked = false и focused = false
 * @param checkedColor цвет заполняющего прямоугольника CheckBox, когда checked = true
 * @param focusedColor цвет бордера CheckBox, когда focused = true
 * @param baseColor цвет отметки-индикатора CheckBox, когда checked = true
 * @param labelTextStyle стиль текста лэйбла
 * @param descriptionTextStyle стиль текста описания
 * @param controlSize размер заполняющего круга контрола
 * @param controlRadius радиус скруглений контрола
 * @param verticalSpacing расстояние между названием и описанием
 * @param horizontalSpacing расстояние между контролом и текстом ([label] или [description])
 * @param strokeWidth ширина линий
 * @param checkedStrokeWidth ширина линий границ в состоянии checked
 * @param innerCheckBoxPadding внутренний отступ между фокусной границей и контролом
 * @param animationDuration длительность анимации переключения
 * @param interactionSource источник событий
 */
@Suppress("LongMethod")
@Composable
fun CheckBoxGroup(
    items: List<CheckBoxGroup.Item>,
    modifier: Modifier = Modifier,
    rootItem: CheckBoxGroup.RootItem? = null,
    startIndent: Dp = 36.dp,
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(12.dp),
    onRootStateChanged: (ToggleableState) -> Unit = {},
    onChildCheckedChanged: (Any, Boolean) -> Unit = { _, _ -> },
    enabled: Boolean = true,
    labelColor: Color = Color.Black,
    descriptionColor: Color = Color.Black,
    idleColor: Color = Color.Black,
    checkedColor: Color = Color.Gray,
    focusedColor: Color = Color.Green,
    baseColor: Color = Color.Green,
    labelTextStyle: TextStyle = TextStyle.Default,
    descriptionTextStyle: TextStyle = TextStyle.Default,
    controlSize: Dp = 24.dp,
    controlRadius: Dp = 6.dp,
    verticalSpacing: Dp = 2.dp,
    horizontalSpacing: Dp = 10.dp,
    strokeWidth: Dp = 2.dp,
    checkedStrokeWidth: Dp = 1.dp,
    innerCheckBoxPadding: Dp = 2.dp,
    animationDuration: Int = 100,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val delegate = rememberCheckBoxGroupStateDelegate(items)

    CheckBoxGroupContainer(modifier, verticalArrangement) {
        rootCheckbox {
            rootItem?.let {
                CheckBox(
                    state = delegate.rootState.value,
                    label = rootItem.label,
                    description = rootItem.description,
                    onClick = {
                        val newState = delegate.rootState.value != ToggleableState.On
                        onRootStateChanged(ToggleableState(newState))
                        delegate.onRootCheckedChange(newState)
                    },
                    enabled = enabled,
                    labelColor = labelColor,
                    descriptionColor = descriptionColor,
                    idleColor = idleColor,
                    checkedColor = checkedColor,
                    focusedColor = focusedColor,
                    baseColor = baseColor,
                    labelTextStyle = labelTextStyle,
                    descriptionTextStyle = descriptionTextStyle,
                    controlSize = controlSize,
                    controlRadius = controlRadius,
                    verticalSpacing = verticalSpacing,
                    horizontalSpacing = horizontalSpacing,
                    strokeWidth = strokeWidth,
                    checkedStrokeWidth = checkedStrokeWidth,
                    innerCheckBoxPadding = innerCheckBoxPadding,
                    animationDuration = animationDuration,
                    interactionSource = interactionSource,
                )
            }
        }
        val startIndent = rootItem?.let { startIndent } ?: 0.dp
        checkboxes {
            items.forEach {
                CheckBox(
                    checked = delegate.childStates[it.id] == true,
                    modifier = Modifier.padding(start = startIndent),
                    label = it.label,
                    description = it.description,
                    onCheckedChange = { checkedState ->
                        if (delegate.childStates[it.id] != checkedState) {
                            delegate.onChildCheckedChange(it.id, checkedState)
                            onChildCheckedChanged(it.id, checkedState)
                        }
                    },
                    enabled = enabled,
                    labelColor = labelColor,
                    descriptionColor = descriptionColor,
                    idleColor = idleColor,
                    checkedColor = checkedColor,
                    focusedColor = focusedColor,
                    baseColor = baseColor,
                    labelTextStyle = labelTextStyle,
                    descriptionTextStyle = descriptionTextStyle,
                    controlSize = controlSize,
                    controlRadius = controlRadius,
                    verticalSpacing = verticalSpacing,
                    horizontalSpacing = horizontalSpacing,
                    strokeWidth = strokeWidth,
                    checkedStrokeWidth = checkedStrokeWidth,
                    innerCheckBoxPadding = innerCheckBoxPadding,
                    animationDuration = animationDuration,
                    interactionSource = interactionSource,
                )
            }
        }
    }
}

/**
 * Компонент [CheckBoxGroupContainer]
 * Вертикальный контейнер для checkBox. Позволяет использовать любые сomposable в качестве элементов.
 * Может содержать рутовый элемент (см. [CheckboxGroupScope.rootCheckbox]) и вложенные элементы
 * (см. [CheckboxGroupScope.checkboxes] и [CheckboxGroupScope.checkbox]).
 *
 * Никак не управляет checked состоянием элементов внутри себя.
 * Чтобы иметь логику управления состоянием checkbox из коробки можно использовать [CheckBoxGroup].
 *
 * @param modifier модификатор
 * @param verticalArrangement расположение элементов по вертикали
 * @param content содержимое контейнера
 *
 * @see CheckBoxGroup
 * @see rememberCheckBoxGroupStateDelegate
 */
@Composable
fun CheckBoxGroupContainer(
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical,
    content: CheckboxGroupScope.() -> Unit,
) {
    val scope = remember { CheckboxGroupScopeImpl() }
    Column(modifier, verticalArrangement) {
        scope.content()
        val rootCheckBoxContent = scope.rootCheckbox
        if (rootCheckBoxContent != null) {
            CheckBoxGroupItemScopeImpl.rootCheckBoxContent()
        }
        scope.checkboxes.forEach {
            val itemContent = it
            CheckBoxGroupItemScopeImpl.itemContent()
        }
        scope.reset()
    }
}

/**
 * Параметры для [CheckBoxGroup]
 */
object CheckBoxGroup {

    /**
     * Рутовый элемент checkbox
     *
     * @property label лэйбл checkbox
     * @property description описание checkbox
     */
    @Immutable
    data class RootItem(
        val label: String? = null,
        val description: String? = null,
    )

    /**
     * Вложенный элемент checkbox
     *
     * @property id идентификатор вложенного checkbox
     * @property label лэйбл checkbox
     * @property description описание checkbox
     * @property initialChecked состояние checkbox поумолчанию
     */
    @Immutable
    data class Item(
        val id: Any,
        val label: String? = null,
        val description: String? = null,
        val initialChecked: Boolean = false,
    )
}

/**
 * Cкоуп [CheckBoxGroupContainer]
 */
interface CheckboxGroupScope {

    /**
     * Добавляет рутовый checkbox c контентом [content] в [CheckBoxGroupContainer]
     */
    fun rootCheckbox(content: @Composable CheckboxGroupItemScope.() -> Unit)

    /**
     * Добавляет дочерний (вложенный) checkbox c контентом [content] в [CheckBoxGroupContainer]
     */
    fun checkbox(content: @Composable CheckboxGroupItemScope.() -> Unit)

    /**
     * Добавляет несколько дочерних (вложенных) checkbox c контентом [content] в [CheckBoxGroupContainer]
     */
    fun checkboxes(content: @Composable CheckboxGroupItemScope.() -> Unit)
}

/**
 * Скоуп дочерних элементов [CheckBoxGroupContainer]
 */
interface CheckboxGroupItemScope

private object CheckBoxGroupItemScopeImpl : CheckboxGroupItemScope

private class CheckboxGroupScopeImpl : CheckboxGroupScope {

    var rootCheckbox: (@Composable CheckboxGroupItemScope.() -> Unit)? = null
    val checkboxes = mutableListOf<@Composable CheckboxGroupItemScope.() -> Unit>()
    override fun rootCheckbox(content: @Composable (CheckboxGroupItemScope.() -> Unit)) {
        rootCheckbox = content
    }

    override fun checkbox(content: @Composable (CheckboxGroupItemScope.() -> Unit)) {
        checkboxes.add { content() }
    }

    override fun checkboxes(content: @Composable (CheckboxGroupItemScope.() -> Unit)) {
        checkboxes.add { content() }
    }

    fun reset() {
        checkboxes.clear()
        rootCheckbox = null
    }
}

/**
 * Запоминает [CheckBoxGroupStateDelegate] для конкретного списка элементов [childItems]
 *
 * @param childItems дочерние (вложенные) элементы checkboxGroup
 */
@Composable
fun rememberCheckBoxGroupStateDelegate(childItems: List<CheckBoxGroup.Item>): CheckBoxGroupStateDelegate {
    return remember(childItems) { CheckBoxGroupStateDelegate(childItems) }
}

/**
 * Делегат, реализующий логику по управлению состоянием рутового и дочерних checkBox в checkBoxGroup.
 *
 * Пользовательское действие на рутовом checkBox переопределяет состояние всех дочерних.
 * Состояние рутового checkBox зависит от состояния дочерних.
 * Если все дочерние элементы в состоянии checked = true, то рутовый checkbox принимает это же состояние.
 * Если все дочерние элементы в состоянии checked = false, то рутовый checkbox принимает это же состояние.
 * Если дочерние элементы имеют разное состояние, то рутовый checkbox имеет состояние [ToggleableState.Indeterminate]
 */
class CheckBoxGroupStateDelegate(items: List<CheckBoxGroup.Item>) {
    /**
     * Состояния дочерних checkBox
     */
    @Suppress("SpreadOperator")
    val childStates = mutableStateMapOf(*items.map { it.id to it.initialChecked }.toTypedArray())

    /**
     * Состояние рутового checkbox
     */
    val rootState = mutableStateOf(childStates.getParentState())

    /**
     * Сообщить об изменении состояния дочернего checkbox.
     *
     * @param id идентификатор checkbox
     * @param checked состояние checkbox
     */
    fun onChildCheckedChange(id: Any, checked: Boolean) {
        childStates[id] = checked
        updateRootState()
    }

    /**
     * Сообщить об изменении состояния рутового checkbox.
     *
     * @param checked состояние checkbox
     */
    fun onRootCheckedChange(checked: Boolean) {
        rootState.value = ToggleableState(checked)
        updateChildStates(checked)
    }

    private fun updateRootState() {
        rootState.value = childStates.getParentState()
    }

    private fun updateChildStates(rootState: Boolean) {
        childStates.forEach {
            childStates[it.key] = rootState
        }
    }

    private fun Map<Any, Boolean>.getParentState(): ToggleableState =
        when {
            this.all { it.value } -> ToggleableState.On
            this.none { it.value } -> ToggleableState.Off
            else -> ToggleableState.Indeterminate
        }
}
