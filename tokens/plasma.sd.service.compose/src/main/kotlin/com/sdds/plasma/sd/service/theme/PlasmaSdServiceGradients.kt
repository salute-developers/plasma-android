// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import com.sdds.plasma.sd.service.theme.GradientOverrideScope
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceGradients
import com.sdds.plasma.sd.service.tokens.DarkGradientTokens
import com.sdds.plasma.sd.service.tokens.LightGradientTokens
import kotlin.Float
import kotlin.FloatArray
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableMap

/**
 * Градиенты PlasmaSdService
 */
@Immutable
public class PlasmaSdServiceGradients(
    private val gradients: Map<String, List<ShaderBrush>>,
) {
    public val textDefaultAccentGradient: List<ShaderBrush> by gradients

    public val textDefaultAccentGradientHover: List<ShaderBrush> by gradients

    public val textDefaultAccentGradientActive: List<ShaderBrush> by gradients

    public val textOnDarkAccentGradient: List<ShaderBrush> by gradients

    public val textOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    public val textOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    public val textOnLightAccentGradient: List<ShaderBrush> by gradients

    public val textOnLightAccentGradientHover: List<ShaderBrush> by gradients

    public val textOnLightAccentGradientActive: List<ShaderBrush> by gradients

    public val textInverseAccentGradient: List<ShaderBrush> by gradients

    public val textInverseAccentGradientHover: List<ShaderBrush> by gradients

    public val textInverseAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceDefaultAccentGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonGradientActive: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonDeepGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkAccentGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonDeepGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightAccentGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonDeepGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    public val surfaceInverseAccentGradient: List<ShaderBrush> by gradients

    public val surfaceInverseAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceInverseAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonGradient: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonGradientHover: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonGradientActive: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonDeepGradient: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    /**
     * Возвращает копию [PlasmaSdServiceGradients]. Предоставляет возможность переопределять
     * градиенты.
     */
    public fun copy(overrideGradients: GradientOverrideScope.() -> Unit = {}):
            PlasmaSdServiceGradients {
        val gradientOverrideScope = GradientOverrideScope()
        overrideGradients.invoke(gradientOverrideScope)
        val overrideMap = gradientOverrideScope.overrideMap
        return PlasmaSdServiceGradients(gradients.mapValues { overrideMap[it.key] ?: it.value })
    }

    public override fun toString() =
            "${this::class.simpleName}(textDefaultAccentGradient=$textDefaultAccentGradient, textDefaultAccentGradientHover=$textDefaultAccentGradientHover, textDefaultAccentGradientActive=$textDefaultAccentGradientActive, textOnDarkAccentGradient=$textOnDarkAccentGradient, textOnDarkAccentGradientHover=$textOnDarkAccentGradientHover, textOnDarkAccentGradientActive=$textOnDarkAccentGradientActive, textOnLightAccentGradient=$textOnLightAccentGradient, textOnLightAccentGradientHover=$textOnLightAccentGradientHover, textOnLightAccentGradientActive=$textOnLightAccentGradientActive, textInverseAccentGradient=$textInverseAccentGradient, textInverseAccentGradientHover=$textInverseAccentGradientHover, textInverseAccentGradientActive=$textInverseAccentGradientActive, surfaceDefaultAccentGradient=$surfaceDefaultAccentGradient, surfaceDefaultAccentGradientHover=$surfaceDefaultAccentGradientHover, surfaceDefaultAccentGradientActive=$surfaceDefaultAccentGradientActive, surfaceDefaultSkeletonGradient=$surfaceDefaultSkeletonGradient, surfaceDefaultSkeletonGradientHover=$surfaceDefaultSkeletonGradientHover, surfaceDefaultSkeletonGradientActive=$surfaceDefaultSkeletonGradientActive, surfaceDefaultSkeletonDeepGradient=$surfaceDefaultSkeletonDeepGradient, surfaceDefaultSkeletonDeepGradientHover=$surfaceDefaultSkeletonDeepGradientHover, surfaceDefaultSkeletonDeepGradientActive=$surfaceDefaultSkeletonDeepGradientActive, surfaceOnDarkAccentGradient=$surfaceOnDarkAccentGradient, surfaceOnDarkAccentGradientHover=$surfaceOnDarkAccentGradientHover, surfaceOnDarkAccentGradientActive=$surfaceOnDarkAccentGradientActive, surfaceOnDarkSkeletonGradient=$surfaceOnDarkSkeletonGradient, surfaceOnDarkSkeletonGradientHover=$surfaceOnDarkSkeletonGradientHover, surfaceOnDarkSkeletonGradientActive=$surfaceOnDarkSkeletonGradientActive, surfaceOnDarkSkeletonDeepGradient=$surfaceOnDarkSkeletonDeepGradient, surfaceOnDarkSkeletonDeepGradientHover=$surfaceOnDarkSkeletonDeepGradientHover, surfaceOnDarkSkeletonDeepGradientActive=$surfaceOnDarkSkeletonDeepGradientActive, surfaceOnLightAccentGradient=$surfaceOnLightAccentGradient, surfaceOnLightAccentGradientHover=$surfaceOnLightAccentGradientHover, surfaceOnLightAccentGradientActive=$surfaceOnLightAccentGradientActive, surfaceOnLightSkeletonGradient=$surfaceOnLightSkeletonGradient, surfaceOnLightSkeletonGradientHover=$surfaceOnLightSkeletonGradientHover, surfaceOnLightSkeletonGradientActive=$surfaceOnLightSkeletonGradientActive, surfaceOnLightSkeletonDeepGradient=$surfaceOnLightSkeletonDeepGradient, surfaceOnLightSkeletonDeepGradientHover=$surfaceOnLightSkeletonDeepGradientHover, surfaceOnLightSkeletonDeepGradientActive=$surfaceOnLightSkeletonDeepGradientActive, surfaceInverseAccentGradient=$surfaceInverseAccentGradient, surfaceInverseAccentGradientHover=$surfaceInverseAccentGradientHover, surfaceInverseAccentGradientActive=$surfaceInverseAccentGradientActive, surfaceInverseSkeletonGradient=$surfaceInverseSkeletonGradient, surfaceInverseSkeletonGradientHover=$surfaceInverseSkeletonGradientHover, surfaceInverseSkeletonGradientActive=$surfaceInverseSkeletonGradientActive, surfaceInverseSkeletonDeepGradient=$surfaceInverseSkeletonDeepGradient, surfaceInverseSkeletonDeepGradientHover=$surfaceInverseSkeletonDeepGradientHover, surfaceInverseSkeletonDeepGradientActive=$surfaceInverseSkeletonDeepGradientActive)"
}

