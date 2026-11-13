// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress("UndocumentedPublicProperty")

package com.sdds.finai.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import com.sdds.compose.uikit.graphics.Gradients
import com.sdds.finai.tokens.DarkGradientTokens
import com.sdds.finai.tokens.DarkGradientTokensBetaCore
import com.sdds.finai.tokens.DarkGradientTokensHighContrast
import com.sdds.finai.tokens.LightGradientTokens
import com.sdds.finai.tokens.LightGradientTokensBetaCore
import com.sdds.finai.tokens.LightGradientTokensHighContrast
import kotlin.Float
import kotlin.FloatArray
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableMap

/**
 * Градиенты SddsFinAi
 */
@Immutable
public class SddsFinAiGradients(
    private val gradients: Map<String, List<ShaderBrush>>,
) {
    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnDarkWarningGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataInversePositiveGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradient: List<ShaderBrush> by gradients

    /**
     * dark text inverse textAccentGradientMinorActive
     */
    public val textInverseAccentGradientMinorActive: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnLightWarningGradientActive: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * dark text default textAccentGradientMinorActive
     */
    public val textDefaultAccentGradientMinorActive: List<ShaderBrush> by gradients

    /**
     * dark text default textAccentGradientMinor
     */
    public val textDefaultAccentGradientMinor: List<ShaderBrush> by gradients

    /**
     * dark text default textAccentGradientMinorHover
     */
    public val textDefaultAccentGradientMinorHover: List<ShaderBrush> by gradients

    /**
     * dark text inverse textAccentGradientMinor
     */
    public val textInverseAccentGradientMinor: List<ShaderBrush> by gradients

    /**
     * dark text inverse textAccentGradientMinorHover
     */
    public val textInverseAccentGradientMinorHover: List<ShaderBrush> by gradients

    /**
     * dark text onDark textAccentGradientMinor
     */
    public val textOnDarkAccentGradientMinor: List<ShaderBrush> by gradients

    /**
     * dark text onDark textAccentGradientMinorActive
     */
    public val textOnDarkAccentGradientMinorActive: List<ShaderBrush> by gradients

    /**
     * dark text onDark textAccentGradientMinorHover
     */
    public val textOnDarkAccentGradientMinorHover: List<ShaderBrush> by gradients

    /**
     * dark text onLight textAccentGradientMinor
     */
    public val textOnLightAccentGradientMinor: List<ShaderBrush> by gradients

    /**
     * dark text onLight textAccentGradientMinorActive
     */
    public val textOnLightAccentGradientMinorActive: List<ShaderBrush> by gradients

    /**
     * dark text onLight textAccentGradientMinorHover
     */
    public val textOnLightAccentGradientMinorHover: List<ShaderBrush> by gradients

    /**
     * dark text onDark textAccentGradient
     */
    public val textOnDarkAccentGradient: List<ShaderBrush> by gradients

    /**
     * dark text inverse textAccentGradientActive
     */
    public val textInverseAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * dark text inverse textAccentGradient
     */
    public val textInverseAccentGradient: List<ShaderBrush> by gradients

    /**
     * dark text onLight textAccentGradientHover
     */
    public val textOnLightAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * dark text onLight textAccentGradientActive
     */
    public val textOnLightAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * dark text onLight textAccentGradient
     */
    public val textOnLightAccentGradient: List<ShaderBrush> by gradients

    /**
     * dark text default textAccentGradient
     */
    public val textDefaultAccentGradient: List<ShaderBrush> by gradients

    /**
     * dark text default textAccentGradientActive
     */
    public val textDefaultAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * dark text default textAccentGradientHover
     */
    public val textDefaultAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * dark text onDark textAccentGradientHover
     */
    public val textOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * dark text onDark textAccentGradientActive
     */
    public val textOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * dark text inverse textAccentGradientHover
     */
    public val textInverseAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataInverseWarningGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataInverseWarningGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnLightWarningGradient: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnDarkWarningGradient: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnDarkWarningGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataDefaultWarningGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataDefaultWarningGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataDefaultWarningGradient: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnLightWarningGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataInverseWarningGradient: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataInversePositiveGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataDefaultPositiveGradient: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataDefaultPositiveGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataDefaultPositiveGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataInversePositiveGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnDarkPositiveGradient: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnDarkPositiveGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnDarkPositiveGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnLightPositiveGradient: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnLightPositiveGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnLightPositiveGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnDarkNegativeGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnDarkNegativeGradient: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataDefaultNegativeGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataInverseNegativeGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataInverseNegativeGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnLightNegativeGradient: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnLightNegativeGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnLightNegativeGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataDefaultNegativeGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataInverseNegativeGradient: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataDefaultNegativeGradient: List<ShaderBrush> by gradients

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnDarkNegativeGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataInverseInfoGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataInverseInfoGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataOnDarkInfoGradient: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataOnDarkInfoGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataDefaultInfoGradient: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataDefaultInfoGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataDefaultInfoGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataOnDarkInfoGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataOnLightInfoGradientHover: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataOnLightInfoGradientActive: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataOnLightInfoGradient: List<ShaderBrush> by gradients

    /**
     * Цвет информации с градиентом
     */
    public val dataInverseInfoGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Возвращает копию [SddsFinAiGradients]. Предоставляет возможность переопределять градиенты.
     */
    public fun copy(overrideGradients: GradientOverrideScope.() -> Unit = {}): SddsFinAiGradients {
        val gradientOverrideScope = GradientOverrideScope()
        overrideGradients.invoke(gradientOverrideScope)
        val overrideMap = gradientOverrideScope.overrideMap
        return SddsFinAiGradients(gradients.mapValues { overrideMap[it.key] ?: it.value })
    }

    /**
     * Возвращает копию [SddsFinAiGradients]. Предоставляет возможность переопределять цвета.
     */
    internal fun copyAttrs(overrideGradients: GradientAttrOverrideScope.() -> Unit = {}): SddsFinAiGradients {
        val gradientOverrideScope = GradientAttrOverrideScope()
        overrideGradients.invoke(gradientOverrideScope)
        val overrideMap = gradientOverrideScope.overrideMap
        return SddsFinAiGradients(
            gradients.mapValues {
                gradients[overrideMap[it.key]] ?: it.value
            },
        )
    }
}

/**
 * Скоуп переопределения градиентов
 */
public class GradientOverrideScope {
    private val _overrideMap: MutableMap<String, List<ShaderBrush>> = mutableMapOf()

    internal val overrideMap: Map<String, List<ShaderBrush>>
        get() = _overrideMap.toMap()

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnDarkWarningGradientActive: String = "dataOnDarkWarningGradientActive"

    /**
     * Цвет успеха с градиентом
     */
    public val dataInversePositiveGradient: String = "dataInversePositiveGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradient: String = "surfaceOnLightAccentGradient"

    /**
     * dark text inverse textAccentGradientMinorActive
     */
    public val textInverseAccentGradientMinorActive: String = "textInverseAccentGradientMinorActive"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnLightWarningGradientActive: String = "dataOnLightWarningGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradient: String = "surfaceDefaultSkeletonGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradient: String = "surfaceDefaultAccentGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientActive: String = "surfaceDefaultAccentGradientActive"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientHover: String = "surfaceDefaultAccentGradientHover"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradient: String = "surfaceInverseAccentGradient"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientActive: String = "surfaceInverseAccentGradientActive"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientHover: String = "surfaceInverseAccentGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradient: String = "surfaceOnDarkAccentGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientActive: String = "surfaceOnDarkAccentGradientActive"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientHover: String = "surfaceOnDarkAccentGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientActive: String = "surfaceOnLightAccentGradientActive"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientHover: String = "surfaceOnLightAccentGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientHover: String = "surfaceOnDarkSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradient: String = "surfaceOnLightSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientActive: String = "surfaceOnLightSkeletonGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientHover: String = "surfaceOnLightSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientHover: String = "surfaceDefaultSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientActive: String = "surfaceDefaultSkeletonGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientActive: String = "surfaceOnDarkSkeletonGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradient: String = "surfaceOnDarkSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientHover: String = "surfaceInverseSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientActive: String = "surfaceInverseSkeletonGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradient: String = "surfaceInverseSkeletonGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientActive: String =
        "surfaceOnLightSkeletonDeepGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradient: String = "surfaceDefaultSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientActive: String =
        "surfaceDefaultSkeletonDeepGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientHover: String =
        "surfaceDefaultSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientHover: String =
        "surfaceOnLightSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradient: String = "surfaceInverseSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientActive: String =
        "surfaceInverseSkeletonDeepGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientHover: String =
        "surfaceInverseSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradient: String = "surfaceOnLightSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradient: String = "surfaceOnDarkSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientActive: String =
        "surfaceOnDarkSkeletonDeepGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientHover: String =
        "surfaceOnDarkSkeletonDeepGradientHover"

    /**
     * dark text default textAccentGradientMinorActive
     */
    public val textDefaultAccentGradientMinorActive: String = "textDefaultAccentGradientMinorActive"

    /**
     * dark text default textAccentGradientMinor
     */
    public val textDefaultAccentGradientMinor: String = "textDefaultAccentGradientMinor"

    /**
     * dark text default textAccentGradientMinorHover
     */
    public val textDefaultAccentGradientMinorHover: String = "textDefaultAccentGradientMinorHover"

    /**
     * dark text inverse textAccentGradientMinor
     */
    public val textInverseAccentGradientMinor: String = "textInverseAccentGradientMinor"

    /**
     * dark text inverse textAccentGradientMinorHover
     */
    public val textInverseAccentGradientMinorHover: String = "textInverseAccentGradientMinorHover"

    /**
     * dark text onDark textAccentGradientMinor
     */
    public val textOnDarkAccentGradientMinor: String = "textOnDarkAccentGradientMinor"

    /**
     * dark text onDark textAccentGradientMinorActive
     */
    public val textOnDarkAccentGradientMinorActive: String = "textOnDarkAccentGradientMinorActive"

    /**
     * dark text onDark textAccentGradientMinorHover
     */
    public val textOnDarkAccentGradientMinorHover: String = "textOnDarkAccentGradientMinorHover"

    /**
     * dark text onLight textAccentGradientMinor
     */
    public val textOnLightAccentGradientMinor: String = "textOnLightAccentGradientMinor"

    /**
     * dark text onLight textAccentGradientMinorActive
     */
    public val textOnLightAccentGradientMinorActive: String = "textOnLightAccentGradientMinorActive"

    /**
     * dark text onLight textAccentGradientMinorHover
     */
    public val textOnLightAccentGradientMinorHover: String = "textOnLightAccentGradientMinorHover"

    /**
     * dark text onDark textAccentGradient
     */
    public val textOnDarkAccentGradient: String = "textOnDarkAccentGradient"

    /**
     * dark text inverse textAccentGradientActive
     */
    public val textInverseAccentGradientActive: String = "textInverseAccentGradientActive"

    /**
     * dark text inverse textAccentGradient
     */
    public val textInverseAccentGradient: String = "textInverseAccentGradient"

    /**
     * dark text onLight textAccentGradientHover
     */
    public val textOnLightAccentGradientHover: String = "textOnLightAccentGradientHover"

    /**
     * dark text onLight textAccentGradientActive
     */
    public val textOnLightAccentGradientActive: String = "textOnLightAccentGradientActive"

    /**
     * dark text onLight textAccentGradient
     */
    public val textOnLightAccentGradient: String = "textOnLightAccentGradient"

    /**
     * dark text default textAccentGradient
     */
    public val textDefaultAccentGradient: String = "textDefaultAccentGradient"

    /**
     * dark text default textAccentGradientActive
     */
    public val textDefaultAccentGradientActive: String = "textDefaultAccentGradientActive"

    /**
     * dark text default textAccentGradientHover
     */
    public val textDefaultAccentGradientHover: String = "textDefaultAccentGradientHover"

    /**
     * dark text onDark textAccentGradientHover
     */
    public val textOnDarkAccentGradientHover: String = "textOnDarkAccentGradientHover"

    /**
     * dark text onDark textAccentGradientActive
     */
    public val textOnDarkAccentGradientActive: String = "textOnDarkAccentGradientActive"

    /**
     * dark text inverse textAccentGradientHover
     */
    public val textInverseAccentGradientHover: String = "textInverseAccentGradientHover"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataInverseWarningGradientActive: String = "dataInverseWarningGradientActive"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataInverseWarningGradientHover: String = "dataInverseWarningGradientHover"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnLightWarningGradient: String = "dataOnLightWarningGradient"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnDarkWarningGradient: String = "dataOnDarkWarningGradient"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnDarkWarningGradientHover: String = "dataOnDarkWarningGradientHover"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataDefaultWarningGradientHover: String = "dataDefaultWarningGradientHover"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataDefaultWarningGradientActive: String = "dataDefaultWarningGradientActive"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataDefaultWarningGradient: String = "dataDefaultWarningGradient"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnLightWarningGradientHover: String = "dataOnLightWarningGradientHover"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataInverseWarningGradient: String = "dataInverseWarningGradient"

    /**
     * Цвет успеха с градиентом
     */
    public val dataInversePositiveGradientHover: String = "dataInversePositiveGradientHover"

    /**
     * Цвет успеха с градиентом
     */
    public val dataDefaultPositiveGradient: String = "dataDefaultPositiveGradient"

    /**
     * Цвет успеха с градиентом
     */
    public val dataDefaultPositiveGradientActive: String = "dataDefaultPositiveGradientActive"

    /**
     * Цвет успеха с градиентом
     */
    public val dataDefaultPositiveGradientHover: String = "dataDefaultPositiveGradientHover"

    /**
     * Цвет успеха с градиентом
     */
    public val dataInversePositiveGradientActive: String = "dataInversePositiveGradientActive"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnDarkPositiveGradient: String = "dataOnDarkPositiveGradient"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnDarkPositiveGradientActive: String = "dataOnDarkPositiveGradientActive"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnDarkPositiveGradientHover: String = "dataOnDarkPositiveGradientHover"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnLightPositiveGradient: String = "dataOnLightPositiveGradient"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnLightPositiveGradientActive: String = "dataOnLightPositiveGradientActive"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnLightPositiveGradientHover: String = "dataOnLightPositiveGradientHover"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnDarkNegativeGradientHover: String = "dataOnDarkNegativeGradientHover"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnDarkNegativeGradient: String = "dataOnDarkNegativeGradient"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataDefaultNegativeGradientActive: String = "dataDefaultNegativeGradientActive"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataInverseNegativeGradientHover: String = "dataInverseNegativeGradientHover"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataInverseNegativeGradientActive: String = "dataInverseNegativeGradientActive"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnLightNegativeGradient: String = "dataOnLightNegativeGradient"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnLightNegativeGradientActive: String = "dataOnLightNegativeGradientActive"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnLightNegativeGradientHover: String = "dataOnLightNegativeGradientHover"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataDefaultNegativeGradientHover: String = "dataDefaultNegativeGradientHover"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataInverseNegativeGradient: String = "dataInverseNegativeGradient"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataDefaultNegativeGradient: String = "dataDefaultNegativeGradient"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnDarkNegativeGradientActive: String = "dataOnDarkNegativeGradientActive"

