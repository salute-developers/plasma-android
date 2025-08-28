package com.sdds.compose.uikit.internal.codeinput

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.isUnspecified
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.getValue

@Composable
internal fun CodeItem(
    char: String?,
    hidden: Boolean,
    showFocusSelector: Boolean,
    isActivated: Boolean,
    isCodeValid: Boolean,
    isItemValid: (String) -> Boolean,
    shape: CornerBasedShape?,
    onStartShake: () -> Unit,
    onShakeComplete: () -> Unit,
    dimensions: BaseCodeInputDimensions,
    colors: BaseCodeInputColors,
    codeStyle: TextStyle,
    cursor: BaseCodeInputCursor?,
    animationSpec: AnimationSpec<Float>?,
    interactionSource: InteractionSource,
) {
    val shapeModifier = shape?.let { Modifier.clip(it) } ?: Modifier
    val itemValid = char?.let { isItemValid.invoke(it) } ?: true
    val itemStateSet = remember(
        itemValid,
        isCodeValid,
        isActivated,
        showFocusSelector,
    ) {
        when {
            showFocusSelector -> setOf(CodeInputStates.Focused)
            !itemValid || !isCodeValid -> setOf(CodeInputStates.Error)
            isActivated -> setOf(InteractiveState.Activated)
            else -> emptySet()
        }
    }
    val shakeOffset by rememberCodeInputShakeAnimation(
        isActive = !itemValid,
        onStart = onStartShake,
        onFinish = onShakeComplete,
        animationSpec = animationSpec,
    )
    Box(
        modifier = Modifier
            .codeInputShakeModifier(itemValid, shakeOffset)
            .then(shapeModifier)
            .background(colors.backgroundColor.getValue(interactionSource, itemStateSet))
            .requiredHeight(dimensions.height.getDefaultValue())
            .requiredWidth(dimensions.width.getDefaultValue()),
        contentAlignment = Alignment.Center,
    ) {
        if (char != null) {
            if (hidden) {
                FilledDot(
                    color = colors.dotColor.getValue(interactionSource, itemStateSet),
                    size = dimensions.dotSize.getValue(interactionSource, itemStateSet),
                )
            } else {
                TextOnCanvas(
                    text = char,
                    modifier = Modifier.fillMaxSize(),
                    textStyle = codeStyle,
                    color = colors.valueColor.getValue(interactionSource, itemStateSet),
                )
            }
        } else {
            if (cursor != null && isActivated) Cursor(cursor)
            EmptyDot(
                color = colors.strokeColor.getValue(interactionSource, itemStateSet),
                size = dimensions.dotSize.getValue(interactionSource, itemStateSet),
                strokeWidth = dimensions.strokeWidth,
            )
        }
    }
}

@Composable
private fun Cursor(cursorSettings: BaseCodeInputCursor) {
    val infiniteTransition = rememberInfiniteTransition()
    val alpha by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = tween(500),
            repeatMode = RepeatMode.Reverse,
        ),
    )

    Box(
        modifier = Modifier
            .width(cursorSettings.width)
            .height(cursorSettings.height)
            .background(cursorSettings.color.copy(alpha = alpha)),
    )
}

@Composable
private fun TextOnCanvas(
    text: String,
    textStyle: TextStyle,
    modifier: Modifier,
    color: Color,
) {
    val textMeasurer = rememberTextMeasurer()
    val textLayoutResult = textMeasurer.measure(
        text = text,
        style = textStyle.copy(color = color),
    )
    Box(
        modifier = modifier
            .drawWithCache {
                val offset = Offset(
                    x = size.width / 2 - textLayoutResult.size.width / 2,
                    y = size.height / 2 - textLayoutResult.size.height / 2,
                )

                onDrawBehind {
                    drawText(
                        textLayoutResult = textLayoutResult,
                        topLeft = offset,
                    )
                }
            },
    )
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
    modifier: Modifier = Modifier,
    color: Color,
    size: Dp,
    strokeWidth: Dp,
) {
    if (color.isUnspecified || color.alpha == 0f) return
    val strokeWidthPx = with(LocalDensity.current) { strokeWidth.toPx() }
    val stroke = remember(strokeWidthPx) { Stroke(width = strokeWidthPx) }
    Dot(
        modifier = modifier,
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
    val animatedSize = animateDpAsState(size)
    Box(
        modifier = modifier.drawWithCache {
            val sizePx = animatedSize.value.toPx() / 2f
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
