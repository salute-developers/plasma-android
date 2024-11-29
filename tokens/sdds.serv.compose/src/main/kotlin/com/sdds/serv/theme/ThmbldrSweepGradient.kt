// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.theme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.SweepGradientShader

/**
 * Sweep (Angular) градиент
 * @param colors цвета
 * @param stops точки остановки цвета
 * @param centerX смещение центра по X
 * @param centerY смещение центра по Y
 */
@Immutable
internal data class ThmbldrSweepGradient(
    private val colors: List<Color>,
    private val stops: List<Float>? = null,
    private val centerX: Float = 0.5f,
    private val centerY: Float = 0.5f,
) : ShaderBrush() {

    override fun createShader(size: Size): Shader {
        return SweepGradientShader(
            center = Offset(size.width * centerX, size.height * centerY),
            colors = colors,
            colorStops = stops,
        )
    }
}