    /**
     * Цвет информации с градиентом
     */
    public val dataInverseInfoGradientActive: String = "dataInverseInfoGradientActive"

    /**
     * Цвет информации с градиентом
     */
    public val dataInverseInfoGradientHover: String = "dataInverseInfoGradientHover"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnDarkInfoGradient: String = "dataOnDarkInfoGradient"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnDarkInfoGradientActive: String = "dataOnDarkInfoGradientActive"

    /**
     * Цвет информации с градиентом
     */
    public val dataDefaultInfoGradient: String = "dataDefaultInfoGradient"

    /**
     * Цвет информации с градиентом
     */
    public val dataDefaultInfoGradientActive: String = "dataDefaultInfoGradientActive"

    /**
     * Цвет информации с градиентом
     */
    public val dataDefaultInfoGradientHover: String = "dataDefaultInfoGradientHover"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnDarkInfoGradientHover: String = "dataOnDarkInfoGradientHover"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnLightInfoGradientHover: String = "dataOnLightInfoGradientHover"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnLightInfoGradientActive: String = "dataOnLightInfoGradientActive"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnLightInfoGradient: String = "dataOnLightInfoGradient"

    /**
     * Цвет информации с градиентом
     */
    public val dataInverseInfoGradient: String = "dataInverseInfoGradient"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientHover: String = "outlineOnDarkAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradient: String = "outlineDefaultAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradient: String = "outlineOnLightAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientActive: String = "outlineDefaultAccentGradientActive"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientHover: String = "outlineDefaultAccentGradientHover"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradient: String = "outlineInverseAccentGradient"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientActive: String = "outlineInverseAccentGradientActive"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientHover: String = "outlineInverseAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradient: String = "outlineOnDarkAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientActive: String = "outlineOnLightAccentGradientActive"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientHover: String = "outlineOnLightAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientActive: String = "outlineOnDarkAccentGradientActive"

    /**
     * Переопределяет аттрибут градиента.
     */
    public infix fun String.overrideBy(gradient: List<ShaderBrush>) {
        _overrideMap[this] = gradient
    }
}

/**
 * Скоуп переопределения градиентов
 */
public class GradientAttrOverrideScope {
    private val _overrideMap: MutableMap<String, String> = mutableMapOf()

    internal val overrideMap: Map<String, String>
        get() = _overrideMap.toMap()

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnDarkWarningGradientActive: String = "dataOnDarkWarningGradientActive"

    /**
     * Цвет успеха с градиентом
     */
    public val dataInversePositiveGradient: String = "dataInversePositiveGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradient: String = "surfaceOnLightAccentGradient"

    /**
     * dark text inverse textAccentGradientMinorActive
     */
    public val textInverseAccentGradientMinorActive: String = "textInverseAccentGradientMinorActive"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnLightWarningGradientActive: String = "dataOnLightWarningGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradient: String = "surfaceDefaultSkeletonGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradient: String = "surfaceDefaultAccentGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientActive: String = "surfaceDefaultAccentGradientActive"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientHover: String = "surfaceDefaultAccentGradientHover"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradient: String = "surfaceInverseAccentGradient"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientActive: String = "surfaceInverseAccentGradientActive"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientHover: String = "surfaceInverseAccentGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradient: String = "surfaceOnDarkAccentGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientActive: String = "surfaceOnDarkAccentGradientActive"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientHover: String = "surfaceOnDarkAccentGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientActive: String = "surfaceOnLightAccentGradientActive"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientHover: String = "surfaceOnLightAccentGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientHover: String = "surfaceOnDarkSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradient: String = "surfaceOnLightSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientActive: String = "surfaceOnLightSkeletonGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientHover: String = "surfaceOnLightSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientHover: String = "surfaceDefaultSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientActive: String = "surfaceDefaultSkeletonGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientActive: String = "surfaceOnDarkSkeletonGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradient: String = "surfaceOnDarkSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientHover: String = "surfaceInverseSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientActive: String = "surfaceInverseSkeletonGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradient: String = "surfaceInverseSkeletonGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientActive: String =
        "surfaceOnLightSkeletonDeepGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradient: String = "surfaceDefaultSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientActive: String =
        "surfaceDefaultSkeletonDeepGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientHover: String =
        "surfaceDefaultSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientHover: String =
        "surfaceOnLightSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradient: String = "surfaceInverseSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientActive: String =
        "surfaceInverseSkeletonDeepGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientHover: String =
        "surfaceInverseSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradient: String = "surfaceOnLightSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradient: String = "surfaceOnDarkSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientActive: String =
        "surfaceOnDarkSkeletonDeepGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientHover: String =
        "surfaceOnDarkSkeletonDeepGradientHover"

    /**
     * dark text default textAccentGradientMinorActive
     */
    public val textDefaultAccentGradientMinorActive: String = "textDefaultAccentGradientMinorActive"

    /**
     * dark text default textAccentGradientMinor
     */
    public val textDefaultAccentGradientMinor: String = "textDefaultAccentGradientMinor"

    /**
     * dark text default textAccentGradientMinorHover
     */
    public val textDefaultAccentGradientMinorHover: String = "textDefaultAccentGradientMinorHover"

    /**
     * dark text inverse textAccentGradientMinor
     */
    public val textInverseAccentGradientMinor: String = "textInverseAccentGradientMinor"

    /**
     * dark text inverse textAccentGradientMinorHover
     */
    public val textInverseAccentGradientMinorHover: String = "textInverseAccentGradientMinorHover"

    /**
     * dark text onDark textAccentGradientMinor
     */
    public val textOnDarkAccentGradientMinor: String = "textOnDarkAccentGradientMinor"

    /**
     * dark text onDark textAccentGradientMinorActive
     */
    public val textOnDarkAccentGradientMinorActive: String = "textOnDarkAccentGradientMinorActive"

    /**
     * dark text onDark textAccentGradientMinorHover
     */
    public val textOnDarkAccentGradientMinorHover: String = "textOnDarkAccentGradientMinorHover"

    /**
     * dark text onLight textAccentGradientMinor
     */
    public val textOnLightAccentGradientMinor: String = "textOnLightAccentGradientMinor"

    /**
     * dark text onLight textAccentGradientMinorActive
     */
    public val textOnLightAccentGradientMinorActive: String = "textOnLightAccentGradientMinorActive"

    /**
     * dark text onLight textAccentGradientMinorHover
     */
    public val textOnLightAccentGradientMinorHover: String = "textOnLightAccentGradientMinorHover"

    /**
     * dark text onDark textAccentGradient
     */
    public val textOnDarkAccentGradient: String = "textOnDarkAccentGradient"

    /**
     * dark text inverse textAccentGradientActive
     */
    public val textInverseAccentGradientActive: String = "textInverseAccentGradientActive"

    /**
     * dark text inverse textAccentGradient
     */
    public val textInverseAccentGradient: String = "textInverseAccentGradient"

    /**
     * dark text onLight textAccentGradientHover
     */
    public val textOnLightAccentGradientHover: String = "textOnLightAccentGradientHover"

    /**
     * dark text onLight textAccentGradientActive
     */
    public val textOnLightAccentGradientActive: String = "textOnLightAccentGradientActive"

    /**
     * dark text onLight textAccentGradient
     */
    public val textOnLightAccentGradient: String = "textOnLightAccentGradient"

    /**
     * dark text default textAccentGradient
     */
    public val textDefaultAccentGradient: String = "textDefaultAccentGradient"

    /**
     * dark text default textAccentGradientActive
     */
    public val textDefaultAccentGradientActive: String = "textDefaultAccentGradientActive"

    /**
     * dark text default textAccentGradientHover
     */
    public val textDefaultAccentGradientHover: String = "textDefaultAccentGradientHover"

    /**
     * dark text onDark textAccentGradientHover
     */
    public val textOnDarkAccentGradientHover: String = "textOnDarkAccentGradientHover"

    /**
     * dark text onDark textAccentGradientActive
     */
    public val textOnDarkAccentGradientActive: String = "textOnDarkAccentGradientActive"

    /**
     * dark text inverse textAccentGradientHover
     */
    public val textInverseAccentGradientHover: String = "textInverseAccentGradientHover"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataInverseWarningGradientActive: String = "dataInverseWarningGradientActive"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataInverseWarningGradientHover: String = "dataInverseWarningGradientHover"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnLightWarningGradient: String = "dataOnLightWarningGradient"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnDarkWarningGradient: String = "dataOnDarkWarningGradient"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnDarkWarningGradientHover: String = "dataOnDarkWarningGradientHover"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataDefaultWarningGradientHover: String = "dataDefaultWarningGradientHover"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataDefaultWarningGradientActive: String = "dataDefaultWarningGradientActive"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataDefaultWarningGradient: String = "dataDefaultWarningGradient"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataOnLightWarningGradientHover: String = "dataOnLightWarningGradientHover"

    /**
     * Цвет предупреждения с градиентом
     */
    public val dataInverseWarningGradient: String = "dataInverseWarningGradient"

    /**
     * Цвет успеха с градиентом
     */
    public val dataInversePositiveGradientHover: String = "dataInversePositiveGradientHover"

    /**
     * Цвет успеха с градиентом
     */
    public val dataDefaultPositiveGradient: String = "dataDefaultPositiveGradient"

    /**
     * Цвет успеха с градиентом
     */
    public val dataDefaultPositiveGradientActive: String = "dataDefaultPositiveGradientActive"

    /**
     * Цвет успеха с градиентом
     */
    public val dataDefaultPositiveGradientHover: String = "dataDefaultPositiveGradientHover"

    /**
     * Цвет успеха с градиентом
     */
    public val dataInversePositiveGradientActive: String = "dataInversePositiveGradientActive"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnDarkPositiveGradient: String = "dataOnDarkPositiveGradient"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnDarkPositiveGradientActive: String = "dataOnDarkPositiveGradientActive"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnDarkPositiveGradientHover: String = "dataOnDarkPositiveGradientHover"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnLightPositiveGradient: String = "dataOnLightPositiveGradient"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnLightPositiveGradientActive: String = "dataOnLightPositiveGradientActive"

    /**
     * Цвет успеха с градиентом
     */
    public val dataOnLightPositiveGradientHover: String = "dataOnLightPositiveGradientHover"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnDarkNegativeGradientHover: String = "dataOnDarkNegativeGradientHover"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnDarkNegativeGradient: String = "dataOnDarkNegativeGradient"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataDefaultNegativeGradientActive: String = "dataDefaultNegativeGradientActive"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataInverseNegativeGradientHover: String = "dataInverseNegativeGradientHover"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataInverseNegativeGradientActive: String = "dataInverseNegativeGradientActive"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnLightNegativeGradient: String = "dataOnLightNegativeGradient"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnLightNegativeGradientActive: String = "dataOnLightNegativeGradientActive"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnLightNegativeGradientHover: String = "dataOnLightNegativeGradientHover"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataDefaultNegativeGradientHover: String = "dataDefaultNegativeGradientHover"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataInverseNegativeGradient: String = "dataInverseNegativeGradient"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataDefaultNegativeGradient: String = "dataDefaultNegativeGradient"

    /**
     * Цвет ошибки с градиентом
     */
    public val dataOnDarkNegativeGradientActive: String = "dataOnDarkNegativeGradientActive"

    /**
     * Цвет информации с градиентом
     */
    public val dataInverseInfoGradientActive: String = "dataInverseInfoGradientActive"

    /**
     * Цвет информации с градиентом
     */
    public val dataInverseInfoGradientHover: String = "dataInverseInfoGradientHover"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnDarkInfoGradient: String = "dataOnDarkInfoGradient"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnDarkInfoGradientActive: String = "dataOnDarkInfoGradientActive"

    /**
     * Цвет информации с градиентом
     */
    public val dataDefaultInfoGradient: String = "dataDefaultInfoGradient"

    /**
     * Цвет информации с градиентом
     */
    public val dataDefaultInfoGradientActive: String = "dataDefaultInfoGradientActive"

    /**
     * Цвет информации с градиентом
     */
    public val dataDefaultInfoGradientHover: String = "dataDefaultInfoGradientHover"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnDarkInfoGradientHover: String = "dataOnDarkInfoGradientHover"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnLightInfoGradientHover: String = "dataOnLightInfoGradientHover"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnLightInfoGradientActive: String = "dataOnLightInfoGradientActive"

    /**
     * Цвет информации с градиентом
     */
    public val dataOnLightInfoGradient: String = "dataOnLightInfoGradient"

    /**
     * Цвет информации с градиентом
     */
    public val dataInverseInfoGradient: String = "dataInverseInfoGradient"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientHover: String = "outlineOnDarkAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradient: String = "outlineDefaultAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradient: String = "outlineOnLightAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientActive: String = "outlineDefaultAccentGradientActive"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientHover: String = "outlineDefaultAccentGradientHover"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradient: String = "outlineInverseAccentGradient"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientActive: String = "outlineInverseAccentGradientActive"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientHover: String = "outlineInverseAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradient: String = "outlineOnDarkAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientActive: String = "outlineOnLightAccentGradientActive"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientHover: String = "outlineOnLightAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientActive: String = "outlineOnDarkAccentGradientActive"

    /**
     * Переопределяет аттрибут градиента.
     */
    public infix fun String.overrideBy(gradient: String) {
        _overrideMap[this] = gradient
    }
}

internal val LocalSddsFinAiGradients: ProvidableCompositionLocal<SddsFinAiGradients> =
    staticCompositionLocalOf {
        lightSddsFinAiGradients()
    }

private fun MutableMap<String, List<ShaderBrush>>.add(
    attribute: String,
    defaultTokenValue: List<ShaderBrush>,
    overwriteMap: Map<String, List<ShaderBrush>>,
) {
    this[attribute] = overwriteMap[attribute] ?: defaultTokenValue
}

/**
 * Градиенты [SddsFinAiGradients] для светлой темы
 */
