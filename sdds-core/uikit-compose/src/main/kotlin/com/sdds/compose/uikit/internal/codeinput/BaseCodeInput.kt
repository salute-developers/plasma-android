package com.sdds.compose.uikit.internal.codeinput

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.keyframes
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.LocalCodeInputStyle
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.codeinput.CodeInputDefaults.DefaultShakeCount
import com.sdds.compose.uikit.internal.codeinput.CodeInputDefaults.DefaultShakeOffsetDp
import com.sdds.compose.uikit.internal.codeinput.CodeInputDefaults.defaultCodeGroups
import com.sdds.compose.uikit.internal.common.StyledText

@Composable
@Suppress("LongMethod")
internal fun BaseCodeInput(
    modifier: Modifier = Modifier,
    style: CodeInputStyle = LocalCodeInputStyle.current,
    onCodeComplete: (String) -> Boolean = { true },
    isItemValid: (String) -> Boolean = { true },
    caption: String? = null,
    captionAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    hidden: Boolean = false,
    enabled: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    codeGroupInfo: CodeGroupInfo = remember { defaultCodeGroups() },
) {
    var code by remember { mutableStateOf("") }

    var inputEnabled by remember { mutableStateOf(true) }
    var isCodeValid by remember { mutableStateOf(true) }
    var isCaptionError by remember { mutableStateOf(false) }
    val captionErrorState = remember(isCaptionError) {
        if (!isCaptionError) emptySet() else setOf(CodeInputStates.Error)
    }

    val dimensions = style.dimensions
    val colors = style.colors

    Column {
        BasicTextField(
            modifier = modifier,
            value = code,
            singleLine = true,
            enabled = enabled,
            keyboardActions = keyboardActions,
            keyboardOptions = keyboardOptions,
            onValueChange = { newValue ->
                if (inputEnabled && newValue.length <= codeGroupInfo.codeLength) {
                    code = newValue
                    if (newValue.length == codeGroupInfo.codeLength && isItemValid.invoke(
                            newValue.last().toString(),
                        )
                    ) {
                        isCodeValid = onCodeComplete.invoke(newValue)
                        isCaptionError = !isCodeValid
                    } else {
                        isCaptionError = false
                    }
                }
            },
            decorationBox = { _ ->
                val shakeOffset by rememberShakeAnimation(
                    isActive = !isCodeValid,
                    onStart = { inputEnabled = false },
                    onFinish = {
                        inputEnabled = true
                        isCodeValid = true
                        code = ""
                    },
                )
                Row(
                    modifier = Modifier
                        .graphicsLayer { translationX = shakeOffset },
                    horizontalArrangement = Arrangement.spacedBy(dimensions.itemSpacing),
                ) {
                    repeat(codeGroupInfo.groupCount) { groupIndex ->
                        repeat(codeGroupInfo.groups[groupIndex]) { itemIndex ->
                            val absoluteIndex = codeGroupInfo.groups.take(groupIndex).sum() + itemIndex
                            val char = if (absoluteIndex < code.length) {
                                code[absoluteIndex].toString()
                            } else {
                                null
                            }

                            Box(
                                modifier = Modifier
                                    .requiredHeight(dimensions.itemHeight.getDefaultValue())
                                    .requiredWidth(dimensions.itemWidth.getDefaultValue()),
                                contentAlignment = Alignment.Center,
                            ) {
                                Item(
                                    char = char,
                                    hidden = hidden,
                                    isItemValid = isItemValid,
                                    isCodeValid = isCodeValid,
                                    onStartShake = { inputEnabled = false },
                                    onShakeComplete = {
                                        inputEnabled = true
                                        code = code.dropLast(1)
                                    },
                                    style = style,
                                    interactionSource = interactionSource,
                                )
                            }
                        }
                        if (groupIndex != codeGroupInfo.groups.lastIndex) {
                            Spacer(Modifier.width(dimensions.groupSpacing))
                        }
                    }
                }
            },
        )

        if (!caption.isNullOrEmpty()) {
            StyledText(
                text = caption,
                textStyle = style.captionStyle,
                textColor = colors.captionColor.getValue(interactionSource, captionErrorState),
                modifier = Modifier
                    .padding(top = dimensions.captionPadding)
                    .align(captionAlignment),
            )
        }
    }
}

@Composable
private fun rememberShakeAnimation(
    isActive: Boolean,
    onStart: () -> Unit,
    onFinish: () -> Unit,
    shakeCount: Int = DefaultShakeCount,
    shakeOffsetPx: Float = with(LocalDensity.current) { DefaultShakeOffsetDp.dp.toPx() },
): State<Float> {
    val animatable = remember { Animatable(0f) }

    if (isActive && shakeCount != 0) {
        val animationSpec: AnimationSpec<Float> = keyframes {
            durationMillis = 300
            for (i in 1..shakeCount * 2) {
                val offset = if (i % 2 == 0) shakeOffsetPx else -shakeOffsetPx
                offset at i * (durationMillis / (shakeCount * 2))
            }
            0f at durationMillis
        }

        LaunchedEffect(animatable) {
            onStart.invoke()
            animatable.animateTo(1f, animationSpec = animationSpec)
            onFinish.invoke()
        }
    }

    return animatable.asState()
}

@Composable
private fun Item(
    char: String?,
    hidden: Boolean,
    isItemValid: (String) -> Boolean,
    isCodeValid: Boolean,
    onStartShake: () -> Unit,
    onShakeComplete: () -> Unit,
    style: CodeInputStyle,
    interactionSource: InteractionSource,
) {
    val itemValid = char?.let { isItemValid.invoke(it) } ?: true
    val errorStateSet = remember(itemValid, isCodeValid) {
        if (itemValid && isCodeValid) emptySet() else setOf(CodeInputStates.Error)
    }
    if (char != null) {
        val shakeOffset by rememberShakeAnimation(
            isActive = !itemValid,
            onStart = onStartShake,
            onFinish = onShakeComplete,
        )
        if (hidden || !itemValid) {
            FilledDot(
                modifier = Modifier
                    .graphicsLayer {
                        translationX = shakeOffset
                    },
                color = style.colors.fillColor.getValue(interactionSource, errorStateSet),
                size = style.dimensions.dotSize,
            )
        } else {
            StyledText(
                text = char,
                textStyle = style.codeStyle,
                textColor = style.colors.codeColor.getValue(interactionSource, errorStateSet),
            )
        }
    } else {
        EmptyDot(
            color = style.colors.strokeColor.getValue(interactionSource, errorStateSet),
            size = style.dimensions.dotSize,
            strokeWidth = style.dimensions.strokeWidth,
        )
    }
}

@Composable
private fun FilledDot(
    modifier: Modifier = Modifier,
    color: Color,
    size: Dp,
) {
    Dot(
        modifier = modifier,
        color = color,
        size = size,
        drawStyle = Fill,
    )
}

@Composable
private fun EmptyDot(
    color: Color,
    size: Dp,
    strokeWidth: Dp,
) {
    val strokeWidthPx = with(LocalDensity.current) { strokeWidth.toPx() }
    val stroke = remember(strokeWidthPx) { Stroke(width = strokeWidthPx) }
    Dot(
        color = color,
        size = size,
        drawStyle = stroke,
    )
}

@Composable
private fun Dot(
    modifier: Modifier = Modifier,
    color: Color,
    size: Dp,
    drawStyle: DrawStyle,
) {
    Box(
        modifier = modifier.drawWithCache {
            val sizePx = size.toPx() / 2f
            onDrawBehind {
                drawCircle(
                    color = color,
                    radius = sizePx,
                    style = drawStyle,
                )
            }
        },
    )
}
