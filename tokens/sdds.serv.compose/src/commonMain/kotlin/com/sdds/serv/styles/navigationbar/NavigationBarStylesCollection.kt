// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.navigationbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.NavigationBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента NavigationBar
 */
public enum class NavigationBarStyles(
    public val key: String,
) {
    NavigationBarMainPageNoBackground("NavigationBarMainPage.NoBackground"),
    NavigationBarMainPageNoBackgroundRounded("NavigationBarMainPage.NoBackground.Rounded"),
    NavigationBarMainPageHasBackground("NavigationBarMainPage.HasBackground"),
    NavigationBarMainPageHasBackgroundRounded("NavigationBarMainPage.HasBackground.Rounded"),
    NavigationBarMainPageHasBackgroundShadow("NavigationBarMainPage.HasBackground.Shadow"),
    NavigationBarMainPageHasBackgroundShadowRounded("NavigationBarMainPage.HasBackground.Shadow.Rounded"),
    NavigationBarInternalPageNoBackground("NavigationBarInternalPage.NoBackground"),
    NavigationBarInternalPageNoBackgroundRounded("NavigationBarInternalPage.NoBackground.Rounded"),
    NavigationBarInternalPageHasBackground("NavigationBarInternalPage.HasBackground"),
    NavigationBarInternalPageHasBackgroundRounded("NavigationBarInternalPage.HasBackground.Rounded"),
    NavigationBarInternalPageHasBackgroundShadow("NavigationBarInternalPage.HasBackground.Shadow"),
    NavigationBarInternalPageHasBackgroundShadowRounded("NavigationBarInternalPage.HasBackground.Shadow.Rounded"),
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
        NavigationBarStyles.NavigationBarMainPageNoBackground -> NavigationBarMainPage.NoBackground
        NavigationBarStyles.NavigationBarMainPageNoBackgroundRounded ->
            NavigationBarMainPage.NoBackground.Rounded
        NavigationBarStyles.NavigationBarMainPageHasBackground -> NavigationBarMainPage.HasBackground
        NavigationBarStyles.NavigationBarMainPageHasBackgroundRounded ->
            NavigationBarMainPage.HasBackground.Rounded
        NavigationBarStyles.NavigationBarMainPageHasBackgroundShadow ->
            NavigationBarMainPage.HasBackground.Shadow
        NavigationBarStyles.NavigationBarMainPageHasBackgroundShadowRounded ->
            NavigationBarMainPage.HasBackground.Shadow.Rounded
        NavigationBarStyles.NavigationBarInternalPageNoBackground ->
            NavigationBarInternalPage.NoBackground
        NavigationBarStyles.NavigationBarInternalPageNoBackgroundRounded ->
            NavigationBarInternalPage.NoBackground.Rounded
        NavigationBarStyles.NavigationBarInternalPageHasBackground ->
            NavigationBarInternalPage.HasBackground
        NavigationBarStyles.NavigationBarInternalPageHasBackgroundRounded ->
            NavigationBarInternalPage.HasBackground.Rounded
        NavigationBarStyles.NavigationBarInternalPageHasBackgroundShadow ->
            NavigationBarInternalPage.HasBackground.Shadow
        NavigationBarStyles.NavigationBarInternalPageHasBackgroundShadowRounded ->
            NavigationBarInternalPage.HasBackground.Shadow.Rounded
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [NavigationBarStyles] для navigation-bar-main-page
 */
public fun NavigationBarStyles.MainPage.resolve(
    hasBackground: Boolean = false,
    hasShadow: Boolean = false,
    rounded: Boolean = false,
): NavigationBarStyles = when {
    hasBackground == true && hasShadow == true && rounded == true ->
        NavigationBarStyles.NavigationBarMainPageHasBackgroundShadowRounded
    hasBackground == false && rounded == true ->
        NavigationBarStyles.NavigationBarMainPageNoBackgroundRounded
    hasBackground == true && rounded == true ->
        NavigationBarStyles.NavigationBarMainPageHasBackgroundRounded
    hasBackground == true && hasShadow == true ->
        NavigationBarStyles.NavigationBarMainPageHasBackgroundShadow
    hasBackground == false -> NavigationBarStyles.NavigationBarMainPageNoBackground
    hasBackground == true -> NavigationBarStyles.NavigationBarMainPageHasBackground
    else -> error("Unsupported navigation-bar-main-page style combination")
}

/**
 * Возвращает [NavigationBarStyle] для navigation-bar-main-page
 */
@Composable
public fun NavigationBarStyles.MainPage.style(
    hasBackground: Boolean = false,
    hasShadow: Boolean = false,
    rounded: Boolean = false,
    modify: @Composable NavigationBarStyleBuilder.() -> Unit = {},
): NavigationBarStyle = resolve(hasBackground, hasShadow, rounded).style(modify)

/**
 * Возвращает экземпляр [NavigationBarStyles] для navigation-bar-internal-page
 */
public fun NavigationBarStyles.InternalPage.resolve(
    hasBackground: Boolean = false,
    hasShadow: Boolean = false,
    rounded: Boolean = false,
): NavigationBarStyles = when {
    hasBackground == true && hasShadow == true && rounded == true ->
        NavigationBarStyles.NavigationBarInternalPageHasBackgroundShadowRounded
    hasBackground == false && rounded == true ->
        NavigationBarStyles.NavigationBarInternalPageNoBackgroundRounded
    hasBackground == true && rounded == true ->
        NavigationBarStyles.NavigationBarInternalPageHasBackgroundRounded
    hasBackground == true && hasShadow == true ->
        NavigationBarStyles.NavigationBarInternalPageHasBackgroundShadow
    hasBackground == false -> NavigationBarStyles.NavigationBarInternalPageNoBackground
    hasBackground == true -> NavigationBarStyles.NavigationBarInternalPageHasBackground
    else -> error("Unsupported navigation-bar-internal-page style combination")
}

/**
 * Возвращает [NavigationBarStyle] для navigation-bar-internal-page
 */
@Composable
public fun NavigationBarStyles.InternalPage.style(
    hasBackground: Boolean = false,
    hasShadow: Boolean = false,
    rounded: Boolean = false,
    modify: @Composable NavigationBarStyleBuilder.() -> Unit = {},
): NavigationBarStyle = resolve(hasBackground, hasShadow, rounded).style(modify)
