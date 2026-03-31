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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
) {
    val transition = rememberInfiniteTransition()
    val rotationAngle by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = animationSpec,
    )

    val angle = style.angle
    val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
    val startColor = style.colors.startColor.colorForInteraction(interactionSource)
    val endColor = style.colors.endColor.colorForInteraction(interactionSource)
    val endStop = if (angle == 360f) 1f else angle / 360f
    val brush = remember(startColor, endColor, endStop) {
        Brush.sweepGradient(
            0f to endColor,
            endStop to startColor,
        )
    }

    Box(
        modifier
            .progressSemantics()
            .size(style.dimensions.size)
            .padding(style.dimensions.padding)
            .drawWithCache {
                val stroke = Stroke(
                    width = style.dimensions.strokeWidth.toPx(),
                    cap = style.strokeCap.cap,
                )
                val strokeWidthPx = style.dimensions.strokeWidth.toPx()
                val arcSize = Size(size.width - strokeWidthPx, size.height - strokeWidthPx)
                val arcOffset = Offset(strokeWidthPx / 2f, strokeWidthPx / 2f)
                val angleCompensation =
                    atan2(strokeWidthPx / 2f, arcSize.width / 2f) * 180f / Math.PI.toFloat()
                val radius = (size.width - strokeWidthPx) / 2f

                onDrawBehind {
                    drawCircle(
                        center = center,
                        radius = radius,
                        color = backgroundColor,
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

/**
 * Preview [Spinner]
 */
@Composable
@Preview(showBackground = true)
private fun SpinnerPreview() {
    Spinner(
        style = SpinnerStyle.builder()
            .dimensions {
                size(28.dp)
                padding(4.dp)
            }
            .colors {
                backgroundColor(Color.Transparent)
                startColor(Color.Black)
                endColor(Color.Transparent)
            }
            .style(),
    )
}

private const val ANIMATION_DURATION = 1000
private val DefaultSpinnerAnimationSpec: InfiniteRepeatableSpec<Float> =
    infiniteRepeatable(
        animation = tween(
            durationMillis = ANIMATION_DURATION,
            easing = LinearEasing,
        ),
    )
