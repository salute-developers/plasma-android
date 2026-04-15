// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.sbcom.theme

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
import com.sdds.sbcom.tokens.DarkGradientTokens
import com.sdds.sbcom.tokens.LightGradientTokens
import kotlin.Float
import kotlin.FloatArray
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableMap

/**
 * Градиенты SddsSbCom
 */
@Immutable
public class SddsSbComGradients(
    private val gradients: Map<String, List<ShaderBrush>>,
) {
    public val surfaceOnDarkAccentGradientBrightness: List<ShaderBrush> by gradients

    public val outlineOnDarkTransparentSurfaceBrightness: List<ShaderBrush> by gradients

    public val surfaceDefaultAccentGradientBrightness: List<ShaderBrush> by gradients

    public val personaInversePinkSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val textDefaultAccentGradientAiBrightness: List<ShaderBrush> by gradients

    public val surfaceOnLightAccentGradientBrightness: List<ShaderBrush> by gradients

    public val personaDefaultGreenSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val textOnDarkAccentGradientAiBrightness: List<ShaderBrush> by gradients

    public val textOnLightAccentGradientAiBrightness: List<ShaderBrush> by gradients

    public val surfaceInverseAccentGradientBrightness: List<ShaderBrush> by gradients

    public val textInverseAccentGradientAiBrightness: List<ShaderBrush> by gradients

    public val overlayOnLightGradientBrightness: List<ShaderBrush> by gradients

    public val outlineDefaultTransparentSurfaceBrightness: List<ShaderBrush> by gradients

    public val overlayDefaultGradientBrightness: List<ShaderBrush> by gradients

    public val overlayOnDarkGradientBrightness: List<ShaderBrush> by gradients

    public val overlayInverseGradientBrightness: List<ShaderBrush> by gradients

    public val outlineOnLightTransparentSurfaceBrightness: List<ShaderBrush> by gradients

    public val personaOnLightBlueSurfaceAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradient: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientActive: List<ShaderBrush> by gradients

    public val personaDefaultBlueSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaDefaultGreenSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaDefaultGreenSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaDefaultIndigoSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaDefaultIndigoSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaDefaultOchreSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaDefaultOchreSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaDefaultOliveSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaDefaultOliveSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaDefaultOliveSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaDefaultPinkSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaDefaultPinkSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaDefaultPinkSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaDefaultBlueSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaDefaultSeaBlueSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaDefaultVioletSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaDefaultVioletSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaDefaultVioletSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaInverseBlueSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaInverseBlueSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaInverseBlueSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaInverseGreenSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaInverseGreenSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaInverseGreenSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaInverseIndigoSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaInverseIndigoSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaInverseOchreSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaInverseOchreSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaDefaultSeaBlueSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaDefaultSeaBlueSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaInverseOliveSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaInversePinkSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaInversePinkSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaInverseSeaBlueSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaInverseSeaBlueSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaInverseSeaBlueSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaInverseVioletSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaInverseVioletSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaInverseVioletSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnDarkBlueSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnDarkBlueSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnDarkBlueSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnDarkGreenSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnDarkGreenSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnDarkGreenSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaInverseOliveSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaInverseOliveSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnDarkIndigoSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaInverseOchreSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnDarkOchreSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnDarkOchreSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnDarkOliveSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnDarkOliveSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnDarkOliveSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnDarkPinkSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnDarkPinkSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnDarkPinkSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnDarkSeaBlueSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnDarkSeaBlueSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnDarkSeaBlueSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnDarkVioletSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnDarkVioletSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnDarkVioletSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnDarkIndigoSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnDarkIndigoSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnLightGreenSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnLightGreenSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnLightGreenSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnLightIndigoSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnLightIndigoSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnLightIndigoSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnLightOchreSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnLightOchreSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnLightOchreSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnDarkOchreSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnLightOliveSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnLightPinkSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnLightPinkSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnLightBlueSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnLightVioletSurfaceAccentGradient: List<ShaderBrush> by gradients

    public val personaOnLightVioletSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val outlineOnDarkTransparentSurfaceActive: List<ShaderBrush> by gradients

    public val outlineOnLightTransparentSurface: List<ShaderBrush> by gradients

    public val outlineOnLightTransparentSurfaceHover: List<ShaderBrush> by gradients

    public val outlineOnLightTransparentSurfaceActive: List<ShaderBrush> by gradients

    public val overlayInverseGradient: List<ShaderBrush> by gradients

    public val textDefaultAccentGradientAi: List<ShaderBrush> by gradients

    public val textDefaultAccentGradientAiHover: List<ShaderBrush> by gradients

    public val textInverseAccentGradientAi: List<ShaderBrush> by gradients

    public val textInverseAccentGradientAiHover: List<ShaderBrush> by gradients

    public val textInverseAccentGradientAiActive: List<ShaderBrush> by gradients

    public val textOnDarkAccentGradientAi: List<ShaderBrush> by gradients

    public val textOnDarkAccentGradientAiHover: List<ShaderBrush> by gradients

    public val textOnDarkAccentGradientAiActive: List<ShaderBrush> by gradients

    public val textOnLightAccentGradientAi: List<ShaderBrush> by gradients

    public val textOnLightAccentGradientAiHover: List<ShaderBrush> by gradients

    public val textOnLightAccentGradientAiActive: List<ShaderBrush> by gradients

    public val textDefaultAccentGradientAiActive: List<ShaderBrush> by gradients

    public val outlineOnDarkTransparentSurface: List<ShaderBrush> by gradients

    public val outlineOnDarkTransparentSurfaceHover: List<ShaderBrush> by gradients

    public val personaOnLightOliveSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val overlayOnLightGradientActive: List<ShaderBrush> by gradients

    public val outlineDefaultTransparentSurface: List<ShaderBrush> by gradients

    public val outlineDefaultTransparentSurfaceHover: List<ShaderBrush> by gradients

    public val outlineDefaultTransparentSurfaceActive: List<ShaderBrush> by gradients

    public val overlayDefaultGradient: List<ShaderBrush> by gradients

    public val overlayDefaultGradientHover: List<ShaderBrush> by gradients

    public val overlayDefaultGradientActive: List<ShaderBrush> by gradients

    public val overlayOnDarkGradient: List<ShaderBrush> by gradients

    public val overlayOnDarkGradientHover: List<ShaderBrush> by gradients

    public val overlayOnDarkGradientActive: List<ShaderBrush> by gradients

    public val overlayInverseGradientActive: List<ShaderBrush> by gradients

    public val overlayInverseGradientHover: List<ShaderBrush> by gradients

    public val overlayOnLightGradient: List<ShaderBrush> by gradients

    public val personaOnLightPinkSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnLightSeaBlueSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val overlayOnLightGradientHover: List<ShaderBrush> by gradients

    public val personaOnLightOliveSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnLightSeaBlueSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientHover: List<ShaderBrush> by gradients

    public val personaInverseIndigoSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaOnLightSeaBlueSurfaceAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnLightVioletSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradient: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientActive: List<ShaderBrush> by gradients

    public val personaOnLightBlueSurfaceAccentGradientActive: List<ShaderBrush> by gradients

    public val personaDefaultOchreSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientHover: List<ShaderBrush> by gradients

    public val personaDefaultIndigoSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val personaDefaultBlueSurfaceAccentGradientHover: List<ShaderBrush> by gradients

    public val outlineInverseTransparentSurfaceBrightness: List<ShaderBrush> by gradients

    public val outlineInverseTransparentSurface: List<ShaderBrush> by gradients

    public val outlineInverseTransparentSurfaceHover: List<ShaderBrush> by gradients

    public val outlineInverseTransparentSurfaceActive: List<ShaderBrush> by gradients

    /**
     * Возвращает копию [SddsSbComGradients]. Предоставляет возможность переопределять градиенты.
     */
    public fun copy(overrideGradients: GradientOverrideScope.() -> Unit = {}): SddsSbComGradients {
        val gradientOverrideScope = GradientOverrideScope()
        overrideGradients.invoke(gradientOverrideScope)
        val overrideMap = gradientOverrideScope.overrideMap
        return SddsSbComGradients(gradients.mapValues { overrideMap[it.key] ?: it.value })
    }
}

/**
 * Скоуп переопределения градиентов
 */
public class GradientOverrideScope {
    private val _overrideMap: MutableMap<String, List<ShaderBrush>> = mutableMapOf()

    internal val overrideMap: Map<String, List<ShaderBrush>>
        get() = _overrideMap.toMap()

    public val surfaceOnDarkAccentGradientBrightness: String =
        "surfaceOnDarkAccentGradientBrightness"

    public val outlineOnDarkTransparentSurfaceBrightness: String =
        "outlineOnDarkTransparentSurfaceBrightness"

    public val surfaceDefaultAccentGradientBrightness: String =
        "surfaceDefaultAccentGradientBrightness"

    public val personaInversePinkSurfaceAccentGradientActive: String =
        "personaInversePinkSurfaceAccentGradientActive"