@Suppress("LongMethod")
public fun lightSddsFinAiGradients(overrideGradients: GradientOverrideScope.() -> Unit = {}): SddsFinAiGradients {
    val gradientOverrideScope = GradientOverrideScope()
    overrideGradients.invoke(gradientOverrideScope)
    val overwrite = gradientOverrideScope.overrideMap
    val initial = mutableMapOf<String, List<ShaderBrush>>()
    initial.add(
        "dataOnDarkWarningGradientActive",
        listOf(singleColor(LightGradientTokens.DataOnDarkWarningGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataInversePositiveGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataInversePositiveGradient.colors,
                LightGradientTokens.DataInversePositiveGradient.positions,
                LightGradientTokens.DataInversePositiveGradient.radius,
                LightGradientTokens.DataInversePositiveGradient.centerX,
                LightGradientTokens.DataInversePositiveGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightAccentGradient.colors,
                LightGradientTokens.SurfaceOnLightAccentGradient.positions,
                LightGradientTokens.SurfaceOnLightAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientMinorActive",
        listOf(singleColor(LightGradientTokens.TextInverseAccentGradientMinorActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightWarningGradientActive",
        listOf(singleColor(LightGradientTokens.DataOnLightWarningGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonGradient.colors,
                LightGradientTokens.SurfaceDefaultSkeletonGradient.positions,
                LightGradientTokens.SurfaceDefaultSkeletonGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultAccentGradient.colors,
                LightGradientTokens.SurfaceDefaultAccentGradient.positions,
                LightGradientTokens.SurfaceDefaultAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceDefaultAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceDefaultAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseAccentGradient.colors,
                LightGradientTokens.SurfaceInverseAccentGradient.positions,
                LightGradientTokens.SurfaceInverseAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceInverseAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceInverseAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkAccentGradient.colors,
                LightGradientTokens.SurfaceOnDarkAccentGradient.positions,
                LightGradientTokens.SurfaceOnDarkAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceOnDarkAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceOnDarkAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceOnLightAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceOnLightAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceOnDarkSkeletonGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonGradient.colors,
                LightGradientTokens.SurfaceOnLightSkeletonGradient.positions,
                LightGradientTokens.SurfaceOnLightSkeletonGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceOnLightSkeletonGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceOnLightSkeletonGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceDefaultSkeletonGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceDefaultSkeletonGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceOnDarkSkeletonGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonGradient.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonGradient.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceInverseSkeletonGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceInverseSkeletonGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonGradient.colors,
                LightGradientTokens.SurfaceInverseSkeletonGradient.positions,
                LightGradientTokens.SurfaceInverseSkeletonGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.colors,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.positions,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonDeepGradient.colors,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradient.positions,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceInverseSkeletonDeepGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceInverseSkeletonDeepGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.colors,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.positions,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradient",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradientActive",
        listOf(singleColor(LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradientHover",
        listOf(singleColor(LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.background)),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientMinorActive",
        listOf(singleColor(LightGradientTokens.TextDefaultAccentGradientMinorActive.background)),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientMinor",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradientMinor.Layer0.colors,
                LightGradientTokens.TextDefaultAccentGradientMinor.Layer0.positions,
                LightGradientTokens.TextDefaultAccentGradientMinor.Layer0.angle,
            ),
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradientMinor.Layer1.colors,
                LightGradientTokens.TextDefaultAccentGradientMinor.Layer1.positions,
                LightGradientTokens.TextDefaultAccentGradientMinor.Layer1.angle,
            ),
            singleColor(LightGradientTokens.TextDefaultAccentGradientMinor.Layer2.background),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientMinorHover",
        listOf(singleColor(LightGradientTokens.TextDefaultAccentGradientMinorHover.background)),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientMinor",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradientMinor.Layer0.colors,
                LightGradientTokens.TextInverseAccentGradientMinor.Layer0.positions,
                LightGradientTokens.TextInverseAccentGradientMinor.Layer0.angle,
            ),
            linearGradient(
                LightGradientTokens.TextInverseAccentGradientMinor.Layer1.colors,
                LightGradientTokens.TextInverseAccentGradientMinor.Layer1.positions,
                LightGradientTokens.TextInverseAccentGradientMinor.Layer1.angle,
            ),
            singleColor(LightGradientTokens.TextInverseAccentGradientMinor.Layer2.background),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientMinorHover",
        listOf(singleColor(LightGradientTokens.TextInverseAccentGradientMinorHover.background)),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientMinor",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradientMinor.Layer0.colors,
                LightGradientTokens.TextOnDarkAccentGradientMinor.Layer0.positions,
                LightGradientTokens.TextOnDarkAccentGradientMinor.Layer0.angle,
            ),
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradientMinor.Layer1.colors,
                LightGradientTokens.TextOnDarkAccentGradientMinor.Layer1.positions,
                LightGradientTokens.TextOnDarkAccentGradientMinor.Layer1.angle,
            ),
            singleColor(LightGradientTokens.TextOnDarkAccentGradientMinor.Layer2.background),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientMinorActive",
        listOf(singleColor(LightGradientTokens.TextOnDarkAccentGradientMinorActive.background)),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientMinorHover",
        listOf(singleColor(LightGradientTokens.TextOnDarkAccentGradientMinorHover.background)),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientMinor",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradientMinor.Layer0.colors,
                LightGradientTokens.TextOnLightAccentGradientMinor.Layer0.positions,
                LightGradientTokens.TextOnLightAccentGradientMinor.Layer0.angle,
            ),
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradientMinor.Layer1.colors,
                LightGradientTokens.TextOnLightAccentGradientMinor.Layer1.positions,
                LightGradientTokens.TextOnLightAccentGradientMinor.Layer1.angle,
            ),
            singleColor(LightGradientTokens.TextOnLightAccentGradientMinor.Layer2.background),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientMinorActive",
        listOf(singleColor(LightGradientTokens.TextOnLightAccentGradientMinorActive.background)),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientMinorHover",
        listOf(singleColor(LightGradientTokens.TextOnLightAccentGradientMinorHover.background)),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradient.colors,
                LightGradientTokens.TextOnDarkAccentGradient.positions,
                LightGradientTokens.TextOnDarkAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientActive",
        listOf(singleColor(LightGradientTokens.TextInverseAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradient.colors,
                LightGradientTokens.TextInverseAccentGradient.positions,
                LightGradientTokens.TextInverseAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientHover",
        listOf(singleColor(LightGradientTokens.TextOnLightAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientActive",
        listOf(singleColor(LightGradientTokens.TextOnLightAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradient.colors,
                LightGradientTokens.TextOnLightAccentGradient.positions,
                LightGradientTokens.TextOnLightAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradient.colors,
                LightGradientTokens.TextDefaultAccentGradient.positions,
                LightGradientTokens.TextDefaultAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientActive",
        listOf(singleColor(LightGradientTokens.TextDefaultAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientHover",
        listOf(singleColor(LightGradientTokens.TextDefaultAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientHover",
        listOf(singleColor(LightGradientTokens.TextOnDarkAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientActive",
        listOf(singleColor(LightGradientTokens.TextOnDarkAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientHover",
        listOf(singleColor(LightGradientTokens.TextInverseAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataInverseWarningGradientActive",
        listOf(singleColor(LightGradientTokens.DataInverseWarningGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataInverseWarningGradientHover",
        listOf(singleColor(LightGradientTokens.DataInverseWarningGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightWarningGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataOnLightWarningGradient.colors,
                LightGradientTokens.DataOnLightWarningGradient.positions,
                LightGradientTokens.DataOnLightWarningGradient.radius,
                LightGradientTokens.DataOnLightWarningGradient.centerX,
                LightGradientTokens.DataOnLightWarningGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnDarkWarningGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataOnDarkWarningGradient.colors,
                LightGradientTokens.DataOnDarkWarningGradient.positions,
                LightGradientTokens.DataOnDarkWarningGradient.radius,
                LightGradientTokens.DataOnDarkWarningGradient.centerX,
                LightGradientTokens.DataOnDarkWarningGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnDarkWarningGradientHover",
        listOf(singleColor(LightGradientTokens.DataOnDarkWarningGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultWarningGradientHover",
        listOf(singleColor(LightGradientTokens.DataDefaultWarningGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultWarningGradientActive",
        listOf(singleColor(LightGradientTokens.DataDefaultWarningGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultWarningGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataDefaultWarningGradient.colors,
                LightGradientTokens.DataDefaultWarningGradient.positions,
                LightGradientTokens.DataDefaultWarningGradient.radius,
                LightGradientTokens.DataDefaultWarningGradient.centerX,
                LightGradientTokens.DataDefaultWarningGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnLightWarningGradientHover",
        listOf(singleColor(LightGradientTokens.DataOnLightWarningGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataInverseWarningGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataInverseWarningGradient.colors,
                LightGradientTokens.DataInverseWarningGradient.positions,
                LightGradientTokens.DataInverseWarningGradient.radius,
                LightGradientTokens.DataInverseWarningGradient.centerX,
                LightGradientTokens.DataInverseWarningGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataInversePositiveGradientHover",
        listOf(singleColor(LightGradientTokens.DataInversePositiveGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultPositiveGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataDefaultPositiveGradient.colors,
                LightGradientTokens.DataDefaultPositiveGradient.positions,
                LightGradientTokens.DataDefaultPositiveGradient.radius,
                LightGradientTokens.DataDefaultPositiveGradient.centerX,
                LightGradientTokens.DataDefaultPositiveGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataDefaultPositiveGradientActive",
        listOf(singleColor(LightGradientTokens.DataDefaultPositiveGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultPositiveGradientHover",
        listOf(singleColor(LightGradientTokens.DataDefaultPositiveGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataInversePositiveGradientActive",
        listOf(singleColor(LightGradientTokens.DataInversePositiveGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkPositiveGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataOnDarkPositiveGradient.colors,
                LightGradientTokens.DataOnDarkPositiveGradient.positions,
                LightGradientTokens.DataOnDarkPositiveGradient.radius,
                LightGradientTokens.DataOnDarkPositiveGradient.centerX,
                LightGradientTokens.DataOnDarkPositiveGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnDarkPositiveGradientActive",
        listOf(singleColor(LightGradientTokens.DataOnDarkPositiveGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkPositiveGradientHover",
        listOf(singleColor(LightGradientTokens.DataOnDarkPositiveGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightPositiveGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataOnLightPositiveGradient.colors,
                LightGradientTokens.DataOnLightPositiveGradient.positions,
                LightGradientTokens.DataOnLightPositiveGradient.radius,
                LightGradientTokens.DataOnLightPositiveGradient.centerX,
                LightGradientTokens.DataOnLightPositiveGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnLightPositiveGradientActive",
        listOf(singleColor(LightGradientTokens.DataOnLightPositiveGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightPositiveGradientHover",
        listOf(singleColor(LightGradientTokens.DataOnLightPositiveGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkNegativeGradientHover",
        listOf(singleColor(LightGradientTokens.DataOnDarkNegativeGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkNegativeGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataOnDarkNegativeGradient.colors,
                LightGradientTokens.DataOnDarkNegativeGradient.positions,
                LightGradientTokens.DataOnDarkNegativeGradient.radius,
                LightGradientTokens.DataOnDarkNegativeGradient.centerX,
                LightGradientTokens.DataOnDarkNegativeGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataDefaultNegativeGradientActive",
        listOf(singleColor(LightGradientTokens.DataDefaultNegativeGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataInverseNegativeGradientHover",
        listOf(singleColor(LightGradientTokens.DataInverseNegativeGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataInverseNegativeGradientActive",
        listOf(singleColor(LightGradientTokens.DataInverseNegativeGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightNegativeGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataOnLightNegativeGradient.colors,
                LightGradientTokens.DataOnLightNegativeGradient.positions,
                LightGradientTokens.DataOnLightNegativeGradient.radius,
                LightGradientTokens.DataOnLightNegativeGradient.centerX,
                LightGradientTokens.DataOnLightNegativeGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnLightNegativeGradientActive",
        listOf(singleColor(LightGradientTokens.DataOnLightNegativeGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightNegativeGradientHover",
        listOf(singleColor(LightGradientTokens.DataOnLightNegativeGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultNegativeGradientHover",
        listOf(singleColor(LightGradientTokens.DataDefaultNegativeGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataInverseNegativeGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataInverseNegativeGradient.colors,
                LightGradientTokens.DataInverseNegativeGradient.positions,
                LightGradientTokens.DataInverseNegativeGradient.radius,
                LightGradientTokens.DataInverseNegativeGradient.centerX,
                LightGradientTokens.DataInverseNegativeGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataDefaultNegativeGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataDefaultNegativeGradient.colors,
                LightGradientTokens.DataDefaultNegativeGradient.positions,
                LightGradientTokens.DataDefaultNegativeGradient.radius,
                LightGradientTokens.DataDefaultNegativeGradient.centerX,
                LightGradientTokens.DataDefaultNegativeGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnDarkNegativeGradientActive",
        listOf(singleColor(LightGradientTokens.DataOnDarkNegativeGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataInverseInfoGradientActive",
        listOf(singleColor(LightGradientTokens.DataInverseInfoGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataInverseInfoGradientHover",
        listOf(singleColor(LightGradientTokens.DataInverseInfoGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkInfoGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataOnDarkInfoGradient.colors,
                LightGradientTokens.DataOnDarkInfoGradient.positions,
                LightGradientTokens.DataOnDarkInfoGradient.radius,
                LightGradientTokens.DataOnDarkInfoGradient.centerX,
                LightGradientTokens.DataOnDarkInfoGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnDarkInfoGradientActive",
        listOf(singleColor(LightGradientTokens.DataOnDarkInfoGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultInfoGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataDefaultInfoGradient.colors,
                LightGradientTokens.DataDefaultInfoGradient.positions,
                LightGradientTokens.DataDefaultInfoGradient.radius,
                LightGradientTokens.DataDefaultInfoGradient.centerX,
                LightGradientTokens.DataDefaultInfoGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataDefaultInfoGradientActive",
        listOf(singleColor(LightGradientTokens.DataDefaultInfoGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultInfoGradientHover",
        listOf(singleColor(LightGradientTokens.DataDefaultInfoGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkInfoGradientHover",
        listOf(singleColor(LightGradientTokens.DataOnDarkInfoGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightInfoGradientHover",
        listOf(singleColor(LightGradientTokens.DataOnLightInfoGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightInfoGradientActive",
        listOf(singleColor(LightGradientTokens.DataOnLightInfoGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightInfoGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataOnLightInfoGradient.colors,
                LightGradientTokens.DataOnLightInfoGradient.positions,
                LightGradientTokens.DataOnLightInfoGradient.radius,
                LightGradientTokens.DataOnLightInfoGradient.centerX,
                LightGradientTokens.DataOnLightInfoGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataInverseInfoGradient",
        listOf(
            radialGradient(
                LightGradientTokens.DataInverseInfoGradient.colors,
                LightGradientTokens.DataInverseInfoGradient.positions,
                LightGradientTokens.DataInverseInfoGradient.radius,
                LightGradientTokens.DataInverseInfoGradient.centerX,
                LightGradientTokens.DataInverseInfoGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradientHover",
        listOf(singleColor(LightGradientTokens.OutlineOnDarkAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultAccentGradient.colors,
                LightGradientTokens.OutlineDefaultAccentGradient.positions,
                LightGradientTokens.OutlineDefaultAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightAccentGradient.colors,
                LightGradientTokens.OutlineOnLightAccentGradient.positions,
                LightGradientTokens.OutlineOnLightAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientActive",
        listOf(singleColor(LightGradientTokens.OutlineDefaultAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientHover",
        listOf(singleColor(LightGradientTokens.OutlineDefaultAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseAccentGradient.colors,
                LightGradientTokens.OutlineInverseAccentGradient.positions,
                LightGradientTokens.OutlineInverseAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradientActive",
        listOf(singleColor(LightGradientTokens.OutlineInverseAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradientHover",
        listOf(singleColor(LightGradientTokens.OutlineInverseAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkAccentGradient.colors,
                LightGradientTokens.OutlineOnDarkAccentGradient.positions,
                LightGradientTokens.OutlineOnDarkAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradientActive",
        listOf(singleColor(LightGradientTokens.OutlineOnLightAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradientHover",
        listOf(singleColor(LightGradientTokens.OutlineOnLightAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradientActive",
        listOf(singleColor(LightGradientTokens.OutlineOnDarkAccentGradientActive.background)),
        overwrite,
    )
    return SddsFinAiGradients(initial)
}

/**
 * Градиенты [SddsFinAiGradients] для светлой темы в тенанте BetaCore
 */
@Suppress("LongMethod")
public fun lightSddsFinAiGradientsBetaCore(
    overrideGradients: GradientOverrideScope.() -> Unit =
        {},
): SddsFinAiGradients = lightSddsFinAiGradients {
    dataOnDarkWarningGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnDarkWarningGradientActive.background))
    dataInversePositiveGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataInversePositiveGradient.colors,
            LightGradientTokensBetaCore.DataInversePositiveGradient.positions,
            LightGradientTokensBetaCore.DataInversePositiveGradient.radius,
            LightGradientTokensBetaCore.DataInversePositiveGradient.centerX,
            LightGradientTokensBetaCore.DataInversePositiveGradient.centerY,
        ),
    )
    surfaceOnLightAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.SurfaceOnLightAccentGradient.colors,
            LightGradientTokensBetaCore.SurfaceOnLightAccentGradient.positions,
            LightGradientTokensBetaCore.SurfaceOnLightAccentGradient.angle,
        ),
    )
    textInverseAccentGradientMinorActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextInverseAccentGradientMinorActive.background))
    dataOnLightWarningGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnLightWarningGradientActive.background))
    surfaceDefaultAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.SurfaceDefaultAccentGradient.colors,
            LightGradientTokensBetaCore.SurfaceDefaultAccentGradient.positions,
            LightGradientTokensBetaCore.SurfaceDefaultAccentGradient.angle,
        ),
    )
    surfaceInverseAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.SurfaceInverseAccentGradient.colors,
            LightGradientTokensBetaCore.SurfaceInverseAccentGradient.positions,
            LightGradientTokensBetaCore.SurfaceInverseAccentGradient.angle,
        ),
    )
    surfaceOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.SurfaceOnDarkAccentGradient.colors,
            LightGradientTokensBetaCore.SurfaceOnDarkAccentGradient.positions,
            LightGradientTokensBetaCore.SurfaceOnDarkAccentGradient.angle,
        ),
    )
    textDefaultAccentGradientMinorActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextDefaultAccentGradientMinorActive.background))
    textDefaultAccentGradientMinor overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.TextDefaultAccentGradientMinor.colors,
            LightGradientTokensBetaCore.TextDefaultAccentGradientMinor.positions,
            LightGradientTokensBetaCore.TextDefaultAccentGradientMinor.angle,
        ),
    )
    textDefaultAccentGradientMinorHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextDefaultAccentGradientMinorHover.background))
    textInverseAccentGradientMinor overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.TextInverseAccentGradientMinor.colors,
            LightGradientTokensBetaCore.TextInverseAccentGradientMinor.positions,
            LightGradientTokensBetaCore.TextInverseAccentGradientMinor.angle,
        ),
    )
    textInverseAccentGradientMinorHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextInverseAccentGradientMinorHover.background))
    textOnDarkAccentGradientMinor overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.TextOnDarkAccentGradientMinor.colors,
            LightGradientTokensBetaCore.TextOnDarkAccentGradientMinor.positions,
            LightGradientTokensBetaCore.TextOnDarkAccentGradientMinor.angle,
        ),
    )
    textOnDarkAccentGradientMinorActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextOnDarkAccentGradientMinorActive.background))
    textOnDarkAccentGradientMinorHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextOnDarkAccentGradientMinorHover.background))
    textOnLightAccentGradientMinor overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.TextOnLightAccentGradientMinor.colors,
            LightGradientTokensBetaCore.TextOnLightAccentGradientMinor.positions,
            LightGradientTokensBetaCore.TextOnLightAccentGradientMinor.angle,
        ),
    )
    textOnLightAccentGradientMinorActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextOnLightAccentGradientMinorActive.background))
    textOnLightAccentGradientMinorHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextOnLightAccentGradientMinorHover.background))
    textOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.TextOnDarkAccentGradient.colors,
            LightGradientTokensBetaCore.TextOnDarkAccentGradient.positions,
            LightGradientTokensBetaCore.TextOnDarkAccentGradient.angle,
        ),
    )
    textInverseAccentGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextInverseAccentGradientActive.background))
    textInverseAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.TextInverseAccentGradient.colors,
            LightGradientTokensBetaCore.TextInverseAccentGradient.positions,
            LightGradientTokensBetaCore.TextInverseAccentGradient.angle,
        ),
    )
    textOnLightAccentGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextOnLightAccentGradientHover.background))
    textOnLightAccentGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextOnLightAccentGradientActive.background))
    textOnLightAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.TextOnLightAccentGradient.colors,
            LightGradientTokensBetaCore.TextOnLightAccentGradient.positions,
            LightGradientTokensBetaCore.TextOnLightAccentGradient.angle,
        ),
    )
    textDefaultAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.TextDefaultAccentGradient.colors,
            LightGradientTokensBetaCore.TextDefaultAccentGradient.positions,
            LightGradientTokensBetaCore.TextDefaultAccentGradient.angle,
        ),
    )
    textDefaultAccentGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextDefaultAccentGradientActive.background))
    textDefaultAccentGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextDefaultAccentGradientHover.background))
    textOnDarkAccentGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextOnDarkAccentGradientHover.background))
    textOnDarkAccentGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextOnDarkAccentGradientActive.background))
    textInverseAccentGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.TextInverseAccentGradientHover.background))
    dataInverseWarningGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataInverseWarningGradientActive.background))
    dataInverseWarningGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataInverseWarningGradientHover.background))
    dataOnLightWarningGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataOnLightWarningGradient.colors,
            LightGradientTokensBetaCore.DataOnLightWarningGradient.positions,
            LightGradientTokensBetaCore.DataOnLightWarningGradient.radius,
            LightGradientTokensBetaCore.DataOnLightWarningGradient.centerX,
            LightGradientTokensBetaCore.DataOnLightWarningGradient.centerY,
        ),
    )
    dataOnDarkWarningGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataOnDarkWarningGradient.colors,
            LightGradientTokensBetaCore.DataOnDarkWarningGradient.positions,
            LightGradientTokensBetaCore.DataOnDarkWarningGradient.radius,
            LightGradientTokensBetaCore.DataOnDarkWarningGradient.centerX,
            LightGradientTokensBetaCore.DataOnDarkWarningGradient.centerY,
        ),
    )
    dataOnDarkWarningGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnDarkWarningGradientHover.background))
    dataDefaultWarningGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataDefaultWarningGradientHover.background))
    dataDefaultWarningGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataDefaultWarningGradientActive.background))
    dataDefaultWarningGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataDefaultWarningGradient.colors,
            LightGradientTokensBetaCore.DataDefaultWarningGradient.positions,
            LightGradientTokensBetaCore.DataDefaultWarningGradient.radius,
            LightGradientTokensBetaCore.DataDefaultWarningGradient.centerX,
            LightGradientTokensBetaCore.DataDefaultWarningGradient.centerY,
        ),
    )
    dataOnLightWarningGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnLightWarningGradientHover.background))
    dataInverseWarningGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataInverseWarningGradient.colors,
            LightGradientTokensBetaCore.DataInverseWarningGradient.positions,
            LightGradientTokensBetaCore.DataInverseWarningGradient.radius,
            LightGradientTokensBetaCore.DataInverseWarningGradient.centerX,
            LightGradientTokensBetaCore.DataInverseWarningGradient.centerY,
        ),
    )
    dataInversePositiveGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataInversePositiveGradientHover.background))
    dataDefaultPositiveGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataDefaultPositiveGradient.colors,
            LightGradientTokensBetaCore.DataDefaultPositiveGradient.positions,
            LightGradientTokensBetaCore.DataDefaultPositiveGradient.radius,
            LightGradientTokensBetaCore.DataDefaultPositiveGradient.centerX,
            LightGradientTokensBetaCore.DataDefaultPositiveGradient.centerY,
        ),
    )
    dataDefaultPositiveGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataDefaultPositiveGradientActive.background))
    dataDefaultPositiveGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataDefaultPositiveGradientHover.background))
    dataInversePositiveGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataInversePositiveGradientActive.background))
    dataOnDarkPositiveGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataOnDarkPositiveGradient.colors,
            LightGradientTokensBetaCore.DataOnDarkPositiveGradient.positions,
            LightGradientTokensBetaCore.DataOnDarkPositiveGradient.radius,
            LightGradientTokensBetaCore.DataOnDarkPositiveGradient.centerX,
            LightGradientTokensBetaCore.DataOnDarkPositiveGradient.centerY,
        ),
    )
    dataOnDarkPositiveGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnDarkPositiveGradientActive.background))
    dataOnDarkPositiveGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnDarkPositiveGradientHover.background))
    dataOnLightPositiveGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataOnLightPositiveGradient.colors,
            LightGradientTokensBetaCore.DataOnLightPositiveGradient.positions,
            LightGradientTokensBetaCore.DataOnLightPositiveGradient.radius,
            LightGradientTokensBetaCore.DataOnLightPositiveGradient.centerX,
            LightGradientTokensBetaCore.DataOnLightPositiveGradient.centerY,
        ),
    )
    dataOnLightPositiveGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnLightPositiveGradientActive.background))
    dataOnLightPositiveGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnLightPositiveGradientHover.background))
    dataOnDarkNegativeGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnDarkNegativeGradientHover.background))
    dataOnDarkNegativeGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataOnDarkNegativeGradient.colors,
            LightGradientTokensBetaCore.DataOnDarkNegativeGradient.positions,
            LightGradientTokensBetaCore.DataOnDarkNegativeGradient.radius,
            LightGradientTokensBetaCore.DataOnDarkNegativeGradient.centerX,
            LightGradientTokensBetaCore.DataOnDarkNegativeGradient.centerY,
        ),
    )
    dataDefaultNegativeGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataDefaultNegativeGradientActive.background))
    dataInverseNegativeGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataInverseNegativeGradientHover.background))
    dataInverseNegativeGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataInverseNegativeGradientActive.background))
    dataOnLightNegativeGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataOnLightNegativeGradient.colors,
            LightGradientTokensBetaCore.DataOnLightNegativeGradient.positions,
            LightGradientTokensBetaCore.DataOnLightNegativeGradient.radius,
            LightGradientTokensBetaCore.DataOnLightNegativeGradient.centerX,
            LightGradientTokensBetaCore.DataOnLightNegativeGradient.centerY,
        ),
    )
    dataOnLightNegativeGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnLightNegativeGradientActive.background))
    dataOnLightNegativeGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnLightNegativeGradientHover.background))
    dataDefaultNegativeGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataDefaultNegativeGradientHover.background))
    dataInverseNegativeGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataInverseNegativeGradient.colors,
            LightGradientTokensBetaCore.DataInverseNegativeGradient.positions,
            LightGradientTokensBetaCore.DataInverseNegativeGradient.radius,
            LightGradientTokensBetaCore.DataInverseNegativeGradient.centerX,
            LightGradientTokensBetaCore.DataInverseNegativeGradient.centerY,
        ),
    )
    dataDefaultNegativeGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataDefaultNegativeGradient.colors,
            LightGradientTokensBetaCore.DataDefaultNegativeGradient.positions,
            LightGradientTokensBetaCore.DataDefaultNegativeGradient.radius,
            LightGradientTokensBetaCore.DataDefaultNegativeGradient.centerX,
            LightGradientTokensBetaCore.DataDefaultNegativeGradient.centerY,
        ),
    )
    dataOnDarkNegativeGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnDarkNegativeGradientActive.background))
    dataInverseInfoGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataInverseInfoGradientActive.background))
    dataInverseInfoGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataInverseInfoGradientHover.background))
    dataOnDarkInfoGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataOnDarkInfoGradient.colors,
            LightGradientTokensBetaCore.DataOnDarkInfoGradient.positions,
            LightGradientTokensBetaCore.DataOnDarkInfoGradient.radius,
            LightGradientTokensBetaCore.DataOnDarkInfoGradient.centerX,
            LightGradientTokensBetaCore.DataOnDarkInfoGradient.centerY,
        ),
    )
    dataOnDarkInfoGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnDarkInfoGradientActive.background))
    dataDefaultInfoGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataDefaultInfoGradient.colors,
            LightGradientTokensBetaCore.DataDefaultInfoGradient.positions,
            LightGradientTokensBetaCore.DataDefaultInfoGradient.radius,
            LightGradientTokensBetaCore.DataDefaultInfoGradient.centerX,
            LightGradientTokensBetaCore.DataDefaultInfoGradient.centerY,
        ),
    )
    dataDefaultInfoGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataDefaultInfoGradientActive.background))
    dataDefaultInfoGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataDefaultInfoGradientHover.background))
    dataOnDarkInfoGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnDarkInfoGradientHover.background))
    dataOnLightInfoGradientHover overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnLightInfoGradientHover.background))
    dataOnLightInfoGradientActive overrideBy
        listOf(singleColor(LightGradientTokensBetaCore.DataOnLightInfoGradientActive.background))
    dataOnLightInfoGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataOnLightInfoGradient.colors,
            LightGradientTokensBetaCore.DataOnLightInfoGradient.positions,
            LightGradientTokensBetaCore.DataOnLightInfoGradient.radius,
            LightGradientTokensBetaCore.DataOnLightInfoGradient.centerX,
            LightGradientTokensBetaCore.DataOnLightInfoGradient.centerY,
        ),
    )
    dataInverseInfoGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensBetaCore.DataInverseInfoGradient.colors,
            LightGradientTokensBetaCore.DataInverseInfoGradient.positions,
            LightGradientTokensBetaCore.DataInverseInfoGradient.radius,
            LightGradientTokensBetaCore.DataInverseInfoGradient.centerX,
            LightGradientTokensBetaCore.DataInverseInfoGradient.centerY,
        ),
    )
    outlineDefaultAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.OutlineDefaultAccentGradient.colors,
            LightGradientTokensBetaCore.OutlineDefaultAccentGradient.positions,
            LightGradientTokensBetaCore.OutlineDefaultAccentGradient.angle,
        ),
    )
    outlineOnLightAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.OutlineOnLightAccentGradient.colors,
            LightGradientTokensBetaCore.OutlineOnLightAccentGradient.positions,
            LightGradientTokensBetaCore.OutlineOnLightAccentGradient.angle,
        ),
    )
    outlineInverseAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.OutlineInverseAccentGradient.colors,
            LightGradientTokensBetaCore.OutlineInverseAccentGradient.positions,
            LightGradientTokensBetaCore.OutlineInverseAccentGradient.angle,
        ),
    )
    outlineOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensBetaCore.OutlineOnDarkAccentGradient.colors,
            LightGradientTokensBetaCore.OutlineOnDarkAccentGradient.positions,
            LightGradientTokensBetaCore.OutlineOnDarkAccentGradient.angle,
        ),
    )
    overrideGradients()
}

