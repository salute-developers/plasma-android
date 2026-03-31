@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package com.sdds.compose.uikit.graphics

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import org.jetbrains.skia.BlendMode

/**
 * Композитный [ShaderBrush]
 * @param layers слои [ShaderBrush]
 * @param alpha прозрачность [LayeredShaderBrush]
 */
actual data class LayeredShaderBrush actual constructor(
    actual val layers: List<ShaderBrush>,
    actual val alpha: Float
) : ShaderBrush() {

    override fun createShader(size: Size): Shader {
        return layers
            .map { it.createShader(size) }
            .reduce { acc, shader ->
                Shader.makeBlend(BlendMode.SRC_OVER, acc, shader)
            }
    }
}