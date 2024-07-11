@file:Suppress("LongParameterList", "LongMethod")

package com.sdds.playground.sandbox.core.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.playground.sandbox.core.components.SandboxTextField.LabelType
import com.sdds.playground.sandbox.core.components.SandboxTextField.Size
import com.sdds.playground.sandbox.core.components.SandboxTextField.State
import com.sdds.playground.sandbox.core.components.TextFieldDefaults.AnimationDuration
import com.sdds.playground.sandbox.core.components.TextFieldDefaults.TextFieldPadding
import com.sdds.playground.sandbox.core.components.TextFieldDefaults.textFieldColors
import com.sdds.playground.sandbox.core.components.TextFieldDefaults.textFieldShapeFor
import com.sdds.playground.sandbox.core.components.TextFieldDefaults.textFieldStyles

/**
 * Базовый composable текстового поля
 * @param value текст в поле ввода
 * @param onValueChange callback для изменения текста при вводе
 * @param modifier Modifier для дополнительного изменения компонента, по умолчанию пустой
 * @param enabled если false - фокусировка, ввод текста и копирование отключены
 * @param readOnly если false - доступно только для чтения, запись отключена
 * @param keyboardOptions для настройки клавиатуры, например [KeyboardType] или [ImeAction]
 * @param keyboardActions когда на ввод подается [ImeAction] вызывается соответствующий callback
 * @param visualTransformation фильтр визуального отображения, например [PasswordVisualTransformation]
 * @param placeholderText заглушка если пустое [value] и тип [SandboxTextField.LabelType.Outer]
 * @param labelType тип отображения лэйбла: [LabelType.Outer] снаружи поля ввода, [LabelType.Inner] внутри поля ввода
 * @param labelText текст лэйбла
 * @param state текущее состояние TextField
 * @param size высота поля ввода, по умолчанию
 * @param captionText текст подписи под полем ввода
 * @param leadingIcon иконка, которая будет находиться в начале поля ввода
 * @param trailingIcon иконка, которая будет находиться в конце поля ввода
 * @param interactionSource источник взаимодействия с полем
 * @param colors цвета поля
 * @param textStyles текстовые стили поля
 */
@Composable
internal fun BaseTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    placeholderText: String? = null,
    labelType: LabelType = LabelType.Outer,
    labelText: String = "",
    state: State = State.Normal,
    size: Size = Size.L,
    captionText: String? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TextFieldColors = textFieldColors(),
    textStyles: TextFieldStyles = textFieldStyles(),
) {
    val isFocused = interactionSource.collectIsFocusedAsState().value
    val inputState = state.toInputState(enabled, isFocused, readOnly)

    Column(
        modifier = modifier
            .fillMaxWidth()
            .graphicsLayer {
                alpha = if (enabled) TextFieldDefaults.EnabledAlpha else TextFieldDefaults.DisabledAlpha
            },
    ) {
        TextFieldColorsTransitionScope.NoTransition(
            inputState = inputState,
            labelType = labelType,
            colors = colors,
        ) { backgroundColor, labelColor, captionColor, placeholderColor, valueColor, leadIconColor, trailIconColor ->
            if (labelType == LabelType.Outer && labelText.isNotEmpty()) {
                OuterLabel(
                    labelText = labelText,
                    textStyle = textStyles.outerLabelStyle(size).value,
                    color = labelColor,
                )
            }

            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(textFieldShapeFor(size))
                    .height(size.value)
                    .drawBehind { drawRect(backgroundColor) },
                enabled = enabled,
                readOnly = readOnly,
                textStyle = textStyles.valueStyle(size).value.copy(color = valueColor),
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                singleLine = true,
                visualTransformation = visualTransformation,
                interactionSource = interactionSource,
                cursorBrush = SolidColor(colors.cursorColor(inputState).value),
            ) {
                CommonDecorationBox(
                    value = value.text,
                    innerTextField = it,
                    contentPadding = TextFieldDefaults.textFieldPadding(size = size, labelType = labelType),
                    singleLine = true,
                    visualTransformation = visualTransformation,
                    interactionSource = interactionSource,
                    label = innerLabel(
                        labelType = labelType,
                        size = size,
                        color = labelColor,
                        labelText = labelText,
                        style = textStyles.innerLabelStyle(
                            size = size,
                            isFocused = isFocused,
                            isEmpty = value.text.isEmpty(),
                        ).value,
                    ),
                    placeholder = placeholder(
                        placeholderText,
                        textStyles.placeholderStyle(size).value,
                        placeholderColor,
                    ),
                    leadingIcon = leadingIcon(
                        leadingIcon,
                        leadIconColor,
                        TextFieldDefaults.textFieldIconSize(size),
                    ),
                    trailingIcon = trailingIcon(
                        trailingIcon,
                        trailIconColor,
                        TextFieldDefaults.textFieldIconSize(size),
                    ),
                )
            }
            CaptionText(
                captionText,
                textStyles.captionStyle(size).value,
                captionColor,
            )
        }
    }
}

