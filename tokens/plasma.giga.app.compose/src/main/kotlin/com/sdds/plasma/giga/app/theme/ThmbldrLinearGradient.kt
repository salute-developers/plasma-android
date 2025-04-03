// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.giga.app.theme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

/**
 * Линейный градиент с возможностью установить углов отрисовки в градусах
 * @param colors цвета
 * @param stops точки остановки цвета
 * @param tileMode определяет поведение на границах градиента
 * @param angleInDegrees угол в градусах
 */
@Immutable
internal class ThmbldrLinearGradient constructor(
    private val colors: List<Color>,
    private val stops: List<Float>? = null,
    angleInDegrees: Float = 0f,
    private val tileMode: TileMode = TileMode.Clamp,
) : ShaderBrush() {

    private val normalizedAngle: Float = (angleInDegrees % 360 + 360) % 360
    private val angleInRadians: Float = Math.toRadians(normalizedAngle.toDouble()).toFloat()

    override fun createShader(size: Size): Shader {
        val (from, to) = getGradientCoordinates(size = size)
        return LinearGradientShader(
            colors = colors,
            colorStops = stops,
            from = from,
            to = to,
            tileMode = tileMode,
        )
    }

    private fun getGradientCoordinates(size: Size): Pair<Offset, Offset> {
        val diagonal = sqrt(size.width.pow(2) + size.height.pow(2))
        val angleBetweenDiagonalAndWidth = acos(size.width / diagonal)
        val angleBetweenDiagonalAndGradientLine =
            if ((normalizedAngle.inExclusiveRange(90f, 180f)) || (normalizedAngle.inExclusiveRange(270f, 360f))) {
                PI.toFloat() - angleInRadians - angleBetweenDiagonalAndWidth
            } else {
                angleInRadians - angleBetweenDiagonalAndWidth
            }
        val halfGradientLine = abs(cos(angleBetweenDiagonalAndGradientLine) * diagonal) / 2

        val horizontalOffset = halfGradientLine * cos(angleInRadians)
        val verticalOffset = halfGradientLine * sin(angleInRadians)

        val start = size.center + Offset(-horizontalOffset, verticalOffset)
        val end = size.center + Offset(horizontalOffset, -verticalOffset)

        return start to end
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ThmbldrLinearGradient) return false

        if (colors != other.colors) return false
        if (stops != other.stops) return false
        if (normalizedAngle != other.normalizedAngle) return false
        if (tileMode != other.tileMode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = colors.hashCode()
        result = 31 * result + (stops?.hashCode() ?: 0)
        result = 31 * result + normalizedAngle.hashCode()
        result = 31 * result + tileMode.hashCode()
        return result
    }

    override fun toString(): String {
        return "LinearGradient(colors=$colors, " +
            "stops=$stops, " +
            "angle=$normalizedAngle, " +
            "tileMode=$tileMode)"
    }

    private companion object {

        fun Float.inExclusiveRange(from: Float, to: Float): Boolean {
            return this > from && this < to
        }
    }
}
