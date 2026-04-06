package com.sdds.compose.uikit.internal.common

import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.AnimationVector4D
import androidx.compose.animation.core.TwoWayConverter
import androidx.compose.animation.core.VectorConverter
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.colorspace.ColorSpace
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.DrawScope
import com.sdds.compose.uikit.graphics.asBrush
import com.sdds.compose.uikit.graphics.asLayered

fun interface FillStyleProducer {

    operator fun invoke(): FillStyle
}

@Stable
sealed interface FillStyle {

    companion object
}

@Immutable
data class ColorFillStyle(val color: Color) : FillStyle {

    companion object {
        val Transparent = ColorFillStyle(Color.Transparent)
    }
}

@Immutable
data class BrushFillStyle(val brush: Brush) : FillStyle {
    companion object {
        val Transparent = ColorFillStyle(Color.Transparent)
    }
}

@Immutable
internal class MixedBrushFillStyle(val from: Brush, val to: Brush, val fraction: Float) : FillStyle


fun Color.asFillStyle(): ColorFillStyle = ColorFillStyle(this)

fun Color.asBrushFillStyle(): BrushFillStyle = BrushFillStyle(this.asBrush())

fun Brush.asFillStyle(): BrushFillStyle = BrushFillStyle(this)

fun List<ShaderBrush>.asFillStyle(): BrushFillStyle = BrushFillStyle(this.asLayered())

fun Modifier.backgroundFillColor(
    colorProducer: () -> Color,
    shape: Shape = RectangleShape,
): Modifier = this.backgroundFill(
    fillStyleProducer = { ColorFillStyle(colorProducer()) },
    shape = shape,
)

fun Modifier.backgroundFillBrush(
    brushProducer: () -> Brush,
    shape: Shape = RectangleShape,
): Modifier = this.backgroundFill(
    fillStyleProducer = { BrushFillStyle(brushProducer()) },
    shape = shape,
)

fun Modifier.backgroundFill(
    fillStyleProducer: () -> FillStyle,
    shape: Shape = RectangleShape,
): Modifier = this.drawWithCache {
    val outline = if (shape != RectangleShape) {
        shape.createOutline(size, layoutDirection, this)
    } else null
    val fillStyle = fillStyleProducer.invoke()
    onDrawBehind {
        when (fillStyle) {
            is BrushFillStyle -> drawFillBrush(fillStyle.brush, outline)
            is ColorFillStyle -> drawFillColor(fillStyle.color, outline)
            is MixedBrushFillStyle -> {
                drawFillBrush(fillStyle.from, outline, 1f - fillStyle.fraction)
                drawFillBrush(fillStyle.to, outline, fillStyle.fraction, blendMode = BlendMode.SrcOver)
            }
        }
    }
}

private fun DrawScope.drawFillColor(color: Color, outline: Outline?) {
    if (outline != null) {
        drawOutline(outline, color)
    } else {
        drawRect(color)
    }
}

private fun DrawScope.drawFillBrush(
    brush: Brush,
    outline: Outline?,
    alpha: Float = 1f,
    blendMode: BlendMode = DrawScope.DefaultBlendMode,
) {
    if (outline != null) {
        drawOutline(outline, brush, alpha.coerceIn(0f, 1f), blendMode = blendMode)
    } else {
        drawRect(brush, alpha = alpha.coerceIn(0f, 1f), blendMode = blendMode)
    }
}

internal val ColorFillStyle.Companion.VectorConverter: (colorSpace: ColorSpace) -> TwoWayConverter<ColorFillStyle, AnimationVector4D>
    get() = ColorFillStyleToVector

private val BrushFillStyle.Companion.VectorConverter: TwoWayConverter<Float, AnimationVector1D>
    get() = Float.VectorConverter


private val ColorFillStyleToVector: (colorSpace: ColorSpace) -> TwoWayConverter<ColorFillStyle, AnimationVector4D> =
    { colorSpace ->
        TwoWayConverter(
            convertToVector = { colorFillStyle ->
                val (l, a, b, alpha) = colorFillStyle.color.convert(ColorSpaces.Oklab)
                AnimationVector4D(alpha, l, a, b)
            },
            convertFromVector = { vector ->
                val color = Color(
                    vector.v2.coerceIn(0f, 1f), // L (red)
                    vector.v3.coerceIn(-0.5f, 0.5f), // a (blue)
                    vector.v4.coerceIn(-0.5f, 0.5f), // b (green)
                    vector.v1.coerceIn(0f, 1f), // alpha
                    ColorSpaces.Oklab
                )
                    .convert(colorSpace)
                ColorFillStyle(color)
            }
        )
    }