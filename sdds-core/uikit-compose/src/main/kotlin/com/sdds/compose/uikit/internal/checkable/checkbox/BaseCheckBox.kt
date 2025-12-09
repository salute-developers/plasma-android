package com.sdds.compose.uikit.internal.checkable.checkbox

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.internal.checkable.BaseCheckableLayout

@Composable
internal fun BaseCheckBox(
    state: ToggleableState,
    modifier: Modifier = Modifier,
    style: CheckBoxStyle = LocalCheckBoxStyle.current,
    onClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    labelContent: (@Composable () -> Unit)? = null,
    descriptionContent: (@Composable () -> Unit)? = null,
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

    BaseCheckableLayout(
        modifier = modifier
            .then(selectableModifier)
            .graphicsLayer { alpha = if (enabled) 1f else 0.4f },
        control = {
            CheckBoxControl(
                state = state,
                shape = style.shape,
                colors = style.colorValues,
                dimensions = style.dimensionValues,
                animationDuration = style.animationDuration,
                icons = null,
                interactionSource = interactionSource,
            )
        },
        label = labelContent?.let { content ->
            {
                val labelColor = style.colorValues.labelColor.colorForInteractionAsState(interactionSource)
                ProvideTextStyle(style.labelStyle, color = { labelColor.value }, content)
            }
        },
        description = descriptionContent?.let { content ->
            {
                val descriptionColor = style.colorValues.descriptionColor.colorForInteractionAsState(interactionSource)
                ProvideTextStyle(style.descriptionStyle, color = { descriptionColor.value }, content)
            }
        },
        verticalSpacing = style.dimensionValues.descriptionPadding,
        horizontalSpacing = style.dimensionValues.textPadding,
    )
}
