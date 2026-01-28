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
}

/**
 * Возвращает [NavigationBarStyle] для [NavigationBarStyles]
 */
@Composable
public fun NavigationBarStyles.style(
    modifyAction: @Composable NavigationBarStyleBuilder.() -> Unit =
        {},
): NavigationBarStyle {
    val builder = when (this) {
        NavigationBarStyles.NavigationBarMainPageDefault -> NavigationBarMainPage.Default
        NavigationBarStyles.NavigationBarInternalPageDefault -> NavigationBarInternalPage.Default
    }
    return builder.modify(modifyAction).style()
}
