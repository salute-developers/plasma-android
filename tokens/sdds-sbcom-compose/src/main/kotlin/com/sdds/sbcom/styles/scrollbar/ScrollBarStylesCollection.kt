// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.scrollbar

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
    ScrollBarDefault("ScrollBar.Default"),
    ;

    /**
     * Typed API для подбора стиля scroll-bar
     */
    public companion object
}

/**
 * Возвращает [ScrollBarStyle] для [ScrollBarStyles]
 */
@Composable
public fun ScrollBarStyles.style(modify: @Composable ScrollBarStyleBuilder.() -> Unit = {}): ScrollBarStyle {
    val builder = when (this) {
        ScrollBarStyles.ScrollBarDefault -> ScrollBar.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ScrollBarStyles] для scroll-bar
 */
public fun ScrollBarStyles.Companion.resolve(): ScrollBarStyles = ScrollBarStyles.ScrollBarDefault

/**
 * Возвращает [ScrollBarStyle] для scroll-bar
 */
@Composable
public fun ScrollBarStyles.Companion.style(
    modify: @Composable ScrollBarStyleBuilder.() -> Unit =
        {},
): ScrollBarStyle = resolve().style(modify)
