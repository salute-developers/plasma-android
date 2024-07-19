package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.checkable.BaseCheckableLayout
import com.sdds.compose.uikit.internal.checkable.CheckBoxControl
import com.sdds.compose.uikit.internal.checkable.checkBoxColors
import com.sdds.compose.uikit.internal.checkable.checkableDescription
import com.sdds.compose.uikit.internal.checkable.checkableLabel
import com.sdds.compose.uikit.internal.checkable.checked

/**
 * Компонент CheckBox
 * @param checked установлен ли или снят флажок
 * @param modifier модификатор
 * @param onCheckedChange слушатель изменения состояния checked
 * @param enabled включен ли компонент
 * @param label лейбл
 * @param description описание
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
@Composable
fun CheckBox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    onCheckedChange: ((Boolean) -> Unit)? = null,
    enabled: Boolean = true,
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
    CheckBox(
        state = ToggleableState(checked),
        onClick = if (onCheckedChange != null) {
            { onCheckedChange(!checked) }
        } else {
            null
        },
        modifier = modifier,
        enabled = enabled,
        label = label,
        description = description,
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

/**
 * Компонент CheckBox
 * @param state состояние [ToggleableState]
 * @param onClick слушатель нажатий
 * @param modifier модификатор
 * @param label лейбл
 * @param description описание
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
@Composable
fun CheckBox(
    state: ToggleableState,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    enabled: Boolean = true,
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
    val focusState = interactionSource.collectIsFocusedAsState()
    val selectableModifier = if (onClick != null) {
        Modifier.selectable(
            selected = state.checked,
            onClick = onClick,
            enabled = enabled,
            role = Role.Checkbox,
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
            CheckBoxControl(
                state = state,
                focused = focusState.value,
                controlSize = controlSize,
                controlRadius = controlRadius,
                modifier = it,
                colors = checkBoxColors(
                    idleColor = idleColor,
                    checkedColor = checkedColor,
                    focusedColor = focusedColor,
                    baseColor = baseColor,
                ),
                strokeWidth = strokeWidth,
                checkedStrokeWidth = checkedStrokeWidth,
                innerCheckBoxPadding = innerCheckBoxPadding,
                animationDuration = animationDuration,
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
