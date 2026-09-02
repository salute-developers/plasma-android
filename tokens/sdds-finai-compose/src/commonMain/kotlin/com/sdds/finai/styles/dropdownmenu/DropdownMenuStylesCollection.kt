// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.finai.styles.dropdownmenu

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
    DropdownMenuTightM("DropdownMenuTight.M"),
    DropdownMenuTightS("DropdownMenuTight.S"),
    DropdownMenuTightXs("DropdownMenuTight.Xs"),
    DropdownMenuNormalM("DropdownMenuNormal.M"),
    DropdownMenuNormalS("DropdownMenuNormal.S"),
    DropdownMenuNormalXs("DropdownMenuNormal.Xs"),
    ;

    /**
     * Typed API для подбора стиля dropdown-menu-tight
     */
    public object Tight

    /**
     * Typed API для подбора стиля dropdown-menu-normal
     */
    public object Normal
}

/**
 * Возможные значения свойства size для dropdown-menu-tight
 */
public enum class DropdownMenuTightSize {
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для dropdown-menu-normal
 */
public enum class DropdownMenuNormalSize {
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
        DropdownMenuStyles.DropdownMenuTightM -> DropdownMenuTight.M
        DropdownMenuStyles.DropdownMenuTightS -> DropdownMenuTight.S
        DropdownMenuStyles.DropdownMenuTightXs -> DropdownMenuTight.Xs
        DropdownMenuStyles.DropdownMenuNormalM -> DropdownMenuNormal.M
        DropdownMenuStyles.DropdownMenuNormalS -> DropdownMenuNormal.S
        DropdownMenuStyles.DropdownMenuNormalXs -> DropdownMenuNormal.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [DropdownMenuStyles] для dropdown-menu-tight
 */
public fun DropdownMenuStyles.Tight.resolve(size: DropdownMenuTightSize = DropdownMenuTightSize.M):
    DropdownMenuStyles = when {
    size == DropdownMenuTightSize.M -> DropdownMenuStyles.DropdownMenuTightM
    size == DropdownMenuTightSize.S -> DropdownMenuStyles.DropdownMenuTightS
    size == DropdownMenuTightSize.Xs -> DropdownMenuStyles.DropdownMenuTightXs
    else -> error("Unsupported dropdown-menu-tight style combination")
}

/**
 * Возвращает [DropdownMenuStyle] для dropdown-menu-tight
 */
@Composable
public fun DropdownMenuStyles.Tight.style(
    size: DropdownMenuTightSize = DropdownMenuTightSize.M,
    modify: @Composable DropdownMenuStyleBuilder.() -> Unit = {},
): DropdownMenuStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [DropdownMenuStyles] для dropdown-menu-normal
 */
public fun DropdownMenuStyles.Normal.resolve(
    size: DropdownMenuNormalSize =
        DropdownMenuNormalSize.M,
): DropdownMenuStyles = when {
    size == DropdownMenuNormalSize.M -> DropdownMenuStyles.DropdownMenuNormalM
    size == DropdownMenuNormalSize.S -> DropdownMenuStyles.DropdownMenuNormalS
    size == DropdownMenuNormalSize.Xs -> DropdownMenuStyles.DropdownMenuNormalXs
    else -> error("Unsupported dropdown-menu-normal style combination")
}

/**
 * Возвращает [DropdownMenuStyle] для dropdown-menu-normal
 */
@Composable
public fun DropdownMenuStyles.Normal.style(
    size: DropdownMenuNormalSize = DropdownMenuNormalSize.M,
    modify: @Composable DropdownMenuStyleBuilder.() -> Unit = {},
): DropdownMenuStyle =
    resolve(size).style(modify)
