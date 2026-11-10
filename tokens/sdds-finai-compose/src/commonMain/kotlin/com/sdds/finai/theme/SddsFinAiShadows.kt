// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.finai.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.DpOffset
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.shadow.ShadowLayer
import com.sdds.finai.tokens.ShadowTokens
import com.sdds.finai.tokens.ShadowTokensBetaCore
import com.sdds.finai.tokens.ShadowTokensHighContrast
import kotlin.Suppress

/**
 * Тени SddsFinAi
 */
@Immutable
public data class SddsFinAiShadows(
    /**
     * shadow down hard l
     */
    public val downHardL: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow down hard m
     */
    public val downHardM: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow down hard s
     */
    public val downHardS: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow down soft l
     */
    public val downSoftL: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow down soft m
     */
    public val downSoftM: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow down soft s
     */
    public val downSoftS: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow gradient dark
     */
    public val gradientDark: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow gradient light
     */
    public val gradientLight: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up hard l
     */
    public val upHardL: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up hard m
     */
    public val upHardM: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up hard s
     */
    public val upHardS: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up soft l
     */
    public val upSoftL: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up soft m
     */
    public val upSoftM: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up soft s
     */
    public val upSoftS: ShadowAppearance = ShadowAppearance(),
)

internal val LocalSddsFinAiShadows: ProvidableCompositionLocal<SddsFinAiShadows> =
    staticCompositionLocalOf {
        SddsFinAiShadows()
    }

/**
 * Возвращает [SddsFinAiShadows]
 */
