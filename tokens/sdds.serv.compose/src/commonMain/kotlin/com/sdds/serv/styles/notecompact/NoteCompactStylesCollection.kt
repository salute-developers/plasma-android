// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.notecompact

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
    NoteCompactLDefault("NoteCompact.L.Default"),
    NoteCompactLPositive("NoteCompact.L.Positive"),
    NoteCompactLNegative("NoteCompact.L.Negative"),
    NoteCompactLWarning("NoteCompact.L.Warning"),
    NoteCompactLInfo("NoteCompact.L.Info"),
    NoteCompactLHasCloseDefault("NoteCompact.L.HasClose.Default"),
    NoteCompactLHasClosePositive("NoteCompact.L.HasClose.Positive"),
    NoteCompactLHasCloseNegative("NoteCompact.L.HasClose.Negative"),
    NoteCompactLHasCloseWarning("NoteCompact.L.HasClose.Warning"),
    NoteCompactLHasCloseInfo("NoteCompact.L.HasClose.Info"),
    NoteCompactLContentScalableDefault("NoteCompact.L.ContentScalable.Default"),
    NoteCompactLContentScalablePositive("NoteCompact.L.ContentScalable.Positive"),
    NoteCompactLContentScalableNegative("NoteCompact.L.ContentScalable.Negative"),
    NoteCompactLContentScalableWarning("NoteCompact.L.ContentScalable.Warning"),
    NoteCompactLContentScalableInfo("NoteCompact.L.ContentScalable.Info"),
    NoteCompactLHasCloseContentScalableDefault("NoteCompact.L.HasCloseContentScalable.Default"),
    NoteCompactLHasCloseContentScalablePositive("NoteCompact.L.HasCloseContentScalable.Positive"),
    NoteCompactLHasCloseContentScalableNegative("NoteCompact.L.HasCloseContentScalable.Negative"),
    NoteCompactLHasCloseContentScalableWarning("NoteCompact.L.HasCloseContentScalable.Warning"),
    NoteCompactLHasCloseContentScalableInfo("NoteCompact.L.HasCloseContentScalable.Info"),
    NoteCompactMDefault("NoteCompact.M.Default"),
    NoteCompactMPositive("NoteCompact.M.Positive"),
    NoteCompactMNegative("NoteCompact.M.Negative"),
    NoteCompactMWarning("NoteCompact.M.Warning"),
    NoteCompactMInfo("NoteCompact.M.Info"),
    NoteCompactMHasCloseDefault("NoteCompact.M.HasClose.Default"),
    NoteCompactMHasClosePositive("NoteCompact.M.HasClose.Positive"),
    NoteCompactMHasCloseNegative("NoteCompact.M.HasClose.Negative"),
    NoteCompactMHasCloseWarning("NoteCompact.M.HasClose.Warning"),
    NoteCompactMHasCloseInfo("NoteCompact.M.HasClose.Info"),
    NoteCompactMContentScalableDefault("NoteCompact.M.ContentScalable.Default"),
    NoteCompactMContentScalablePositive("NoteCompact.M.ContentScalable.Positive"),
    NoteCompactMContentScalableNegative("NoteCompact.M.ContentScalable.Negative"),
    NoteCompactMContentScalableWarning("NoteCompact.M.ContentScalable.Warning"),
    NoteCompactMContentScalableInfo("NoteCompact.M.ContentScalable.Info"),
    NoteCompactMHasCloseContentScalableDefault("NoteCompact.M.HasCloseContentScalable.Default"),
    NoteCompactMHasCloseContentScalablePositive("NoteCompact.M.HasCloseContentScalable.Positive"),
    NoteCompactMHasCloseContentScalableNegative("NoteCompact.M.HasCloseContentScalable.Negative"),
    NoteCompactMHasCloseContentScalableWarning("NoteCompact.M.HasCloseContentScalable.Warning"),
    NoteCompactMHasCloseContentScalableInfo("NoteCompact.M.HasCloseContentScalable.Info"),
    NoteCompactSDefault("NoteCompact.S.Default"),
    NoteCompactSPositive("NoteCompact.S.Positive"),
    NoteCompactSNegative("NoteCompact.S.Negative"),
    NoteCompactSWarning("NoteCompact.S.Warning"),
    NoteCompactSInfo("NoteCompact.S.Info"),
    NoteCompactSHasCloseDefault("NoteCompact.S.HasClose.Default"),
    NoteCompactSHasClosePositive("NoteCompact.S.HasClose.Positive"),
    NoteCompactSHasCloseNegative("NoteCompact.S.HasClose.Negative"),
    NoteCompactSHasCloseWarning("NoteCompact.S.HasClose.Warning"),
    NoteCompactSHasCloseInfo("NoteCompact.S.HasClose.Info"),
    NoteCompactSContentScalableDefault("NoteCompact.S.ContentScalable.Default"),
    NoteCompactSContentScalablePositive("NoteCompact.S.ContentScalable.Positive"),
    NoteCompactSContentScalableNegative("NoteCompact.S.ContentScalable.Negative"),
    NoteCompactSContentScalableWarning("NoteCompact.S.ContentScalable.Warning"),
    NoteCompactSContentScalableInfo("NoteCompact.S.ContentScalable.Info"),
    NoteCompactSHasCloseContentScalableDefault("NoteCompact.S.HasCloseContentScalable.Default"),
    NoteCompactSHasCloseContentScalablePositive("NoteCompact.S.HasCloseContentScalable.Positive"),
    NoteCompactSHasCloseContentScalableNegative("NoteCompact.S.HasCloseContentScalable.Negative"),
    NoteCompactSHasCloseContentScalableWarning("NoteCompact.S.HasCloseContentScalable.Warning"),
    NoteCompactSHasCloseContentScalableInfo("NoteCompact.S.HasCloseContentScalable.Info"),
    NoteCompactXsDefault("NoteCompact.Xs.Default"),
    NoteCompactXsPositive("NoteCompact.Xs.Positive"),
    NoteCompactXsNegative("NoteCompact.Xs.Negative"),
    NoteCompactXsWarning("NoteCompact.Xs.Warning"),
    NoteCompactXsInfo("NoteCompact.Xs.Info"),
    NoteCompactXsHasCloseDefault("NoteCompact.Xs.HasClose.Default"),
    NoteCompactXsHasClosePositive("NoteCompact.Xs.HasClose.Positive"),
    NoteCompactXsHasCloseNegative("NoteCompact.Xs.HasClose.Negative"),
    NoteCompactXsHasCloseWarning("NoteCompact.Xs.HasClose.Warning"),
    NoteCompactXsHasCloseInfo("NoteCompact.Xs.HasClose.Info"),
    NoteCompactXsContentScalableDefault("NoteCompact.Xs.ContentScalable.Default"),
    NoteCompactXsContentScalablePositive("NoteCompact.Xs.ContentScalable.Positive"),
    NoteCompactXsContentScalableNegative("NoteCompact.Xs.ContentScalable.Negative"),
    NoteCompactXsContentScalableWarning("NoteCompact.Xs.ContentScalable.Warning"),
    NoteCompactXsContentScalableInfo("NoteCompact.Xs.ContentScalable.Info"),
    NoteCompactXsHasCloseContentScalableDefault("NoteCompact.Xs.HasCloseContentScalable.Default"),
    NoteCompactXsHasCloseContentScalablePositive("NoteCompact.Xs.HasCloseContentScalable.Positive"),
    NoteCompactXsHasCloseContentScalableNegative("NoteCompact.Xs.HasCloseContentScalable.Negative"),
    NoteCompactXsHasCloseContentScalableWarning("NoteCompact.Xs.HasCloseContentScalable.Warning"),
    NoteCompactXsHasCloseContentScalableInfo("NoteCompact.Xs.HasCloseContentScalable.Info"),
    ;

    /**
     * Typed API для подбора стиля note-compact
     */
    public companion object
}

