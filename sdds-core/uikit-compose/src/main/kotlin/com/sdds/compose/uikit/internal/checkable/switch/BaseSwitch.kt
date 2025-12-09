package com.sdds.compose.uikit.internal.checkable.switch

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.SwitchDimensionValues
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.SwitchStyle

@Composable
internal fun BaseSwitch(
    active: Boolean,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    style: SwitchStyle = LocalSwitchStyle.current,
    labelContent: (@Composable () -> Unit)? = null,
    descriptionContent: (@Composable () -> Unit)? = null,
    animationDuration: Int = style.animationDurationMillis,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val stateSet = remember(active) { if (active) setOf(SwitchStates.Checked) else emptySet() }
    val toggleableModifier =
        if (onActiveChanged != null) {
            Modifier.toggleable(
                value = active,
                onValueChange = onActiveChanged,
                enabled = enabled,
                role = Role.Switch,
                interactionSource = interactionSource,
                indication = null,
            )
        } else {
            Modifier
        }
    val backgroundColor by style.colorValues.backgroundColor.colorForInteractionAsState(interactionSource, stateSet)
    val paddings = style.dimensionValues.getPaddings()
    BaseSwitchLayout(
        modifier = modifier
            .then(toggleableModifier)
            .background(backgroundColor, style.shape)
            .padding(paddings)
            .graphicsLayer { alpha = if (enabled) 1f else style.disableAlpha },
        switch = {
            SwitchToggle(
                active = active,
                thumbShape = style.toggleThumbShape,
                trackShape = style.toggleTrackShape,
                colors = style.colorValues,
                dimensions = style.dimensionValues,
                animationDuration = animationDuration,
                interactionSource = interactionSource,
            )
        },
        label = labelContent?.let { content ->
            {
                val labelColor = style.colorValues.labelColor
                    .colorForInteractionAsState(interactionSource, stateSet)
                ProvideTextStyle(style.labelStyle, color = { labelColor.value }, content)
            }
        },
        description = descriptionContent?.let { content ->
            {
                val descriptionColor = style.colorValues.descriptionColor
                    .colorForInteractionAsState(interactionSource, stateSet)
                ProvideTextStyle(style.descriptionStyle, color = { descriptionColor.value }, content)
            }
        },
        verticalSpacing = style.dimensionValues.descriptionPadding,
        horizontalSpacing = style.dimensionValues.textPadding,
    )
}

private fun SwitchDimensionValues.getPaddings(): PaddingValues {
    return PaddingValues(
        start = paddingStart,
        top = paddingTop,
        end = paddingEnd,
        bottom = paddingBottom,
    )
}
