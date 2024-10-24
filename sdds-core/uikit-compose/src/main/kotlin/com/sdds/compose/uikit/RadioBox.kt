package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val focusState = interactionSource.collectIsFocusedAsState()
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
                focused = focusState.value,
                dimensions = style.dimensions,
                animationDuration = style.animationDuration,
                colors = style.colors,
            )
        },
        label = checkableLabel(
            value = label,
            textStyle = style.labelStyle,
            color = style.colors.labelColor,
        ),
        description = checkableDescription(
            value = description,
            textStyle = style.descriptionStyle,
            color = style.colors.descriptionColor,
        ),
        verticalSpacing = style.dimensions.verticalSpacing,
        horizontalSpacing = style.dimensions.horizontalSpacing,
    )
}

/**
 * Горизонтальная группа [RadioBox]
 * @param items элементы группы
 * @param modifier модификатор
 * @param horizontalArrangement способ распределения элементов по горизонтали
 * @param verticalAlignment выравнивание по вертикали
 * @param default выбранный по умолчанию элемент
 * @param onSelectionChanged колбэк изменения выбора
 */
@Composable
fun HorizontalRadioBoxGroup(
    items: List<RadioBoxGroup.Item>,
    modifier: Modifier = Modifier,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    default: Any? = null,
    onSelectionChanged: (Any) -> Unit = {},
) {
    val selection = remember { mutableStateOf(default) }
    Row(
        modifier = modifier,
        horizontalArrangement = horizontalArrangement,
        verticalAlignment = verticalAlignment,
    ) {
        items.forEach { item ->
            RadioBoxGroupItem(
                item = item,
                selection = selection,
                onSelectionChanged = onSelectionChanged,
            )
        }
    }
}

/**
 * Вертикальная группа [RadioBox]
 * @param items элементы группы
 * @param modifier модификатор
 * @param style стиль компонента
 * @param verticalArrangement способ распределения элементов по вертикали
 * @param horizontalAlignment выравнивание по горизонтали
 * @param default выбранный по умолчанию элемент
 * @param onSelectionChanged колбэк изменения выбора
 */
@Composable
fun VerticalRadioBoxGroup(
    items: List<RadioBoxGroup.Item>,
    modifier: Modifier = Modifier,
    style: RadioBoxGroupStyle = LocalRadioBoxGroupStyle.current,
    verticalArrangement: Arrangement.Vertical = style.verticalArrangement,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    default: Any? = null,
    onSelectionChanged: (Any) -> Unit = {},
) {
    val selection = remember { mutableStateOf(default) }
    Column(
        modifier = modifier,
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
    ) {
        CompositionLocalProvider(LocalRadioBoxStyle provides style.radioBoxStyle) {
            items.forEach { item ->
                RadioBoxGroupItem(
                    item = item,
                    selection = selection,
                    onSelectionChanged = onSelectionChanged,
                )
            }
        }
    }
}

@Composable
private inline fun RadioBoxGroupItem(
    item: RadioBoxGroup.Item,
    selection: MutableState<Any?>,
    crossinline onSelectionChanged: (Any) -> Unit,
) {
    RadioBox(
        checked = item.id == selection.value,
        label = item.label,
        description = item.description,
        onClick = {
            if (selection.value != item.id) {
                selection.value = item.id
                onSelectionChanged(item.id)
            }
        },
    )
}

/**
 * Вспомогательный объект для описания API и стиля компонента [RadioBoxGroup]
 */
object RadioBoxGroup {

    /**
     * Элемент группы.
     * @property id идентификатор элемента
     * @property label название элемента
     * @property description описание элемента
     */
    data class Item(
        val id: Any,
        val label: String? = null,
        val description: String? = null,
    )
}

/**
 * Вспомогательный объект для описания API и стиля компонента [RadioBox]
 */
object RadioBox