/**
 * Состояние текстового поля
 */
internal enum class InputState {
    Normal,
    Focused,
    Error,
    Warning,
    Success,
    ReadOnly,
}

@Composable
private fun OuterLabel(
    labelText: String,
    textStyle: TextStyle,
    color: Color,
) {
    Text(
        text = labelText,
        style = textStyle,
        color = color,
        textAlign = TextAlign.Start,
    )
    Spacer(modifier = Modifier.size(12.dp))
}

private fun trailingIcon(
    trailingIcon: @Composable (() -> Unit)?,
    tint: Color,
    size: Dp,
): @Composable (() -> Unit)? {
    if (trailingIcon == null) return null
    return {
        Box(
            modifier = Modifier
                .padding(end = TextFieldPadding)
                .size(size),
        ) {
            CompositionLocalProvider(LocalTint provides tint) {
                trailingIcon.invoke()
            }
        }
    }
}

private fun leadingIcon(
    leadingIcon: @Composable (() -> Unit)?,
    tint: Color,
    size: Dp,
): @Composable (() -> Unit)? {
    if (leadingIcon == null) return null
    return {
        Box(
            modifier = Modifier
                .padding(start = TextFieldPadding)
                .size(size),
        ) {
            CompositionLocalProvider(LocalTint provides tint) {
                leadingIcon.invoke()
            }
        }
    }
}

private fun innerLabel(
    labelType: LabelType,
    size: Size,
    color: Color,
    labelText: String,
    style: TextStyle,
): @Composable (() -> Unit)? {
    if (labelType != LabelType.Inner || size == Size.XS || labelText.isEmpty()) return null
    return {
        Text(
            text = labelText,
            style = style,
            color = color,
        )
    }
}

private fun placeholder(
    placeholder: String?,
    textStyle: TextStyle,
    color: Color,
): @Composable (() -> Unit)? {
    if (placeholder == null) return null
    return {
        Text(
            text = placeholder,
            style = textStyle,
            color = color,
        )
    }
}

@Composable
private fun CaptionText(
    captionText: String?,
    style: TextStyle,
    color: Color,
) {
    val isVisible by remember(captionText) { mutableStateOf(captionText != null) }
    val density = LocalDensity.current
    AnimatedVisibility(
        visible = isVisible,
        enter = slideInVertically(
            initialOffsetY = { with(density) { -6.dp.roundToPx() } },
            animationSpec = tween(
                durationMillis = AnimationDuration,
                easing = EaseOut,
            ),
        ) + fadeIn(
            initialAlpha = 0f,
            animationSpec = tween(
                durationMillis = AnimationDuration,
                easing = EaseOut,
            ),
        ),
        exit = slideOutVertically(
            targetOffsetY = { with(density) { -6.dp.roundToPx() } },
            animationSpec = tween(
                durationMillis = AnimationDuration,
                easing = EaseOut,
            ),
        ) + fadeOut(
            targetAlpha = 0f,
            animationSpec = tween(
                durationMillis = AnimationDuration,
                easing = EaseOut,
            ),
        ),
    ) {
        Text(
            text = captionText.orEmpty(),
            style = style,
            color = color,
            modifier = Modifier.padding(4.dp),
        )
    }
}

