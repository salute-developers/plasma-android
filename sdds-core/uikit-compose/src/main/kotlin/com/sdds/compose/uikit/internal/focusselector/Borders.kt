package com.sdds.compose.uikit.internal.focusselector

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.isSimple
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.addOutline
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.vector.DefaultStrokeLineMiter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.fs.FocusSelectorBorder

@Immutable
internal object FocusSelectorBorderNone : FocusSelectorBorder {
    override val shape: Shape = RoundedCornerShape(0)
    override val shapeAdjustment: Dp = 0.dp
    override val strokeWidth: Dp = 0.dp
    override val strokeInsets: Dp = 0.dp
    override fun Modifier.applyBorderToModifier(
        scale: Float,
        componentShape: Shape?,
        isFocused: () -> Boolean,
    ): Modifier {
        return this
    }
}

@Immutable
internal data class FocusSelectorSolidBorder(
    override val shape: Shape,
    override val shapeAdjustment: Dp,
    override val strokeWidth: Dp,
    override val strokeInsets: Dp,
    val color: Color,
) : FocusSelectorBorder {
    override fun Modifier.applyBorderToModifier(
        scale: Float,
        componentShape: Shape?,
        isFocused: () -> Boolean,
    ): Modifier {
        val stroke = strokeWidth / scale
        val insets = strokeInsets / scale
        return this.drawBorder(
            shape = componentShape ?: shape,
            shapeAdjustment = shapeAdjustment,
            strokeWidth = stroke,
            strokeInsets = insets,
            brush = SolidColor(color),
            isFocused = isFocused,
        )
    }
}

@Immutable
internal data class FocusSelectorGradientBorder(
    override val shape: Shape,
    override val shapeAdjustment: Dp,
    override val strokeWidth: Dp,
    override val strokeInsets: Dp,
    val brush: Brush,
) : FocusSelectorBorder {
    override fun Modifier.applyBorderToModifier(
        scale: Float,
        componentShape: Shape?,
        isFocused: () -> Boolean,
    ): Modifier {
        val stroke = strokeWidth / scale
        val insets = strokeInsets / scale
        return this.drawBorder(
            shape = componentShape ?: shape,
            shapeAdjustment = shapeAdjustment,
            strokeWidth = stroke,
            strokeInsets = insets,
            brush = brush,
            isFocused = isFocused,
        )
    }
}

@Immutable
internal data class FocusSelectorGradientAnimatedBorder(
    override val shape: Shape,
    override val shapeAdjustment: Dp,
    override val strokeWidth: Dp,
    override val strokeInsets: Dp,
    val mainColor: Color,
    val additionalColor: Color,
) : FocusSelectorBorder {
    override fun Modifier.applyBorderToModifier(
        scale: Float,
        componentShape: Shape?,
        isFocused: () -> Boolean,
    ): Modifier =
        composed {
            val targetShape = componentShape ?: shape
            val newShape = (targetShape as CornerBasedShape).adjustBy(all = shapeAdjustment)
            val stroke = strokeWidth / scale
            val insets = strokeInsets / scale
            val duration = 3000
            val infiniteTransition = rememberInfiniteTransition()
            val phase by infiniteTransition.animateFloat(
                initialValue = 1f,
                targetValue = 0f,
                animationSpec = infiniteRepeatable(
                    animation = tween(
                        durationMillis = duration,
                        easing = LinearEasing,
                    ),
                    repeatMode = RepeatMode.Restart,
                ),
            )
            drawWithCache {
                val strokeWidthPx = stroke.toPx()
                val halfStrokeWidthPx = strokeWidthPx / 2f
                val strokePaddingPx = insets.toPx()
                val pathSize = pathSize(strokePaddingPx, halfStrokeWidthPx)
                val outline =
                    borderOutline(newShape, pathSize, strokePaddingPx, strokeWidthPx)
                val path = Path().apply {
                    addOutline(outline)
                }
                val gradientBrush = brushForAnimation(path, phase, mainColor)
                onDrawWithContent {
                    drawContent()
                    if (!isFocused()) return@onDrawWithContent
                    translate(
                        -(strokePaddingPx + halfStrokeWidthPx),
                        -(strokePaddingPx + halfStrokeWidthPx),
                    ) {
                        drawOutline(
                            outline = outline,
                            style = Stroke(width = strokeWidthPx),
                            color = additionalColor,
                        )
                        drawOutline(
                            outline = outline,
                            style = Stroke(width = strokeWidthPx),
                            brush = gradientBrush,
                        )
                    }
                }
            }
        }
}

/**
 * Рисует бордер вокруг [shape].
 * Поддерживается только Rounded форма.
 */
