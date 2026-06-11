// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.autocomplete

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.AutocompleteStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Autocomplete
 */
public enum class AutocompleteStyles(
    public val key: String,
) {
    AutocompleteTightXl("AutocompleteTight.Xl"),
    AutocompleteTightL("AutocompleteTight.L"),
    AutocompleteTightM("AutocompleteTight.M"),
    AutocompleteTightS("AutocompleteTight.S"),
    AutocompleteTightXs("AutocompleteTight.Xs"),
    AutocompleteNormalXl("AutocompleteNormal.Xl"),
    AutocompleteNormalL("AutocompleteNormal.L"),
    AutocompleteNormalM("AutocompleteNormal.M"),
    AutocompleteNormalS("AutocompleteNormal.S"),
    AutocompleteNormalXs("AutocompleteNormal.Xs"),
    ;

    /**
     * Typed API для подбора стиля autocomplete-tight
     */
    public object Tight

    /**
     * Typed API для подбора стиля autocomplete-normal
     */
    public object Normal
}

/**
 * Возможные значения свойства size для autocomplete-tight
 */
public enum class AutocompleteTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для autocomplete-normal
 */
public enum class AutocompleteNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [AutocompleteStyle] для [AutocompleteStyles]
 */
@Composable
public fun AutocompleteStyles.style(modify: @Composable AutocompleteStyleBuilder.() -> Unit = {}): AutocompleteStyle {
    val builder = when (this) {
        AutocompleteStyles.AutocompleteTightXl -> AutocompleteTight.Xl
        AutocompleteStyles.AutocompleteTightL -> AutocompleteTight.L
        AutocompleteStyles.AutocompleteTightM -> AutocompleteTight.M
        AutocompleteStyles.AutocompleteTightS -> AutocompleteTight.S
        AutocompleteStyles.AutocompleteTightXs -> AutocompleteTight.Xs
        AutocompleteStyles.AutocompleteNormalXl -> AutocompleteNormal.Xl
        AutocompleteStyles.AutocompleteNormalL -> AutocompleteNormal.L
        AutocompleteStyles.AutocompleteNormalM -> AutocompleteNormal.M
        AutocompleteStyles.AutocompleteNormalS -> AutocompleteNormal.S
        AutocompleteStyles.AutocompleteNormalXs -> AutocompleteNormal.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AutocompleteStyles] для autocomplete-tight
 */
public fun AutocompleteStyles.Tight.resolve(size: AutocompleteTightSize = AutocompleteTightSize.Xl):
    AutocompleteStyles = when {
    size == AutocompleteTightSize.Xl -> AutocompleteStyles.AutocompleteTightXl
    size == AutocompleteTightSize.L -> AutocompleteStyles.AutocompleteTightL
    size == AutocompleteTightSize.M -> AutocompleteStyles.AutocompleteTightM
    size == AutocompleteTightSize.S -> AutocompleteStyles.AutocompleteTightS
    size == AutocompleteTightSize.Xs -> AutocompleteStyles.AutocompleteTightXs
    else -> error("Unsupported autocomplete-tight style combination")
}

/**
 * Возвращает [AutocompleteStyle] для autocomplete-tight
 */
@Composable
public fun AutocompleteStyles.Tight.style(
    size: AutocompleteTightSize = AutocompleteTightSize.Xl,
    modify: @Composable AutocompleteStyleBuilder.() -> Unit = {},
): AutocompleteStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [AutocompleteStyles] для autocomplete-normal
 */
public fun AutocompleteStyles.Normal.resolve(
    size: AutocompleteNormalSize =
        AutocompleteNormalSize.Xl,
): AutocompleteStyles = when {
    size == AutocompleteNormalSize.Xl -> AutocompleteStyles.AutocompleteNormalXl
    size == AutocompleteNormalSize.L -> AutocompleteStyles.AutocompleteNormalL
    size == AutocompleteNormalSize.M -> AutocompleteStyles.AutocompleteNormalM
    size == AutocompleteNormalSize.S -> AutocompleteStyles.AutocompleteNormalS
    size == AutocompleteNormalSize.Xs -> AutocompleteStyles.AutocompleteNormalXs
    else -> error("Unsupported autocomplete-normal style combination")
}

/**
 * Возвращает [AutocompleteStyle] для autocomplete-normal
 */
@Composable
public fun AutocompleteStyles.Normal.style(
    size: AutocompleteNormalSize = AutocompleteNormalSize.Xl,
    modify: @Composable AutocompleteStyleBuilder.() -> Unit = {},
): AutocompleteStyle =
    resolve(size).style(modify)
