// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.note

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.NoteStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Note
 */
public enum class NoteStyles(
    public val key: String,
) {
    NoteLDefault("Note.L.Default"),
    NoteLPositive("Note.L.Positive"),
    NoteLNegative("Note.L.Negative"),
    NoteLWarning("Note.L.Warning"),
    NoteLInfo("Note.L.Info"),
    NoteLHasCloseDefault("Note.L.HasClose.Default"),
    NoteLHasClosePositive("Note.L.HasClose.Positive"),
    NoteLHasCloseNegative("Note.L.HasClose.Negative"),
    NoteLHasCloseWarning("Note.L.HasClose.Warning"),
    NoteLHasCloseInfo("Note.L.HasClose.Info"),
    NoteLContentScalableDefault("Note.L.ContentScalable.Default"),
    NoteLContentScalablePositive("Note.L.ContentScalable.Positive"),
    NoteLContentScalableNegative("Note.L.ContentScalable.Negative"),
    NoteLContentScalableWarning("Note.L.ContentScalable.Warning"),
    NoteLContentScalableInfo("Note.L.ContentScalable.Info"),
    NoteLHasCloseContentScalableDefault("Note.L.HasCloseContentScalable.Default"),
    NoteLHasCloseContentScalablePositive("Note.L.HasCloseContentScalable.Positive"),
    NoteLHasCloseContentScalableNegative("Note.L.HasCloseContentScalable.Negative"),
    NoteLHasCloseContentScalableWarning("Note.L.HasCloseContentScalable.Warning"),
    NoteLHasCloseContentScalableInfo("Note.L.HasCloseContentScalable.Info"),
    NoteMDefault("Note.M.Default"),
    NoteMPositive("Note.M.Positive"),
    NoteMNegative("Note.M.Negative"),
    NoteMWarning("Note.M.Warning"),
    NoteMInfo("Note.M.Info"),
    NoteMHasCloseDefault("Note.M.HasClose.Default"),
    NoteMHasClosePositive("Note.M.HasClose.Positive"),
    NoteMHasCloseNegative("Note.M.HasClose.Negative"),
    NoteMHasCloseWarning("Note.M.HasClose.Warning"),
    NoteMHasCloseInfo("Note.M.HasClose.Info"),
    NoteMContentScalableDefault("Note.M.ContentScalable.Default"),
    NoteMContentScalablePositive("Note.M.ContentScalable.Positive"),
    NoteMContentScalableNegative("Note.M.ContentScalable.Negative"),
    NoteMContentScalableWarning("Note.M.ContentScalable.Warning"),
    NoteMContentScalableInfo("Note.M.ContentScalable.Info"),
    NoteMHasCloseContentScalableDefault("Note.M.HasCloseContentScalable.Default"),
    NoteMHasCloseContentScalablePositive("Note.M.HasCloseContentScalable.Positive"),
    NoteMHasCloseContentScalableNegative("Note.M.HasCloseContentScalable.Negative"),
    NoteMHasCloseContentScalableWarning("Note.M.HasCloseContentScalable.Warning"),
    NoteMHasCloseContentScalableInfo("Note.M.HasCloseContentScalable.Info"),
    NoteSDefault("Note.S.Default"),
    NoteSPositive("Note.S.Positive"),
    NoteSNegative("Note.S.Negative"),
    NoteSWarning("Note.S.Warning"),
    NoteSInfo("Note.S.Info"),
    NoteSHasCloseDefault("Note.S.HasClose.Default"),
    NoteSHasClosePositive("Note.S.HasClose.Positive"),
    NoteSHasCloseNegative("Note.S.HasClose.Negative"),
    NoteSHasCloseWarning("Note.S.HasClose.Warning"),
    NoteSHasCloseInfo("Note.S.HasClose.Info"),
    NoteSContentScalableDefault("Note.S.ContentScalable.Default"),
    NoteSContentScalablePositive("Note.S.ContentScalable.Positive"),
    NoteSContentScalableNegative("Note.S.ContentScalable.Negative"),
    NoteSContentScalableWarning("Note.S.ContentScalable.Warning"),
    NoteSContentScalableInfo("Note.S.ContentScalable.Info"),
    NoteSHasCloseContentScalableDefault("Note.S.HasCloseContentScalable.Default"),
    NoteSHasCloseContentScalablePositive("Note.S.HasCloseContentScalable.Positive"),
    NoteSHasCloseContentScalableNegative("Note.S.HasCloseContentScalable.Negative"),
    NoteSHasCloseContentScalableWarning("Note.S.HasCloseContentScalable.Warning"),
    NoteSHasCloseContentScalableInfo("Note.S.HasCloseContentScalable.Info"),
    NoteXsDefault("Note.Xs.Default"),
    NoteXsPositive("Note.Xs.Positive"),
    NoteXsNegative("Note.Xs.Negative"),
    NoteXsWarning("Note.Xs.Warning"),
    NoteXsInfo("Note.Xs.Info"),
    NoteXsHasCloseDefault("Note.Xs.HasClose.Default"),
    NoteXsHasClosePositive("Note.Xs.HasClose.Positive"),
    NoteXsHasCloseNegative("Note.Xs.HasClose.Negative"),
    NoteXsHasCloseWarning("Note.Xs.HasClose.Warning"),
    NoteXsHasCloseInfo("Note.Xs.HasClose.Info"),
    NoteXsContentScalableDefault("Note.Xs.ContentScalable.Default"),
    NoteXsContentScalablePositive("Note.Xs.ContentScalable.Positive"),
    NoteXsContentScalableNegative("Note.Xs.ContentScalable.Negative"),
    NoteXsContentScalableWarning("Note.Xs.ContentScalable.Warning"),
    NoteXsContentScalableInfo("Note.Xs.ContentScalable.Info"),
    NoteXsHasCloseContentScalableDefault("Note.Xs.HasCloseContentScalable.Default"),
    NoteXsHasCloseContentScalablePositive("Note.Xs.HasCloseContentScalable.Positive"),
    NoteXsHasCloseContentScalableNegative("Note.Xs.HasCloseContentScalable.Negative"),
    NoteXsHasCloseContentScalableWarning("Note.Xs.HasCloseContentScalable.Warning"),
    NoteXsHasCloseContentScalableInfo("Note.Xs.HasCloseContentScalable.Info"),
    ;

    /**
     * Typed API для подбора стиля note
     */
    public companion object
}