/**
 * Градиенты [SddsFinAiGradients] для светлой темы в тенанте HighContrast
 */
@Suppress("LongMethod")
public fun lightSddsFinAiGradientsHighContrast(
    overrideGradients: GradientOverrideScope.() -> Unit =
        {},
): SddsFinAiGradients = lightSddsFinAiGradients {
    dataOnDarkWarningGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnDarkWarningGradientActive.background))
    dataInversePositiveGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataInversePositiveGradient.colors,
            LightGradientTokensHighContrast.DataInversePositiveGradient.positions,
            LightGradientTokensHighContrast.DataInversePositiveGradient.radius,
            LightGradientTokensHighContrast.DataInversePositiveGradient.centerX,
            LightGradientTokensHighContrast.DataInversePositiveGradient.centerY,
        ),
    )
    surfaceOnLightAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.SurfaceOnLightAccentGradient.colors,
            LightGradientTokensHighContrast.SurfaceOnLightAccentGradient.positions,
            LightGradientTokensHighContrast.SurfaceOnLightAccentGradient.angle,
        ),
    )
    textInverseAccentGradientMinorActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextInverseAccentGradientMinorActive.background))
    dataOnLightWarningGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnLightWarningGradientActive.background))
    surfaceDefaultAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.SurfaceDefaultAccentGradient.colors,
            LightGradientTokensHighContrast.SurfaceDefaultAccentGradient.positions,
            LightGradientTokensHighContrast.SurfaceDefaultAccentGradient.angle,
        ),
    )
    surfaceInverseAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.SurfaceInverseAccentGradient.colors,
            LightGradientTokensHighContrast.SurfaceInverseAccentGradient.positions,
            LightGradientTokensHighContrast.SurfaceInverseAccentGradient.angle,
        ),
    )
    surfaceOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.SurfaceOnDarkAccentGradient.colors,
            LightGradientTokensHighContrast.SurfaceOnDarkAccentGradient.positions,
            LightGradientTokensHighContrast.SurfaceOnDarkAccentGradient.angle,
        ),
    )
    textDefaultAccentGradientMinorActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextDefaultAccentGradientMinorActive.background))
    textDefaultAccentGradientMinor overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.TextDefaultAccentGradientMinor.colors,
            LightGradientTokensHighContrast.TextDefaultAccentGradientMinor.positions,
            LightGradientTokensHighContrast.TextDefaultAccentGradientMinor.angle,
        ),
    )
    textDefaultAccentGradientMinorHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextDefaultAccentGradientMinorHover.background))
    textInverseAccentGradientMinor overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.TextInverseAccentGradientMinor.colors,
            LightGradientTokensHighContrast.TextInverseAccentGradientMinor.positions,
            LightGradientTokensHighContrast.TextInverseAccentGradientMinor.angle,
        ),
    )
    textInverseAccentGradientMinorHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextInverseAccentGradientMinorHover.background))
    textOnDarkAccentGradientMinor overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.TextOnDarkAccentGradientMinor.colors,
            LightGradientTokensHighContrast.TextOnDarkAccentGradientMinor.positions,
            LightGradientTokensHighContrast.TextOnDarkAccentGradientMinor.angle,
        ),
    )
    textOnDarkAccentGradientMinorActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextOnDarkAccentGradientMinorActive.background))
    textOnDarkAccentGradientMinorHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextOnDarkAccentGradientMinorHover.background))
    textOnLightAccentGradientMinor overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.TextOnLightAccentGradientMinor.colors,
            LightGradientTokensHighContrast.TextOnLightAccentGradientMinor.positions,
            LightGradientTokensHighContrast.TextOnLightAccentGradientMinor.angle,
        ),
    )
    textOnLightAccentGradientMinorActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextOnLightAccentGradientMinorActive.background))
    textOnLightAccentGradientMinorHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextOnLightAccentGradientMinorHover.background))
    textOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.TextOnDarkAccentGradient.colors,
            LightGradientTokensHighContrast.TextOnDarkAccentGradient.positions,
            LightGradientTokensHighContrast.TextOnDarkAccentGradient.angle,
        ),
    )
    textInverseAccentGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextInverseAccentGradientActive.background))
    textInverseAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.TextInverseAccentGradient.colors,
            LightGradientTokensHighContrast.TextInverseAccentGradient.positions,
            LightGradientTokensHighContrast.TextInverseAccentGradient.angle,
        ),
    )
    textOnLightAccentGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextOnLightAccentGradientHover.background))
    textOnLightAccentGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextOnLightAccentGradientActive.background))
    textOnLightAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.TextOnLightAccentGradient.colors,
            LightGradientTokensHighContrast.TextOnLightAccentGradient.positions,
            LightGradientTokensHighContrast.TextOnLightAccentGradient.angle,
        ),
    )
    textDefaultAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.TextDefaultAccentGradient.colors,
            LightGradientTokensHighContrast.TextDefaultAccentGradient.positions,
            LightGradientTokensHighContrast.TextDefaultAccentGradient.angle,
        ),
    )
    textDefaultAccentGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextDefaultAccentGradientActive.background))
    textDefaultAccentGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextDefaultAccentGradientHover.background))
    textOnDarkAccentGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextOnDarkAccentGradientHover.background))
    textOnDarkAccentGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextOnDarkAccentGradientActive.background))
    textInverseAccentGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.TextInverseAccentGradientHover.background))
    dataInverseWarningGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataInverseWarningGradientActive.background))
    dataInverseWarningGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataInverseWarningGradientHover.background))
    dataOnLightWarningGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataOnLightWarningGradient.colors,
            LightGradientTokensHighContrast.DataOnLightWarningGradient.positions,
            LightGradientTokensHighContrast.DataOnLightWarningGradient.radius,
            LightGradientTokensHighContrast.DataOnLightWarningGradient.centerX,
            LightGradientTokensHighContrast.DataOnLightWarningGradient.centerY,
        ),
    )
    dataOnDarkWarningGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataOnDarkWarningGradient.colors,
            LightGradientTokensHighContrast.DataOnDarkWarningGradient.positions,
            LightGradientTokensHighContrast.DataOnDarkWarningGradient.radius,
            LightGradientTokensHighContrast.DataOnDarkWarningGradient.centerX,
            LightGradientTokensHighContrast.DataOnDarkWarningGradient.centerY,
        ),
    )
    dataOnDarkWarningGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnDarkWarningGradientHover.background))
    dataDefaultWarningGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataDefaultWarningGradientHover.background))
    dataDefaultWarningGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataDefaultWarningGradientActive.background))
    dataDefaultWarningGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataDefaultWarningGradient.colors,
            LightGradientTokensHighContrast.DataDefaultWarningGradient.positions,
            LightGradientTokensHighContrast.DataDefaultWarningGradient.radius,
            LightGradientTokensHighContrast.DataDefaultWarningGradient.centerX,
            LightGradientTokensHighContrast.DataDefaultWarningGradient.centerY,
        ),
    )
    dataOnLightWarningGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnLightWarningGradientHover.background))
    dataInverseWarningGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataInverseWarningGradient.colors,
            LightGradientTokensHighContrast.DataInverseWarningGradient.positions,
            LightGradientTokensHighContrast.DataInverseWarningGradient.radius,
            LightGradientTokensHighContrast.DataInverseWarningGradient.centerX,
            LightGradientTokensHighContrast.DataInverseWarningGradient.centerY,
        ),
    )
    dataInversePositiveGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataInversePositiveGradientHover.background))
    dataDefaultPositiveGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataDefaultPositiveGradient.colors,
            LightGradientTokensHighContrast.DataDefaultPositiveGradient.positions,
            LightGradientTokensHighContrast.DataDefaultPositiveGradient.radius,
            LightGradientTokensHighContrast.DataDefaultPositiveGradient.centerX,
            LightGradientTokensHighContrast.DataDefaultPositiveGradient.centerY,
        ),
    )
    dataDefaultPositiveGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataDefaultPositiveGradientActive.background))
    dataDefaultPositiveGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataDefaultPositiveGradientHover.background))
    dataInversePositiveGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataInversePositiveGradientActive.background))
    dataOnDarkPositiveGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataOnDarkPositiveGradient.colors,
            LightGradientTokensHighContrast.DataOnDarkPositiveGradient.positions,
            LightGradientTokensHighContrast.DataOnDarkPositiveGradient.radius,
            LightGradientTokensHighContrast.DataOnDarkPositiveGradient.centerX,
            LightGradientTokensHighContrast.DataOnDarkPositiveGradient.centerY,
        ),
    )
    dataOnDarkPositiveGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnDarkPositiveGradientActive.background))
    dataOnDarkPositiveGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnDarkPositiveGradientHover.background))
    dataOnLightPositiveGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataOnLightPositiveGradient.colors,
            LightGradientTokensHighContrast.DataOnLightPositiveGradient.positions,
            LightGradientTokensHighContrast.DataOnLightPositiveGradient.radius,
            LightGradientTokensHighContrast.DataOnLightPositiveGradient.centerX,
            LightGradientTokensHighContrast.DataOnLightPositiveGradient.centerY,
        ),
    )
    dataOnLightPositiveGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnLightPositiveGradientActive.background))
    dataOnLightPositiveGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnLightPositiveGradientHover.background))
    dataOnDarkNegativeGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnDarkNegativeGradientHover.background))
    dataOnDarkNegativeGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataOnDarkNegativeGradient.colors,
            LightGradientTokensHighContrast.DataOnDarkNegativeGradient.positions,
            LightGradientTokensHighContrast.DataOnDarkNegativeGradient.radius,
            LightGradientTokensHighContrast.DataOnDarkNegativeGradient.centerX,
            LightGradientTokensHighContrast.DataOnDarkNegativeGradient.centerY,
        ),
    )
    dataDefaultNegativeGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataDefaultNegativeGradientActive.background))
    dataInverseNegativeGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataInverseNegativeGradientHover.background))
    dataInverseNegativeGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataInverseNegativeGradientActive.background))
    dataOnLightNegativeGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataOnLightNegativeGradient.colors,
            LightGradientTokensHighContrast.DataOnLightNegativeGradient.positions,
            LightGradientTokensHighContrast.DataOnLightNegativeGradient.radius,
            LightGradientTokensHighContrast.DataOnLightNegativeGradient.centerX,
            LightGradientTokensHighContrast.DataOnLightNegativeGradient.centerY,
        ),
    )
    dataOnLightNegativeGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnLightNegativeGradientActive.background))
    dataOnLightNegativeGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnLightNegativeGradientHover.background))
    dataDefaultNegativeGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataDefaultNegativeGradientHover.background))
    dataInverseNegativeGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataInverseNegativeGradient.colors,
            LightGradientTokensHighContrast.DataInverseNegativeGradient.positions,
            LightGradientTokensHighContrast.DataInverseNegativeGradient.radius,
            LightGradientTokensHighContrast.DataInverseNegativeGradient.centerX,
            LightGradientTokensHighContrast.DataInverseNegativeGradient.centerY,
        ),
    )
    dataDefaultNegativeGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataDefaultNegativeGradient.colors,
            LightGradientTokensHighContrast.DataDefaultNegativeGradient.positions,
            LightGradientTokensHighContrast.DataDefaultNegativeGradient.radius,
            LightGradientTokensHighContrast.DataDefaultNegativeGradient.centerX,
            LightGradientTokensHighContrast.DataDefaultNegativeGradient.centerY,
        ),
    )
    dataOnDarkNegativeGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnDarkNegativeGradientActive.background))
    dataInverseInfoGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataInverseInfoGradientActive.background))
    dataInverseInfoGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataInverseInfoGradientHover.background))
    dataOnDarkInfoGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataOnDarkInfoGradient.colors,
            LightGradientTokensHighContrast.DataOnDarkInfoGradient.positions,
            LightGradientTokensHighContrast.DataOnDarkInfoGradient.radius,
            LightGradientTokensHighContrast.DataOnDarkInfoGradient.centerX,
            LightGradientTokensHighContrast.DataOnDarkInfoGradient.centerY,
        ),
    )
    dataOnDarkInfoGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnDarkInfoGradientActive.background))
    dataDefaultInfoGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataDefaultInfoGradient.colors,
            LightGradientTokensHighContrast.DataDefaultInfoGradient.positions,
            LightGradientTokensHighContrast.DataDefaultInfoGradient.radius,
            LightGradientTokensHighContrast.DataDefaultInfoGradient.centerX,
            LightGradientTokensHighContrast.DataDefaultInfoGradient.centerY,
        ),
    )
    dataDefaultInfoGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataDefaultInfoGradientActive.background))
    dataDefaultInfoGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataDefaultInfoGradientHover.background))
    dataOnDarkInfoGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnDarkInfoGradientHover.background))
    dataOnLightInfoGradientHover overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnLightInfoGradientHover.background))
    dataOnLightInfoGradientActive overrideBy
        listOf(singleColor(LightGradientTokensHighContrast.DataOnLightInfoGradientActive.background))
    dataOnLightInfoGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataOnLightInfoGradient.colors,
            LightGradientTokensHighContrast.DataOnLightInfoGradient.positions,
            LightGradientTokensHighContrast.DataOnLightInfoGradient.radius,
            LightGradientTokensHighContrast.DataOnLightInfoGradient.centerX,
            LightGradientTokensHighContrast.DataOnLightInfoGradient.centerY,
        ),
    )
    dataInverseInfoGradient overrideBy listOf(
        radialGradient(
            LightGradientTokensHighContrast.DataInverseInfoGradient.colors,
            LightGradientTokensHighContrast.DataInverseInfoGradient.positions,
            LightGradientTokensHighContrast.DataInverseInfoGradient.radius,
            LightGradientTokensHighContrast.DataInverseInfoGradient.centerX,
            LightGradientTokensHighContrast.DataInverseInfoGradient.centerY,
        ),
    )
    outlineDefaultAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.OutlineDefaultAccentGradient.colors,
            LightGradientTokensHighContrast.OutlineDefaultAccentGradient.positions,
            LightGradientTokensHighContrast.OutlineDefaultAccentGradient.angle,
        ),
    )
    outlineOnLightAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.OutlineOnLightAccentGradient.colors,
            LightGradientTokensHighContrast.OutlineOnLightAccentGradient.positions,
            LightGradientTokensHighContrast.OutlineOnLightAccentGradient.angle,
        ),
    )
    outlineInverseAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.OutlineInverseAccentGradient.colors,
            LightGradientTokensHighContrast.OutlineInverseAccentGradient.positions,
            LightGradientTokensHighContrast.OutlineInverseAccentGradient.angle,
        ),
    )
    outlineOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            LightGradientTokensHighContrast.OutlineOnDarkAccentGradient.colors,
            LightGradientTokensHighContrast.OutlineOnDarkAccentGradient.positions,
            LightGradientTokensHighContrast.OutlineOnDarkAccentGradient.angle,
        ),
    )
    overrideGradients()
}

