// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.navigationbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.NavigationBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента NavigationBar
 */
public enum class NavigationBarStyles(
    public val key: String,
) {
    NavigationBarMainPageDefault("NavigationBarMainPage.Default"),
    NavigationBarInternalPageDefault("NavigationBarInternalPage.Default"),
    ;

    /**
     * Typed API для подбора стиля navigation-bar-main-page
     */
    public object MainPage

    /**
     * Typed API для подбора стиля navigation-bar-internal-page
     */
    public object InternalPage
}

/**
 * Возвращает [NavigationBarStyle] для [NavigationBarStyles]
 */
@Composable
public fun NavigationBarStyles.style(modify: @Composable NavigationBarStyleBuilder.() -> Unit = {}):
    NavigationBarStyle {
    val builder = when (this) {
        NavigationBarStyles.NavigationBarMainPageDefault -> NavigationBarMainPage.Default
        NavigationBarStyles.NavigationBarInternalPageDefault -> NavigationBarInternalPage.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [NavigationBarStyles] для navigation-bar-main-page
 */
public fun NavigationBarStyles.MainPage.resolve(): NavigationBarStyles =
    NavigationBarStyles.NavigationBarMainPageDefault

/**
 * Возвращает [NavigationBarStyle] для navigation-bar-main-page
 */
@Composable
public fun NavigationBarStyles.MainPage.style(
    modify: @Composable
    NavigationBarStyleBuilder.() -> Unit = {},
): NavigationBarStyle = resolve().style(modify)

/**
 * Возвращает экземпляр [NavigationBarStyles] для navigation-bar-internal-page
 */
public fun NavigationBarStyles.InternalPage.resolve(): NavigationBarStyles =
    NavigationBarStyles.NavigationBarInternalPageDefault

/**
 * Возвращает [NavigationBarStyle] для navigation-bar-internal-page
 */
@Composable
public fun NavigationBarStyles.InternalPage.style(
    modify: @Composable
    NavigationBarStyleBuilder.() -> Unit = {},
): NavigationBarStyle = resolve().style(modify)