/**
 * Скоуп переопределения градиентов
 */
public class GradientOverrideScope {
    private val _overrideMap: MutableMap<String, List<ShaderBrush>> = mutableMapOf<String,
            List<ShaderBrush>>()

    internal val overrideMap: Map<String, List<ShaderBrush>>
        get() = _overrideMap.toMap()

    public val textDefaultAccentGradient: String = "textDefaultAccentGradient"

    public val textDefaultAccentGradientHover: String = "textDefaultAccentGradientHover"

    public val textDefaultAccentGradientActive: String = "textDefaultAccentGradientActive"

    public val textOnDarkAccentGradient: String = "textOnDarkAccentGradient"

    public val textOnDarkAccentGradientHover: String = "textOnDarkAccentGradientHover"

    public val textOnDarkAccentGradientActive: String = "textOnDarkAccentGradientActive"

    public val textOnLightAccentGradient: String = "textOnLightAccentGradient"

    public val textOnLightAccentGradientHover: String = "textOnLightAccentGradientHover"

    public val textOnLightAccentGradientActive: String = "textOnLightAccentGradientActive"

    public val textInverseAccentGradient: String = "textInverseAccentGradient"

    public val textInverseAccentGradientHover: String = "textInverseAccentGradientHover"

    public val textInverseAccentGradientActive: String = "textInverseAccentGradientActive"

