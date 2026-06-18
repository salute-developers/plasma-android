// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.list

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
    ListL("List.L"),
    ListM("List.M"),
    ListS("List.S"),
    ListXs("List.Xs"),
    DropdownMenuListXl("DropdownMenuList.Xl"),
    DropdownMenuListL("DropdownMenuList.L"),
    DropdownMenuListM("DropdownMenuList.M"),
    DropdownMenuListS("DropdownMenuList.S"),
    DropdownMenuListXs("DropdownMenuList.Xs"),
    ;

    /**
     * Typed API для подбора стиля list
     */
    public object Default

    /**
     * Typed API для подбора стиля dropdown-menu-list
     */
    public object DropdownMenuList
}

/**
 * Возможные значения свойства size для list
 */
public enum class ListDefaultSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для dropdown-menu-list
 */
public enum class DropdownMenuListSize {
    Xl,
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
        ListStyles.ListL -> List.L
        ListStyles.ListM -> List.M
        ListStyles.ListS -> List.S
        ListStyles.ListXs -> List.Xs
        ListStyles.DropdownMenuListXl -> DropdownMenuList.Xl
        ListStyles.DropdownMenuListL -> DropdownMenuList.L
        ListStyles.DropdownMenuListM -> DropdownMenuList.M
        ListStyles.DropdownMenuListS -> DropdownMenuList.S
        ListStyles.DropdownMenuListXs -> DropdownMenuList.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ListStyles] для list
 */
public fun ListStyles.Default.resolve(size: ListDefaultSize = ListDefaultSize.L): ListStyles = when {
    size == ListDefaultSize.L -> ListStyles.ListL
    size == ListDefaultSize.M -> ListStyles.ListM
    size == ListDefaultSize.S -> ListStyles.ListS
    size == ListDefaultSize.Xs -> ListStyles.ListXs
    else -> error("Unsupported list style combination")
}

/**
 * Возвращает [ListStyle] для list
 */
@Composable
public fun ListStyles.Default.style(
    size: ListDefaultSize = ListDefaultSize.L,
    modify: @Composable
    ListStyleBuilder.() -> Unit = {},
): ListStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ListStyles] для dropdown-menu-list
 */
public fun ListStyles.DropdownMenuList.resolve(
    size: DropdownMenuListSize =
        DropdownMenuListSize.Xl,
): ListStyles = when {
    size == DropdownMenuListSize.Xl -> ListStyles.DropdownMenuListXl
    size == DropdownMenuListSize.L -> ListStyles.DropdownMenuListL
    size == DropdownMenuListSize.M -> ListStyles.DropdownMenuListM
    size == DropdownMenuListSize.S -> ListStyles.DropdownMenuListS
    size == DropdownMenuListSize.Xs -> ListStyles.DropdownMenuListXs
    else -> error("Unsupported dropdown-menu-list style combination")
}

/**
 * Возвращает [ListStyle] для dropdown-menu-list
 */
@Composable
public fun ListStyles.DropdownMenuList.style(
    size: DropdownMenuListSize = DropdownMenuListSize.Xl,
    modify: @Composable ListStyleBuilder.() -> Unit = {},
): ListStyle =
    resolve(size).style(modify)
