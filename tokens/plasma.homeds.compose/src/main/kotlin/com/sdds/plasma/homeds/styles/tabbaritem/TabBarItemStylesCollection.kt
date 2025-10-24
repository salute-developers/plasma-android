// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.tabbaritem

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
}

/**
 * Возвращает [TabBarItemStyle] для [TabBarItemStyles]
 */
@Composable
public fun TabBarItemStyles.style(modifyAction: @Composable TabBarItemStyleBuilder.() -> Unit = {}): TabBarItemStyle {
    val builder = when (this) {
        TabBarItemStyles.TabBarItemDefault -> TabBarItem.Default
    }
    return builder.modify(modifyAction).style()
}
