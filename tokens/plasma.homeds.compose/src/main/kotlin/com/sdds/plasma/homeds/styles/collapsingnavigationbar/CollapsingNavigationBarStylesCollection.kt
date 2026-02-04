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
}

/**
 * Возвращает [CollapsingNavigationBarStyle] для [CollapsingNavigationBarStyles]
 */
@Composable
public fun CollapsingNavigationBarStyles.style(
    modifyAction: @Composable
    CollapsingNavigationBarStyleBuilder.() -> Unit = {},
): CollapsingNavigationBarStyle {
    val builder = when (this) {
        CollapsingNavigationBarStyles.CollapsingNavigationBarMainPageDefault ->
            CollapsingNavigationBarMainPage.Default
        CollapsingNavigationBarStyles.CollapsingNavigationBarInternalPageDefault ->
            CollapsingNavigationBarInternalPage.Default
    }
    return builder.modify(modifyAction).style()
}
