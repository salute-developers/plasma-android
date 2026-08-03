// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.serv.tokens.SpacingTokens

/**
 * Отступы SddsServ
 */
@Immutable
public data class SddsServSpacing(
    /**
     * spacing 0x
     */
    public val spacing0x: Dp = 0.dp,
    /**
     * spacing 1x
     */
    public val spacing1x: Dp = 0.dp,
    /**
     * spacing 2x
     */
    public val spacing2x: Dp = 0.dp,
    /**
     * spacing 3x
     */
    public val spacing3x: Dp = 0.dp,
    /**
     * spacing 4x
     */
    public val spacing4x: Dp = 0.dp,
    /**
     * spacing 6x
     */
    public val spacing6x: Dp = 0.dp,
    /**
     * spacing 8x
     */
    public val spacing8x: Dp = 0.dp,
    /**
     * spacing 10x
     */
    public val spacing10x: Dp = 0.dp,
    /**
     * spacing 12x
     */
    public val spacing12x: Dp = 0.dp,
    /**
     * spacing 16x
     */
    public val spacing16x: Dp = 0.dp,
    /**
     * spacing 20x
     */
    public val spacing20x: Dp = 0.dp,
    /**
     * spacing 24x
     */
    public val spacing24x: Dp = 0.dp,
    /**
     * spacing 32x
     */
    public val spacing32x: Dp = 0.dp,
    /**
     * spacing 40x
     */
    public val spacing40x: Dp = 0.dp,
    /**
     * spacing 60x
     */
    public val spacing60x: Dp = 0.dp,
)

internal val LocalSddsServSpacing: ProvidableCompositionLocal<SddsServSpacing> =
    staticCompositionLocalOf {
        SddsServSpacing()
    }

/**
 * Возвращает [SddsServSpacing]
 */
public fun defaultSddsServSpacing(): SddsServSpacing = SddsServSpacing(
    spacing0x = SpacingTokens.spacing0x,
    spacing1x = SpacingTokens.spacing1x,
    spacing2x = SpacingTokens.spacing2x,
    spacing3x = SpacingTokens.spacing3x,
    spacing4x = SpacingTokens.spacing4x,
    spacing6x = SpacingTokens.spacing6x,
    spacing8x = SpacingTokens.spacing8x,
    spacing10x = SpacingTokens.spacing10x,
    spacing12x = SpacingTokens.spacing12x,
    spacing16x = SpacingTokens.spacing16x,
    spacing20x = SpacingTokens.spacing20x,
    spacing24x = SpacingTokens.spacing24x,
    spacing32x = SpacingTokens.spacing32x,
    spacing40x = SpacingTokens.spacing40x,
    spacing60x = SpacingTokens.spacing60x,
)
