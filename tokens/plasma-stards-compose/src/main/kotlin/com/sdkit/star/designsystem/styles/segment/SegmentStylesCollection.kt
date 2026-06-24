// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.segment

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.SegmentStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Segment
 */
public enum class SegmentStyles(
    public val key: String,
) {
    SegmentXlPrimary("Segment.Xl.Primary"),
    SegmentXlSecondary("Segment.Xl.Secondary"),
    SegmentXlPilledPrimary("Segment.Xl.Pilled.Primary"),
    SegmentXlPilledSecondary("Segment.Xl.Pilled.Secondary"),
    SegmentLPrimary("Segment.L.Primary"),
    SegmentLSecondary("Segment.L.Secondary"),
    SegmentLPilledPrimary("Segment.L.Pilled.Primary"),
    SegmentLPilledSecondary("Segment.L.Pilled.Secondary"),
    SegmentMPrimary("Segment.M.Primary"),
    SegmentMSecondary("Segment.M.Secondary"),
    SegmentMPilledPrimary("Segment.M.Pilled.Primary"),
    SegmentMPilledSecondary("Segment.M.Pilled.Secondary"),
    SegmentSPrimary("Segment.S.Primary"),
    SegmentSSecondary("Segment.S.Secondary"),
    SegmentSPilledPrimary("Segment.S.Pilled.Primary"),
    SegmentSPilledSecondary("Segment.S.Pilled.Secondary"),
    SegmentXsPrimary("Segment.Xs.Primary"),
    SegmentXsSecondary("Segment.Xs.Secondary"),
    SegmentXsPilledPrimary("Segment.Xs.Pilled.Primary"),
    SegmentXsPilledSecondary("Segment.Xs.Pilled.Secondary"),
    ;

    /**
     * Typed API для подбора стиля segment
     */
    public companion object
}

/**
 * Возможные значения свойства size для segment
 */
public enum class SegmentSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для segment
 */
public enum class SegmentShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для segment
 */
public enum class SegmentView {
    Primary,
    Secondary,
}

/**
 * Возвращает [SegmentStyle] для [SegmentStyles]
 */
@Composable
public fun SegmentStyles.style(modify: @Composable SegmentStyleBuilder.() -> Unit = {}): SegmentStyle {
    val builder = when (this) {
        SegmentStyles.SegmentXlPrimary -> Segment.Xl.Primary
        SegmentStyles.SegmentXlSecondary -> Segment.Xl.Secondary
        SegmentStyles.SegmentXlPilledPrimary -> Segment.Xl.Pilled.Primary
        SegmentStyles.SegmentXlPilledSecondary -> Segment.Xl.Pilled.Secondary
        SegmentStyles.SegmentLPrimary -> Segment.L.Primary
        SegmentStyles.SegmentLSecondary -> Segment.L.Secondary
        SegmentStyles.SegmentLPilledPrimary -> Segment.L.Pilled.Primary
        SegmentStyles.SegmentLPilledSecondary -> Segment.L.Pilled.Secondary
        SegmentStyles.SegmentMPrimary -> Segment.M.Primary
        SegmentStyles.SegmentMSecondary -> Segment.M.Secondary
        SegmentStyles.SegmentMPilledPrimary -> Segment.M.Pilled.Primary
        SegmentStyles.SegmentMPilledSecondary -> Segment.M.Pilled.Secondary
        SegmentStyles.SegmentSPrimary -> Segment.S.Primary
        SegmentStyles.SegmentSSecondary -> Segment.S.Secondary
        SegmentStyles.SegmentSPilledPrimary -> Segment.S.Pilled.Primary
        SegmentStyles.SegmentSPilledSecondary -> Segment.S.Pilled.Secondary
        SegmentStyles.SegmentXsPrimary -> Segment.Xs.Primary
        SegmentStyles.SegmentXsSecondary -> Segment.Xs.Secondary
        SegmentStyles.SegmentXsPilledPrimary -> Segment.Xs.Pilled.Primary
        SegmentStyles.SegmentXsPilledSecondary -> Segment.Xs.Pilled.Secondary
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SegmentStyles] для segment
 */
public fun SegmentStyles.Companion.resolve(
    size: SegmentSize = SegmentSize.Xl,
    shape: SegmentShape = SegmentShape.Default,
    view: SegmentView,
): SegmentStyles = when {
    size == SegmentSize.Xl && shape == SegmentShape.Pilled && view == SegmentView.Primary ->
        SegmentStyles.SegmentXlPilledPrimary
    size == SegmentSize.Xl && shape == SegmentShape.Pilled && view == SegmentView.Secondary ->
        SegmentStyles.SegmentXlPilledSecondary
    size == SegmentSize.L && shape == SegmentShape.Pilled && view == SegmentView.Primary ->
        SegmentStyles.SegmentLPilledPrimary
    size == SegmentSize.L && shape == SegmentShape.Pilled && view == SegmentView.Secondary ->
        SegmentStyles.SegmentLPilledSecondary
    size == SegmentSize.M && shape == SegmentShape.Pilled && view == SegmentView.Primary ->
        SegmentStyles.SegmentMPilledPrimary
    size == SegmentSize.M && shape == SegmentShape.Pilled && view == SegmentView.Secondary ->
        SegmentStyles.SegmentMPilledSecondary
    size == SegmentSize.S && shape == SegmentShape.Pilled && view == SegmentView.Primary ->
        SegmentStyles.SegmentSPilledPrimary
    size == SegmentSize.S && shape == SegmentShape.Pilled && view == SegmentView.Secondary ->
        SegmentStyles.SegmentSPilledSecondary
    size == SegmentSize.Xs && shape == SegmentShape.Pilled && view == SegmentView.Primary ->
        SegmentStyles.SegmentXsPilledPrimary
    size == SegmentSize.Xs && shape == SegmentShape.Pilled && view == SegmentView.Secondary ->
        SegmentStyles.SegmentXsPilledSecondary
    size == SegmentSize.Xl && view == SegmentView.Primary -> SegmentStyles.SegmentXlPrimary
    size == SegmentSize.Xl && view == SegmentView.Secondary -> SegmentStyles.SegmentXlSecondary
    size == SegmentSize.L && view == SegmentView.Primary -> SegmentStyles.SegmentLPrimary
    size == SegmentSize.L && view == SegmentView.Secondary -> SegmentStyles.SegmentLSecondary
    size == SegmentSize.M && view == SegmentView.Primary -> SegmentStyles.SegmentMPrimary
    size == SegmentSize.M && view == SegmentView.Secondary -> SegmentStyles.SegmentMSecondary
    size == SegmentSize.S && view == SegmentView.Primary -> SegmentStyles.SegmentSPrimary
    size == SegmentSize.S && view == SegmentView.Secondary -> SegmentStyles.SegmentSSecondary
    size == SegmentSize.Xs && view == SegmentView.Primary -> SegmentStyles.SegmentXsPrimary
    size == SegmentSize.Xs && view == SegmentView.Secondary -> SegmentStyles.SegmentXsSecondary
    else -> error("Unsupported segment style combination")
}

/**
 * Возвращает [SegmentStyle] для segment
 */
@Composable
public fun SegmentStyles.Companion.style(
    size: SegmentSize = SegmentSize.Xl,
    shape: SegmentShape = SegmentShape.Default,
    view: SegmentView,
    modify: @Composable SegmentStyleBuilder.() -> Unit = {},
): SegmentStyle = resolve(size, shape, view).style(modify)