/**
 * Градиенты [SddsFinAiGradients] для темной темы
 */
@Suppress("LongMethod")
public fun darkSddsFinAiGradients(overrideGradients: GradientOverrideScope.() -> Unit = {}): SddsFinAiGradients {
    val gradientOverrideScope = GradientOverrideScope()
    overrideGradients.invoke(gradientOverrideScope)
    val overwrite = gradientOverrideScope.overrideMap
    val initial = mutableMapOf<String, List<ShaderBrush>>()
    initial.add(
        "dataOnDarkWarningGradientActive",
        listOf(singleColor(DarkGradientTokens.DataOnDarkWarningGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataInversePositiveGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataInversePositiveGradient.colors,
                DarkGradientTokens.DataInversePositiveGradient.positions,
                DarkGradientTokens.DataInversePositiveGradient.radius,
                DarkGradientTokens.DataInversePositiveGradient.centerX,
                DarkGradientTokens.DataInversePositiveGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightAccentGradient.colors,
                DarkGradientTokens.SurfaceOnLightAccentGradient.positions,
                DarkGradientTokens.SurfaceOnLightAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientMinorActive",
        listOf(singleColor(DarkGradientTokens.TextInverseAccentGradientMinorActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightWarningGradientActive",
        listOf(singleColor(DarkGradientTokens.DataOnLightWarningGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonGradient.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonGradient.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultAccentGradient.colors,
                DarkGradientTokens.SurfaceDefaultAccentGradient.positions,
                DarkGradientTokens.SurfaceDefaultAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceDefaultAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceDefaultAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseAccentGradient.colors,
                DarkGradientTokens.SurfaceInverseAccentGradient.positions,
                DarkGradientTokens.SurfaceInverseAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceInverseAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceInverseAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkAccentGradient.colors,
                DarkGradientTokens.SurfaceOnDarkAccentGradient.positions,
                DarkGradientTokens.SurfaceOnDarkAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceOnDarkAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceOnDarkAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceOnLightAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceOnLightAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceOnDarkSkeletonGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonGradient.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonGradient.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceOnLightSkeletonGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceOnLightSkeletonGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceDefaultSkeletonGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceDefaultSkeletonGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceOnDarkSkeletonGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonGradient.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradient.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceInverseSkeletonGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceInverseSkeletonGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonGradient.colors,
                DarkGradientTokens.SurfaceInverseSkeletonGradient.positions,
                DarkGradientTokens.SurfaceInverseSkeletonGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.colors,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.positions,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceInverseSkeletonDeepGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceInverseSkeletonDeepGradientHover.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradientActive",
        listOf(singleColor(DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.background)),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradientHover",
        listOf(singleColor(DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.background)),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientMinorActive",
        listOf(singleColor(DarkGradientTokens.TextDefaultAccentGradientMinorActive.background)),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientMinor",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradientMinor.Layer0.colors,
                DarkGradientTokens.TextDefaultAccentGradientMinor.Layer0.positions,
                DarkGradientTokens.TextDefaultAccentGradientMinor.Layer0.angle,
            ),
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradientMinor.Layer1.colors,
                DarkGradientTokens.TextDefaultAccentGradientMinor.Layer1.positions,
                DarkGradientTokens.TextDefaultAccentGradientMinor.Layer1.angle,
            ),
            singleColor(DarkGradientTokens.TextDefaultAccentGradientMinor.Layer2.background),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientMinorHover",
        listOf(singleColor(DarkGradientTokens.TextDefaultAccentGradientMinorHover.background)),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientMinor",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradientMinor.Layer0.colors,
                DarkGradientTokens.TextInverseAccentGradientMinor.Layer0.positions,
                DarkGradientTokens.TextInverseAccentGradientMinor.Layer0.angle,
            ),
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradientMinor.Layer1.colors,
                DarkGradientTokens.TextInverseAccentGradientMinor.Layer1.positions,
                DarkGradientTokens.TextInverseAccentGradientMinor.Layer1.angle,
            ),
            singleColor(DarkGradientTokens.TextInverseAccentGradientMinor.Layer2.background),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientMinorHover",
        listOf(singleColor(DarkGradientTokens.TextInverseAccentGradientMinorHover.background)),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientMinor",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradientMinor.Layer0.colors,
                DarkGradientTokens.TextOnDarkAccentGradientMinor.Layer0.positions,
                DarkGradientTokens.TextOnDarkAccentGradientMinor.Layer0.angle,
            ),
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradientMinor.Layer1.colors,
                DarkGradientTokens.TextOnDarkAccentGradientMinor.Layer1.positions,
                DarkGradientTokens.TextOnDarkAccentGradientMinor.Layer1.angle,
            ),
            singleColor(DarkGradientTokens.TextOnDarkAccentGradientMinor.Layer2.background),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientMinorActive",
        listOf(singleColor(DarkGradientTokens.TextOnDarkAccentGradientMinorActive.background)),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientMinorHover",
        listOf(singleColor(DarkGradientTokens.TextOnDarkAccentGradientMinorHover.background)),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientMinor",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradientMinor.Layer0.colors,
                DarkGradientTokens.TextOnLightAccentGradientMinor.Layer0.positions,
                DarkGradientTokens.TextOnLightAccentGradientMinor.Layer0.angle,
            ),
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradientMinor.Layer1.colors,
                DarkGradientTokens.TextOnLightAccentGradientMinor.Layer1.positions,
                DarkGradientTokens.TextOnLightAccentGradientMinor.Layer1.angle,
            ),
            singleColor(DarkGradientTokens.TextOnLightAccentGradientMinor.Layer2.background),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientMinorActive",
        listOf(singleColor(DarkGradientTokens.TextOnLightAccentGradientMinorActive.background)),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientMinorHover",
        listOf(singleColor(DarkGradientTokens.TextOnLightAccentGradientMinorHover.background)),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradient.colors,
                DarkGradientTokens.TextOnDarkAccentGradient.positions,
                DarkGradientTokens.TextOnDarkAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.TextInverseAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradient.colors,
                DarkGradientTokens.TextInverseAccentGradient.positions,
                DarkGradientTokens.TextInverseAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.TextOnLightAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.TextOnLightAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradient.colors,
                DarkGradientTokens.TextOnLightAccentGradient.positions,
                DarkGradientTokens.TextOnLightAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradient.colors,
                DarkGradientTokens.TextDefaultAccentGradient.positions,
                DarkGradientTokens.TextDefaultAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.TextDefaultAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.TextDefaultAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.TextOnDarkAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.TextOnDarkAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.TextInverseAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataInverseWarningGradientActive",
        listOf(singleColor(DarkGradientTokens.DataInverseWarningGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataInverseWarningGradientHover",
        listOf(singleColor(DarkGradientTokens.DataInverseWarningGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightWarningGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataOnLightWarningGradient.colors,
                DarkGradientTokens.DataOnLightWarningGradient.positions,
                DarkGradientTokens.DataOnLightWarningGradient.radius,
                DarkGradientTokens.DataOnLightWarningGradient.centerX,
                DarkGradientTokens.DataOnLightWarningGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnDarkWarningGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataOnDarkWarningGradient.colors,
                DarkGradientTokens.DataOnDarkWarningGradient.positions,
                DarkGradientTokens.DataOnDarkWarningGradient.radius,
                DarkGradientTokens.DataOnDarkWarningGradient.centerX,
                DarkGradientTokens.DataOnDarkWarningGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnDarkWarningGradientHover",
        listOf(singleColor(DarkGradientTokens.DataOnDarkWarningGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultWarningGradientHover",
        listOf(singleColor(DarkGradientTokens.DataDefaultWarningGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultWarningGradientActive",
        listOf(singleColor(DarkGradientTokens.DataDefaultWarningGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultWarningGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataDefaultWarningGradient.colors,
                DarkGradientTokens.DataDefaultWarningGradient.positions,
                DarkGradientTokens.DataDefaultWarningGradient.radius,
                DarkGradientTokens.DataDefaultWarningGradient.centerX,
                DarkGradientTokens.DataDefaultWarningGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnLightWarningGradientHover",
        listOf(singleColor(DarkGradientTokens.DataOnLightWarningGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataInverseWarningGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataInverseWarningGradient.colors,
                DarkGradientTokens.DataInverseWarningGradient.positions,
                DarkGradientTokens.DataInverseWarningGradient.radius,
                DarkGradientTokens.DataInverseWarningGradient.centerX,
                DarkGradientTokens.DataInverseWarningGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataInversePositiveGradientHover",
        listOf(singleColor(DarkGradientTokens.DataInversePositiveGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultPositiveGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataDefaultPositiveGradient.colors,
                DarkGradientTokens.DataDefaultPositiveGradient.positions,
                DarkGradientTokens.DataDefaultPositiveGradient.radius,
                DarkGradientTokens.DataDefaultPositiveGradient.centerX,
                DarkGradientTokens.DataDefaultPositiveGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataDefaultPositiveGradientActive",
        listOf(singleColor(DarkGradientTokens.DataDefaultPositiveGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultPositiveGradientHover",
        listOf(singleColor(DarkGradientTokens.DataDefaultPositiveGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataInversePositiveGradientActive",
        listOf(singleColor(DarkGradientTokens.DataInversePositiveGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkPositiveGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataOnDarkPositiveGradient.colors,
                DarkGradientTokens.DataOnDarkPositiveGradient.positions,
                DarkGradientTokens.DataOnDarkPositiveGradient.radius,
                DarkGradientTokens.DataOnDarkPositiveGradient.centerX,
                DarkGradientTokens.DataOnDarkPositiveGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnDarkPositiveGradientActive",
        listOf(singleColor(DarkGradientTokens.DataOnDarkPositiveGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkPositiveGradientHover",
        listOf(singleColor(DarkGradientTokens.DataOnDarkPositiveGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightPositiveGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataOnLightPositiveGradient.colors,
                DarkGradientTokens.DataOnLightPositiveGradient.positions,
                DarkGradientTokens.DataOnLightPositiveGradient.radius,
                DarkGradientTokens.DataOnLightPositiveGradient.centerX,
                DarkGradientTokens.DataOnLightPositiveGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnLightPositiveGradientActive",
        listOf(singleColor(DarkGradientTokens.DataOnLightPositiveGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightPositiveGradientHover",
        listOf(singleColor(DarkGradientTokens.DataOnLightPositiveGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkNegativeGradientHover",
        listOf(singleColor(DarkGradientTokens.DataOnDarkNegativeGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkNegativeGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataOnDarkNegativeGradient.colors,
                DarkGradientTokens.DataOnDarkNegativeGradient.positions,
                DarkGradientTokens.DataOnDarkNegativeGradient.radius,
                DarkGradientTokens.DataOnDarkNegativeGradient.centerX,
                DarkGradientTokens.DataOnDarkNegativeGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataDefaultNegativeGradientActive",
        listOf(singleColor(DarkGradientTokens.DataDefaultNegativeGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataInverseNegativeGradientHover",
        listOf(singleColor(DarkGradientTokens.DataInverseNegativeGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataInverseNegativeGradientActive",
        listOf(singleColor(DarkGradientTokens.DataInverseNegativeGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightNegativeGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataOnLightNegativeGradient.colors,
                DarkGradientTokens.DataOnLightNegativeGradient.positions,
                DarkGradientTokens.DataOnLightNegativeGradient.radius,
                DarkGradientTokens.DataOnLightNegativeGradient.centerX,
                DarkGradientTokens.DataOnLightNegativeGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnLightNegativeGradientActive",
        listOf(singleColor(DarkGradientTokens.DataOnLightNegativeGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightNegativeGradientHover",
        listOf(singleColor(DarkGradientTokens.DataOnLightNegativeGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultNegativeGradientHover",
        listOf(singleColor(DarkGradientTokens.DataDefaultNegativeGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataInverseNegativeGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataInverseNegativeGradient.colors,
                DarkGradientTokens.DataInverseNegativeGradient.positions,
                DarkGradientTokens.DataInverseNegativeGradient.radius,
                DarkGradientTokens.DataInverseNegativeGradient.centerX,
                DarkGradientTokens.DataInverseNegativeGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataDefaultNegativeGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataDefaultNegativeGradient.colors,
                DarkGradientTokens.DataDefaultNegativeGradient.positions,
                DarkGradientTokens.DataDefaultNegativeGradient.radius,
                DarkGradientTokens.DataDefaultNegativeGradient.centerX,
                DarkGradientTokens.DataDefaultNegativeGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnDarkNegativeGradientActive",
        listOf(singleColor(DarkGradientTokens.DataOnDarkNegativeGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataInverseInfoGradientActive",
        listOf(singleColor(DarkGradientTokens.DataInverseInfoGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataInverseInfoGradientHover",
        listOf(singleColor(DarkGradientTokens.DataInverseInfoGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkInfoGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataOnDarkInfoGradient.colors,
                DarkGradientTokens.DataOnDarkInfoGradient.positions,
                DarkGradientTokens.DataOnDarkInfoGradient.radius,
                DarkGradientTokens.DataOnDarkInfoGradient.centerX,
                DarkGradientTokens.DataOnDarkInfoGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataOnDarkInfoGradientActive",
        listOf(singleColor(DarkGradientTokens.DataOnDarkInfoGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultInfoGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataDefaultInfoGradient.colors,
                DarkGradientTokens.DataDefaultInfoGradient.positions,
                DarkGradientTokens.DataDefaultInfoGradient.radius,
                DarkGradientTokens.DataDefaultInfoGradient.centerX,
                DarkGradientTokens.DataDefaultInfoGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataDefaultInfoGradientActive",
        listOf(singleColor(DarkGradientTokens.DataDefaultInfoGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataDefaultInfoGradientHover",
        listOf(singleColor(DarkGradientTokens.DataDefaultInfoGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnDarkInfoGradientHover",
        listOf(singleColor(DarkGradientTokens.DataOnDarkInfoGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightInfoGradientHover",
        listOf(singleColor(DarkGradientTokens.DataOnLightInfoGradientHover.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightInfoGradientActive",
        listOf(singleColor(DarkGradientTokens.DataOnLightInfoGradientActive.background)),
        overwrite,
    )
    initial.add(
        "dataOnLightInfoGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataOnLightInfoGradient.colors,
                DarkGradientTokens.DataOnLightInfoGradient.positions,
                DarkGradientTokens.DataOnLightInfoGradient.radius,
                DarkGradientTokens.DataOnLightInfoGradient.centerX,
                DarkGradientTokens.DataOnLightInfoGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "dataInverseInfoGradient",
        listOf(
            radialGradient(
                DarkGradientTokens.DataInverseInfoGradient.colors,
                DarkGradientTokens.DataInverseInfoGradient.positions,
                DarkGradientTokens.DataInverseInfoGradient.radius,
                DarkGradientTokens.DataInverseInfoGradient.centerX,
                DarkGradientTokens.DataInverseInfoGradient.centerY,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.OutlineOnDarkAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultAccentGradient.colors,
                DarkGradientTokens.OutlineDefaultAccentGradient.positions,
                DarkGradientTokens.OutlineDefaultAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightAccentGradient.colors,
                DarkGradientTokens.OutlineOnLightAccentGradient.positions,
                DarkGradientTokens.OutlineOnLightAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.OutlineDefaultAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.OutlineDefaultAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseAccentGradient.colors,
                DarkGradientTokens.OutlineInverseAccentGradient.positions,
                DarkGradientTokens.OutlineInverseAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.OutlineInverseAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.OutlineInverseAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkAccentGradient.colors,
                DarkGradientTokens.OutlineOnDarkAccentGradient.positions,
                DarkGradientTokens.OutlineOnDarkAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.OutlineOnLightAccentGradientActive.background)),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradientHover",
        listOf(singleColor(DarkGradientTokens.OutlineOnLightAccentGradientHover.background)),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradientActive",
        listOf(singleColor(DarkGradientTokens.OutlineOnDarkAccentGradientActive.background)),
        overwrite,
    )
    return SddsFinAiGradients(initial)
}

/**
 * Градиенты [SddsFinAiGradients] для темной темы в тенанте BetaCore
 */
@Suppress("LongMethod")
public fun darkSddsFinAiGradientsBetaCore(overrideGradients: GradientOverrideScope.() -> Unit = {}):
    SddsFinAiGradients = darkSddsFinAiGradients {
    dataOnDarkWarningGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnDarkWarningGradientActive.background))
    dataInversePositiveGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataInversePositiveGradient.colors,
            DarkGradientTokensBetaCore.DataInversePositiveGradient.positions,
            DarkGradientTokensBetaCore.DataInversePositiveGradient.radius,
            DarkGradientTokensBetaCore.DataInversePositiveGradient.centerX,
            DarkGradientTokensBetaCore.DataInversePositiveGradient.centerY,
        ),
    )
    surfaceOnLightAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.SurfaceOnLightAccentGradient.colors,
            DarkGradientTokensBetaCore.SurfaceOnLightAccentGradient.positions,
            DarkGradientTokensBetaCore.SurfaceOnLightAccentGradient.angle,
        ),
    )
    textInverseAccentGradientMinorActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextInverseAccentGradientMinorActive.background))
    dataOnLightWarningGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnLightWarningGradientActive.background))
    surfaceDefaultAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.SurfaceDefaultAccentGradient.colors,
            DarkGradientTokensBetaCore.SurfaceDefaultAccentGradient.positions,
            DarkGradientTokensBetaCore.SurfaceDefaultAccentGradient.angle,
        ),
    )
    surfaceInverseAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.SurfaceInverseAccentGradient.colors,
            DarkGradientTokensBetaCore.SurfaceInverseAccentGradient.positions,
            DarkGradientTokensBetaCore.SurfaceInverseAccentGradient.angle,
        ),
    )
    surfaceOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.SurfaceOnDarkAccentGradient.colors,
            DarkGradientTokensBetaCore.SurfaceOnDarkAccentGradient.positions,
            DarkGradientTokensBetaCore.SurfaceOnDarkAccentGradient.angle,
        ),
    )
    textDefaultAccentGradientMinorActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextDefaultAccentGradientMinorActive.background))
    textDefaultAccentGradientMinor overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.TextDefaultAccentGradientMinor.colors,
            DarkGradientTokensBetaCore.TextDefaultAccentGradientMinor.positions,
            DarkGradientTokensBetaCore.TextDefaultAccentGradientMinor.angle,
        ),
    )
    textDefaultAccentGradientMinorHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextDefaultAccentGradientMinorHover.background))
    textInverseAccentGradientMinor overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.TextInverseAccentGradientMinor.colors,
            DarkGradientTokensBetaCore.TextInverseAccentGradientMinor.positions,
            DarkGradientTokensBetaCore.TextInverseAccentGradientMinor.angle,
        ),
    )
    textInverseAccentGradientMinorHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextInverseAccentGradientMinorHover.background))
    textOnDarkAccentGradientMinor overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.TextOnDarkAccentGradientMinor.colors,
            DarkGradientTokensBetaCore.TextOnDarkAccentGradientMinor.positions,
            DarkGradientTokensBetaCore.TextOnDarkAccentGradientMinor.angle,
        ),
    )
    textOnDarkAccentGradientMinorActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextOnDarkAccentGradientMinorActive.background))
    textOnDarkAccentGradientMinorHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextOnDarkAccentGradientMinorHover.background))
    textOnLightAccentGradientMinor overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.TextOnLightAccentGradientMinor.colors,
            DarkGradientTokensBetaCore.TextOnLightAccentGradientMinor.positions,
            DarkGradientTokensBetaCore.TextOnLightAccentGradientMinor.angle,
        ),
    )
    textOnLightAccentGradientMinorActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextOnLightAccentGradientMinorActive.background))
    textOnLightAccentGradientMinorHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextOnLightAccentGradientMinorHover.background))
    textOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.TextOnDarkAccentGradient.colors,
            DarkGradientTokensBetaCore.TextOnDarkAccentGradient.positions,
            DarkGradientTokensBetaCore.TextOnDarkAccentGradient.angle,
        ),
    )
    textInverseAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.TextInverseAccentGradient.colors,
            DarkGradientTokensBetaCore.TextInverseAccentGradient.positions,
            DarkGradientTokensBetaCore.TextInverseAccentGradient.angle,
        ),
    )
    textOnLightAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.TextOnLightAccentGradient.colors,
            DarkGradientTokensBetaCore.TextOnLightAccentGradient.positions,
            DarkGradientTokensBetaCore.TextOnLightAccentGradient.angle,
        ),
    )
    textDefaultAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.TextDefaultAccentGradient.colors,
            DarkGradientTokensBetaCore.TextDefaultAccentGradient.positions,
            DarkGradientTokensBetaCore.TextDefaultAccentGradient.angle,
        ),
    )
    textDefaultAccentGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextDefaultAccentGradientActive.background))
    textDefaultAccentGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextDefaultAccentGradientHover.background))
    textOnDarkAccentGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextOnDarkAccentGradientHover.background))
    textOnDarkAccentGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.TextOnDarkAccentGradientActive.background))
    dataInverseWarningGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataInverseWarningGradientActive.background))
    dataInverseWarningGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataInverseWarningGradientHover.background))
    dataOnLightWarningGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataOnLightWarningGradient.colors,
            DarkGradientTokensBetaCore.DataOnLightWarningGradient.positions,
            DarkGradientTokensBetaCore.DataOnLightWarningGradient.radius,
            DarkGradientTokensBetaCore.DataOnLightWarningGradient.centerX,
            DarkGradientTokensBetaCore.DataOnLightWarningGradient.centerY,
        ),
    )
    dataOnDarkWarningGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataOnDarkWarningGradient.colors,
            DarkGradientTokensBetaCore.DataOnDarkWarningGradient.positions,
            DarkGradientTokensBetaCore.DataOnDarkWarningGradient.radius,
            DarkGradientTokensBetaCore.DataOnDarkWarningGradient.centerX,
            DarkGradientTokensBetaCore.DataOnDarkWarningGradient.centerY,
        ),
    )
    dataOnDarkWarningGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnDarkWarningGradientHover.background))
    dataDefaultWarningGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataDefaultWarningGradientHover.background))
    dataDefaultWarningGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataDefaultWarningGradientActive.background))
    dataDefaultWarningGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataDefaultWarningGradient.colors,
            DarkGradientTokensBetaCore.DataDefaultWarningGradient.positions,
            DarkGradientTokensBetaCore.DataDefaultWarningGradient.radius,
            DarkGradientTokensBetaCore.DataDefaultWarningGradient.centerX,
            DarkGradientTokensBetaCore.DataDefaultWarningGradient.centerY,
        ),
    )
    dataOnLightWarningGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnLightWarningGradientHover.background))
    dataInverseWarningGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataInverseWarningGradient.colors,
            DarkGradientTokensBetaCore.DataInverseWarningGradient.positions,
            DarkGradientTokensBetaCore.DataInverseWarningGradient.radius,
            DarkGradientTokensBetaCore.DataInverseWarningGradient.centerX,
            DarkGradientTokensBetaCore.DataInverseWarningGradient.centerY,
        ),
    )
    dataInversePositiveGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataInversePositiveGradientHover.background))
    dataDefaultPositiveGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataDefaultPositiveGradient.colors,
            DarkGradientTokensBetaCore.DataDefaultPositiveGradient.positions,
            DarkGradientTokensBetaCore.DataDefaultPositiveGradient.radius,
            DarkGradientTokensBetaCore.DataDefaultPositiveGradient.centerX,
            DarkGradientTokensBetaCore.DataDefaultPositiveGradient.centerY,
        ),
    )
    dataDefaultPositiveGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataDefaultPositiveGradientActive.background))
    dataDefaultPositiveGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataDefaultPositiveGradientHover.background))
    dataInversePositiveGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataInversePositiveGradientActive.background))
    dataOnDarkPositiveGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataOnDarkPositiveGradient.colors,
            DarkGradientTokensBetaCore.DataOnDarkPositiveGradient.positions,
            DarkGradientTokensBetaCore.DataOnDarkPositiveGradient.radius,
            DarkGradientTokensBetaCore.DataOnDarkPositiveGradient.centerX,
            DarkGradientTokensBetaCore.DataOnDarkPositiveGradient.centerY,
        ),
    )
    dataOnDarkPositiveGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnDarkPositiveGradientActive.background))
    dataOnDarkPositiveGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnDarkPositiveGradientHover.background))
    dataOnLightPositiveGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataOnLightPositiveGradient.colors,
            DarkGradientTokensBetaCore.DataOnLightPositiveGradient.positions,
            DarkGradientTokensBetaCore.DataOnLightPositiveGradient.radius,
            DarkGradientTokensBetaCore.DataOnLightPositiveGradient.centerX,
            DarkGradientTokensBetaCore.DataOnLightPositiveGradient.centerY,
        ),
    )
    dataOnLightPositiveGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnLightPositiveGradientActive.background))
    dataOnLightPositiveGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnLightPositiveGradientHover.background))
    dataOnDarkNegativeGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnDarkNegativeGradientHover.background))
    dataOnDarkNegativeGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataOnDarkNegativeGradient.colors,
            DarkGradientTokensBetaCore.DataOnDarkNegativeGradient.positions,
            DarkGradientTokensBetaCore.DataOnDarkNegativeGradient.radius,
            DarkGradientTokensBetaCore.DataOnDarkNegativeGradient.centerX,
            DarkGradientTokensBetaCore.DataOnDarkNegativeGradient.centerY,
        ),
    )
    dataDefaultNegativeGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataDefaultNegativeGradientActive.background))
    dataInverseNegativeGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataInverseNegativeGradientHover.background))
    dataInverseNegativeGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataInverseNegativeGradientActive.background))
    dataOnLightNegativeGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataOnLightNegativeGradient.colors,
            DarkGradientTokensBetaCore.DataOnLightNegativeGradient.positions,
            DarkGradientTokensBetaCore.DataOnLightNegativeGradient.radius,
            DarkGradientTokensBetaCore.DataOnLightNegativeGradient.centerX,
            DarkGradientTokensBetaCore.DataOnLightNegativeGradient.centerY,
        ),
    )
    dataOnLightNegativeGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnLightNegativeGradientActive.background))
    dataOnLightNegativeGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnLightNegativeGradientHover.background))
    dataDefaultNegativeGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataDefaultNegativeGradientHover.background))
    dataInverseNegativeGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataInverseNegativeGradient.colors,
            DarkGradientTokensBetaCore.DataInverseNegativeGradient.positions,
            DarkGradientTokensBetaCore.DataInverseNegativeGradient.radius,
            DarkGradientTokensBetaCore.DataInverseNegativeGradient.centerX,
            DarkGradientTokensBetaCore.DataInverseNegativeGradient.centerY,
        ),
    )
    dataDefaultNegativeGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataDefaultNegativeGradient.colors,
            DarkGradientTokensBetaCore.DataDefaultNegativeGradient.positions,
            DarkGradientTokensBetaCore.DataDefaultNegativeGradient.radius,
            DarkGradientTokensBetaCore.DataDefaultNegativeGradient.centerX,
            DarkGradientTokensBetaCore.DataDefaultNegativeGradient.centerY,
        ),
    )
    dataOnDarkNegativeGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnDarkNegativeGradientActive.background))
    dataInverseInfoGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataInverseInfoGradientActive.background))
    dataInverseInfoGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataInverseInfoGradientHover.background))
    dataOnDarkInfoGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataOnDarkInfoGradient.colors,
            DarkGradientTokensBetaCore.DataOnDarkInfoGradient.positions,
            DarkGradientTokensBetaCore.DataOnDarkInfoGradient.radius,
            DarkGradientTokensBetaCore.DataOnDarkInfoGradient.centerX,
            DarkGradientTokensBetaCore.DataOnDarkInfoGradient.centerY,
        ),
    )
    dataOnDarkInfoGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnDarkInfoGradientActive.background))
    dataDefaultInfoGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataDefaultInfoGradient.colors,
            DarkGradientTokensBetaCore.DataDefaultInfoGradient.positions,
            DarkGradientTokensBetaCore.DataDefaultInfoGradient.radius,
            DarkGradientTokensBetaCore.DataDefaultInfoGradient.centerX,
            DarkGradientTokensBetaCore.DataDefaultInfoGradient.centerY,
        ),
    )
    dataDefaultInfoGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataDefaultInfoGradientActive.background))
    dataDefaultInfoGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataDefaultInfoGradientHover.background))
    dataOnDarkInfoGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnDarkInfoGradientHover.background))
    dataOnLightInfoGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnLightInfoGradientHover.background))
    dataOnLightInfoGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensBetaCore.DataOnLightInfoGradientActive.background))
    dataOnLightInfoGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataOnLightInfoGradient.colors,
            DarkGradientTokensBetaCore.DataOnLightInfoGradient.positions,
            DarkGradientTokensBetaCore.DataOnLightInfoGradient.radius,
            DarkGradientTokensBetaCore.DataOnLightInfoGradient.centerX,
            DarkGradientTokensBetaCore.DataOnLightInfoGradient.centerY,
        ),
    )
    dataInverseInfoGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensBetaCore.DataInverseInfoGradient.colors,
            DarkGradientTokensBetaCore.DataInverseInfoGradient.positions,
            DarkGradientTokensBetaCore.DataInverseInfoGradient.radius,
            DarkGradientTokensBetaCore.DataInverseInfoGradient.centerX,
            DarkGradientTokensBetaCore.DataInverseInfoGradient.centerY,
        ),
    )
    outlineDefaultAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.OutlineDefaultAccentGradient.colors,
            DarkGradientTokensBetaCore.OutlineDefaultAccentGradient.positions,
            DarkGradientTokensBetaCore.OutlineDefaultAccentGradient.angle,
        ),
    )
    outlineOnLightAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.OutlineOnLightAccentGradient.colors,
            DarkGradientTokensBetaCore.OutlineOnLightAccentGradient.positions,
            DarkGradientTokensBetaCore.OutlineOnLightAccentGradient.angle,
        ),
    )
    outlineInverseAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.OutlineInverseAccentGradient.colors,
            DarkGradientTokensBetaCore.OutlineInverseAccentGradient.positions,
            DarkGradientTokensBetaCore.OutlineInverseAccentGradient.angle,
        ),
    )
    outlineOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensBetaCore.OutlineOnDarkAccentGradient.colors,
            DarkGradientTokensBetaCore.OutlineOnDarkAccentGradient.positions,
            DarkGradientTokensBetaCore.OutlineOnDarkAccentGradient.angle,
        ),
    )
    overrideGradients()
}

