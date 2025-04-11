package com.sdds.uikit.shape

import android.graphics.LinearGradient
import android.graphics.RadialGradient
import android.graphics.Shader
import android.graphics.SweepGradient
import com.sdds.uikit.shader.ShaderFactory
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sin
import kotlin.math.sqrt

/**
 * Описывает [Shader] градиента.
 * @author Малышев Александр on 13.08.2024
 */
sealed class GradientShader : ShaderFactory {

    /**
     * Шейдер линейного градиента
     * @param colors цвета
     * @param positions точки остановки цветов
     * @param angle угол направления градиента (как в Figma)
     */
    class Linear(
        private val colors: IntArray,
        private val positions: FloatArray,
        angle: Float,
    ) : GradientShader() {

        private val normalizedAngle: Float = (angle % 360 + 360) % 360
        private val angleInRadians: Float = Math.toRadians(normalizedAngle.toDouble()).toFloat()

        override fun resize(width: Float, height: Float): Shader {
            val (from, to) = getGradientCoordinates(Size(width, height))
            return LinearGradient(
                from.x,
                from.y,
                to.x,
                to.y,
                colors,
                positions,
                Shader.TileMode.CLAMP,
            )
        }

        private fun getGradientCoordinates(size: Size): Pair<Offset, Offset> {
            val diagonal = sqrt(size.width.pow(2) + size.height.pow(2))
            val angleBetweenDiagonalAndWidth = acos(size.width / diagonal)
            val isSecondQuarter = normalizedAngle.inExclusiveRange(90f, 180f)
            val isFourthQuarter = normalizedAngle.inExclusiveRange(270f, 360f)
            val angleBetweenDiagonalAndGradientLine = if (isSecondQuarter || isFourthQuarter) {
                PI.toFloat() - angleInRadians - angleBetweenDiagonalAndWidth
            } else {
                angleInRadians - angleBetweenDiagonalAndWidth
            }
            val halfGradientLine = abs(cos(angleBetweenDiagonalAndGradientLine) * diagonal) / 2

            val horizontalOffset = (halfGradientLine * cos(angleInRadians))
            val verticalOffset = (halfGradientLine * sin(angleInRadians))

            val start = size.center + Offset(-horizontalOffset, verticalOffset)
            val end = size.center + Offset(horizontalOffset, -verticalOffset)

            return start.round() to end.round()
        }

        private data class Size(
            val width: Float,
            val height: Float,
        ) {
            val center = Offset(width / 2f, height / 2f)
        }

        private data class Offset(
            val x: Float,
            val y: Float,
        ) {
            operator fun plus(other: Offset): Offset = Offset(x + other.x, y + other.y)
        }

        private companion object {

            fun Float.inExclusiveRange(from: Float, to: Float): Boolean {
                return this > from && this < to
            }

            fun Offset.round(): Offset =
                Offset(x = x.roundToInt().toFloat(), y = y.roundToInt().toFloat())
        }
    }

    /**
     * Шейдер радиального градиента
     * @param colors цвета
     * @param positions точки остановки цветов
     * @param radius относительный радиус от 0.0 до 1.0 (0-100%)
     * @param centerX относительная координата центра по X от 0.0 до 1.0 (0-100%)
     * @param centerY относительная координата центра по Y от 0.0 до 1.0 (0-100%)
     */
    class Radial(
        private val colors: IntArray,
        private val positions: FloatArray,
        private val radius: Float,
        private val centerX: Float,
        private val centerY: Float,
    ) : GradientShader() {

        override fun resize(width: Float, height: Float): Shader {
            return RadialGradient(
                width * centerX,
                height * centerY,
                java.lang.Float.max(width, height) * radius / 2f,
                colors,
                positions,
                Shader.TileMode.CLAMP,
            )
        }
    }

    /**
     * Шейдер углового градиента
     * @param colors цвета
     * @param positions точки остановки цветов
     * @param centerX относительная координата центра по X от 0.0 до 1.0 (0-100%)
     * @param centerY относительная координата центра по Y от 0.0 до 1.0 (0-100%)
     */
    class Sweep(
        private val colors: IntArray,
        private val positions: FloatArray,
        private val centerX: Float,
        private val centerY: Float,
    ) : GradientShader() {

        override fun resize(width: Float, height: Float): Shader {
            return SweepGradient(
                width * centerX,
                height * centerY,
                colors,
                positions,
            )
        }
    }

    /**
     * Шейдер сплошного цвета
     * @param color цвет
     */
    class Solid(private val color: Int) : GradientShader() {

        override fun resize(width: Float, height: Float): Shader {
            return LinearGradient(
                0f,
                0f,
                width,
                height,
                intArrayOf(color, color),
                floatArrayOf(0f, 1f),
                Shader.TileMode.CLAMP,
            )
        }
    }
}
