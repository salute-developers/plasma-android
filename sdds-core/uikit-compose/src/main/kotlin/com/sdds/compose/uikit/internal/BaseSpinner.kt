package com.sdds.compose.uikit.internal

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.floatPx

/**
 * Базовый Spinner
 * @param modifier модификатор
 * @param tint цвет компонента
 * @param strokeWidth толщина линии компонента
 */
@Composable
internal fun BaseSpinner(
    modifier: Modifier = Modifier,
    tint: Color,
    strokeWidth: Dp = StrokeWidth,
) {
    val stroke = Stroke(width = strokeWidth.floatPx, cap = StrokeCap.Square)
    val transition = rememberInfiniteTransition()
    val angle by transition.animateFloat(
        initialValue = SPIN_ANIMATION_ANGLE_START,
        targetValue = SPIN_ANIMATION_ANGLE_END,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = SPIN_ANIMATION_DURATION,
                easing = LinearEasing,
            ),
        ),
    )
    val brush = Brush.sweepGradient(
        BRUSH_COLOR_STOP_START to tint.copy(BRUSH_ALPHA),
        BRUSH_COLOR_STOP_END to tint,
    )

    Canvas(
        modifier
            .progressSemantics()
            .then(DefaultSizeModifier),
    ) {
        withTransform({ rotate(angle) }) {
            drawCircle(
                brush = brush,
                radius = size.center.x,
                style = stroke,
            )
        }
    }
}

@Composable
@Preview
fun BaseSpinnerPreview() {
    BaseSpinner(tint = Color.White, strokeWidth = 4.dp, modifier = Modifier.size(32.dp))
}

internal val StrokeWidth = 4.dp
private val DefaultSizeModifier = Modifier.defaultMinSize(24.dp)
private const val BRUSH_ALPHA = 0.01f
private const val BRUSH_COLOR_STOP_START = 0f
private const val BRUSH_COLOR_STOP_END = 1f
private const val SPIN_ANIMATION_DURATION = 1000
private const val SPIN_ANIMATION_ANGLE_START = 0f
private const val SPIN_ANIMATION_ANGLE_END = 360f