    public val surfaceDefaultAccentGradient: String = "surfaceDefaultAccentGradient"

    public val surfaceDefaultAccentGradientHover: String = "surfaceDefaultAccentGradientHover"

    public val surfaceDefaultAccentGradientActive: String = "surfaceDefaultAccentGradientActive"

    public val surfaceDefaultSkeletonGradient: String = "surfaceDefaultSkeletonGradient"

    public val surfaceDefaultSkeletonGradientHover: String = "surfaceDefaultSkeletonGradientHover"

    public val surfaceDefaultSkeletonGradientActive: String = "surfaceDefaultSkeletonGradientActive"

    public val surfaceDefaultSkeletonDeepGradient: String = "surfaceDefaultSkeletonDeepGradient"

    public val surfaceDefaultSkeletonDeepGradientHover: String =
            "surfaceDefaultSkeletonDeepGradientHover"

    public val surfaceDefaultSkeletonDeepGradientActive: String =
            "surfaceDefaultSkeletonDeepGradientActive"

    public val surfaceOnDarkAccentGradient: String = "surfaceOnDarkAccentGradient"

    public val surfaceOnDarkAccentGradientHover: String = "surfaceOnDarkAccentGradientHover"

    public val surfaceOnDarkAccentGradientActive: String = "surfaceOnDarkAccentGradientActive"

    public val surfaceOnDarkSkeletonGradient: String = "surfaceOnDarkSkeletonGradient"

    public val surfaceOnDarkSkeletonGradientHover: String = "surfaceOnDarkSkeletonGradientHover"

    public val surfaceOnDarkSkeletonGradientActive: String = "surfaceOnDarkSkeletonGradientActive"

    public val surfaceOnDarkSkeletonDeepGradient: String = "surfaceOnDarkSkeletonDeepGradient"

    public val surfaceOnDarkSkeletonDeepGradientHover: String =
            "surfaceOnDarkSkeletonDeepGradientHover"

    public val surfaceOnDarkSkeletonDeepGradientActive: String =
            "surfaceOnDarkSkeletonDeepGradientActive"

    public val surfaceOnLightAccentGradient: String = "surfaceOnLightAccentGradient"

    public val surfaceOnLightAccentGradientHover: String = "surfaceOnLightAccentGradientHover"

    public val surfaceOnLightAccentGradientActive: String = "surfaceOnLightAccentGradientActive"

    public val surfaceOnLightSkeletonGradient: String = "surfaceOnLightSkeletonGradient"

    public val surfaceOnLightSkeletonGradientHover: String = "surfaceOnLightSkeletonGradientHover"

    public val surfaceOnLightSkeletonGradientActive: String = "surfaceOnLightSkeletonGradientActive"

    public val surfaceOnLightSkeletonDeepGradient: String = "surfaceOnLightSkeletonDeepGradient"

    public val surfaceOnLightSkeletonDeepGradientHover: String =
            "surfaceOnLightSkeletonDeepGradientHover"

    public val surfaceOnLightSkeletonDeepGradientActive: String =
            "surfaceOnLightSkeletonDeepGradientActive"

    public val surfaceInverseAccentGradient: String = "surfaceInverseAccentGradient"

    public val surfaceInverseAccentGradientHover: String = "surfaceInverseAccentGradientHover"

    public val surfaceInverseAccentGradientActive: String = "surfaceInverseAccentGradientActive"

    public val surfaceInverseSkeletonGradient: String = "surfaceInverseSkeletonGradient"

    public val surfaceInverseSkeletonGradientHover: String = "surfaceInverseSkeletonGradientHover"

    public val surfaceInverseSkeletonGradientActive: String = "surfaceInverseSkeletonGradientActive"

    public val surfaceInverseSkeletonDeepGradient: String = "surfaceInverseSkeletonDeepGradient"

    public val surfaceInverseSkeletonDeepGradientHover: String =
            "surfaceInverseSkeletonDeepGradientHover"

