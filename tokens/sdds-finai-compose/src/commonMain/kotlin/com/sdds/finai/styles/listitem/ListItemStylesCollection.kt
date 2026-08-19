// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.finai.styles.listitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ListItem
 */
public enum class ListItemStyles(
    public val key: String,
) {
    ListItemNormalL("ListItemNormal.L"),
    ListItemNormalM("ListItemNormal.M"),
    ListItemNormalS("ListItemNormal.S"),
    ListItemNormalXs("ListItemNormal.Xs"),
    ListItemTightL("ListItemTight.L"),
    ListItemTightM("ListItemTight.M"),
    ListItemTightS("ListItemTight.S"),
    ListItemTightXs("ListItemTight.Xs"),
    ;

    /**
     * Typed API для подбора стиля list-item-normal
     */
    public object Normal

    /**
     * Typed API для подбора стиля list-item-tight
     */
    public object Tight
}

/**
 * Возможные значения свойства size для list-item-normal
 */
public enum class ListItemNormalSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для list-item-tight
 */
public enum class ListItemTightSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [ListItemStyle] для [ListItemStyles]
 */
@Composable
public fun ListItemStyles.style(modify: @Composable ListItemStyleBuilder.() -> Unit = {}): ListItemStyle {
    val builder = when (this) {
        ListItemStyles.ListItemNormalL -> ListItemNormal.L
        ListItemStyles.ListItemNormalM -> ListItemNormal.M
        ListItemStyles.ListItemNormalS -> ListItemNormal.S
        ListItemStyles.ListItemNormalXs -> ListItemNormal.Xs
        ListItemStyles.ListItemTightL -> ListItemTight.L
        ListItemStyles.ListItemTightM -> ListItemTight.M
        ListItemStyles.ListItemTightS -> ListItemTight.S
        ListItemStyles.ListItemTightXs -> ListItemTight.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ListItemStyles] для list-item-normal
 */
public fun ListItemStyles.Normal.resolve(size: ListItemNormalSize = ListItemNormalSize.L): ListItemStyles = when {
    size == ListItemNormalSize.L -> ListItemStyles.ListItemNormalL
    size == ListItemNormalSize.M -> ListItemStyles.ListItemNormalM
    size == ListItemNormalSize.S -> ListItemStyles.ListItemNormalS
    size == ListItemNormalSize.Xs -> ListItemStyles.ListItemNormalXs
    else -> error("Unsupported list-item-normal style combination")
}

/**
 * Возвращает [ListItemStyle] для list-item-normal
 */
@Composable
public fun ListItemStyles.Normal.style(
    size: ListItemNormalSize = ListItemNormalSize.L,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [ListItemStyles] для list-item-tight
 */
public fun ListItemStyles.Tight.resolve(size: ListItemTightSize = ListItemTightSize.L): ListItemStyles = when {
    size == ListItemTightSize.L -> ListItemStyles.ListItemTightL
    size == ListItemTightSize.M -> ListItemStyles.ListItemTightM
    size == ListItemTightSize.S -> ListItemStyles.ListItemTightS
    size == ListItemTightSize.Xs -> ListItemStyles.ListItemTightXs
    else -> error("Unsupported list-item-tight style combination")
}

/**
 * Возвращает [ListItemStyle] для list-item-tight
 */
@Composable
public fun ListItemStyles.Tight.style(
    size: ListItemTightSize = ListItemTightSize.L,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle =
    resolve(size).style(modify)
