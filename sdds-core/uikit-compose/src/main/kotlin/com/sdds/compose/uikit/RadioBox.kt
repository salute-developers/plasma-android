package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.internal.checkable.BaseCheckableLayout
import com.sdds.compose.uikit.internal.checkable.RadioBoxControl
import com.sdds.compose.uikit.internal.checkable.checkableDescription
import com.sdds.compose.uikit.internal.checkable.checkableLabel

/**
 * Компонент RadioBox
 * @param checked флаг-индикатор выбора
 * @param modifier модификатор
 * @param style стиль компонента
 * @param onClick слушатель нажатий
 * @param label лейбл
 * @param description описание
 * @param enabled включен ли компонент
 * @param interactionSource источник событий
 */
@Composable
fun RadioBox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    style: RadioBoxStyle = LocalRadioBoxStyle.current,
    onClick: (() -> Unit)? = null,
    label: String? = null,
    description: String? = null,
    enabled: Boolean = true,
    animationDuration: Int = style.animationDuration,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val selectableModifier = if (onClick != null) {
        Modifier.selectable(
            selected = checked,
            onClick = onClick,
            enabled = enabled,
            role = Role.RadioButton,
            interactionSource = interactionSource,
            indication = null,
        )
    } else {
        Modifier
    }

    BaseCheckableLayout(
        modifier = modifier
            .then(selectableModifier)
            .graphicsLayer { alpha = if (enabled) 1f else 0.4f },
        control = {
            RadioBoxControl(
                modifier = it,
                checked = checked,
                shape = style.shape,
                dimensions = style.dimensionValues,
                animationDuration = animationDuration,
                colors = style.colorValues,
                interactionSource = interactionSource,
                iconContent = null,
            )
        },
        label = checkableLabel(
            value = label,
            textStyle = style.labelStyle,
            color = style.colorValues.labelColor.colorForInteraction(interactionSource),
        ),
        description = checkableDescription(
            value = description,
            textStyle = style.descriptionStyle,
            color = style.colorValues.descriptionColor.colorForInteraction(interactionSource),
        ),
        verticalSpacing = style.dimensionValues.descriptionPadding,
        horizontalSpacing = style.dimensionValues.textPadding,
    )
}

/**
 * Состояния RadioBox
 */
enum class RadioBoxStates : ValueState {
    /**
     * Radiobox выбран
     */
    Checked,
}

/**
 * Stateful вертикальная группа [RadioBox].
 * @param modifier модификатор
 * @param style стиль компонента
 * @param verticalArrangement способ распределения элементов по вертикали
 * @param horizontalAlignment выравнивание по горизонтали
 * @param default выбранный по умолчанию элемент
 * @param content контент, состоящий из [RadioBox]
 */
@Composable
fun <T : Any> RadioBoxGroup(
    modifier: Modifier = Modifier,
    style: RadioBoxGroupStyle = LocalRadioBoxGroupStyle.current,
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(style.dimensions.itemSpacing),
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    default: T? = null,
    content: @Composable RadioBoxGroupScope.(selection: MutableState<T?>) -> Unit,
) {
    val selection = remember { mutableStateOf(default) }
    Column(
        modifier = modifier,
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
    ) {
        CompositionLocalProvider(LocalRadioBoxStyle provides style.radioBoxStyle) {
            RadioBoxScopeInstance.content(selection)
        }
    }
}

/**
 * Stateless вертикальная группа [RadioBox].
 * @param modifier модификатор
 * @param style стиль компонента
 * @param verticalArrangement способ распределения элементов по вертикали
 * @param horizontalAlignment выравнивание по горизонтали
 * @param content контент, состоящий из [RadioBox]
 */
@Composable
fun RadioBoxGroup(
    modifier: Modifier = Modifier,
    style: RadioBoxGroupStyle = LocalRadioBoxGroupStyle.current,
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(style.dimensions.itemSpacing),
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier,
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
    ) {
        CompositionLocalProvider(LocalRadioBoxStyle provides style.radioBoxStyle) {
            content()
        }
    }
}

/**
 * Скоуп элемента stateful группы [RadioBoxGroup]
 */
interface RadioBoxGroupItemScope

private object RadioBoxGroupItemScopeInstance : RadioBoxGroupItemScope

/**
 * Скоуп stateful группы [RadioBoxGroup]
 */
interface RadioBoxGroupScope {

    /**
     * Добавляет элемент с ключом [key] в группу
     *
     * @param key уникальный ключ элмента группы
     * @param content composable элемента
     */
    @Composable
    fun <T> radioBoxItem(key: T, content: @Composable RadioBoxGroupItemScope.(key: T) -> Unit)
}

private object RadioBoxScopeInstance : RadioBoxGroupScope {

    @Composable
    override fun <T> radioBoxItem(
        key: T,
        content: @Composable (RadioBoxGroupItemScope.(key: T) -> Unit),
    ) {
        RadioBoxGroupItemScopeInstance.content(key)
    }
}

/**
 * Проверяет совадает ли ключ элемента [key] с текущим значением значением [selection]
 */
fun <T> RadioBoxGroupItemScope.isChecked(selection: MutableState<T>, key: T) =
    selection.value == key

/**
 * Обновляет текущее значение [selection] значением ключа [key]
 */
fun <T> RadioBoxGroupItemScope.updateSelection(selection: MutableState<T>, key: T) {
    if (selection.value != key) {
        selection.value = key
    }
}

@Composable
@Preview
private fun RadioBoxPreview() {
    RadioBox(
        modifier = Modifier.padding(8.dp),
        checked = true,
        label = "label",
        style = RadioBoxStyle.builder().style(),
        description = "description",
    )
}