    public val textDefaultAccentGradientAiBrightness: String =
        "textDefaultAccentGradientAiBrightness"

    public val surfaceOnLightAccentGradientBrightness: String =
        "surfaceOnLightAccentGradientBrightness"

    public val personaDefaultGreenSurfaceAccentGradientHover: String =
        "personaDefaultGreenSurfaceAccentGradientHover"

    public val textOnDarkAccentGradientAiBrightness: String = "textOnDarkAccentGradientAiBrightness"

    public val textOnLightAccentGradientAiBrightness: String =
        "textOnLightAccentGradientAiBrightness"

    public val surfaceInverseAccentGradientBrightness: String =
        "surfaceInverseAccentGradientBrightness"

    public val textInverseAccentGradientAiBrightness: String =
        "textInverseAccentGradientAiBrightness"

    public val overlayOnLightGradientBrightness: String = "overlayOnLightGradientBrightness"

    public val outlineDefaultTransparentSurfaceBrightness: String =
        "outlineDefaultTransparentSurfaceBrightness"

    public val overlayDefaultGradientBrightness: String = "overlayDefaultGradientBrightness"

    public val overlayOnDarkGradientBrightness: String = "overlayOnDarkGradientBrightness"

    public val overlayInverseGradientBrightness: String = "overlayInverseGradientBrightness"

    public val outlineOnLightTransparentSurfaceBrightness: String =
        "outlineOnLightTransparentSurfaceBrightness"

    public val personaOnLightBlueSurfaceAccentGradient: String =
        "personaOnLightBlueSurfaceAccentGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradient: String = "surfaceDefaultAccentGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradient: String = "surfaceDefaultSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientHover: String = "surfaceDefaultSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceDefaultSkeletonGradientActive: String = "surfaceDefaultSkeletonGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradient: String = "surfaceDefaultSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientHover: String =
        "surfaceDefaultSkeletonDeepGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientHover: String = "surfaceOnDarkAccentGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientActive: String =
        "surfaceDefaultSkeletonDeepGradientActive"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradientActive: String = "surfaceOnDarkAccentGradientActive"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradient: String = "surfaceOnDarkSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientHover: String = "surfaceOnDarkSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceOnDarkSkeletonGradientActive: String = "surfaceOnDarkSkeletonGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradient: String = "surfaceOnDarkSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientHover: String =
        "surfaceOnDarkSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnDarkSkeletonDeepGradientActive: String =
        "surfaceOnDarkSkeletonDeepGradientActive"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientActive: String = "surfaceOnLightAccentGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientActive: String =
        "surfaceOnLightSkeletonDeepGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientHover: String =
        "surfaceOnLightSkeletonDeepGradientHover"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientHover: String = "surfaceInverseAccentGradientHover"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradientActive: String = "surfaceInverseAccentGradientActive"

    /**
     * Инвертированный акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceInverseAccentGradient: String = "surfaceInverseAccentGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradient: String = "surfaceInverseSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientHover: String = "surfaceInverseSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceInverseSkeletonGradientActive: String = "surfaceInverseSkeletonGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradient: String = "surfaceInverseSkeletonDeepGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradient: String = "surfaceOnLightAccentGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradient: String = "surfaceOnLightSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientActive: String = "surfaceOnLightSkeletonGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradient: String = "surfaceOnLightSkeletonDeepGradient"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradient: String = "outlineDefaultAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientHover: String = "outlineOnDarkAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradientActive: String = "outlineOnDarkAccentGradientActive"

    /**
     * Акцентный цвет обводки с градиентом на темном фоне
     */
    public val outlineOnDarkAccentGradient: String = "outlineOnDarkAccentGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientActive: String =
        "surfaceInverseSkeletonDeepGradientActive"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientHover: String = "outlineDefaultAccentGradientHover"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradient: String = "outlineOnLightAccentGradient"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientHover: String = "outlineInverseAccentGradientHover"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradientActive: String = "outlineInverseAccentGradientActive"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientActive: String = "outlineOnLightAccentGradientActive"

    public val personaDefaultBlueSurfaceAccentGradientActive: String =
        "personaDefaultBlueSurfaceAccentGradientActive"

    public val personaDefaultGreenSurfaceAccentGradient: String =
        "personaDefaultGreenSurfaceAccentGradient"

    public val personaDefaultGreenSurfaceAccentGradientActive: String =
        "personaDefaultGreenSurfaceAccentGradientActive"

    public val personaDefaultIndigoSurfaceAccentGradient: String =
        "personaDefaultIndigoSurfaceAccentGradient"

    public val personaDefaultIndigoSurfaceAccentGradientActive: String =
        "personaDefaultIndigoSurfaceAccentGradientActive"

    public val personaDefaultOchreSurfaceAccentGradient: String =
        "personaDefaultOchreSurfaceAccentGradient"

    public val personaDefaultOchreSurfaceAccentGradientActive: String =
        "personaDefaultOchreSurfaceAccentGradientActive"

    public val personaDefaultOliveSurfaceAccentGradient: String =
        "personaDefaultOliveSurfaceAccentGradient"

    public val personaDefaultOliveSurfaceAccentGradientHover: String =
        "personaDefaultOliveSurfaceAccentGradientHover"

    public val personaDefaultOliveSurfaceAccentGradientActive: String =
        "personaDefaultOliveSurfaceAccentGradientActive"

    public val personaDefaultPinkSurfaceAccentGradient: String =
        "personaDefaultPinkSurfaceAccentGradient"

    public val personaDefaultPinkSurfaceAccentGradientHover: String =
        "personaDefaultPinkSurfaceAccentGradientHover"

    public val personaDefaultPinkSurfaceAccentGradientActive: String =
        "personaDefaultPinkSurfaceAccentGradientActive"

    public val personaDefaultBlueSurfaceAccentGradient: String =
        "personaDefaultBlueSurfaceAccentGradient"

    public val personaDefaultSeaBlueSurfaceAccentGradientActive: String =
        "personaDefaultSeaBlueSurfaceAccentGradientActive"

    public val personaDefaultVioletSurfaceAccentGradient: String =
        "personaDefaultVioletSurfaceAccentGradient"

    public val personaDefaultVioletSurfaceAccentGradientHover: String =
        "personaDefaultVioletSurfaceAccentGradientHover"

    public val personaDefaultVioletSurfaceAccentGradientActive: String =
        "personaDefaultVioletSurfaceAccentGradientActive"

    public val personaInverseBlueSurfaceAccentGradient: String =
        "personaInverseBlueSurfaceAccentGradient"

    public val personaInverseBlueSurfaceAccentGradientHover: String =
        "personaInverseBlueSurfaceAccentGradientHover"

    public val personaInverseBlueSurfaceAccentGradientActive: String =
        "personaInverseBlueSurfaceAccentGradientActive"

    public val personaInverseGreenSurfaceAccentGradient: String =
        "personaInverseGreenSurfaceAccentGradient"

    public val personaInverseGreenSurfaceAccentGradientHover: String =
        "personaInverseGreenSurfaceAccentGradientHover"

    public val personaInverseGreenSurfaceAccentGradientActive: String =
        "personaInverseGreenSurfaceAccentGradientActive"

    public val personaInverseIndigoSurfaceAccentGradient: String =
        "personaInverseIndigoSurfaceAccentGradient"

    public val personaInverseIndigoSurfaceAccentGradientActive: String =
        "personaInverseIndigoSurfaceAccentGradientActive"

    public val personaInverseOchreSurfaceAccentGradientHover: String =
        "personaInverseOchreSurfaceAccentGradientHover"

    public val personaInverseOchreSurfaceAccentGradientActive: String =
        "personaInverseOchreSurfaceAccentGradientActive"

    public val personaDefaultSeaBlueSurfaceAccentGradient: String =
        "personaDefaultSeaBlueSurfaceAccentGradient"

    public val personaDefaultSeaBlueSurfaceAccentGradientHover: String =
        "personaDefaultSeaBlueSurfaceAccentGradientHover"

    public val personaInverseOliveSurfaceAccentGradientActive: String =
        "personaInverseOliveSurfaceAccentGradientActive"

    public val personaInversePinkSurfaceAccentGradient: String =
        "personaInversePinkSurfaceAccentGradient"

    public val personaInversePinkSurfaceAccentGradientHover: String =
        "personaInversePinkSurfaceAccentGradientHover"

    public val personaInverseSeaBlueSurfaceAccentGradient: String =
        "personaInverseSeaBlueSurfaceAccentGradient"

    public val personaInverseSeaBlueSurfaceAccentGradientHover: String =
        "personaInverseSeaBlueSurfaceAccentGradientHover"

    public val personaInverseSeaBlueSurfaceAccentGradientActive: String =
        "personaInverseSeaBlueSurfaceAccentGradientActive"

    public val personaInverseVioletSurfaceAccentGradient: String =
        "personaInverseVioletSurfaceAccentGradient"

    public val personaInverseVioletSurfaceAccentGradientHover: String =
        "personaInverseVioletSurfaceAccentGradientHover"

