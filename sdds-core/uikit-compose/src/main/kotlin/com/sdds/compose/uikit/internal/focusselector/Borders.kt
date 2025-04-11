package com.sdds.compose.uikit.internal.focusselector

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.shape.CornerBasedShape
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
import androidx.compose.ui.graphics.vector.DefaultStrokeLineMiter
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.fs.FocusSelectorBorder

@Immutable
internal data class FocusSelectorSolidBorder(
    override val shape: Shape,
    override val shapeAdjustment: Dp,
    override val strokeWidth: Dp,
    override val strokeInsets: Dp,
    val color: Color,
) : FocusSelectorBorder {
    override fun Modifier.applyToModifier(scale: Float): Modifier {
        val stroke = strokeWidth / scale
        val insets = strokeInsets / scale
        return this.drawBorderS(
            shape = shape,
            shapeAdjustment = shapeAdjustment,
            strokeWidth = stroke,
            strokeInsets = insets,
            brush = SolidColor(color),
        )
    }
}

@Immutable
internal data class FocusSelectorGradientBorder(
    override val shape: Shape ,
    override val shapeAdjustment: Dp,
    override val strokeWidth: Dp,
    override val strokeInsets: Dp,
    val brush: Brush,
) : FocusSelectorBorder {
    override fun Modifier.applyToModifier(scale: Float): Modifier {
        val stroke = strokeWidth / scale
        val insets = strokeInsets / scale
        return this.drawBorderS(
            shape = shape,
            shapeAdjustment = shapeAdjustment,
            strokeWidth = stroke,
            strokeInsets = insets,
            brush = brush
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
    override fun Modifier.applyToModifier(scale: Float): Modifier =
        composed {
            val stroke = strokeWidth / scale
            val insets = strokeInsets / scale
            val duration = 2500
            val infiniteTransition = rememberInfiniteTransition()
            val phase by infiniteTransition.animateFloat(
                initialValue = 1f,
                targetValue = 0f,
                animationSpec = infiniteRepeatable(
                    animation = tween(
                        durationMillis = duration,
                        easing = LinearEasing
                    ),
                    repeatMode = RepeatMode.Restart
                ),
            )
            drawWithCache {
                val strokeWidthPx = stroke.toPx()
                val halfStrokeWidthPx = strokeWidthPx / 2f
                val strokePaddingPx = insets.toPx()
                val pathSize = pathSize(strokePaddingPx, halfStrokeWidthPx)
                val outline = borderOutline(
                    shape as CornerBasedShape,
                    pathSize,
                    strokePaddingPx,
                    strokeWidthPx
                )
                val path = Path().apply { addOutline(outline) }
                val pathMeasure = PathMeasure().apply { setPath(path, false) }
                val perimeter = pathMeasure.length
                val halfPerimeter = perimeter / 2
                onDrawWithContent {
                    drawContent()

                    val currentPosition = perimeter * phase
                    val gradientBrush = Brush.radialGradient(
                        colors = listOf(
                            Color.Transparent,
                            mainColor,
                            Color.Transparent,
                        ),
                        center = pathMeasure.getPosition(currentPosition),
                        radius = halfPerimeter / 4,
                    )
                    drawOutline(
                        outline = outline,
                        style = Stroke(width = strokeWidthPx),
                        brush = gradientBrush
                    )
                }
            }

        }
}


/**
 * Рисует бордер вокруг [shape].
 * Поддерживается только Rounded форма.
 */
internal fun Modifier.drawBorderS(
    shape: Shape,
    shapeAdjustment: Dp,
    strokeWidth: Dp,
    strokeInsets: Dp,
    brush: Brush,
): Modifier {
    return this.drawWithCache {
        val strokeWidthPx = strokeWidth.toPx()
        val halfStrokeWidthPx = strokeWidthPx / 2f
        val strokePaddingPx = strokeInsets.toPx()
        val pathSize = pathSize(strokePaddingPx, halfStrokeWidthPx)
        val outline =
            borderOutline(shape as CornerBasedShape, pathSize, strokePaddingPx, strokeWidthPx)
        val roundedRectPath = customRoundRectPath(outline, strokePaddingPx, halfStrokeWidthPx)

        onDrawWithContent {
            drawContent()
            if (outline !is Outline.Rounded) return@onDrawWithContent
            if (outline.roundRect.isSimple) {
                val cornerRadius = outline.roundRect.topLeftCornerRadius
                val borderStroke = Stroke(strokeWidthPx, miter = DefaultStrokeLineMiter)
                val pathOffset =
                    Offset(
                        strokePaddingPx + halfStrokeWidthPx,
                        strokePaddingPx + halfStrokeWidthPx
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

