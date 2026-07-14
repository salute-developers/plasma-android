// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.dropdownemptystate

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DropdownEmptyStateStyle
import com.sdds.compose.uikit.DropdownEmptyStateStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента DropdownEmptyState
 */
public enum class DropdownEmptyStateStyles(
    public val key: String,
) {
    DropdownEmptyStateXs("DropdownEmptyState.Xs"),
    DropdownEmptyStateXsHasButton("DropdownEmptyState.Xs.HasButton"),
    DropdownEmptyStateS("DropdownEmptyState.S"),
    DropdownEmptyStateSHasButton("DropdownEmptyState.S.HasButton"),
    DropdownEmptyStateM("DropdownEmptyState.M"),
    DropdownEmptyStateMHasButton("DropdownEmptyState.M.HasButton"),
    DropdownEmptyStateL("DropdownEmptyState.L"),
    DropdownEmptyStateLHasButton("DropdownEmptyState.L.HasButton"),
    DropdownEmptyStateXl("DropdownEmptyState.Xl"),
    DropdownEmptyStateXlHasButton("DropdownEmptyState.Xl.HasButton"),
    ;

    /**
     * Typed API для подбора стиля dropdown-empty-state
     */
    public companion object
}

/**
 * Возможные значения свойства size для dropdown-empty-state
 */
public enum class DropdownEmptyStateSize {
    Xs,
    S,
    M,
    L,
    Xl,
}

/**
 * Возвращает [DropdownEmptyStateStyle] для [DropdownEmptyStateStyles]
 */
@Composable
public fun DropdownEmptyStateStyles.style(
    modify: @Composable
    DropdownEmptyStateStyleBuilder.() -> Unit = {},
): DropdownEmptyStateStyle {
    val builder = when (this) {
        DropdownEmptyStateStyles.DropdownEmptyStateXs -> DropdownEmptyState.Xs
        DropdownEmptyStateStyles.DropdownEmptyStateXsHasButton -> DropdownEmptyState.Xs.HasButton
        DropdownEmptyStateStyles.DropdownEmptyStateS -> DropdownEmptyState.S
        DropdownEmptyStateStyles.DropdownEmptyStateSHasButton -> DropdownEmptyState.S.HasButton
        DropdownEmptyStateStyles.DropdownEmptyStateM -> DropdownEmptyState.M
        DropdownEmptyStateStyles.DropdownEmptyStateMHasButton -> DropdownEmptyState.M.HasButton
        DropdownEmptyStateStyles.DropdownEmptyStateL -> DropdownEmptyState.L
        DropdownEmptyStateStyles.DropdownEmptyStateLHasButton -> DropdownEmptyState.L.HasButton
        DropdownEmptyStateStyles.DropdownEmptyStateXl -> DropdownEmptyState.Xl
        DropdownEmptyStateStyles.DropdownEmptyStateXlHasButton -> DropdownEmptyState.Xl.HasButton
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [DropdownEmptyStateStyles] для dropdown-empty-state
 */
public fun DropdownEmptyStateStyles.Companion.resolve(
    size: DropdownEmptyStateSize =
        DropdownEmptyStateSize.Xs,
    hasButton: Boolean = false,
): DropdownEmptyStateStyles = when {
    size == DropdownEmptyStateSize.Xs && hasButton == true ->
        DropdownEmptyStateStyles.DropdownEmptyStateXsHasButton
    size == DropdownEmptyStateSize.S && hasButton == true ->
        DropdownEmptyStateStyles.DropdownEmptyStateSHasButton
    size == DropdownEmptyStateSize.M && hasButton == true ->
        DropdownEmptyStateStyles.DropdownEmptyStateMHasButton
    size == DropdownEmptyStateSize.L && hasButton == true ->
        DropdownEmptyStateStyles.DropdownEmptyStateLHasButton
    size == DropdownEmptyStateSize.Xl && hasButton == true ->
        DropdownEmptyStateStyles.DropdownEmptyStateXlHasButton
    size == DropdownEmptyStateSize.Xs -> DropdownEmptyStateStyles.DropdownEmptyStateXs
    size == DropdownEmptyStateSize.S -> DropdownEmptyStateStyles.DropdownEmptyStateS
    size == DropdownEmptyStateSize.M -> DropdownEmptyStateStyles.DropdownEmptyStateM
    size == DropdownEmptyStateSize.L -> DropdownEmptyStateStyles.DropdownEmptyStateL
    size == DropdownEmptyStateSize.Xl -> DropdownEmptyStateStyles.DropdownEmptyStateXl
    else -> error("Unsupported dropdown-empty-state style combination")
}

/**
 * Возвращает [DropdownEmptyStateStyle] для dropdown-empty-state
 */
@Composable
public fun DropdownEmptyStateStyles.Companion.style(
    size: DropdownEmptyStateSize = DropdownEmptyStateSize.Xs,
    hasButton: Boolean = false,
    modify: @Composable DropdownEmptyStateStyleBuilder.() -> Unit = {},
): DropdownEmptyStateStyle = resolve(size, hasButton).style(modify)