@Suppress("LongMethod")
public fun defaultSddsFinAiShadows(): SddsFinAiShadows = SddsFinAiShadows(
    downHardL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.DownHardL.offsetX,
                    y = ShadowTokens.DownHardL.offsetY,
                ),
                spreadRadius = ShadowTokens.DownHardL.spreadRadius,
                blurRadius = ShadowTokens.DownHardL.blurRadius,
                color = ShadowTokens.DownHardL.color,
                fallbackElevation = ShadowTokens.DownHardL.fallbackElevation,
            ),
        ),
    ),
    downHardM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.DownHardM.offsetX,
                    y = ShadowTokens.DownHardM.offsetY,
                ),
                spreadRadius = ShadowTokens.DownHardM.spreadRadius,
                blurRadius = ShadowTokens.DownHardM.blurRadius,
                color = ShadowTokens.DownHardM.color,
                fallbackElevation = ShadowTokens.DownHardM.fallbackElevation,
            ),
        ),
    ),
    downHardS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.DownHardSLayer1.offsetX,
                    y = ShadowTokens.DownHardSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokens.DownHardSLayer1.spreadRadius,
                blurRadius = ShadowTokens.DownHardSLayer1.blurRadius,
                color = ShadowTokens.DownHardSLayer1.color,
                fallbackElevation = ShadowTokens.DownHardSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.DownHardSLayer2.offsetX,
                    y = ShadowTokens.DownHardSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokens.DownHardSLayer2.spreadRadius,
                blurRadius = ShadowTokens.DownHardSLayer2.blurRadius,
                color = ShadowTokens.DownHardSLayer2.color,
                fallbackElevation = ShadowTokens.DownHardSLayer2.fallbackElevation,
            ),
        ),
    ),
    downSoftL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.DownSoftL.offsetX,
                    y = ShadowTokens.DownSoftL.offsetY,
                ),
                spreadRadius = ShadowTokens.DownSoftL.spreadRadius,
                blurRadius = ShadowTokens.DownSoftL.blurRadius,
                color = ShadowTokens.DownSoftL.color,
                fallbackElevation = ShadowTokens.DownSoftL.fallbackElevation,
            ),
        ),
    ),
    downSoftM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.DownSoftM.offsetX,
                    y = ShadowTokens.DownSoftM.offsetY,
                ),
                spreadRadius = ShadowTokens.DownSoftM.spreadRadius,
                blurRadius = ShadowTokens.DownSoftM.blurRadius,
                color = ShadowTokens.DownSoftM.color,
                fallbackElevation = ShadowTokens.DownSoftM.fallbackElevation,
            ),
        ),
    ),
    downSoftS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.DownSoftSLayer1.offsetX,
                    y = ShadowTokens.DownSoftSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokens.DownSoftSLayer1.spreadRadius,
                blurRadius = ShadowTokens.DownSoftSLayer1.blurRadius,
                color = ShadowTokens.DownSoftSLayer1.color,
                fallbackElevation = ShadowTokens.DownSoftSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.DownSoftSLayer2.offsetX,
                    y = ShadowTokens.DownSoftSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokens.DownSoftSLayer2.spreadRadius,
                blurRadius = ShadowTokens.DownSoftSLayer2.blurRadius,
                color = ShadowTokens.DownSoftSLayer2.color,
                fallbackElevation = ShadowTokens.DownSoftSLayer2.fallbackElevation,
            ),
        ),
    ),
    gradientDark = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientDarkLayer1.offsetX,
                    y = ShadowTokens.GradientDarkLayer1.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientDarkLayer1.spreadRadius,
                blurRadius = ShadowTokens.GradientDarkLayer1.blurRadius,
                color = ShadowTokens.GradientDarkLayer1.color,
                fallbackElevation = ShadowTokens.GradientDarkLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientDarkLayer2.offsetX,
                    y = ShadowTokens.GradientDarkLayer2.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientDarkLayer2.spreadRadius,
                blurRadius = ShadowTokens.GradientDarkLayer2.blurRadius,
                color = ShadowTokens.GradientDarkLayer2.color,
                fallbackElevation = ShadowTokens.GradientDarkLayer2.fallbackElevation,
            ),
        ),
    ),
    gradientLight = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientLightLayer1.offsetX,
                    y = ShadowTokens.GradientLightLayer1.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientLightLayer1.spreadRadius,
                blurRadius = ShadowTokens.GradientLightLayer1.blurRadius,
                color = ShadowTokens.GradientLightLayer1.color,
                fallbackElevation = ShadowTokens.GradientLightLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientLightLayer2.offsetX,
                    y = ShadowTokens.GradientLightLayer2.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientLightLayer2.spreadRadius,
                blurRadius = ShadowTokens.GradientLightLayer2.blurRadius,
                color = ShadowTokens.GradientLightLayer2.color,
                fallbackElevation = ShadowTokens.GradientLightLayer2.fallbackElevation,
            ),
        ),
    ),
    upHardL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.UpHardL.offsetX,
                    y = ShadowTokens.UpHardL.offsetY,
                ),
                spreadRadius = ShadowTokens.UpHardL.spreadRadius,
                blurRadius = ShadowTokens.UpHardL.blurRadius,
                color = ShadowTokens.UpHardL.color,
                fallbackElevation = ShadowTokens.UpHardL.fallbackElevation,
            ),
        ),
    ),
    upHardM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.UpHardM.offsetX,
                    y = ShadowTokens.UpHardM.offsetY,
                ),
                spreadRadius = ShadowTokens.UpHardM.spreadRadius,
                blurRadius = ShadowTokens.UpHardM.blurRadius,
                color = ShadowTokens.UpHardM.color,
                fallbackElevation = ShadowTokens.UpHardM.fallbackElevation,
            ),
        ),
    ),
    upHardS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.UpHardSLayer1.offsetX,
                    y = ShadowTokens.UpHardSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokens.UpHardSLayer1.spreadRadius,
                blurRadius = ShadowTokens.UpHardSLayer1.blurRadius,
                color = ShadowTokens.UpHardSLayer1.color,
                fallbackElevation = ShadowTokens.UpHardSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.UpHardSLayer2.offsetX,
                    y = ShadowTokens.UpHardSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokens.UpHardSLayer2.spreadRadius,
                blurRadius = ShadowTokens.UpHardSLayer2.blurRadius,
                color = ShadowTokens.UpHardSLayer2.color,
                fallbackElevation = ShadowTokens.UpHardSLayer2.fallbackElevation,
            ),
        ),
    ),
    upSoftL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.UpSoftL.offsetX,
                    y = ShadowTokens.UpSoftL.offsetY,
                ),
                spreadRadius = ShadowTokens.UpSoftL.spreadRadius,
                blurRadius = ShadowTokens.UpSoftL.blurRadius,
                color = ShadowTokens.UpSoftL.color,
                fallbackElevation = ShadowTokens.UpSoftL.fallbackElevation,
            ),
        ),
    ),
    upSoftM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.UpSoftM.offsetX,
                    y = ShadowTokens.UpSoftM.offsetY,
                ),
                spreadRadius = ShadowTokens.UpSoftM.spreadRadius,
                blurRadius = ShadowTokens.UpSoftM.blurRadius,
                color = ShadowTokens.UpSoftM.color,
                fallbackElevation = ShadowTokens.UpSoftM.fallbackElevation,
            ),
        ),
    ),
    upSoftS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.UpSoftSLayer1.offsetX,
                    y = ShadowTokens.UpSoftSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokens.UpSoftSLayer1.spreadRadius,
                blurRadius = ShadowTokens.UpSoftSLayer1.blurRadius,
                color = ShadowTokens.UpSoftSLayer1.color,
                fallbackElevation = ShadowTokens.UpSoftSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.UpSoftSLayer2.offsetX,
                    y = ShadowTokens.UpSoftSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokens.UpSoftSLayer2.spreadRadius,
                blurRadius = ShadowTokens.UpSoftSLayer2.blurRadius,
                color = ShadowTokens.UpSoftSLayer2.color,
                fallbackElevation = ShadowTokens.UpSoftSLayer2.fallbackElevation,
            ),
        ),
    ),
)