    public val personaInverseVioletSurfaceAccentGradientActive: String =
        "personaInverseVioletSurfaceAccentGradientActive"

    public val personaOnDarkBlueSurfaceAccentGradient: String =
        "personaOnDarkBlueSurfaceAccentGradient"

    public val personaOnDarkBlueSurfaceAccentGradientHover: String =
        "personaOnDarkBlueSurfaceAccentGradientHover"

    public val personaOnDarkBlueSurfaceAccentGradientActive: String =
        "personaOnDarkBlueSurfaceAccentGradientActive"

    public val personaOnDarkGreenSurfaceAccentGradient: String =
        "personaOnDarkGreenSurfaceAccentGradient"

    public val personaOnDarkGreenSurfaceAccentGradientHover: String =
        "personaOnDarkGreenSurfaceAccentGradientHover"

    public val personaOnDarkGreenSurfaceAccentGradientActive: String =
        "personaOnDarkGreenSurfaceAccentGradientActive"

    public val personaInverseOliveSurfaceAccentGradient: String =
        "personaInverseOliveSurfaceAccentGradient"

    public val personaInverseOliveSurfaceAccentGradientHover: String =
        "personaInverseOliveSurfaceAccentGradientHover"

    public val personaOnDarkIndigoSurfaceAccentGradientActive: String =
        "personaOnDarkIndigoSurfaceAccentGradientActive"

    public val personaInverseOchreSurfaceAccentGradient: String =
        "personaInverseOchreSurfaceAccentGradient"

    public val personaOnDarkOchreSurfaceAccentGradientHover: String =
        "personaOnDarkOchreSurfaceAccentGradientHover"

    public val personaOnDarkOchreSurfaceAccentGradientActive: String =
        "personaOnDarkOchreSurfaceAccentGradientActive"

    public val personaOnDarkOliveSurfaceAccentGradient: String =
        "personaOnDarkOliveSurfaceAccentGradient"

    public val personaOnDarkOliveSurfaceAccentGradientHover: String =
        "personaOnDarkOliveSurfaceAccentGradientHover"

    public val personaOnDarkOliveSurfaceAccentGradientActive: String =
        "personaOnDarkOliveSurfaceAccentGradientActive"

    public val personaOnDarkPinkSurfaceAccentGradient: String =
        "personaOnDarkPinkSurfaceAccentGradient"

    public val personaOnDarkPinkSurfaceAccentGradientHover: String =
        "personaOnDarkPinkSurfaceAccentGradientHover"

    public val personaOnDarkPinkSurfaceAccentGradientActive: String =
        "personaOnDarkPinkSurfaceAccentGradientActive"

    public val personaOnDarkSeaBlueSurfaceAccentGradient: String =
        "personaOnDarkSeaBlueSurfaceAccentGradient"

    public val personaOnDarkSeaBlueSurfaceAccentGradientHover: String =
        "personaOnDarkSeaBlueSurfaceAccentGradientHover"

    public val personaOnDarkSeaBlueSurfaceAccentGradientActive: String =
        "personaOnDarkSeaBlueSurfaceAccentGradientActive"

    public val personaOnDarkVioletSurfaceAccentGradient: String =
        "personaOnDarkVioletSurfaceAccentGradient"

    public val personaOnDarkVioletSurfaceAccentGradientHover: String =
        "personaOnDarkVioletSurfaceAccentGradientHover"

    public val personaOnDarkVioletSurfaceAccentGradientActive: String =
        "personaOnDarkVioletSurfaceAccentGradientActive"

    public val personaOnDarkIndigoSurfaceAccentGradient: String =
        "personaOnDarkIndigoSurfaceAccentGradient"

    public val personaOnDarkIndigoSurfaceAccentGradientHover: String =
        "personaOnDarkIndigoSurfaceAccentGradientHover"

    public val personaOnLightGreenSurfaceAccentGradient: String =
        "personaOnLightGreenSurfaceAccentGradient"

    public val personaOnLightGreenSurfaceAccentGradientHover: String =
        "personaOnLightGreenSurfaceAccentGradientHover"

    public val personaOnLightGreenSurfaceAccentGradientActive: String =
        "personaOnLightGreenSurfaceAccentGradientActive"

    public val personaOnLightIndigoSurfaceAccentGradient: String =
        "personaOnLightIndigoSurfaceAccentGradient"

    public val personaOnLightIndigoSurfaceAccentGradientHover: String =
        "personaOnLightIndigoSurfaceAccentGradientHover"

    public val personaOnLightIndigoSurfaceAccentGradientActive: String =
        "personaOnLightIndigoSurfaceAccentGradientActive"

    public val personaOnLightOchreSurfaceAccentGradient: String =
        "personaOnLightOchreSurfaceAccentGradient"

    public val personaOnLightOchreSurfaceAccentGradientHover: String =
        "personaOnLightOchreSurfaceAccentGradientHover"

    public val personaOnLightOchreSurfaceAccentGradientActive: String =
        "personaOnLightOchreSurfaceAccentGradientActive"

    public val personaOnDarkOchreSurfaceAccentGradient: String =
        "personaOnDarkOchreSurfaceAccentGradient"

    public val personaOnLightOliveSurfaceAccentGradient: String =
        "personaOnLightOliveSurfaceAccentGradient"

    public val personaOnLightPinkSurfaceAccentGradient: String =
        "personaOnLightPinkSurfaceAccentGradient"

    public val personaOnLightPinkSurfaceAccentGradientHover: String =
        "personaOnLightPinkSurfaceAccentGradientHover"

    public val personaOnLightBlueSurfaceAccentGradientHover: String =
        "personaOnLightBlueSurfaceAccentGradientHover"

    public val personaOnLightVioletSurfaceAccentGradient: String =
        "personaOnLightVioletSurfaceAccentGradient"

    public val personaOnLightVioletSurfaceAccentGradientActive: String =
        "personaOnLightVioletSurfaceAccentGradientActive"

    public val outlineOnDarkTransparentSurfaceActive: String =
        "outlineOnDarkTransparentSurfaceActive"

    public val outlineOnLightTransparentSurface: String = "outlineOnLightTransparentSurface"

    public val outlineOnLightTransparentSurfaceHover: String =
        "outlineOnLightTransparentSurfaceHover"

    public val outlineOnLightTransparentSurfaceActive: String =
        "outlineOnLightTransparentSurfaceActive"

    public val overlayInverseGradient: String = "overlayInverseGradient"

    public val textDefaultAccentGradientAi: String = "textDefaultAccentGradientAi"

    public val textDefaultAccentGradientAiHover: String = "textDefaultAccentGradientAiHover"

    public val textInverseAccentGradientAi: String = "textInverseAccentGradientAi"

    public val textInverseAccentGradientAiHover: String = "textInverseAccentGradientAiHover"

    public val textInverseAccentGradientAiActive: String = "textInverseAccentGradientAiActive"

    public val textOnDarkAccentGradientAi: String = "textOnDarkAccentGradientAi"

    public val textOnDarkAccentGradientAiHover: String = "textOnDarkAccentGradientAiHover"

    public val textOnDarkAccentGradientAiActive: String = "textOnDarkAccentGradientAiActive"

    public val textOnLightAccentGradientAi: String = "textOnLightAccentGradientAi"

    public val textOnLightAccentGradientAiHover: String = "textOnLightAccentGradientAiHover"

    public val textOnLightAccentGradientAiActive: String = "textOnLightAccentGradientAiActive"

    public val textDefaultAccentGradientAiActive: String = "textDefaultAccentGradientAiActive"

    public val outlineOnDarkTransparentSurface: String = "outlineOnDarkTransparentSurface"

    public val outlineOnDarkTransparentSurfaceHover: String = "outlineOnDarkTransparentSurfaceHover"

    public val personaOnLightOliveSurfaceAccentGradientHover: String =
        "personaOnLightOliveSurfaceAccentGradientHover"

    public val overlayOnLightGradientActive: String = "overlayOnLightGradientActive"

    public val outlineDefaultTransparentSurface: String = "outlineDefaultTransparentSurface"

    public val outlineDefaultTransparentSurfaceHover: String =
        "outlineDefaultTransparentSurfaceHover"

    public val outlineDefaultTransparentSurfaceActive: String =
        "outlineDefaultTransparentSurfaceActive"

    public val overlayDefaultGradient: String = "overlayDefaultGradient"

    public val overlayDefaultGradientHover: String = "overlayDefaultGradientHover"

    public val overlayDefaultGradientActive: String = "overlayDefaultGradientActive"

    public val overlayOnDarkGradient: String = "overlayOnDarkGradient"

    public val overlayOnDarkGradientHover: String = "overlayOnDarkGradientHover"

    public val overlayOnDarkGradientActive: String = "overlayOnDarkGradientActive"

    public val overlayInverseGradientActive: String = "overlayInverseGradientActive"

    public val overlayInverseGradientHover: String = "overlayInverseGradientHover"

    public val overlayOnLightGradient: String = "overlayOnLightGradient"

