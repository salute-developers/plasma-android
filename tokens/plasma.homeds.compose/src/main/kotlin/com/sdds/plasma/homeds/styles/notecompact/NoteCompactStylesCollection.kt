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
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента NoteCompact
 */
public enum class NoteCompactStyles(
    public val key: String,
) {
    NoteCompactContentBeforeFixedDefault("NoteCompact.ContentBeforeFixed.Default"),
    NoteCompactContentBeforeFixedPositive("NoteCompact.ContentBeforeFixed.Positive"),
    NoteCompactContentBeforeFixedNegative("NoteCompact.ContentBeforeFixed.Negative"),
    NoteCompactContentBeforeFixedWarning("NoteCompact.ContentBeforeFixed.Warning"),
    NoteCompactContentBeforeFixedInfo("NoteCompact.ContentBeforeFixed.Info"),
    NoteCompactContentBeforeFixedHasCloseDefault("NoteCompact.ContentBeforeFixed.HasClose.Default"),
    NoteCompactContentBeforeFixedHasClosePositive("NoteCompact.ContentBeforeFixed.HasClose.Positive"),
    NoteCompactContentBeforeFixedHasCloseNegative("NoteCompact.ContentBeforeFixed.HasClose.Negative"),
    NoteCompactContentBeforeFixedHasCloseWarning("NoteCompact.ContentBeforeFixed.HasClose.Warning"),
    NoteCompactContentBeforeFixedHasCloseInfo("NoteCompact.ContentBeforeFixed.HasClose.Info"),
    NoteCompactContentBeforeScalableDefault("NoteCompact.ContentBeforeScalable.Default"),
    NoteCompactContentBeforeScalablePositive("NoteCompact.ContentBeforeScalable.Positive"),
    NoteCompactContentBeforeScalableNegative("NoteCompact.ContentBeforeScalable.Negative"),
    NoteCompactContentBeforeScalableWarning("NoteCompact.ContentBeforeScalable.Warning"),
    NoteCompactContentBeforeScalableInfo("NoteCompact.ContentBeforeScalable.Info"),
    NoteCompactContentBeforeScalableHasCloseDefault("NoteCompact.ContentBeforeScalable.HasClose.Default"),
    NoteCompactContentBeforeScalableHasClosePositive("NoteCompact.ContentBeforeScalable.HasClose.Positive"),
    NoteCompactContentBeforeScalableHasCloseNegative("NoteCompact.ContentBeforeScalable.HasClose.Negative"),
    NoteCompactContentBeforeScalableHasCloseWarning("NoteCompact.ContentBeforeScalable.HasClose.Warning"),
    NoteCompactContentBeforeScalableHasCloseInfo("NoteCompact.ContentBeforeScalable.HasClose.Info"),
    ;

    /**
     * Typed API для подбора стиля note-compact
     */
    public companion object
}

/**
 * Возможные значения свойства content-before для note-compact
 */
public enum class NoteCompactContentBefore {
    Fixed,
    Scalable,
}

/**
 * Возможные значения свойства view для note-compact
 */
public enum class NoteCompactView {
    Default,
    Positive,
    Negative,
    Warning,
    Info,
}

/**
 * Возвращает [NoteCompactStyle] для [NoteCompactStyles]
 */
