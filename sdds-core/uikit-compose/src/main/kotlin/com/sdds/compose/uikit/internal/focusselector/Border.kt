package com.sdds.compose.uikit.internal.focusselector

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.isSimple
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
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
    return this.drawWithCache {
        val strokeWidthPx = stroke.width.toPx()
        val halfStrokeWidthPx = strokeWidthPx / 2f
        val strokePaddingPx = strokePadding.toPx()
        val pathSize = pathSize(strokePaddingPx, halfStrokeWidthPx)
        val outline = borderOutline(originalShape, pathSize, strokePaddingPx, strokeWidthPx)
        val roundedRectPath = customRoundRectPath(outline, strokePaddingPx, halfStrokeWidthPx)

        onDrawWithContent {
            drawContent()

            if (!isFocused()) return@onDrawWithContent
            if (outline !is Outline.Rounded) return@onDrawWithContent

            if (outline.roundRect.isSimple) {
                val cornerRadius = outline.roundRect.topLeftCornerRadius
                val borderStroke = Stroke(strokeWidthPx, miter = DefaultStrokeLineMiter)
                val pathOffset =
                    Offset(strokePaddingPx + halfStrokeWidthPx, strokePaddingPx + halfStrokeWidthPx)
                drawRoundRect(
                    brush = stroke.brush,
                    topLeft = -pathOffset,
                    size = pathSize,
                    cornerRadius = cornerRadius,
                    style = borderStroke,
                )
            } else {
                drawPath(
                    path = roundedRectPath ?: return@onDrawWithContent,
                    brush = stroke.brush,
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