/**
 * Возвращает [SddsFinAiShadows]
 */
@Suppress("LongMethod")
public fun defaultSddsFinAiShadowsBetaCore(): SddsFinAiShadows = SddsFinAiShadows(
    downHardL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.DownHardL.offsetX,
                    y = ShadowTokensBetaCore.DownHardL.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.DownHardL.spreadRadius,
                blurRadius = ShadowTokensBetaCore.DownHardL.blurRadius,
                color = ShadowTokensBetaCore.DownHardL.color,
                fallbackElevation = ShadowTokensBetaCore.DownHardL.fallbackElevation,
            ),
        ),
    ),
    downHardM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.DownHardM.offsetX,
                    y = ShadowTokensBetaCore.DownHardM.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.DownHardM.spreadRadius,
                blurRadius = ShadowTokensBetaCore.DownHardM.blurRadius,
                color = ShadowTokensBetaCore.DownHardM.color,
                fallbackElevation = ShadowTokensBetaCore.DownHardM.fallbackElevation,
            ),
        ),
    ),
    downHardS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.DownHardSLayer1.offsetX,
                    y = ShadowTokensBetaCore.DownHardSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.DownHardSLayer1.spreadRadius,
                blurRadius = ShadowTokensBetaCore.DownHardSLayer1.blurRadius,
                color = ShadowTokensBetaCore.DownHardSLayer1.color,
                fallbackElevation = ShadowTokensBetaCore.DownHardSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.DownHardSLayer2.offsetX,
                    y = ShadowTokensBetaCore.DownHardSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.DownHardSLayer2.spreadRadius,
                blurRadius = ShadowTokensBetaCore.DownHardSLayer2.blurRadius,
                color = ShadowTokensBetaCore.DownHardSLayer2.color,
                fallbackElevation = ShadowTokensBetaCore.DownHardSLayer2.fallbackElevation,
            ),
        ),
    ),
    downSoftL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.DownSoftL.offsetX,
                    y = ShadowTokensBetaCore.DownSoftL.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.DownSoftL.spreadRadius,
                blurRadius = ShadowTokensBetaCore.DownSoftL.blurRadius,
                color = ShadowTokensBetaCore.DownSoftL.color,
                fallbackElevation = ShadowTokensBetaCore.DownSoftL.fallbackElevation,
            ),
        ),
    ),
    downSoftM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.DownSoftM.offsetX,
                    y = ShadowTokensBetaCore.DownSoftM.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.DownSoftM.spreadRadius,
                blurRadius = ShadowTokensBetaCore.DownSoftM.blurRadius,
                color = ShadowTokensBetaCore.DownSoftM.color,
                fallbackElevation = ShadowTokensBetaCore.DownSoftM.fallbackElevation,
            ),
        ),
    ),
    downSoftS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.DownSoftSLayer1.offsetX,
                    y = ShadowTokensBetaCore.DownSoftSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.DownSoftSLayer1.spreadRadius,
                blurRadius = ShadowTokensBetaCore.DownSoftSLayer1.blurRadius,
                color = ShadowTokensBetaCore.DownSoftSLayer1.color,
                fallbackElevation = ShadowTokensBetaCore.DownSoftSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.DownSoftSLayer2.offsetX,
                    y = ShadowTokensBetaCore.DownSoftSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.DownSoftSLayer2.spreadRadius,
                blurRadius = ShadowTokensBetaCore.DownSoftSLayer2.blurRadius,
                color = ShadowTokensBetaCore.DownSoftSLayer2.color,
                fallbackElevation = ShadowTokensBetaCore.DownSoftSLayer2.fallbackElevation,
            ),
        ),
    ),
    gradientDark = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientDarkLayer1.offsetX,
                    y = ShadowTokens.GradientDarkLayer1.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientDarkLayer1.spreadRadius,
                blurRadius = ShadowTokens.GradientDarkLayer1.blurRadius,
                color = ShadowTokens.GradientDarkLayer1.color,
                fallbackElevation = ShadowTokens.GradientDarkLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientDarkLayer2.offsetX,
                    y = ShadowTokens.GradientDarkLayer2.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientDarkLayer2.spreadRadius,
                blurRadius = ShadowTokens.GradientDarkLayer2.blurRadius,
                color = ShadowTokens.GradientDarkLayer2.color,
                fallbackElevation = ShadowTokens.GradientDarkLayer2.fallbackElevation,
            ),
        ),
    ),
    gradientLight = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientLightLayer1.offsetX,
                    y = ShadowTokens.GradientLightLayer1.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientLightLayer1.spreadRadius,
                blurRadius = ShadowTokens.GradientLightLayer1.blurRadius,
                color = ShadowTokens.GradientLightLayer1.color,
                fallbackElevation = ShadowTokens.GradientLightLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientLightLayer2.offsetX,
                    y = ShadowTokens.GradientLightLayer2.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientLightLayer2.spreadRadius,
                blurRadius = ShadowTokens.GradientLightLayer2.blurRadius,
                color = ShadowTokens.GradientLightLayer2.color,
                fallbackElevation = ShadowTokens.GradientLightLayer2.fallbackElevation,
            ),
        ),
    ),
    upHardL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.UpHardL.offsetX,
                    y = ShadowTokensBetaCore.UpHardL.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.UpHardL.spreadRadius,
                blurRadius = ShadowTokensBetaCore.UpHardL.blurRadius,
                color = ShadowTokensBetaCore.UpHardL.color,
                fallbackElevation = ShadowTokensBetaCore.UpHardL.fallbackElevation,
            ),
        ),
    ),
    upHardM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.UpHardM.offsetX,
                    y = ShadowTokensBetaCore.UpHardM.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.UpHardM.spreadRadius,
                blurRadius = ShadowTokensBetaCore.UpHardM.blurRadius,
                color = ShadowTokensBetaCore.UpHardM.color,
                fallbackElevation = ShadowTokensBetaCore.UpHardM.fallbackElevation,
            ),
        ),
    ),
    upHardS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.UpHardSLayer1.offsetX,
                    y = ShadowTokensBetaCore.UpHardSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.UpHardSLayer1.spreadRadius,
                blurRadius = ShadowTokensBetaCore.UpHardSLayer1.blurRadius,
                color = ShadowTokensBetaCore.UpHardSLayer1.color,
                fallbackElevation = ShadowTokensBetaCore.UpHardSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.UpHardSLayer2.offsetX,
                    y = ShadowTokensBetaCore.UpHardSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.UpHardSLayer2.spreadRadius,
                blurRadius = ShadowTokensBetaCore.UpHardSLayer2.blurRadius,
                color = ShadowTokensBetaCore.UpHardSLayer2.color,
                fallbackElevation = ShadowTokensBetaCore.UpHardSLayer2.fallbackElevation,
            ),
        ),
    ),
    upSoftL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.UpSoftL.offsetX,
                    y = ShadowTokensBetaCore.UpSoftL.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.UpSoftL.spreadRadius,
                blurRadius = ShadowTokensBetaCore.UpSoftL.blurRadius,
                color = ShadowTokensBetaCore.UpSoftL.color,
                fallbackElevation = ShadowTokensBetaCore.UpSoftL.fallbackElevation,
            ),
        ),
    ),
    upSoftM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.UpSoftM.offsetX,
                    y = ShadowTokensBetaCore.UpSoftM.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.UpSoftM.spreadRadius,
                blurRadius = ShadowTokensBetaCore.UpSoftM.blurRadius,
                color = ShadowTokensBetaCore.UpSoftM.color,
                fallbackElevation = ShadowTokensBetaCore.UpSoftM.fallbackElevation,
            ),
        ),
    ),
    upSoftS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.UpSoftSLayer1.offsetX,
                    y = ShadowTokensBetaCore.UpSoftSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.UpSoftSLayer1.spreadRadius,
                blurRadius = ShadowTokensBetaCore.UpSoftSLayer1.blurRadius,
                color = ShadowTokensBetaCore.UpSoftSLayer1.color,
                fallbackElevation = ShadowTokensBetaCore.UpSoftSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensBetaCore.UpSoftSLayer2.offsetX,
                    y = ShadowTokensBetaCore.UpSoftSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokensBetaCore.UpSoftSLayer2.spreadRadius,
                blurRadius = ShadowTokensBetaCore.UpSoftSLayer2.blurRadius,
                color = ShadowTokensBetaCore.UpSoftSLayer2.color,
                fallbackElevation = ShadowTokensBetaCore.UpSoftSLayer2.fallbackElevation,
            ),
        ),
    ),
)

