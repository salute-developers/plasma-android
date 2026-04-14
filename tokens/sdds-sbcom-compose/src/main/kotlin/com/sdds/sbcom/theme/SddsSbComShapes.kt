// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.sbcom.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import com.sdds.sbcom.tokens.RoundShapeTokens

/**
 * Формы SddsSbCom
 */
@Immutable
public data class SddsSbComShapes(
    /**
     * borderRadius 2xl
     */
    public val roundXxl: CornerBasedShape = RoundedCornerShape(0),
    /**
     * New description
     */
    public val round4xl: CornerBasedShape = RoundedCornerShape(0),
    /**
     * New description
     */
    public val round5xl: CornerBasedShape = RoundedCornerShape(0),
    /**
     * New description
     */
    public val round3xl: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius l
     */
    public val roundL: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius xl
     */
    public val roundXl: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius m
     */
    public val roundM: CornerBasedShape = RoundedCornerShape(0),
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
     * New description
     */
    public val roundCircle: CornerBasedShape = RoundedCornerShape(0),
)

internal val LocalSddsSbComShapes: ProvidableCompositionLocal<SddsSbComShapes> =
    staticCompositionLocalOf {
        SddsSbComShapes()
    }

/**
 * Возвращает [SddsSbComShapes]
 */
public fun defaultSddsSbComShapes(): SddsSbComShapes = SddsSbComShapes(
    roundXxl = RoundShapeTokens.RoundXxl,
    round4xl = RoundShapeTokens.Round4xl,
    round5xl = RoundShapeTokens.Round5xl,
    round3xl = RoundShapeTokens.Round3xl,
    roundL = RoundShapeTokens.RoundL,
    roundXl = RoundShapeTokens.RoundXl,
    roundM = RoundShapeTokens.RoundM,
    roundXxs = RoundShapeTokens.RoundXxs,
    roundXs = RoundShapeTokens.RoundXs,
    roundS = RoundShapeTokens.RoundS,
    roundCircle = RoundShapeTokens.RoundCircle,
)
