// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.aiinput

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ai.AiInputStyle
import com.sdds.compose.uikit.ai.AiInputStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента AiInput
 */
public enum class AiInputStyles(
    public val key: String,
) {
    AiInputCondensedXs("AiInputCondensed.Xs"),
    AiInputCondensedS("AiInputCondensed.S"),
    AiInputCondensedM("AiInputCondensed.M"),
    AiInputCondensedL("AiInputCondensed.L"),
    AiInputCondensedXl("AiInputCondensed.Xl"),
    AiInputExtendedXs("AiInputExtended.Xs"),
    AiInputExtendedS("AiInputExtended.S"),
    AiInputExtendedM("AiInputExtended.M"),
    AiInputExtendedL("AiInputExtended.L"),
    AiInputExtendedXl("AiInputExtended.Xl"),
    ;

    /**
     * Typed API для подбора стиля ai-input-condensed
     */
    public object Condensed

    /**
     * Typed API для подбора стиля ai-input-extended
     */
    public object Extended
}

/**
 * Возможные значения свойства size для ai-input-condensed
 */
public enum class AiInputCondensedSize {
    Xs,
    S,
    M,
    L,
    Xl,
}

/**
 * Возможные значения свойства size для ai-input-extended
 */
public enum class AiInputExtendedSize {
    Xs,
    S,
    M,
    L,
    Xl,
}

/**
 * Возвращает [AiInputStyle] для [AiInputStyles]
 */
@Composable
public fun AiInputStyles.style(modify: @Composable AiInputStyleBuilder.() -> Unit = {}): AiInputStyle {
    val builder = when (this) {
        AiInputStyles.AiInputCondensedXs -> AiInputCondensed.Xs
        AiInputStyles.AiInputCondensedS -> AiInputCondensed.S
        AiInputStyles.AiInputCondensedM -> AiInputCondensed.M
        AiInputStyles.AiInputCondensedL -> AiInputCondensed.L
        AiInputStyles.AiInputCondensedXl -> AiInputCondensed.Xl
        AiInputStyles.AiInputExtendedXs -> AiInputExtended.Xs
        AiInputStyles.AiInputExtendedS -> AiInputExtended.S
        AiInputStyles.AiInputExtendedM -> AiInputExtended.M
        AiInputStyles.AiInputExtendedL -> AiInputExtended.L
        AiInputStyles.AiInputExtendedXl -> AiInputExtended.Xl
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AiInputStyles] для ai-input-condensed
 */
public fun AiInputStyles.Condensed.resolve(size: AiInputCondensedSize = AiInputCondensedSize.M): AiInputStyles = when {
    size == AiInputCondensedSize.Xs -> AiInputStyles.AiInputCondensedXs
    size == AiInputCondensedSize.S -> AiInputStyles.AiInputCondensedS
    size == AiInputCondensedSize.M -> AiInputStyles.AiInputCondensedM
    size == AiInputCondensedSize.L -> AiInputStyles.AiInputCondensedL
    size == AiInputCondensedSize.Xl -> AiInputStyles.AiInputCondensedXl
    else -> error("Unsupported ai-input-condensed style combination")
}

/**
 * Возвращает [AiInputStyle] для ai-input-condensed
 */
@Composable
public fun AiInputStyles.Condensed.style(
    size: AiInputCondensedSize = AiInputCondensedSize.M,
    modify: @Composable AiInputStyleBuilder.() -> Unit = {},
): AiInputStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [AiInputStyles] для ai-input-extended
 */
public fun AiInputStyles.Extended.resolve(size: AiInputExtendedSize = AiInputExtendedSize.M): AiInputStyles = when {
    size == AiInputExtendedSize.Xs -> AiInputStyles.AiInputExtendedXs
    size == AiInputExtendedSize.S -> AiInputStyles.AiInputExtendedS
    size == AiInputExtendedSize.M -> AiInputStyles.AiInputExtendedM
    size == AiInputExtendedSize.L -> AiInputStyles.AiInputExtendedL
    size == AiInputExtendedSize.Xl -> AiInputStyles.AiInputExtendedXl
    else -> error("Unsupported ai-input-extended style combination")
}

/**
 * Возвращает [AiInputStyle] для ai-input-extended
 */
@Composable
public fun AiInputStyles.Extended.style(
    size: AiInputExtendedSize = AiInputExtendedSize.M,
    modify: @Composable AiInputStyleBuilder.() -> Unit = {},
): AiInputStyle =
    resolve(size).style(modify)