internal fun Modifier.drawBorder(
    shape: Shape,
    shapeAdjustment: Dp,
    strokeWidth: Dp,
    strokeInsets: Dp,
    brush: Brush,
    isFocused: () -> Boolean,
): Modifier {
    return this.drawWithCache {
        val adjustment = shapeAdjustment.toPx()
        val newShape = (shape as CornerBasedShape).adjustBy(adjustment)
        val strokeWidthPx = strokeWidth.toPx()
        val halfStrokeWidthPx = strokeWidthPx / 2f
        val strokePaddingPx = strokeInsets.toPx()
        val pathSize = pathSize(strokePaddingPx, halfStrokeWidthPx)
        val outline =
            borderOutline(newShape, pathSize, strokePaddingPx, strokeWidthPx)
        val roundedRectPath = customRoundRectPath(outline, strokePaddingPx, halfStrokeWidthPx)

        onDrawWithContent {
            drawContent()
            if (!isFocused()) return@onDrawWithContent
            if (outline !is Outline.Rounded) return@onDrawWithContent
            if (outline.roundRect.isSimple) {
                val cornerRadius = outline.roundRect.topLeftCornerRadius
                val borderStroke = Stroke(strokeWidthPx, miter = DefaultStrokeLineMiter)
                val pathOffset =
                    Offset(
                        strokePaddingPx + halfStrokeWidthPx,
                        strokePaddingPx + halfStrokeWidthPx,
                    )
                drawRoundRect(
                    brush = brush,
                    topLeft = -pathOffset,
                    size = pathSize,
                    cornerRadius = cornerRadius,
                    style = borderStroke,
                )
            } else {
                drawPath(
                    path = roundedRectPath ?: return@onDrawWithContent,
                    brush = brush,
                )
            }
        }
    }
}

private fun CacheDrawScope.brushForAnimation(
    path: Path,
    phase: Float,
    color: Color,
): Brush {
    val pathMeasure = PathMeasure()
    pathMeasure.setPath(path, true)
    val totalLength = pathMeasure.length
    val gradientLength = totalLength * 0.45f
    val currentPosition = phase * totalLength
    val position = Path()
    val segment = pathMeasure.getSegment(
        currentPosition,
        currentPosition + totalLength * 0.05f,
        position,
        true,
    )
    val lastPos = if (segment) {
        val bounds = position.getBounds()
        Offset(bounds.center.x, bounds.center.y)
    } else {
        Offset.Zero
    }
    return Brush.radialGradient(
        center = lastPos,
        radius = gradientLength / 2f,
        colors = listOf(color, Color.Transparent),
    )
}

private fun CacheDrawScope.borderOutline(
    shape: CornerBasedShape,
    pathSize: Size,
    strokePaddingPx: Float,
    strokeWidthPx: Float,
): Outline {
    return shape
        .adjustBy(strokePaddingPx + strokeWidthPx / 2f)
        .createOutline(pathSize, layoutDirection, this)
}

private fun CacheDrawScope.customRoundRectPath(
    outline: Outline,
    strokePaddingPx: Float,
    halfStrokeWidthPx: Float,
): Path? {
    return if ((outline is Outline.Rounded) && !outline.roundRect.isSimple) {
        createRoundRectPath(
            roundedRect = outline.roundRect,
            halfStrokeWidth = halfStrokeWidthPx,
            strokePadding = strokePaddingPx,
        )
    } else {
        null
    }
}

private fun CacheDrawScope.pathSize(
    strokePaddingPx: Float,
    halfStrokeWidth: Float,
): Size {
    return Size(
        width = this.size.width + (strokePaddingPx + halfStrokeWidth) * 2,
        height = this.size.height + (strokePaddingPx + halfStrokeWidth) * 2,
    )
}

private fun createRoundRectPath(
    roundedRect: RoundRect,
    halfStrokeWidth: Float,
    strokePadding: Float,
): Path = Path().apply {
    addRoundRect(roundedRect.adjustRoundRect(halfStrokeWidth))
    val innerPath = Path().apply {
        addRoundRect(roundedRect.adjustRoundRect(-halfStrokeWidth))
    }
    op(this, innerPath, PathOperation.Difference)
    val offset = Offset(-(strokePadding + halfStrokeWidth), -(strokePadding + halfStrokeWidth))
    translate(offset)
}

private fun RoundRect.adjustRoundRect(delta: Float): RoundRect =
    RoundRect(
        left = -delta,
        top = -delta,
        right = width + delta,
        bottom = height + delta,
        topLeftCornerRadius = topLeftCornerRadius.shrink(-delta),
        topRightCornerRadius = topRightCornerRadius.shrink(-delta),
        bottomLeftCornerRadius = bottomLeftCornerRadius.shrink(-delta),
        bottomRightCornerRadius = bottomRightCornerRadius.shrink(-delta),
    )

private fun CornerRadius.shrink(value: Float): CornerRadius = CornerRadius(
    (this.x - value).coerceAtLeast(0f),
    (this.y - value).coerceAtLeast(0f),
)
