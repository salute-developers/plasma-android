package com.sdds.compose.uikit.graphics

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import com.sdds.compose.uikit.annotations.FloatRange
import com.sdds.compose.uikit.internal.common.compositeShader

/**
 * Возвращает список [ShaderBrush] как композитный [LayeredShaderBrush] с учетом [alpha]
 */
fun List<ShaderBrush>.asLayered(@FloatRange(from = 0.0, to = 1.0) alpha: Float = 1f): LayeredShaderBrush =
    LayeredShaderBrush(this, alpha)

/**
 * Изменяет [alpha] у [LayeredShaderBrush]
 */
fun LayeredShaderBrush.multiplyAlpha(alpha: Float): LayeredShaderBrush =
    this.copy(alpha = this.alpha * alpha)

/**
 * Композитный [ShaderBrush]
 * @param layers слои [ShaderBrush]
 * @param alpha прозрачность [LayeredShaderBrush]
 */
data class LayeredShaderBrush(
    val layers: List<ShaderBrush>,
    @FloatRange(from = 0.0, to = 1.0)
    val alpha: Float = 1f,
) : ShaderBrush() {

    override fun createShader(size: Size): Shader {
        return layers
            .map { it.createShader(size) }
            .reduce { acc, shader ->
                compositeShader(acc, shader, BlendMode.SrcOver)
            }
    }
}
