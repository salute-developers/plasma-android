package com.sdds.compose.uikit.internal.checkable.radiobox

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.internal.checkable.BaseCheckableLayout

@Composable
internal fun BaseRadioBox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    style: RadioBoxStyle = LocalRadioBoxStyle.current,
    onClick: (() -> Unit)? = null,
    labelContent: (@Composable () -> Unit)? = null,
    descriptionContent: (@Composable () -> Unit)? = null,
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
                checked = checked,
                shape = style.shape,
                dimensions = style.dimensionValues,
                animationDuration = animationDuration,
                colors = style.colorValues,
                interactionSource = interactionSource,
                iconContent = null,
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
