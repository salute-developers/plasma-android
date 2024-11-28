// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.tokens.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import com.sdds.serv.tokens.compose.GradientOverrideScope
import com.sdds.serv.tokens.compose.SddsServGradients
import kotlin.Float
import kotlin.FloatArray
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableMap

/**
 * Градиенты SddsServ
 */
@Immutable
public class SddsServGradients(
    private val gradients: Map<String, List<ShaderBrush>>,
) {
    public val textDefaultAccentGradientHover: List<ShaderBrush> by gradients

    public val textDefaultAccentGradientActive: List<ShaderBrush> by gradients

    public val textDefaultAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val textDefaultAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val textDefaultAccentMinorGradient: List<ShaderBrush> by gradients

    public val textDefaultPromoGradientHover: List<ShaderBrush> by gradients

    public val textDefaultPromoGradientActive: List<ShaderBrush> by gradients

    public val textDefaultPromoGradient: List<ShaderBrush> by gradients

    public val textDefaultPromoMinorGradientHover: List<ShaderBrush> by gradients

    public val textDefaultPromoMinorGradientActive: List<ShaderBrush> by gradients

    public val textDefaultPromoMinorGradient: List<ShaderBrush> by gradients

    public val textDefaultAccentGradient: List<ShaderBrush> by gradients

    public val textOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    public val textOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    public val textOnDarkAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val textOnDarkAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val textOnDarkAccentMinorGradient: List<ShaderBrush> by gradients

    public val textOnDarkPromoGradientHover: List<ShaderBrush> by gradients

    public val textOnDarkPromoGradientActive: List<ShaderBrush> by gradients

    public val textOnDarkPromoGradient: List<ShaderBrush> by gradients

    public val textOnDarkPromoMinorGradientHover: List<ShaderBrush> by gradients

    public val textOnDarkPromoMinorGradientActive: List<ShaderBrush> by gradients

    public val textOnDarkPromoMinorGradient: List<ShaderBrush> by gradients

    public val textOnDarkAccentGradient: List<ShaderBrush> by gradients

    public val textOnLightAccentGradientHover: List<ShaderBrush> by gradients

    public val textOnLightAccentGradientActive: List<ShaderBrush> by gradients

    public val textOnLightAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val textOnLightAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val textOnLightAccentMinorGradient: List<ShaderBrush> by gradients

    public val textOnLightPromoGradientHover: List<ShaderBrush> by gradients

    public val textOnLightPromoGradientActive: List<ShaderBrush> by gradients

    public val textOnLightPromoGradient: List<ShaderBrush> by gradients

    public val textOnLightPromoMinorGradientHover: List<ShaderBrush> by gradients

    public val textOnLightPromoMinorGradientActive: List<ShaderBrush> by gradients

    public val textOnLightPromoMinorGradient: List<ShaderBrush> by gradients

    public val textOnLightAccentGradient: List<ShaderBrush> by gradients

    public val textInverseAccentGradientHover: List<ShaderBrush> by gradients

    public val textInverseAccentGradientActive: List<ShaderBrush> by gradients

    public val textInverseAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val textInverseAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val textInverseAccentMinorGradient: List<ShaderBrush> by gradients

    public val textInversePromoGradientHover: List<ShaderBrush> by gradients

    public val textInversePromoGradientActive: List<ShaderBrush> by gradients

    public val textInversePromoGradient: List<ShaderBrush> by gradients

    public val textInversePromoMinorGradientHover: List<ShaderBrush> by gradients

    public val textInversePromoMinorGradientActive: List<ShaderBrush> by gradients

    public val textInversePromoMinorGradient: List<ShaderBrush> by gradients

    public val textInverseAccentGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceDefaultAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val surfaceDefaultAccentMinorGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultTransparentAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultTransparentAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceDefaultTransparentAccentGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultPromoGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultPromoGradientActive: List<ShaderBrush> by gradients

    public val surfaceDefaultPromoGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultPromoMinorGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultPromoMinorGradientActive: List<ShaderBrush> by gradients

    public val surfaceDefaultPromoMinorGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultTransparentPromoGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultTransparentPromoGradientActive: List<ShaderBrush> by gradients

    public val surfaceDefaultTransparentPromoGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultAccentGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonGradientActive: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonDeepGradient: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    public val surfaceDefaultSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkAccentMinorGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkTransparentAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkTransparentAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkTransparentAccentGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkPromoGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkPromoGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkPromoGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkPromoMinorGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkPromoMinorGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkPromoMinorGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkTransparentPromoGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkTransparentPromoGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkTransparentPromoGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkAccentGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonDeepGradient: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnDarkSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightAccentMinorGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightTransparentAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightTransparentAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightTransparentAccentGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightPromoGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightPromoGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightPromoGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightPromoMinorGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightPromoMinorGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightPromoMinorGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightTransparentPromoGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightTransparentPromoGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightTransparentPromoGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightAccentGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonGradientActive: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonDeepGradient: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    public val surfaceOnLightSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    public val surfaceInverseAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceInverseAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceInverseAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val surfaceInverseAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val surfaceInverseAccentMinorGradient: List<ShaderBrush> by gradients

    public val surfaceInverseTransparentAccentGradientHover: List<ShaderBrush> by gradients

    public val surfaceInverseTransparentAccentGradientActive: List<ShaderBrush> by gradients

    public val surfaceInverseTransparentAccentGradient: List<ShaderBrush> by gradients

    public val surfaceInversePromoGradientHover: List<ShaderBrush> by gradients

    public val surfaceInversePromoGradientActive: List<ShaderBrush> by gradients

    public val surfaceInversePromoGradient: List<ShaderBrush> by gradients

    public val surfaceInversePromoMinorGradientHover: List<ShaderBrush> by gradients

    public val surfaceInversePromoMinorGradientActive: List<ShaderBrush> by gradients

    public val surfaceInversePromoMinorGradient: List<ShaderBrush> by gradients

    public val surfaceInverseTransparentPromoGradientHover: List<ShaderBrush> by gradients

    public val surfaceInverseTransparentPromoGradientActive: List<ShaderBrush> by gradients

    public val surfaceInverseTransparentPromoGradient: List<ShaderBrush> by gradients

    public val surfaceInverseAccentGradient: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonGradient: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonGradientHover: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonGradientActive: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonDeepGradient: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonDeepGradientHover: List<ShaderBrush> by gradients

    public val surfaceInverseSkeletonDeepGradientActive: List<ShaderBrush> by gradients

    public val outlineDefaultAccentGradientHover: List<ShaderBrush> by gradients

    public val outlineDefaultAccentGradientActive: List<ShaderBrush> by gradients

    public val outlineDefaultAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val outlineDefaultAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val outlineDefaultAccentMinorGradient: List<ShaderBrush> by gradients

    public val outlineDefaultTransparentAccentGradientHover: List<ShaderBrush> by gradients

    public val outlineDefaultTransparentAccentGradientActive: List<ShaderBrush> by gradients

    public val outlineDefaultTransparentAccentGradient: List<ShaderBrush> by gradients

    public val outlineDefaultPromoGradientHover: List<ShaderBrush> by gradients

    public val outlineDefaultPromoGradientActive: List<ShaderBrush> by gradients

    public val outlineDefaultPromoGradient: List<ShaderBrush> by gradients

    public val outlineDefaultPromoMinorGradientHover: List<ShaderBrush> by gradients

    public val outlineDefaultPromoMinorGradientActive: List<ShaderBrush> by gradients

    public val outlineDefaultPromoMinorGradient: List<ShaderBrush> by gradients

    public val outlineDefaultAccentGradient: List<ShaderBrush> by gradients

    public val outlineOnDarkAccentGradientHover: List<ShaderBrush> by gradients

    public val outlineOnDarkAccentGradientActive: List<ShaderBrush> by gradients

    public val outlineOnDarkAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val outlineOnDarkAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val outlineOnDarkAccentMinorGradient: List<ShaderBrush> by gradients

    public val outlineOnDarkTransparentAccentGradientHover: List<ShaderBrush> by gradients

    public val outlineOnDarkTransparentAccentGradientActive: List<ShaderBrush> by gradients

    public val outlineOnDarkTransparentAccentGradient: List<ShaderBrush> by gradients

    public val outlineOnDarkPromoGradientHover: List<ShaderBrush> by gradients

    public val outlineOnDarkPromoGradientActive: List<ShaderBrush> by gradients

    public val outlineOnDarkPromoGradient: List<ShaderBrush> by gradients

    public val outlineOnDarkPromoMinorGradientHover: List<ShaderBrush> by gradients

    public val outlineOnDarkPromoMinorGradientActive: List<ShaderBrush> by gradients

    public val outlineOnDarkPromoMinorGradient: List<ShaderBrush> by gradients

    public val outlineOnDarkAccentGradient: List<ShaderBrush> by gradients

    public val outlineOnLightAccentGradientHover: List<ShaderBrush> by gradients

    public val outlineOnLightAccentGradientActive: List<ShaderBrush> by gradients

    public val outlineOnLightAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val outlineOnLightAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val outlineOnLightAccentMinorGradient: List<ShaderBrush> by gradients

    public val outlineOnLightTransparentAccentGradientHover: List<ShaderBrush> by gradients

    public val outlineOnLightTransparentAccentGradientActive: List<ShaderBrush> by gradients

    public val outlineOnLightTransparentAccentGradient: List<ShaderBrush> by gradients

    public val outlineOnLightPromoGradientHover: List<ShaderBrush> by gradients

    public val outlineOnLightPromoGradientActive: List<ShaderBrush> by gradients

    public val outlineOnLightPromoGradient: List<ShaderBrush> by gradients

    public val outlineOnLightPromoMinorGradientHover: List<ShaderBrush> by gradients

    public val outlineOnLightPromoMinorGradientActive: List<ShaderBrush> by gradients

    public val outlineOnLightPromoMinorGradient: List<ShaderBrush> by gradients

    public val outlineOnLightAccentGradient: List<ShaderBrush> by gradients

    public val outlineInverseAccentGradientHover: List<ShaderBrush> by gradients

    public val outlineInverseAccentGradientActive: List<ShaderBrush> by gradients

    public val outlineInverseAccentMinorGradientHover: List<ShaderBrush> by gradients

    public val outlineInverseAccentMinorGradientActive: List<ShaderBrush> by gradients

    public val outlineInverseAccentMinorGradient: List<ShaderBrush> by gradients

    public val outlineInverseTransparentAccentGradientHover: List<ShaderBrush> by gradients

    public val outlineInverseTransparentAccentGradientActive: List<ShaderBrush> by gradients

    public val outlineInverseTransparentAccentGradient: List<ShaderBrush> by gradients

    public val outlineInversePromoGradientHover: List<ShaderBrush> by gradients

    public val outlineInversePromoGradientActive: List<ShaderBrush> by gradients

    public val outlineInversePromoGradient: List<ShaderBrush> by gradients

    public val outlineInversePromoMinorGradientHover: List<ShaderBrush> by gradients

    public val outlineInversePromoMinorGradientActive: List<ShaderBrush> by gradients

    public val outlineInversePromoMinorGradient: List<ShaderBrush> by gradients

    public val outlineInverseAccentGradient: List<ShaderBrush> by gradients

    /**
     * Возвращает копию [SddsServGradients]. Предоставляет возможность переопределять градиенты.
     */
    public fun copy(overrideGradients: GradientOverrideScope.() -> Unit = {}): SddsServGradients {
        val gradientOverrideScope = GradientOverrideScope()
        overrideGradients.invoke(gradientOverrideScope)
        val overrideMap = gradientOverrideScope.overrideMap
        return SddsServGradients(gradients.mapValues { overrideMap[it.key] ?: it.value })
    }

    public override fun toString() =
            "${this::class.simpleName}(textDefaultAccentGradientHover=$textDefaultAccentGradientHover, textDefaultAccentGradientActive=$textDefaultAccentGradientActive, textDefaultAccentMinorGradientHover=$textDefaultAccentMinorGradientHover, textDefaultAccentMinorGradientActive=$textDefaultAccentMinorGradientActive, textDefaultAccentMinorGradient=$textDefaultAccentMinorGradient, textDefaultPromoGradientHover=$textDefaultPromoGradientHover, textDefaultPromoGradientActive=$textDefaultPromoGradientActive, textDefaultPromoGradient=$textDefaultPromoGradient, textDefaultPromoMinorGradientHover=$textDefaultPromoMinorGradientHover, textDefaultPromoMinorGradientActive=$textDefaultPromoMinorGradientActive, textDefaultPromoMinorGradient=$textDefaultPromoMinorGradient, textDefaultAccentGradient=$textDefaultAccentGradient, textOnDarkAccentGradientHover=$textOnDarkAccentGradientHover, textOnDarkAccentGradientActive=$textOnDarkAccentGradientActive, textOnDarkAccentMinorGradientHover=$textOnDarkAccentMinorGradientHover, textOnDarkAccentMinorGradientActive=$textOnDarkAccentMinorGradientActive, textOnDarkAccentMinorGradient=$textOnDarkAccentMinorGradient, textOnDarkPromoGradientHover=$textOnDarkPromoGradientHover, textOnDarkPromoGradientActive=$textOnDarkPromoGradientActive, textOnDarkPromoGradient=$textOnDarkPromoGradient, textOnDarkPromoMinorGradientHover=$textOnDarkPromoMinorGradientHover, textOnDarkPromoMinorGradientActive=$textOnDarkPromoMinorGradientActive, textOnDarkPromoMinorGradient=$textOnDarkPromoMinorGradient, textOnDarkAccentGradient=$textOnDarkAccentGradient, textOnLightAccentGradientHover=$textOnLightAccentGradientHover, textOnLightAccentGradientActive=$textOnLightAccentGradientActive, textOnLightAccentMinorGradientHover=$textOnLightAccentMinorGradientHover, textOnLightAccentMinorGradientActive=$textOnLightAccentMinorGradientActive, textOnLightAccentMinorGradient=$textOnLightAccentMinorGradient, textOnLightPromoGradientHover=$textOnLightPromoGradientHover, textOnLightPromoGradientActive=$textOnLightPromoGradientActive, textOnLightPromoGradient=$textOnLightPromoGradient, textOnLightPromoMinorGradientHover=$textOnLightPromoMinorGradientHover, textOnLightPromoMinorGradientActive=$textOnLightPromoMinorGradientActive, textOnLightPromoMinorGradient=$textOnLightPromoMinorGradient, textOnLightAccentGradient=$textOnLightAccentGradient, textInverseAccentGradientHover=$textInverseAccentGradientHover, textInverseAccentGradientActive=$textInverseAccentGradientActive, textInverseAccentMinorGradientHover=$textInverseAccentMinorGradientHover, textInverseAccentMinorGradientActive=$textInverseAccentMinorGradientActive, textInverseAccentMinorGradient=$textInverseAccentMinorGradient, textInversePromoGradientHover=$textInversePromoGradientHover, textInversePromoGradientActive=$textInversePromoGradientActive, textInversePromoGradient=$textInversePromoGradient, textInversePromoMinorGradientHover=$textInversePromoMinorGradientHover, textInversePromoMinorGradientActive=$textInversePromoMinorGradientActive, textInversePromoMinorGradient=$textInversePromoMinorGradient, textInverseAccentGradient=$textInverseAccentGradient, surfaceDefaultAccentGradientHover=$surfaceDefaultAccentGradientHover, surfaceDefaultAccentGradientActive=$surfaceDefaultAccentGradientActive, surfaceDefaultAccentMinorGradientHover=$surfaceDefaultAccentMinorGradientHover, surfaceDefaultAccentMinorGradientActive=$surfaceDefaultAccentMinorGradientActive, surfaceDefaultAccentMinorGradient=$surfaceDefaultAccentMinorGradient, surfaceDefaultTransparentAccentGradientHover=$surfaceDefaultTransparentAccentGradientHover, surfaceDefaultTransparentAccentGradientActive=$surfaceDefaultTransparentAccentGradientActive, surfaceDefaultTransparentAccentGradient=$surfaceDefaultTransparentAccentGradient, surfaceDefaultPromoGradientHover=$surfaceDefaultPromoGradientHover, surfaceDefaultPromoGradientActive=$surfaceDefaultPromoGradientActive, surfaceDefaultPromoGradient=$surfaceDefaultPromoGradient, surfaceDefaultPromoMinorGradientHover=$surfaceDefaultPromoMinorGradientHover, surfaceDefaultPromoMinorGradientActive=$surfaceDefaultPromoMinorGradientActive, surfaceDefaultPromoMinorGradient=$surfaceDefaultPromoMinorGradient, surfaceDefaultTransparentPromoGradientHover=$surfaceDefaultTransparentPromoGradientHover, surfaceDefaultTransparentPromoGradientActive=$surfaceDefaultTransparentPromoGradientActive, surfaceDefaultTransparentPromoGradient=$surfaceDefaultTransparentPromoGradient, surfaceDefaultAccentGradient=$surfaceDefaultAccentGradient, surfaceDefaultSkeletonGradient=$surfaceDefaultSkeletonGradient, surfaceDefaultSkeletonGradientHover=$surfaceDefaultSkeletonGradientHover, surfaceDefaultSkeletonGradientActive=$surfaceDefaultSkeletonGradientActive, surfaceDefaultSkeletonDeepGradient=$surfaceDefaultSkeletonDeepGradient, surfaceDefaultSkeletonDeepGradientHover=$surfaceDefaultSkeletonDeepGradientHover, surfaceDefaultSkeletonDeepGradientActive=$surfaceDefaultSkeletonDeepGradientActive, surfaceOnDarkAccentGradientHover=$surfaceOnDarkAccentGradientHover, surfaceOnDarkAccentGradientActive=$surfaceOnDarkAccentGradientActive, surfaceOnDarkAccentMinorGradientHover=$surfaceOnDarkAccentMinorGradientHover, surfaceOnDarkAccentMinorGradientActive=$surfaceOnDarkAccentMinorGradientActive, surfaceOnDarkAccentMinorGradient=$surfaceOnDarkAccentMinorGradient, surfaceOnDarkTransparentAccentGradientHover=$surfaceOnDarkTransparentAccentGradientHover, surfaceOnDarkTransparentAccentGradientActive=$surfaceOnDarkTransparentAccentGradientActive, surfaceOnDarkTransparentAccentGradient=$surfaceOnDarkTransparentAccentGradient, surfaceOnDarkPromoGradientHover=$surfaceOnDarkPromoGradientHover, surfaceOnDarkPromoGradientActive=$surfaceOnDarkPromoGradientActive, surfaceOnDarkPromoGradient=$surfaceOnDarkPromoGradient, surfaceOnDarkPromoMinorGradientHover=$surfaceOnDarkPromoMinorGradientHover, surfaceOnDarkPromoMinorGradientActive=$surfaceOnDarkPromoMinorGradientActive, surfaceOnDarkPromoMinorGradient=$surfaceOnDarkPromoMinorGradient, surfaceOnDarkTransparentPromoGradientHover=$surfaceOnDarkTransparentPromoGradientHover, surfaceOnDarkTransparentPromoGradientActive=$surfaceOnDarkTransparentPromoGradientActive, surfaceOnDarkTransparentPromoGradient=$surfaceOnDarkTransparentPromoGradient, surfaceOnDarkAccentGradient=$surfaceOnDarkAccentGradient, surfaceOnDarkSkeletonGradient=$surfaceOnDarkSkeletonGradient, surfaceOnDarkSkeletonGradientHover=$surfaceOnDarkSkeletonGradientHover, surfaceOnDarkSkeletonGradientActive=$surfaceOnDarkSkeletonGradientActive, surfaceOnDarkSkeletonDeepGradient=$surfaceOnDarkSkeletonDeepGradient, surfaceOnDarkSkeletonDeepGradientHover=$surfaceOnDarkSkeletonDeepGradientHover, surfaceOnDarkSkeletonDeepGradientActive=$surfaceOnDarkSkeletonDeepGradientActive, surfaceOnLightAccentGradientHover=$surfaceOnLightAccentGradientHover, surfaceOnLightAccentGradientActive=$surfaceOnLightAccentGradientActive, surfaceOnLightAccentMinorGradientHover=$surfaceOnLightAccentMinorGradientHover, surfaceOnLightAccentMinorGradientActive=$surfaceOnLightAccentMinorGradientActive, surfaceOnLightAccentMinorGradient=$surfaceOnLightAccentMinorGradient, surfaceOnLightTransparentAccentGradientHover=$surfaceOnLightTransparentAccentGradientHover, surfaceOnLightTransparentAccentGradientActive=$surfaceOnLightTransparentAccentGradientActive, surfaceOnLightTransparentAccentGradient=$surfaceOnLightTransparentAccentGradient, surfaceOnLightPromoGradientHover=$surfaceOnLightPromoGradientHover, surfaceOnLightPromoGradientActive=$surfaceOnLightPromoGradientActive, surfaceOnLightPromoGradient=$surfaceOnLightPromoGradient, surfaceOnLightPromoMinorGradientHover=$surfaceOnLightPromoMinorGradientHover, surfaceOnLightPromoMinorGradientActive=$surfaceOnLightPromoMinorGradientActive, surfaceOnLightPromoMinorGradient=$surfaceOnLightPromoMinorGradient, surfaceOnLightTransparentPromoGradientHover=$surfaceOnLightTransparentPromoGradientHover, surfaceOnLightTransparentPromoGradientActive=$surfaceOnLightTransparentPromoGradientActive, surfaceOnLightTransparentPromoGradient=$surfaceOnLightTransparentPromoGradient, surfaceOnLightAccentGradient=$surfaceOnLightAccentGradient, surfaceOnLightSkeletonGradient=$surfaceOnLightSkeletonGradient, surfaceOnLightSkeletonGradientHover=$surfaceOnLightSkeletonGradientHover, surfaceOnLightSkeletonGradientActive=$surfaceOnLightSkeletonGradientActive, surfaceOnLightSkeletonDeepGradient=$surfaceOnLightSkeletonDeepGradient, surfaceOnLightSkeletonDeepGradientHover=$surfaceOnLightSkeletonDeepGradientHover, surfaceOnLightSkeletonDeepGradientActive=$surfaceOnLightSkeletonDeepGradientActive, surfaceInverseAccentGradientHover=$surfaceInverseAccentGradientHover, surfaceInverseAccentGradientActive=$surfaceInverseAccentGradientActive, surfaceInverseAccentMinorGradientHover=$surfaceInverseAccentMinorGradientHover, surfaceInverseAccentMinorGradientActive=$surfaceInverseAccentMinorGradientActive, surfaceInverseAccentMinorGradient=$surfaceInverseAccentMinorGradient, surfaceInverseTransparentAccentGradientHover=$surfaceInverseTransparentAccentGradientHover, surfaceInverseTransparentAccentGradientActive=$surfaceInverseTransparentAccentGradientActive, surfaceInverseTransparentAccentGradient=$surfaceInverseTransparentAccentGradient, surfaceInversePromoGradientHover=$surfaceInversePromoGradientHover, surfaceInversePromoGradientActive=$surfaceInversePromoGradientActive, surfaceInversePromoGradient=$surfaceInversePromoGradient, surfaceInversePromoMinorGradientHover=$surfaceInversePromoMinorGradientHover, surfaceInversePromoMinorGradientActive=$surfaceInversePromoMinorGradientActive, surfaceInversePromoMinorGradient=$surfaceInversePromoMinorGradient, surfaceInverseTransparentPromoGradientHover=$surfaceInverseTransparentPromoGradientHover, surfaceInverseTransparentPromoGradientActive=$surfaceInverseTransparentPromoGradientActive, surfaceInverseTransparentPromoGradient=$surfaceInverseTransparentPromoGradient, surfaceInverseAccentGradient=$surfaceInverseAccentGradient, surfaceInverseSkeletonGradient=$surfaceInverseSkeletonGradient, surfaceInverseSkeletonGradientHover=$surfaceInverseSkeletonGradientHover, surfaceInverseSkeletonGradientActive=$surfaceInverseSkeletonGradientActive, surfaceInverseSkeletonDeepGradient=$surfaceInverseSkeletonDeepGradient, surfaceInverseSkeletonDeepGradientHover=$surfaceInverseSkeletonDeepGradientHover, surfaceInverseSkeletonDeepGradientActive=$surfaceInverseSkeletonDeepGradientActive, outlineDefaultAccentGradientHover=$outlineDefaultAccentGradientHover, outlineDefaultAccentGradientActive=$outlineDefaultAccentGradientActive, outlineDefaultAccentMinorGradientHover=$outlineDefaultAccentMinorGradientHover, outlineDefaultAccentMinorGradientActive=$outlineDefaultAccentMinorGradientActive, outlineDefaultAccentMinorGradient=$outlineDefaultAccentMinorGradient, outlineDefaultTransparentAccentGradientHover=$outlineDefaultTransparentAccentGradientHover, outlineDefaultTransparentAccentGradientActive=$outlineDefaultTransparentAccentGradientActive, outlineDefaultTransparentAccentGradient=$outlineDefaultTransparentAccentGradient, outlineDefaultPromoGradientHover=$outlineDefaultPromoGradientHover, outlineDefaultPromoGradientActive=$outlineDefaultPromoGradientActive, outlineDefaultPromoGradient=$outlineDefaultPromoGradient, outlineDefaultPromoMinorGradientHover=$outlineDefaultPromoMinorGradientHover, outlineDefaultPromoMinorGradientActive=$outlineDefaultPromoMinorGradientActive, outlineDefaultPromoMinorGradient=$outlineDefaultPromoMinorGradient, outlineDefaultAccentGradient=$outlineDefaultAccentGradient, outlineOnDarkAccentGradientHover=$outlineOnDarkAccentGradientHover, outlineOnDarkAccentGradientActive=$outlineOnDarkAccentGradientActive, outlineOnDarkAccentMinorGradientHover=$outlineOnDarkAccentMinorGradientHover, outlineOnDarkAccentMinorGradientActive=$outlineOnDarkAccentMinorGradientActive, outlineOnDarkAccentMinorGradient=$outlineOnDarkAccentMinorGradient, outlineOnDarkTransparentAccentGradientHover=$outlineOnDarkTransparentAccentGradientHover, outlineOnDarkTransparentAccentGradientActive=$outlineOnDarkTransparentAccentGradientActive, outlineOnDarkTransparentAccentGradient=$outlineOnDarkTransparentAccentGradient, outlineOnDarkPromoGradientHover=$outlineOnDarkPromoGradientHover, outlineOnDarkPromoGradientActive=$outlineOnDarkPromoGradientActive, outlineOnDarkPromoGradient=$outlineOnDarkPromoGradient, outlineOnDarkPromoMinorGradientHover=$outlineOnDarkPromoMinorGradientHover, outlineOnDarkPromoMinorGradientActive=$outlineOnDarkPromoMinorGradientActive, outlineOnDarkPromoMinorGradient=$outlineOnDarkPromoMinorGradient, outlineOnDarkAccentGradient=$outlineOnDarkAccentGradient, outlineOnLightAccentGradientHover=$outlineOnLightAccentGradientHover, outlineOnLightAccentGradientActive=$outlineOnLightAccentGradientActive, outlineOnLightAccentMinorGradientHover=$outlineOnLightAccentMinorGradientHover, outlineOnLightAccentMinorGradientActive=$outlineOnLightAccentMinorGradientActive, outlineOnLightAccentMinorGradient=$outlineOnLightAccentMinorGradient, outlineOnLightTransparentAccentGradientHover=$outlineOnLightTransparentAccentGradientHover, outlineOnLightTransparentAccentGradientActive=$outlineOnLightTransparentAccentGradientActive, outlineOnLightTransparentAccentGradient=$outlineOnLightTransparentAccentGradient, outlineOnLightPromoGradientHover=$outlineOnLightPromoGradientHover, outlineOnLightPromoGradientActive=$outlineOnLightPromoGradientActive, outlineOnLightPromoGradient=$outlineOnLightPromoGradient, outlineOnLightPromoMinorGradientHover=$outlineOnLightPromoMinorGradientHover, outlineOnLightPromoMinorGradientActive=$outlineOnLightPromoMinorGradientActive, outlineOnLightPromoMinorGradient=$outlineOnLightPromoMinorGradient, outlineOnLightAccentGradient=$outlineOnLightAccentGradient, outlineInverseAccentGradientHover=$outlineInverseAccentGradientHover, outlineInverseAccentGradientActive=$outlineInverseAccentGradientActive, outlineInverseAccentMinorGradientHover=$outlineInverseAccentMinorGradientHover, outlineInverseAccentMinorGradientActive=$outlineInverseAccentMinorGradientActive, outlineInverseAccentMinorGradient=$outlineInverseAccentMinorGradient, outlineInverseTransparentAccentGradientHover=$outlineInverseTransparentAccentGradientHover, outlineInverseTransparentAccentGradientActive=$outlineInverseTransparentAccentGradientActive, outlineInverseTransparentAccentGradient=$outlineInverseTransparentAccentGradient, outlineInversePromoGradientHover=$outlineInversePromoGradientHover, outlineInversePromoGradientActive=$outlineInversePromoGradientActive, outlineInversePromoGradient=$outlineInversePromoGradient, outlineInversePromoMinorGradientHover=$outlineInversePromoMinorGradientHover, outlineInversePromoMinorGradientActive=$outlineInversePromoMinorGradientActive, outlineInversePromoMinorGradient=$outlineInversePromoMinorGradient, outlineInverseAccentGradient=$outlineInverseAccentGradient)"
}

