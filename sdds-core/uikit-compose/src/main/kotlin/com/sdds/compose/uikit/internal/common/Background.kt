package com.sdds.compose.uikit.internal.common

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.DrawModifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.platform.InspectorValueInfo
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.unit.LayoutDirection
import com.sdds.compose.uikit.graphics.LayeredShaderBrush

/**
 * Рисует [brushes] в пределах формы [shape], учитывая прозрачность [alpha]
 */
internal fun Modifier.background(
    brushes: List<Brush>,
    shape: Shape = RectangleShape,
    alpha: Float = 1.0f,
) = this.then(
    Background(
        brushes = brushes,
        alpha = { alpha },
        shape = shape,
        inspectorInfo = debugInspectorInfo {
            name = "background"
            properties["alpha"] = alpha
            properties["brushes"] = brushes
            properties["shape"] = shape
        },
    ),
)

/**
 * Рисует [brush] в пределах формы [shape], учитывая прозрачность [alpha]
 */
internal fun Modifier.background(
    brush: Brush,
    shape: Shape = RectangleShape,
    alpha: () -> Float = { 1.0f },
): Modifier {
    val brushes = listOf(brush)
    return this.then(
        Background(
            brushes = brushes,
            alpha = alpha,
            shape = shape,
            inspectorInfo = debugInspectorInfo {
                name = "background"
                properties["alpha"] = alpha()
                properties["brushes"] = brushes
                properties["shape"] = shape
            },
        ),
    )
}

/**
 * Рисует [brush] или [color] в пределах формы [shape], учитывая прозрачность [alpha]
 */
internal fun Modifier.background(
    brush: Brush? = null,
    color: Color? = null,
    shape: Shape = RectangleShape,
    alpha: Float = (brush as? LayeredShaderBrush)?.alpha ?: 1f,
) = when {
    brush != null -> this.background(brush, shape, alpha)
    color != null -> this.background(color, shape)
    else -> this
}

private class Background(
    private val brushes: List<Brush>,
    private val alpha: () -> Float = { 1.0f },
    private val shape: Shape,
    inspectorInfo: InspectorInfo.() -> Unit,
) : DrawModifier, InspectorValueInfo(inspectorInfo) {

    private var lastSize: Size? = null
    private var lastLayoutDirection: LayoutDirection? = null
    private var lastOutline: Outline? = null

    override fun ContentDrawScope.draw() {
        val alpha = alpha()
        if (shape === RectangleShape) {
            drawRect(alpha)
        } else {
            drawOutline(alpha)
        }
        drawContent()
    }

    private fun ContentDrawScope.drawRect(alpha: Float) {
        brushes.forEach { drawRect(brush = it, alpha = alpha) }
    }

    private fun ContentDrawScope.drawOutline(alpha: Float) {
        val outline =
            if (size == lastSize && layoutDirection == lastLayoutDirection) {
                lastOutline!!
            } else {
                shape.createOutline(size, layoutDirection, this)
            }
        brushes.forEach { drawOutline(outline, brush = it, alpha = alpha) }
        lastOutline = outline
        lastSize = size
        lastLayoutDirection = layoutDirection
    }

    override fun toString(): String =
        "Background(brushes=$brushes, alpha = $alpha, shape=$shape)"

    override fun equals(other: Any?): Boolean {
        val otherModifier = other as? Background ?: return false
        return brushes == otherModifier.brushes &&
            alpha == otherModifier.alpha &&
            shape == otherModifier.shape
    }

    override fun hashCode(): Int {
        var result = brushes.hashCode()
        result = 31 * result + alpha.hashCode()
        result = 31 * result + shape.hashCode()
        return result
    }
}
