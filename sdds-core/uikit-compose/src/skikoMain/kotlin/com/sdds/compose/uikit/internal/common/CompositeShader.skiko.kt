package com.sdds.compose.uikit.internal.common

import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Shader

internal actual fun compositeShader(
    dst: Shader,
    src: Shader,
    blendMode: BlendMode,
): Shader {
    return Shader.makeBlend(blendMode.toSkiaBlendMode(), dst, src)
}

@Suppress("CyclomaticComplexMethod")
private fun BlendMode.toSkiaBlendMode(): org.jetbrains.skia.BlendMode {
    return when (this) {
        BlendMode.Clear -> org.jetbrains.skia.BlendMode.CLEAR
        BlendMode.Src -> org.jetbrains.skia.BlendMode.SRC
        BlendMode.Dst -> org.jetbrains.skia.BlendMode.DST
        BlendMode.SrcOver -> org.jetbrains.skia.BlendMode.SRC_OVER
        BlendMode.DstOver -> org.jetbrains.skia.BlendMode.DST_OVER
        BlendMode.SrcIn -> org.jetbrains.skia.BlendMode.SRC_IN
        BlendMode.DstIn -> org.jetbrains.skia.BlendMode.DST_IN
        BlendMode.SrcOut -> org.jetbrains.skia.BlendMode.SRC_OUT
        BlendMode.DstOut -> org.jetbrains.skia.BlendMode.DST_OUT
        BlendMode.SrcAtop -> org.jetbrains.skia.BlendMode.SRC_ATOP
        BlendMode.DstAtop -> org.jetbrains.skia.BlendMode.DST_ATOP
        BlendMode.Xor -> org.jetbrains.skia.BlendMode.XOR
        BlendMode.Plus -> org.jetbrains.skia.BlendMode.PLUS
        BlendMode.Modulate -> org.jetbrains.skia.BlendMode.MODULATE
        BlendMode.Screen -> org.jetbrains.skia.BlendMode.SCREEN
        BlendMode.Overlay -> org.jetbrains.skia.BlendMode.OVERLAY
        BlendMode.Darken -> org.jetbrains.skia.BlendMode.DARKEN
        BlendMode.Lighten -> org.jetbrains.skia.BlendMode.LIGHTEN
        BlendMode.ColorDodge -> org.jetbrains.skia.BlendMode.COLOR_DODGE
        BlendMode.ColorBurn -> org.jetbrains.skia.BlendMode.COLOR_BURN
        BlendMode.Hardlight -> org.jetbrains.skia.BlendMode.HARD_LIGHT
        BlendMode.Softlight -> org.jetbrains.skia.BlendMode.SOFT_LIGHT
        BlendMode.Difference -> org.jetbrains.skia.BlendMode.DIFFERENCE
        BlendMode.Exclusion -> org.jetbrains.skia.BlendMode.EXCLUSION
        BlendMode.Multiply -> org.jetbrains.skia.BlendMode.MULTIPLY
        BlendMode.Hue -> org.jetbrains.skia.BlendMode.HUE
        BlendMode.Saturation -> org.jetbrains.skia.BlendMode.SATURATION
        BlendMode.Color -> org.jetbrains.skia.BlendMode.COLOR
        BlendMode.Luminosity -> org.jetbrains.skia.BlendMode.LUMINOSITY
        else -> org.jetbrains.skia.BlendMode.SRC_OVER
    }
}