    public val personaOnLightPinkSurfaceAccentGradientActive: String =
        "personaOnLightPinkSurfaceAccentGradientActive"

    public val personaOnLightSeaBlueSurfaceAccentGradientHover: String =
        "personaOnLightSeaBlueSurfaceAccentGradientHover"

    public val overlayOnLightGradientHover: String = "overlayOnLightGradientHover"

    public val personaOnLightOliveSurfaceAccentGradientActive: String =
        "personaOnLightOliveSurfaceAccentGradientActive"

    public val personaOnLightSeaBlueSurfaceAccentGradientActive: String =
        "personaOnLightSeaBlueSurfaceAccentGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientHover: String =
        "surfaceInverseSkeletonDeepGradientHover"

    /**
     * Инвертированный акцентный цвет обводки с градиентом
     */
    public val outlineInverseAccentGradient: String = "outlineInverseAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом на светлом фоне
     */
    public val outlineOnLightAccentGradientHover: String = "outlineOnLightAccentGradientHover"

    public val personaInverseIndigoSurfaceAccentGradientHover: String =
        "personaInverseIndigoSurfaceAccentGradientHover"

    public val personaOnLightSeaBlueSurfaceAccentGradient: String =
        "personaOnLightSeaBlueSurfaceAccentGradient"

    /**
     * Акцентный цвет обводки с градиентом
     */
    public val outlineDefaultAccentGradientActive: String = "outlineDefaultAccentGradientActive"

    public val personaOnLightVioletSurfaceAccentGradientHover: String =
        "personaOnLightVioletSurfaceAccentGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом на темном фоне
     */
    public val surfaceOnDarkAccentGradient: String = "surfaceOnDarkAccentGradient"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientHover: String = "surfaceDefaultAccentGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом
     */
    public val surfaceDefaultAccentGradientActive: String = "surfaceDefaultAccentGradientActive"

    public val personaOnLightBlueSurfaceAccentGradientActive: String =
        "personaOnLightBlueSurfaceAccentGradientActive"

    public val personaDefaultOchreSurfaceAccentGradientHover: String =
        "personaDefaultOchreSurfaceAccentGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientHover: String = "surfaceOnLightSkeletonGradientHover"

    /**
     * Акцентный фон поверхности/контрола с градиентом на светлом фоне
     */
    public val surfaceOnLightAccentGradientHover: String = "surfaceOnLightAccentGradientHover"

    public val personaDefaultIndigoSurfaceAccentGradientHover: String =
        "personaDefaultIndigoSurfaceAccentGradientHover"

    public val personaDefaultBlueSurfaceAccentGradientHover: String =
        "personaDefaultBlueSurfaceAccentGradientHover"

    public val outlineInverseTransparentSurfaceBrightness: String =
        "outlineInverseTransparentSurfaceBrightness"

    public val outlineInverseTransparentSurface: String = "outlineInverseTransparentSurface"

    public val outlineInverseTransparentSurfaceHover: String =
        "outlineInverseTransparentSurfaceHover"

    public val outlineInverseTransparentSurfaceActive: String =
        "outlineInverseTransparentSurfaceActive"

    /**
     * Переопределяет аттрибут градиента.
     */
    public infix fun String.overrideBy(gradient: List<ShaderBrush>) {
        _overrideMap[this] = gradient
    }
}

internal val LocalSddsSbComGradients: ProvidableCompositionLocal<SddsSbComGradients> =
    staticCompositionLocalOf {
        lightSddsSbComGradients()
    }

private fun MutableMap<String, List<ShaderBrush>>.add(
    attribute: String,
    defaultTokenValue: List<ShaderBrush>,
    overwriteMap: Map<String, List<ShaderBrush>>,
) {
    this[attribute] = overwriteMap[attribute] ?: defaultTokenValue
}

/**
 * Градиенты [SddsSbComGradients] для светлой темы
 */
