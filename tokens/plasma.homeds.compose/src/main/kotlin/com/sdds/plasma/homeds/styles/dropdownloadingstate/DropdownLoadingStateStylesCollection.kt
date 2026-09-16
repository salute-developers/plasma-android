// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.dropdownloadingstate

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownLoadingStateStyle
import com.sdds.compose.uikit.DropdownLoadingStateStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента DropdownLoadingState
 */
public enum class DropdownLoadingStateStyles(
    public val key: String,
) {
    DropdownLoadingStateDefault("DropdownLoadingState.Default"),
    ;

    /**
     * Typed API для подбора стиля dropdown-loading-state
     */
    public companion object
}

/**
 * Возвращает [DropdownLoadingStateStyle] для [DropdownLoadingStateStyles]
 */
@Composable
public fun DropdownLoadingStateStyles.style(
    modify: @Composable
    DropdownLoadingStateStyleBuilder.() -> Unit = {},
): DropdownLoadingStateStyle {
    val builder = when (this) {
        DropdownLoadingStateStyles.DropdownLoadingStateDefault -> DropdownLoadingState.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [DropdownLoadingStateStyles] для dropdown-loading-state
 */
public fun DropdownLoadingStateStyles.Companion.resolve(): DropdownLoadingStateStyles =
    DropdownLoadingStateStyles.DropdownLoadingStateDefault

/**
 * Возвращает [DropdownLoadingStateStyle] для dropdown-loading-state
 */
@Composable
public fun DropdownLoadingStateStyles.Companion.style(
    modify: @Composable
    DropdownLoadingStateStyleBuilder.() -> Unit = {},
): DropdownLoadingStateStyle =
    resolve().style(modify)
