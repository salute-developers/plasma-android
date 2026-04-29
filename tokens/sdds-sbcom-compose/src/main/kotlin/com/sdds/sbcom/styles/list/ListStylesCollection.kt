// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.list

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
    DropdownMenuListDefault("DropdownMenuList.Default"),
    ListDefault("List.Default"),
    ;

    /**
     * Typed API для подбора стиля dropdown-menu-list
     */
    public object DropdownMenuList

    /**
     * Typed API для подбора стиля list
     */
    public object Default
}

/**
 * Возвращает [ListStyle] для [ListStyles]
 */
@Composable
public fun ListStyles.style(modify: @Composable ListStyleBuilder.() -> Unit = {}): ListStyle {
    val builder = when (this) {
        ListStyles.DropdownMenuListDefault -> DropdownMenuList.Default
        ListStyles.ListDefault -> List.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ListStyles] для dropdown-menu-list
 */
public fun ListStyles.DropdownMenuList.resolve(): ListStyles = ListStyles.DropdownMenuListDefault

/**
 * Возвращает [ListStyle] для dropdown-menu-list
 */
@Composable
public fun ListStyles.DropdownMenuList.style(modify: @Composable ListStyleBuilder.() -> Unit = {}):
    ListStyle = resolve().style(modify)

/**
 * Возвращает экземпляр [ListStyles] для list
 */
public fun ListStyles.Default.resolve(): ListStyles = ListStyles.ListDefault

/**
 * Возвращает [ListStyle] для list
 */
@Composable
public fun ListStyles.Default.style(
    modify: @Composable ListStyleBuilder.() -> Unit = {},
): ListStyle = resolve().style(modify)