/**
 * Возможные значения свойства size для note
 */
public enum class NoteSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства content-before для note
 */
public enum class NoteContentBefore {
    Fixed,
    Scalable,
}

/**
 * Возможные значения свойства view для note
 */
public enum class NoteView {
    Default,
    Positive,
    Negative,
    Warning,
    Info,
}

/**
 * Возвращает [NoteStyle] для [NoteStyles]
 */
@Composable
public fun NoteStyles.style(modify: @Composable NoteStyleBuilder.() -> Unit = {}): NoteStyle {
    val builder = when (this) {
        NoteStyles.NoteLDefault -> Note.L.Default
        NoteStyles.NoteLPositive -> Note.L.Positive
        NoteStyles.NoteLNegative -> Note.L.Negative
        NoteStyles.NoteLWarning -> Note.L.Warning
        NoteStyles.NoteLInfo -> Note.L.Info
        NoteStyles.NoteLHasCloseDefault -> Note.L.HasClose.Default
        NoteStyles.NoteLHasClosePositive -> Note.L.HasClose.Positive
        NoteStyles.NoteLHasCloseNegative -> Note.L.HasClose.Negative
        NoteStyles.NoteLHasCloseWarning -> Note.L.HasClose.Warning
        NoteStyles.NoteLHasCloseInfo -> Note.L.HasClose.Info
        NoteStyles.NoteLContentScalableDefault -> Note.L.ContentScalable.Default
        NoteStyles.NoteLContentScalablePositive -> Note.L.ContentScalable.Positive
        NoteStyles.NoteLContentScalableNegative -> Note.L.ContentScalable.Negative
        NoteStyles.NoteLContentScalableWarning -> Note.L.ContentScalable.Warning
        NoteStyles.NoteLContentScalableInfo -> Note.L.ContentScalable.Info
        NoteStyles.NoteLHasCloseContentScalableDefault -> Note.L.HasCloseContentScalable.Default
        NoteStyles.NoteLHasCloseContentScalablePositive -> Note.L.HasCloseContentScalable.Positive
        NoteStyles.NoteLHasCloseContentScalableNegative -> Note.L.HasCloseContentScalable.Negative
        NoteStyles.NoteLHasCloseContentScalableWarning -> Note.L.HasCloseContentScalable.Warning
        NoteStyles.NoteLHasCloseContentScalableInfo -> Note.L.HasCloseContentScalable.Info
        NoteStyles.NoteMDefault -> Note.M.Default
        NoteStyles.NoteMPositive -> Note.M.Positive
        NoteStyles.NoteMNegative -> Note.M.Negative
        NoteStyles.NoteMWarning -> Note.M.Warning
        NoteStyles.NoteMInfo -> Note.M.Info
        NoteStyles.NoteMHasCloseDefault -> Note.M.HasClose.Default
        NoteStyles.NoteMHasClosePositive -> Note.M.HasClose.Positive
        NoteStyles.NoteMHasCloseNegative -> Note.M.HasClose.Negative
        NoteStyles.NoteMHasCloseWarning -> Note.M.HasClose.Warning
        NoteStyles.NoteMHasCloseInfo -> Note.M.HasClose.Info
        NoteStyles.NoteMContentScalableDefault -> Note.M.ContentScalable.Default
        NoteStyles.NoteMContentScalablePositive -> Note.M.ContentScalable.Positive
        NoteStyles.NoteMContentScalableNegative -> Note.M.ContentScalable.Negative
        NoteStyles.NoteMContentScalableWarning -> Note.M.ContentScalable.Warning
        NoteStyles.NoteMContentScalableInfo -> Note.M.ContentScalable.Info
        NoteStyles.NoteMHasCloseContentScalableDefault -> Note.M.HasCloseContentScalable.Default
        NoteStyles.NoteMHasCloseContentScalablePositive -> Note.M.HasCloseContentScalable.Positive
        NoteStyles.NoteMHasCloseContentScalableNegative -> Note.M.HasCloseContentScalable.Negative
        NoteStyles.NoteMHasCloseContentScalableWarning -> Note.M.HasCloseContentScalable.Warning
        NoteStyles.NoteMHasCloseContentScalableInfo -> Note.M.HasCloseContentScalable.Info
        NoteStyles.NoteSDefault -> Note.S.Default
        NoteStyles.NoteSPositive -> Note.S.Positive
        NoteStyles.NoteSNegative -> Note.S.Negative
        NoteStyles.NoteSWarning -> Note.S.Warning
        NoteStyles.NoteSInfo -> Note.S.Info
        NoteStyles.NoteSHasCloseDefault -> Note.S.HasClose.Default
        NoteStyles.NoteSHasClosePositive -> Note.S.HasClose.Positive
        NoteStyles.NoteSHasCloseNegative -> Note.S.HasClose.Negative
        NoteStyles.NoteSHasCloseWarning -> Note.S.HasClose.Warning
        NoteStyles.NoteSHasCloseInfo -> Note.S.HasClose.Info
        NoteStyles.NoteSContentScalableDefault -> Note.S.ContentScalable.Default
        NoteStyles.NoteSContentScalablePositive -> Note.S.ContentScalable.Positive
        NoteStyles.NoteSContentScalableNegative -> Note.S.ContentScalable.Negative
        NoteStyles.NoteSContentScalableWarning -> Note.S.ContentScalable.Warning
        NoteStyles.NoteSContentScalableInfo -> Note.S.ContentScalable.Info
        NoteStyles.NoteSHasCloseContentScalableDefault -> Note.S.HasCloseContentScalable.Default
        NoteStyles.NoteSHasCloseContentScalablePositive -> Note.S.HasCloseContentScalable.Positive
        NoteStyles.NoteSHasCloseContentScalableNegative -> Note.S.HasCloseContentScalable.Negative
        NoteStyles.NoteSHasCloseContentScalableWarning -> Note.S.HasCloseContentScalable.Warning
        NoteStyles.NoteSHasCloseContentScalableInfo -> Note.S.HasCloseContentScalable.Info
        NoteStyles.NoteXsDefault -> Note.Xs.Default
        NoteStyles.NoteXsPositive -> Note.Xs.Positive
        NoteStyles.NoteXsNegative -> Note.Xs.Negative
        NoteStyles.NoteXsWarning -> Note.Xs.Warning
        NoteStyles.NoteXsInfo -> Note.Xs.Info
        NoteStyles.NoteXsHasCloseDefault -> Note.Xs.HasClose.Default
        NoteStyles.NoteXsHasClosePositive -> Note.Xs.HasClose.Positive
        NoteStyles.NoteXsHasCloseNegative -> Note.Xs.HasClose.Negative
        NoteStyles.NoteXsHasCloseWarning -> Note.Xs.HasClose.Warning
        NoteStyles.NoteXsHasCloseInfo -> Note.Xs.HasClose.Info
        NoteStyles.NoteXsContentScalableDefault -> Note.Xs.ContentScalable.Default
        NoteStyles.NoteXsContentScalablePositive -> Note.Xs.ContentScalable.Positive
        NoteStyles.NoteXsContentScalableNegative -> Note.Xs.ContentScalable.Negative
        NoteStyles.NoteXsContentScalableWarning -> Note.Xs.ContentScalable.Warning
        NoteStyles.NoteXsContentScalableInfo -> Note.Xs.ContentScalable.Info
        NoteStyles.NoteXsHasCloseContentScalableDefault -> Note.Xs.HasCloseContentScalable.Default
        NoteStyles.NoteXsHasCloseContentScalablePositive -> Note.Xs.HasCloseContentScalable.Positive
        NoteStyles.NoteXsHasCloseContentScalableNegative -> Note.Xs.HasCloseContentScalable.Negative
        NoteStyles.NoteXsHasCloseContentScalableWarning -> Note.Xs.HasCloseContentScalable.Warning
        NoteStyles.NoteXsHasCloseContentScalableInfo -> Note.Xs.HasCloseContentScalable.Info
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [NoteStyles] для note
 */
public fun NoteStyles.Companion.resolve(
    size: NoteSize = NoteSize.L,
    contentBefore: NoteContentBefore = NoteContentBefore.Fixed,
    hasClose: Boolean = false,
    view: NoteView = NoteView.Default,
): NoteStyles = when {
    size == NoteSize.L && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Default -> NoteStyles.NoteLHasCloseContentScalableDefault
    size == NoteSize.L && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Positive -> NoteStyles.NoteLHasCloseContentScalablePositive
    size == NoteSize.L && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Negative -> NoteStyles.NoteLHasCloseContentScalableNegative
    size == NoteSize.L && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Warning -> NoteStyles.NoteLHasCloseContentScalableWarning
    size == NoteSize.L && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Info -> NoteStyles.NoteLHasCloseContentScalableInfo
    size == NoteSize.M && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Default -> NoteStyles.NoteMHasCloseContentScalableDefault
    size == NoteSize.M && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Positive -> NoteStyles.NoteMHasCloseContentScalablePositive
    size == NoteSize.M && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Negative -> NoteStyles.NoteMHasCloseContentScalableNegative
    size == NoteSize.M && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Warning -> NoteStyles.NoteMHasCloseContentScalableWarning
    size == NoteSize.M && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Info -> NoteStyles.NoteMHasCloseContentScalableInfo
    size == NoteSize.S && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Default -> NoteStyles.NoteSHasCloseContentScalableDefault
    size == NoteSize.S && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Positive -> NoteStyles.NoteSHasCloseContentScalablePositive
    size == NoteSize.S && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Negative -> NoteStyles.NoteSHasCloseContentScalableNegative
    size == NoteSize.S && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Warning -> NoteStyles.NoteSHasCloseContentScalableWarning
    size == NoteSize.S && contentBefore == NoteContentBefore.Scalable && hasClose == true && view ==
        NoteView.Info -> NoteStyles.NoteSHasCloseContentScalableInfo
    size == NoteSize.Xs && contentBefore == NoteContentBefore.Scalable && hasClose == true && view
        == NoteView.Default -> NoteStyles.NoteXsHasCloseContentScalableDefault
    size == NoteSize.Xs && contentBefore == NoteContentBefore.Scalable && hasClose == true && view
        == NoteView.Positive -> NoteStyles.NoteXsHasCloseContentScalablePositive
    size == NoteSize.Xs && contentBefore == NoteContentBefore.Scalable && hasClose == true && view
        == NoteView.Negative -> NoteStyles.NoteXsHasCloseContentScalableNegative
    size == NoteSize.Xs && contentBefore == NoteContentBefore.Scalable && hasClose == true && view
        == NoteView.Warning -> NoteStyles.NoteXsHasCloseContentScalableWarning
    size == NoteSize.Xs && contentBefore == NoteContentBefore.Scalable && hasClose == true && view
        == NoteView.Info -> NoteStyles.NoteXsHasCloseContentScalableInfo
    size == NoteSize.L && hasClose == true && view == NoteView.Default ->
        NoteStyles.NoteLHasCloseDefault
    size == NoteSize.L && hasClose == true && view == NoteView.Positive ->
        NoteStyles.NoteLHasClosePositive
    size == NoteSize.L && hasClose == true && view == NoteView.Negative ->
        NoteStyles.NoteLHasCloseNegative
    size == NoteSize.L && hasClose == true && view == NoteView.Warning ->
        NoteStyles.NoteLHasCloseWarning
    size == NoteSize.L && hasClose == true && view == NoteView.Info -> NoteStyles.NoteLHasCloseInfo
    size == NoteSize.L && contentBefore == NoteContentBefore.Scalable && view == NoteView.Default ->
        NoteStyles.NoteLContentScalableDefault
    size == NoteSize.L && contentBefore == NoteContentBefore.Scalable && view ==
        NoteView.Positive -> NoteStyles.NoteLContentScalablePositive
    size == NoteSize.L && contentBefore == NoteContentBefore.Scalable && view ==
        NoteView.Negative -> NoteStyles.NoteLContentScalableNegative
    size == NoteSize.L && contentBefore == NoteContentBefore.Scalable && view == NoteView.Warning ->
        NoteStyles.NoteLContentScalableWarning
    size == NoteSize.L && contentBefore == NoteContentBefore.Scalable && view == NoteView.Info ->
        NoteStyles.NoteLContentScalableInfo
    size == NoteSize.M && hasClose == true && view == NoteView.Default ->
        NoteStyles.NoteMHasCloseDefault
    size == NoteSize.M && hasClose == true && view == NoteView.Positive ->
        NoteStyles.NoteMHasClosePositive
    size == NoteSize.M && hasClose == true && view == NoteView.Negative ->
        NoteStyles.NoteMHasCloseNegative
    size == NoteSize.M && hasClose == true && view == NoteView.Warning ->
        NoteStyles.NoteMHasCloseWarning
    size == NoteSize.M && hasClose == true && view == NoteView.Info -> NoteStyles.NoteMHasCloseInfo
    size == NoteSize.M && contentBefore == NoteContentBefore.Scalable && view == NoteView.Default ->
        NoteStyles.NoteMContentScalableDefault
    size == NoteSize.M && contentBefore == NoteContentBefore.Scalable && view ==
        NoteView.Positive -> NoteStyles.NoteMContentScalablePositive
    size == NoteSize.M && contentBefore == NoteContentBefore.Scalable && view ==
        NoteView.Negative -> NoteStyles.NoteMContentScalableNegative
    size == NoteSize.M && contentBefore == NoteContentBefore.Scalable && view == NoteView.Warning ->
        NoteStyles.NoteMContentScalableWarning
    size == NoteSize.M && contentBefore == NoteContentBefore.Scalable && view == NoteView.Info ->
        NoteStyles.NoteMContentScalableInfo
    size == NoteSize.S && hasClose == true && view == NoteView.Default ->
        NoteStyles.NoteSHasCloseDefault
    size == NoteSize.S && hasClose == true && view == NoteView.Positive ->
        NoteStyles.NoteSHasClosePositive
    size == NoteSize.S && hasClose == true && view == NoteView.Negative ->
        NoteStyles.NoteSHasCloseNegative
    size == NoteSize.S && hasClose == true && view == NoteView.Warning ->
        NoteStyles.NoteSHasCloseWarning
    size == NoteSize.S && hasClose == true && view == NoteView.Info -> NoteStyles.NoteSHasCloseInfo
    size == NoteSize.S && contentBefore == NoteContentBefore.Scalable && view == NoteView.Default ->
        NoteStyles.NoteSContentScalableDefault
    size == NoteSize.S && contentBefore == NoteContentBefore.Scalable && view ==
        NoteView.Positive -> NoteStyles.NoteSContentScalablePositive
    size == NoteSize.S && contentBefore == NoteContentBefore.Scalable && view ==
        NoteView.Negative -> NoteStyles.NoteSContentScalableNegative
    size == NoteSize.S && contentBefore == NoteContentBefore.Scalable && view == NoteView.Warning ->
        NoteStyles.NoteSContentScalableWarning
    size == NoteSize.S && contentBefore == NoteContentBefore.Scalable && view == NoteView.Info ->
        NoteStyles.NoteSContentScalableInfo
    size == NoteSize.Xs && hasClose == true && view == NoteView.Default ->
        NoteStyles.NoteXsHasCloseDefault
    size == NoteSize.Xs && hasClose == true && view == NoteView.Positive ->
        NoteStyles.NoteXsHasClosePositive
    size == NoteSize.Xs && hasClose == true && view == NoteView.Negative ->
        NoteStyles.NoteXsHasCloseNegative
    size == NoteSize.Xs && hasClose == true && view == NoteView.Warning ->
        NoteStyles.NoteXsHasCloseWarning
    size == NoteSize.Xs && hasClose == true && view == NoteView.Info ->
        NoteStyles.NoteXsHasCloseInfo
    size == NoteSize.Xs && contentBefore == NoteContentBefore.Scalable && view ==
        NoteView.Default -> NoteStyles.NoteXsContentScalableDefault
    size == NoteSize.Xs && contentBefore == NoteContentBefore.Scalable && view ==
        NoteView.Positive -> NoteStyles.NoteXsContentScalablePositive
    size == NoteSize.Xs && contentBefore == NoteContentBefore.Scalable && view ==
        NoteView.Negative -> NoteStyles.NoteXsContentScalableNegative
    size == NoteSize.Xs && contentBefore == NoteContentBefore.Scalable && view ==
        NoteView.Warning -> NoteStyles.NoteXsContentScalableWarning
    size == NoteSize.Xs && contentBefore == NoteContentBefore.Scalable && view == NoteView.Info ->
        NoteStyles.NoteXsContentScalableInfo
    size == NoteSize.L && view == NoteView.Default -> NoteStyles.NoteLDefault
    size == NoteSize.L && view == NoteView.Positive -> NoteStyles.NoteLPositive
    size == NoteSize.L && view == NoteView.Negative -> NoteStyles.NoteLNegative
    size == NoteSize.L && view == NoteView.Warning -> NoteStyles.NoteLWarning
    size == NoteSize.L && view == NoteView.Info -> NoteStyles.NoteLInfo
    size == NoteSize.M && view == NoteView.Default -> NoteStyles.NoteMDefault
    size == NoteSize.M && view == NoteView.Positive -> NoteStyles.NoteMPositive
    size == NoteSize.M && view == NoteView.Negative -> NoteStyles.NoteMNegative
    size == NoteSize.M && view == NoteView.Warning -> NoteStyles.NoteMWarning
    size == NoteSize.M && view == NoteView.Info -> NoteStyles.NoteMInfo
    size == NoteSize.S && view == NoteView.Default -> NoteStyles.NoteSDefault
    size == NoteSize.S && view == NoteView.Positive -> NoteStyles.NoteSPositive
    size == NoteSize.S && view == NoteView.Negative -> NoteStyles.NoteSNegative
    size == NoteSize.S && view == NoteView.Warning -> NoteStyles.NoteSWarning
    size == NoteSize.S && view == NoteView.Info -> NoteStyles.NoteSInfo
    size == NoteSize.Xs && view == NoteView.Default -> NoteStyles.NoteXsDefault
    size == NoteSize.Xs && view == NoteView.Positive -> NoteStyles.NoteXsPositive
    size == NoteSize.Xs && view == NoteView.Negative -> NoteStyles.NoteXsNegative
    size == NoteSize.Xs && view == NoteView.Warning -> NoteStyles.NoteXsWarning
    size == NoteSize.Xs && view == NoteView.Info -> NoteStyles.NoteXsInfo
    else -> error("Unsupported note style combination")
}

/**
 * Возвращает [NoteStyle] для note
 */
@Composable
public fun NoteStyles.Companion.style(
    size: NoteSize = NoteSize.L,
    contentBefore: NoteContentBefore = NoteContentBefore.Fixed,
    hasClose: Boolean = false,
    view: NoteView = NoteView.Default,
    modify: @Composable NoteStyleBuilder.() -> Unit = {},
): NoteStyle = resolve(size, contentBefore, hasClose, view).style(modify)