/**
 * Скоуп переопределения градиентов
 */
public class GradientOverrideScope {
    private val _overrideMap: MutableMap<String, List<ShaderBrush>> = mutableMapOf<String,
            List<ShaderBrush>>()

    internal val overrideMap: Map<String, List<ShaderBrush>>
        get() = _overrideMap.toMap()

    public val textDefaultAccentGradientHover: String = "textDefaultAccentGradientHover"

    public val textDefaultAccentGradientActive: String = "textDefaultAccentGradientActive"

    public val textDefaultAccentMinorGradientHover: String = "textDefaultAccentMinorGradientHover"

    public val textDefaultAccentMinorGradientActive: String = "textDefaultAccentMinorGradientActive"

    public val textDefaultAccentMinorGradient: String = "textDefaultAccentMinorGradient"

    public val textDefaultPromoGradientHover: String = "textDefaultPromoGradientHover"

    public val textDefaultPromoGradientActive: String = "textDefaultPromoGradientActive"

    public val textDefaultPromoGradient: String = "textDefaultPromoGradient"

    public val textDefaultPromoMinorGradientHover: String = "textDefaultPromoMinorGradientHover"

    public val textDefaultPromoMinorGradientActive: String = "textDefaultPromoMinorGradientActive"

    public val textDefaultPromoMinorGradient: String = "textDefaultPromoMinorGradient"

    public val textDefaultAccentGradient: String = "textDefaultAccentGradient"

    public val textOnDarkAccentGradientHover: String = "textOnDarkAccentGradientHover"

    public val textOnDarkAccentGradientActive: String = "textOnDarkAccentGradientActive"

    public val textOnDarkAccentMinorGradientHover: String = "textOnDarkAccentMinorGradientHover"

    public val textOnDarkAccentMinorGradientActive: String = "textOnDarkAccentMinorGradientActive"

    public val textOnDarkAccentMinorGradient: String = "textOnDarkAccentMinorGradient"

