package com.sdds.compose.uikit

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.checkable.BaseCheckableLayout
import com.sdds.compose.uikit.internal.checkable.RadioBoxControl
import com.sdds.compose.uikit.internal.checkable.checkableDescription
import com.sdds.compose.uikit.internal.checkable.checkableLabel
import com.sdds.compose.uikit.internal.checkable.radioBoxColors

/**
 * Компонент RadioBox
 * @param checked флаг-индикатор выбора
 * @param modifier модификатор
 * @param onClick слушатель нажатий
 * @param label лейбл
 * @param description описание
 * @param labelColor цвет лейбла
 * @param descriptionColor цвет описания
 * @param idleColor цвет бордера RadioButton, когда checked = false и focused = false
 * @param checkedColor цвет заполняющего круга RadioButton, когда checked = true
 * @param focusedColor цвет бордера RadioButton, когда focused = true
 * @param baseColor цвет основного круга RadioButton, когда checked = true
 * @param labelTextStyle стиль текста лейбла
 * @param descriptionTextStyle стиль текста описания
 * @param baseSize размер базового круга контрола
 * @param verticalSpacing расстояние между названием и описанием
 * @param horizontalSpacing расстояние между контролом и текстом ([label] или [description])
 * @param strokeWidth ширина линии в состоянии checked = false
 * @param checkedStrokeWidth ширина линии в состоянии checked = true
 * @param checkedPadding отступ в состоянии checked = true
 * @param controlSize размер заполняющего круга контрола
 * @param animationDuration длительность анимации
 * @param enabled включен ли компонент
 * @param interactionSource источник событий
 */
@Composable
fun RadioBox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    label: String? = null,
    description: String? = null,
    labelColor: Color = Color.Black,
    descriptionColor: Color = Color.Black,
    idleColor: Color = Color.Black,
    checkedColor: Color = Color.Gray,
    focusedColor: Color = Color.Green,
    baseColor: Color = Color.Green,
    labelTextStyle: TextStyle = TextStyle.Default,
    descriptionTextStyle: TextStyle = TextStyle.Default,
    baseSize: Dp = 10.dp,
    verticalSpacing: Dp = 2.dp,
    horizontalSpacing: Dp = 10.dp,
    strokeWidth: Dp = 2.dp,
    checkedStrokeWidth: Dp = 1.dp,
    checkedPadding: Dp = 2.dp,
    animationDuration: Int = 200,
    controlSize: Dp = 26.dp,
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
                checked = checked,
                focused = focusState.value,
                controlSize = controlSize,
                baseSize = baseSize,
                modifier = it,
                strokeWidth = strokeWidth,
                checkedStrokeWidth = checkedStrokeWidth,
                checkedPadding = checkedPadding,
                animationDuration = animationDuration,
                colors = radioBoxColors(
                    idleColor = idleColor,
                    checkedColor = checkedColor,
                    focusedColor = focusedColor,
                    baseColor = baseColor,
                ),
            )
        },
        label = checkableLabel(
            value = label,
            textStyle = labelTextStyle,
            color = labelColor,
        ),
        description = checkableDescription(
            value = description,
            textStyle = descriptionTextStyle,
            color = descriptionColor,
        ),
        verticalSpacing = verticalSpacing,
        horizontalSpacing = horizontalSpacing,
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
 * @param labelColor цвет лейбла
 * @param descriptionColor цвет описания
 * @param idleColor цвет бордера RadioButton, когда checked = false и focused = false
 * @param checkedColor цвет заполняющего круга RadioButton, когда checked = true
 * @param focusedColor цвет бордера RadioButton, когда focused = true
 * @param baseColor цвет основного круга RadioButton, когда checked = true
 * @param labelTextStyle стиль текста лейбла
 * @param descriptionTextStyle стиль текста описания
 * @param baseSize размер базового круга контрола
 * @param verticalSpacing расстояние между названием и описанием
 * @param horizontalSpacing расстояние между контролом и текстом ([label] или [description])
 * @param strokeWidth ширина линии в состоянии checked = false
 * @param checkedStrokeWidth ширина линии в состоянии checked = true
 * @param checkedPadding отступ в состоянии checked = true
 * @param controlSize размер заполняющего круга контрола
 * @param animationDuration длительность анимации
 */
@Composable
fun HorizontalRadioBoxGroup(
    items: List<RadioBoxGroup.Item>,
    modifier: Modifier = Modifier,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    default: Any? = null,
    onSelectionChanged: (Any) -> Unit = {},
    labelColor: Color = Color.Black,
    descriptionColor: Color = Color.Black,
    idleColor: Color = Color.Black,
    checkedColor: Color = Color.Gray,
    focusedColor: Color = Color.Green,
    baseColor: Color = Color.Green,
    labelTextStyle: TextStyle = TextStyle.Default,
    descriptionTextStyle: TextStyle = TextStyle.Default,
    baseSize: Dp = 10.dp,
    controlSize: Dp = 26.dp,
    verticalSpacing: Dp = 2.dp,
    horizontalSpacing: Dp = 10.dp,
    strokeWidth: Dp = 2.dp,
    checkedStrokeWidth: Dp = 1.dp,
    checkedPadding: Dp = 2.dp,
    animationDuration: Int = 200,
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
                labelColor = labelColor,
                descriptionColor = descriptionColor,
                labelTextStyle = labelTextStyle,
                descriptionTextStyle = descriptionTextStyle,
                idleColor = idleColor,
                checkedColor = checkedColor,
                focusedColor = focusedColor,
                baseColor = baseColor,
                baseSize = baseSize,
                controlSize = controlSize,
                verticalSpacing = verticalSpacing,
                horizontalSpacing = horizontalSpacing,
                strokeWidth = strokeWidth,
                checkedStrokeWidth = checkedStrokeWidth,
                checkedPadding = checkedPadding,
                animationDuration = animationDuration,
            )
        }
    }
}

