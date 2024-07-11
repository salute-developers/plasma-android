package com.sdds.playground.sandbox.core.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

/**
 * Компонент RadioBox
 * @param checked флаг-индикатор выбора
 * @param onClick слушатель нажатий
 * @param modifier модификатор
 * @param size размер
 * @param label лейбл
 * @param description описание
 * @param enabled включен ли компонент
 * @param interactionSource
 */
@Composable
fun SandboxRadioBox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    size: SandboxRadioBox.Size = SandboxRadioBox.Size.M,
    label: String? = null,
    description: String? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dimensions = size.getDimensions()
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
                checked = checked,
                focused = focusState.value,
                controlSize = size.value,
                baseSize = dimensions.baseSize,
                modifier = it,
            )
        },
        label = checkableLabel(
            value = label,
            textStyle = labelTextStyleFor(size),
            color = DefaultTheme.colors.textDefaultPrimary,
        ),
        description = checkableDescription(
            value = description,
            textStyle = descriptionTextStyleFor(size),
            color = DefaultTheme.colors.textDefaultSecondary,
        ),
        verticalSpacing = dimensions.verticalSpacing,
        horizontalSpacing = dimensions.horizontalSpacing,
    )
}

/**
 * Горизонтальная группа [SandboxRadioBox]
 * @param items элементы группы
 * @param modifier модификатор
 * @param horizontalArrangement способ распределения элементов по горизонтали
 * @param verticalAlignment выравнивание по вертикали
 * @param size размер [SandboxRadioBox]
 * @param default выбранный по умолчанию элемент
 * @param onSelectionChanged колбэк изменения выбора
 */
@Composable
fun HorizontalRadioBoxGroup(
    items: List<SandboxRadioBoxGroup.Item>,
    modifier: Modifier = Modifier,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    size: SandboxRadioBox.Size = SandboxRadioBox.Size.M,
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
                size = size,
                selection = selection,
                onSelectionChanged = onSelectionChanged,
            )
        }
    }
}

/**
 * Вертикальная группа [SandboxRadioBox]
 * @param items элементы группы
 * @param modifier модификатор
 * @param verticalArrangement способ распределения элементов по вертикали
 * @param horizontalAlignment выравнивание по горизонтали
 * @param size размер [SandboxRadioBox]
 * @param default выбранный по умолчанию элемент
 * @param onSelectionChanged колбэк изменения выбора
 */
@Composable
fun VerticalRadioBoxGroup(
    items: List<SandboxRadioBoxGroup.Item>,
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    size: SandboxRadioBox.Size = SandboxRadioBox.Size.M,
    default: Any? = null,
    onSelectionChanged: (Any) -> Unit = {},
) {
    val selection = remember { mutableStateOf(default) }
    Column(
        modifier = modifier,
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
    ) {
        items.forEach { item ->
            RadioBoxGroupItem(
                item = item,
                size = size,
                selection = selection,
                onSelectionChanged = onSelectionChanged,
            )
        }
    }
}

@Composable
private inline fun RadioBoxGroupItem(
    item: SandboxRadioBoxGroup.Item,
    size: SandboxRadioBox.Size,
    selection: MutableState<Any?>,
    crossinline onSelectionChanged: (Any) -> Unit,
) {
    SandboxRadioBox(
        checked = item.id == selection.value,
        label = item.label,
        description = item.description,
        size = size,
        onClick = {
            if (selection.value != item.id) {
                selection.value = item.id
                onSelectionChanged(item.id)
            }
        },
    )
}

/**
 * Параметры для [HorizontalRadioBoxGroup] и [VerticalRadioBoxGroup]
 */
object SandboxRadioBoxGroup {

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
 * Параметры компонента [SandboxRadioBox]
 */
object SandboxRadioBox {

    /**
     * Размер компонента
     *
     * @property value значение размера
     */
    enum class Size(val value: Dp) {
        M(26.dp),
        S(20.dp),
    }
}

private data class Dimensions(
    val baseSize: Dp,
    val verticalSpacing: Dp,
    val horizontalSpacing: Dp,

)

private fun SandboxRadioBox.Size.getDimensions(): Dimensions =
    when (this) {
        SandboxRadioBox.Size.M -> Dimensions(
            baseSize = 10.dp,
            verticalSpacing = 2.dp,
            horizontalSpacing = 10.dp,
        )

        SandboxRadioBox.Size.S -> Dimensions(
            baseSize = 8.dp,
            verticalSpacing = 2.dp,
            horizontalSpacing = 8.dp,
        )
    }

@Composable
private fun labelTextStyleFor(size: SandboxRadioBox.Size): TextStyle =
    when (size) {
        SandboxRadioBox.Size.M -> DefaultTheme.typography.bodyMNormal
        SandboxRadioBox.Size.S -> DefaultTheme.typography.bodySNormal
    }

@Composable
private fun descriptionTextStyleFor(size: SandboxRadioBox.Size): TextStyle =
    when (size) {
        SandboxRadioBox.Size.M -> DefaultTheme.typography.bodySNormal
        SandboxRadioBox.Size.S -> DefaultTheme.typography.bodyXsNormal
    }

/**
 * Превью [SandboxRadioBox]
 */
@Composable
@Preview(showBackground = true)
fun SandboxRadioBoxExample() {
    DefaultTheme {
        SandboxRadioBox(
            checked = true,
            label = "Label",
            description = "Description",
            onClick = {},
        )
    }
}
