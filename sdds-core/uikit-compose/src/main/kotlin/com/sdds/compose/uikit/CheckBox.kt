package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.internal.checkable.checkbox.BaseCheckBox

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
@NonRestartableComposable
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
@NonRestartableComposable
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
    BaseCheckBox(
        state = state,
        modifier = modifier,
        style = style,
        onClick = onClick,
        enabled = enabled,
        labelContent = label?.let {
            {
                Text(it)
            }
        },
        descriptionContent = description?.let {
            {
                Text(description)
            }
        },
        interactionSource = interactionSource,
    )
}

/**
 * Компонент CheckBox
 * @param state состояние [ToggleableState]
 * @param labelContent лейбл
 * @param onClick слушатель нажатий
 * @param modifier модификатор
 * @param style стиль компонента
 * @param enabled включен ли компонент
 * @param descriptionContent описание
 * @param interactionSource источник событий
 */
@Composable
@NonRestartableComposable
fun CheckBox(
    state: ToggleableState,
    labelContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: CheckBoxStyle = LocalCheckBoxStyle.current,
    onClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    descriptionContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseCheckBox(
        state = state,
        modifier = modifier,
        style = style,
        onClick = onClick,
        enabled = enabled,
        labelContent = labelContent,
        descriptionContent = descriptionContent,
        interactionSource = interactionSource,
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
