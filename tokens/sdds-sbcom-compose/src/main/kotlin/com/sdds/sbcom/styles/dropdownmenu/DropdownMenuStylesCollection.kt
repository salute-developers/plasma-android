// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.dropdownmenu

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
    DropdownMenuDefault("DropdownMenu.Default"),
    ;

    /**
     * Typed API для подбора стиля dropdown-menu
     */
    public companion object
}

/**
 * Возвращает [DropdownMenuStyle] для [DropdownMenuStyles]
 */
@Composable
public fun DropdownMenuStyles.style(modify: @Composable DropdownMenuStyleBuilder.() -> Unit = {}): DropdownMenuStyle {
    val builder = when (this) {
        DropdownMenuStyles.DropdownMenuDefault -> DropdownMenu.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [DropdownMenuStyles] для dropdown-menu
 */
public fun DropdownMenuStyles.Companion.resolve(): DropdownMenuStyles =
    DropdownMenuStyles.DropdownMenuDefault

/**
 * Возвращает [DropdownMenuStyle] для dropdown-menu
 */
@Composable
public fun DropdownMenuStyles.Companion.style(
    modify: @Composable
    DropdownMenuStyleBuilder.() -> Unit = {},
): DropdownMenuStyle = resolve().style(modify)
