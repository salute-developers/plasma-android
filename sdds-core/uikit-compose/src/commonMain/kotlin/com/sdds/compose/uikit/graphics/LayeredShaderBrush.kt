package com.sdds.compose.uikit.graphics

import androidx.compose.ui.graphics.ShaderBrush

/**
 * Возвращает список [ShaderBrush] как композитный [LayeredShaderBrush] с учетом [alpha]
 */
fun List<ShaderBrush>.asLayered(alpha: Float = 1f): LayeredShaderBrush =
    LayeredShaderBrush(this, alpha)

/**
 * Изменяет [alpha] у [LayeredShaderBrush]
 */
fun LayeredShaderBrush.multiplyAlpha(alpha: Float): LayeredShaderBrush =
    LayeredShaderBrush(layers = this.layers, alpha = this.alpha * alpha)

/**
 * Композитный [ShaderBrush]
 * @param layers слои [ShaderBrush]
 * @param alpha прозрачность [LayeredShaderBrush]
 */
expect class LayeredShaderBrush(
    layers: List<ShaderBrush>,
    alpha: Float = 1f,
) : ShaderBrush {
    val layers: List<ShaderBrush>
    val alpha: Float
}
