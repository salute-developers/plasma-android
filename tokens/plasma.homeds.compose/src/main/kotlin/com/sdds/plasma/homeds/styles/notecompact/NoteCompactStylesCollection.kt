// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.notecompact

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.NoteCompactStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента NoteCompact
 */
public enum class NoteCompactStyles(
    public val key: String,
) {
    NoteCompactHasCloseDefault("NoteCompact.HasClose.Default"),
    NoteCompactHasClosePositive("NoteCompact.HasClose.Positive"),
    NoteCompactHasCloseNegative("NoteCompact.HasClose.Negative"),
    NoteCompactHasCloseWarning("NoteCompact.HasClose.Warning"),
    NoteCompactHasCloseInfo("NoteCompact.HasClose.Info"),
    NoteCompactHasCloseContentScalableDefault("NoteCompact.HasClose.ContentScalable.Default"),
    NoteCompactHasCloseContentScalablePositive("NoteCompact.HasClose.ContentScalable.Positive"),
    NoteCompactHasCloseContentScalableNegative("NoteCompact.HasClose.ContentScalable.Negative"),
    NoteCompactHasCloseContentScalableWarning("NoteCompact.HasClose.ContentScalable.Warning"),
    NoteCompactHasCloseContentScalableInfo("NoteCompact.HasClose.ContentScalable.Info"),
    NoteCompactContentScalableDefault("NoteCompact.ContentScalable.Default"),
    NoteCompactContentScalablePositive("NoteCompact.ContentScalable.Positive"),
    NoteCompactContentScalableNegative("NoteCompact.ContentScalable.Negative"),
    NoteCompactContentScalableWarning("NoteCompact.ContentScalable.Warning"),
    NoteCompactContentScalableInfo("NoteCompact.ContentScalable.Info"),
}

/**
 * Возвращает [NoteCompactStyle] для [NoteCompactStyles]
 */
@Composable
public fun NoteCompactStyles.style(
    modifyAction: @Composable NoteCompactStyleBuilder.() -> Unit =
        {},
): NoteCompactStyle {
    val builder = when (this) {
        NoteCompactStyles.NoteCompactHasCloseDefault -> NoteCompact.HasClose.Default
        NoteCompactStyles.NoteCompactHasClosePositive -> NoteCompact.HasClose.Positive
        NoteCompactStyles.NoteCompactHasCloseNegative -> NoteCompact.HasClose.Negative
        NoteCompactStyles.NoteCompactHasCloseWarning -> NoteCompact.HasClose.Warning
        NoteCompactStyles.NoteCompactHasCloseInfo -> NoteCompact.HasClose.Info
        NoteCompactStyles.NoteCompactHasCloseContentScalableDefault ->
            NoteCompact.HasClose.ContentScalable.Default
        NoteCompactStyles.NoteCompactHasCloseContentScalablePositive ->
            NoteCompact.HasClose.ContentScalable.Positive
        NoteCompactStyles.NoteCompactHasCloseContentScalableNegative ->
            NoteCompact.HasClose.ContentScalable.Negative
        NoteCompactStyles.NoteCompactHasCloseContentScalableWarning ->
            NoteCompact.HasClose.ContentScalable.Warning
        NoteCompactStyles.NoteCompactHasCloseContentScalableInfo ->
            NoteCompact.HasClose.ContentScalable.Info
        NoteCompactStyles.NoteCompactContentScalableDefault -> NoteCompact.ContentScalable.Default
        NoteCompactStyles.NoteCompactContentScalablePositive -> NoteCompact.ContentScalable.Positive
        NoteCompactStyles.NoteCompactContentScalableNegative -> NoteCompact.ContentScalable.Negative
        NoteCompactStyles.NoteCompactContentScalableWarning -> NoteCompact.ContentScalable.Warning
        NoteCompactStyles.NoteCompactContentScalableInfo -> NoteCompact.ContentScalable.Info
    }
    return builder.modify(modifyAction).style()
}
