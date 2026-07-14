// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.DpOffset
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.shadow.ShadowLayer
import com.sdds.serv.tokens.ShadowTokens
import kotlin.Suppress

/**
 * Тени SddsServ
 */
@Immutable
public data class SddsServShadows(
    /**
     * shadow down soft s
     */
    public val downSoftS: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow down soft m
     */
    public val downSoftM: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow down soft l
     */
    public val downSoftL: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow down hard s
     */
    public val downHardS: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow down hard m
     */
    public val downHardM: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow down hard l
     */
    public val downHardL: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up soft s
     */
    public val upSoftS: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up soft m
     */
    public val upSoftM: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up soft l
     */
    public val upSoftL: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up hard s
     */
    public val upHardS: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up hard m
     */
    public val upHardM: ShadowAppearance = ShadowAppearance(),
    /**
     * shadow up hard l
     */
    public val upHardL: ShadowAppearance = ShadowAppearance(),
)

internal val LocalSddsServShadows: ProvidableCompositionLocal<SddsServShadows> =
    staticCompositionLocalOf {
        SddsServShadows()
    }

/**
 * Возвращает [SddsServShadows]
 */
@Suppress("LongMethod")
public fun defaultSddsServShadows(): SddsServShadows = SddsServShadows(
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
)