/**
 * Возвращает [SddsFinAiShadows]
 */
@Suppress("LongMethod")
public fun defaultSddsFinAiShadowsHighContrast(): SddsFinAiShadows = SddsFinAiShadows(
    downHardL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.DownHardL.offsetX,
                    y = ShadowTokensHighContrast.DownHardL.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.DownHardL.spreadRadius,
                blurRadius = ShadowTokensHighContrast.DownHardL.blurRadius,
                color = ShadowTokensHighContrast.DownHardL.color,
                fallbackElevation = ShadowTokensHighContrast.DownHardL.fallbackElevation,
            ),
        ),
    ),
    downHardM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.DownHardM.offsetX,
                    y = ShadowTokensHighContrast.DownHardM.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.DownHardM.spreadRadius,
                blurRadius = ShadowTokensHighContrast.DownHardM.blurRadius,
                color = ShadowTokensHighContrast.DownHardM.color,
                fallbackElevation = ShadowTokensHighContrast.DownHardM.fallbackElevation,
            ),
        ),
    ),
    downHardS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.DownHardSLayer1.offsetX,
                    y = ShadowTokensHighContrast.DownHardSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.DownHardSLayer1.spreadRadius,
                blurRadius = ShadowTokensHighContrast.DownHardSLayer1.blurRadius,
                color = ShadowTokensHighContrast.DownHardSLayer1.color,
                fallbackElevation = ShadowTokensHighContrast.DownHardSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.DownHardSLayer2.offsetX,
                    y = ShadowTokensHighContrast.DownHardSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.DownHardSLayer2.spreadRadius,
                blurRadius = ShadowTokensHighContrast.DownHardSLayer2.blurRadius,
                color = ShadowTokensHighContrast.DownHardSLayer2.color,
                fallbackElevation = ShadowTokensHighContrast.DownHardSLayer2.fallbackElevation,
            ),
        ),
    ),
    downSoftL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.DownSoftL.offsetX,
                    y = ShadowTokensHighContrast.DownSoftL.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.DownSoftL.spreadRadius,
                blurRadius = ShadowTokensHighContrast.DownSoftL.blurRadius,
                color = ShadowTokensHighContrast.DownSoftL.color,
                fallbackElevation = ShadowTokensHighContrast.DownSoftL.fallbackElevation,
            ),
        ),
    ),
    downSoftM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.DownSoftM.offsetX,
                    y = ShadowTokensHighContrast.DownSoftM.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.DownSoftM.spreadRadius,
                blurRadius = ShadowTokensHighContrast.DownSoftM.blurRadius,
                color = ShadowTokensHighContrast.DownSoftM.color,
                fallbackElevation = ShadowTokensHighContrast.DownSoftM.fallbackElevation,
            ),
        ),
    ),
    downSoftS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.DownSoftSLayer1.offsetX,
                    y = ShadowTokensHighContrast.DownSoftSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.DownSoftSLayer1.spreadRadius,
                blurRadius = ShadowTokensHighContrast.DownSoftSLayer1.blurRadius,
                color = ShadowTokensHighContrast.DownSoftSLayer1.color,
                fallbackElevation = ShadowTokensHighContrast.DownSoftSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.DownSoftSLayer2.offsetX,
                    y = ShadowTokensHighContrast.DownSoftSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.DownSoftSLayer2.spreadRadius,
                blurRadius = ShadowTokensHighContrast.DownSoftSLayer2.blurRadius,
                color = ShadowTokensHighContrast.DownSoftSLayer2.color,
                fallbackElevation = ShadowTokensHighContrast.DownSoftSLayer2.fallbackElevation,
            ),
        ),
    ),
    gradientDark = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientDarkLayer1.offsetX,
                    y = ShadowTokens.GradientDarkLayer1.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientDarkLayer1.spreadRadius,
                blurRadius = ShadowTokens.GradientDarkLayer1.blurRadius,
                color = ShadowTokens.GradientDarkLayer1.color,
                fallbackElevation = ShadowTokens.GradientDarkLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientDarkLayer2.offsetX,
                    y = ShadowTokens.GradientDarkLayer2.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientDarkLayer2.spreadRadius,
                blurRadius = ShadowTokens.GradientDarkLayer2.blurRadius,
                color = ShadowTokens.GradientDarkLayer2.color,
                fallbackElevation = ShadowTokens.GradientDarkLayer2.fallbackElevation,
            ),
        ),
    ),
    gradientLight = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientLightLayer1.offsetX,
                    y = ShadowTokens.GradientLightLayer1.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientLightLayer1.spreadRadius,
                blurRadius = ShadowTokens.GradientLightLayer1.blurRadius,
                color = ShadowTokens.GradientLightLayer1.color,
                fallbackElevation = ShadowTokens.GradientLightLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokens.GradientLightLayer2.offsetX,
                    y = ShadowTokens.GradientLightLayer2.offsetY,
                ),
                spreadRadius = ShadowTokens.GradientLightLayer2.spreadRadius,
                blurRadius = ShadowTokens.GradientLightLayer2.blurRadius,
                color = ShadowTokens.GradientLightLayer2.color,
                fallbackElevation = ShadowTokens.GradientLightLayer2.fallbackElevation,
            ),
        ),
    ),
    upHardL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.UpHardL.offsetX,
                    y = ShadowTokensHighContrast.UpHardL.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.UpHardL.spreadRadius,
                blurRadius = ShadowTokensHighContrast.UpHardL.blurRadius,
                color = ShadowTokensHighContrast.UpHardL.color,
                fallbackElevation = ShadowTokensHighContrast.UpHardL.fallbackElevation,
            ),
        ),
    ),
    upHardM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.UpHardM.offsetX,
                    y = ShadowTokensHighContrast.UpHardM.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.UpHardM.spreadRadius,
                blurRadius = ShadowTokensHighContrast.UpHardM.blurRadius,
                color = ShadowTokensHighContrast.UpHardM.color,
                fallbackElevation = ShadowTokensHighContrast.UpHardM.fallbackElevation,
            ),
        ),
    ),
    upHardS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.UpHardSLayer1.offsetX,
                    y = ShadowTokensHighContrast.UpHardSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.UpHardSLayer1.spreadRadius,
                blurRadius = ShadowTokensHighContrast.UpHardSLayer1.blurRadius,
                color = ShadowTokensHighContrast.UpHardSLayer1.color,
                fallbackElevation = ShadowTokensHighContrast.UpHardSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.UpHardSLayer2.offsetX,
                    y = ShadowTokensHighContrast.UpHardSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.UpHardSLayer2.spreadRadius,
                blurRadius = ShadowTokensHighContrast.UpHardSLayer2.blurRadius,
                color = ShadowTokensHighContrast.UpHardSLayer2.color,
                fallbackElevation = ShadowTokensHighContrast.UpHardSLayer2.fallbackElevation,
            ),
        ),
    ),
    upSoftL = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.UpSoftL.offsetX,
                    y = ShadowTokensHighContrast.UpSoftL.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.UpSoftL.spreadRadius,
                blurRadius = ShadowTokensHighContrast.UpSoftL.blurRadius,
                color = ShadowTokensHighContrast.UpSoftL.color,
                fallbackElevation = ShadowTokensHighContrast.UpSoftL.fallbackElevation,
            ),
        ),
    ),
    upSoftM = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.UpSoftM.offsetX,
                    y = ShadowTokensHighContrast.UpSoftM.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.UpSoftM.spreadRadius,
                blurRadius = ShadowTokensHighContrast.UpSoftM.blurRadius,
                color = ShadowTokensHighContrast.UpSoftM.color,
                fallbackElevation = ShadowTokensHighContrast.UpSoftM.fallbackElevation,
            ),
        ),
    ),
    upSoftS = ShadowAppearance(
        listOf(
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.UpSoftSLayer1.offsetX,
                    y = ShadowTokensHighContrast.UpSoftSLayer1.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.UpSoftSLayer1.spreadRadius,
                blurRadius = ShadowTokensHighContrast.UpSoftSLayer1.blurRadius,
                color = ShadowTokensHighContrast.UpSoftSLayer1.color,
                fallbackElevation = ShadowTokensHighContrast.UpSoftSLayer1.fallbackElevation,
            ),
            ShadowLayer(
                offset = DpOffset(
                    x = ShadowTokensHighContrast.UpSoftSLayer2.offsetX,
                    y = ShadowTokensHighContrast.UpSoftSLayer2.offsetY,
                ),
                spreadRadius = ShadowTokensHighContrast.UpSoftSLayer2.spreadRadius,
                blurRadius = ShadowTokensHighContrast.UpSoftSLayer2.blurRadius,
                color = ShadowTokensHighContrast.UpSoftSLayer2.color,
                fallbackElevation = ShadowTokensHighContrast.UpSoftSLayer2.fallbackElevation,
            ),
        ),
    ),
)
