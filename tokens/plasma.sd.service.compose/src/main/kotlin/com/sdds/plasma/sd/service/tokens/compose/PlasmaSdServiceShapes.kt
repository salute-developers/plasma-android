// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.tokens.compose

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import com.sdds.plasma.sd.service.tokens.compose.PlasmaSdServiceShapes

/**
 * Формы PlasmaSdService
 */
@Immutable
public data class PlasmaSdServiceShapes(
    public val roundXxs: CornerBasedShape = RoundShapeTokens.RoundXxs,
    public val roundXs: CornerBasedShape = RoundShapeTokens.RoundXs,
    public val roundS: CornerBasedShape = RoundShapeTokens.RoundS,
    public val roundM: CornerBasedShape = RoundShapeTokens.RoundM,
    public val roundL: CornerBasedShape = RoundShapeTokens.RoundL,
    public val roundXl: CornerBasedShape = RoundShapeTokens.RoundXl,
    public val roundXxl: CornerBasedShape = RoundShapeTokens.RoundXxl,
)

internal val LocalPlasmaSdServiceShapes: ProvidableCompositionLocal<PlasmaSdServiceShapes> =
        staticCompositionLocalOf { PlasmaSdServiceShapes() }
