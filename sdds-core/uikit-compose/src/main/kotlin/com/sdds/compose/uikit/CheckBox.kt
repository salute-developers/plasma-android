package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.uikit.internal.checkable.BaseCheckableLayout
import com.sdds.compose.uikit.internal.checkable.CheckBoxControl
import com.sdds.compose.uikit.internal.checkable.checkableDescription
import com.sdds.compose.uikit.internal.checkable.checkableLabel
import com.sdds.compose.uikit.internal.checkable.checked

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
                modifier = it,
                colors = style.colors,
                dimensions = style.dimensions,
                animationDuration = style.animationDuration,
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
 * Вспомогательный объект для описания API и стиля компонента
 */
object CheckBox
