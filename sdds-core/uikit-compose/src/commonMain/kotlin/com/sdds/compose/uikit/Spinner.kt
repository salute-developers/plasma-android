package com.sdds.compose.uikit

import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.spinner.LocalSpinnerMotionStyle
import com.sdds.compose.uikit.motion.components.spinner.SpinnerMotionStyle
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotion
import kotlin.math.PI
import kotlin.math.atan2

/**
 * Spinner
 *
 * @param modifier модификатор
 * @param style cтиль компонента
 * @param animationSpec
 */
@Composable
fun Spinner(
    modifier: Modifier = Modifier,
    style: SpinnerStyle = LocalSpinnerStyle.current,
    animationSpec: InfiniteRepeatableSpec<Float> = DefaultSpinnerAnimationSpec,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    motion: Motion<SpinnerMotionStyle> = rememberMotion(LocalSpinnerMotionStyle.current),
) {
    val transition = rememberInfiniteTransition()
    val rotationAngle by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = animationSpec,
    )

    val angle by style.angleValues.getValueAsState(interactionSource)
    val background = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val startColor = style.colors.startColor.colorForInteraction(interactionSource)
    val endColor = style.colors.endColor.colorForInteraction(interactionSource)
    val endStop = if (angle == 360f) 1f else angle / 360f
    val brush = remember(startColor, endColor, endStop) {
        Brush.sweepGradient(
            0f to endColor,
            endStop to startColor,
        )
    }
    val spinnerSize = style.dimensions.sizeValues.getValueAsState(interactionSource)
    val padding = style.dimensions.paddingValues.getValueAsState(interactionSource)
    val strokeState = style.dimensions.strokeWidthValues.getValueAsState(interactionSource)
    val resolvedStroke by remember {
        derivedStateOf {
            if (strokeState.value != Dp.Unspecified) {
                strokeState.value
            } else {
                calculateThickness(spinnerSize.value)
            }
        }
    }
    Box(
        modifier
            .progressSemantics()
            .size(spinnerSize.value)
            .padding(padding.value)
            .drawWithCache {
                val stroke = Stroke(
                    width = resolvedStroke.toPx(),
                    cap = style.strokeCap.cap,
                )
                val strokeWidthPx = resolvedStroke.toPx()
                val arcSize = Size(size.width - strokeWidthPx, size.height - strokeWidthPx)
                val arcOffset = Offset(strokeWidthPx / 2f, strokeWidthPx / 2f)
                val angleCompensation =
                    atan2(strokeWidthPx / 2f, arcSize.width / 2f) * 180f / PI.toFloat()
                val radius = (size.width - strokeWidthPx) / 2f

                onDrawBehind {
                    drawCircle(
                        center = center,
                        radius = radius,
                        brush = background.value,
                        style = stroke,
                    )
                    withTransform({ rotate(rotationAngle) }) {
                        drawArc(
                            brush = brush,
                            topLeft = arcOffset,
                            size = arcSize,
                            startAngle = angleCompensation,
                            sweepAngle = angle - angleCompensation * 2f,
                            useCenter = false,
                            style = stroke,
                        )
                    }
                }
            },
    )
}

/**
 * Вид концов спиннера
 *
 * @param cap [StrokeCap]
 */
enum class SpinnerStrokeCap(val cap: StrokeCap) {
    Round(StrokeCap.Round),
    Square(StrokeCap.Square),
}

private fun calculateThickness(size: Dp): Dp {
    val resolvedSize = if (size.value != 0f) size.value else MIN_SPINNER_SIZE
    return (MIN_SPINNER_THICKNESS * resolvedSize / MIN_SPINNER_SIZE).dp
}

private val DefaultSpinnerAnimationSpec: InfiniteRepeatableSpec<Float> =
    infiniteRepeatable(
        animation = tween(
            durationMillis = ANIMATION_DURATION,
            easing = LinearEasing,
        ),
    )

private const val ANIMATION_DURATION = 1000
private const val MIN_SPINNER_THICKNESS = 1.5f
private const val MIN_SPINNER_SIZE = 16f
