package com.sdds.compose.uikit.internal.codeinput

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isUnspecified
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.focusselector.drawInnerBorder
import com.sdds.compose.uikit.motion.components.codeinput.CodeInputMotionStyle
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

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
    codeStyle: State<TextStyle>,
    cursor: BaseCodeInputCursor?,
    animationSpec: AnimationSpec<Float>?,
    interactionSource: MutableInteractionSource,
    motionStyle: CodeInputMotionStyle,
) {
    val motion = rememberMotion(
        style = motionStyle,
        context = rememberMotionContext(interactionSource),
    )
    val shapeModifier = shape?.let { Modifier.clip(it) } ?: Modifier
    val itemValid = char?.let { isItemValid.invoke(it) } ?: true

    SideEffect {
        motion.context.semanticStateSource.remove(
            CodeInputStates.Focused,
            CodeInputStates.Error,
            InteractiveState.Activated,
        )
        when {
            showFocusSelector -> motion.context.semanticStateSource.add(CodeInputStates.Focused)
            !itemValid || !isCodeValid -> motion.context.semanticStateSource.add(CodeInputStates.Error)
            isActivated -> motion.context.semanticStateSource.add(InteractiveState.Activated)
            else -> {}
        }
    }

    val shakeOffset by rememberCodeInputShakeAnimation(
        isActive = !itemValid,
        onStart = onStartShake,
        onFinish = onShakeComplete,
        animationSpec = animationSpec,
    )
    val background = colors.backgroundColor.getBrushAsState(motion.context, motion.style.fieldColor)
    val fieldStrokeColor = colors.fieldStrokeColor.getBrushAsState(motion.context, motion.style.strokeColor)
    val fieldStrokeWidth = dimensions.fieldStrokeWidth.getValueAsState(motion.context)
    Box(
        modifier = Modifier
            .codeInputShakeModifier(itemValid, shakeOffset)
            .then(shapeModifier)
            .background(background.value)
            .requiredHeight(dimensions.height.getDefaultValue())
            .requiredWidth(dimensions.width.getDefaultValue())
            .drawInnerBorder(
                strokeWidth = fieldStrokeWidth,
                strokeColor = { fieldStrokeColor.value },
                shape = shape,
                isFocused = { true },
            ),
        contentAlignment = Alignment.Center,
    ) {
        if (char != null) {
            if (hidden) {
                val dotColor = colors.dotColor.getBrushAsState(motion.context, motion.style.fieldColor)
                val dotSize = dimensions.dotSize.getValueAsState(motion.context)
                Dot(
                    color = { dotColor.value },
                    size = dotSize,
                    drawStyle = Fill,
                )
            } else {
                val valueColor = colors.valueColor.getBrushAsState(motion.context, motion.style.codeColor)
                TextOnCanvas(
                    text = char,
                    modifier = Modifier.fillMaxSize(),
                    textStyle = codeStyle.value,
                    color = { valueColor.value },
                )
            }
        } else {
            if (cursor != null && isActivated) Cursor(cursor)
            val strokeWidth = dimensions.dotStrokeWidth.getValueAsState(motion.context)
            val dotSize = dimensions.dotSize.getValueAsState(motion.context)
            val strokeColor = colors.dotStrokeColor.getBrushAsState(motion.context, motion.style.strokeColor)
            EmptyDot(
                color = { strokeColor.value },
                size = dotSize,
                strokeWidth = strokeWidth,
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
    val cursorBrush = cursorSettings.color()
    Box(
        modifier = Modifier
            .width(cursorSettings.width)
            .height(cursorSettings.height)
            .background(brush = cursorBrush, alpha = alpha),
    )
}

@Composable
private fun TextOnCanvas(
    text: String,
    textStyle: TextStyle,
    modifier: Modifier,
    color: BrushProducer,
) {
    val textMeasurer = rememberTextMeasurer()
    val textLayoutResult = textMeasurer.measure(
        text = text,
        style = textStyle,
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
                        brush = color(),
                        topLeft = offset,
                    )
                }
            },
    )
}

@Composable
private fun EmptyDot(
    modifier: Modifier = Modifier,
    color: BrushProducer,
    size: State<Dp>,
    strokeWidth: State<Dp>,
) {
    val width = strokeWidth.value
    if (width.isUnspecified || width == 0.dp) return
    val strokeWidthPx = with(LocalDensity.current) { strokeWidth.value.toPx() }
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
    color: BrushProducer,
    size: State<Dp>,
    drawStyle: DrawStyle,
) {
    val currentSize = size.value
    val animatedSize = animateDpAsState(currentSize)
    Box(
        modifier = modifier.drawWithCache {
            val sizePx = animatedSize.value.toPx() / 2f
            onDrawBehind {
                drawCircle(
                    brush = color(),
                    radius = sizePx,
                    style = drawStyle,
                )
            }
        },
    )
}
