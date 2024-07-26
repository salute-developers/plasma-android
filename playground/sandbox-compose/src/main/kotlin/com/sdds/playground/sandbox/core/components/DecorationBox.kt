package com.sdds.playground.sandbox.core.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.VisualTransformation
import com.sdds.playground.sandbox.core.components.TextFieldDefaults.AnimationDuration
import com.sdds.playground.sandbox.core.components.TextFieldDefaults.PlaceholderAnimationDelayOrDuration
import com.sdds.playground.sandbox.core.components.TextFieldDefaults.PlaceholderAnimationDuration

/**
 * Позаимствованная из material и упрощенная реализация декоратора для текстового поля.
 */
@Composable
internal fun CommonDecorationBox(
    value: String,
    innerTextField: @Composable () -> Unit,
    visualTransformation: VisualTransformation,
    label: @Composable (() -> Unit)?,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    singleLine: Boolean = false,
    isError: Boolean = false,
    interactionSource: InteractionSource,
    contentPadding: PaddingValues = TextFieldDefaults.textFieldPadding(),
) {
    val transformedText = remember(value, visualTransformation) {
        visualTransformation.filter(AnnotatedString(value))
    }.text.text

    val isFocused = interactionSource.collectIsFocusedAsState().value
    val inputState = when {
        isFocused -> InputPhase.Focused
        transformedText.isEmpty() -> InputPhase.UnfocusedEmpty
        else -> InputPhase.UnfocusedNotEmpty
    }

    val decorationBoxModifier = Modifier.semantics { if (isError) error("") }

    TextFieldTransitionScope.Transition(
        inputState = inputState,
        showLabel = label != null,
    ) { labelProgress, placeholderAlphaProgress ->

        val decoratedPlaceholder = @Composable {
            if (placeholder != null && transformedText.isEmpty()) {
                Box(modifier = Modifier.alpha(placeholderAlphaProgress)) {
                    placeholder.invoke()
                }
            }
        }

        TextFieldLayout(
            modifier = decorationBoxModifier,
            textField = innerTextField,
            placeholder = decoratedPlaceholder,
            label = label,
            leading = leadingIcon,
            trailing = trailingIcon,
            singleLine = singleLine,
            animationProgress = labelProgress,
            paddingValues = contentPadding,
        )
    }
}

private enum class InputPhase {
    Focused,
    UnfocusedEmpty,
    UnfocusedNotEmpty,
}

private object TextFieldTransitionScope {
    @Composable
    fun Transition(
        inputState: InputPhase,
        showLabel: Boolean,
        content: @Composable (
            labelProgress: Float,
            placeholderOpacity: Float,
        ) -> Unit,
    ) {
        val transition = updateTransition(inputState, label = "TextFieldInputState")

        val labelProgress by transition.animateFloat(
            label = "LabelProgress",
            transitionSpec = { tween(durationMillis = AnimationDuration) },
        ) {
            when (it) {
                InputPhase.Focused -> 1f
                InputPhase.UnfocusedEmpty -> 0f
                InputPhase.UnfocusedNotEmpty -> 1f
            }
        }

        val placeholderOpacity by transition.animateFloat(
            label = "PlaceholderOpacity",
            transitionSpec = {
                if (InputPhase.Focused isTransitioningTo InputPhase.UnfocusedEmpty) {
                    tween(
                        durationMillis = PlaceholderAnimationDelayOrDuration,
                        easing = LinearEasing,
                    )
                } else if (InputPhase.UnfocusedEmpty isTransitioningTo InputPhase.Focused ||
                    InputPhase.UnfocusedNotEmpty isTransitioningTo InputPhase.UnfocusedEmpty
                ) {
                    tween(
                        durationMillis = PlaceholderAnimationDuration,
                        delayMillis = PlaceholderAnimationDelayOrDuration,
                        easing = LinearEasing,
                    )
                } else {
                    spring()
                }
            },
        ) {
            when (it) {
                InputPhase.Focused -> 1f
                InputPhase.UnfocusedEmpty -> if (showLabel) 0f else 1f
                InputPhase.UnfocusedNotEmpty -> 0f
            }
        }

        content(
            labelProgress,
            placeholderOpacity,
        )
    }
}