@Composable
public fun NoteCompactStyles.style(modify: @Composable NoteCompactStyleBuilder.() -> Unit = {}): NoteCompactStyle {
    val builder = when (this) {
        NoteCompactStyles.NoteCompactContentBeforeFixedDefault ->
            NoteCompact.ContentBeforeFixed.Default
        NoteCompactStyles.NoteCompactContentBeforeFixedPositive ->
            NoteCompact.ContentBeforeFixed.Positive
        NoteCompactStyles.NoteCompactContentBeforeFixedNegative ->
            NoteCompact.ContentBeforeFixed.Negative
        NoteCompactStyles.NoteCompactContentBeforeFixedWarning ->
            NoteCompact.ContentBeforeFixed.Warning
        NoteCompactStyles.NoteCompactContentBeforeFixedInfo -> NoteCompact.ContentBeforeFixed.Info
        NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseDefault ->
            NoteCompact.ContentBeforeFixed.HasClose.Default
        NoteCompactStyles.NoteCompactContentBeforeFixedHasClosePositive ->
            NoteCompact.ContentBeforeFixed.HasClose.Positive
        NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseNegative ->
            NoteCompact.ContentBeforeFixed.HasClose.Negative
        NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseWarning ->
            NoteCompact.ContentBeforeFixed.HasClose.Warning
        NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseInfo ->
            NoteCompact.ContentBeforeFixed.HasClose.Info
        NoteCompactStyles.NoteCompactContentBeforeScalableDefault ->
            NoteCompact.ContentBeforeScalable.Default
        NoteCompactStyles.NoteCompactContentBeforeScalablePositive ->
            NoteCompact.ContentBeforeScalable.Positive
        NoteCompactStyles.NoteCompactContentBeforeScalableNegative ->
            NoteCompact.ContentBeforeScalable.Negative
        NoteCompactStyles.NoteCompactContentBeforeScalableWarning ->
            NoteCompact.ContentBeforeScalable.Warning
        NoteCompactStyles.NoteCompactContentBeforeScalableInfo ->
            NoteCompact.ContentBeforeScalable.Info
        NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseDefault ->
            NoteCompact.ContentBeforeScalable.HasClose.Default
        NoteCompactStyles.NoteCompactContentBeforeScalableHasClosePositive ->
            NoteCompact.ContentBeforeScalable.HasClose.Positive
        NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseNegative ->
            NoteCompact.ContentBeforeScalable.HasClose.Negative
        NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseWarning ->
            NoteCompact.ContentBeforeScalable.HasClose.Warning
        NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseInfo ->
            NoteCompact.ContentBeforeScalable.HasClose.Info
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [NoteCompactStyles] для note-compact
 */
public fun NoteCompactStyles.Companion.resolve(
    contentBefore: NoteCompactContentBefore = NoteCompactContentBefore.Fixed,
    hasClose: Boolean = false,
    view: NoteCompactView = NoteCompactView.Default,
): NoteCompactStyles = when {
    contentBefore == NoteCompactContentBefore.Fixed && hasClose == true && view ==
        NoteCompactView.Default -> NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseDefault
    contentBefore == NoteCompactContentBefore.Fixed && hasClose == true && view ==
        NoteCompactView.Positive -> NoteCompactStyles.NoteCompactContentBeforeFixedHasClosePositive
    contentBefore == NoteCompactContentBefore.Fixed && hasClose == true && view ==
        NoteCompactView.Negative -> NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseNegative
    contentBefore == NoteCompactContentBefore.Fixed && hasClose == true && view ==
        NoteCompactView.Warning -> NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseWarning
    contentBefore == NoteCompactContentBefore.Fixed && hasClose == true && view ==
        NoteCompactView.Info -> NoteCompactStyles.NoteCompactContentBeforeFixedHasCloseInfo
    contentBefore == NoteCompactContentBefore.Scalable && hasClose == true && view ==
        NoteCompactView.Default -> NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseDefault
    contentBefore == NoteCompactContentBefore.Scalable && hasClose == true && view ==
        NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactContentBeforeScalableHasClosePositive
    contentBefore == NoteCompactContentBefore.Scalable && hasClose == true && view ==
        NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseNegative
    contentBefore == NoteCompactContentBefore.Scalable && hasClose == true && view ==
        NoteCompactView.Warning -> NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseWarning
    contentBefore == NoteCompactContentBefore.Scalable && hasClose == true && view ==
        NoteCompactView.Info -> NoteCompactStyles.NoteCompactContentBeforeScalableHasCloseInfo
    contentBefore == NoteCompactContentBefore.Fixed && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactContentBeforeFixedDefault
    contentBefore == NoteCompactContentBefore.Fixed && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactContentBeforeFixedPositive
    contentBefore == NoteCompactContentBefore.Fixed && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactContentBeforeFixedNegative
    contentBefore == NoteCompactContentBefore.Fixed && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactContentBeforeFixedWarning
    contentBefore == NoteCompactContentBefore.Fixed && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactContentBeforeFixedInfo
    contentBefore == NoteCompactContentBefore.Scalable && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactContentBeforeScalableDefault
    contentBefore == NoteCompactContentBefore.Scalable && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactContentBeforeScalablePositive
    contentBefore == NoteCompactContentBefore.Scalable && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactContentBeforeScalableNegative
    contentBefore == NoteCompactContentBefore.Scalable && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactContentBeforeScalableWarning
    contentBefore == NoteCompactContentBefore.Scalable && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactContentBeforeScalableInfo
    else -> error("Unsupported note-compact style combination")
}

/**
 * Возвращает [NoteCompactStyle] для note-compact
 */
@Composable
public fun NoteCompactStyles.Companion.style(
    contentBefore: NoteCompactContentBefore = NoteCompactContentBefore.Fixed,
    hasClose: Boolean = false,
    view: NoteCompactView = NoteCompactView.Default,
    modify: @Composable NoteCompactStyleBuilder.() -> Unit = {},
): NoteCompactStyle = resolve(contentBefore, hasClose, view).style(modify)
