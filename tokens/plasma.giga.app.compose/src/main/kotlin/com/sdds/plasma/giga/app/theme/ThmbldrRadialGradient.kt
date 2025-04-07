// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.giga.app.theme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RadialGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import kotlin.math.max

/**
 * Радиальный градиент
 * @param colors цвета
 * @param stops точки остановки цвета
 * @param radius радиус градиента
 * @param centerX смещение центра по X
 * @param centerY смещение центра по Y
 * @param tileMode определяет поведение на границах градиента
 */
@Immutable
internal data class ThmbldrRadialGradient(
    private val colors: List<Color>,
    private val stops: List<Float>? = null,
    private val radius: Float = 0f,
    private val centerX: Float = 0.5f,
    private val centerY: Float = 0.5f,
    private val tileMode: TileMode = TileMode.Clamp,
) : ShaderBrush() {

    override fun createShader(size: Size): Shader {
        return RadialGradientShader(
            center = Offset(size.width * centerX, size.height * centerY),
            radius = max(size.width, size.height) * radius / 2,
            colors = colors,
            colorStops = stops,
            tileMode = tileMode,
        )
    }
}
