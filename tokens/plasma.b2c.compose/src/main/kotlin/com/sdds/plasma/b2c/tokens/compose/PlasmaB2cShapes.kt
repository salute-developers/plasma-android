// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.b2c.tokens.compose

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cShapes

/**
 * Формы PlasmaB2c
 */
@Immutable
public data class PlasmaB2cShapes(
    public val roundXxs: CornerBasedShape = RoundShapeTokens.RoundXxs,
    public val roundXs: CornerBasedShape = RoundShapeTokens.RoundXs,
    public val roundS: CornerBasedShape = RoundShapeTokens.RoundS,
    public val roundM: CornerBasedShape = RoundShapeTokens.RoundM,
    public val roundL: CornerBasedShape = RoundShapeTokens.RoundL,
    public val roundXl: CornerBasedShape = RoundShapeTokens.RoundXl,
    public val roundXxl: CornerBasedShape = RoundShapeTokens.RoundXxl,
)

internal val LocalPlasmaB2cShapes: ProvidableCompositionLocal<PlasmaB2cShapes> =
        staticCompositionLocalOf { PlasmaB2cShapes() }