    public val textOnDarkPromoGradientHover: String = "textOnDarkPromoGradientHover"

    public val textOnDarkPromoGradientActive: String = "textOnDarkPromoGradientActive"

    public val textOnDarkPromoGradient: String = "textOnDarkPromoGradient"

    public val textOnDarkPromoMinorGradientHover: String = "textOnDarkPromoMinorGradientHover"

    public val textOnDarkPromoMinorGradientActive: String = "textOnDarkPromoMinorGradientActive"

    public val textOnDarkPromoMinorGradient: String = "textOnDarkPromoMinorGradient"

    public val textOnDarkAccentGradient: String = "textOnDarkAccentGradient"

    public val textOnLightAccentGradientHover: String = "textOnLightAccentGradientHover"

    public val textOnLightAccentGradientActive: String = "textOnLightAccentGradientActive"

    public val textOnLightAccentMinorGradientHover: String = "textOnLightAccentMinorGradientHover"

    public val textOnLightAccentMinorGradientActive: String = "textOnLightAccentMinorGradientActive"

    public val textOnLightAccentMinorGradient: String = "textOnLightAccentMinorGradient"

    public val textOnLightPromoGradientHover: String = "textOnLightPromoGradientHover"

    public val textOnLightPromoGradientActive: String = "textOnLightPromoGradientActive"

    public val textOnLightPromoGradient: String = "textOnLightPromoGradient"

    public val textOnLightPromoMinorGradientHover: String = "textOnLightPromoMinorGradientHover"

    public val textOnLightPromoMinorGradientActive: String = "textOnLightPromoMinorGradientActive"

    public val textOnLightPromoMinorGradient: String = "textOnLightPromoMinorGradient"

    public val textOnLightAccentGradient: String = "textOnLightAccentGradient"

    public val textInverseAccentGradientHover: String = "textInverseAccentGradientHover"

    public val textInverseAccentGradientActive: String = "textInverseAccentGradientActive"

    public val textInverseAccentMinorGradientHover: String = "textInverseAccentMinorGradientHover"

    public val textInverseAccentMinorGradientActive: String = "textInverseAccentMinorGradientActive"

    public val textInverseAccentMinorGradient: String = "textInverseAccentMinorGradient"

    public val textInversePromoGradientHover: String = "textInversePromoGradientHover"

    public val textInversePromoGradientActive: String = "textInversePromoGradientActive"

    public val textInversePromoGradient: String = "textInversePromoGradient"

    public val textInversePromoMinorGradientHover: String = "textInversePromoMinorGradientHover"

    public val textInversePromoMinorGradientActive: String = "textInversePromoMinorGradientActive"

    public val textInversePromoMinorGradient: String = "textInversePromoMinorGradient"

    public val textInverseAccentGradient: String = "textInverseAccentGradient"

    public val surfaceDefaultAccentGradientHover: String = "surfaceDefaultAccentGradientHover"

    public val surfaceDefaultAccentGradientActive: String = "surfaceDefaultAccentGradientActive"

    public val surfaceDefaultAccentMinorGradientHover: String =
            "surfaceDefaultAccentMinorGradientHover"

    public val surfaceDefaultAccentMinorGradientActive: String =
            "surfaceDefaultAccentMinorGradientActive"

    public val surfaceDefaultAccentMinorGradient: String = "surfaceDefaultAccentMinorGradient"

    public val surfaceDefaultTransparentAccentGradientHover: String =
            "surfaceDefaultTransparentAccentGradientHover"

    public val surfaceDefaultTransparentAccentGradientActive: String =
            "surfaceDefaultTransparentAccentGradientActive"

    public val surfaceDefaultTransparentAccentGradient: String =
            "surfaceDefaultTransparentAccentGradient"

    public val surfaceDefaultPromoGradientHover: String = "surfaceDefaultPromoGradientHover"

    public val surfaceDefaultPromoGradientActive: String = "surfaceDefaultPromoGradientActive"

    public val surfaceDefaultPromoGradient: String = "surfaceDefaultPromoGradient"

    public val surfaceDefaultPromoMinorGradientHover: String =
            "surfaceDefaultPromoMinorGradientHover"

    public val surfaceDefaultPromoMinorGradientActive: String =
            "surfaceDefaultPromoMinorGradientActive"

    public val surfaceDefaultPromoMinorGradient: String = "surfaceDefaultPromoMinorGradient"

    public val surfaceDefaultTransparentPromoGradientHover: String =
            "surfaceDefaultTransparentPromoGradientHover"

    public val surfaceDefaultTransparentPromoGradientActive: String =
            "surfaceDefaultTransparentPromoGradientActive"

    public val surfaceDefaultTransparentPromoGradient: String =
            "surfaceDefaultTransparentPromoGradient"

    public val surfaceDefaultAccentGradient: String = "surfaceDefaultAccentGradient"

    public val surfaceDefaultSkeletonGradient: String = "surfaceDefaultSkeletonGradient"

    public val surfaceDefaultSkeletonGradientHover: String = "surfaceDefaultSkeletonGradientHover"

    public val surfaceDefaultSkeletonGradientActive: String = "surfaceDefaultSkeletonGradientActive"

    public val surfaceDefaultSkeletonDeepGradient: String = "surfaceDefaultSkeletonDeepGradient"

    public val surfaceDefaultSkeletonDeepGradientHover: String =
            "surfaceDefaultSkeletonDeepGradientHover"

    public val surfaceDefaultSkeletonDeepGradientActive: String =
            "surfaceDefaultSkeletonDeepGradientActive"

    public val surfaceOnDarkAccentGradientHover: String = "surfaceOnDarkAccentGradientHover"

    public val surfaceOnDarkAccentGradientActive: String = "surfaceOnDarkAccentGradientActive"

    public val surfaceOnDarkAccentMinorGradientHover: String =
            "surfaceOnDarkAccentMinorGradientHover"

    public val surfaceOnDarkAccentMinorGradientActive: String =
            "surfaceOnDarkAccentMinorGradientActive"

    public val surfaceOnDarkAccentMinorGradient: String = "surfaceOnDarkAccentMinorGradient"

    public val surfaceOnDarkTransparentAccentGradientHover: String =
            "surfaceOnDarkTransparentAccentGradientHover"

    public val surfaceOnDarkTransparentAccentGradientActive: String =
            "surfaceOnDarkTransparentAccentGradientActive"

    public val surfaceOnDarkTransparentAccentGradient: String =
            "surfaceOnDarkTransparentAccentGradient"

    public val surfaceOnDarkPromoGradientHover: String = "surfaceOnDarkPromoGradientHover"

    public val surfaceOnDarkPromoGradientActive: String = "surfaceOnDarkPromoGradientActive"

    public val surfaceOnDarkPromoGradient: String = "surfaceOnDarkPromoGradient"

    public val surfaceOnDarkPromoMinorGradientHover: String = "surfaceOnDarkPromoMinorGradientHover"

    public val surfaceOnDarkPromoMinorGradientActive: String =
            "surfaceOnDarkPromoMinorGradientActive"

    public val surfaceOnDarkPromoMinorGradient: String = "surfaceOnDarkPromoMinorGradient"

    public val surfaceOnDarkTransparentPromoGradientHover: String =
            "surfaceOnDarkTransparentPromoGradientHover"

    public val surfaceOnDarkTransparentPromoGradientActive: String =
            "surfaceOnDarkTransparentPromoGradientActive"

    public val surfaceOnDarkTransparentPromoGradient: String =
            "surfaceOnDarkTransparentPromoGradient"

    public val surfaceOnDarkAccentGradient: String = "surfaceOnDarkAccentGradient"

    public val surfaceOnDarkSkeletonGradient: String = "surfaceOnDarkSkeletonGradient"

    public val surfaceOnDarkSkeletonGradientHover: String = "surfaceOnDarkSkeletonGradientHover"

    public val surfaceOnDarkSkeletonGradientActive: String = "surfaceOnDarkSkeletonGradientActive"

    public val surfaceOnDarkSkeletonDeepGradient: String = "surfaceOnDarkSkeletonDeepGradient"

    public val surfaceOnDarkSkeletonDeepGradientHover: String =
            "surfaceOnDarkSkeletonDeepGradientHover"

    public val surfaceOnDarkSkeletonDeepGradientActive: String =
            "surfaceOnDarkSkeletonDeepGradientActive"

    public val surfaceOnLightAccentGradientHover: String = "surfaceOnLightAccentGradientHover"

    public val surfaceOnLightAccentGradientActive: String = "surfaceOnLightAccentGradientActive"

    public val surfaceOnLightAccentMinorGradientHover: String =
            "surfaceOnLightAccentMinorGradientHover"

    public val surfaceOnLightAccentMinorGradientActive: String =
            "surfaceOnLightAccentMinorGradientActive"

    public val surfaceOnLightAccentMinorGradient: String = "surfaceOnLightAccentMinorGradient"

    public val surfaceOnLightTransparentAccentGradientHover: String =
            "surfaceOnLightTransparentAccentGradientHover"

    public val surfaceOnLightTransparentAccentGradientActive: String =
            "surfaceOnLightTransparentAccentGradientActive"

    public val surfaceOnLightTransparentAccentGradient: String =
            "surfaceOnLightTransparentAccentGradient"

    public val surfaceOnLightPromoGradientHover: String = "surfaceOnLightPromoGradientHover"

    public val surfaceOnLightPromoGradientActive: String = "surfaceOnLightPromoGradientActive"

    public val surfaceOnLightPromoGradient: String = "surfaceOnLightPromoGradient"

    public val surfaceOnLightPromoMinorGradientHover: String =
            "surfaceOnLightPromoMinorGradientHover"

    public val surfaceOnLightPromoMinorGradientActive: String =
            "surfaceOnLightPromoMinorGradientActive"

    public val surfaceOnLightPromoMinorGradient: String = "surfaceOnLightPromoMinorGradient"

    public val surfaceOnLightTransparentPromoGradientHover: String =
            "surfaceOnLightTransparentPromoGradientHover"

    public val surfaceOnLightTransparentPromoGradientActive: String =
            "surfaceOnLightTransparentPromoGradientActive"

    public val surfaceOnLightTransparentPromoGradient: String =
            "surfaceOnLightTransparentPromoGradient"

    public val surfaceOnLightAccentGradient: String = "surfaceOnLightAccentGradient"

    public val surfaceOnLightSkeletonGradient: String = "surfaceOnLightSkeletonGradient"

    public val surfaceOnLightSkeletonGradientHover: String = "surfaceOnLightSkeletonGradientHover"

    public val surfaceOnLightSkeletonGradientActive: String = "surfaceOnLightSkeletonGradientActive"

    public val surfaceOnLightSkeletonDeepGradient: String = "surfaceOnLightSkeletonDeepGradient"

    public val surfaceOnLightSkeletonDeepGradientHover: String =
            "surfaceOnLightSkeletonDeepGradientHover"

    public val surfaceOnLightSkeletonDeepGradientActive: String =
            "surfaceOnLightSkeletonDeepGradientActive"

    public val surfaceInverseAccentGradientHover: String = "surfaceInverseAccentGradientHover"

    public val surfaceInverseAccentGradientActive: String = "surfaceInverseAccentGradientActive"

    public val surfaceInverseAccentMinorGradientHover: String =
            "surfaceInverseAccentMinorGradientHover"

    public val surfaceInverseAccentMinorGradientActive: String =
            "surfaceInverseAccentMinorGradientActive"

    public val surfaceInverseAccentMinorGradient: String = "surfaceInverseAccentMinorGradient"

    public val surfaceInverseTransparentAccentGradientHover: String =
            "surfaceInverseTransparentAccentGradientHover"

    public val surfaceInverseTransparentAccentGradientActive: String =
            "surfaceInverseTransparentAccentGradientActive"

    public val surfaceInverseTransparentAccentGradient: String =
            "surfaceInverseTransparentAccentGradient"

    public val surfaceInversePromoGradientHover: String = "surfaceInversePromoGradientHover"

    public val surfaceInversePromoGradientActive: String = "surfaceInversePromoGradientActive"

    public val surfaceInversePromoGradient: String = "surfaceInversePromoGradient"

    public val surfaceInversePromoMinorGradientHover: String =
            "surfaceInversePromoMinorGradientHover"

    public val surfaceInversePromoMinorGradientActive: String =
            "surfaceInversePromoMinorGradientActive"

    public val surfaceInversePromoMinorGradient: String = "surfaceInversePromoMinorGradient"

    public val surfaceInverseTransparentPromoGradientHover: String =
            "surfaceInverseTransparentPromoGradientHover"

    public val surfaceInverseTransparentPromoGradientActive: String =
            "surfaceInverseTransparentPromoGradientActive"

    public val surfaceInverseTransparentPromoGradient: String =
            "surfaceInverseTransparentPromoGradient"

    public val surfaceInverseAccentGradient: String = "surfaceInverseAccentGradient"

    public val surfaceInverseSkeletonGradient: String = "surfaceInverseSkeletonGradient"

    public val surfaceInverseSkeletonGradientHover: String = "surfaceInverseSkeletonGradientHover"

    public val surfaceInverseSkeletonGradientActive: String = "surfaceInverseSkeletonGradientActive"

    public val surfaceInverseSkeletonDeepGradient: String = "surfaceInverseSkeletonDeepGradient"

    public val surfaceInverseSkeletonDeepGradientHover: String =
            "surfaceInverseSkeletonDeepGradientHover"

    public val surfaceInverseSkeletonDeepGradientActive: String =
            "surfaceInverseSkeletonDeepGradientActive"

    public val outlineDefaultAccentGradientHover: String = "outlineDefaultAccentGradientHover"

    public val outlineDefaultAccentGradientActive: String = "outlineDefaultAccentGradientActive"

    public val outlineDefaultAccentMinorGradientHover: String =
            "outlineDefaultAccentMinorGradientHover"

    public val outlineDefaultAccentMinorGradientActive: String =
            "outlineDefaultAccentMinorGradientActive"

    public val outlineDefaultAccentMinorGradient: String = "outlineDefaultAccentMinorGradient"

    public val outlineDefaultTransparentAccentGradientHover: String =
            "outlineDefaultTransparentAccentGradientHover"

    public val outlineDefaultTransparentAccentGradientActive: String =
            "outlineDefaultTransparentAccentGradientActive"

    public val outlineDefaultTransparentAccentGradient: String =
            "outlineDefaultTransparentAccentGradient"

    public val outlineDefaultPromoGradientHover: String = "outlineDefaultPromoGradientHover"

    public val outlineDefaultPromoGradientActive: String = "outlineDefaultPromoGradientActive"

    public val outlineDefaultPromoGradient: String = "outlineDefaultPromoGradient"

    public val outlineDefaultPromoMinorGradientHover: String =
            "outlineDefaultPromoMinorGradientHover"

    public val outlineDefaultPromoMinorGradientActive: String =
            "outlineDefaultPromoMinorGradientActive"

    public val outlineDefaultPromoMinorGradient: String = "outlineDefaultPromoMinorGradient"

    public val outlineDefaultAccentGradient: String = "outlineDefaultAccentGradient"

    public val outlineOnDarkAccentGradientHover: String = "outlineOnDarkAccentGradientHover"

    public val outlineOnDarkAccentGradientActive: String = "outlineOnDarkAccentGradientActive"

    public val outlineOnDarkAccentMinorGradientHover: String =
            "outlineOnDarkAccentMinorGradientHover"

    public val outlineOnDarkAccentMinorGradientActive: String =
            "outlineOnDarkAccentMinorGradientActive"

    public val outlineOnDarkAccentMinorGradient: String = "outlineOnDarkAccentMinorGradient"

    public val outlineOnDarkTransparentAccentGradientHover: String =
            "outlineOnDarkTransparentAccentGradientHover"

    public val outlineOnDarkTransparentAccentGradientActive: String =
            "outlineOnDarkTransparentAccentGradientActive"

