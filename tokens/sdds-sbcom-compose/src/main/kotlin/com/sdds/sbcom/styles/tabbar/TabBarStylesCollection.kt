// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.tabbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.TabBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента TabBar
 */
public enum class TabBarStyles(
    public val key: String,
) {
    TabBarDefault("TabBar.Default"),
    ;

    /**
     * Typed API для подбора стиля tab-bar
     */
    public companion object
}

/**
 * Возвращает [TabBarStyle] для [TabBarStyles]
 */
@Composable
public fun TabBarStyles.style(modify: @Composable TabBarStyleBuilder.() -> Unit = {}): TabBarStyle {
    val builder = when (this) {
        TabBarStyles.TabBarDefault -> TabBar.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TabBarStyles] для tab-bar
 */
public fun TabBarStyles.Companion.resolve(): TabBarStyles = TabBarStyles.TabBarDefault

/**
 * Возвращает [TabBarStyle] для tab-bar
 */
@Composable
public fun TabBarStyles.Companion.style(modify: @Composable TabBarStyleBuilder.() -> Unit = {}):
    TabBarStyle = resolve().style(modify)