private fun State.toInputState(
    enabled: Boolean,
    isFocused: Boolean,
    readOnly: Boolean,
): InputState {
    return when {
        readOnly -> InputState.ReadOnly
        isFocused -> InputState.Focused
        !enabled -> InputState.Normal
        else -> when (this) {
            State.Normal -> InputState.Normal
            State.Error -> InputState.Error
            State.Warning -> InputState.Warning
            State.Success -> InputState.Success
        }
    }
}

private object TextFieldColorsTransitionScope {

    @Composable
    fun NoTransition(
        inputState: InputState,
        labelType: LabelType,
        colors: TextFieldColors,
        content: @Composable (
            backgroundColor: Color,
            labelColor: Color,
            captionColor: Color,
            placeholderColor: Color,
            valueColor: Color,
            leadingIconColor: Color,
            trailingIconColor: Color,
        ) -> Unit,
    ) {
        content(
            colors.backgroundColor(inputState).value,
            colors.labelColor(inputState, labelType).value,
            colors.captionColor(inputState).value,
            colors.placeholderColor(inputState).value,
            colors.valueColor(inputState).value,
            colors.leadingIconColor(inputState).value,
            colors.trailingIconColor(inputState).value,
        )
    }

    @Composable
    fun Transition(
        inputState: InputState,
        labelType: LabelType,
        colors: TextFieldColors,
        content: @Composable (
            backgroundColor: Color,
            labelColor: Color,
            captionColor: Color,
            placeholderColor: Color,
            valueColor: Color,
            leadingIconColor: Color,
            trailingIconColor: Color,
        ) -> Unit,
    ) {
        val transition = updateTransition(inputState, label = "TextFieldColors")

        val backgroundColor by transition.animateColor(
            transitionSpec = {
                tween(
                    durationMillis = AnimationDuration,
                    easing = EaseOut,
                )
            },
            label = "backgroundColor",
        ) {
            colors.backgroundColor(state = it).value
        }

        val labelColor by transition.animateColor(
            transitionSpec = {
                tween(
                    durationMillis = AnimationDuration,
                    easing = EaseOut,
                )
            },
            label = "labelColor",
        ) {
            colors.labelColor(it, labelType).value
        }

        val valueColor by transition.animateColor(
            transitionSpec = {
                tween(
                    durationMillis = AnimationDuration,
                    easing = EaseOut,
                )
            },
            label = "valueColor",
        ) {
            colors.valueColor(it).value
        }

        val captionColor by transition.animateColor(
            transitionSpec = {
                tween(
                    durationMillis = AnimationDuration,
                    easing = EaseOut,
                )
            },
            label = "captionColor",
        ) {
            colors.captionColor(it).value
        }

        val placeholderColor by transition.animateColor(
            transitionSpec = {
                tween(
                    durationMillis = AnimationDuration,
                    easing = EaseOut,
                )
            },
            label = "placeholderColor",
        ) {
            colors.placeholderColor(it).value
        }

        val leadingIconColor by transition.animateColor(
            transitionSpec = {
                tween(
                    durationMillis = AnimationDuration,
                    easing = EaseOut,
                )
            },
            label = "leadingIconColor",
        ) {
            colors.leadingIconColor(it).value
        }

        val trailingIconColor by transition.animateColor(
            transitionSpec = {
                tween(
                    durationMillis = AnimationDuration,
                    easing = EaseOut,
                )
            },
            label = "trailingIconColor",
        ) {
            colors.trailingIconColor(it).value
        }

        content(
            backgroundColor,
            labelColor,
            captionColor,
            placeholderColor,
            valueColor,
            leadingIconColor,
            trailingIconColor,
        )
    }
}