    public val outlineOnDarkTransparentAccentGradient: String =
            "outlineOnDarkTransparentAccentGradient"

    public val outlineOnDarkPromoGradientHover: String = "outlineOnDarkPromoGradientHover"

    public val outlineOnDarkPromoGradientActive: String = "outlineOnDarkPromoGradientActive"

    public val outlineOnDarkPromoGradient: String = "outlineOnDarkPromoGradient"

    public val outlineOnDarkPromoMinorGradientHover: String = "outlineOnDarkPromoMinorGradientHover"

    public val outlineOnDarkPromoMinorGradientActive: String =
            "outlineOnDarkPromoMinorGradientActive"

    public val outlineOnDarkPromoMinorGradient: String = "outlineOnDarkPromoMinorGradient"

    public val outlineOnDarkAccentGradient: String = "outlineOnDarkAccentGradient"

    public val outlineOnLightAccentGradientHover: String = "outlineOnLightAccentGradientHover"

    public val outlineOnLightAccentGradientActive: String = "outlineOnLightAccentGradientActive"

    public val outlineOnLightAccentMinorGradientHover: String =
            "outlineOnLightAccentMinorGradientHover"

    public val outlineOnLightAccentMinorGradientActive: String =
            "outlineOnLightAccentMinorGradientActive"

    public val outlineOnLightAccentMinorGradient: String = "outlineOnLightAccentMinorGradient"

    public val outlineOnLightTransparentAccentGradientHover: String =
            "outlineOnLightTransparentAccentGradientHover"

    public val outlineOnLightTransparentAccentGradientActive: String =
            "outlineOnLightTransparentAccentGradientActive"

    public val outlineOnLightTransparentAccentGradient: String =
            "outlineOnLightTransparentAccentGradient"

    public val outlineOnLightPromoGradientHover: String = "outlineOnLightPromoGradientHover"

    public val outlineOnLightPromoGradientActive: String = "outlineOnLightPromoGradientActive"

    public val outlineOnLightPromoGradient: String = "outlineOnLightPromoGradient"

    public val outlineOnLightPromoMinorGradientHover: String =
            "outlineOnLightPromoMinorGradientHover"

    public val outlineOnLightPromoMinorGradientActive: String =
            "outlineOnLightPromoMinorGradientActive"

    public val outlineOnLightPromoMinorGradient: String = "outlineOnLightPromoMinorGradient"

    public val outlineOnLightAccentGradient: String = "outlineOnLightAccentGradient"

    public val outlineInverseAccentGradientHover: String = "outlineInverseAccentGradientHover"

    public val outlineInverseAccentGradientActive: String = "outlineInverseAccentGradientActive"

    public val outlineInverseAccentMinorGradientHover: String =
            "outlineInverseAccentMinorGradientHover"

    public val outlineInverseAccentMinorGradientActive: String =
            "outlineInverseAccentMinorGradientActive"

    public val outlineInverseAccentMinorGradient: String = "outlineInverseAccentMinorGradient"

    public val outlineInverseTransparentAccentGradientHover: String =
            "outlineInverseTransparentAccentGradientHover"

    public val outlineInverseTransparentAccentGradientActive: String =
            "outlineInverseTransparentAccentGradientActive"

    public val outlineInverseTransparentAccentGradient: String =
            "outlineInverseTransparentAccentGradient"

    public val outlineInversePromoGradientHover: String = "outlineInversePromoGradientHover"

    public val outlineInversePromoGradientActive: String = "outlineInversePromoGradientActive"

    public val outlineInversePromoGradient: String = "outlineInversePromoGradient"

    public val outlineInversePromoMinorGradientHover: String =
            "outlineInversePromoMinorGradientHover"

    public val outlineInversePromoMinorGradientActive: String =
            "outlineInversePromoMinorGradientActive"

    public val outlineInversePromoMinorGradient: String = "outlineInversePromoMinorGradient"

    public val outlineInverseAccentGradient: String = "outlineInverseAccentGradient"

    public infix fun String.overrideBy(gradient: List<ShaderBrush>): Unit {
        _overrideMap[this] = gradient
    }
}

internal val LocalSddsServGradients: ProvidableCompositionLocal<SddsServGradients> =
        staticCompositionLocalOf { lightSddsServGradients() }

private fun MutableMap<String, List<ShaderBrush>>.add(
    attribute: String,
    defaultTokenValue: List<ShaderBrush>,
    overwriteMap: Map<String, List<ShaderBrush>>,
): Unit {
    this[attribute] = overwriteMap[attribute] ?: defaultTokenValue
}

/**
 * Градиенты [SddsServGradients] для светлой темы
 */
