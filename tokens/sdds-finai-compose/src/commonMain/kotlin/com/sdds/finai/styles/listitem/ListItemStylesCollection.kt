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
    DropdownMenuItemNormalMDefault("DropdownMenuItemNormal.M.Default"),
    DropdownMenuItemNormalMNegative("DropdownMenuItemNormal.M.Negative"),
    DropdownMenuItemNormalSDefault("DropdownMenuItemNormal.S.Default"),
    DropdownMenuItemNormalSNegative("DropdownMenuItemNormal.S.Negative"),
    DropdownMenuItemNormalXsDefault("DropdownMenuItemNormal.Xs.Default"),
    DropdownMenuItemNormalXsNegative("DropdownMenuItemNormal.Xs.Negative"),
    DropdownMenuItemTightMDefault("DropdownMenuItemTight.M.Default"),
    DropdownMenuItemTightMNegative("DropdownMenuItemTight.M.Negative"),
    DropdownMenuItemTightSDefault("DropdownMenuItemTight.S.Default"),
    DropdownMenuItemTightSNegative("DropdownMenuItemTight.S.Negative"),
    DropdownMenuItemTightXsDefault("DropdownMenuItemTight.Xs.Default"),
    DropdownMenuItemTightXsNegative("DropdownMenuItemTight.Xs.Negative"),
    ;

    /**
     * Typed API для подбора стиля list-item-normal
     */
    public object Normal

    /**
     * Typed API для подбора стиля list-item-tight
     */
    public object Tight

    /**
     * Typed API для подбора стиля dropdown-menu-item-normal
     */
    public object DropdownMenuItemNormal

    /**
     * Typed API для подбора стиля dropdown-menu-item-tight
     */
    public object DropdownMenuItemTight
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
 * Возможные значения свойства size для dropdown-menu-item-normal
 */
