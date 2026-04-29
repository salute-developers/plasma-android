// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.listitem

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
    DropdownMenuItemDefault("DropdownMenuItem.Default"),
    ListItemDefault("ListItem.Default"),
    ;

    /**
     * Typed API для подбора стиля dropdown-menu-item
     */
    public object DropdownMenuItem

    /**
     * Typed API для подбора стиля list-item
     */
    public object Default
}

/**
 * Возвращает [ListItemStyle] для [ListItemStyles]
 */
@Composable
public fun ListItemStyles.style(modify: @Composable ListItemStyleBuilder.() -> Unit = {}): ListItemStyle {
    val builder = when (this) {
        ListItemStyles.DropdownMenuItemDefault -> DropdownMenuItem.Default
        ListItemStyles.ListItemDefault -> ListItem.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ListItemStyles] для dropdown-menu-item
 */
public fun ListItemStyles.DropdownMenuItem.resolve(): ListItemStyles =
    ListItemStyles.DropdownMenuItemDefault

/**
 * Возвращает [ListItemStyle] для dropdown-menu-item
 */
@Composable
public fun ListItemStyles.DropdownMenuItem.style(
    modify: @Composable ListItemStyleBuilder.() -> Unit =
        {},
): ListItemStyle = resolve().style(modify)

/**
 * Возвращает экземпляр [ListItemStyles] для list-item
 */
public fun ListItemStyles.Default.resolve(): ListItemStyles = ListItemStyles.ListItemDefault

/**
 * Возвращает [ListItemStyle] для list-item
 */
@Composable
public fun ListItemStyles.Default.style(modify: @Composable ListItemStyleBuilder.() -> Unit = {}):
    ListItemStyle = resolve().style(modify)
