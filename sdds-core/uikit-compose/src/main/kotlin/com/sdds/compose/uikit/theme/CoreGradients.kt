@file:Suppress("LongMethod", "LongParameterList", "UndocumentedPublicProperty", "UnnecessaryAbstractClass")

package com.sdds.compose.uikit.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import com.sdds.compose.uikit.internal.LinearGradient

/**
 * Контракт градиентов SDDS
 * @author Малышев Александр on 23.04.2024
 */
@Immutable
abstract class CoreGradients {
    abstract val textGradientMain: ShaderBrush
    abstract val textGradientAthena: ShaderBrush
    abstract val textGradientJoy: ShaderBrush
    abstract val textGradientB2E: ShaderBrush
    abstract val textGradientBrand: ShaderBrush
    abstract val surfaceGradientMain: ShaderBrush
    abstract val surfaceSkeleton: ShaderBrush
    abstract val onDarkTextGradientMain: ShaderBrush
    abstract val onDarkTextGradientAthena: ShaderBrush
    abstract val onDarkTextGradientJoy: ShaderBrush
    abstract val onDarkTextGradientB2E: ShaderBrush
    abstract val onDarkTextGradientBrand: ShaderBrush
    abstract val onDarkSurfaceGradientMain: ShaderBrush
    abstract val onLightTextGradientMain: ShaderBrush
    abstract val onLightTextGradientAthena: ShaderBrush
    abstract val onLightTextGradientJoy: ShaderBrush
    abstract val onLightTextGradientB2E: ShaderBrush
    abstract val onLightTextGradientBrand: ShaderBrush
    abstract val onLightSurfaceGradientMain: ShaderBrush
}

/**
 * Функция возвращает линейный градиент
 * @param colors цвета градиента
 * @param positions точки-остановки цвета
 * @param angle угол линейного градиента
 * @return [ShaderBrush]
 */
fun linearGradient(
    colors: List<Color>,
    positions: FloatArray,
    angle: Float,
): ShaderBrush {
    return LinearGradient(
        colors,
        positions.toList(),
        angleInDegrees = angle,
        useAsCssAngle = true,
    )
}

/**
 * CompositionLocal палитры градиентов
 */
val LocalGradients = staticCompositionLocalOf { debugGradients() }

private fun debugGradients(): CoreGradients =
    CoreGradientsImpl(
        textGradientMain = BlackWhiteDebugGradient,
        textGradientAthena = BlackWhiteDebugGradient,
        textGradientJoy = BlackWhiteDebugGradient,
        textGradientB2E = BlackWhiteDebugGradient,
        textGradientBrand = BlackWhiteDebugGradient,
        surfaceGradientMain = BlackWhiteDebugGradient,
        surfaceSkeleton = BlackWhiteDebugGradient,
        onDarkTextGradientMain = BlackWhiteDebugGradient,
        onDarkTextGradientAthena = BlackWhiteDebugGradient,
        onDarkTextGradientJoy = BlackWhiteDebugGradient,
        onDarkTextGradientB2E = BlackWhiteDebugGradient,
        onDarkTextGradientBrand = BlackWhiteDebugGradient,
        onDarkSurfaceGradientMain = BlackWhiteDebugGradient,
        onLightTextGradientMain = BlackWhiteDebugGradient,
        onLightTextGradientAthena = BlackWhiteDebugGradient,
        onLightTextGradientJoy = BlackWhiteDebugGradient,
        onLightTextGradientB2E = BlackWhiteDebugGradient,
        onLightTextGradientBrand = BlackWhiteDebugGradient,
        onLightSurfaceGradientMain = BlackWhiteDebugGradient,
    )

private val BlackWhiteDebugGradient = linearGradient(
    colors = listOf(Color.White, Color.Black),
    positions = floatArrayOf(0f, 1f),
    angle = 0f,
)

private class CoreGradientsImpl(
    override val textGradientMain: ShaderBrush,
    override val textGradientAthena: ShaderBrush,
    override val textGradientJoy: ShaderBrush,
    override val textGradientB2E: ShaderBrush,
    override val textGradientBrand: ShaderBrush,
    override val surfaceGradientMain: ShaderBrush,
    override val surfaceSkeleton: ShaderBrush,
    override val onDarkTextGradientMain: ShaderBrush,
    override val onDarkTextGradientAthena: ShaderBrush,
    override val onDarkTextGradientJoy: ShaderBrush,
    override val onDarkTextGradientB2E: ShaderBrush,
    override val onDarkTextGradientBrand: ShaderBrush,
    override val onDarkSurfaceGradientMain: ShaderBrush,
    override val onLightTextGradientMain: ShaderBrush,
    override val onLightTextGradientAthena: ShaderBrush,
    override val onLightTextGradientJoy: ShaderBrush,
    override val onLightTextGradientB2E: ShaderBrush,
    override val onLightTextGradientBrand: ShaderBrush,
    override val onLightSurfaceGradientMain: ShaderBrush,
) : CoreGradients()