public enum class ListItemDropdownMenuItemNormalSize {
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для dropdown-menu-item-normal
 */
public enum class ListItemDropdownMenuItemNormalView {
    Default,
    Negative,
}

/**
 * Возможные значения свойства size для dropdown-menu-item-tight
 */
public enum class ListItemDropdownMenuItemTightSize {
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для dropdown-menu-item-tight
 */
public enum class ListItemDropdownMenuItemTightView {
    Default,
    Negative,
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
        ListItemStyles.DropdownMenuItemNormalMDefault -> DropdownMenuItemNormal.M.Default
        ListItemStyles.DropdownMenuItemNormalMNegative -> DropdownMenuItemNormal.M.Negative
        ListItemStyles.DropdownMenuItemNormalSDefault -> DropdownMenuItemNormal.S.Default
        ListItemStyles.DropdownMenuItemNormalSNegative -> DropdownMenuItemNormal.S.Negative
        ListItemStyles.DropdownMenuItemNormalXsDefault -> DropdownMenuItemNormal.Xs.Default
        ListItemStyles.DropdownMenuItemNormalXsNegative -> DropdownMenuItemNormal.Xs.Negative
        ListItemStyles.DropdownMenuItemTightMDefault -> DropdownMenuItemTight.M.Default
        ListItemStyles.DropdownMenuItemTightMNegative -> DropdownMenuItemTight.M.Negative
        ListItemStyles.DropdownMenuItemTightSDefault -> DropdownMenuItemTight.S.Default
        ListItemStyles.DropdownMenuItemTightSNegative -> DropdownMenuItemTight.S.Negative
        ListItemStyles.DropdownMenuItemTightXsDefault -> DropdownMenuItemTight.Xs.Default
        ListItemStyles.DropdownMenuItemTightXsNegative -> DropdownMenuItemTight.Xs.Negative
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

/**
 * Возвращает экземпляр [ListItemStyles] для dropdown-menu-item-normal
 */
public fun ListItemStyles.DropdownMenuItemNormal.resolve(
    size: ListItemDropdownMenuItemNormalSize =
        ListItemDropdownMenuItemNormalSize.M,
    view: ListItemDropdownMenuItemNormalView =
        ListItemDropdownMenuItemNormalView.Default,
): ListItemStyles = when {
    size == ListItemDropdownMenuItemNormalSize.M && view ==
        ListItemDropdownMenuItemNormalView.Default -> ListItemStyles.DropdownMenuItemNormalMDefault
    size == ListItemDropdownMenuItemNormalSize.M && view ==
        ListItemDropdownMenuItemNormalView.Negative ->
        ListItemStyles.DropdownMenuItemNormalMNegative
    size == ListItemDropdownMenuItemNormalSize.S && view ==
        ListItemDropdownMenuItemNormalView.Default -> ListItemStyles.DropdownMenuItemNormalSDefault
    size == ListItemDropdownMenuItemNormalSize.S && view ==
        ListItemDropdownMenuItemNormalView.Negative ->
        ListItemStyles.DropdownMenuItemNormalSNegative
    size == ListItemDropdownMenuItemNormalSize.Xs && view ==
        ListItemDropdownMenuItemNormalView.Default -> ListItemStyles.DropdownMenuItemNormalXsDefault
    size == ListItemDropdownMenuItemNormalSize.Xs && view ==
        ListItemDropdownMenuItemNormalView.Negative ->
        ListItemStyles.DropdownMenuItemNormalXsNegative
    else -> error("Unsupported dropdown-menu-item-normal style combination")
}

/**
 * Возвращает [ListItemStyle] для dropdown-menu-item-normal
 */
@Composable
public fun ListItemStyles.DropdownMenuItemNormal.style(
    size: ListItemDropdownMenuItemNormalSize = ListItemDropdownMenuItemNormalSize.M,
    view: ListItemDropdownMenuItemNormalView = ListItemDropdownMenuItemNormalView.Default,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle = resolve(size, view).style(modify)

/**
 * Возвращает экземпляр [ListItemStyles] для dropdown-menu-item-tight
 */
public fun ListItemStyles.DropdownMenuItemTight.resolve(
    size: ListItemDropdownMenuItemTightSize =
        ListItemDropdownMenuItemTightSize.M,
    view: ListItemDropdownMenuItemTightView =
        ListItemDropdownMenuItemTightView.Default,
): ListItemStyles = when {
    size == ListItemDropdownMenuItemTightSize.M && view ==
        ListItemDropdownMenuItemTightView.Default -> ListItemStyles.DropdownMenuItemTightMDefault
    size == ListItemDropdownMenuItemTightSize.M && view ==
        ListItemDropdownMenuItemTightView.Negative -> ListItemStyles.DropdownMenuItemTightMNegative
    size == ListItemDropdownMenuItemTightSize.S && view ==
        ListItemDropdownMenuItemTightView.Default -> ListItemStyles.DropdownMenuItemTightSDefault
    size == ListItemDropdownMenuItemTightSize.S && view ==
        ListItemDropdownMenuItemTightView.Negative -> ListItemStyles.DropdownMenuItemTightSNegative
    size == ListItemDropdownMenuItemTightSize.Xs && view ==
        ListItemDropdownMenuItemTightView.Default -> ListItemStyles.DropdownMenuItemTightXsDefault
    size == ListItemDropdownMenuItemTightSize.Xs && view ==
        ListItemDropdownMenuItemTightView.Negative -> ListItemStyles.DropdownMenuItemTightXsNegative
    else -> error("Unsupported dropdown-menu-item-tight style combination")
}

/**
 * Возвращает [ListItemStyle] для dropdown-menu-item-tight
 */
@Composable
public fun ListItemStyles.DropdownMenuItemTight.style(
    size: ListItemDropdownMenuItemTightSize = ListItemDropdownMenuItemTightSize.M,
    view: ListItemDropdownMenuItemTightView = ListItemDropdownMenuItemTightView.Default,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle = resolve(size, view).style(modify)
