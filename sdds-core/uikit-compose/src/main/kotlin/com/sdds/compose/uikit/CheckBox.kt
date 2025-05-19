package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.internal.checkable.BaseCheckableLayout
import com.sdds.compose.uikit.internal.checkable.checkableDescription
import com.sdds.compose.uikit.internal.checkable.checkableLabel
import com.sdds.compose.uikit.internal.checkable.checkbox.CheckBoxControl
import com.sdds.compose.uikit.internal.checkable.checkbox.checked

/**
 * Компонент CheckBox
 * @param checked установлен ли или снят флажок
 * @param modifier модификатор
 * @param style стиль компонента
 * @param onCheckedChange слушатель изменения состояния checked
 * @param enabled включен ли компонент
 * @param label лейбл
 * @param description описание
 * @param interactionSource источник событий
 */
@Composable
fun CheckBox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    style: CheckBoxStyle = LocalCheckBoxStyle.current,
    onCheckedChange: ((Boolean) -> Unit)? = null,
    enabled: Boolean = true,
    label: String? = null,
    description: String? = null,
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
        style = style,
        enabled = enabled,
        label = label,
        description = description,
        interactionSource = interactionSource,
    )
}

/**
 * Компонент CheckBox
 * @param state состояние [ToggleableState]
 * @param onClick слушатель нажатий
 * @param modifier модификатор
 * @param style стиль компонента
 * @param label лейбл
 * @param description описание
 * @param enabled включен ли компонент
 * @param interactionSource источник событий
 */
@Composable
fun CheckBox(
    state: ToggleableState,
    modifier: Modifier = Modifier,
    style: CheckBoxStyle = LocalCheckBoxStyle.current,
    onClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    label: String? = null,
    description: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
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

    val descriptionColor = style.colorValues.descriptionColor.colorForInteraction(interactionSource)
    val labelColor = style.colorValues.labelColor.colorForInteraction(interactionSource)

    BaseCheckableLayout(
        modifier = modifier
            .then(selectableModifier)
            .graphicsLayer { alpha = if (enabled) 1f else 0.4f },
        control = {
            CheckBoxControl(
                state = state,
                shape = style.shape,
                modifier = it,
                colors = style.colorValues,
                dimensions = style.dimensionValues,
                animationDuration = style.animationDuration,
                icons = null,
                interactionSource = interactionSource,
            )
        },
        label = checkableLabel(
            value = label,
            textStyle = style.labelStyle,
            color = labelColor,
        ),
        description = checkableDescription(
            value = description,
            textStyle = style.descriptionStyle,
            color = descriptionColor,
        ),
        verticalSpacing = style.dimensionValues.descriptionPadding,
        horizontalSpacing = style.dimensionValues.textPadding,
    )
}

/**
 * Состояния CheckBox
 */
enum class CheckBoxStates : ValueState {
    /**
     * CheckBox выбран
     */
    Checked,

    /**
     * Indeterminate состояние
     */
    Indeterminate,
}

@Composable
@Preview
private fun CheckBoxPreview() {
    CheckBox(
        modifier = Modifier.padding(8.dp),
        state = ToggleableState.Indeterminate,
        label = "label",
        style = CheckBoxStyle
            .builder()
            .dimensionValues {
                togglePadding(0.dp)
                toggleIconWidth(10.dp)
                toggleIconHeight(10.dp)
            }
            .style(),
        description = "description",
    )
}