@Suppress("LongMethod")
public fun lightSddsSbComGradients(overrideGradients: GradientOverrideScope.() -> Unit = {}): SddsSbComGradients {
    val gradientOverrideScope = GradientOverrideScope()
    overrideGradients.invoke(gradientOverrideScope)
    val overwrite = gradientOverrideScope.overrideMap
    val initial = mutableMapOf<String, List<ShaderBrush>>()
    initial.add(
        "surfaceOnDarkAccentGradientBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkAccentGradientBrightness.colors,
                LightGradientTokens.SurfaceOnDarkAccentGradientBrightness.positions,
                LightGradientTokens.SurfaceOnDarkAccentGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSurfaceBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkTransparentSurfaceBrightness.colors,
                LightGradientTokens.OutlineOnDarkTransparentSurfaceBrightness.positions,
                LightGradientTokens.OutlineOnDarkTransparentSurfaceBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultAccentGradientBrightness.colors,
                LightGradientTokens.SurfaceDefaultAccentGradientBrightness.positions,
                LightGradientTokens.SurfaceDefaultAccentGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInversePinkSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInversePinkSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaInversePinkSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaInversePinkSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientAiBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradientAiBrightness.colors,
                LightGradientTokens.TextDefaultAccentGradientAiBrightness.positions,
                LightGradientTokens.TextDefaultAccentGradientAiBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightAccentGradientBrightness.colors,
                LightGradientTokens.SurfaceOnLightAccentGradientBrightness.positions,
                LightGradientTokens.SurfaceOnLightAccentGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultGreenSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultGreenSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaDefaultGreenSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaDefaultGreenSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientAiBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradientAiBrightness.colors,
                LightGradientTokens.TextOnDarkAccentGradientAiBrightness.positions,
                LightGradientTokens.TextOnDarkAccentGradientAiBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientAiBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradientAiBrightness.colors,
                LightGradientTokens.TextOnLightAccentGradientAiBrightness.positions,
                LightGradientTokens.TextOnLightAccentGradientAiBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseAccentGradientBrightness.colors,
                LightGradientTokens.SurfaceInverseAccentGradientBrightness.positions,
                LightGradientTokens.SurfaceInverseAccentGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientAiBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradientAiBrightness.colors,
                LightGradientTokens.TextInverseAccentGradientAiBrightness.positions,
                LightGradientTokens.TextInverseAccentGradientAiBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnLightGradientBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnLightGradientBrightness.colors,
                LightGradientTokens.OverlayOnLightGradientBrightness.positions,
                LightGradientTokens.OverlayOnLightGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSurfaceBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentSurfaceBrightness.colors,
                LightGradientTokens.OutlineDefaultTransparentSurfaceBrightness.positions,
                LightGradientTokens.OutlineDefaultTransparentSurfaceBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayDefaultGradientBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayDefaultGradientBrightness.colors,
                LightGradientTokens.OverlayDefaultGradientBrightness.positions,
                LightGradientTokens.OverlayDefaultGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnDarkGradientBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnDarkGradientBrightness.colors,
                LightGradientTokens.OverlayOnDarkGradientBrightness.positions,
                LightGradientTokens.OverlayOnDarkGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayInverseGradientBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayInverseGradientBrightness.colors,
                LightGradientTokens.OverlayInverseGradientBrightness.positions,
                LightGradientTokens.OverlayInverseGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSurfaceBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightTransparentSurfaceBrightness.colors,
                LightGradientTokens.OutlineOnLightTransparentSurfaceBrightness.positions,
                LightGradientTokens.OutlineOnLightTransparentSurfaceBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightBlueSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnLightBlueSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnLightBlueSurfaceAccentGradient.angle,
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
        "surfaceDefaultSkeletonGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonGradientHover.colors,
                LightGradientTokens.SurfaceDefaultSkeletonGradientHover.positions,
                LightGradientTokens.SurfaceDefaultSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonGradientActive.colors,
                LightGradientTokens.SurfaceDefaultSkeletonGradientActive.positions,
                LightGradientTokens.SurfaceDefaultSkeletonGradientActive.angle,
            ),
        ),
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
        "surfaceDefaultSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.colors,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.positions,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkAccentGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkAccentGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.colors,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.positions,
                LightGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkAccentGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkAccentGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkAccentGradientActive.angle,
            ),
        ),
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
        "surfaceOnDarkSkeletonGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonGradientActive.angle,
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
        "surfaceOnDarkSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.colors,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.positions,
                LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightAccentGradientActive.colors,
                LightGradientTokens.SurfaceOnLightAccentGradientActive.positions,
                LightGradientTokens.SurfaceOnLightAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.colors,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.positions,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.colors,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.positions,
                LightGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseAccentGradientHover.colors,
                LightGradientTokens.SurfaceInverseAccentGradientHover.positions,
                LightGradientTokens.SurfaceInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseAccentGradientActive.colors,
                LightGradientTokens.SurfaceInverseAccentGradientActive.positions,
                LightGradientTokens.SurfaceInverseAccentGradientActive.angle,
            ),
        ),
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
        "surfaceInverseSkeletonGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonGradientHover.colors,
                LightGradientTokens.SurfaceInverseSkeletonGradientHover.positions,
                LightGradientTokens.SurfaceInverseSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonGradientActive.colors,
                LightGradientTokens.SurfaceInverseSkeletonGradientActive.positions,
                LightGradientTokens.SurfaceInverseSkeletonGradientActive.angle,
            ),
        ),
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
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonGradientActive.colors,
                LightGradientTokens.SurfaceOnLightSkeletonGradientActive.positions,
                LightGradientTokens.SurfaceOnLightSkeletonGradientActive.angle,
            ),
        ),
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
        "outlineOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkAccentGradientHover.colors,
                LightGradientTokens.OutlineOnDarkAccentGradientHover.positions,
                LightGradientTokens.OutlineOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkAccentGradientActive.colors,
                LightGradientTokens.OutlineOnDarkAccentGradientActive.positions,
                LightGradientTokens.OutlineOnDarkAccentGradientActive.angle,
            ),
        ),
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
        "surfaceInverseSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientActive.colors,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientActive.positions,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultAccentGradientHover.colors,
                LightGradientTokens.OutlineDefaultAccentGradientHover.positions,
                LightGradientTokens.OutlineDefaultAccentGradientHover.angle,
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
        "outlineInverseAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseAccentGradientHover.colors,
                LightGradientTokens.OutlineInverseAccentGradientHover.positions,
                LightGradientTokens.OutlineInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseAccentGradientActive.colors,
                LightGradientTokens.OutlineInverseAccentGradientActive.positions,
                LightGradientTokens.OutlineInverseAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightAccentGradientActive.colors,
                LightGradientTokens.OutlineOnLightAccentGradientActive.positions,
                LightGradientTokens.OutlineOnLightAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultBlueSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaDefaultBlueSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaDefaultBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultGreenSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultGreenSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaDefaultGreenSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaDefaultGreenSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultGreenSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultGreenSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaDefaultGreenSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaDefaultGreenSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultIndigoSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultIndigoSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaDefaultIndigoSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaDefaultIndigoSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultIndigoSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOchreSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultOchreSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaDefaultOchreSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaDefaultOchreSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOchreSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultOchreSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaDefaultOchreSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaDefaultOchreSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOliveSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultOliveSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaDefaultOliveSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaDefaultOliveSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOliveSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultOliveSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaDefaultOliveSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaDefaultOliveSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOliveSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultOliveSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaDefaultOliveSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaDefaultOliveSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultPinkSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultPinkSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaDefaultPinkSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaDefaultPinkSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultPinkSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultPinkSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaDefaultPinkSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaDefaultPinkSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultPinkSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultPinkSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaDefaultPinkSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaDefaultPinkSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultBlueSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaDefaultBlueSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaDefaultBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultSeaBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultVioletSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultVioletSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaDefaultVioletSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaDefaultVioletSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultVioletSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultVioletSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaDefaultVioletSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaDefaultVioletSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultVioletSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultVioletSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaDefaultVioletSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaDefaultVioletSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseBlueSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaInverseBlueSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaInverseBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseBlueSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaInverseBlueSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaInverseBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseBlueSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaInverseBlueSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaInverseBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseGreenSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseGreenSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaInverseGreenSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaInverseGreenSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseGreenSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseGreenSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaInverseGreenSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaInverseGreenSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseGreenSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseGreenSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaInverseGreenSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaInverseGreenSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseIndigoSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseIndigoSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaInverseIndigoSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaInverseIndigoSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseIndigoSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseIndigoSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaInverseIndigoSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaInverseIndigoSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOchreSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseOchreSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaInverseOchreSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaInverseOchreSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOchreSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseOchreSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaInverseOchreSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaInverseOchreSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultSeaBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultSeaBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOliveSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseOliveSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaInverseOliveSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaInverseOliveSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInversePinkSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInversePinkSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaInversePinkSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaInversePinkSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInversePinkSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInversePinkSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaInversePinkSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaInversePinkSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseSeaBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseSeaBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseSeaBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseVioletSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseVioletSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaInverseVioletSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaInverseVioletSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseVioletSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseVioletSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaInverseVioletSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaInverseVioletSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseVioletSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseVioletSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaInverseVioletSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaInverseVioletSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkBlueSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnDarkBlueSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnDarkBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkGreenSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkGreenSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnDarkGreenSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnDarkGreenSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkGreenSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkGreenSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOliveSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseOliveSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaInverseOliveSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaInverseOliveSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOliveSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseOliveSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaInverseOliveSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaInverseOliveSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkIndigoSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOchreSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseOchreSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaInverseOchreSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaInverseOchreSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOchreSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOchreSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOliveSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkOliveSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnDarkOliveSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnDarkOliveSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOliveSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOliveSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkPinkSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkPinkSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnDarkPinkSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnDarkPinkSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkPinkSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkPinkSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkSeaBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkSeaBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkSeaBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkVioletSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkVioletSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnDarkVioletSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnDarkVioletSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkVioletSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkVioletSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkIndigoSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkIndigoSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightGreenSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightGreenSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnLightGreenSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnLightGreenSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightGreenSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightGreenSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnLightGreenSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnLightGreenSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightGreenSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightGreenSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnLightGreenSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnLightGreenSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightIndigoSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightIndigoSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnLightIndigoSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnLightIndigoSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightIndigoSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightIndigoSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOchreSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightOchreSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnLightOchreSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnLightOchreSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOchreSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightOchreSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnLightOchreSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnLightOchreSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOchreSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightOchreSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnLightOchreSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnLightOchreSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOchreSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnDarkOchreSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnDarkOchreSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnDarkOchreSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOliveSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightOliveSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnLightOliveSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnLightOliveSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightPinkSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightPinkSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnLightPinkSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnLightPinkSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightPinkSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightPinkSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnLightPinkSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnLightPinkSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightBlueSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnLightBlueSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnLightBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightVioletSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightVioletSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnLightVioletSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnLightVioletSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightVioletSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightVioletSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnLightVioletSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnLightVioletSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSurfaceActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkTransparentSurfaceActive.colors,
                LightGradientTokens.OutlineOnDarkTransparentSurfaceActive.positions,
                LightGradientTokens.OutlineOnDarkTransparentSurfaceActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSurface",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightTransparentSurface.colors,
                LightGradientTokens.OutlineOnLightTransparentSurface.positions,
                LightGradientTokens.OutlineOnLightTransparentSurface.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSurfaceHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightTransparentSurfaceHover.colors,
                LightGradientTokens.OutlineOnLightTransparentSurfaceHover.positions,
                LightGradientTokens.OutlineOnLightTransparentSurfaceHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSurfaceActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightTransparentSurfaceActive.colors,
                LightGradientTokens.OutlineOnLightTransparentSurfaceActive.positions,
                LightGradientTokens.OutlineOnLightTransparentSurfaceActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayInverseGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayInverseGradient.colors,
                LightGradientTokens.OverlayInverseGradient.positions,
                LightGradientTokens.OverlayInverseGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientAi",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradientAi.colors,
                LightGradientTokens.TextDefaultAccentGradientAi.positions,
                LightGradientTokens.TextDefaultAccentGradientAi.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientAiHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradientAiHover.colors,
                LightGradientTokens.TextDefaultAccentGradientAiHover.positions,
                LightGradientTokens.TextDefaultAccentGradientAiHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientAi",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradientAi.colors,
                LightGradientTokens.TextInverseAccentGradientAi.positions,
                LightGradientTokens.TextInverseAccentGradientAi.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientAiHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradientAiHover.colors,
                LightGradientTokens.TextInverseAccentGradientAiHover.positions,
                LightGradientTokens.TextInverseAccentGradientAiHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientAiActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradientAiActive.colors,
                LightGradientTokens.TextInverseAccentGradientAiActive.positions,
                LightGradientTokens.TextInverseAccentGradientAiActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientAi",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradientAi.colors,
                LightGradientTokens.TextOnDarkAccentGradientAi.positions,
                LightGradientTokens.TextOnDarkAccentGradientAi.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientAiHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradientAiHover.colors,
                LightGradientTokens.TextOnDarkAccentGradientAiHover.positions,
                LightGradientTokens.TextOnDarkAccentGradientAiHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientAiActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradientAiActive.colors,
                LightGradientTokens.TextOnDarkAccentGradientAiActive.positions,
                LightGradientTokens.TextOnDarkAccentGradientAiActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientAi",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradientAi.colors,
                LightGradientTokens.TextOnLightAccentGradientAi.positions,
                LightGradientTokens.TextOnLightAccentGradientAi.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientAiHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradientAiHover.colors,
                LightGradientTokens.TextOnLightAccentGradientAiHover.positions,
                LightGradientTokens.TextOnLightAccentGradientAiHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientAiActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradientAiActive.colors,
                LightGradientTokens.TextOnLightAccentGradientAiActive.positions,
                LightGradientTokens.TextOnLightAccentGradientAiActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientAiActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradientAiActive.colors,
                LightGradientTokens.TextDefaultAccentGradientAiActive.positions,
                LightGradientTokens.TextDefaultAccentGradientAiActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSurface",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkTransparentSurface.colors,
                LightGradientTokens.OutlineOnDarkTransparentSurface.positions,
                LightGradientTokens.OutlineOnDarkTransparentSurface.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSurfaceHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnDarkTransparentSurfaceHover.colors,
                LightGradientTokens.OutlineOnDarkTransparentSurfaceHover.positions,
                LightGradientTokens.OutlineOnDarkTransparentSurfaceHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOliveSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightOliveSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnLightOliveSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnLightOliveSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnLightGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnLightGradientActive.colors,
                LightGradientTokens.OverlayOnLightGradientActive.positions,
                LightGradientTokens.OverlayOnLightGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSurface",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentSurface.colors,
                LightGradientTokens.OutlineDefaultTransparentSurface.positions,
                LightGradientTokens.OutlineDefaultTransparentSurface.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSurfaceHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentSurfaceHover.colors,
                LightGradientTokens.OutlineDefaultTransparentSurfaceHover.positions,
                LightGradientTokens.OutlineDefaultTransparentSurfaceHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSurfaceActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentSurfaceActive.colors,
                LightGradientTokens.OutlineDefaultTransparentSurfaceActive.positions,
                LightGradientTokens.OutlineDefaultTransparentSurfaceActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayDefaultGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayDefaultGradient.colors,
                LightGradientTokens.OverlayDefaultGradient.positions,
                LightGradientTokens.OverlayDefaultGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayDefaultGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayDefaultGradientHover.colors,
                LightGradientTokens.OverlayDefaultGradientHover.positions,
                LightGradientTokens.OverlayDefaultGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayDefaultGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayDefaultGradientActive.colors,
                LightGradientTokens.OverlayDefaultGradientActive.positions,
                LightGradientTokens.OverlayDefaultGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnDarkGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnDarkGradient.colors,
                LightGradientTokens.OverlayOnDarkGradient.positions,
                LightGradientTokens.OverlayOnDarkGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnDarkGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnDarkGradientHover.colors,
                LightGradientTokens.OverlayOnDarkGradientHover.positions,
                LightGradientTokens.OverlayOnDarkGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnDarkGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnDarkGradientActive.colors,
                LightGradientTokens.OverlayOnDarkGradientActive.positions,
                LightGradientTokens.OverlayOnDarkGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayInverseGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayInverseGradientActive.colors,
                LightGradientTokens.OverlayInverseGradientActive.positions,
                LightGradientTokens.OverlayInverseGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayInverseGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayInverseGradientHover.colors,
                LightGradientTokens.OverlayInverseGradientHover.positions,
                LightGradientTokens.OverlayInverseGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnLightGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnLightGradient.colors,
                LightGradientTokens.OverlayOnLightGradient.positions,
                LightGradientTokens.OverlayOnLightGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightPinkSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightPinkSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnLightPinkSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnLightPinkSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightSeaBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnLightGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnLightGradientHover.colors,
                LightGradientTokens.OverlayOnLightGradientHover.positions,
                LightGradientTokens.OverlayOnLightGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOliveSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightOliveSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnLightOliveSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnLightOliveSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightSeaBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientHover.colors,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientHover.positions,
                LightGradientTokens.SurfaceInverseSkeletonDeepGradientHover.angle,
            ),
        ),
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
        "outlineOnLightAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineOnLightAccentGradientHover.colors,
                LightGradientTokens.OutlineOnLightAccentGradientHover.positions,
                LightGradientTokens.OutlineOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseIndigoSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaInverseIndigoSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaInverseIndigoSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaInverseIndigoSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightSeaBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradient.colors,
                LightGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradient.positions,
                LightGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultAccentGradientActive.colors,
                LightGradientTokens.OutlineDefaultAccentGradientActive.positions,
                LightGradientTokens.OutlineDefaultAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightVioletSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightVioletSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaOnLightVioletSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaOnLightVioletSurfaceAccentGradientHover.angle,
            ),
        ),
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
        "surfaceDefaultAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultAccentGradientHover.colors,
                LightGradientTokens.SurfaceDefaultAccentGradientHover.positions,
                LightGradientTokens.SurfaceDefaultAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultAccentGradientActive.colors,
                LightGradientTokens.SurfaceDefaultAccentGradientActive.positions,
                LightGradientTokens.SurfaceDefaultAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaOnLightBlueSurfaceAccentGradientActive.colors,
                LightGradientTokens.PersonaOnLightBlueSurfaceAccentGradientActive.positions,
                LightGradientTokens.PersonaOnLightBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOchreSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultOchreSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaDefaultOchreSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaDefaultOchreSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightSkeletonGradientHover.colors,
                LightGradientTokens.SurfaceOnLightSkeletonGradientHover.positions,
                LightGradientTokens.SurfaceOnLightSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightAccentGradientHover.colors,
                LightGradientTokens.SurfaceOnLightAccentGradientHover.positions,
                LightGradientTokens.SurfaceOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultIndigoSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.PersonaDefaultBlueSurfaceAccentGradientHover.colors,
                LightGradientTokens.PersonaDefaultBlueSurfaceAccentGradientHover.positions,
                LightGradientTokens.PersonaDefaultBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSurfaceBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentSurfaceBrightness.colors,
                DarkGradientTokens.OutlineInverseTransparentSurfaceBrightness.positions,
                DarkGradientTokens.OutlineInverseTransparentSurfaceBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSurface",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentSurface.colors,
                DarkGradientTokens.OutlineInverseTransparentSurface.positions,
                DarkGradientTokens.OutlineInverseTransparentSurface.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSurfaceHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentSurfaceHover.colors,
                DarkGradientTokens.OutlineInverseTransparentSurfaceHover.positions,
                DarkGradientTokens.OutlineInverseTransparentSurfaceHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSurfaceActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentSurfaceActive.colors,
                DarkGradientTokens.OutlineInverseTransparentSurfaceActive.positions,
                DarkGradientTokens.OutlineInverseTransparentSurfaceActive.angle,
            ),
        ),
        overwrite,
    )
    return SddsSbComGradients(initial)
}

