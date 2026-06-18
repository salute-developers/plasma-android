// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.listitem

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
    ListItemL("ListItem.L"),
    ListItemM("ListItem.M"),
    ListItemS("ListItem.S"),
    ListItemXs("ListItem.Xs"),
    DropdownMenuItemXlDefault("DropdownMenuItem.Xl.Default"),
    DropdownMenuItemXlPositive("DropdownMenuItem.Xl.Positive"),
    DropdownMenuItemXlNegative("DropdownMenuItem.Xl.Negative"),
    DropdownMenuItemLDefault("DropdownMenuItem.L.Default"),
    DropdownMenuItemLPositive("DropdownMenuItem.L.Positive"),
    DropdownMenuItemLNegative("DropdownMenuItem.L.Negative"),
    DropdownMenuItemMDefault("DropdownMenuItem.M.Default"),
    DropdownMenuItemMPositive("DropdownMenuItem.M.Positive"),
    DropdownMenuItemMNegative("DropdownMenuItem.M.Negative"),
    DropdownMenuItemSDefault("DropdownMenuItem.S.Default"),
    DropdownMenuItemSPositive("DropdownMenuItem.S.Positive"),
    DropdownMenuItemSNegative("DropdownMenuItem.S.Negative"),
    DropdownMenuItemXsDefault("DropdownMenuItem.Xs.Default"),
    DropdownMenuItemXsPositive("DropdownMenuItem.Xs.Positive"),
    DropdownMenuItemXsNegative("DropdownMenuItem.Xs.Negative"),
    ;

    /**
     * Typed API для подбора стиля list-item
     */
    public object Default

    /**
     * Typed API для подбора стиля dropdown-menu-item
     */
    public object DropdownMenuItem
}

/**
 * Возможные значения свойства size для list-item
 */
public enum class ListItemDefaultSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для dropdown-menu-item
 */
public enum class ListItemDropdownMenuItemSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства view для dropdown-menu-item
 */
public enum class ListItemDropdownMenuItemView {
    Default,
    Positive,
    Negative,
}

/**
 * Возвращает [ListItemStyle] для [ListItemStyles]
 */
