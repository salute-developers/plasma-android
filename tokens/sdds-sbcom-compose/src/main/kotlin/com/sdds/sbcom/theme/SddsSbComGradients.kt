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
    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * light text default textAccentGradientAiHover
     */
    public val textDefaultAccentGradientAiHover: List<ShaderBrush> by gradients

    /**
     * light text default textAccentGradientAiActive
     */
    public val textDefaultAccentGradientAiActive: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradient: List<ShaderBrush> by gradients

    /**
     * light text default textAccentGradientAi
     */
    public val textDefaultAccentGradientAi: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * light text onDark textAccentGradientAiHover
     */
    public val textOnDarkAccentGradientAiHover: List<ShaderBrush> by gradients

    /**
     * light text onDark textAccentGradientAiActive
     */
    public val textOnDarkAccentGradientAiActive: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradient: List<ShaderBrush> by gradients

    /**
     * light text onDark textAccentGradientAi
     */
    public val textOnDarkAccentGradientAi: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * light text onLight textAccentGradientAiHover
     */
    public val textOnLightAccentGradientAiHover: List<ShaderBrush> by gradients

    /**
     * light text onLight textAccentGradientAiActive
     */
    public val textOnLightAccentGradientAiActive: List<ShaderBrush> by gradients

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradient: List<ShaderBrush> by gradients

    /**
     * light text onLight textAccentGradientAi
     */
    public val textOnLightAccentGradientAi: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradientHover: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradientActive: List<ShaderBrush> by gradients

    /**
     * light text inverse textAccentGradientAiHover
     */
    public val textInverseAccentGradientAiHover: List<ShaderBrush> by gradients

    /**
     * light text inverse textAccentGradientAiActive
     */
    public val textInverseAccentGradientAiActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradient: List<ShaderBrush> by gradients

    /**
     * light text inverse textAccentGradientAi
     */
    public val textInverseAccentGradientAi: List<ShaderBrush> by gradients

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCard: List<ShaderBrush> by gradients

    /**
     * light surface default surfaceTransparentNavi
     */
    public val surfaceDefaultTransparentNavi: List<ShaderBrush> by gradients

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
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * light surface onDark surfaceTransparentNavi
     */
    public val surfaceOnDarkTransparentNavi: List<ShaderBrush> by gradients

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCard: List<ShaderBrush> by gradients

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
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCard: List<ShaderBrush> by gradients

    /**
     * light surface onLight surfaceTransparentNavi
     */
    public val surfaceOnLightTransparentNavi: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradient: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientHover: List<ShaderBrush> by gradients

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientActive: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradient: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCard: List<ShaderBrush> by gradients

    /**
     * light surface inverse surfaceTransparentNavi
     */
    public val surfaceInverseTransparentNavi: List<ShaderBrush> by gradients

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
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * light background default backgroundGradient
     */
    public val backgroundDefaultGradient: List<ShaderBrush> by gradients

    /**
     * light background dark backgroundGradient
     */
    public val backgroundDarkGradient: List<ShaderBrush> by gradients

    /**
     * light background light backgroundGradient
     */
    public val backgroundLightGradient: List<ShaderBrush> by gradients

    /**
     * light background inverse backgroundGradient
     */
    public val backgroundInverseGradient: List<ShaderBrush> by gradients

    /**
     * light overlay default overlayGradient
     */
    public val overlayDefaultGradient: List<ShaderBrush> by gradients

    /**
     * light overlay onDark overlayGradient
     */
    public val overlayOnDarkGradient: List<ShaderBrush> by gradients

    /**
     * light overlay onLight overlayGradient
     */
    public val overlayOnLightGradient: List<ShaderBrush> by gradients

    /**
     * light overlay inverse overlayGradient
     */
    public val overlayInverseGradient: List<ShaderBrush> by gradients

    /**
     * light outline default outlineTransparentSurface
     */
    public val outlineDefaultTransparentSurface: List<ShaderBrush> by gradients

    /**
     * light outline onDark outlineTransparentSurface
     */
    public val outlineOnDarkTransparentSurface: List<ShaderBrush> by gradients

    /**
     * light outline onLight outlineTransparentSurface
     */
    public val outlineOnLightTransparentSurface: List<ShaderBrush> by gradients

    /**
     * light outline inverse outlineTransparentSurface
     */
    public val outlineInverseTransparentSurface: List<ShaderBrush> by gradients

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

    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradientHover: String = "textDefaultAccentGradientHover"

    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradientActive: String = "textDefaultAccentGradientActive"

    /**
     * light text default textAccentGradientAiHover
     */
    public val textDefaultAccentGradientAiHover: String = "textDefaultAccentGradientAiHover"

    /**
     * light text default textAccentGradientAiActive
     */
    public val textDefaultAccentGradientAiActive: String = "textDefaultAccentGradientAiActive"

    /**
     * Акцентный цвет с градиентом
     */
    public val textDefaultAccentGradient: String = "textDefaultAccentGradient"

    /**
     * light text default textAccentGradientAi
     */
    public val textDefaultAccentGradientAi: String = "textDefaultAccentGradientAi"

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradientHover: String = "textOnDarkAccentGradientHover"

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradientActive: String = "textOnDarkAccentGradientActive"

    /**
     * light text onDark textAccentGradientAiHover
     */
    public val textOnDarkAccentGradientAiHover: String = "textOnDarkAccentGradientAiHover"

    /**
     * light text onDark textAccentGradientAiActive
     */
    public val textOnDarkAccentGradientAiActive: String = "textOnDarkAccentGradientAiActive"

    /**
     * Акцентный цвет с градиентом на темном фоне
     */
    public val textOnDarkAccentGradient: String = "textOnDarkAccentGradient"

    /**
     * light text onDark textAccentGradientAi
     */
    public val textOnDarkAccentGradientAi: String = "textOnDarkAccentGradientAi"

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradientHover: String = "textOnLightAccentGradientHover"

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradientActive: String = "textOnLightAccentGradientActive"

    /**
     * light text onLight textAccentGradientAiHover
     */
    public val textOnLightAccentGradientAiHover: String = "textOnLightAccentGradientAiHover"

    /**
     * light text onLight textAccentGradientAiActive
     */
    public val textOnLightAccentGradientAiActive: String = "textOnLightAccentGradientAiActive"

    /**
     * Акцентный цвет с градиентом на светлом фоне
     */
    public val textOnLightAccentGradient: String = "textOnLightAccentGradient"

    /**
     * light text onLight textAccentGradientAi
     */
    public val textOnLightAccentGradientAi: String = "textOnLightAccentGradientAi"

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradientHover: String = "textInverseAccentGradientHover"

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradientActive: String = "textInverseAccentGradientActive"

    /**
     * light text inverse textAccentGradientAiHover
     */
    public val textInverseAccentGradientAiHover: String = "textInverseAccentGradientAiHover"

    /**
     * light text inverse textAccentGradientAiActive
     */
    public val textInverseAccentGradientAiActive: String = "textInverseAccentGradientAiActive"

    /**
     * Инвертированный акцентный цвет с градиентом
     */
    public val textInverseAccentGradient: String = "textInverseAccentGradient"

    /**
     * light text inverse textAccentGradientAi
     */
    public val textInverseAccentGradientAi: String = "textInverseAccentGradientAi"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCard: String = "surfaceDefaultTransparentCard"

    /**
     * light surface default surfaceTransparentNavi
     */
    public val surfaceDefaultTransparentNavi: String = "surfaceDefaultTransparentNavi"

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
     * Яркий фон для скелетона
     */
    public val surfaceDefaultSkeletonDeepGradientActive: String =
        "surfaceDefaultSkeletonDeepGradientActive"

    /**
     * light surface onDark surfaceTransparentNavi
     */
    public val surfaceOnDarkTransparentNavi: String = "surfaceOnDarkTransparentNavi"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCard: String = "surfaceOnDarkTransparentCard"

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
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCard: String = "surfaceOnLightTransparentCard"

    /**
     * light surface onLight surfaceTransparentNavi
     */
    public val surfaceOnLightTransparentNavi: String = "surfaceOnLightTransparentNavi"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradient: String = "surfaceOnLightSkeletonGradient"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientHover: String = "surfaceOnLightSkeletonGradientHover"

    /**
     * Фон для скелетона
     */
    public val surfaceOnLightSkeletonGradientActive: String = "surfaceOnLightSkeletonGradientActive"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradient: String = "surfaceOnLightSkeletonDeepGradient"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientHover: String =
        "surfaceOnLightSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceOnLightSkeletonDeepGradientActive: String =
        "surfaceOnLightSkeletonDeepGradientActive"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCard: String = "surfaceInverseTransparentCard"

    /**
     * light surface inverse surfaceTransparentNavi
     */
    public val surfaceInverseTransparentNavi: String = "surfaceInverseTransparentNavi"

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
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientHover: String =
        "surfaceInverseSkeletonDeepGradientHover"

    /**
     * Яркий фон для скелетона
     */
    public val surfaceInverseSkeletonDeepGradientActive: String =
        "surfaceInverseSkeletonDeepGradientActive"

    /**
     * light background default backgroundGradient
     */
    public val backgroundDefaultGradient: String = "backgroundDefaultGradient"

    /**
     * light background dark backgroundGradient
     */
    public val backgroundDarkGradient: String = "backgroundDarkGradient"

    /**
     * light background light backgroundGradient
     */
    public val backgroundLightGradient: String = "backgroundLightGradient"

    /**
     * light background inverse backgroundGradient
     */
    public val backgroundInverseGradient: String = "backgroundInverseGradient"

    /**
     * light overlay default overlayGradient
     */
    public val overlayDefaultGradient: String = "overlayDefaultGradient"

    /**
     * light overlay onDark overlayGradient
     */
    public val overlayOnDarkGradient: String = "overlayOnDarkGradient"

    /**
     * light overlay onLight overlayGradient
     */
    public val overlayOnLightGradient: String = "overlayOnLightGradient"

    /**
     * light overlay inverse overlayGradient
     */
    public val overlayInverseGradient: String = "overlayInverseGradient"

    /**
     * light outline default outlineTransparentSurface
     */
    public val outlineDefaultTransparentSurface: String = "outlineDefaultTransparentSurface"

    /**
     * light outline onDark outlineTransparentSurface
     */
    public val outlineOnDarkTransparentSurface: String = "outlineOnDarkTransparentSurface"

    /**
     * light outline onLight outlineTransparentSurface
     */
    public val outlineOnLightTransparentSurface: String = "outlineOnLightTransparentSurface"

    /**
     * light outline inverse outlineTransparentSurface
     */
    public val outlineInverseTransparentSurface: String = "outlineInverseTransparentSurface"

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
        "textDefaultAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradientHover.colors,
                LightGradientTokens.TextDefaultAccentGradientHover.positions,
                LightGradientTokens.TextDefaultAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextDefaultAccentGradientActive.colors,
                LightGradientTokens.TextDefaultAccentGradientActive.positions,
                LightGradientTokens.TextDefaultAccentGradientActive.angle,
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
        "textOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradientHover.colors,
                LightGradientTokens.TextOnDarkAccentGradientHover.positions,
                LightGradientTokens.TextOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnDarkAccentGradientActive.colors,
                LightGradientTokens.TextOnDarkAccentGradientActive.positions,
                LightGradientTokens.TextOnDarkAccentGradientActive.angle,
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
        "textOnLightAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradientHover.colors,
                LightGradientTokens.TextOnLightAccentGradientHover.positions,
                LightGradientTokens.TextOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextOnLightAccentGradientActive.colors,
                LightGradientTokens.TextOnLightAccentGradientActive.positions,
                LightGradientTokens.TextOnLightAccentGradientActive.angle,
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
        "textInverseAccentGradientHover",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradientHover.colors,
                LightGradientTokens.TextInverseAccentGradientHover.positions,
                LightGradientTokens.TextInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientActive",
        listOf(
            linearGradient(
                LightGradientTokens.TextInverseAccentGradientActive.colors,
                LightGradientTokens.TextInverseAccentGradientActive.positions,
                LightGradientTokens.TextInverseAccentGradientActive.angle,
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
        "surfaceDefaultTransparentCard",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultTransparentCard.colors,
                LightGradientTokens.SurfaceDefaultTransparentCard.positions,
                LightGradientTokens.SurfaceDefaultTransparentCard.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNavi",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceDefaultTransparentNavi.colors,
                LightGradientTokens.SurfaceDefaultTransparentNavi.positions,
                LightGradientTokens.SurfaceDefaultTransparentNavi.angle,
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
        "surfaceOnDarkTransparentNavi",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkTransparentNavi.colors,
                LightGradientTokens.SurfaceOnDarkTransparentNavi.positions,
                LightGradientTokens.SurfaceOnDarkTransparentNavi.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCard",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnDarkTransparentCard.colors,
                LightGradientTokens.SurfaceOnDarkTransparentCard.positions,
                LightGradientTokens.SurfaceOnDarkTransparentCard.angle,
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
        "surfaceOnLightTransparentCard",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightTransparentCard.colors,
                LightGradientTokens.SurfaceOnLightTransparentCard.positions,
                LightGradientTokens.SurfaceOnLightTransparentCard.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNavi",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceOnLightTransparentNavi.colors,
                LightGradientTokens.SurfaceOnLightTransparentNavi.positions,
                LightGradientTokens.SurfaceOnLightTransparentNavi.angle,
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
        "surfaceInverseTransparentCard",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseTransparentCard.colors,
                LightGradientTokens.SurfaceInverseTransparentCard.positions,
                LightGradientTokens.SurfaceInverseTransparentCard.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNavi",
        listOf(
            linearGradient(
                LightGradientTokens.SurfaceInverseTransparentNavi.colors,
                LightGradientTokens.SurfaceInverseTransparentNavi.positions,
                LightGradientTokens.SurfaceInverseTransparentNavi.angle,
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
        "backgroundDefaultGradient",
        listOf(
            linearGradient(
                LightGradientTokens.BackgroundDefaultGradient.colors,
                LightGradientTokens.BackgroundDefaultGradient.positions,
                LightGradientTokens.BackgroundDefaultGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "backgroundDarkGradient",
        listOf(
            linearGradient(
                LightGradientTokens.BackgroundDarkGradient.colors,
                LightGradientTokens.BackgroundDarkGradient.positions,
                LightGradientTokens.BackgroundDarkGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "backgroundLightGradient",
        listOf(
            linearGradient(
                LightGradientTokens.BackgroundLightGradient.colors,
                LightGradientTokens.BackgroundLightGradient.positions,
                LightGradientTokens.BackgroundLightGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "backgroundInverseGradient",
        listOf(
            linearGradient(
                LightGradientTokens.BackgroundInverseGradient.colors,
                LightGradientTokens.BackgroundInverseGradient.positions,
                LightGradientTokens.BackgroundInverseGradient.angle,
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
        "outlineInverseTransparentSurface",
        listOf(
            linearGradient(
                LightGradientTokens.OutlineInverseTransparentSurface.colors,
                LightGradientTokens.OutlineInverseTransparentSurface.positions,
                LightGradientTokens.OutlineInverseTransparentSurface.angle,
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
        "textDefaultAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradientHover.colors,
                DarkGradientTokens.TextDefaultAccentGradientHover.positions,
                DarkGradientTokens.TextDefaultAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textDefaultAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextDefaultAccentGradientActive.colors,
                DarkGradientTokens.TextDefaultAccentGradientActive.positions,
                DarkGradientTokens.TextDefaultAccentGradientActive.angle,
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
        "textOnDarkAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradientHover.colors,
                DarkGradientTokens.TextOnDarkAccentGradientHover.positions,
                DarkGradientTokens.TextOnDarkAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnDarkAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnDarkAccentGradientActive.colors,
                DarkGradientTokens.TextOnDarkAccentGradientActive.positions,
                DarkGradientTokens.TextOnDarkAccentGradientActive.angle,
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
        "textOnLightAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradientHover.colors,
                DarkGradientTokens.TextOnLightAccentGradientHover.positions,
                DarkGradientTokens.TextOnLightAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textOnLightAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextOnLightAccentGradientActive.colors,
                DarkGradientTokens.TextOnLightAccentGradientActive.positions,
                DarkGradientTokens.TextOnLightAccentGradientActive.angle,
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
        "textInverseAccentGradientHover",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradientHover.colors,
                DarkGradientTokens.TextInverseAccentGradientHover.positions,
                DarkGradientTokens.TextInverseAccentGradientHover.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "textInverseAccentGradientActive",
        listOf(
            linearGradient(
                DarkGradientTokens.TextInverseAccentGradientActive.colors,
                DarkGradientTokens.TextInverseAccentGradientActive.positions,
                DarkGradientTokens.TextInverseAccentGradientActive.angle,
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
        "surfaceDefaultTransparentCard",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultTransparentCard.colors,
                DarkGradientTokens.SurfaceDefaultTransparentCard.positions,
                DarkGradientTokens.SurfaceDefaultTransparentCard.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNavi",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceDefaultTransparentNavi.colors,
                DarkGradientTokens.SurfaceDefaultTransparentNavi.positions,
                DarkGradientTokens.SurfaceDefaultTransparentNavi.angle,
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
        "surfaceOnDarkTransparentNavi",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkTransparentNavi.colors,
                DarkGradientTokens.SurfaceOnDarkTransparentNavi.positions,
                DarkGradientTokens.SurfaceOnDarkTransparentNavi.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCard",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnDarkTransparentCard.colors,
                DarkGradientTokens.SurfaceOnDarkTransparentCard.positions,
                DarkGradientTokens.SurfaceOnDarkTransparentCard.angle,
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
        "surfaceOnLightTransparentCard",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightTransparentCard.colors,
                DarkGradientTokens.SurfaceOnLightTransparentCard.positions,
                DarkGradientTokens.SurfaceOnLightTransparentCard.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNavi",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceOnLightTransparentNavi.colors,
                DarkGradientTokens.SurfaceOnLightTransparentNavi.positions,
                DarkGradientTokens.SurfaceOnLightTransparentNavi.angle,
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
        "surfaceInverseTransparentCard",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseTransparentCard.colors,
                DarkGradientTokens.SurfaceInverseTransparentCard.positions,
                DarkGradientTokens.SurfaceInverseTransparentCard.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNavi",
        listOf(
            linearGradient(
                DarkGradientTokens.SurfaceInverseTransparentNavi.colors,
                DarkGradientTokens.SurfaceInverseTransparentNavi.positions,
                DarkGradientTokens.SurfaceInverseTransparentNavi.angle,
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
        "backgroundDefaultGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.BackgroundDefaultGradient.colors,
                DarkGradientTokens.BackgroundDefaultGradient.positions,
                DarkGradientTokens.BackgroundDefaultGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "backgroundDarkGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.BackgroundDarkGradient.colors,
                DarkGradientTokens.BackgroundDarkGradient.positions,
                DarkGradientTokens.BackgroundDarkGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "backgroundLightGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.BackgroundLightGradient.colors,
                DarkGradientTokens.BackgroundLightGradient.positions,
                DarkGradientTokens.BackgroundLightGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "backgroundInverseGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.BackgroundInverseGradient.colors,
                DarkGradientTokens.BackgroundInverseGradient.positions,
                DarkGradientTokens.BackgroundInverseGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayDefaultGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OverlayDefaultGradient.colors,
                DarkGradientTokens.OverlayDefaultGradient.positions,
                DarkGradientTokens.OverlayDefaultGradient.angle,
            ),
        ),
        overwrite,
    )
    initial.add(
        "overlayOnDarkGradient",
        listOf(
            linearGradient(
                DarkGradientTokens.OverlayOnDarkGradient.colors,
                DarkGradientTokens.OverlayOnDarkGradient.positions,
                DarkGradientTokens.OverlayOnDarkGradient.angle,
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
        "outlineDefaultTransparentSurface",
        listOf(
            linearGradient(
                DarkGradientTokens.OutlineDefaultTransparentSurface.colors,
                DarkGradientTokens.OutlineDefaultTransparentSurface.positions,
                DarkGradientTokens.OutlineDefaultTransparentSurface.angle,
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
