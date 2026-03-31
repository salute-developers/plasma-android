@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package com.sdds.compose.uikit.graphics

import android.graphics.ComposeShader
import android.graphics.PorterDuff
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush

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
                ComposeShader(acc, shader, PorterDuff.Mode.SRC_OVER)
            }
    }
}