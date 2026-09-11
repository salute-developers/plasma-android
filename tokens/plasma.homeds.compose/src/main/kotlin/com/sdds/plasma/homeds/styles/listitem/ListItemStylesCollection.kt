// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.listitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ListItem
 */
public enum class ListItemStyles(
    public val key: String,
) {
    ListItemS("ListItem.S"),
    ListItemSHasBackground("ListItem.S.HasBackground"),
    ListItemM("ListItem.M"),
    ListItemMHasBackground("ListItem.M.HasBackground"),
    ListNumberedItemS("ListNumberedItem.S"),
    ListNumberedItemM("ListNumberedItem.M"),
    DropdownMenuItemDefault("DropdownMenuItem.Default"),
    DropdownMenuItemPositive("DropdownMenuItem.Positive"),
    DropdownMenuItemNegative("DropdownMenuItem.Negative"),
    ;

    /**
     * Typed API для подбора стиля list-item
     */
    public object Default

    /**
     * Typed API для подбора стиля list-numbered-item
     */
    public object ListNumberedItem

    /**
     * Typed API для подбора стиля dropdown-menu-item
     */
    public object DropdownMenuItem
}

/**
 * Возможные значения свойства size для list-item
 */
public enum class ListItemDefaultSize {
    S,
    M,
}

/**
 * Возможные значения свойства size для list-numbered-item
 */
public enum class ListItemListNumberedItemSize {
    S,
    M,
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
        ListItemStyles.ListItemS -> ListItem.S
        ListItemStyles.ListItemSHasBackground -> ListItem.S.HasBackground
        ListItemStyles.ListItemM -> ListItem.M
        ListItemStyles.ListItemMHasBackground -> ListItem.M.HasBackground
        ListItemStyles.ListNumberedItemS -> ListNumberedItem.S
        ListItemStyles.ListNumberedItemM -> ListNumberedItem.M
        ListItemStyles.DropdownMenuItemDefault -> DropdownMenuItem.Default
        ListItemStyles.DropdownMenuItemPositive -> DropdownMenuItem.Positive
        ListItemStyles.DropdownMenuItemNegative -> DropdownMenuItem.Negative
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ListItemStyles] для list-item
 */
public fun ListItemStyles.Default.resolve(
    size: ListItemDefaultSize = ListItemDefaultSize.S,
    hasBackground: Boolean = false,
): ListItemStyles = when {
    size == ListItemDefaultSize.S && hasBackground == true -> ListItemStyles.ListItemSHasBackground
    size == ListItemDefaultSize.M && hasBackground == true -> ListItemStyles.ListItemMHasBackground
    size == ListItemDefaultSize.S -> ListItemStyles.ListItemS
    size == ListItemDefaultSize.M -> ListItemStyles.ListItemM
    else -> error("Unsupported list-item style combination")
}

/**
 * Возвращает [ListItemStyle] для list-item
 */
@Composable
public fun ListItemStyles.Default.style(
    size: ListItemDefaultSize = ListItemDefaultSize.S,
    hasBackground: Boolean = false,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle = resolve(size, hasBackground).style(modify)

/**
 * Возвращает экземпляр [ListItemStyles] для list-numbered-item
 */
public fun ListItemStyles.ListNumberedItem.resolve(
    size: ListItemListNumberedItemSize =
        ListItemListNumberedItemSize.S,
): ListItemStyles = when {
    size == ListItemListNumberedItemSize.S -> ListItemStyles.ListNumberedItemS
    size == ListItemListNumberedItemSize.M -> ListItemStyles.ListNumberedItemM
    else -> error("Unsupported list-numbered-item style combination")
}

/**
 * Возвращает [ListItemStyle] для list-numbered-item
 */
@Composable
public fun ListItemStyles.ListNumberedItem.style(
    size: ListItemListNumberedItemSize =
        ListItemListNumberedItemSize.S,
    modify: @Composable ListItemStyleBuilder.() -> Unit = {},
): ListItemStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ListItemStyles] для dropdown-menu-item
 */
public fun ListItemStyles.DropdownMenuItem.resolve(
    view: ListItemDropdownMenuItemView =
        ListItemDropdownMenuItemView.Default,
): ListItemStyles = when {
    view == ListItemDropdownMenuItemView.Default -> ListItemStyles.DropdownMenuItemDefault
    view == ListItemDropdownMenuItemView.Positive -> ListItemStyles.DropdownMenuItemPositive
    view == ListItemDropdownMenuItemView.Negative -> ListItemStyles.DropdownMenuItemNegative
    else -> error("Unsupported dropdown-menu-item style combination")
}

/**
 * Возвращает [ListItemStyle] для dropdown-menu-item
 */
@Composable
public fun ListItemStyles.DropdownMenuItem.style(
    view: ListItemDropdownMenuItemView =
        ListItemDropdownMenuItemView.Default,
    modify: @Composable ListItemStyleBuilder.() -> Unit =
        {},
): ListItemStyle = resolve(view).style(modify)
