// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.collapsingnavigationbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.CollapsingNavigationBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента CollapsingNavigationBar
 */
public enum class CollapsingNavigationBarStyles(
    public val key: String,
) {
    CollapsingNavigationBarMainPageDefault("CollapsingNavigationBarMainPage.Default"),
    CollapsingNavigationBarInternalPageDefault("CollapsingNavigationBarInternalPage.Default"),
    ;

    /**
     * Typed API для подбора стиля collapsing-navigation-bar-main-page
     */
    public object MainPage

    /**
     * Typed API для подбора стиля collapsing-navigation-bar-internal-page
     */
    public object InternalPage
}

/**
 * Возвращает [CollapsingNavigationBarStyle] для [CollapsingNavigationBarStyles]
 */
@Composable
public fun CollapsingNavigationBarStyles.style(
    modify: @Composable
    CollapsingNavigationBarStyleBuilder.() -> Unit = {},
): CollapsingNavigationBarStyle {
    val builder = when (this) {
        CollapsingNavigationBarStyles.CollapsingNavigationBarMainPageDefault ->
            CollapsingNavigationBarMainPage.Default
        CollapsingNavigationBarStyles.CollapsingNavigationBarInternalPageDefault ->
            CollapsingNavigationBarInternalPage.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CollapsingNavigationBarStyles] для collapsing-navigation-bar-main-page
 */
public fun CollapsingNavigationBarStyles.MainPage.resolve(): CollapsingNavigationBarStyles =
    CollapsingNavigationBarStyles.CollapsingNavigationBarMainPageDefault

/**
 * Возвращает [CollapsingNavigationBarStyle] для collapsing-navigation-bar-main-page
 */
@Composable
public fun CollapsingNavigationBarStyles.MainPage.style(
    modify: @Composable
    CollapsingNavigationBarStyleBuilder.() -> Unit = {},
): CollapsingNavigationBarStyle =
    resolve().style(modify)

/**
 * Возвращает экземпляр [CollapsingNavigationBarStyles] для collapsing-navigation-bar-internal-page
 */
public fun CollapsingNavigationBarStyles.InternalPage.resolve(): CollapsingNavigationBarStyles =
    CollapsingNavigationBarStyles.CollapsingNavigationBarInternalPageDefault

/**
 * Возвращает [CollapsingNavigationBarStyle] для collapsing-navigation-bar-internal-page
 */
@Composable
public fun CollapsingNavigationBarStyles.InternalPage.style(
    modify: @Composable
    CollapsingNavigationBarStyleBuilder.() -> Unit = {},
): CollapsingNavigationBarStyle =
    resolve().style(modify)
