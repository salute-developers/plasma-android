package com.sdds.compose.uikit.internal.common

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isSpecified
import com.sdds.compose.uikit.graphics.BlurState
import com.sdds.compose.uikit.graphics.BlurStyle
import com.sdds.haze.HazeState
import com.sdds.haze.blur.HazeBlurDefaults
import com.sdds.haze.blur.HazeBlurStyle
import com.sdds.haze.blur.HazeColorEffect
import com.sdds.haze.blur.blurEffect
import com.sdds.haze.hazeEffect
import com.sdds.haze.hazeSource

internal val FallbackBackground = SolidColor(Color.Transparent)

internal val ModifierLocalBlurStyle = modifierLocalOf<BlurStyle> { BlurStyleImpl() }

internal val ModifierLocalBlurState = modifierLocalOf<BlurState> { NoBlur }

internal val DefaultBlurStyle = BlurStyle.create()

internal val BlurSupported
    get() = HazeBlurDefaults.blurEnabled()

internal data class BlurStyleImpl(
    override val shape: Shape = RectangleShape,
    override val blurRadius: Dp = 20.dp,
    override val tint: Color = Color.Unspecified,
    override val noiseFactor: Float = 0f,
    override val fallbackBackground: Brush = FallbackBackground,
) : BlurStyle

internal class HazeBlurState(val hazeState: HazeState) : BlurState

internal object NoBlur : BlurState
internal object ForegroundBlur : BlurState

internal fun defaultBlurState(): BlurState {
    return HazeBlurState(HazeState())
}

internal fun Modifier.applyBlurSource(
    state: BlurState,
    zIndex: Float = 0f,
    key: Any? = null,
): Modifier {
    return when (state) {
        is HazeBlurState -> hazeSource(state.hazeState, zIndex, key)
        else -> this
    }
}

internal fun Modifier.applyBackgroundBlur(
    blurState: BlurState,
    blurStyle: BlurStyle,
    enabled: Boolean,
): Modifier {
    val blurSpecified = blurStyle.blurRadius.isSpecified && blurStyle.blurRadius.value > 0f
    if (!blurSpecified || blurState == NoBlur) return this
    val state = when (blurState) {
        is HazeBlurState -> blurState.hazeState
        else -> null
    }
    return this.hazeEffect(state) {
        blurEffect {
            blurEnabled = enabled
            style = blurStyle.toHazeStyle()
            shape = blurStyle.shape
        }
    }
}

private fun BlurStyle.toHazeStyle(): HazeBlurStyle =
    HazeBlurStyle(
        colorEffect = HazeColorEffect.tint(tint),
        blurRadius = blurRadius,
        noiseFactor = noiseFactor,
        fallbackColorEffect = HazeColorEffect.tint(fallbackBackground),
    )
