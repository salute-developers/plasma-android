package com.sdds.compose.uikit.internal.focusselector

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.isSimple
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.DefaultStrokeLineMiter
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.adjustBy

/**
 * Рисует бордер вокруг [originalShape].
 * Поддерживается только Rounded форма.
 */
internal fun Modifier.drawBorder(
    stroke: BorderStroke,
    strokePadding: Dp,
    originalShape: CornerBasedShape,
    isFocused: () -> Boolean,
): Modifier {
    return this.drawWithContent {
        drawContent()

        if (!isFocused()) return@drawWithContent
        val strokePaddingPx = strokePadding.toPx()
        val strokeWidthPx = stroke.width.toPx()
        val pathSize = Size(
            width = this.size.width + (strokePaddingPx + strokeWidthPx / 2) * 2,
            height = this.size.height + (strokePaddingPx + strokeWidthPx / 2) * 2,
        )
        val outline = originalShape
            .adjustBy(strokePaddingPx + strokeWidthPx / 2f)
            .createOutline(pathSize, layoutDirection, this)
            as? Outline.Rounded ?: return@drawWithContent

        drawRoundRectBorder(
            brush = stroke.brush,
            outline = outline,
            pathSize = pathSize,
            strokeWidth = strokeWidthPx,
            strokePadding = strokePaddingPx,
        )
    }
}

private fun DrawScope.drawRoundRectBorder(
    brush: Brush,
    outline: Outline.Rounded,
    pathSize: Size,
    strokeWidth: Float,
    strokePadding: Float,
) {
    val halfStrokeWidth = strokeWidth / 2f
    if (outline.roundRect.isSimple) {
        val cornerRadius = outline.roundRect.topLeftCornerRadius
        val borderStroke = Stroke(strokeWidth, miter = DefaultStrokeLineMiter)
        val pathOffset =
            Offset(strokePadding + halfStrokeWidth, strokePadding + halfStrokeWidth)
        drawRoundRect(
            brush = brush,
            topLeft = -pathOffset,
            size = pathSize,
            cornerRadius = cornerRadius,
            style = borderStroke,
        )
    } else {
        val roundedRectPath = createRoundRectPath(
            roundedRect = outline.roundRect,
            halfStrokeWidth = halfStrokeWidth,
            strokePadding = strokePadding,
        )
        drawPath(
            path = roundedRectPath,
            brush = brush,
        )
    }
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