/**
 * Градиенты [SddsFinAiGradients] для темной темы в тенанте HighContrast
 */
@Suppress("LongMethod")
public fun darkSddsFinAiGradientsHighContrast(
    overrideGradients: GradientOverrideScope.() -> Unit =
        {},
): SddsFinAiGradients = darkSddsFinAiGradients {
    dataOnDarkWarningGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnDarkWarningGradientActive.background))
    dataInversePositiveGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataInversePositiveGradient.colors,
            DarkGradientTokensHighContrast.DataInversePositiveGradient.positions,
            DarkGradientTokensHighContrast.DataInversePositiveGradient.radius,
            DarkGradientTokensHighContrast.DataInversePositiveGradient.centerX,
            DarkGradientTokensHighContrast.DataInversePositiveGradient.centerY,
        ),
    )
    surfaceOnLightAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.SurfaceOnLightAccentGradient.colors,
            DarkGradientTokensHighContrast.SurfaceOnLightAccentGradient.positions,
            DarkGradientTokensHighContrast.SurfaceOnLightAccentGradient.angle,
        ),
    )
    textInverseAccentGradientMinorActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextInverseAccentGradientMinorActive.background))
    dataOnLightWarningGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnLightWarningGradientActive.background))
    surfaceDefaultAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.SurfaceDefaultAccentGradient.colors,
            DarkGradientTokensHighContrast.SurfaceDefaultAccentGradient.positions,
            DarkGradientTokensHighContrast.SurfaceDefaultAccentGradient.angle,
        ),
    )
    surfaceInverseAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.SurfaceInverseAccentGradient.colors,
            DarkGradientTokensHighContrast.SurfaceInverseAccentGradient.positions,
            DarkGradientTokensHighContrast.SurfaceInverseAccentGradient.angle,
        ),
    )
    surfaceOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.SurfaceOnDarkAccentGradient.colors,
            DarkGradientTokensHighContrast.SurfaceOnDarkAccentGradient.positions,
            DarkGradientTokensHighContrast.SurfaceOnDarkAccentGradient.angle,
        ),
    )
    textDefaultAccentGradientMinorActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextDefaultAccentGradientMinorActive.background))
    textDefaultAccentGradientMinor overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.TextDefaultAccentGradientMinor.colors,
            DarkGradientTokensHighContrast.TextDefaultAccentGradientMinor.positions,
            DarkGradientTokensHighContrast.TextDefaultAccentGradientMinor.angle,
        ),
    )
    textDefaultAccentGradientMinorHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextDefaultAccentGradientMinorHover.background))
    textInverseAccentGradientMinor overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.TextInverseAccentGradientMinor.colors,
            DarkGradientTokensHighContrast.TextInverseAccentGradientMinor.positions,
            DarkGradientTokensHighContrast.TextInverseAccentGradientMinor.angle,
        ),
    )
    textInverseAccentGradientMinorHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextInverseAccentGradientMinorHover.background))
    textOnDarkAccentGradientMinor overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.TextOnDarkAccentGradientMinor.colors,
            DarkGradientTokensHighContrast.TextOnDarkAccentGradientMinor.positions,
            DarkGradientTokensHighContrast.TextOnDarkAccentGradientMinor.angle,
        ),
    )
    textOnDarkAccentGradientMinorActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextOnDarkAccentGradientMinorActive.background))
    textOnDarkAccentGradientMinorHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextOnDarkAccentGradientMinorHover.background))
    textOnLightAccentGradientMinor overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.TextOnLightAccentGradientMinor.colors,
            DarkGradientTokensHighContrast.TextOnLightAccentGradientMinor.positions,
            DarkGradientTokensHighContrast.TextOnLightAccentGradientMinor.angle,
        ),
    )
    textOnLightAccentGradientMinorActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextOnLightAccentGradientMinorActive.background))
    textOnLightAccentGradientMinorHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextOnLightAccentGradientMinorHover.background))
    textOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.TextOnDarkAccentGradient.colors,
            DarkGradientTokensHighContrast.TextOnDarkAccentGradient.positions,
            DarkGradientTokensHighContrast.TextOnDarkAccentGradient.angle,
        ),
    )
    textInverseAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.TextInverseAccentGradient.colors,
            DarkGradientTokensHighContrast.TextInverseAccentGradient.positions,
            DarkGradientTokensHighContrast.TextInverseAccentGradient.angle,
        ),
    )
    textOnLightAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.TextOnLightAccentGradient.colors,
            DarkGradientTokensHighContrast.TextOnLightAccentGradient.positions,
            DarkGradientTokensHighContrast.TextOnLightAccentGradient.angle,
        ),
    )
    textDefaultAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.TextDefaultAccentGradient.colors,
            DarkGradientTokensHighContrast.TextDefaultAccentGradient.positions,
            DarkGradientTokensHighContrast.TextDefaultAccentGradient.angle,
        ),
    )
    textDefaultAccentGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextDefaultAccentGradientActive.background))
    textDefaultAccentGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextDefaultAccentGradientHover.background))
    textOnDarkAccentGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextOnDarkAccentGradientHover.background))
    textOnDarkAccentGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.TextOnDarkAccentGradientActive.background))
    dataInverseWarningGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataInverseWarningGradientActive.background))
    dataInverseWarningGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataInverseWarningGradientHover.background))
    dataOnLightWarningGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataOnLightWarningGradient.colors,
            DarkGradientTokensHighContrast.DataOnLightWarningGradient.positions,
            DarkGradientTokensHighContrast.DataOnLightWarningGradient.radius,
            DarkGradientTokensHighContrast.DataOnLightWarningGradient.centerX,
            DarkGradientTokensHighContrast.DataOnLightWarningGradient.centerY,
        ),
    )
    dataOnDarkWarningGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataOnDarkWarningGradient.colors,
            DarkGradientTokensHighContrast.DataOnDarkWarningGradient.positions,
            DarkGradientTokensHighContrast.DataOnDarkWarningGradient.radius,
            DarkGradientTokensHighContrast.DataOnDarkWarningGradient.centerX,
            DarkGradientTokensHighContrast.DataOnDarkWarningGradient.centerY,
        ),
    )
    dataOnDarkWarningGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnDarkWarningGradientHover.background))
    dataDefaultWarningGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataDefaultWarningGradientHover.background))
    dataDefaultWarningGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataDefaultWarningGradientActive.background))
    dataDefaultWarningGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataDefaultWarningGradient.colors,
            DarkGradientTokensHighContrast.DataDefaultWarningGradient.positions,
            DarkGradientTokensHighContrast.DataDefaultWarningGradient.radius,
            DarkGradientTokensHighContrast.DataDefaultWarningGradient.centerX,
            DarkGradientTokensHighContrast.DataDefaultWarningGradient.centerY,
        ),
    )
    dataOnLightWarningGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnLightWarningGradientHover.background))
    dataInverseWarningGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataInverseWarningGradient.colors,
            DarkGradientTokensHighContrast.DataInverseWarningGradient.positions,
            DarkGradientTokensHighContrast.DataInverseWarningGradient.radius,
            DarkGradientTokensHighContrast.DataInverseWarningGradient.centerX,
            DarkGradientTokensHighContrast.DataInverseWarningGradient.centerY,
        ),
    )
    dataInversePositiveGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataInversePositiveGradientHover.background))
    dataDefaultPositiveGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataDefaultPositiveGradient.colors,
            DarkGradientTokensHighContrast.DataDefaultPositiveGradient.positions,
            DarkGradientTokensHighContrast.DataDefaultPositiveGradient.radius,
            DarkGradientTokensHighContrast.DataDefaultPositiveGradient.centerX,
            DarkGradientTokensHighContrast.DataDefaultPositiveGradient.centerY,
        ),
    )
    dataDefaultPositiveGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataDefaultPositiveGradientActive.background))
    dataDefaultPositiveGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataDefaultPositiveGradientHover.background))
    dataInversePositiveGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataInversePositiveGradientActive.background))
    dataOnDarkPositiveGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataOnDarkPositiveGradient.colors,
            DarkGradientTokensHighContrast.DataOnDarkPositiveGradient.positions,
            DarkGradientTokensHighContrast.DataOnDarkPositiveGradient.radius,
            DarkGradientTokensHighContrast.DataOnDarkPositiveGradient.centerX,
            DarkGradientTokensHighContrast.DataOnDarkPositiveGradient.centerY,
        ),
    )
    dataOnDarkPositiveGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnDarkPositiveGradientActive.background))
    dataOnDarkPositiveGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnDarkPositiveGradientHover.background))
    dataOnLightPositiveGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataOnLightPositiveGradient.colors,
            DarkGradientTokensHighContrast.DataOnLightPositiveGradient.positions,
            DarkGradientTokensHighContrast.DataOnLightPositiveGradient.radius,
            DarkGradientTokensHighContrast.DataOnLightPositiveGradient.centerX,
            DarkGradientTokensHighContrast.DataOnLightPositiveGradient.centerY,
        ),
    )
    dataOnLightPositiveGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnLightPositiveGradientActive.background))
    dataOnLightPositiveGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnLightPositiveGradientHover.background))
    dataOnDarkNegativeGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnDarkNegativeGradientHover.background))
    dataOnDarkNegativeGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataOnDarkNegativeGradient.colors,
            DarkGradientTokensHighContrast.DataOnDarkNegativeGradient.positions,
            DarkGradientTokensHighContrast.DataOnDarkNegativeGradient.radius,
            DarkGradientTokensHighContrast.DataOnDarkNegativeGradient.centerX,
            DarkGradientTokensHighContrast.DataOnDarkNegativeGradient.centerY,
        ),
    )
    dataDefaultNegativeGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataDefaultNegativeGradientActive.background))
    dataInverseNegativeGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataInverseNegativeGradientHover.background))
    dataInverseNegativeGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataInverseNegativeGradientActive.background))
    dataOnLightNegativeGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataOnLightNegativeGradient.colors,
            DarkGradientTokensHighContrast.DataOnLightNegativeGradient.positions,
            DarkGradientTokensHighContrast.DataOnLightNegativeGradient.radius,
            DarkGradientTokensHighContrast.DataOnLightNegativeGradient.centerX,
            DarkGradientTokensHighContrast.DataOnLightNegativeGradient.centerY,
        ),
    )
    dataOnLightNegativeGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnLightNegativeGradientActive.background))
    dataOnLightNegativeGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnLightNegativeGradientHover.background))
    dataDefaultNegativeGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataDefaultNegativeGradientHover.background))
    dataInverseNegativeGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataInverseNegativeGradient.colors,
            DarkGradientTokensHighContrast.DataInverseNegativeGradient.positions,
            DarkGradientTokensHighContrast.DataInverseNegativeGradient.radius,
            DarkGradientTokensHighContrast.DataInverseNegativeGradient.centerX,
            DarkGradientTokensHighContrast.DataInverseNegativeGradient.centerY,
        ),
    )
    dataDefaultNegativeGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataDefaultNegativeGradient.colors,
            DarkGradientTokensHighContrast.DataDefaultNegativeGradient.positions,
            DarkGradientTokensHighContrast.DataDefaultNegativeGradient.radius,
            DarkGradientTokensHighContrast.DataDefaultNegativeGradient.centerX,
            DarkGradientTokensHighContrast.DataDefaultNegativeGradient.centerY,
        ),
    )
    dataOnDarkNegativeGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnDarkNegativeGradientActive.background))
    dataInverseInfoGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataInverseInfoGradientActive.background))
    dataInverseInfoGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataInverseInfoGradientHover.background))
    dataOnDarkInfoGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataOnDarkInfoGradient.colors,
            DarkGradientTokensHighContrast.DataOnDarkInfoGradient.positions,
            DarkGradientTokensHighContrast.DataOnDarkInfoGradient.radius,
            DarkGradientTokensHighContrast.DataOnDarkInfoGradient.centerX,
            DarkGradientTokensHighContrast.DataOnDarkInfoGradient.centerY,
        ),
    )
    dataOnDarkInfoGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnDarkInfoGradientActive.background))
    dataDefaultInfoGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataDefaultInfoGradient.colors,
            DarkGradientTokensHighContrast.DataDefaultInfoGradient.positions,
            DarkGradientTokensHighContrast.DataDefaultInfoGradient.radius,
            DarkGradientTokensHighContrast.DataDefaultInfoGradient.centerX,
            DarkGradientTokensHighContrast.DataDefaultInfoGradient.centerY,
        ),
    )
    dataDefaultInfoGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataDefaultInfoGradientActive.background))
    dataDefaultInfoGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataDefaultInfoGradientHover.background))
    dataOnDarkInfoGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnDarkInfoGradientHover.background))
    dataOnLightInfoGradientHover overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnLightInfoGradientHover.background))
    dataOnLightInfoGradientActive overrideBy
        listOf(singleColor(DarkGradientTokensHighContrast.DataOnLightInfoGradientActive.background))
    dataOnLightInfoGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataOnLightInfoGradient.colors,
            DarkGradientTokensHighContrast.DataOnLightInfoGradient.positions,
            DarkGradientTokensHighContrast.DataOnLightInfoGradient.radius,
            DarkGradientTokensHighContrast.DataOnLightInfoGradient.centerX,
            DarkGradientTokensHighContrast.DataOnLightInfoGradient.centerY,
        ),
    )
    dataInverseInfoGradient overrideBy listOf(
        radialGradient(
            DarkGradientTokensHighContrast.DataInverseInfoGradient.colors,
            DarkGradientTokensHighContrast.DataInverseInfoGradient.positions,
            DarkGradientTokensHighContrast.DataInverseInfoGradient.radius,
            DarkGradientTokensHighContrast.DataInverseInfoGradient.centerX,
            DarkGradientTokensHighContrast.DataInverseInfoGradient.centerY,
        ),
    )
    outlineDefaultAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.OutlineDefaultAccentGradient.colors,
            DarkGradientTokensHighContrast.OutlineDefaultAccentGradient.positions,
            DarkGradientTokensHighContrast.OutlineDefaultAccentGradient.angle,
        ),
    )
    outlineOnLightAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.OutlineOnLightAccentGradient.colors,
            DarkGradientTokensHighContrast.OutlineOnLightAccentGradient.positions,
            DarkGradientTokensHighContrast.OutlineOnLightAccentGradient.angle,
        ),
    )
    outlineInverseAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.OutlineInverseAccentGradient.colors,
            DarkGradientTokensHighContrast.OutlineInverseAccentGradient.positions,
            DarkGradientTokensHighContrast.OutlineInverseAccentGradient.angle,
        ),
    )
    outlineOnDarkAccentGradient overrideBy listOf(
        linearGradient(
            DarkGradientTokensHighContrast.OutlineOnDarkAccentGradient.colors,
            DarkGradientTokensHighContrast.OutlineOnDarkAccentGradient.positions,
            DarkGradientTokensHighContrast.OutlineOnDarkAccentGradient.angle,
        ),
    )
    overrideGradients()
}

internal fun linearGradient(
    colors: List<Color>,
    positions: FloatArray,
    angle: Float = 0f,
    startPoint: Offset? = null,
    endPoint: Offset? = null,
): ShaderBrush = Gradients.Linear(colors, positions.toList(), angle, startPoint, endPoint)

internal fun radialGradient(
    colors: List<Color>,
    positions: FloatArray,
    radius: Float,
    centerX: Float,
    centerY: Float,
): ShaderBrush = Gradients.Radial(colors, positions.toList(), radius, centerX, centerY)

internal fun sweepGradient(
    colors: List<Color>,
    positions: FloatArray,
    centerX: Float,
    centerY: Float,
): ShaderBrush = Gradients.Sweep(colors, positions.toList(), centerX, centerY)

internal fun singleColor(color: Color): ShaderBrush = Gradients.Linear(
    listOf(color, color),
    listOf(0f, 1f),
)

/**
 * Модификатор, позволяющий применить композитный градиент.
 */
@Composable
public fun Modifier.compositeGradient(brushes: List<Brush>): Modifier = this then
    Modifier.drawBehind { brushes.forEach(::drawRect) }
