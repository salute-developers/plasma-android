package com.sdds.compose.uikit.motion

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.lerp
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.unit.toIntSize
import androidx.compose.ui.unit.toSize
import com.sdds.compose.uikit.graphics.brush.crossFadeShaderBrush

/**
 * Вычисляет промежуточное значение для [InterpolationMotionProperty].
 */
fun interface MotionEvaluator<T> {

    /**
     * Вычисляет промежуточное значение для [InterpolationMotionProperty].
     *
     * @param from значение в начальной точке интерполяции.
     * @param to значение в конечной точке интерполяции.
     * @param fraction прогресс интерполяции в диапазоне от `0f` до `1f`.
     */
    fun evaluate(from: T, to: T, fraction: Float): T
}

/**
 * Оборачивает [interpolator] в [MotionInterpolationSpec].
 */
fun <T> InterpolationMotionPropertyScope<T>.interpolationSpec(
    interpolator: MotionEvaluator<T>,
): MotionInterpolationSpec<T> = MotionInterpolationSpecImpl(interpolator)

/**
 * Возвращает evaluator для интерполяции [Color].
 */
fun colorEvaluator(): MotionEvaluator<Color> =
    MotionEvaluator { from, to, fraction -> lerp(from, to, fraction) }

/**
 * Возвращает evaluator для интерполяции [Dp].
 */
fun dpEvaluator(): MotionEvaluator<Dp> =
    MotionEvaluator { from, to, fraction -> lerp(from, to, fraction) }

/**
 * Возвращает evaluator для интерполяции [Rect].
 */
fun rectEvaluator(): MotionEvaluator<Rect> =
    MotionEvaluator { from, to, fraction -> lerp(from, to, fraction) }

/**
 * Возвращает evaluator для интерполяции [Size].
 */
fun sizeEvaluator(): MotionEvaluator<Size> =
    MotionEvaluator { from, to, fraction -> lerp(from, to, fraction) }

/**
 * Возвращает evaluator для интерполяции [IntSize].
 */
fun intSizeEvaluator(): MotionEvaluator<IntSize> =
    MotionEvaluator { from, to, fraction -> lerp(from.toSize(), to.toSize(), fraction).toIntSize() }

/**
 * Возвращает evaluator для интерполяции [Offset].
 */
fun offsetEvaluator(): MotionEvaluator<Offset> =
    MotionEvaluator { from, to, fraction -> lerp(from, to, fraction) }

/**
 * Возвращает evaluator для интерполяции [DpOffset].
 */
fun dpOffsetEvaluator(): MotionEvaluator<DpOffset> =
    MotionEvaluator { from, to, fraction -> lerp(from, to, fraction) }

/**
 * Возвращает evaluator для интерполяции [Brush].
 *
 * Для [SolidColor] используется линейная интерполяция цвета. Для [ShaderBrush] создаётся
 * `cross-fade` через [CrossFadeShaderBrush]. Если кисти несовместимы, возвращается конечное значение.
 */
fun genericBrushEvaluator(): MotionEvaluator<Brush> =
    MotionEvaluator { from, to, fraction ->
        if (from is SolidColor && to is SolidColor) {
            val color = lerp(from.value, to.value, fraction)
            SolidColor(color)
        } else if (from is ShaderBrush && to is ShaderBrush) {
            Brush.crossFadeShaderBrush(
                start = from,
                end = to,
                fraction = fraction,
            )
        } else {
            to
        }
    }
