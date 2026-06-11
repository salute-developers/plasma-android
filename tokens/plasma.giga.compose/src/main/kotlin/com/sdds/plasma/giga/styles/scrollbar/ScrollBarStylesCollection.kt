// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.scrollbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.ScrollBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ScrollBar
 */
public enum class ScrollBarStyles(
    public val key: String,
) {
    ScrollBarS("ScrollBar.S"),
    ScrollBarM("ScrollBar.M"),
    ;

    /**
     * Typed API для подбора стиля scroll-bar
     */
    public companion object
}

/**
 * Возможные значения свойства size для scroll-bar
 */
public enum class ScrollBarSize {
    M,
    S,
}

/**
 * Возвращает [ScrollBarStyle] для [ScrollBarStyles]
 */
@Composable
public fun ScrollBarStyles.style(modify: @Composable ScrollBarStyleBuilder.() -> Unit = {}): ScrollBarStyle {
    val builder = when (this) {
        ScrollBarStyles.ScrollBarS -> ScrollBar.S
        ScrollBarStyles.ScrollBarM -> ScrollBar.M
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ScrollBarStyles] для scroll-bar
 */
public fun ScrollBarStyles.Companion.resolve(size: ScrollBarSize = ScrollBarSize.M): ScrollBarStyles = when {
    size == ScrollBarSize.S -> ScrollBarStyles.ScrollBarS
    size == ScrollBarSize.M -> ScrollBarStyles.ScrollBarM
    else -> error("Unsupported scroll-bar style combination")
}

/**
 * Возвращает [ScrollBarStyle] для scroll-bar
 */
@Composable
public fun ScrollBarStyles.Companion.style(
    size: ScrollBarSize = ScrollBarSize.M,
    modify: @Composable ScrollBarStyleBuilder.() -> Unit = {},
): ScrollBarStyle =
    resolve(size).style(modify)
