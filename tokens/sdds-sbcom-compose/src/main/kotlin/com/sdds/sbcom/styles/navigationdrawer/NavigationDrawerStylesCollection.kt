// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.navigationdrawer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NavigationDrawerStyle
import com.sdds.compose.uikit.NavigationDrawerStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента NavigationDrawer
 */
public enum class NavigationDrawerStyles(
    public val key: String,
) {
    NavigationDrawerDefault("NavigationDrawer.Default"),
    ;

    /**
     * Typed API для подбора стиля navigation-drawer
     */
    public companion object
}

/**
 * Возвращает [NavigationDrawerStyle] для [NavigationDrawerStyles]
 */
@Composable
public fun NavigationDrawerStyles.style(
    modify: @Composable NavigationDrawerStyleBuilder.() -> Unit =
        {},
): NavigationDrawerStyle {
    val builder = when (this) {
        NavigationDrawerStyles.NavigationDrawerDefault -> NavigationDrawer.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [NavigationDrawerStyles] для navigation-drawer
 */
public fun NavigationDrawerStyles.Companion.resolve(): NavigationDrawerStyles =
    NavigationDrawerStyles.NavigationDrawerDefault

/**
 * Возвращает [NavigationDrawerStyle] для navigation-drawer
 */
@Composable
public fun NavigationDrawerStyles.Companion.style(
    modify: @Composable
    NavigationDrawerStyleBuilder.() -> Unit = {},
): NavigationDrawerStyle =
    resolve().style(modify)
