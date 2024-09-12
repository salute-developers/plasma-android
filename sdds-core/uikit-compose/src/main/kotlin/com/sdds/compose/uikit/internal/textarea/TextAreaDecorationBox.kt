package com.sdds.compose.uikit.internal.textarea

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextField

/**
 * Реализация декоратора для многострочного текстового поля.
 */
@Composable
internal fun TextAreaDecorationBox(
    value: String,
    isError: Boolean = false,
    label: @Composable (() -> Unit)?,
    chips: @Composable (() -> Unit)? = null,
    innerTextField: @Composable () -> Unit,
    placeholder: @Composable (() -> Unit)? = null,
    icon: @Composable (() -> Unit)? = null,
    captionText: @Composable (() -> Unit)? = null,
    counterText: @Composable (() -> Unit)? = null,
    iconSize: Dp,
    paddings: TextArea.Paddings,
    scrollState: ScrollState,
    visualTransformation: VisualTransformation,
    animation: TextField.Animation,
    interactionSource: InteractionSource,
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

    val decorationBoxModifier = Modifier
        .semantics { if (isError) error("") }

    TextFieldTransitionScope.Transition(
        inputState = inputState,
        showLabel = label != null,
        animationDuration = animation.animationDuration,
        placeholderAnimationDuration = animation.placeholderAnimationDuration,
        placeholderAnimationDelayOrDuration = animation.placeholderAnimationDelayOrDuration,
    ) { labelProgress, placeholderAlphaProgress ->

        val decoratedPlaceholder = @Composable {
            if (placeholder != null && transformedText.isEmpty()) {
                Box(modifier = Modifier.alpha(placeholderAlphaProgress)) {
                    placeholder.invoke()
                }
            }
        }

        TextAreaLayout(
            modifier = decorationBoxModifier,
            textField = innerTextField,
            scrollState = scrollState,
            placeholder = decoratedPlaceholder,
            captionText = captionText,
            counterText = counterText,
            label = label,
            animationProgress = labelProgress,
            icon = icon,
            iconSize = iconSize,
            chips = chips,
            paddings = paddings,
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
        animationDuration: Int,
        placeholderAnimationDuration: Int,
        placeholderAnimationDelayOrDuration: Int,
        content: @Composable (
            labelProgress: Float,
            placeholderOpacity: Float,
        ) -> Unit,
    ) {
        val transition = updateTransition(inputState, label = "TextFieldInputState")

        val labelProgress by transition.animateFloat(
            label = "LabelProgress",
            transitionSpec = { tween(durationMillis = animationDuration) },
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
                        durationMillis = placeholderAnimationDelayOrDuration,
                        easing = LinearEasing,
                    )
                } else if (InputPhase.UnfocusedEmpty isTransitioningTo InputPhase.Focused ||
                    InputPhase.UnfocusedNotEmpty isTransitioningTo InputPhase.UnfocusedEmpty
                ) {
                    tween(
                        durationMillis = placeholderAnimationDuration,
                        delayMillis = placeholderAnimationDelayOrDuration,
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
