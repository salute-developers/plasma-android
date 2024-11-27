// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.tokens.compose

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import com.sdds.plasma.sd.service.tokens.compose.PlasmaSdServiceShapes

/**
 * Формы PlasmaSdService
 */
@Immutable
public data class PlasmaSdServiceShapes(
    public val roundXxs: CornerBasedShape = RoundedCornerShape(0),
    public val roundXs: CornerBasedShape = RoundedCornerShape(0),
    public val roundS: CornerBasedShape = RoundedCornerShape(0),
    public val roundM: CornerBasedShape = RoundedCornerShape(0),
    public val roundL: CornerBasedShape = RoundedCornerShape(0),
    public val roundXl: CornerBasedShape = RoundedCornerShape(0),
    public val roundXxl: CornerBasedShape = RoundedCornerShape(0),
)

internal val LocalPlasmaSdServiceShapes: ProvidableCompositionLocal<PlasmaSdServiceShapes> =
        staticCompositionLocalOf { PlasmaSdServiceShapes() }

/**
 * Возвращает [PlasmaSdServiceShapes]
 */
public fun defaultPlasmaSdServiceShapes(): PlasmaSdServiceShapes = PlasmaSdServiceShapes(
    roundXxs = RoundShapeTokens.RoundXxs,
    roundXs = RoundShapeTokens.RoundXs,
    roundS = RoundShapeTokens.RoundS,
    roundM = RoundShapeTokens.RoundM,
    roundL = RoundShapeTokens.RoundL,
    roundXl = RoundShapeTokens.RoundXl,
    roundXxl = RoundShapeTokens.RoundXxl,
)
