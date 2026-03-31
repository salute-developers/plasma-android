package com.sdds.compose.uikit.graphics

import androidx.compose.runtime.Immutable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.RadialGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.SweepGradientShader
import androidx.compose.ui.graphics.TileMode
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

/**
 * Делегаты для создания градиентов
 */
sealed class Gradients : ShaderBrush() {

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
    class Radial(
        private val colors: List<Color>,
        private val stops: List<Float>? = null,
        private val radius: Float = 0f,
        private val centerX: Float = 0.5f,
        private val centerY: Float = 0.5f,
        private val tileMode: TileMode = TileMode.Clamp,
    ) : Gradients() {

        override fun createShader(size: Size): Shader {
            return RadialGradientShader(
                center = Offset(size.width * centerX, size.height * centerY),
                radius = max(size.width, size.height) * radius / 2,
                colors = colors,
                colorStops = stops,
                tileMode = tileMode,
            )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is Radial) return false

            if (colors != other.colors) return false
            if (stops != other.stops) return false
            if (radius != other.radius) return false
            if (centerX != other.centerX) return false
            if (centerY != other.centerY) return false
            if (tileMode != other.tileMode) return false

            return true
        }

        override fun hashCode(): Int {
            var result = colors.hashCode()
            result = 31 * result + (stops?.hashCode() ?: 0)
            result = 31 * result + radius.hashCode()
            result = 31 * result + centerX.hashCode()
            result = 31 * result + centerY.hashCode()
            result = 31 * result + tileMode.hashCode()
            return result
        }
    }

    /**
     * Линейный градиент с возможностью установить углов отрисовки в градусах
     * @param colors цвета
     * @param stops точки остановки цвета
     * @param tileMode определяет поведение на границах градиента
     * @param angleInDegrees угол в градусах
     */
    @Immutable
    class Linear(
        private val colors: List<Color>,
        private val stops: List<Float>? = null,
        private val angleInDegrees: Float = 0f,
        private val startPoint: Offset? = null,
        private val endPoint: Offset? = null,
        private val tileMode: TileMode = TileMode.Clamp,
    ) : Gradients() {

        private val normalizedAngle: Float = convertAngle(angleInDegrees)
        private val angleInRadians: Float = Math.toRadians(normalizedAngle.toDouble()).toFloat()

        override fun createShader(size: Size): Shader {
            val (from, to) = if (startPoint != null && endPoint != null) {
                getGradientCoordinatePoints(size, startPoint, endPoint)
            } else {
                getGradientAngleCoordinates(size)
            }
            return LinearGradientShader(
                colors = colors,
                colorStops = stops,
                from = from,
                to = to,
                tileMode = tileMode,
            )
        }

        private fun getGradientCoordinatePoints(
            size: Size,
            startPoint: Offset,
            endPoint: Offset,
        ): Pair<Offset, Offset> {
            return Offset(startPoint.x * size.width, startPoint.y * size.height) to
                Offset(endPoint.x * size.width, endPoint.y * size.height)
        }

        private fun getGradientAngleCoordinates(size: Size): Pair<Offset, Offset> {
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
            if (other !is Linear) return false

            if (colors != other.colors) return false
            if (stops != other.stops) return false
            if (angleInDegrees != other.angleInDegrees) return false
            if (tileMode != other.tileMode) return false
            if (startPoint != other.startPoint) return false
            if (endPoint != other.endPoint) return false
            if (normalizedAngle != other.normalizedAngle) return false
            if (angleInRadians != other.angleInRadians) return false

            return true
        }

        override fun hashCode(): Int {
            var result = colors.hashCode()
            result = 31 * result + (stops?.hashCode() ?: 0)
            result = 31 * result + angleInDegrees.hashCode()
            result = 31 * result + tileMode.hashCode()
            result = 31 * result + (startPoint?.hashCode() ?: 0)
            result = 31 * result + (endPoint?.hashCode() ?: 0)
            result = 31 * result + normalizedAngle.hashCode()
            result = 31 * result + angleInRadians.hashCode()
            return result
        }

        private companion object {

            fun Float.inExclusiveRange(from: Float, to: Float): Boolean {
                return this > from && this < to
            }

            fun convertAngle(cssAngle: Float): Float {
                val positiveAngle = (cssAngle % 360 + 360) % 360
                return (90 - positiveAngle + 360) % 360
            }
        }
    }

    /**
     * Sweep (Angular) градиент
     * @param colors цвета
     * @param stops точки остановки цвета
     * @param centerX смещение центра по X
     * @param centerY смещение центра по Y
     */
    @Immutable
    class Sweep(
        private val colors: List<Color>,
        private val stops: List<Float>? = null,
        private val centerX: Float = 0.5f,
        private val centerY: Float = 0.5f,
    ) : Gradients() {

        override fun createShader(size: Size): Shader {
            return SweepGradientShader(
                center = Offset(size.width * centerX, size.height * centerY),
                colors = colors,
                colorStops = stops,
            )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is Sweep) return false

            if (colors != other.colors) return false
            if (stops != other.stops) return false
            if (centerX != other.centerX) return false
            if (centerY != other.centerY) return false

            return true
        }

        override fun hashCode(): Int {
            var result = colors.hashCode()
            result = 31 * result + (stops?.hashCode() ?: 0)
            result = 31 * result + centerX.hashCode()
            result = 31 * result + centerY.hashCode()
            return result
        }
    }
}
