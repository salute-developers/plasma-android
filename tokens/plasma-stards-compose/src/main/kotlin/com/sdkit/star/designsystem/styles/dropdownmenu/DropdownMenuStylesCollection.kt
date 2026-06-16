// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.dropdownmenu

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.DropdownMenuStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента DropdownMenu
 */
public enum class DropdownMenuStyles(
    public val key: String,
) {
    DropdownMenuXl("DropdownMenu.Xl"),
    DropdownMenuL("DropdownMenu.L"),
    DropdownMenuM("DropdownMenu.M"),
    DropdownMenuS("DropdownMenu.S"),
    DropdownMenuXs("DropdownMenu.Xs"),
    ;

    /**
     * Typed API для подбора стиля dropdown-menu
     */
    public companion object
}

/**
 * Возможные значения свойства size для dropdown-menu
 */
public enum class DropdownMenuSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [DropdownMenuStyle] для [DropdownMenuStyles]
 */
@Composable
public fun DropdownMenuStyles.style(modify: @Composable DropdownMenuStyleBuilder.() -> Unit = {}): DropdownMenuStyle {
    val builder = when (this) {
        DropdownMenuStyles.DropdownMenuXl -> DropdownMenu.Xl
        DropdownMenuStyles.DropdownMenuL -> DropdownMenu.L
        DropdownMenuStyles.DropdownMenuM -> DropdownMenu.M
        DropdownMenuStyles.DropdownMenuS -> DropdownMenu.S
        DropdownMenuStyles.DropdownMenuXs -> DropdownMenu.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [DropdownMenuStyles] для dropdown-menu
 */
public fun DropdownMenuStyles.Companion.resolve(size: DropdownMenuSize = DropdownMenuSize.Xl):
    DropdownMenuStyles = when {
    size == DropdownMenuSize.Xl -> DropdownMenuStyles.DropdownMenuXl
    size == DropdownMenuSize.L -> DropdownMenuStyles.DropdownMenuL
    size == DropdownMenuSize.M -> DropdownMenuStyles.DropdownMenuM
    size == DropdownMenuSize.S -> DropdownMenuStyles.DropdownMenuS
    size == DropdownMenuSize.Xs -> DropdownMenuStyles.DropdownMenuXs
    else -> error("Unsupported dropdown-menu style combination")
}

/**
 * Возвращает [DropdownMenuStyle] для dropdown-menu
 */
@Composable
public fun DropdownMenuStyles.Companion.style(
    size: DropdownMenuSize = DropdownMenuSize.Xl,
    modify: @Composable DropdownMenuStyleBuilder.() -> Unit = {},
): DropdownMenuStyle =
    resolve(size).style(modify)