    public val surfaceInverseSkeletonDeepGradientActive: String =
            "surfaceInverseSkeletonDeepGradientActive"

    public infix fun String.overrideBy(gradient: List<ShaderBrush>): Unit {
        _overrideMap[this] = gradient
    }
}

internal val LocalPlasmaSdServiceGradients: ProvidableCompositionLocal<PlasmaSdServiceGradients> =
        staticCompositionLocalOf { lightPlasmaSdServiceGradients() }

private fun MutableMap<String, List<ShaderBrush>>.add(
    attribute: String,
    defaultTokenValue: List<ShaderBrush>,
    overwriteMap: Map<String, List<ShaderBrush>>,
): Unit {
    this[attribute] = overwriteMap[attribute] ?: defaultTokenValue
}

/**
 * Градиенты [PlasmaSdServiceGradients] для светлой темы
 */
public fun lightPlasmaSdServiceGradients(overrideGradients: GradientOverrideScope.() -> Unit = {}):
        PlasmaSdServiceGradients {
    val gradientOverrideScope = GradientOverrideScope()
    overrideGradients.invoke(gradientOverrideScope)
    val overwrite = gradientOverrideScope.overrideMap
    val initial = mutableMapOf<String, List<ShaderBrush>>()
    initial.add("textDefaultAccentGradient",
            listOf(linearGradient(LightGradientTokens.TextDefaultAccentGradient.colors, LightGradientTokens.TextDefaultAccentGradient.positions, LightGradientTokens.TextDefaultAccentGradient.angle)),
            overwrite)
    initial.add("textDefaultAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.TextDefaultAccentGradientHover.colors, LightGradientTokens.TextDefaultAccentGradientHover.positions, LightGradientTokens.TextDefaultAccentGradientHover.angle)),
            overwrite)
    initial.add("textDefaultAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.TextDefaultAccentGradientActive.colors, LightGradientTokens.TextDefaultAccentGradientActive.positions, LightGradientTokens.TextDefaultAccentGradientActive.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradient",
            listOf(linearGradient(LightGradientTokens.TextOnDarkAccentGradient.colors, LightGradientTokens.TextOnDarkAccentGradient.positions, LightGradientTokens.TextOnDarkAccentGradient.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.TextOnDarkAccentGradientHover.colors, LightGradientTokens.TextOnDarkAccentGradientHover.positions, LightGradientTokens.TextOnDarkAccentGradientHover.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.TextOnDarkAccentGradientActive.colors, LightGradientTokens.TextOnDarkAccentGradientActive.positions, LightGradientTokens.TextOnDarkAccentGradientActive.angle)),
            overwrite)
    initial.add("textOnLightAccentGradient",
            listOf(linearGradient(LightGradientTokens.TextOnLightAccentGradient.colors, LightGradientTokens.TextOnLightAccentGradient.positions, LightGradientTokens.TextOnLightAccentGradient.angle)),
            overwrite)
    initial.add("textOnLightAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.TextOnLightAccentGradientHover.colors, LightGradientTokens.TextOnLightAccentGradientHover.positions, LightGradientTokens.TextOnLightAccentGradientHover.angle)),
            overwrite)
    initial.add("textOnLightAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.TextOnLightAccentGradientActive.colors, LightGradientTokens.TextOnLightAccentGradientActive.positions, LightGradientTokens.TextOnLightAccentGradientActive.angle)),
            overwrite)
    initial.add("textInverseAccentGradient",
            listOf(linearGradient(LightGradientTokens.TextInverseAccentGradient.colors, LightGradientTokens.TextInverseAccentGradient.positions, LightGradientTokens.TextInverseAccentGradient.angle)),
            overwrite)
    initial.add("textInverseAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.TextInverseAccentGradientHover.colors, LightGradientTokens.TextInverseAccentGradientHover.positions, LightGradientTokens.TextInverseAccentGradientHover.angle)),
            overwrite)
    initial.add("textInverseAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.TextInverseAccentGradientActive.colors, LightGradientTokens.TextInverseAccentGradientActive.positions, LightGradientTokens.TextInverseAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultAccentGradient.colors, LightGradientTokens.SurfaceDefaultAccentGradient.positions, LightGradientTokens.SurfaceDefaultAccentGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultAccentGradientHover.colors, LightGradientTokens.SurfaceDefaultAccentGradientHover.positions, LightGradientTokens.SurfaceDefaultAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultAccentGradientActive.colors, LightGradientTokens.SurfaceDefaultAccentGradientActive.positions, LightGradientTokens.SurfaceDefaultAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultSkeletonGradient.colors, LightGradientTokens.SurfaceDefaultSkeletonGradient.positions, LightGradientTokens.SurfaceDefaultSkeletonGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultSkeletonGradientHover.colors, LightGradientTokens.SurfaceDefaultSkeletonGradientHover.positions, LightGradientTokens.SurfaceDefaultSkeletonGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultSkeletonGradientActive.colors, LightGradientTokens.SurfaceDefaultSkeletonGradientActive.positions, LightGradientTokens.SurfaceDefaultSkeletonGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonDeepGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.colors, LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.positions, LightGradientTokens.SurfaceDefaultSkeletonDeepGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonDeepGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.colors, LightGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.positions, LightGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonDeepGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.colors, LightGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.positions, LightGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkAccentGradient.colors, LightGradientTokens.SurfaceOnDarkAccentGradient.positions, LightGradientTokens.SurfaceOnDarkAccentGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkAccentGradientHover.colors, LightGradientTokens.SurfaceOnDarkAccentGradientHover.positions, LightGradientTokens.SurfaceOnDarkAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkAccentGradientActive.colors, LightGradientTokens.SurfaceOnDarkAccentGradientActive.positions, LightGradientTokens.SurfaceOnDarkAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkSkeletonGradient.colors, LightGradientTokens.SurfaceOnDarkSkeletonGradient.positions, LightGradientTokens.SurfaceOnDarkSkeletonGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkSkeletonGradientHover.colors, LightGradientTokens.SurfaceOnDarkSkeletonGradientHover.positions, LightGradientTokens.SurfaceOnDarkSkeletonGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkSkeletonGradientActive.colors, LightGradientTokens.SurfaceOnDarkSkeletonGradientActive.positions, LightGradientTokens.SurfaceOnDarkSkeletonGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonDeepGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.colors, LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.positions, LightGradientTokens.SurfaceOnDarkSkeletonDeepGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonDeepGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.colors, LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.positions, LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonDeepGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.colors, LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.positions, LightGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightAccentGradient.colors, LightGradientTokens.SurfaceOnLightAccentGradient.positions, LightGradientTokens.SurfaceOnLightAccentGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightAccentGradientHover.colors, LightGradientTokens.SurfaceOnLightAccentGradientHover.positions, LightGradientTokens.SurfaceOnLightAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightAccentGradientActive.colors, LightGradientTokens.SurfaceOnLightAccentGradientActive.positions, LightGradientTokens.SurfaceOnLightAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightSkeletonGradient.colors, LightGradientTokens.SurfaceOnLightSkeletonGradient.positions, LightGradientTokens.SurfaceOnLightSkeletonGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightSkeletonGradientHover.colors, LightGradientTokens.SurfaceOnLightSkeletonGradientHover.positions, LightGradientTokens.SurfaceOnLightSkeletonGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightSkeletonGradientActive.colors, LightGradientTokens.SurfaceOnLightSkeletonGradientActive.positions, LightGradientTokens.SurfaceOnLightSkeletonGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonDeepGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.colors, LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.positions, LightGradientTokens.SurfaceOnLightSkeletonDeepGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonDeepGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.colors, LightGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.positions, LightGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonDeepGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.colors, LightGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.positions, LightGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseAccentGradient.colors, LightGradientTokens.SurfaceInverseAccentGradient.positions, LightGradientTokens.SurfaceInverseAccentGradient.angle)),
            overwrite)
    initial.add("surfaceInverseAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseAccentGradientHover.colors, LightGradientTokens.SurfaceInverseAccentGradientHover.positions, LightGradientTokens.SurfaceInverseAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseAccentGradientActive.colors, LightGradientTokens.SurfaceInverseAccentGradientActive.positions, LightGradientTokens.SurfaceInverseAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseSkeletonGradient.colors, LightGradientTokens.SurfaceInverseSkeletonGradient.positions, LightGradientTokens.SurfaceInverseSkeletonGradient.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseSkeletonGradientHover.colors, LightGradientTokens.SurfaceInverseSkeletonGradientHover.positions, LightGradientTokens.SurfaceInverseSkeletonGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseSkeletonGradientActive.colors, LightGradientTokens.SurfaceInverseSkeletonGradientActive.positions, LightGradientTokens.SurfaceInverseSkeletonGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonDeepGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseSkeletonDeepGradient.colors, LightGradientTokens.SurfaceInverseSkeletonDeepGradient.positions, LightGradientTokens.SurfaceInverseSkeletonDeepGradient.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonDeepGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseSkeletonDeepGradientHover.colors, LightGradientTokens.SurfaceInverseSkeletonDeepGradientHover.positions, LightGradientTokens.SurfaceInverseSkeletonDeepGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonDeepGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseSkeletonDeepGradientActive.colors, LightGradientTokens.SurfaceInverseSkeletonDeepGradientActive.positions, LightGradientTokens.SurfaceInverseSkeletonDeepGradientActive.angle)),
            overwrite)
    return PlasmaSdServiceGradients(initial)
}

