package com.sdds.compose.uikit.graphics.brush

import android.graphics.ComposeShader
import android.graphics.LinearGradient
import android.graphics.PorterDuff
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush

/**
 * [ShaderBrush] для эффекта cross-fade между [start] и [end]
 */
fun Brush.Companion.crossFadeShaderBrush(
    start: ShaderBrush,
    end: ShaderBrush,
    fraction: Float,
): ShaderBrush {
    return CrossFadeShaderBrushImpl(start, end, fraction)
}

private data class CrossFadeShaderBrushImpl(
    private val start: ShaderBrush,
    private val end: ShaderBrush,
    private val fraction: Float,
) : ShaderBrush() {

    override fun createShader(size: Size): Shader {
        val alphaFromShader = AlphaMaskShader(1 - fraction)
        val alphaToShader = AlphaMaskShader(fraction)
        val from = this.start.createShader(size).applyAlpha(alphaFromShader)
        val to = this.end.createShader(size).applyAlpha(alphaToShader)
        return ComposeShader(from, to, PorterDuff.Mode.SRC_OVER)
    }

    private fun Shader.applyAlpha(alpha: Shader): Shader {
        return ComposeShader(this, alpha, PorterDuff.Mode.DST_IN)
    }
}

private class AlphaMaskShader(alpha: Float) : LinearGradient(
    0f,
    0f,
    1f,
    1f,
    intArrayOf(argb(alpha), argb(alpha)),
    floatArrayOf(0f, 1f),
    TileMode.CLAMP,
)

private fun argb(
    alpha: Float,
    red: Int = 255,
    green: Int = 255,
    blue: Int = 255,
): Int {
    val a = (alpha.coerceIn(0f, 1f) * 255).toInt()
    return (a shl 24) or
        (red.coerceIn(0, 255) shl 16) or
        (green.coerceIn(0, 255) shl 8) or
        blue.coerceIn(0, 255)
}
