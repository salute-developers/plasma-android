// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.giga.app.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import com.sdds.plasma.giga.app.tokens.RoundShapeTokens

/**
 * Формы PlasmaGigaApp
 */
@Immutable
public data class PlasmaGigaAppShapes(
    /**
     * borderRadius xxs
     */
    public val roundXxs: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius xs
     */
    public val roundXs: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius s
     */
    public val roundS: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius m
     */
    public val roundM: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius l
     */
    public val roundL: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius xl
     */
    public val roundXl: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius xxl
     */
    public val roundXxl: CornerBasedShape = RoundedCornerShape(0),
)

internal val LocalPlasmaGigaAppShapes: ProvidableCompositionLocal<PlasmaGigaAppShapes> =
    staticCompositionLocalOf {
        PlasmaGigaAppShapes()
    }

/**
 * Возвращает [PlasmaGigaAppShapes]
 */
public fun defaultPlasmaGigaAppShapes(): PlasmaGigaAppShapes = PlasmaGigaAppShapes(
    roundXxs = RoundShapeTokens.RoundXxs,
    roundXs = RoundShapeTokens.RoundXs,
    roundS = RoundShapeTokens.RoundS,
    roundM = RoundShapeTokens.RoundM,
    roundL = RoundShapeTokens.RoundL,
    roundXl = RoundShapeTokens.RoundXl,
    roundXxl = RoundShapeTokens.RoundXxl,
)