/**
 * Горизонтальная группа [RadioBox]
 * @param items элементы группы
 * @param modifier модификатор
 * @param verticalArrangement способ распределения элементов по вертикали
 * @param horizontalAlignment выравнивание по горизонтали
 * @param default выбранный по умолчанию элемент
 * @param onSelectionChanged колбэк изменения выбора
 * @param labelColor цвет лейбла
 * @param descriptionColor цвет описания
 * @param idleColor цвет бордера RadioButton, когда checked = false и focused = false
 * @param checkedColor цвет заполняющего круга RadioButton, когда checked = true
 * @param focusedColor цвет бордера RadioButton, когда focused = true
 * @param baseColor цвет основного круга RadioButton, когда checked = true
 * @param labelTextStyle стиль текста лейбла
 * @param descriptionTextStyle стиль текста описания
 * @param baseSize размер базового круга контрола
 * @param verticalSpacing расстояние между названием и описанием
 * @param horizontalSpacing расстояние между контролом и текстом ([label] или [description])
 * @param strokeWidth ширина линии в состоянии checked = false
 * @param checkedStrokeWidth ширина линии в состоянии checked = true
 * @param checkedPadding отступ в состоянии checked = true
 * @param controlSize размер заполняющего круга контрола
 * @param animationDuration длительность анимации
 */
@Composable
fun VerticalRadioBoxGroup(
    items: List<RadioBoxGroup.Item>,
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    default: Any? = null,
    onSelectionChanged: (Any) -> Unit = {},
    labelColor: Color = Color.Black,
    descriptionColor: Color = Color.Black,
    idleColor: Color = Color.Black,
    checkedColor: Color = Color.Gray,
    focusedColor: Color = Color.Green,
    baseColor: Color = Color.Green,
    labelTextStyle: TextStyle = TextStyle.Default,
    descriptionTextStyle: TextStyle = TextStyle.Default,
    baseSize: Dp = 10.dp,
    controlSize: Dp = 26.dp,
    verticalSpacing: Dp = 2.dp,
    horizontalSpacing: Dp = 10.dp,
    strokeWidth: Dp = 2.dp,
    checkedStrokeWidth: Dp = 1.dp,
    checkedPadding: Dp = 2.dp,
    animationDuration: Int = 200,
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
                selection = selection,
                onSelectionChanged = onSelectionChanged,
                labelColor = labelColor,
                descriptionColor = descriptionColor,
                labelTextStyle = labelTextStyle,
                descriptionTextStyle = descriptionTextStyle,
                idleColor = idleColor,
                checkedColor = checkedColor,
                focusedColor = focusedColor,
                baseColor = baseColor,
                baseSize = baseSize,
                controlSize = controlSize,
                verticalSpacing = verticalSpacing,
                horizontalSpacing = horizontalSpacing,
                strokeWidth = strokeWidth,
                checkedStrokeWidth = checkedStrokeWidth,
                checkedPadding = checkedPadding,
                animationDuration = animationDuration,
            )
        }
    }
}

@Composable
private inline fun RadioBoxGroupItem(
    item: RadioBoxGroup.Item,
    labelColor: Color,
    descriptionColor: Color,
    idleColor: Color,
    checkedColor: Color,
    focusedColor: Color,
    baseColor: Color,
    labelTextStyle: TextStyle,
    descriptionTextStyle: TextStyle,
    baseSize: Dp,
    controlSize: Dp,
    verticalSpacing: Dp,
    horizontalSpacing: Dp,
    strokeWidth: Dp,
    checkedStrokeWidth: Dp,
    checkedPadding: Dp,
    animationDuration: Int,
    selection: MutableState<Any?>,
    crossinline onSelectionChanged: (Any) -> Unit,
) {
    RadioBox(
        checked = item.id == selection.value,
        label = item.label,
        description = item.description,
        labelColor = labelColor,
        descriptionColor = descriptionColor,
        idleColor = idleColor,
        checkedColor = checkedColor,
        focusedColor = focusedColor,
        baseColor = baseColor,
        labelTextStyle = labelTextStyle,
        descriptionTextStyle = descriptionTextStyle,
        baseSize = baseSize,
        controlSize = controlSize,
        verticalSpacing = verticalSpacing,
        horizontalSpacing = horizontalSpacing,
        strokeWidth = strokeWidth,
        checkedStrokeWidth = checkedStrokeWidth,
        checkedPadding = checkedPadding,
        animationDuration = animationDuration,
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
