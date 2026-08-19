// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.finai.styles.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента List
 */
public enum class ListStyles(
    public val key: String,
) {
    ListNormalL("ListNormal.L"),
    ListNormalM("ListNormal.M"),
    ListNormalS("ListNormal.S"),
    ListNormalXs("ListNormal.Xs"),
    ListTightL("ListTight.L"),
    ListTightM("ListTight.M"),
    ListTightS("ListTight.S"),
    ListTightXs("ListTight.Xs"),
    ;

    /**
     * Typed API для подбора стиля list-normal
     */
    public object Normal

    /**
     * Typed API для подбора стиля list-tight
     */
    public object Tight
}

/**
 * Возможные значения свойства size для list-normal
 */
public enum class ListNormalSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для list-tight
 */
public enum class ListTightSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [ListStyle] для [ListStyles]
 */
@Composable
public fun ListStyles.style(modify: @Composable ListStyleBuilder.() -> Unit = {}): ListStyle {
    val builder = when (this) {
        ListStyles.ListNormalL -> ListNormal.L
        ListStyles.ListNormalM -> ListNormal.M
        ListStyles.ListNormalS -> ListNormal.S
        ListStyles.ListNormalXs -> ListNormal.Xs
        ListStyles.ListTightL -> ListTight.L
        ListStyles.ListTightM -> ListTight.M
        ListStyles.ListTightS -> ListTight.S
        ListStyles.ListTightXs -> ListTight.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ListStyles] для list-normal
 */
public fun ListStyles.Normal.resolve(size: ListNormalSize = ListNormalSize.L): ListStyles = when {
    size == ListNormalSize.L -> ListStyles.ListNormalL
    size == ListNormalSize.M -> ListStyles.ListNormalM
    size == ListNormalSize.S -> ListStyles.ListNormalS
    size == ListNormalSize.Xs -> ListStyles.ListNormalXs
    else -> error("Unsupported list-normal style combination")
}

/**
 * Возвращает [ListStyle] для list-normal
 */
@Composable
public fun ListStyles.Normal.style(
    size: ListNormalSize = ListNormalSize.L,
    modify: @Composable
    ListStyleBuilder.() -> Unit = {},
): ListStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ListStyles] для list-tight
 */
public fun ListStyles.Tight.resolve(size: ListTightSize = ListTightSize.L): ListStyles = when {
    size == ListTightSize.L -> ListStyles.ListTightL
    size == ListTightSize.M -> ListStyles.ListTightM
    size == ListTightSize.S -> ListStyles.ListTightS
    size == ListTightSize.Xs -> ListStyles.ListTightXs
    else -> error("Unsupported list-tight style combination")
}

/**
 * Возвращает [ListStyle] для list-tight
 */
@Composable
public fun ListStyles.Tight.style(
    size: ListTightSize = ListTightSize.L,
    modify: @Composable
    ListStyleBuilder.() -> Unit = {},
): ListStyle = resolve(size).style(modify)
