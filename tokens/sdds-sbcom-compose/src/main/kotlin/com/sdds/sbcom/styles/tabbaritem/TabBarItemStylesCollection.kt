// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.tabbaritem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.TabBarItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента TabBarItem
 */
public enum class TabBarItemStyles(
    public val key: String,
) {
    TabBarItemDefault("TabBarItem.Default"),
    ;

    /**
     * Typed API для подбора стиля tab-bar-item
     */
    public companion object
}

/**
 * Возвращает [TabBarItemStyle] для [TabBarItemStyles]
 */
@Composable
public fun TabBarItemStyles.style(modify: @Composable TabBarItemStyleBuilder.() -> Unit = {}): TabBarItemStyle {
    val builder = when (this) {
        TabBarItemStyles.TabBarItemDefault -> TabBarItem.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [TabBarItemStyles] для tab-bar-item
 */
public fun TabBarItemStyles.Companion.resolve(): TabBarItemStyles =
    TabBarItemStyles.TabBarItemDefault

/**
 * Возвращает [TabBarItemStyle] для tab-bar-item
 */
@Composable
public fun TabBarItemStyles.Companion.style(
    modify: @Composable TabBarItemStyleBuilder.() -> Unit =
        {},
): TabBarItemStyle = resolve().style(modify)