/**
 * Градиенты [PlasmaSdServiceGradients] для темной темы
 */
public fun darkPlasmaSdServiceGradients(overrideGradients: GradientOverrideScope.() -> Unit = {}):
        PlasmaSdServiceGradients {
    val gradientOverrideScope = GradientOverrideScope()
    overrideGradients.invoke(gradientOverrideScope)
    val overwrite = gradientOverrideScope.overrideMap
    val initial = mutableMapOf<String, List<ShaderBrush>>()
    initial.add("textDefaultAccentGradient",
            listOf(linearGradient(DarkGradientTokens.TextDefaultAccentGradient.colors, DarkGradientTokens.TextDefaultAccentGradient.positions, DarkGradientTokens.TextDefaultAccentGradient.angle)),
            overwrite)
    initial.add("textDefaultAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextDefaultAccentGradientHover.colors, DarkGradientTokens.TextDefaultAccentGradientHover.positions, DarkGradientTokens.TextDefaultAccentGradientHover.angle)),
            overwrite)
    initial.add("textDefaultAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextDefaultAccentGradientActive.colors, DarkGradientTokens.TextDefaultAccentGradientActive.positions, DarkGradientTokens.TextDefaultAccentGradientActive.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradient",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkAccentGradient.colors, DarkGradientTokens.TextOnDarkAccentGradient.positions, DarkGradientTokens.TextOnDarkAccentGradient.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkAccentGradientHover.colors, DarkGradientTokens.TextOnDarkAccentGradientHover.positions, DarkGradientTokens.TextOnDarkAccentGradientHover.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkAccentGradientActive.colors, DarkGradientTokens.TextOnDarkAccentGradientActive.positions, DarkGradientTokens.TextOnDarkAccentGradientActive.angle)),
            overwrite)
    initial.add("textOnLightAccentGradient",
            listOf(linearGradient(DarkGradientTokens.TextOnLightAccentGradient.colors, DarkGradientTokens.TextOnLightAccentGradient.positions, DarkGradientTokens.TextOnLightAccentGradient.angle)),
            overwrite)
    initial.add("textOnLightAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextOnLightAccentGradientHover.colors, DarkGradientTokens.TextOnLightAccentGradientHover.positions, DarkGradientTokens.TextOnLightAccentGradientHover.angle)),
            overwrite)
    initial.add("textOnLightAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextOnLightAccentGradientActive.colors, DarkGradientTokens.TextOnLightAccentGradientActive.positions, DarkGradientTokens.TextOnLightAccentGradientActive.angle)),
            overwrite)
    initial.add("textInverseAccentGradient",
            listOf(linearGradient(DarkGradientTokens.TextInverseAccentGradient.colors, DarkGradientTokens.TextInverseAccentGradient.positions, DarkGradientTokens.TextInverseAccentGradient.angle)),
            overwrite)
    initial.add("textInverseAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextInverseAccentGradientHover.colors, DarkGradientTokens.TextInverseAccentGradientHover.positions, DarkGradientTokens.TextInverseAccentGradientHover.angle)),
            overwrite)
    initial.add("textInverseAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextInverseAccentGradientActive.colors, DarkGradientTokens.TextInverseAccentGradientActive.positions, DarkGradientTokens.TextInverseAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultAccentGradient.Layer0.colors, DarkGradientTokens.SurfaceDefaultAccentGradient.Layer0.positions, DarkGradientTokens.SurfaceDefaultAccentGradient.Layer0.angle),linearGradient(DarkGradientTokens.SurfaceDefaultAccentGradient.Layer1.colors, DarkGradientTokens.SurfaceDefaultAccentGradient.Layer1.positions, DarkGradientTokens.SurfaceDefaultAccentGradient.Layer1.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultAccentGradientHover.colors, DarkGradientTokens.SurfaceDefaultAccentGradientHover.positions, DarkGradientTokens.SurfaceDefaultAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultAccentGradientActive.colors, DarkGradientTokens.SurfaceDefaultAccentGradientActive.positions, DarkGradientTokens.SurfaceDefaultAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultSkeletonGradient.colors, DarkGradientTokens.SurfaceDefaultSkeletonGradient.positions, DarkGradientTokens.SurfaceDefaultSkeletonGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultSkeletonGradientHover.colors, DarkGradientTokens.SurfaceDefaultSkeletonGradientHover.positions, DarkGradientTokens.SurfaceDefaultSkeletonGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultSkeletonGradientActive.colors, DarkGradientTokens.SurfaceDefaultSkeletonGradientActive.positions, DarkGradientTokens.SurfaceDefaultSkeletonGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonDeepGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.colors, DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.positions, DarkGradientTokens.SurfaceDefaultSkeletonDeepGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonDeepGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.colors, DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.positions, DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultSkeletonDeepGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.colors, DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.positions, DarkGradientTokens.SurfaceDefaultSkeletonDeepGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkAccentGradient.colors, DarkGradientTokens.SurfaceOnDarkAccentGradient.positions, DarkGradientTokens.SurfaceOnDarkAccentGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkAccentGradientHover.colors, DarkGradientTokens.SurfaceOnDarkAccentGradientHover.positions, DarkGradientTokens.SurfaceOnDarkAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkAccentGradientActive.colors, DarkGradientTokens.SurfaceOnDarkAccentGradientActive.positions, DarkGradientTokens.SurfaceOnDarkAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkSkeletonGradient.colors, DarkGradientTokens.SurfaceOnDarkSkeletonGradient.positions, DarkGradientTokens.SurfaceOnDarkSkeletonGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkSkeletonGradientHover.colors, DarkGradientTokens.SurfaceOnDarkSkeletonGradientHover.positions, DarkGradientTokens.SurfaceOnDarkSkeletonGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkSkeletonGradientActive.colors, DarkGradientTokens.SurfaceOnDarkSkeletonGradientActive.positions, DarkGradientTokens.SurfaceOnDarkSkeletonGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonDeepGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.colors, DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.positions, DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonDeepGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.colors, DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.positions, DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkSkeletonDeepGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.colors, DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.positions, DarkGradientTokens.SurfaceOnDarkSkeletonDeepGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightAccentGradient.colors, DarkGradientTokens.SurfaceOnLightAccentGradient.positions, DarkGradientTokens.SurfaceOnLightAccentGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightAccentGradientHover.colors, DarkGradientTokens.SurfaceOnLightAccentGradientHover.positions, DarkGradientTokens.SurfaceOnLightAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightAccentGradientActive.colors, DarkGradientTokens.SurfaceOnLightAccentGradientActive.positions, DarkGradientTokens.SurfaceOnLightAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightSkeletonGradient.colors, DarkGradientTokens.SurfaceOnLightSkeletonGradient.positions, DarkGradientTokens.SurfaceOnLightSkeletonGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightSkeletonGradientHover.colors, DarkGradientTokens.SurfaceOnLightSkeletonGradientHover.positions, DarkGradientTokens.SurfaceOnLightSkeletonGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightSkeletonGradientActive.colors, DarkGradientTokens.SurfaceOnLightSkeletonGradientActive.positions, DarkGradientTokens.SurfaceOnLightSkeletonGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonDeepGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.colors, DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.positions, DarkGradientTokens.SurfaceOnLightSkeletonDeepGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonDeepGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.colors, DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.positions, DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightSkeletonDeepGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.colors, DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.positions, DarkGradientTokens.SurfaceOnLightSkeletonDeepGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseAccentGradient.colors, DarkGradientTokens.SurfaceInverseAccentGradient.positions, DarkGradientTokens.SurfaceInverseAccentGradient.angle)),
            overwrite)
    initial.add("surfaceInverseAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseAccentGradientHover.colors, DarkGradientTokens.SurfaceInverseAccentGradientHover.positions, DarkGradientTokens.SurfaceInverseAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseAccentGradientActive.colors, DarkGradientTokens.SurfaceInverseAccentGradientActive.positions, DarkGradientTokens.SurfaceInverseAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseSkeletonGradient.colors, DarkGradientTokens.SurfaceInverseSkeletonGradient.positions, DarkGradientTokens.SurfaceInverseSkeletonGradient.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseSkeletonGradientHover.colors, DarkGradientTokens.SurfaceInverseSkeletonGradientHover.positions, DarkGradientTokens.SurfaceInverseSkeletonGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseSkeletonGradientActive.colors, DarkGradientTokens.SurfaceInverseSkeletonGradientActive.positions, DarkGradientTokens.SurfaceInverseSkeletonGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonDeepGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.colors, DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.positions, DarkGradientTokens.SurfaceInverseSkeletonDeepGradient.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonDeepGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseSkeletonDeepGradientHover.colors, DarkGradientTokens.SurfaceInverseSkeletonDeepGradientHover.positions, DarkGradientTokens.SurfaceInverseSkeletonDeepGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseSkeletonDeepGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseSkeletonDeepGradientActive.colors, DarkGradientTokens.SurfaceInverseSkeletonDeepGradientActive.positions, DarkGradientTokens.SurfaceInverseSkeletonDeepGradientActive.angle)),
            overwrite)
    return PlasmaSdServiceGradients(initial)
}

internal fun linearGradient(
    colors: List<Color>,
    positions: FloatArray,
    angle: Float,
): ShaderBrush = ThmbldrLinearGradient(colors, positions.toList(), angleInDegrees = angle,
        useAsCssAngle = true)

internal fun radialGradient(
    colors: List<Color>,
    positions: FloatArray,
    radius: Float,
    centerX: Float,
    centerY: Float,
): ShaderBrush = ThmbldrRadialGradient(colors, positions.toList(), radius, centerX, centerY)

internal fun sweepGradient(
    colors: List<Color>,
    positions: FloatArray,
    centerX: Float,
    centerY: Float,
): ShaderBrush = ThmbldrSweepGradient(colors, positions.toList(), centerX, centerY)

internal fun singleColor(color: Color): ShaderBrush = ThmbldrLinearGradient(listOf(color, color),
        listOf(0f, 1f))

/**
 * Модификатор, позволяющий применить композитный градиент.
 */
@Composable
public fun Modifier.compositeGradient(brushes: List<Brush>): Modifier = this then
        Modifier.drawBehind { brushes.forEach(::drawRect) }