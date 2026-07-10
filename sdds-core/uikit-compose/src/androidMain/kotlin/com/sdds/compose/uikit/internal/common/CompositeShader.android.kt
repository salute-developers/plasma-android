package com.sdds.compose.uikit.internal.common

import android.graphics.ComposeShader
import android.graphics.PorterDuff
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Shader

internal actual fun compositeShader(
    dst: Shader,
    src: Shader,
    blendMode: BlendMode,
): Shader {
    return ComposeShader(dst, src, blendMode.toPorterDuffMode())
}

@Suppress("CyclomaticComplexMethod")
private fun BlendMode.toPorterDuffMode(): PorterDuff.Mode {
    return when (this) {
        BlendMode.Clear -> PorterDuff.Mode.CLEAR
        BlendMode.Src -> PorterDuff.Mode.SRC
        BlendMode.Dst -> PorterDuff.Mode.DST
        BlendMode.SrcOver -> PorterDuff.Mode.SRC_OVER
        BlendMode.DstOver -> PorterDuff.Mode.DST_OVER
        BlendMode.SrcIn -> PorterDuff.Mode.SRC_IN
        BlendMode.DstIn -> PorterDuff.Mode.DST_IN
        BlendMode.SrcOut -> PorterDuff.Mode.SRC_OUT
        BlendMode.DstOut -> PorterDuff.Mode.DST_OUT
        BlendMode.SrcAtop -> PorterDuff.Mode.SRC_ATOP
        BlendMode.DstAtop -> PorterDuff.Mode.DST_ATOP
        BlendMode.Xor -> PorterDuff.Mode.XOR
        BlendMode.Plus -> PorterDuff.Mode.ADD
        BlendMode.Modulate,
        BlendMode.Multiply,
        -> PorterDuff.Mode.MULTIPLY
        BlendMode.Screen -> PorterDuff.Mode.SCREEN
        BlendMode.Overlay -> PorterDuff.Mode.OVERLAY
        BlendMode.Darken -> PorterDuff.Mode.DARKEN
        BlendMode.Lighten -> PorterDuff.Mode.LIGHTEN
        else -> PorterDuff.Mode.SRC_OVER
    }
}
