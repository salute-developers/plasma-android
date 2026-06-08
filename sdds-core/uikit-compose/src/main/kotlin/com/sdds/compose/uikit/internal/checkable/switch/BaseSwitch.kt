package com.sdds.compose.uikit.internal.checkable.switch

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.SwitchDimensionValues
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.graphics.maybeShapeable
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.switcher.SwitchMotionStyle
import com.sdds.compose.uikit.motion.components.switcher.rememberSwitchMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState

@Composable
internal fun BaseSwitch(
    active: Boolean,
    modifier: Modifier = Modifier,
    onActiveChanged: ((Boolean) -> Unit)? = null,
    style: SwitchStyle = LocalSwitchStyle.current,
    labelContent: (@Composable () -> Unit)? = null,
    descriptionContent: (@Composable () -> Unit)? = null,
    animationDuration: Int = Int.MIN_VALUE,
    enabled: Boolean = true,
    motion: Motion<SwitchMotionStyle> = rememberSwitchMotion(),
) {
    SideEffect {
        motion.context.semanticStateSource.set(
            SwitchStates.Checked,
            active,
        )
    }
    val backgroundShape by style.shapes.getValueAsState(motion.context)
    val toggleableModifier =
        if (onActiveChanged != null) {
            Modifier.toggleable(
                value = active,
                onValueChange = onActiveChanged,
                enabled = enabled,
                role = Role.Switch,
                interactionSource = motion.context.interactionSource,
                indication = LocalIndication.current.maybeShapeable(backgroundShape),
            )
        } else {
            Modifier
        }
    val backgroundColor = style.colorValues.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    val horizontal = style.dimensionValues.textPaddingValues.getValueAsState(motion.context)
    val vertical = style.dimensionValues.descriptionPaddingValues.getValueAsState(motion.context)
    BaseSwitchLayout(
        modifier = modifier
            .then(toggleableModifier)
            .backgroundBrush(
                { backgroundColor.value },
                backgroundShape,
            )
            .padding(style.dimensionValues.getPaddings(motion))
            .graphicsLayer { alpha = if (enabled) 1f else style.disableAlpha },
        switch = {
            SwitchToggle(
                active = active,
                thumbShape = style.toggleThumbShapes,
                trackShape = style.toggleTrackShapes,
                colors = style.colorValues,
                dimensions = style.dimensionValues,
                animationDuration = animationDuration,
                motion = motion,
            )
        },
        label = labelContent?.let { content ->
            {
                val color = style.colorValues.labelBrush.getBrushAsState(motion.context, motion.style.labelColor)
                val style by style.labelStyles.getTextStyleAsState(motion.context, motion.style.labelStyle)
                ProvideTextStyle(style, brush = { color.value }, content)
            }
        },
        description = descriptionContent?.let { content ->
            {
                val color = style.colorValues.descriptionBrush.getBrushAsState(
                    motion.context,
                    motion.style.descriptionColor,
                )
                val style by style.descriptionStyles.getTextStyleAsState(
                    motion.context,
                    motion.style.descriptionStyle,
                )
                ProvideTextStyle(style, brush = { color.value }, content)
            }
        },
        verticalSpacing = vertical,
        horizontalSpacing = horizontal,
    )
}

@Composable
private fun SwitchDimensionValues.getPaddings(
    motion: Motion<SwitchMotionStyle>,
) = PaddingValues(
    paddingStartValues.getValueAsState(motion.context).value,
    paddingTopValues.getValueAsState(motion.context).value,
    paddingEndValues.getValueAsState(motion.context).value,
    paddingBottomValues.getValueAsState(motion.context).value,
)
