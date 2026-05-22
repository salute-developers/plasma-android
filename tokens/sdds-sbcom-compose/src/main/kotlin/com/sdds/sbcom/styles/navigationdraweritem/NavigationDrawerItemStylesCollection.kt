// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.navigationdraweritem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NavigationDrawerItemStyle
import com.sdds.compose.uikit.NavigationDrawerItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента NavigationDrawerItem
 */
public enum class NavigationDrawerItemStyles(
    public val key: String,
) {
    NavigationDrawerItemDefault("NavigationDrawerItem.Default"),
    ;

    /**
     * Typed API для подбора стиля navigation-drawer-item
     */
    public companion object
}

/**
 * Возвращает [NavigationDrawerItemStyle] для [NavigationDrawerItemStyles]
 */
@Composable
public fun NavigationDrawerItemStyles.style(
    modify: @Composable
    NavigationDrawerItemStyleBuilder.() -> Unit = {},
): NavigationDrawerItemStyle {
    val builder = when (this) {
        NavigationDrawerItemStyles.NavigationDrawerItemDefault -> NavigationDrawerItem.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [NavigationDrawerItemStyles] для navigation-drawer-item
 */
public fun NavigationDrawerItemStyles.Companion.resolve(): NavigationDrawerItemStyles =
    NavigationDrawerItemStyles.NavigationDrawerItemDefault

/**
 * Возвращает [NavigationDrawerItemStyle] для navigation-drawer-item
 */
@Composable
public fun NavigationDrawerItemStyles.Companion.style(
    modify: @Composable
    NavigationDrawerItemStyleBuilder.() -> Unit = {},
): NavigationDrawerItemStyle =
    resolve().style(modify)
