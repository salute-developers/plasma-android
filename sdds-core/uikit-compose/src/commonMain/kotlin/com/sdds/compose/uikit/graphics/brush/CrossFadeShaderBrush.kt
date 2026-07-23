package com.sdds.compose.uikit.graphics.brush

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import com.sdds.compose.uikit.internal.common.compositeShader

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
        val alphaFromShader = alphaMaskShader(1 - fraction)
        val alphaToShader = alphaMaskShader(fraction)
        val from = this.start.createShader(size).applyAlpha(alphaFromShader)
        val to = this.end.createShader(size).applyAlpha(alphaToShader)
        return compositeShader(from, to, BlendMode.SrcOver)
    }

    private fun Shader.applyAlpha(alpha: Shader): Shader {
        return compositeShader(this, alpha, BlendMode.DstIn)
    }
}

private fun alphaMaskShader(alpha: Float): Shader {
    val color = Color.White.copy(alpha = alpha.coerceIn(0f, 1f))
    return LinearGradientShader(
        from = Offset.Zero,
        to = Offset(1f, 1f),
        colors = listOf(color, color),
        colorStops = listOf(0f, 1f),
        tileMode = TileMode.Clamp,
    )
}
