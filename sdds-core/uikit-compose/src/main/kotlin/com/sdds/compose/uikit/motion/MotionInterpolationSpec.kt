package com.sdds.compose.uikit.motion

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.lerp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.unit.toIntSize
import androidx.compose.ui.unit.toSize
import com.sdds.compose.uikit.internal.common.BrushFillStyle
import com.sdds.compose.uikit.internal.common.ColorFillStyle
import com.sdds.compose.uikit.internal.common.FillStyle
import com.sdds.compose.uikit.internal.common.MixedBrushFillStyle

fun interface ValueInterpolator<T> {

    fun interpolate(from: T, to: T, fraction: Float): T
}

interface MotionInterpolationSpec<T>: MotionSpec<T> {

    val interpolator: ValueInterpolator<T>
}

internal class NoInterpolation<T> : MotionInterpolationSpec<T> {

    override val interpolator: ValueInterpolator<T>
        get() = ValueInterpolator { from, to, fraction -> to }
}

fun <T> InterpolationMotionPropertyScope<T>.interpolationSpec(
    interpolator: ValueInterpolator<T>
): MotionInterpolationSpec<T> = MotionInterpolationSpecImpl(interpolator)

fun colorInterpolator(): ValueInterpolator<Color> =
    ValueInterpolator { from, to, fraction -> lerp(from, to, fraction) }

fun dpInterpolator(): ValueInterpolator<Dp> =
    ValueInterpolator { from, to, fraction -> lerp(from, to, fraction) }

fun rectInterpolator(): ValueInterpolator<Rect> =
    ValueInterpolator { from, to, fraction -> lerp(from, to, fraction) }

fun sizeInterpolator(): ValueInterpolator<Size> =
    ValueInterpolator { from, to, fraction -> lerp(from, to, fraction) }

fun intSizeInterpolator(): ValueInterpolator<IntSize> =
    ValueInterpolator { from, to, fraction -> lerp(from.toSize(), to.toSize(), fraction).toIntSize() }

fun offsetInterpolator(): ValueInterpolator<Offset> =
    ValueInterpolator { from, to, fraction -> lerp(from, to, fraction) }

fun dpOffsetInterpolator(): ValueInterpolator<DpOffset> =
    ValueInterpolator { from, to, fraction -> lerp(from, to, fraction) }

fun fillStyleInterpolator(): ValueInterpolator<FillStyle> =
    ValueInterpolator { from, to, fraction ->
        if (from is ColorFillStyle && to is ColorFillStyle) {
            val color = lerp(from.color, to.color, fraction)
            ColorFillStyle(color)
        } else if (from is BrushFillStyle && to is BrushFillStyle) {
            MixedBrushFillStyle(from.brush, to.brush, fraction)
        } else {
            to
        }
    }

internal class MotionInterpolationSpecImpl<T>(
    override val interpolator: ValueInterpolator<T>
) : MotionInterpolationSpec<T>