@Composable
public fun ListItemStyles.style(modify: @Composable ListItemStyleBuilder.() -> Unit = {}): ListItemStyle {
    val builder = when (this) {
        ListItemStyles.ListItemL -> ListItem.L
        ListItemStyles.ListItemM -> ListItem.M
        ListItemStyles.ListItemS -> ListItem.S
        ListItemStyles.ListItemXs -> ListItem.Xs
        ListItemStyles.DropdownMenuItemXlDefault -> DropdownMenuItem.Xl.Default
        ListItemStyles.DropdownMenuItemXlPositive -> DropdownMenuItem.Xl.Positive
        ListItemStyles.DropdownMenuItemXlNegative -> DropdownMenuItem.Xl.Negative
        ListItemStyles.DropdownMenuItemLDefault -> DropdownMenuItem.L.Default
        ListItemStyles.DropdownMenuItemLPositive -> DropdownMenuItem.L.Positive
        ListItemStyles.DropdownMenuItemLNegative -> DropdownMenuItem.L.Negative
        ListItemStyles.DropdownMenuItemMDefault -> DropdownMenuItem.M.Default
        ListItemStyles.DropdownMenuItemMPositive -> DropdownMenuItem.M.Positive
        ListItemStyles.DropdownMenuItemMNegative -> DropdownMenuItem.M.Negative
        ListItemStyles.DropdownMenuItemSDefault -> DropdownMenuItem.S.Default
        ListItemStyles.DropdownMenuItemSPositive -> DropdownMenuItem.S.Positive
        ListItemStyles.DropdownMenuItemSNegative -> DropdownMenuItem.S.Negative
        ListItemStyles.DropdownMenuItemXsDefault -> DropdownMenuItem.Xs.Default
        ListItemStyles.DropdownMenuItemXsPositive -> DropdownMenuItem.Xs.Positive
        ListItemStyles.DropdownMenuItemXsNegative -> DropdownMenuItem.Xs.Negative
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ListItemStyles] для list-item
 */
public fun ListItemStyles.Default.resolve(size: ListItemDefaultSize = ListItemDefaultSize.L): ListItemStyles = when {
    size == ListItemDefaultSize.L -> ListItemStyles.ListItemL
    size == ListItemDefaultSize.M -> ListItemStyles.ListItemM
    size == ListItemDefaultSize.S -> ListItemStyles.ListItemS
    size == ListItemDefaultSize.Xs -> ListItemStyles.ListItemXs
    else -> error("Unsupported list-item style combination")
}

/**
 * Возвращает [ListItemStyle] для list-item
 */
@Composable
public fun ListItemStyles.Default.style(
    size: ListItemDefaultSize = ListItemDefaultSize.L,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [ListItemStyles] для dropdown-menu-item
 */
public fun ListItemStyles.DropdownMenuItem.resolve(
    size: ListItemDropdownMenuItemSize =
        ListItemDropdownMenuItemSize.Xl,
    view: ListItemDropdownMenuItemView =
        ListItemDropdownMenuItemView.Default,
): ListItemStyles = when {
    size == ListItemDropdownMenuItemSize.Xl && view == ListItemDropdownMenuItemView.Default ->
        ListItemStyles.DropdownMenuItemXlDefault
    size == ListItemDropdownMenuItemSize.Xl && view == ListItemDropdownMenuItemView.Positive ->
        ListItemStyles.DropdownMenuItemXlPositive
    size == ListItemDropdownMenuItemSize.Xl && view == ListItemDropdownMenuItemView.Negative ->
        ListItemStyles.DropdownMenuItemXlNegative
    size == ListItemDropdownMenuItemSize.L && view == ListItemDropdownMenuItemView.Default ->
        ListItemStyles.DropdownMenuItemLDefault
    size == ListItemDropdownMenuItemSize.L && view == ListItemDropdownMenuItemView.Positive ->
        ListItemStyles.DropdownMenuItemLPositive
    size == ListItemDropdownMenuItemSize.L && view == ListItemDropdownMenuItemView.Negative ->
        ListItemStyles.DropdownMenuItemLNegative
    size == ListItemDropdownMenuItemSize.M && view == ListItemDropdownMenuItemView.Default ->
        ListItemStyles.DropdownMenuItemMDefault
    size == ListItemDropdownMenuItemSize.M && view == ListItemDropdownMenuItemView.Positive ->
        ListItemStyles.DropdownMenuItemMPositive
    size == ListItemDropdownMenuItemSize.M && view == ListItemDropdownMenuItemView.Negative ->
        ListItemStyles.DropdownMenuItemMNegative
    size == ListItemDropdownMenuItemSize.S && view == ListItemDropdownMenuItemView.Default ->
        ListItemStyles.DropdownMenuItemSDefault
    size == ListItemDropdownMenuItemSize.S && view == ListItemDropdownMenuItemView.Positive ->
        ListItemStyles.DropdownMenuItemSPositive
    size == ListItemDropdownMenuItemSize.S && view == ListItemDropdownMenuItemView.Negative ->
        ListItemStyles.DropdownMenuItemSNegative
    size == ListItemDropdownMenuItemSize.Xs && view == ListItemDropdownMenuItemView.Default ->
        ListItemStyles.DropdownMenuItemXsDefault
    size == ListItemDropdownMenuItemSize.Xs && view == ListItemDropdownMenuItemView.Positive ->
        ListItemStyles.DropdownMenuItemXsPositive
    size == ListItemDropdownMenuItemSize.Xs && view == ListItemDropdownMenuItemView.Negative ->
        ListItemStyles.DropdownMenuItemXsNegative
    else -> error("Unsupported dropdown-menu-item style combination")
}

/**
 * Возвращает [ListItemStyle] для dropdown-menu-item
 */
@Composable
public fun ListItemStyles.DropdownMenuItem.style(
    size: ListItemDropdownMenuItemSize = ListItemDropdownMenuItemSize.Xl,
    view: ListItemDropdownMenuItemView = ListItemDropdownMenuItemView.Default,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle = resolve(size, view).style(modify)