public fun lightSddsServGradients(overrideGradients: GradientOverrideScope.() -> Unit = {}):
        SddsServGradients {
    val gradientOverrideScope = GradientOverrideScope()
    overrideGradients.invoke(gradientOverrideScope)
    val overwrite = gradientOverrideScope.overrideMap
    val initial = mutableMapOf<String, List<ShaderBrush>>()
    initial.add("textDefaultAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.TextDefaultAccentGradientHover.colors, LightGradientTokens.TextDefaultAccentGradientHover.positions, LightGradientTokens.TextDefaultAccentGradientHover.angle)),
            overwrite)
    initial.add("textDefaultAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.TextDefaultAccentGradientActive.colors, LightGradientTokens.TextDefaultAccentGradientActive.positions, LightGradientTokens.TextDefaultAccentGradientActive.angle)),
            overwrite)
    initial.add("textDefaultAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.TextDefaultAccentMinorGradientHover.colors, LightGradientTokens.TextDefaultAccentMinorGradientHover.positions, LightGradientTokens.TextDefaultAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("textDefaultAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.TextDefaultAccentMinorGradientActive.colors, LightGradientTokens.TextDefaultAccentMinorGradientActive.positions, LightGradientTokens.TextDefaultAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("textDefaultAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.TextDefaultAccentMinorGradient.colors, LightGradientTokens.TextDefaultAccentMinorGradient.positions, LightGradientTokens.TextDefaultAccentMinorGradient.angle)),
            overwrite)
    initial.add("textDefaultPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.TextDefaultPromoGradientHover.colors, LightGradientTokens.TextDefaultPromoGradientHover.positions, LightGradientTokens.TextDefaultPromoGradientHover.angle)),
            overwrite)
    initial.add("textDefaultPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.TextDefaultPromoGradientActive.colors, LightGradientTokens.TextDefaultPromoGradientActive.positions, LightGradientTokens.TextDefaultPromoGradientActive.angle)),
            overwrite)
    initial.add("textDefaultPromoGradient",
            listOf(linearGradient(LightGradientTokens.TextDefaultPromoGradient.colors, LightGradientTokens.TextDefaultPromoGradient.positions, LightGradientTokens.TextDefaultPromoGradient.angle)),
            overwrite)
    initial.add("textDefaultPromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.TextDefaultPromoMinorGradientHover.colors, LightGradientTokens.TextDefaultPromoMinorGradientHover.positions, LightGradientTokens.TextDefaultPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("textDefaultPromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.TextDefaultPromoMinorGradientActive.colors, LightGradientTokens.TextDefaultPromoMinorGradientActive.positions, LightGradientTokens.TextDefaultPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("textDefaultPromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.TextDefaultPromoMinorGradient.colors, LightGradientTokens.TextDefaultPromoMinorGradient.positions, LightGradientTokens.TextDefaultPromoMinorGradient.angle)),
            overwrite)
    initial.add("textDefaultAccentGradient",
            listOf(linearGradient(LightGradientTokens.TextDefaultAccentGradient.colors, LightGradientTokens.TextDefaultAccentGradient.positions, LightGradientTokens.TextDefaultAccentGradient.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.TextOnDarkAccentGradientHover.colors, LightGradientTokens.TextOnDarkAccentGradientHover.positions, LightGradientTokens.TextOnDarkAccentGradientHover.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.TextOnDarkAccentGradientActive.colors, LightGradientTokens.TextOnDarkAccentGradientActive.positions, LightGradientTokens.TextOnDarkAccentGradientActive.angle)),
            overwrite)
    initial.add("textOnDarkAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.TextOnDarkAccentMinorGradientHover.colors, LightGradientTokens.TextOnDarkAccentMinorGradientHover.positions, LightGradientTokens.TextOnDarkAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("textOnDarkAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.TextOnDarkAccentMinorGradientActive.colors, LightGradientTokens.TextOnDarkAccentMinorGradientActive.positions, LightGradientTokens.TextOnDarkAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("textOnDarkAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.TextOnDarkAccentMinorGradient.colors, LightGradientTokens.TextOnDarkAccentMinorGradient.positions, LightGradientTokens.TextOnDarkAccentMinorGradient.angle)),
            overwrite)
    initial.add("textOnDarkPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.TextOnDarkPromoGradientHover.colors, LightGradientTokens.TextOnDarkPromoGradientHover.positions, LightGradientTokens.TextOnDarkPromoGradientHover.angle)),
            overwrite)
    initial.add("textOnDarkPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.TextOnDarkPromoGradientActive.colors, LightGradientTokens.TextOnDarkPromoGradientActive.positions, LightGradientTokens.TextOnDarkPromoGradientActive.angle)),
            overwrite)
    initial.add("textOnDarkPromoGradient",
            listOf(linearGradient(LightGradientTokens.TextOnDarkPromoGradient.colors, LightGradientTokens.TextOnDarkPromoGradient.positions, LightGradientTokens.TextOnDarkPromoGradient.angle)),
            overwrite)
    initial.add("textOnDarkPromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.TextOnDarkPromoMinorGradientHover.colors, LightGradientTokens.TextOnDarkPromoMinorGradientHover.positions, LightGradientTokens.TextOnDarkPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("textOnDarkPromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.TextOnDarkPromoMinorGradientActive.colors, LightGradientTokens.TextOnDarkPromoMinorGradientActive.positions, LightGradientTokens.TextOnDarkPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("textOnDarkPromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.TextOnDarkPromoMinorGradient.colors, LightGradientTokens.TextOnDarkPromoMinorGradient.positions, LightGradientTokens.TextOnDarkPromoMinorGradient.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradient",
            listOf(linearGradient(LightGradientTokens.TextOnDarkAccentGradient.colors, LightGradientTokens.TextOnDarkAccentGradient.positions, LightGradientTokens.TextOnDarkAccentGradient.angle)),
            overwrite)
    initial.add("textOnLightAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.TextOnLightAccentGradientHover.colors, LightGradientTokens.TextOnLightAccentGradientHover.positions, LightGradientTokens.TextOnLightAccentGradientHover.angle)),
            overwrite)
    initial.add("textOnLightAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.TextOnLightAccentGradientActive.colors, LightGradientTokens.TextOnLightAccentGradientActive.positions, LightGradientTokens.TextOnLightAccentGradientActive.angle)),
            overwrite)
    initial.add("textOnLightAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.TextOnLightAccentMinorGradientHover.colors, LightGradientTokens.TextOnLightAccentMinorGradientHover.positions, LightGradientTokens.TextOnLightAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("textOnLightAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.TextOnLightAccentMinorGradientActive.colors, LightGradientTokens.TextOnLightAccentMinorGradientActive.positions, LightGradientTokens.TextOnLightAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("textOnLightAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.TextOnLightAccentMinorGradient.colors, LightGradientTokens.TextOnLightAccentMinorGradient.positions, LightGradientTokens.TextOnLightAccentMinorGradient.angle)),
            overwrite)
    initial.add("textOnLightPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.TextOnLightPromoGradientHover.colors, LightGradientTokens.TextOnLightPromoGradientHover.positions, LightGradientTokens.TextOnLightPromoGradientHover.angle)),
            overwrite)
    initial.add("textOnLightPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.TextOnLightPromoGradientActive.colors, LightGradientTokens.TextOnLightPromoGradientActive.positions, LightGradientTokens.TextOnLightPromoGradientActive.angle)),
            overwrite)
    initial.add("textOnLightPromoGradient",
            listOf(linearGradient(LightGradientTokens.TextOnLightPromoGradient.colors, LightGradientTokens.TextOnLightPromoGradient.positions, LightGradientTokens.TextOnLightPromoGradient.angle)),
            overwrite)
    initial.add("textOnLightPromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.TextOnLightPromoMinorGradientHover.colors, LightGradientTokens.TextOnLightPromoMinorGradientHover.positions, LightGradientTokens.TextOnLightPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("textOnLightPromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.TextOnLightPromoMinorGradientActive.colors, LightGradientTokens.TextOnLightPromoMinorGradientActive.positions, LightGradientTokens.TextOnLightPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("textOnLightPromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.TextOnLightPromoMinorGradient.colors, LightGradientTokens.TextOnLightPromoMinorGradient.positions, LightGradientTokens.TextOnLightPromoMinorGradient.angle)),
            overwrite)
    initial.add("textOnLightAccentGradient",
            listOf(linearGradient(LightGradientTokens.TextOnLightAccentGradient.colors, LightGradientTokens.TextOnLightAccentGradient.positions, LightGradientTokens.TextOnLightAccentGradient.angle)),
            overwrite)
    initial.add("textInverseAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.TextInverseAccentGradientHover.colors, LightGradientTokens.TextInverseAccentGradientHover.positions, LightGradientTokens.TextInverseAccentGradientHover.angle)),
            overwrite)
    initial.add("textInverseAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.TextInverseAccentGradientActive.colors, LightGradientTokens.TextInverseAccentGradientActive.positions, LightGradientTokens.TextInverseAccentGradientActive.angle)),
            overwrite)
    initial.add("textInverseAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.TextInverseAccentMinorGradientHover.colors, LightGradientTokens.TextInverseAccentMinorGradientHover.positions, LightGradientTokens.TextInverseAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("textInverseAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.TextInverseAccentMinorGradientActive.colors, LightGradientTokens.TextInverseAccentMinorGradientActive.positions, LightGradientTokens.TextInverseAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("textInverseAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.TextInverseAccentMinorGradient.colors, LightGradientTokens.TextInverseAccentMinorGradient.positions, LightGradientTokens.TextInverseAccentMinorGradient.angle)),
            overwrite)
    initial.add("textInversePromoGradientHover",
            listOf(linearGradient(LightGradientTokens.TextInversePromoGradientHover.colors, LightGradientTokens.TextInversePromoGradientHover.positions, LightGradientTokens.TextInversePromoGradientHover.angle)),
            overwrite)
    initial.add("textInversePromoGradientActive",
            listOf(linearGradient(LightGradientTokens.TextInversePromoGradientActive.colors, LightGradientTokens.TextInversePromoGradientActive.positions, LightGradientTokens.TextInversePromoGradientActive.angle)),
            overwrite)
    initial.add("textInversePromoGradient",
            listOf(linearGradient(LightGradientTokens.TextInversePromoGradient.colors, LightGradientTokens.TextInversePromoGradient.positions, LightGradientTokens.TextInversePromoGradient.angle)),
            overwrite)
    initial.add("textInversePromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.TextInversePromoMinorGradientHover.colors, LightGradientTokens.TextInversePromoMinorGradientHover.positions, LightGradientTokens.TextInversePromoMinorGradientHover.angle)),
            overwrite)
    initial.add("textInversePromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.TextInversePromoMinorGradientActive.colors, LightGradientTokens.TextInversePromoMinorGradientActive.positions, LightGradientTokens.TextInversePromoMinorGradientActive.angle)),
            overwrite)
    initial.add("textInversePromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.TextInversePromoMinorGradient.colors, LightGradientTokens.TextInversePromoMinorGradient.positions, LightGradientTokens.TextInversePromoMinorGradient.angle)),
            overwrite)
    initial.add("textInverseAccentGradient",
            listOf(linearGradient(LightGradientTokens.TextInverseAccentGradient.colors, LightGradientTokens.TextInverseAccentGradient.positions, LightGradientTokens.TextInverseAccentGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultAccentGradientHover.colors, LightGradientTokens.SurfaceDefaultAccentGradientHover.positions, LightGradientTokens.SurfaceDefaultAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultAccentGradientActive.colors, LightGradientTokens.SurfaceDefaultAccentGradientActive.positions, LightGradientTokens.SurfaceDefaultAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultAccentMinorGradientHover.colors, LightGradientTokens.SurfaceDefaultAccentMinorGradientHover.positions, LightGradientTokens.SurfaceDefaultAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultAccentMinorGradientActive.colors, LightGradientTokens.SurfaceDefaultAccentMinorGradientActive.positions, LightGradientTokens.SurfaceDefaultAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultAccentMinorGradient.colors, LightGradientTokens.SurfaceDefaultAccentMinorGradient.positions, LightGradientTokens.SurfaceDefaultAccentMinorGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultTransparentAccentGradientHover.colors, LightGradientTokens.SurfaceDefaultTransparentAccentGradientHover.positions, LightGradientTokens.SurfaceDefaultTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultTransparentAccentGradientActive.colors, LightGradientTokens.SurfaceDefaultTransparentAccentGradientActive.positions, LightGradientTokens.SurfaceDefaultTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultTransparentAccentGradient.colors, LightGradientTokens.SurfaceDefaultTransparentAccentGradient.positions, LightGradientTokens.SurfaceDefaultTransparentAccentGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultPromoGradientHover.colors, LightGradientTokens.SurfaceDefaultPromoGradientHover.positions, LightGradientTokens.SurfaceDefaultPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultPromoGradientActive.colors, LightGradientTokens.SurfaceDefaultPromoGradientActive.positions, LightGradientTokens.SurfaceDefaultPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultPromoGradient.colors, LightGradientTokens.SurfaceDefaultPromoGradient.positions, LightGradientTokens.SurfaceDefaultPromoGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultPromoMinorGradientHover.colors, LightGradientTokens.SurfaceDefaultPromoMinorGradientHover.positions, LightGradientTokens.SurfaceDefaultPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultPromoMinorGradientActive.colors, LightGradientTokens.SurfaceDefaultPromoMinorGradientActive.positions, LightGradientTokens.SurfaceDefaultPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultPromoMinorGradient.colors, LightGradientTokens.SurfaceDefaultPromoMinorGradient.positions, LightGradientTokens.SurfaceDefaultPromoMinorGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultTransparentPromoGradientHover.colors, LightGradientTokens.SurfaceDefaultTransparentPromoGradientHover.positions, LightGradientTokens.SurfaceDefaultTransparentPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultTransparentPromoGradientActive.colors, LightGradientTokens.SurfaceDefaultTransparentPromoGradientActive.positions, LightGradientTokens.SurfaceDefaultTransparentPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentPromoGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultTransparentPromoGradient.colors, LightGradientTokens.SurfaceDefaultTransparentPromoGradient.positions, LightGradientTokens.SurfaceDefaultTransparentPromoGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceDefaultAccentGradient.colors, LightGradientTokens.SurfaceDefaultAccentGradient.positions, LightGradientTokens.SurfaceDefaultAccentGradient.angle)),
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
    initial.add("surfaceOnDarkAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkAccentGradientHover.colors, LightGradientTokens.SurfaceOnDarkAccentGradientHover.positions, LightGradientTokens.SurfaceOnDarkAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkAccentGradientActive.colors, LightGradientTokens.SurfaceOnDarkAccentGradientActive.positions, LightGradientTokens.SurfaceOnDarkAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkAccentMinorGradientHover.colors, LightGradientTokens.SurfaceOnDarkAccentMinorGradientHover.positions, LightGradientTokens.SurfaceOnDarkAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkAccentMinorGradientActive.colors, LightGradientTokens.SurfaceOnDarkAccentMinorGradientActive.positions, LightGradientTokens.SurfaceOnDarkAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkAccentMinorGradient.colors, LightGradientTokens.SurfaceOnDarkAccentMinorGradient.positions, LightGradientTokens.SurfaceOnDarkAccentMinorGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.colors, LightGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.positions, LightGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.colors, LightGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.positions, LightGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkTransparentAccentGradient.colors, LightGradientTokens.SurfaceOnDarkTransparentAccentGradient.positions, LightGradientTokens.SurfaceOnDarkTransparentAccentGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkPromoGradientHover.colors, LightGradientTokens.SurfaceOnDarkPromoGradientHover.positions, LightGradientTokens.SurfaceOnDarkPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkPromoGradientActive.colors, LightGradientTokens.SurfaceOnDarkPromoGradientActive.positions, LightGradientTokens.SurfaceOnDarkPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkPromoGradient.colors, LightGradientTokens.SurfaceOnDarkPromoGradient.positions, LightGradientTokens.SurfaceOnDarkPromoGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkPromoMinorGradientHover.colors, LightGradientTokens.SurfaceOnDarkPromoMinorGradientHover.positions, LightGradientTokens.SurfaceOnDarkPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkPromoMinorGradientActive.colors, LightGradientTokens.SurfaceOnDarkPromoMinorGradientActive.positions, LightGradientTokens.SurfaceOnDarkPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkPromoMinorGradient.colors, LightGradientTokens.SurfaceOnDarkPromoMinorGradient.positions, LightGradientTokens.SurfaceOnDarkPromoMinorGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.colors, LightGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.positions, LightGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.colors, LightGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.positions, LightGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentPromoGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkTransparentPromoGradient.colors, LightGradientTokens.SurfaceOnDarkTransparentPromoGradient.positions, LightGradientTokens.SurfaceOnDarkTransparentPromoGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnDarkAccentGradient.colors, LightGradientTokens.SurfaceOnDarkAccentGradient.positions, LightGradientTokens.SurfaceOnDarkAccentGradient.angle)),
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
    initial.add("surfaceOnLightAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightAccentGradientHover.colors, LightGradientTokens.SurfaceOnLightAccentGradientHover.positions, LightGradientTokens.SurfaceOnLightAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightAccentGradientActive.colors, LightGradientTokens.SurfaceOnLightAccentGradientActive.positions, LightGradientTokens.SurfaceOnLightAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightAccentMinorGradientHover.colors, LightGradientTokens.SurfaceOnLightAccentMinorGradientHover.positions, LightGradientTokens.SurfaceOnLightAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightAccentMinorGradientActive.colors, LightGradientTokens.SurfaceOnLightAccentMinorGradientActive.positions, LightGradientTokens.SurfaceOnLightAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightAccentMinorGradient.colors, LightGradientTokens.SurfaceOnLightAccentMinorGradient.positions, LightGradientTokens.SurfaceOnLightAccentMinorGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightTransparentAccentGradientHover.colors, LightGradientTokens.SurfaceOnLightTransparentAccentGradientHover.positions, LightGradientTokens.SurfaceOnLightTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightTransparentAccentGradientActive.colors, LightGradientTokens.SurfaceOnLightTransparentAccentGradientActive.positions, LightGradientTokens.SurfaceOnLightTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightTransparentAccentGradient.colors, LightGradientTokens.SurfaceOnLightTransparentAccentGradient.positions, LightGradientTokens.SurfaceOnLightTransparentAccentGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightPromoGradientHover.colors, LightGradientTokens.SurfaceOnLightPromoGradientHover.positions, LightGradientTokens.SurfaceOnLightPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightPromoGradientActive.colors, LightGradientTokens.SurfaceOnLightPromoGradientActive.positions, LightGradientTokens.SurfaceOnLightPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightPromoGradient.colors, LightGradientTokens.SurfaceOnLightPromoGradient.positions, LightGradientTokens.SurfaceOnLightPromoGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightPromoMinorGradientHover.colors, LightGradientTokens.SurfaceOnLightPromoMinorGradientHover.positions, LightGradientTokens.SurfaceOnLightPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightPromoMinorGradientActive.colors, LightGradientTokens.SurfaceOnLightPromoMinorGradientActive.positions, LightGradientTokens.SurfaceOnLightPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightPromoMinorGradient.colors, LightGradientTokens.SurfaceOnLightPromoMinorGradient.positions, LightGradientTokens.SurfaceOnLightPromoMinorGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightTransparentPromoGradientHover.colors, LightGradientTokens.SurfaceOnLightTransparentPromoGradientHover.positions, LightGradientTokens.SurfaceOnLightTransparentPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightTransparentPromoGradientActive.colors, LightGradientTokens.SurfaceOnLightTransparentPromoGradientActive.positions, LightGradientTokens.SurfaceOnLightTransparentPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentPromoGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightTransparentPromoGradient.colors, LightGradientTokens.SurfaceOnLightTransparentPromoGradient.positions, LightGradientTokens.SurfaceOnLightTransparentPromoGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceOnLightAccentGradient.colors, LightGradientTokens.SurfaceOnLightAccentGradient.positions, LightGradientTokens.SurfaceOnLightAccentGradient.angle)),
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
    initial.add("surfaceInverseAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseAccentGradientHover.colors, LightGradientTokens.SurfaceInverseAccentGradientHover.positions, LightGradientTokens.SurfaceInverseAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseAccentGradientActive.colors, LightGradientTokens.SurfaceInverseAccentGradientActive.positions, LightGradientTokens.SurfaceInverseAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseAccentMinorGradientHover.colors, LightGradientTokens.SurfaceInverseAccentMinorGradientHover.positions, LightGradientTokens.SurfaceInverseAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseAccentMinorGradientActive.colors, LightGradientTokens.SurfaceInverseAccentMinorGradientActive.positions, LightGradientTokens.SurfaceInverseAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseAccentMinorGradient.colors, LightGradientTokens.SurfaceInverseAccentMinorGradient.positions, LightGradientTokens.SurfaceInverseAccentMinorGradient.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseTransparentAccentGradientHover.colors, LightGradientTokens.SurfaceInverseTransparentAccentGradientHover.positions, LightGradientTokens.SurfaceInverseTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseTransparentAccentGradientActive.colors, LightGradientTokens.SurfaceInverseTransparentAccentGradientActive.positions, LightGradientTokens.SurfaceInverseTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseTransparentAccentGradient.colors, LightGradientTokens.SurfaceInverseTransparentAccentGradient.positions, LightGradientTokens.SurfaceInverseTransparentAccentGradient.angle)),
            overwrite)
    initial.add("surfaceInversePromoGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceInversePromoGradientHover.colors, LightGradientTokens.SurfaceInversePromoGradientHover.positions, LightGradientTokens.SurfaceInversePromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceInversePromoGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceInversePromoGradientActive.colors, LightGradientTokens.SurfaceInversePromoGradientActive.positions, LightGradientTokens.SurfaceInversePromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceInversePromoGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceInversePromoGradient.colors, LightGradientTokens.SurfaceInversePromoGradient.positions, LightGradientTokens.SurfaceInversePromoGradient.angle)),
            overwrite)
    initial.add("surfaceInversePromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceInversePromoMinorGradientHover.colors, LightGradientTokens.SurfaceInversePromoMinorGradientHover.positions, LightGradientTokens.SurfaceInversePromoMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceInversePromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceInversePromoMinorGradientActive.colors, LightGradientTokens.SurfaceInversePromoMinorGradientActive.positions, LightGradientTokens.SurfaceInversePromoMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceInversePromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceInversePromoMinorGradient.colors, LightGradientTokens.SurfaceInversePromoMinorGradient.positions, LightGradientTokens.SurfaceInversePromoMinorGradient.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseTransparentPromoGradientHover.colors, LightGradientTokens.SurfaceInverseTransparentPromoGradientHover.positions, LightGradientTokens.SurfaceInverseTransparentPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseTransparentPromoGradientActive.colors, LightGradientTokens.SurfaceInverseTransparentPromoGradientActive.positions, LightGradientTokens.SurfaceInverseTransparentPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentPromoGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseTransparentPromoGradient.colors, LightGradientTokens.SurfaceInverseTransparentPromoGradient.positions, LightGradientTokens.SurfaceInverseTransparentPromoGradient.angle)),
            overwrite)
    initial.add("surfaceInverseAccentGradient",
            listOf(linearGradient(LightGradientTokens.SurfaceInverseAccentGradient.colors, LightGradientTokens.SurfaceInverseAccentGradient.positions, LightGradientTokens.SurfaceInverseAccentGradient.angle)),
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
    initial.add("outlineDefaultAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultAccentGradientHover.colors, LightGradientTokens.OutlineDefaultAccentGradientHover.positions, LightGradientTokens.OutlineDefaultAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineDefaultAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultAccentGradientActive.colors, LightGradientTokens.OutlineDefaultAccentGradientActive.positions, LightGradientTokens.OutlineDefaultAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineDefaultAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultAccentMinorGradientHover.colors, LightGradientTokens.OutlineDefaultAccentMinorGradientHover.positions, LightGradientTokens.OutlineDefaultAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineDefaultAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultAccentMinorGradientActive.colors, LightGradientTokens.OutlineDefaultAccentMinorGradientActive.positions, LightGradientTokens.OutlineDefaultAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineDefaultAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultAccentMinorGradient.colors, LightGradientTokens.OutlineDefaultAccentMinorGradient.positions, LightGradientTokens.OutlineDefaultAccentMinorGradient.angle)),
            overwrite)
    initial.add("outlineDefaultTransparentAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultTransparentAccentGradientHover.colors, LightGradientTokens.OutlineDefaultTransparentAccentGradientHover.positions, LightGradientTokens.OutlineDefaultTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineDefaultTransparentAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultTransparentAccentGradientActive.colors, LightGradientTokens.OutlineDefaultTransparentAccentGradientActive.positions, LightGradientTokens.OutlineDefaultTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineDefaultTransparentAccentGradient",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultTransparentAccentGradient.colors, LightGradientTokens.OutlineDefaultTransparentAccentGradient.positions, LightGradientTokens.OutlineDefaultTransparentAccentGradient.angle)),
            overwrite)
    initial.add("outlineDefaultPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultPromoGradientHover.colors, LightGradientTokens.OutlineDefaultPromoGradientHover.positions, LightGradientTokens.OutlineDefaultPromoGradientHover.angle)),
            overwrite)
    initial.add("outlineDefaultPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultPromoGradientActive.colors, LightGradientTokens.OutlineDefaultPromoGradientActive.positions, LightGradientTokens.OutlineDefaultPromoGradientActive.angle)),
            overwrite)
    initial.add("outlineDefaultPromoGradient",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultPromoGradient.colors, LightGradientTokens.OutlineDefaultPromoGradient.positions, LightGradientTokens.OutlineDefaultPromoGradient.angle)),
            overwrite)
    initial.add("outlineDefaultPromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultPromoMinorGradientHover.colors, LightGradientTokens.OutlineDefaultPromoMinorGradientHover.positions, LightGradientTokens.OutlineDefaultPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineDefaultPromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultPromoMinorGradientActive.colors, LightGradientTokens.OutlineDefaultPromoMinorGradientActive.positions, LightGradientTokens.OutlineDefaultPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineDefaultPromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultPromoMinorGradient.colors, LightGradientTokens.OutlineDefaultPromoMinorGradient.positions, LightGradientTokens.OutlineDefaultPromoMinorGradient.angle)),
            overwrite)
    initial.add("outlineDefaultAccentGradient",
            listOf(linearGradient(LightGradientTokens.OutlineDefaultAccentGradient.colors, LightGradientTokens.OutlineDefaultAccentGradient.positions, LightGradientTokens.OutlineDefaultAccentGradient.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkAccentGradientHover.colors, LightGradientTokens.OutlineOnDarkAccentGradientHover.positions, LightGradientTokens.OutlineOnDarkAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkAccentGradientActive.colors, LightGradientTokens.OutlineOnDarkAccentGradientActive.positions, LightGradientTokens.OutlineOnDarkAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkAccentMinorGradientHover.colors, LightGradientTokens.OutlineOnDarkAccentMinorGradientHover.positions, LightGradientTokens.OutlineOnDarkAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkAccentMinorGradientActive.colors, LightGradientTokens.OutlineOnDarkAccentMinorGradientActive.positions, LightGradientTokens.OutlineOnDarkAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkAccentMinorGradient.colors, LightGradientTokens.OutlineOnDarkAccentMinorGradient.positions, LightGradientTokens.OutlineOnDarkAccentMinorGradient.angle)),
            overwrite)
    initial.add("outlineOnDarkTransparentAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkTransparentAccentGradientHover.colors, LightGradientTokens.OutlineOnDarkTransparentAccentGradientHover.positions, LightGradientTokens.OutlineOnDarkTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineOnDarkTransparentAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkTransparentAccentGradientActive.colors, LightGradientTokens.OutlineOnDarkTransparentAccentGradientActive.positions, LightGradientTokens.OutlineOnDarkTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineOnDarkTransparentAccentGradient",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkTransparentAccentGradient.colors, LightGradientTokens.OutlineOnDarkTransparentAccentGradient.positions, LightGradientTokens.OutlineOnDarkTransparentAccentGradient.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkPromoGradientHover.colors, LightGradientTokens.OutlineOnDarkPromoGradientHover.positions, LightGradientTokens.OutlineOnDarkPromoGradientHover.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkPromoGradientActive.colors, LightGradientTokens.OutlineOnDarkPromoGradientActive.positions, LightGradientTokens.OutlineOnDarkPromoGradientActive.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoGradient",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkPromoGradient.colors, LightGradientTokens.OutlineOnDarkPromoGradient.positions, LightGradientTokens.OutlineOnDarkPromoGradient.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkPromoMinorGradientHover.colors, LightGradientTokens.OutlineOnDarkPromoMinorGradientHover.positions, LightGradientTokens.OutlineOnDarkPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkPromoMinorGradientActive.colors, LightGradientTokens.OutlineOnDarkPromoMinorGradientActive.positions, LightGradientTokens.OutlineOnDarkPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkPromoMinorGradient.colors, LightGradientTokens.OutlineOnDarkPromoMinorGradient.positions, LightGradientTokens.OutlineOnDarkPromoMinorGradient.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentGradient",
            listOf(linearGradient(LightGradientTokens.OutlineOnDarkAccentGradient.colors, LightGradientTokens.OutlineOnDarkAccentGradient.positions, LightGradientTokens.OutlineOnDarkAccentGradient.angle)),
            overwrite)
    initial.add("outlineOnLightAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightAccentGradientHover.colors, LightGradientTokens.OutlineOnLightAccentGradientHover.positions, LightGradientTokens.OutlineOnLightAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineOnLightAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightAccentGradientActive.colors, LightGradientTokens.OutlineOnLightAccentGradientActive.positions, LightGradientTokens.OutlineOnLightAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineOnLightAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightAccentMinorGradientHover.colors, LightGradientTokens.OutlineOnLightAccentMinorGradientHover.positions, LightGradientTokens.OutlineOnLightAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineOnLightAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightAccentMinorGradientActive.colors, LightGradientTokens.OutlineOnLightAccentMinorGradientActive.positions, LightGradientTokens.OutlineOnLightAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineOnLightAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightAccentMinorGradient.colors, LightGradientTokens.OutlineOnLightAccentMinorGradient.positions, LightGradientTokens.OutlineOnLightAccentMinorGradient.angle)),
            overwrite)
    initial.add("outlineOnLightTransparentAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightTransparentAccentGradientHover.colors, LightGradientTokens.OutlineOnLightTransparentAccentGradientHover.positions, LightGradientTokens.OutlineOnLightTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineOnLightTransparentAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightTransparentAccentGradientActive.colors, LightGradientTokens.OutlineOnLightTransparentAccentGradientActive.positions, LightGradientTokens.OutlineOnLightTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineOnLightTransparentAccentGradient",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightTransparentAccentGradient.colors, LightGradientTokens.OutlineOnLightTransparentAccentGradient.positions, LightGradientTokens.OutlineOnLightTransparentAccentGradient.angle)),
            overwrite)
    initial.add("outlineOnLightPromoGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightPromoGradientHover.colors, LightGradientTokens.OutlineOnLightPromoGradientHover.positions, LightGradientTokens.OutlineOnLightPromoGradientHover.angle)),
            overwrite)
    initial.add("outlineOnLightPromoGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightPromoGradientActive.colors, LightGradientTokens.OutlineOnLightPromoGradientActive.positions, LightGradientTokens.OutlineOnLightPromoGradientActive.angle)),
            overwrite)
    initial.add("outlineOnLightPromoGradient",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightPromoGradient.colors, LightGradientTokens.OutlineOnLightPromoGradient.positions, LightGradientTokens.OutlineOnLightPromoGradient.angle)),
            overwrite)
    initial.add("outlineOnLightPromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightPromoMinorGradientHover.colors, LightGradientTokens.OutlineOnLightPromoMinorGradientHover.positions, LightGradientTokens.OutlineOnLightPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineOnLightPromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightPromoMinorGradientActive.colors, LightGradientTokens.OutlineOnLightPromoMinorGradientActive.positions, LightGradientTokens.OutlineOnLightPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineOnLightPromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightPromoMinorGradient.colors, LightGradientTokens.OutlineOnLightPromoMinorGradient.positions, LightGradientTokens.OutlineOnLightPromoMinorGradient.angle)),
            overwrite)
    initial.add("outlineOnLightAccentGradient",
            listOf(linearGradient(LightGradientTokens.OutlineOnLightAccentGradient.colors, LightGradientTokens.OutlineOnLightAccentGradient.positions, LightGradientTokens.OutlineOnLightAccentGradient.angle)),
            overwrite)
    initial.add("outlineInverseAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineInverseAccentGradientHover.colors, LightGradientTokens.OutlineInverseAccentGradientHover.positions, LightGradientTokens.OutlineInverseAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineInverseAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineInverseAccentGradientActive.colors, LightGradientTokens.OutlineInverseAccentGradientActive.positions, LightGradientTokens.OutlineInverseAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineInverseAccentMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineInverseAccentMinorGradientHover.colors, LightGradientTokens.OutlineInverseAccentMinorGradientHover.positions, LightGradientTokens.OutlineInverseAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineInverseAccentMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineInverseAccentMinorGradientActive.colors, LightGradientTokens.OutlineInverseAccentMinorGradientActive.positions, LightGradientTokens.OutlineInverseAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineInverseAccentMinorGradient",
            listOf(linearGradient(LightGradientTokens.OutlineInverseAccentMinorGradient.colors, LightGradientTokens.OutlineInverseAccentMinorGradient.positions, LightGradientTokens.OutlineInverseAccentMinorGradient.angle)),
            overwrite)
    initial.add("outlineInverseTransparentAccentGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineInverseTransparentAccentGradientHover.colors, LightGradientTokens.OutlineInverseTransparentAccentGradientHover.positions, LightGradientTokens.OutlineInverseTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineInverseTransparentAccentGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineInverseTransparentAccentGradientActive.colors, LightGradientTokens.OutlineInverseTransparentAccentGradientActive.positions, LightGradientTokens.OutlineInverseTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineInverseTransparentAccentGradient",
            listOf(linearGradient(LightGradientTokens.OutlineInverseTransparentAccentGradient.colors, LightGradientTokens.OutlineInverseTransparentAccentGradient.positions, LightGradientTokens.OutlineInverseTransparentAccentGradient.angle)),
            overwrite)
    initial.add("outlineInversePromoGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineInversePromoGradientHover.colors, LightGradientTokens.OutlineInversePromoGradientHover.positions, LightGradientTokens.OutlineInversePromoGradientHover.angle)),
            overwrite)
    initial.add("outlineInversePromoGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineInversePromoGradientActive.colors, LightGradientTokens.OutlineInversePromoGradientActive.positions, LightGradientTokens.OutlineInversePromoGradientActive.angle)),
            overwrite)
    initial.add("outlineInversePromoGradient",
            listOf(linearGradient(LightGradientTokens.OutlineInversePromoGradient.colors, LightGradientTokens.OutlineInversePromoGradient.positions, LightGradientTokens.OutlineInversePromoGradient.angle)),
            overwrite)
    initial.add("outlineInversePromoMinorGradientHover",
            listOf(linearGradient(LightGradientTokens.OutlineInversePromoMinorGradientHover.colors, LightGradientTokens.OutlineInversePromoMinorGradientHover.positions, LightGradientTokens.OutlineInversePromoMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineInversePromoMinorGradientActive",
            listOf(linearGradient(LightGradientTokens.OutlineInversePromoMinorGradientActive.colors, LightGradientTokens.OutlineInversePromoMinorGradientActive.positions, LightGradientTokens.OutlineInversePromoMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineInversePromoMinorGradient",
            listOf(linearGradient(LightGradientTokens.OutlineInversePromoMinorGradient.colors, LightGradientTokens.OutlineInversePromoMinorGradient.positions, LightGradientTokens.OutlineInversePromoMinorGradient.angle)),
            overwrite)
    initial.add("outlineInverseAccentGradient",
            listOf(linearGradient(LightGradientTokens.OutlineInverseAccentGradient.colors, LightGradientTokens.OutlineInverseAccentGradient.positions, LightGradientTokens.OutlineInverseAccentGradient.angle)),
            overwrite)
    return SddsServGradients(initial)
}

/**
 * Градиенты [SddsServGradients] для темной темы
 */
public fun darkSddsServGradients(overrideGradients: GradientOverrideScope.() -> Unit = {}):
        SddsServGradients {
    val gradientOverrideScope = GradientOverrideScope()
    overrideGradients.invoke(gradientOverrideScope)
    val overwrite = gradientOverrideScope.overrideMap
    val initial = mutableMapOf<String, List<ShaderBrush>>()
    initial.add("textDefaultAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextDefaultAccentGradientHover.colors, DarkGradientTokens.TextDefaultAccentGradientHover.positions, DarkGradientTokens.TextDefaultAccentGradientHover.angle)),
            overwrite)
    initial.add("textDefaultAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextDefaultAccentGradientActive.colors, DarkGradientTokens.TextDefaultAccentGradientActive.positions, DarkGradientTokens.TextDefaultAccentGradientActive.angle)),
            overwrite)
    initial.add("textDefaultAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextDefaultAccentMinorGradientHover.colors, DarkGradientTokens.TextDefaultAccentMinorGradientHover.positions, DarkGradientTokens.TextDefaultAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("textDefaultAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextDefaultAccentMinorGradientActive.colors, DarkGradientTokens.TextDefaultAccentMinorGradientActive.positions, DarkGradientTokens.TextDefaultAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("textDefaultAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.TextDefaultAccentMinorGradient.colors, DarkGradientTokens.TextDefaultAccentMinorGradient.positions, DarkGradientTokens.TextDefaultAccentMinorGradient.angle)),
            overwrite)
    initial.add("textDefaultPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextDefaultPromoGradientHover.colors, DarkGradientTokens.TextDefaultPromoGradientHover.positions, DarkGradientTokens.TextDefaultPromoGradientHover.angle)),
            overwrite)
    initial.add("textDefaultPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextDefaultPromoGradientActive.colors, DarkGradientTokens.TextDefaultPromoGradientActive.positions, DarkGradientTokens.TextDefaultPromoGradientActive.angle)),
            overwrite)
    initial.add("textDefaultPromoGradient",
            listOf(linearGradient(DarkGradientTokens.TextDefaultPromoGradient.colors, DarkGradientTokens.TextDefaultPromoGradient.positions, DarkGradientTokens.TextDefaultPromoGradient.angle)),
            overwrite)
    initial.add("textDefaultPromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextDefaultPromoMinorGradientHover.colors, DarkGradientTokens.TextDefaultPromoMinorGradientHover.positions, DarkGradientTokens.TextDefaultPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("textDefaultPromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextDefaultPromoMinorGradientActive.colors, DarkGradientTokens.TextDefaultPromoMinorGradientActive.positions, DarkGradientTokens.TextDefaultPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("textDefaultPromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.TextDefaultPromoMinorGradient.colors, DarkGradientTokens.TextDefaultPromoMinorGradient.positions, DarkGradientTokens.TextDefaultPromoMinorGradient.angle)),
            overwrite)
    initial.add("textDefaultAccentGradient",
            listOf(linearGradient(DarkGradientTokens.TextDefaultAccentGradient.colors, DarkGradientTokens.TextDefaultAccentGradient.positions, DarkGradientTokens.TextDefaultAccentGradient.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkAccentGradientHover.colors, DarkGradientTokens.TextOnDarkAccentGradientHover.positions, DarkGradientTokens.TextOnDarkAccentGradientHover.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkAccentGradientActive.colors, DarkGradientTokens.TextOnDarkAccentGradientActive.positions, DarkGradientTokens.TextOnDarkAccentGradientActive.angle)),
            overwrite)
    initial.add("textOnDarkAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkAccentMinorGradientHover.colors, DarkGradientTokens.TextOnDarkAccentMinorGradientHover.positions, DarkGradientTokens.TextOnDarkAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("textOnDarkAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkAccentMinorGradientActive.colors, DarkGradientTokens.TextOnDarkAccentMinorGradientActive.positions, DarkGradientTokens.TextOnDarkAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("textOnDarkAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkAccentMinorGradient.colors, DarkGradientTokens.TextOnDarkAccentMinorGradient.positions, DarkGradientTokens.TextOnDarkAccentMinorGradient.angle)),
            overwrite)
    initial.add("textOnDarkPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkPromoGradientHover.colors, DarkGradientTokens.TextOnDarkPromoGradientHover.positions, DarkGradientTokens.TextOnDarkPromoGradientHover.angle)),
            overwrite)
    initial.add("textOnDarkPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkPromoGradientActive.colors, DarkGradientTokens.TextOnDarkPromoGradientActive.positions, DarkGradientTokens.TextOnDarkPromoGradientActive.angle)),
            overwrite)
    initial.add("textOnDarkPromoGradient",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkPromoGradient.colors, DarkGradientTokens.TextOnDarkPromoGradient.positions, DarkGradientTokens.TextOnDarkPromoGradient.angle)),
            overwrite)
    initial.add("textOnDarkPromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkPromoMinorGradientHover.colors, DarkGradientTokens.TextOnDarkPromoMinorGradientHover.positions, DarkGradientTokens.TextOnDarkPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("textOnDarkPromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkPromoMinorGradientActive.colors, DarkGradientTokens.TextOnDarkPromoMinorGradientActive.positions, DarkGradientTokens.TextOnDarkPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("textOnDarkPromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkPromoMinorGradient.colors, DarkGradientTokens.TextOnDarkPromoMinorGradient.positions, DarkGradientTokens.TextOnDarkPromoMinorGradient.angle)),
            overwrite)
    initial.add("textOnDarkAccentGradient",
            listOf(linearGradient(DarkGradientTokens.TextOnDarkAccentGradient.colors, DarkGradientTokens.TextOnDarkAccentGradient.positions, DarkGradientTokens.TextOnDarkAccentGradient.angle)),
            overwrite)
    initial.add("textOnLightAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextOnLightAccentGradientHover.colors, DarkGradientTokens.TextOnLightAccentGradientHover.positions, DarkGradientTokens.TextOnLightAccentGradientHover.angle)),
            overwrite)
    initial.add("textOnLightAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextOnLightAccentGradientActive.colors, DarkGradientTokens.TextOnLightAccentGradientActive.positions, DarkGradientTokens.TextOnLightAccentGradientActive.angle)),
            overwrite)
    initial.add("textOnLightAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextOnLightAccentMinorGradientHover.colors, DarkGradientTokens.TextOnLightAccentMinorGradientHover.positions, DarkGradientTokens.TextOnLightAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("textOnLightAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextOnLightAccentMinorGradientActive.colors, DarkGradientTokens.TextOnLightAccentMinorGradientActive.positions, DarkGradientTokens.TextOnLightAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("textOnLightAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.TextOnLightAccentMinorGradient.colors, DarkGradientTokens.TextOnLightAccentMinorGradient.positions, DarkGradientTokens.TextOnLightAccentMinorGradient.angle)),
            overwrite)
    initial.add("textOnLightPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextOnLightPromoGradientHover.colors, DarkGradientTokens.TextOnLightPromoGradientHover.positions, DarkGradientTokens.TextOnLightPromoGradientHover.angle)),
            overwrite)
    initial.add("textOnLightPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextOnLightPromoGradientActive.colors, DarkGradientTokens.TextOnLightPromoGradientActive.positions, DarkGradientTokens.TextOnLightPromoGradientActive.angle)),
            overwrite)
    initial.add("textOnLightPromoGradient",
            listOf(linearGradient(DarkGradientTokens.TextOnLightPromoGradient.colors, DarkGradientTokens.TextOnLightPromoGradient.positions, DarkGradientTokens.TextOnLightPromoGradient.angle)),
            overwrite)
    initial.add("textOnLightPromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextOnLightPromoMinorGradientHover.colors, DarkGradientTokens.TextOnLightPromoMinorGradientHover.positions, DarkGradientTokens.TextOnLightPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("textOnLightPromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextOnLightPromoMinorGradientActive.colors, DarkGradientTokens.TextOnLightPromoMinorGradientActive.positions, DarkGradientTokens.TextOnLightPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("textOnLightPromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.TextOnLightPromoMinorGradient.colors, DarkGradientTokens.TextOnLightPromoMinorGradient.positions, DarkGradientTokens.TextOnLightPromoMinorGradient.angle)),
            overwrite)
    initial.add("textOnLightAccentGradient",
            listOf(linearGradient(DarkGradientTokens.TextOnLightAccentGradient.colors, DarkGradientTokens.TextOnLightAccentGradient.positions, DarkGradientTokens.TextOnLightAccentGradient.angle)),
            overwrite)
    initial.add("textInverseAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextInverseAccentGradientHover.colors, DarkGradientTokens.TextInverseAccentGradientHover.positions, DarkGradientTokens.TextInverseAccentGradientHover.angle)),
            overwrite)
    initial.add("textInverseAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextInverseAccentGradientActive.colors, DarkGradientTokens.TextInverseAccentGradientActive.positions, DarkGradientTokens.TextInverseAccentGradientActive.angle)),
            overwrite)
    initial.add("textInverseAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextInverseAccentMinorGradientHover.colors, DarkGradientTokens.TextInverseAccentMinorGradientHover.positions, DarkGradientTokens.TextInverseAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("textInverseAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextInverseAccentMinorGradientActive.colors, DarkGradientTokens.TextInverseAccentMinorGradientActive.positions, DarkGradientTokens.TextInverseAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("textInverseAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.TextInverseAccentMinorGradient.colors, DarkGradientTokens.TextInverseAccentMinorGradient.positions, DarkGradientTokens.TextInverseAccentMinorGradient.angle)),
            overwrite)
    initial.add("textInversePromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextInversePromoGradientHover.colors, DarkGradientTokens.TextInversePromoGradientHover.positions, DarkGradientTokens.TextInversePromoGradientHover.angle)),
            overwrite)
    initial.add("textInversePromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextInversePromoGradientActive.colors, DarkGradientTokens.TextInversePromoGradientActive.positions, DarkGradientTokens.TextInversePromoGradientActive.angle)),
            overwrite)
    initial.add("textInversePromoGradient",
            listOf(linearGradient(DarkGradientTokens.TextInversePromoGradient.colors, DarkGradientTokens.TextInversePromoGradient.positions, DarkGradientTokens.TextInversePromoGradient.angle)),
            overwrite)
    initial.add("textInversePromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.TextInversePromoMinorGradientHover.colors, DarkGradientTokens.TextInversePromoMinorGradientHover.positions, DarkGradientTokens.TextInversePromoMinorGradientHover.angle)),
            overwrite)
    initial.add("textInversePromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.TextInversePromoMinorGradientActive.colors, DarkGradientTokens.TextInversePromoMinorGradientActive.positions, DarkGradientTokens.TextInversePromoMinorGradientActive.angle)),
            overwrite)
    initial.add("textInversePromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.TextInversePromoMinorGradient.colors, DarkGradientTokens.TextInversePromoMinorGradient.positions, DarkGradientTokens.TextInversePromoMinorGradient.angle)),
            overwrite)
    initial.add("textInverseAccentGradient",
            listOf(linearGradient(DarkGradientTokens.TextInverseAccentGradient.colors, DarkGradientTokens.TextInverseAccentGradient.positions, DarkGradientTokens.TextInverseAccentGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultAccentGradientHover.colors, DarkGradientTokens.SurfaceDefaultAccentGradientHover.positions, DarkGradientTokens.SurfaceDefaultAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultAccentGradientActive.colors, DarkGradientTokens.SurfaceDefaultAccentGradientActive.positions, DarkGradientTokens.SurfaceDefaultAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultAccentMinorGradientHover.colors, DarkGradientTokens.SurfaceDefaultAccentMinorGradientHover.positions, DarkGradientTokens.SurfaceDefaultAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultAccentMinorGradientActive.colors, DarkGradientTokens.SurfaceDefaultAccentMinorGradientActive.positions, DarkGradientTokens.SurfaceDefaultAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultAccentMinorGradient.colors, DarkGradientTokens.SurfaceDefaultAccentMinorGradient.positions, DarkGradientTokens.SurfaceDefaultAccentMinorGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultTransparentAccentGradientHover.colors, DarkGradientTokens.SurfaceDefaultTransparentAccentGradientHover.positions, DarkGradientTokens.SurfaceDefaultTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultTransparentAccentGradientActive.colors, DarkGradientTokens.SurfaceDefaultTransparentAccentGradientActive.positions, DarkGradientTokens.SurfaceDefaultTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultTransparentAccentGradient.colors, DarkGradientTokens.SurfaceDefaultTransparentAccentGradient.positions, DarkGradientTokens.SurfaceDefaultTransparentAccentGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultPromoGradientHover.colors, DarkGradientTokens.SurfaceDefaultPromoGradientHover.positions, DarkGradientTokens.SurfaceDefaultPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultPromoGradientActive.colors, DarkGradientTokens.SurfaceDefaultPromoGradientActive.positions, DarkGradientTokens.SurfaceDefaultPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultPromoGradient.colors, DarkGradientTokens.SurfaceDefaultPromoGradient.positions, DarkGradientTokens.SurfaceDefaultPromoGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultPromoMinorGradientHover.colors, DarkGradientTokens.SurfaceDefaultPromoMinorGradientHover.positions, DarkGradientTokens.SurfaceDefaultPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultPromoMinorGradientActive.colors, DarkGradientTokens.SurfaceDefaultPromoMinorGradientActive.positions, DarkGradientTokens.SurfaceDefaultPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultPromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultPromoMinorGradient.colors, DarkGradientTokens.SurfaceDefaultPromoMinorGradient.positions, DarkGradientTokens.SurfaceDefaultPromoMinorGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultTransparentPromoGradientHover.colors, DarkGradientTokens.SurfaceDefaultTransparentPromoGradientHover.positions, DarkGradientTokens.SurfaceDefaultTransparentPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultTransparentPromoGradientActive.colors, DarkGradientTokens.SurfaceDefaultTransparentPromoGradientActive.positions, DarkGradientTokens.SurfaceDefaultTransparentPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceDefaultTransparentPromoGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultTransparentPromoGradient.colors, DarkGradientTokens.SurfaceDefaultTransparentPromoGradient.positions, DarkGradientTokens.SurfaceDefaultTransparentPromoGradient.angle)),
            overwrite)
    initial.add("surfaceDefaultAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceDefaultAccentGradient.colors, DarkGradientTokens.SurfaceDefaultAccentGradient.positions, DarkGradientTokens.SurfaceDefaultAccentGradient.angle)),
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
    initial.add("surfaceOnDarkAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkAccentGradientHover.colors, DarkGradientTokens.SurfaceOnDarkAccentGradientHover.positions, DarkGradientTokens.SurfaceOnDarkAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkAccentGradientActive.colors, DarkGradientTokens.SurfaceOnDarkAccentGradientActive.positions, DarkGradientTokens.SurfaceOnDarkAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkAccentMinorGradientHover.colors, DarkGradientTokens.SurfaceOnDarkAccentMinorGradientHover.positions, DarkGradientTokens.SurfaceOnDarkAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkAccentMinorGradientActive.colors, DarkGradientTokens.SurfaceOnDarkAccentMinorGradientActive.positions, DarkGradientTokens.SurfaceOnDarkAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkAccentMinorGradient.colors, DarkGradientTokens.SurfaceOnDarkAccentMinorGradient.positions, DarkGradientTokens.SurfaceOnDarkAccentMinorGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.colors, DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.positions, DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.colors, DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.positions, DarkGradientTokens.SurfaceOnDarkTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkTransparentAccentGradient.colors, DarkGradientTokens.SurfaceOnDarkTransparentAccentGradient.positions, DarkGradientTokens.SurfaceOnDarkTransparentAccentGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkPromoGradientHover.colors, DarkGradientTokens.SurfaceOnDarkPromoGradientHover.positions, DarkGradientTokens.SurfaceOnDarkPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkPromoGradientActive.colors, DarkGradientTokens.SurfaceOnDarkPromoGradientActive.positions, DarkGradientTokens.SurfaceOnDarkPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkPromoGradient.colors, DarkGradientTokens.SurfaceOnDarkPromoGradient.positions, DarkGradientTokens.SurfaceOnDarkPromoGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkPromoMinorGradientHover.colors, DarkGradientTokens.SurfaceOnDarkPromoMinorGradientHover.positions, DarkGradientTokens.SurfaceOnDarkPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkPromoMinorGradientActive.colors, DarkGradientTokens.SurfaceOnDarkPromoMinorGradientActive.positions, DarkGradientTokens.SurfaceOnDarkPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkPromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkPromoMinorGradient.colors, DarkGradientTokens.SurfaceOnDarkPromoMinorGradient.positions, DarkGradientTokens.SurfaceOnDarkPromoMinorGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.colors, DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.positions, DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.colors, DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.positions, DarkGradientTokens.SurfaceOnDarkTransparentPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnDarkTransparentPromoGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkTransparentPromoGradient.colors, DarkGradientTokens.SurfaceOnDarkTransparentPromoGradient.positions, DarkGradientTokens.SurfaceOnDarkTransparentPromoGradient.angle)),
            overwrite)
    initial.add("surfaceOnDarkAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnDarkAccentGradient.colors, DarkGradientTokens.SurfaceOnDarkAccentGradient.positions, DarkGradientTokens.SurfaceOnDarkAccentGradient.angle)),
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
    initial.add("surfaceOnLightAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightAccentGradientHover.colors, DarkGradientTokens.SurfaceOnLightAccentGradientHover.positions, DarkGradientTokens.SurfaceOnLightAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightAccentGradientActive.colors, DarkGradientTokens.SurfaceOnLightAccentGradientActive.positions, DarkGradientTokens.SurfaceOnLightAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightAccentMinorGradientHover.colors, DarkGradientTokens.SurfaceOnLightAccentMinorGradientHover.positions, DarkGradientTokens.SurfaceOnLightAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightAccentMinorGradientActive.colors, DarkGradientTokens.SurfaceOnLightAccentMinorGradientActive.positions, DarkGradientTokens.SurfaceOnLightAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightAccentMinorGradient.colors, DarkGradientTokens.SurfaceOnLightAccentMinorGradient.positions, DarkGradientTokens.SurfaceOnLightAccentMinorGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightTransparentAccentGradientHover.colors, DarkGradientTokens.SurfaceOnLightTransparentAccentGradientHover.positions, DarkGradientTokens.SurfaceOnLightTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightTransparentAccentGradientActive.colors, DarkGradientTokens.SurfaceOnLightTransparentAccentGradientActive.positions, DarkGradientTokens.SurfaceOnLightTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightTransparentAccentGradient.colors, DarkGradientTokens.SurfaceOnLightTransparentAccentGradient.positions, DarkGradientTokens.SurfaceOnLightTransparentAccentGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightPromoGradientHover.colors, DarkGradientTokens.SurfaceOnLightPromoGradientHover.positions, DarkGradientTokens.SurfaceOnLightPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightPromoGradientActive.colors, DarkGradientTokens.SurfaceOnLightPromoGradientActive.positions, DarkGradientTokens.SurfaceOnLightPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightPromoGradient.colors, DarkGradientTokens.SurfaceOnLightPromoGradient.positions, DarkGradientTokens.SurfaceOnLightPromoGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightPromoMinorGradientHover.colors, DarkGradientTokens.SurfaceOnLightPromoMinorGradientHover.positions, DarkGradientTokens.SurfaceOnLightPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightPromoMinorGradientActive.colors, DarkGradientTokens.SurfaceOnLightPromoMinorGradientActive.positions, DarkGradientTokens.SurfaceOnLightPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightPromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightPromoMinorGradient.colors, DarkGradientTokens.SurfaceOnLightPromoMinorGradient.positions, DarkGradientTokens.SurfaceOnLightPromoMinorGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightTransparentPromoGradientHover.colors, DarkGradientTokens.SurfaceOnLightTransparentPromoGradientHover.positions, DarkGradientTokens.SurfaceOnLightTransparentPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightTransparentPromoGradientActive.colors, DarkGradientTokens.SurfaceOnLightTransparentPromoGradientActive.positions, DarkGradientTokens.SurfaceOnLightTransparentPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceOnLightTransparentPromoGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightTransparentPromoGradient.colors, DarkGradientTokens.SurfaceOnLightTransparentPromoGradient.positions, DarkGradientTokens.SurfaceOnLightTransparentPromoGradient.angle)),
            overwrite)
    initial.add("surfaceOnLightAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceOnLightAccentGradient.colors, DarkGradientTokens.SurfaceOnLightAccentGradient.positions, DarkGradientTokens.SurfaceOnLightAccentGradient.angle)),
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
    initial.add("surfaceInverseAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseAccentGradientHover.colors, DarkGradientTokens.SurfaceInverseAccentGradientHover.positions, DarkGradientTokens.SurfaceInverseAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseAccentGradientActive.colors, DarkGradientTokens.SurfaceInverseAccentGradientActive.positions, DarkGradientTokens.SurfaceInverseAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseAccentMinorGradientHover.colors, DarkGradientTokens.SurfaceInverseAccentMinorGradientHover.positions, DarkGradientTokens.SurfaceInverseAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseAccentMinorGradientActive.colors, DarkGradientTokens.SurfaceInverseAccentMinorGradientActive.positions, DarkGradientTokens.SurfaceInverseAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseAccentMinorGradient.colors, DarkGradientTokens.SurfaceInverseAccentMinorGradient.positions, DarkGradientTokens.SurfaceInverseAccentMinorGradient.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseTransparentAccentGradientHover.colors, DarkGradientTokens.SurfaceInverseTransparentAccentGradientHover.positions, DarkGradientTokens.SurfaceInverseTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseTransparentAccentGradientActive.colors, DarkGradientTokens.SurfaceInverseTransparentAccentGradientActive.positions, DarkGradientTokens.SurfaceInverseTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseTransparentAccentGradient.colors, DarkGradientTokens.SurfaceInverseTransparentAccentGradient.positions, DarkGradientTokens.SurfaceInverseTransparentAccentGradient.angle)),
            overwrite)
    initial.add("surfaceInversePromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceInversePromoGradientHover.colors, DarkGradientTokens.SurfaceInversePromoGradientHover.positions, DarkGradientTokens.SurfaceInversePromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceInversePromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceInversePromoGradientActive.colors, DarkGradientTokens.SurfaceInversePromoGradientActive.positions, DarkGradientTokens.SurfaceInversePromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceInversePromoGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceInversePromoGradient.colors, DarkGradientTokens.SurfaceInversePromoGradient.positions, DarkGradientTokens.SurfaceInversePromoGradient.angle)),
            overwrite)
    initial.add("surfaceInversePromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceInversePromoMinorGradientHover.colors, DarkGradientTokens.SurfaceInversePromoMinorGradientHover.positions, DarkGradientTokens.SurfaceInversePromoMinorGradientHover.angle)),
            overwrite)
    initial.add("surfaceInversePromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceInversePromoMinorGradientActive.colors, DarkGradientTokens.SurfaceInversePromoMinorGradientActive.positions, DarkGradientTokens.SurfaceInversePromoMinorGradientActive.angle)),
            overwrite)
    initial.add("surfaceInversePromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceInversePromoMinorGradient.colors, DarkGradientTokens.SurfaceInversePromoMinorGradient.positions, DarkGradientTokens.SurfaceInversePromoMinorGradient.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseTransparentPromoGradientHover.colors, DarkGradientTokens.SurfaceInverseTransparentPromoGradientHover.positions, DarkGradientTokens.SurfaceInverseTransparentPromoGradientHover.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseTransparentPromoGradientActive.colors, DarkGradientTokens.SurfaceInverseTransparentPromoGradientActive.positions, DarkGradientTokens.SurfaceInverseTransparentPromoGradientActive.angle)),
            overwrite)
    initial.add("surfaceInverseTransparentPromoGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseTransparentPromoGradient.colors, DarkGradientTokens.SurfaceInverseTransparentPromoGradient.positions, DarkGradientTokens.SurfaceInverseTransparentPromoGradient.angle)),
            overwrite)
    initial.add("surfaceInverseAccentGradient",
            listOf(linearGradient(DarkGradientTokens.SurfaceInverseAccentGradient.colors, DarkGradientTokens.SurfaceInverseAccentGradient.positions, DarkGradientTokens.SurfaceInverseAccentGradient.angle)),
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
    initial.add("outlineDefaultAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultAccentGradientHover.colors, DarkGradientTokens.OutlineDefaultAccentGradientHover.positions, DarkGradientTokens.OutlineDefaultAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineDefaultAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultAccentGradientActive.colors, DarkGradientTokens.OutlineDefaultAccentGradientActive.positions, DarkGradientTokens.OutlineDefaultAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineDefaultAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultAccentMinorGradientHover.colors, DarkGradientTokens.OutlineDefaultAccentMinorGradientHover.positions, DarkGradientTokens.OutlineDefaultAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineDefaultAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultAccentMinorGradientActive.colors, DarkGradientTokens.OutlineDefaultAccentMinorGradientActive.positions, DarkGradientTokens.OutlineDefaultAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineDefaultAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultAccentMinorGradient.colors, DarkGradientTokens.OutlineDefaultAccentMinorGradient.positions, DarkGradientTokens.OutlineDefaultAccentMinorGradient.angle)),
            overwrite)
    initial.add("outlineDefaultTransparentAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultTransparentAccentGradientHover.colors, DarkGradientTokens.OutlineDefaultTransparentAccentGradientHover.positions, DarkGradientTokens.OutlineDefaultTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineDefaultTransparentAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultTransparentAccentGradientActive.colors, DarkGradientTokens.OutlineDefaultTransparentAccentGradientActive.positions, DarkGradientTokens.OutlineDefaultTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineDefaultTransparentAccentGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultTransparentAccentGradient.colors, DarkGradientTokens.OutlineDefaultTransparentAccentGradient.positions, DarkGradientTokens.OutlineDefaultTransparentAccentGradient.angle)),
            overwrite)
    initial.add("outlineDefaultPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultPromoGradientHover.colors, DarkGradientTokens.OutlineDefaultPromoGradientHover.positions, DarkGradientTokens.OutlineDefaultPromoGradientHover.angle)),
            overwrite)
    initial.add("outlineDefaultPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultPromoGradientActive.colors, DarkGradientTokens.OutlineDefaultPromoGradientActive.positions, DarkGradientTokens.OutlineDefaultPromoGradientActive.angle)),
            overwrite)
    initial.add("outlineDefaultPromoGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultPromoGradient.colors, DarkGradientTokens.OutlineDefaultPromoGradient.positions, DarkGradientTokens.OutlineDefaultPromoGradient.angle)),
            overwrite)
    initial.add("outlineDefaultPromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultPromoMinorGradientHover.colors, DarkGradientTokens.OutlineDefaultPromoMinorGradientHover.positions, DarkGradientTokens.OutlineDefaultPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineDefaultPromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultPromoMinorGradientActive.colors, DarkGradientTokens.OutlineDefaultPromoMinorGradientActive.positions, DarkGradientTokens.OutlineDefaultPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineDefaultPromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultPromoMinorGradient.colors, DarkGradientTokens.OutlineDefaultPromoMinorGradient.positions, DarkGradientTokens.OutlineDefaultPromoMinorGradient.angle)),
            overwrite)
    initial.add("outlineDefaultAccentGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineDefaultAccentGradient.colors, DarkGradientTokens.OutlineDefaultAccentGradient.positions, DarkGradientTokens.OutlineDefaultAccentGradient.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkAccentGradientHover.colors, DarkGradientTokens.OutlineOnDarkAccentGradientHover.positions, DarkGradientTokens.OutlineOnDarkAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkAccentGradientActive.colors, DarkGradientTokens.OutlineOnDarkAccentGradientActive.positions, DarkGradientTokens.OutlineOnDarkAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkAccentMinorGradientHover.colors, DarkGradientTokens.OutlineOnDarkAccentMinorGradientHover.positions, DarkGradientTokens.OutlineOnDarkAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkAccentMinorGradientActive.colors, DarkGradientTokens.OutlineOnDarkAccentMinorGradientActive.positions, DarkGradientTokens.OutlineOnDarkAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkAccentMinorGradient.colors, DarkGradientTokens.OutlineOnDarkAccentMinorGradient.positions, DarkGradientTokens.OutlineOnDarkAccentMinorGradient.angle)),
            overwrite)
    initial.add("outlineOnDarkTransparentAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkTransparentAccentGradientHover.colors, DarkGradientTokens.OutlineOnDarkTransparentAccentGradientHover.positions, DarkGradientTokens.OutlineOnDarkTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineOnDarkTransparentAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkTransparentAccentGradientActive.colors, DarkGradientTokens.OutlineOnDarkTransparentAccentGradientActive.positions, DarkGradientTokens.OutlineOnDarkTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineOnDarkTransparentAccentGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkTransparentAccentGradient.colors, DarkGradientTokens.OutlineOnDarkTransparentAccentGradient.positions, DarkGradientTokens.OutlineOnDarkTransparentAccentGradient.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkPromoGradientHover.colors, DarkGradientTokens.OutlineOnDarkPromoGradientHover.positions, DarkGradientTokens.OutlineOnDarkPromoGradientHover.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkPromoGradientActive.colors, DarkGradientTokens.OutlineOnDarkPromoGradientActive.positions, DarkGradientTokens.OutlineOnDarkPromoGradientActive.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkPromoGradient.colors, DarkGradientTokens.OutlineOnDarkPromoGradient.positions, DarkGradientTokens.OutlineOnDarkPromoGradient.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkPromoMinorGradientHover.colors, DarkGradientTokens.OutlineOnDarkPromoMinorGradientHover.positions, DarkGradientTokens.OutlineOnDarkPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkPromoMinorGradientActive.colors, DarkGradientTokens.OutlineOnDarkPromoMinorGradientActive.positions, DarkGradientTokens.OutlineOnDarkPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineOnDarkPromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkPromoMinorGradient.colors, DarkGradientTokens.OutlineOnDarkPromoMinorGradient.positions, DarkGradientTokens.OutlineOnDarkPromoMinorGradient.angle)),
            overwrite)
    initial.add("outlineOnDarkAccentGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineOnDarkAccentGradient.colors, DarkGradientTokens.OutlineOnDarkAccentGradient.positions, DarkGradientTokens.OutlineOnDarkAccentGradient.angle)),
            overwrite)
    initial.add("outlineOnLightAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightAccentGradientHover.colors, DarkGradientTokens.OutlineOnLightAccentGradientHover.positions, DarkGradientTokens.OutlineOnLightAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineOnLightAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightAccentGradientActive.colors, DarkGradientTokens.OutlineOnLightAccentGradientActive.positions, DarkGradientTokens.OutlineOnLightAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineOnLightAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightAccentMinorGradientHover.colors, DarkGradientTokens.OutlineOnLightAccentMinorGradientHover.positions, DarkGradientTokens.OutlineOnLightAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineOnLightAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightAccentMinorGradientActive.colors, DarkGradientTokens.OutlineOnLightAccentMinorGradientActive.positions, DarkGradientTokens.OutlineOnLightAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineOnLightAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightAccentMinorGradient.colors, DarkGradientTokens.OutlineOnLightAccentMinorGradient.positions, DarkGradientTokens.OutlineOnLightAccentMinorGradient.angle)),
            overwrite)
    initial.add("outlineOnLightTransparentAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightTransparentAccentGradientHover.colors, DarkGradientTokens.OutlineOnLightTransparentAccentGradientHover.positions, DarkGradientTokens.OutlineOnLightTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineOnLightTransparentAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightTransparentAccentGradientActive.colors, DarkGradientTokens.OutlineOnLightTransparentAccentGradientActive.positions, DarkGradientTokens.OutlineOnLightTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineOnLightTransparentAccentGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightTransparentAccentGradient.colors, DarkGradientTokens.OutlineOnLightTransparentAccentGradient.positions, DarkGradientTokens.OutlineOnLightTransparentAccentGradient.angle)),
            overwrite)
    initial.add("outlineOnLightPromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightPromoGradientHover.colors, DarkGradientTokens.OutlineOnLightPromoGradientHover.positions, DarkGradientTokens.OutlineOnLightPromoGradientHover.angle)),
            overwrite)
    initial.add("outlineOnLightPromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightPromoGradientActive.colors, DarkGradientTokens.OutlineOnLightPromoGradientActive.positions, DarkGradientTokens.OutlineOnLightPromoGradientActive.angle)),
            overwrite)
    initial.add("outlineOnLightPromoGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightPromoGradient.colors, DarkGradientTokens.OutlineOnLightPromoGradient.positions, DarkGradientTokens.OutlineOnLightPromoGradient.angle)),
            overwrite)
    initial.add("outlineOnLightPromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightPromoMinorGradientHover.colors, DarkGradientTokens.OutlineOnLightPromoMinorGradientHover.positions, DarkGradientTokens.OutlineOnLightPromoMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineOnLightPromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightPromoMinorGradientActive.colors, DarkGradientTokens.OutlineOnLightPromoMinorGradientActive.positions, DarkGradientTokens.OutlineOnLightPromoMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineOnLightPromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightPromoMinorGradient.colors, DarkGradientTokens.OutlineOnLightPromoMinorGradient.positions, DarkGradientTokens.OutlineOnLightPromoMinorGradient.angle)),
            overwrite)
    initial.add("outlineOnLightAccentGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineOnLightAccentGradient.colors, DarkGradientTokens.OutlineOnLightAccentGradient.positions, DarkGradientTokens.OutlineOnLightAccentGradient.angle)),
            overwrite)
    initial.add("outlineInverseAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineInverseAccentGradientHover.colors, DarkGradientTokens.OutlineInverseAccentGradientHover.positions, DarkGradientTokens.OutlineInverseAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineInverseAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineInverseAccentGradientActive.colors, DarkGradientTokens.OutlineInverseAccentGradientActive.positions, DarkGradientTokens.OutlineInverseAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineInverseAccentMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineInverseAccentMinorGradientHover.colors, DarkGradientTokens.OutlineInverseAccentMinorGradientHover.positions, DarkGradientTokens.OutlineInverseAccentMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineInverseAccentMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineInverseAccentMinorGradientActive.colors, DarkGradientTokens.OutlineInverseAccentMinorGradientActive.positions, DarkGradientTokens.OutlineInverseAccentMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineInverseAccentMinorGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineInverseAccentMinorGradient.colors, DarkGradientTokens.OutlineInverseAccentMinorGradient.positions, DarkGradientTokens.OutlineInverseAccentMinorGradient.angle)),
            overwrite)
    initial.add("outlineInverseTransparentAccentGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineInverseTransparentAccentGradientHover.colors, DarkGradientTokens.OutlineInverseTransparentAccentGradientHover.positions, DarkGradientTokens.OutlineInverseTransparentAccentGradientHover.angle)),
            overwrite)
    initial.add("outlineInverseTransparentAccentGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineInverseTransparentAccentGradientActive.colors, DarkGradientTokens.OutlineInverseTransparentAccentGradientActive.positions, DarkGradientTokens.OutlineInverseTransparentAccentGradientActive.angle)),
            overwrite)
    initial.add("outlineInverseTransparentAccentGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineInverseTransparentAccentGradient.colors, DarkGradientTokens.OutlineInverseTransparentAccentGradient.positions, DarkGradientTokens.OutlineInverseTransparentAccentGradient.angle)),
            overwrite)
    initial.add("outlineInversePromoGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineInversePromoGradientHover.colors, DarkGradientTokens.OutlineInversePromoGradientHover.positions, DarkGradientTokens.OutlineInversePromoGradientHover.angle)),
            overwrite)
    initial.add("outlineInversePromoGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineInversePromoGradientActive.colors, DarkGradientTokens.OutlineInversePromoGradientActive.positions, DarkGradientTokens.OutlineInversePromoGradientActive.angle)),
            overwrite)
    initial.add("outlineInversePromoGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineInversePromoGradient.colors, DarkGradientTokens.OutlineInversePromoGradient.positions, DarkGradientTokens.OutlineInversePromoGradient.angle)),
            overwrite)
    initial.add("outlineInversePromoMinorGradientHover",
            listOf(linearGradient(DarkGradientTokens.OutlineInversePromoMinorGradientHover.colors, DarkGradientTokens.OutlineInversePromoMinorGradientHover.positions, DarkGradientTokens.OutlineInversePromoMinorGradientHover.angle)),
            overwrite)
    initial.add("outlineInversePromoMinorGradientActive",
            listOf(linearGradient(DarkGradientTokens.OutlineInversePromoMinorGradientActive.colors, DarkGradientTokens.OutlineInversePromoMinorGradientActive.positions, DarkGradientTokens.OutlineInversePromoMinorGradientActive.angle)),
            overwrite)
    initial.add("outlineInversePromoMinorGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineInversePromoMinorGradient.colors, DarkGradientTokens.OutlineInversePromoMinorGradient.positions, DarkGradientTokens.OutlineInversePromoMinorGradient.angle)),
            overwrite)
    initial.add("outlineInverseAccentGradient",
            listOf(linearGradient(DarkGradientTokens.OutlineInverseAccentGradient.colors, DarkGradientTokens.OutlineInverseAccentGradient.positions, DarkGradientTokens.OutlineInverseAccentGradient.angle)),
            overwrite)
    return SddsServGradients(initial)
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
