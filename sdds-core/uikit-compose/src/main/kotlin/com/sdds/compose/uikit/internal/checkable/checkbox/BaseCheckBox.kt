package com.sdds.compose.uikit.internal.checkable.checkbox

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import com.sdds.compose.uikit.CheckBoxDimensionValues
import com.sdds.compose.uikit.CheckBoxStates
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.graphics.maybeShapeable
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.internal.checkable.BaseCheckableLayout
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.checkbox.CheckBoxMotionStyle
import com.sdds.compose.uikit.motion.components.checkbox.rememberCheckBoxMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState

@Composable
internal fun BaseCheckBox(
    state: ToggleableState,
    modifier: Modifier = Modifier,
    style: CheckBoxStyle = LocalCheckBoxStyle.current,
    onClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    labelContent: (@Composable () -> Unit)? = null,
    descriptionContent: (@Composable () -> Unit)? = null,
    motion: Motion<CheckBoxMotionStyle> = rememberCheckBoxMotion(),
) {
    SideEffect {
        motion.context.semanticStateSource.remove(CheckBoxStates.Checked, CheckBoxStates.Indeterminate)
        when (state) {
            ToggleableState.On -> motion.context.semanticStateSource.add(CheckBoxStates.Checked)
            ToggleableState.Indeterminate -> motion.context.semanticStateSource.add(CheckBoxStates.Indeterminate)
            ToggleableState.Off -> {}
        }
    }

    val backgroundShape by style.backgroundShapes.getValueAsState(motion.context)
    val clickableModifier = if (enabled && onClick != null) {
        Modifier.clickable(
            interactionSource = motion.context.interactionSource,
            indication = LocalIndication.current.maybeShapeable(backgroundShape),
            role = Role.Checkbox,
            onClick = onClick,
        )
    } else {
        Modifier
    }
    val selectableModifier = if (onClick != null) {
        Modifier.selection(
            selected = state.checked,
            semanticStateSource = motion.context.semanticStateSource,
        )
    } else {
        Modifier
    }
    val background = style.colorValues.backgroundColor.getBrushAsState(motion.context, motion.style.backgroundColor)
    BaseCheckableLayout(
        modifier = modifier
            .then(selectableModifier)
            .then(clickableModifier)
            .backgroundBrush(
                { background.value },
                backgroundShape,
            )
            .padding(style.dimensionValues.getContentPaddings(motion))
            .graphicsLayer { alpha = if (enabled) 1f else 0.4f },
        control = {
            CheckBoxControl(
                state = state,
                shape = style.shapes,
                colors = style.colorValues,
                dimensions = style.dimensionValues,
                animationDuration = style.animationDuration,
                icons = null,
                motion = motion,
            )
        },
        label = labelContent?.let { content ->
            {
                val labelColor = style.colorValues.labelBrush.getBrushAsState(
                    motion.context,
                    motion.style.labelColor,
                )
                val style by style.labelStyles.getTextStyleAsState(
                    motion.context,
                    motion.style.labelStyle,
                )
                ProvideTextStyle(style, brush = { labelColor.value }, content)
            }
        },
        description = descriptionContent?.let { content ->
            {
                val descriptionColor = style.colorValues.descriptionBrush.getBrushAsState(
                    motion.context,
                    motion.style.descriptionColor,
                )
                val style by style.descriptionStyles.getTextStyleAsState(
                    motion.context,
                    motion.style.descriptionStyle,
                )
                ProvideTextStyle(style, brush = { descriptionColor.value }, content)
            }
        },
        verticalSpacing = style.dimensionValues.descriptionPaddingValues.getValueAsState(motion.context),
        horizontalSpacing = style.dimensionValues.textPaddingValues.getValueAsState(motion.context),
    )
}

@Composable
private fun CheckBoxDimensionValues.getContentPaddings(
    motion: Motion<CheckBoxMotionStyle>,
) = PaddingValues(
    paddingStartValues.getValueAsState(motion.context).value,
    paddingTopValues.getValueAsState(motion.context).value,
    paddingEndValues.getValueAsState(motion.context).value,
    paddingBottomValues.getValueAsState(motion.context).value,
)