/**
 * Возможные значения свойства size для note-compact
 */
public enum class NoteCompactSize {
    L,
    M,
    S,
    Xs,
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
        NoteCompactStyles.NoteCompactLDefault -> NoteCompact.L.Default
        NoteCompactStyles.NoteCompactLPositive -> NoteCompact.L.Positive
        NoteCompactStyles.NoteCompactLNegative -> NoteCompact.L.Negative
        NoteCompactStyles.NoteCompactLWarning -> NoteCompact.L.Warning
        NoteCompactStyles.NoteCompactLInfo -> NoteCompact.L.Info
        NoteCompactStyles.NoteCompactLHasCloseDefault -> NoteCompact.L.HasClose.Default
        NoteCompactStyles.NoteCompactLHasClosePositive -> NoteCompact.L.HasClose.Positive
        NoteCompactStyles.NoteCompactLHasCloseNegative -> NoteCompact.L.HasClose.Negative
        NoteCompactStyles.NoteCompactLHasCloseWarning -> NoteCompact.L.HasClose.Warning
        NoteCompactStyles.NoteCompactLHasCloseInfo -> NoteCompact.L.HasClose.Info
        NoteCompactStyles.NoteCompactLContentScalableDefault -> NoteCompact.L.ContentScalable.Default
        NoteCompactStyles.NoteCompactLContentScalablePositive ->
            NoteCompact.L.ContentScalable.Positive
        NoteCompactStyles.NoteCompactLContentScalableNegative ->
            NoteCompact.L.ContentScalable.Negative
        NoteCompactStyles.NoteCompactLContentScalableWarning -> NoteCompact.L.ContentScalable.Warning
        NoteCompactStyles.NoteCompactLContentScalableInfo -> NoteCompact.L.ContentScalable.Info
        NoteCompactStyles.NoteCompactLHasCloseContentScalableDefault ->
            NoteCompact.L.HasCloseContentScalable.Default
        NoteCompactStyles.NoteCompactLHasCloseContentScalablePositive ->
            NoteCompact.L.HasCloseContentScalable.Positive
        NoteCompactStyles.NoteCompactLHasCloseContentScalableNegative ->
            NoteCompact.L.HasCloseContentScalable.Negative
        NoteCompactStyles.NoteCompactLHasCloseContentScalableWarning ->
            NoteCompact.L.HasCloseContentScalable.Warning
        NoteCompactStyles.NoteCompactLHasCloseContentScalableInfo ->
            NoteCompact.L.HasCloseContentScalable.Info
        NoteCompactStyles.NoteCompactMDefault -> NoteCompact.M.Default
        NoteCompactStyles.NoteCompactMPositive -> NoteCompact.M.Positive
        NoteCompactStyles.NoteCompactMNegative -> NoteCompact.M.Negative
        NoteCompactStyles.NoteCompactMWarning -> NoteCompact.M.Warning
        NoteCompactStyles.NoteCompactMInfo -> NoteCompact.M.Info
        NoteCompactStyles.NoteCompactMHasCloseDefault -> NoteCompact.M.HasClose.Default
        NoteCompactStyles.NoteCompactMHasClosePositive -> NoteCompact.M.HasClose.Positive
        NoteCompactStyles.NoteCompactMHasCloseNegative -> NoteCompact.M.HasClose.Negative
        NoteCompactStyles.NoteCompactMHasCloseWarning -> NoteCompact.M.HasClose.Warning
        NoteCompactStyles.NoteCompactMHasCloseInfo -> NoteCompact.M.HasClose.Info
        NoteCompactStyles.NoteCompactMContentScalableDefault -> NoteCompact.M.ContentScalable.Default
        NoteCompactStyles.NoteCompactMContentScalablePositive ->
            NoteCompact.M.ContentScalable.Positive
        NoteCompactStyles.NoteCompactMContentScalableNegative ->
            NoteCompact.M.ContentScalable.Negative
        NoteCompactStyles.NoteCompactMContentScalableWarning -> NoteCompact.M.ContentScalable.Warning
        NoteCompactStyles.NoteCompactMContentScalableInfo -> NoteCompact.M.ContentScalable.Info
        NoteCompactStyles.NoteCompactMHasCloseContentScalableDefault ->
            NoteCompact.M.HasCloseContentScalable.Default
        NoteCompactStyles.NoteCompactMHasCloseContentScalablePositive ->
            NoteCompact.M.HasCloseContentScalable.Positive
        NoteCompactStyles.NoteCompactMHasCloseContentScalableNegative ->
            NoteCompact.M.HasCloseContentScalable.Negative
        NoteCompactStyles.NoteCompactMHasCloseContentScalableWarning ->
            NoteCompact.M.HasCloseContentScalable.Warning
        NoteCompactStyles.NoteCompactMHasCloseContentScalableInfo ->
            NoteCompact.M.HasCloseContentScalable.Info
        NoteCompactStyles.NoteCompactSDefault -> NoteCompact.S.Default
        NoteCompactStyles.NoteCompactSPositive -> NoteCompact.S.Positive
        NoteCompactStyles.NoteCompactSNegative -> NoteCompact.S.Negative
        NoteCompactStyles.NoteCompactSWarning -> NoteCompact.S.Warning
        NoteCompactStyles.NoteCompactSInfo -> NoteCompact.S.Info
        NoteCompactStyles.NoteCompactSHasCloseDefault -> NoteCompact.S.HasClose.Default
        NoteCompactStyles.NoteCompactSHasClosePositive -> NoteCompact.S.HasClose.Positive
        NoteCompactStyles.NoteCompactSHasCloseNegative -> NoteCompact.S.HasClose.Negative
        NoteCompactStyles.NoteCompactSHasCloseWarning -> NoteCompact.S.HasClose.Warning
        NoteCompactStyles.NoteCompactSHasCloseInfo -> NoteCompact.S.HasClose.Info
        NoteCompactStyles.NoteCompactSContentScalableDefault -> NoteCompact.S.ContentScalable.Default
        NoteCompactStyles.NoteCompactSContentScalablePositive ->
            NoteCompact.S.ContentScalable.Positive
        NoteCompactStyles.NoteCompactSContentScalableNegative ->
            NoteCompact.S.ContentScalable.Negative
        NoteCompactStyles.NoteCompactSContentScalableWarning -> NoteCompact.S.ContentScalable.Warning
        NoteCompactStyles.NoteCompactSContentScalableInfo -> NoteCompact.S.ContentScalable.Info
        NoteCompactStyles.NoteCompactSHasCloseContentScalableDefault ->
            NoteCompact.S.HasCloseContentScalable.Default
        NoteCompactStyles.NoteCompactSHasCloseContentScalablePositive ->
            NoteCompact.S.HasCloseContentScalable.Positive
        NoteCompactStyles.NoteCompactSHasCloseContentScalableNegative ->
            NoteCompact.S.HasCloseContentScalable.Negative
        NoteCompactStyles.NoteCompactSHasCloseContentScalableWarning ->
            NoteCompact.S.HasCloseContentScalable.Warning
        NoteCompactStyles.NoteCompactSHasCloseContentScalableInfo ->
            NoteCompact.S.HasCloseContentScalable.Info
        NoteCompactStyles.NoteCompactXsDefault -> NoteCompact.Xs.Default
        NoteCompactStyles.NoteCompactXsPositive -> NoteCompact.Xs.Positive
        NoteCompactStyles.NoteCompactXsNegative -> NoteCompact.Xs.Negative
        NoteCompactStyles.NoteCompactXsWarning -> NoteCompact.Xs.Warning
        NoteCompactStyles.NoteCompactXsInfo -> NoteCompact.Xs.Info
        NoteCompactStyles.NoteCompactXsHasCloseDefault -> NoteCompact.Xs.HasClose.Default
        NoteCompactStyles.NoteCompactXsHasClosePositive -> NoteCompact.Xs.HasClose.Positive
        NoteCompactStyles.NoteCompactXsHasCloseNegative -> NoteCompact.Xs.HasClose.Negative
        NoteCompactStyles.NoteCompactXsHasCloseWarning -> NoteCompact.Xs.HasClose.Warning
        NoteCompactStyles.NoteCompactXsHasCloseInfo -> NoteCompact.Xs.HasClose.Info
        NoteCompactStyles.NoteCompactXsContentScalableDefault ->
            NoteCompact.Xs.ContentScalable.Default
        NoteCompactStyles.NoteCompactXsContentScalablePositive ->
            NoteCompact.Xs.ContentScalable.Positive
        NoteCompactStyles.NoteCompactXsContentScalableNegative ->
            NoteCompact.Xs.ContentScalable.Negative
        NoteCompactStyles.NoteCompactXsContentScalableWarning ->
            NoteCompact.Xs.ContentScalable.Warning
        NoteCompactStyles.NoteCompactXsContentScalableInfo -> NoteCompact.Xs.ContentScalable.Info
        NoteCompactStyles.NoteCompactXsHasCloseContentScalableDefault ->
            NoteCompact.Xs.HasCloseContentScalable.Default
        NoteCompactStyles.NoteCompactXsHasCloseContentScalablePositive ->
            NoteCompact.Xs.HasCloseContentScalable.Positive
        NoteCompactStyles.NoteCompactXsHasCloseContentScalableNegative ->
            NoteCompact.Xs.HasCloseContentScalable.Negative
        NoteCompactStyles.NoteCompactXsHasCloseContentScalableWarning ->
            NoteCompact.Xs.HasCloseContentScalable.Warning
        NoteCompactStyles.NoteCompactXsHasCloseContentScalableInfo ->
            NoteCompact.Xs.HasCloseContentScalable.Info
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [NoteCompactStyles] для note-compact
 */
public fun NoteCompactStyles.Companion.resolve(
    size: NoteCompactSize = NoteCompactSize.L,
    contentBefore: NoteCompactContentBefore = NoteCompactContentBefore.Fixed,
    hasClose: Boolean = false,
    view: NoteCompactView = NoteCompactView.Default,
): NoteCompactStyles = when {
    size == NoteCompactSize.L && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactLHasCloseContentScalableDefault
    size == NoteCompactSize.L && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactLHasCloseContentScalablePositive
    size == NoteCompactSize.L && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactLHasCloseContentScalableNegative
    size == NoteCompactSize.L && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactLHasCloseContentScalableWarning
    size == NoteCompactSize.L && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactLHasCloseContentScalableInfo
    size == NoteCompactSize.M && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactMHasCloseContentScalableDefault
    size == NoteCompactSize.M && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactMHasCloseContentScalablePositive
    size == NoteCompactSize.M && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactMHasCloseContentScalableNegative
    size == NoteCompactSize.M && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactMHasCloseContentScalableWarning
    size == NoteCompactSize.M && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactMHasCloseContentScalableInfo
    size == NoteCompactSize.S && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactSHasCloseContentScalableDefault
    size == NoteCompactSize.S && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactSHasCloseContentScalablePositive
    size == NoteCompactSize.S && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactSHasCloseContentScalableNegative
    size == NoteCompactSize.S && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactSHasCloseContentScalableWarning
    size == NoteCompactSize.S && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactSHasCloseContentScalableInfo
    size == NoteCompactSize.Xs && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactXsHasCloseContentScalableDefault
    size == NoteCompactSize.Xs && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactXsHasCloseContentScalablePositive
    size == NoteCompactSize.Xs && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactXsHasCloseContentScalableNegative
    size == NoteCompactSize.Xs && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactXsHasCloseContentScalableWarning
    size == NoteCompactSize.Xs && contentBefore == NoteCompactContentBefore.Scalable && hasClose ==
        true && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactXsHasCloseContentScalableInfo
    size == NoteCompactSize.L && hasClose == true && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactLHasCloseDefault
    size == NoteCompactSize.L && hasClose == true && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactLHasClosePositive
    size == NoteCompactSize.L && hasClose == true && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactLHasCloseNegative
    size == NoteCompactSize.L && hasClose == true && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactLHasCloseWarning
    size == NoteCompactSize.L && hasClose == true && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactLHasCloseInfo
    size == NoteCompactSize.L && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Default -> NoteCompactStyles.NoteCompactLContentScalableDefault
    size == NoteCompactSize.L && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Positive -> NoteCompactStyles.NoteCompactLContentScalablePositive
    size == NoteCompactSize.L && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Negative -> NoteCompactStyles.NoteCompactLContentScalableNegative
    size == NoteCompactSize.L && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Warning -> NoteCompactStyles.NoteCompactLContentScalableWarning
    size == NoteCompactSize.L && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Info -> NoteCompactStyles.NoteCompactLContentScalableInfo
    size == NoteCompactSize.M && hasClose == true && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactMHasCloseDefault
    size == NoteCompactSize.M && hasClose == true && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactMHasClosePositive
    size == NoteCompactSize.M && hasClose == true && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactMHasCloseNegative
    size == NoteCompactSize.M && hasClose == true && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactMHasCloseWarning
    size == NoteCompactSize.M && hasClose == true && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactMHasCloseInfo
    size == NoteCompactSize.M && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Default -> NoteCompactStyles.NoteCompactMContentScalableDefault
    size == NoteCompactSize.M && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Positive -> NoteCompactStyles.NoteCompactMContentScalablePositive
    size == NoteCompactSize.M && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Negative -> NoteCompactStyles.NoteCompactMContentScalableNegative
    size == NoteCompactSize.M && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Warning -> NoteCompactStyles.NoteCompactMContentScalableWarning
    size == NoteCompactSize.M && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Info -> NoteCompactStyles.NoteCompactMContentScalableInfo
    size == NoteCompactSize.S && hasClose == true && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactSHasCloseDefault
    size == NoteCompactSize.S && hasClose == true && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactSHasClosePositive
    size == NoteCompactSize.S && hasClose == true && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactSHasCloseNegative
    size == NoteCompactSize.S && hasClose == true && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactSHasCloseWarning
    size == NoteCompactSize.S && hasClose == true && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactSHasCloseInfo
    size == NoteCompactSize.S && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Default -> NoteCompactStyles.NoteCompactSContentScalableDefault
    size == NoteCompactSize.S && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Positive -> NoteCompactStyles.NoteCompactSContentScalablePositive
    size == NoteCompactSize.S && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Negative -> NoteCompactStyles.NoteCompactSContentScalableNegative
    size == NoteCompactSize.S && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Warning -> NoteCompactStyles.NoteCompactSContentScalableWarning
    size == NoteCompactSize.S && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Info -> NoteCompactStyles.NoteCompactSContentScalableInfo
    size == NoteCompactSize.Xs && hasClose == true && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactXsHasCloseDefault
    size == NoteCompactSize.Xs && hasClose == true && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactXsHasClosePositive
    size == NoteCompactSize.Xs && hasClose == true && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactXsHasCloseNegative
    size == NoteCompactSize.Xs && hasClose == true && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactXsHasCloseWarning
    size == NoteCompactSize.Xs && hasClose == true && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactXsHasCloseInfo
    size == NoteCompactSize.Xs && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Default -> NoteCompactStyles.NoteCompactXsContentScalableDefault
    size == NoteCompactSize.Xs && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Positive -> NoteCompactStyles.NoteCompactXsContentScalablePositive
    size == NoteCompactSize.Xs && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Negative -> NoteCompactStyles.NoteCompactXsContentScalableNegative
    size == NoteCompactSize.Xs && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Warning -> NoteCompactStyles.NoteCompactXsContentScalableWarning
    size == NoteCompactSize.Xs && contentBefore == NoteCompactContentBefore.Scalable && view ==
        NoteCompactView.Info -> NoteCompactStyles.NoteCompactXsContentScalableInfo
    size == NoteCompactSize.L && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactLDefault
    size == NoteCompactSize.L && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactLPositive
    size == NoteCompactSize.L && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactLNegative
    size == NoteCompactSize.L && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactLWarning
    size == NoteCompactSize.L && view == NoteCompactView.Info -> NoteCompactStyles.NoteCompactLInfo
    size == NoteCompactSize.M && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactMDefault
    size == NoteCompactSize.M && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactMPositive
    size == NoteCompactSize.M && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactMNegative
    size == NoteCompactSize.M && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactMWarning
    size == NoteCompactSize.M && view == NoteCompactView.Info -> NoteCompactStyles.NoteCompactMInfo
    size == NoteCompactSize.S && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactSDefault
    size == NoteCompactSize.S && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactSPositive
    size == NoteCompactSize.S && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactSNegative
    size == NoteCompactSize.S && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactSWarning
    size == NoteCompactSize.S && view == NoteCompactView.Info -> NoteCompactStyles.NoteCompactSInfo
    size == NoteCompactSize.Xs && view == NoteCompactView.Default ->
        NoteCompactStyles.NoteCompactXsDefault
    size == NoteCompactSize.Xs && view == NoteCompactView.Positive ->
        NoteCompactStyles.NoteCompactXsPositive
    size == NoteCompactSize.Xs && view == NoteCompactView.Negative ->
        NoteCompactStyles.NoteCompactXsNegative
    size == NoteCompactSize.Xs && view == NoteCompactView.Warning ->
        NoteCompactStyles.NoteCompactXsWarning
    size == NoteCompactSize.Xs && view == NoteCompactView.Info ->
        NoteCompactStyles.NoteCompactXsInfo
    else -> error("Unsupported note-compact style combination")
}

/**
 * Возвращает [NoteCompactStyle] для note-compact
 */
@Composable
public fun NoteCompactStyles.Companion.style(
    size: NoteCompactSize = NoteCompactSize.L,
    contentBefore: NoteCompactContentBefore = NoteCompactContentBefore.Fixed,
    hasClose: Boolean = false,
    view: NoteCompactView = NoteCompactView.Default,
    modify: @Composable NoteCompactStyleBuilder.() -> Unit = {},
): NoteCompactStyle = resolve(size, contentBefore, hasClose, view).style(modify)