/**
 * Градиенты [SddsSbComGradients] для темной темы
 */
@Suppress("LongMethod")
public fun darkSddsSbComGradients(overrideGradients: GradientOverrideScope.() -> Unit = {}): SddsSbComGradients {
    val gradientOverrideScope = GradientOverrideScope()
    overrideGradients.invoke(gradientOverrideScope)
    val overwrite = gradientOverrideScope.overrideMap
    val initial = mutableMapOf<String, List<ShaderBrush>>()
    initial.add(
        "surfaceOnDarkAccentGradientBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkAccentGradientBrightness.colors,
                DarkGradientTokens.SurfaceOnDarkAccentGradientBrightness.positions,
                DarkGradientTokens.SurfaceOnDarkAccentGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSurfaceBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkTransparentSurfaceBrightness.colors,
                DarkGradientTokens.OutlineOnDarkTransparentSurfaceBrightness.positions,
                DarkGradientTokens.OutlineOnDarkTransparentSurfaceBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultAccentGradientBrightness.colors,
                DarkGradientTokens.SurfaceDefaultAccentGradientBrightness.positions,
                DarkGradientTokens.SurfaceDefaultAccentGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInversePinkSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInversePinkSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaInversePinkSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaInversePinkSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientAiBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradientAiBrightness.colors,
                DarkGradientTokens.TextDefaultAccentGradientAiBrightness.positions,
                DarkGradientTokens.TextDefaultAccentGradientAiBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightAccentGradientBrightness.colors,
                DarkGradientTokens.SurfaceOnLightAccentGradientBrightness.positions,
                DarkGradientTokens.SurfaceOnLightAccentGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultGreenSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultGreenSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaDefaultGreenSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaDefaultGreenSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientAiBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradientAiBrightness.colors,
                DarkGradientTokens.TextOnDarkAccentGradientAiBrightness.positions,
                DarkGradientTokens.TextOnDarkAccentGradientAiBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientAiBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradientAiBrightness.colors,
                DarkGradientTokens.TextOnLightAccentGradientAiBrightness.positions,
                DarkGradientTokens.TextOnLightAccentGradientAiBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseAccentGradientBrightness.colors,
                DarkGradientTokens.SurfaceInverseAccentGradientBrightness.positions,
                DarkGradientTokens.SurfaceInverseAccentGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientAiBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradientAiBrightness.colors,
                DarkGradientTokens.TextInverseAccentGradientAiBrightness.positions,
                DarkGradientTokens.TextInverseAccentGradientAiBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnLightGradientBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.OverlayOnLightGradientBrightness.colors,
                DarkGradientTokens.OverlayOnLightGradientBrightness.positions,
                DarkGradientTokens.OverlayOnLightGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSurfaceBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentSurfaceBrightness.colors,
                LightGradientTokens.OutlineDefaultTransparentSurfaceBrightness.positions,
                LightGradientTokens.OutlineDefaultTransparentSurfaceBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayDefaultGradientBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayDefaultGradientBrightness.colors,
                LightGradientTokens.OverlayDefaultGradientBrightness.positions,
                LightGradientTokens.OverlayDefaultGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnDarkGradientBrightness",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnDarkGradientBrightness.colors,
                LightGradientTokens.OverlayOnDarkGradientBrightness.positions,
                LightGradientTokens.OverlayOnDarkGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayInverseGradientBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.OverlayInverseGradientBrightness.colors,
                DarkGradientTokens.OverlayInverseGradientBrightness.positions,
                DarkGradientTokens.OverlayInverseGradientBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSurfaceBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightTransparentSurfaceBrightness.colors,
                DarkGradientTokens.OutlineOnLightTransparentSurfaceBrightness.positions,
                DarkGradientTokens.OutlineOnLightTransparentSurfaceBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightBlueSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnLightBlueSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnLightBlueSurfaceAccentGradient.angle,
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
        "surfaceDefaultSkeletonGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonGradientActive.angle,
            ),
        ),
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
        "surfaceDefaultSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkAccentGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkAccentGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkAccentGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkAccentGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkAccentGradientActive.angle,
            ),
        ),
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
        "surfaceOnDarkSkeletonGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonGradientActive.angle,
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
        "surfaceOnDarkSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.colors,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.positions,
                DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightAccentGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightAccentGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseAccentGradientHover.colors,
                DarkGradientTokens.SurfaceInverseAccentGradientHover.positions,
                DarkGradientTokens.SurfaceInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseAccentGradientActive.colors,
                DarkGradientTokens.SurfaceInverseAccentGradientActive.positions,
                DarkGradientTokens.SurfaceInverseAccentGradientActive.angle,
            ),
        ),
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
        "surfaceInverseSkeletonGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonGradientHover.colors,
                DarkGradientTokens.SurfaceInverseSkeletonGradientHover.positions,
                DarkGradientTokens.SurfaceInverseSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonGradientActive.colors,
                DarkGradientTokens.SurfaceInverseSkeletonGradientActive.positions,
                DarkGradientTokens.SurfaceInverseSkeletonGradientActive.angle,
            ),
        ),
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
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonGradientActive.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonGradientActive.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonGradientActive.angle,
            ),
        ),
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
        "outlineOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkAccentGradientHover.colors,
                DarkGradientTokens.OutlineOnDarkAccentGradientHover.positions,
                DarkGradientTokens.OutlineOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkAccentGradientActive.colors,
                DarkGradientTokens.OutlineOnDarkAccentGradientActive.positions,
                DarkGradientTokens.OutlineOnDarkAccentGradientActive.angle,
            ),
        ),
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
        "surfaceInverseSkeletonDeepGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientActive.colors,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientActive.positions,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultAccentGradientHover.colors,
                DarkGradientTokens.OutlineDefaultAccentGradientHover.positions,
                DarkGradientTokens.OutlineDefaultAccentGradientHover.angle,
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
        "outlineInverseAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseAccentGradientHover.colors,
                DarkGradientTokens.OutlineInverseAccentGradientHover.positions,
                DarkGradientTokens.OutlineInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseAccentGradientActive.colors,
                DarkGradientTokens.OutlineInverseAccentGradientActive.positions,
                DarkGradientTokens.OutlineInverseAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightAccentGradientActive.colors,
                DarkGradientTokens.OutlineOnLightAccentGradientActive.positions,
                DarkGradientTokens.OutlineOnLightAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultBlueSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaDefaultBlueSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaDefaultBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultGreenSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultGreenSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaDefaultGreenSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaDefaultGreenSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultGreenSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultGreenSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaDefaultGreenSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaDefaultGreenSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultIndigoSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultIndigoSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaDefaultIndigoSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaDefaultIndigoSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultIndigoSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOchreSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultOchreSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaDefaultOchreSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaDefaultOchreSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOchreSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultOchreSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaDefaultOchreSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaDefaultOchreSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOliveSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultOliveSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaDefaultOliveSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaDefaultOliveSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOliveSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultOliveSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaDefaultOliveSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaDefaultOliveSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOliveSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultOliveSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaDefaultOliveSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaDefaultOliveSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultPinkSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultPinkSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaDefaultPinkSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaDefaultPinkSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultPinkSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultPinkSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaDefaultPinkSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaDefaultPinkSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultPinkSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultPinkSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaDefaultPinkSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaDefaultPinkSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultBlueSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaDefaultBlueSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaDefaultBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultSeaBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultVioletSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultVioletSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaDefaultVioletSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaDefaultVioletSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultVioletSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultVioletSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaDefaultVioletSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaDefaultVioletSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultVioletSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultVioletSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaDefaultVioletSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaDefaultVioletSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseBlueSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaInverseBlueSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaInverseBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseBlueSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaInverseBlueSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaInverseBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseBlueSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaInverseBlueSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaInverseBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseGreenSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseGreenSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaInverseGreenSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaInverseGreenSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseGreenSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseGreenSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaInverseGreenSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaInverseGreenSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseGreenSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseGreenSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaInverseGreenSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaInverseGreenSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseIndigoSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseIndigoSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaInverseIndigoSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaInverseIndigoSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseIndigoSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseIndigoSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaInverseIndigoSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaInverseIndigoSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOchreSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseOchreSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaInverseOchreSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaInverseOchreSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOchreSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseOchreSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaInverseOchreSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaInverseOchreSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultSeaBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultSeaBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaDefaultSeaBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOliveSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseOliveSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaInverseOliveSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaInverseOliveSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInversePinkSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInversePinkSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaInversePinkSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaInversePinkSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInversePinkSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInversePinkSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaInversePinkSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaInversePinkSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseSeaBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseSeaBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseSeaBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaInverseSeaBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseVioletSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseVioletSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaInverseVioletSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaInverseVioletSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseVioletSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseVioletSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaInverseVioletSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaInverseVioletSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseVioletSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseVioletSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaInverseVioletSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaInverseVioletSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkBlueSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnDarkBlueSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnDarkBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnDarkBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkGreenSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkGreenSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnDarkGreenSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnDarkGreenSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkGreenSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkGreenSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnDarkGreenSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOliveSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseOliveSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaInverseOliveSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaInverseOliveSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOliveSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseOliveSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaInverseOliveSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaInverseOliveSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkIndigoSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseOchreSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseOchreSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaInverseOchreSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaInverseOchreSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOchreSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOchreSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnDarkOchreSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOliveSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkOliveSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnDarkOliveSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnDarkOliveSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOliveSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOliveSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnDarkOliveSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkPinkSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkPinkSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnDarkPinkSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnDarkPinkSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkPinkSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkPinkSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnDarkPinkSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkSeaBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkSeaBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkSeaBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnDarkSeaBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkVioletSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkVioletSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnDarkVioletSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnDarkVioletSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkVioletSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkVioletSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnDarkVioletSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkIndigoSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkIndigoSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnDarkIndigoSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightGreenSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightGreenSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnLightGreenSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnLightGreenSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightGreenSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightGreenSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnLightGreenSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnLightGreenSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightGreenSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightGreenSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnLightGreenSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnLightGreenSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightIndigoSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightIndigoSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnLightIndigoSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnLightIndigoSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightIndigoSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightIndigoSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnLightIndigoSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOchreSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightOchreSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnLightOchreSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnLightOchreSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOchreSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightOchreSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnLightOchreSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnLightOchreSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOchreSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightOchreSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnLightOchreSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnLightOchreSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnDarkOchreSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnDarkOchreSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnDarkOchreSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnDarkOchreSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOliveSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightOliveSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnLightOliveSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnLightOliveSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightPinkSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightPinkSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnLightPinkSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnLightPinkSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightPinkSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightPinkSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnLightPinkSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnLightPinkSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightBlueSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnLightBlueSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnLightBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightVioletSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightVioletSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnLightVioletSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnLightVioletSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightVioletSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightVioletSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnLightVioletSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnLightVioletSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSurfaceActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkTransparentSurfaceActive.colors,
                DarkGradientTokens.OutlineOnDarkTransparentSurfaceActive.positions,
                DarkGradientTokens.OutlineOnDarkTransparentSurfaceActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSurface",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightTransparentSurface.colors,
                DarkGradientTokens.OutlineOnLightTransparentSurface.positions,
                DarkGradientTokens.OutlineOnLightTransparentSurface.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSurfaceHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightTransparentSurfaceHover.colors,
                DarkGradientTokens.OutlineOnLightTransparentSurfaceHover.positions,
                DarkGradientTokens.OutlineOnLightTransparentSurfaceHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSurfaceActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightTransparentSurfaceActive.colors,
                DarkGradientTokens.OutlineOnLightTransparentSurfaceActive.positions,
                DarkGradientTokens.OutlineOnLightTransparentSurfaceActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayInverseGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OverlayInverseGradient.colors,
                DarkGradientTokens.OverlayInverseGradient.positions,
                DarkGradientTokens.OverlayInverseGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientAi",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradientAi.colors,
                DarkGradientTokens.TextDefaultAccentGradientAi.positions,
                DarkGradientTokens.TextDefaultAccentGradientAi.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientAiHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradientAiHover.colors,
                DarkGradientTokens.TextDefaultAccentGradientAiHover.positions,
                DarkGradientTokens.TextDefaultAccentGradientAiHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientAi",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradientAi.colors,
                DarkGradientTokens.TextInverseAccentGradientAi.positions,
                DarkGradientTokens.TextInverseAccentGradientAi.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientAiHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradientAiHover.colors,
                DarkGradientTokens.TextInverseAccentGradientAiHover.positions,
                DarkGradientTokens.TextInverseAccentGradientAiHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientAiActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradientAiActive.colors,
                DarkGradientTokens.TextInverseAccentGradientAiActive.positions,
                DarkGradientTokens.TextInverseAccentGradientAiActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientAi",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradientAi.colors,
                DarkGradientTokens.TextOnDarkAccentGradientAi.positions,
                DarkGradientTokens.TextOnDarkAccentGradientAi.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientAiHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradientAiHover.colors,
                DarkGradientTokens.TextOnDarkAccentGradientAiHover.positions,
                DarkGradientTokens.TextOnDarkAccentGradientAiHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientAiActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradientAiActive.colors,
                DarkGradientTokens.TextOnDarkAccentGradientAiActive.positions,
                DarkGradientTokens.TextOnDarkAccentGradientAiActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientAi",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradientAi.colors,
                DarkGradientTokens.TextOnLightAccentGradientAi.positions,
                DarkGradientTokens.TextOnLightAccentGradientAi.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientAiHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradientAiHover.colors,
                DarkGradientTokens.TextOnLightAccentGradientAiHover.positions,
                DarkGradientTokens.TextOnLightAccentGradientAiHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientAiActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradientAiActive.colors,
                DarkGradientTokens.TextOnLightAccentGradientAiActive.positions,
                DarkGradientTokens.TextOnLightAccentGradientAiActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientAiActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradientAiActive.colors,
                DarkGradientTokens.TextDefaultAccentGradientAiActive.positions,
                DarkGradientTokens.TextDefaultAccentGradientAiActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSurface",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkTransparentSurface.colors,
                DarkGradientTokens.OutlineOnDarkTransparentSurface.positions,
                DarkGradientTokens.OutlineOnDarkTransparentSurface.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSurfaceHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnDarkTransparentSurfaceHover.colors,
                DarkGradientTokens.OutlineOnDarkTransparentSurfaceHover.positions,
                DarkGradientTokens.OutlineOnDarkTransparentSurfaceHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOliveSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightOliveSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnLightOliveSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnLightOliveSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnLightGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OverlayOnLightGradientActive.colors,
                DarkGradientTokens.OverlayOnLightGradientActive.positions,
                DarkGradientTokens.OverlayOnLightGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSurface",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentSurface.colors,
                LightGradientTokens.OutlineDefaultTransparentSurface.positions,
                LightGradientTokens.OutlineDefaultTransparentSurface.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSurfaceHover",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentSurfaceHover.colors,
                LightGradientTokens.OutlineDefaultTransparentSurfaceHover.positions,
                LightGradientTokens.OutlineDefaultTransparentSurfaceHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSurfaceActive",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineDefaultTransparentSurfaceActive.colors,
                LightGradientTokens.OutlineDefaultTransparentSurfaceActive.positions,
                LightGradientTokens.OutlineDefaultTransparentSurfaceActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayDefaultGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayDefaultGradient.colors,
                LightGradientTokens.OverlayDefaultGradient.positions,
                LightGradientTokens.OverlayDefaultGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayDefaultGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayDefaultGradientHover.colors,
                LightGradientTokens.OverlayDefaultGradientHover.positions,
                LightGradientTokens.OverlayDefaultGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayDefaultGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayDefaultGradientActive.colors,
                LightGradientTokens.OverlayDefaultGradientActive.positions,
                LightGradientTokens.OverlayDefaultGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnDarkGradient",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnDarkGradient.colors,
                LightGradientTokens.OverlayOnDarkGradient.positions,
                LightGradientTokens.OverlayOnDarkGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnDarkGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnDarkGradientHover.colors,
                LightGradientTokens.OverlayOnDarkGradientHover.positions,
                LightGradientTokens.OverlayOnDarkGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnDarkGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.OverlayOnDarkGradientActive.colors,
                LightGradientTokens.OverlayOnDarkGradientActive.positions,
                LightGradientTokens.OverlayOnDarkGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayInverseGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OverlayInverseGradientActive.colors,
                DarkGradientTokens.OverlayInverseGradientActive.positions,
                DarkGradientTokens.OverlayInverseGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayInverseGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OverlayInverseGradientHover.colors,
                DarkGradientTokens.OverlayInverseGradientHover.positions,
                DarkGradientTokens.OverlayInverseGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnLightGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OverlayOnLightGradient.colors,
                DarkGradientTokens.OverlayOnLightGradient.positions,
                DarkGradientTokens.OverlayOnLightGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightPinkSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightPinkSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnLightPinkSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnLightPinkSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightSeaBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnLightGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OverlayOnLightGradientHover.colors,
                DarkGradientTokens.OverlayOnLightGradientHover.positions,
                DarkGradientTokens.OverlayOnLightGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightOliveSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightOliveSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnLightOliveSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnLightOliveSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightSeaBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseSkeletonDeepGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientHover.colors,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientHover.positions,
                DarkGradientTokens.SurfaceInverseSkeletonDeepGradientHover.angle,
            ),
        ),
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
        "outlineOnLightAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineOnLightAccentGradientHover.colors,
                DarkGradientTokens.OutlineOnLightAccentGradientHover.positions,
                DarkGradientTokens.OutlineOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaInverseIndigoSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaInverseIndigoSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaInverseIndigoSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaInverseIndigoSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightSeaBlueSurfaceAccentGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradient.colors,
                DarkGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradient.positions,
                DarkGradientTokens.PersonaOnLightSeaBlueSurfaceAccentGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultAccentGradientActive.colors,
                DarkGradientTokens.OutlineDefaultAccentGradientActive.positions,
                DarkGradientTokens.OutlineDefaultAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightVioletSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightVioletSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaOnLightVioletSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaOnLightVioletSurfaceAccentGradientHover.angle,
            ),
        ),
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
        "surfaceDefaultAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultAccentGradientHover.colors,
                DarkGradientTokens.SurfaceDefaultAccentGradientHover.positions,
                DarkGradientTokens.SurfaceDefaultAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultAccentGradientActive.colors,
                DarkGradientTokens.SurfaceDefaultAccentGradientActive.positions,
                DarkGradientTokens.SurfaceDefaultAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaOnLightBlueSurfaceAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaOnLightBlueSurfaceAccentGradientActive.colors,
                DarkGradientTokens.PersonaOnLightBlueSurfaceAccentGradientActive.positions,
                DarkGradientTokens.PersonaOnLightBlueSurfaceAccentGradientActive.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultOchreSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultOchreSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaDefaultOchreSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaDefaultOchreSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightSkeletonGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightSkeletonGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightSkeletonGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightSkeletonGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightAccentGradientHover.colors,
                DarkGradientTokens.SurfaceOnLightAccentGradientHover.positions,
                DarkGradientTokens.SurfaceOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultIndigoSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaDefaultIndigoSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "personaDefaultBlueSurfaceAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.PersonaDefaultBlueSurfaceAccentGradientHover.colors,
                DarkGradientTokens.PersonaDefaultBlueSurfaceAccentGradientHover.positions,
                DarkGradientTokens.PersonaDefaultBlueSurfaceAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSurfaceBrightness",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentSurfaceBrightness.colors,
                DarkGradientTokens.OutlineInverseTransparentSurfaceBrightness.positions,
                DarkGradientTokens.OutlineInverseTransparentSurfaceBrightness.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSurface",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentSurface.colors,
                DarkGradientTokens.OutlineInverseTransparentSurface.positions,
                DarkGradientTokens.OutlineInverseTransparentSurface.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSurfaceHover",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentSurfaceHover.colors,
                DarkGradientTokens.OutlineInverseTransparentSurfaceHover.positions,
                DarkGradientTokens.OutlineInverseTransparentSurfaceHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSurfaceActive",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineInverseTransparentSurfaceActive.colors,
                DarkGradientTokens.OutlineInverseTransparentSurfaceActive.positions,
                DarkGradientTokens.OutlineInverseTransparentSurfaceActive.angle,
            ),
        ),
        overwrite,
    )
    return SddsSbComGradients(initial)
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
