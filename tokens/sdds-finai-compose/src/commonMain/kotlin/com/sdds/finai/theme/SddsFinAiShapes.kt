// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.finai.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import com.sdds.finai.tokens.RoundShapeTokens
import com.sdds.finai.tokens.RoundShapeTokensBetaCore
import com.sdds.finai.tokens.RoundShapeTokensHighContrast

/**
 * Формы SddsFinAi
 */
@Immutable
public data class SddsFinAiShapes(
    /**
     * borderRadius circle
     */
    public val roundCircle: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius l
     */
    public val roundL: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius m
     */
    public val roundM: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius s
     */
    public val roundS: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius xl
     */
    public val roundXl: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius xs
     */
    public val roundXs: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius xxl
     */
    public val roundXxl: CornerBasedShape = RoundedCornerShape(0),
    /**
     * borderRadius xxs
     */
    public val roundXxs: CornerBasedShape = RoundedCornerShape(0),
)

internal val LocalSddsFinAiShapes: ProvidableCompositionLocal<SddsFinAiShapes> =
    staticCompositionLocalOf {
        SddsFinAiShapes()
    }

/**
 * Возвращает [SddsFinAiShapes]
 */
public fun defaultSddsFinAiShapes(): SddsFinAiShapes = SddsFinAiShapes(
    roundCircle = RoundShapeTokens.RoundCircle,
    roundL = RoundShapeTokens.RoundL,
    roundM = RoundShapeTokens.RoundM,
    roundS = RoundShapeTokens.RoundS,
    roundXl = RoundShapeTokens.RoundXl,
    roundXs = RoundShapeTokens.RoundXs,
    roundXxl = RoundShapeTokens.RoundXxl,
    roundXxs = RoundShapeTokens.RoundXxs,
)

/**
 * Возвращает [SddsFinAiShapes]
 */
public fun defaultSddsFinAiShapesBetaCore(): SddsFinAiShapes = SddsFinAiShapes(
    roundCircle = RoundShapeTokens.RoundCircle,
    roundL = RoundShapeTokensBetaCore.RoundL,
    roundM = RoundShapeTokensBetaCore.RoundM,
    roundS = RoundShapeTokensBetaCore.RoundS,
    roundXl = RoundShapeTokensBetaCore.RoundXl,
    roundXs = RoundShapeTokensBetaCore.RoundXs,
    roundXxl = RoundShapeTokensBetaCore.RoundXxl,
    roundXxs = RoundShapeTokens.RoundXxs,
)

/**
 * Возвращает [SddsFinAiShapes]
 */
public fun defaultSddsFinAiShapesHighContrast(): SddsFinAiShapes = SddsFinAiShapes(
    roundCircle = RoundShapeTokens.RoundCircle,
    roundL = RoundShapeTokensHighContrast.RoundL,
    roundM = RoundShapeTokensHighContrast.RoundM,
    roundS = RoundShapeTokensHighContrast.RoundS,
    roundXl = RoundShapeTokensHighContrast.RoundXl,
    roundXs = RoundShapeTokensHighContrast.RoundXs,
    roundXxl = RoundShapeTokensHighContrast.RoundXxl,
    roundXxs = RoundShapeTokens.RoundXxs,
)
