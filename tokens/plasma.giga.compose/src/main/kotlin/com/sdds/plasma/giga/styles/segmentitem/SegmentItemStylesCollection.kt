// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.giga.styles.segmentitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента SegmentItem
 */
public enum class SegmentItemStyles(
    public val key: String,
) {
    SegmentItemXlPrimary("SegmentItem.Xl.Primary"),
    SegmentItemXlSecondary("SegmentItem.Xl.Secondary"),
    SegmentItemXlAccent("SegmentItem.Xl.Accent"),
    SegmentItemXlPilledPrimary("SegmentItem.Xl.Pilled.Primary"),
    SegmentItemXlPilledSecondary("SegmentItem.Xl.Pilled.Secondary"),
    SegmentItemXlPilledAccent("SegmentItem.Xl.Pilled.Accent"),
    SegmentItemLPrimary("SegmentItem.L.Primary"),
    SegmentItemLSecondary("SegmentItem.L.Secondary"),
    SegmentItemLAccent("SegmentItem.L.Accent"),
    SegmentItemLPilledPrimary("SegmentItem.L.Pilled.Primary"),
    SegmentItemLPilledSecondary("SegmentItem.L.Pilled.Secondary"),
    SegmentItemLPilledAccent("SegmentItem.L.Pilled.Accent"),
    SegmentItemMPrimary("SegmentItem.M.Primary"),
    SegmentItemMSecondary("SegmentItem.M.Secondary"),
    SegmentItemMAccent("SegmentItem.M.Accent"),
    SegmentItemMPilledPrimary("SegmentItem.M.Pilled.Primary"),
    SegmentItemMPilledSecondary("SegmentItem.M.Pilled.Secondary"),
    SegmentItemMPilledAccent("SegmentItem.M.Pilled.Accent"),
    SegmentItemSPrimary("SegmentItem.S.Primary"),
    SegmentItemSSecondary("SegmentItem.S.Secondary"),
    SegmentItemSAccent("SegmentItem.S.Accent"),
    SegmentItemSPilledPrimary("SegmentItem.S.Pilled.Primary"),
    SegmentItemSPilledSecondary("SegmentItem.S.Pilled.Secondary"),
    SegmentItemSPilledAccent("SegmentItem.S.Pilled.Accent"),
    SegmentItemXsPrimary("SegmentItem.Xs.Primary"),
    SegmentItemXsSecondary("SegmentItem.Xs.Secondary"),
    SegmentItemXsAccent("SegmentItem.Xs.Accent"),
    SegmentItemXsPilledPrimary("SegmentItem.Xs.Pilled.Primary"),
    SegmentItemXsPilledSecondary("SegmentItem.Xs.Pilled.Secondary"),
    SegmentItemXsPilledAccent("SegmentItem.Xs.Pilled.Accent"),
    ;

    /**
     * Typed API для подбора стиля segment-item
     */
    public companion object
}

/**
 * Возможные значения свойства size для segment-item
 */
public enum class SegmentItemSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства shape для segment-item
 */
public enum class SegmentItemShape {
    Default,
    Pilled,
}

/**
 * Возможные значения свойства view для segment-item
 */
public enum class SegmentItemView {
    Primary,
    Secondary,
    Accent,
}

/**
 * Возвращает [SegmentItemStyle] для [SegmentItemStyles]
 */
@Composable
public fun SegmentItemStyles.style(modify: @Composable SegmentItemStyleBuilder.() -> Unit = {}): SegmentItemStyle {
    val builder = when (this) {
        SegmentItemStyles.SegmentItemXlPrimary -> SegmentItem.Xl.Primary
        SegmentItemStyles.SegmentItemXlSecondary -> SegmentItem.Xl.Secondary
        SegmentItemStyles.SegmentItemXlAccent -> SegmentItem.Xl.Accent
        SegmentItemStyles.SegmentItemXlPilledPrimary -> SegmentItem.Xl.Pilled.Primary
        SegmentItemStyles.SegmentItemXlPilledSecondary -> SegmentItem.Xl.Pilled.Secondary
        SegmentItemStyles.SegmentItemXlPilledAccent -> SegmentItem.Xl.Pilled.Accent
        SegmentItemStyles.SegmentItemLPrimary -> SegmentItem.L.Primary
        SegmentItemStyles.SegmentItemLSecondary -> SegmentItem.L.Secondary
        SegmentItemStyles.SegmentItemLAccent -> SegmentItem.L.Accent
        SegmentItemStyles.SegmentItemLPilledPrimary -> SegmentItem.L.Pilled.Primary
        SegmentItemStyles.SegmentItemLPilledSecondary -> SegmentItem.L.Pilled.Secondary
        SegmentItemStyles.SegmentItemLPilledAccent -> SegmentItem.L.Pilled.Accent
        SegmentItemStyles.SegmentItemMPrimary -> SegmentItem.M.Primary
        SegmentItemStyles.SegmentItemMSecondary -> SegmentItem.M.Secondary
        SegmentItemStyles.SegmentItemMAccent -> SegmentItem.M.Accent
        SegmentItemStyles.SegmentItemMPilledPrimary -> SegmentItem.M.Pilled.Primary
        SegmentItemStyles.SegmentItemMPilledSecondary -> SegmentItem.M.Pilled.Secondary
        SegmentItemStyles.SegmentItemMPilledAccent -> SegmentItem.M.Pilled.Accent
        SegmentItemStyles.SegmentItemSPrimary -> SegmentItem.S.Primary
        SegmentItemStyles.SegmentItemSSecondary -> SegmentItem.S.Secondary
        SegmentItemStyles.SegmentItemSAccent -> SegmentItem.S.Accent
        SegmentItemStyles.SegmentItemSPilledPrimary -> SegmentItem.S.Pilled.Primary
        SegmentItemStyles.SegmentItemSPilledSecondary -> SegmentItem.S.Pilled.Secondary
        SegmentItemStyles.SegmentItemSPilledAccent -> SegmentItem.S.Pilled.Accent
        SegmentItemStyles.SegmentItemXsPrimary -> SegmentItem.Xs.Primary
        SegmentItemStyles.SegmentItemXsSecondary -> SegmentItem.Xs.Secondary
        SegmentItemStyles.SegmentItemXsAccent -> SegmentItem.Xs.Accent
        SegmentItemStyles.SegmentItemXsPilledPrimary -> SegmentItem.Xs.Pilled.Primary
        SegmentItemStyles.SegmentItemXsPilledSecondary -> SegmentItem.Xs.Pilled.Secondary
        SegmentItemStyles.SegmentItemXsPilledAccent -> SegmentItem.Xs.Pilled.Accent
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SegmentItemStyles] для segment-item
 */
public fun SegmentItemStyles.Companion.resolve(
    size: SegmentItemSize = SegmentItemSize.Xl,
    shape: SegmentItemShape = SegmentItemShape.Default,
    view: SegmentItemView = SegmentItemView.Primary,
): SegmentItemStyles = when {
    size == SegmentItemSize.Xl && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Primary -> SegmentItemStyles.SegmentItemXlPilledPrimary
    size == SegmentItemSize.Xl && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Secondary -> SegmentItemStyles.SegmentItemXlPilledSecondary
    size == SegmentItemSize.Xl && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Accent -> SegmentItemStyles.SegmentItemXlPilledAccent
    size == SegmentItemSize.L && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Primary -> SegmentItemStyles.SegmentItemLPilledPrimary
    size == SegmentItemSize.L && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Secondary -> SegmentItemStyles.SegmentItemLPilledSecondary
    size == SegmentItemSize.L && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Accent -> SegmentItemStyles.SegmentItemLPilledAccent
    size == SegmentItemSize.M && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Primary -> SegmentItemStyles.SegmentItemMPilledPrimary
    size == SegmentItemSize.M && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Secondary -> SegmentItemStyles.SegmentItemMPilledSecondary
    size == SegmentItemSize.M && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Accent -> SegmentItemStyles.SegmentItemMPilledAccent
    size == SegmentItemSize.S && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Primary -> SegmentItemStyles.SegmentItemSPilledPrimary
    size == SegmentItemSize.S && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Secondary -> SegmentItemStyles.SegmentItemSPilledSecondary
    size == SegmentItemSize.S && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Accent -> SegmentItemStyles.SegmentItemSPilledAccent
    size == SegmentItemSize.Xs && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Primary -> SegmentItemStyles.SegmentItemXsPilledPrimary
    size == SegmentItemSize.Xs && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Secondary -> SegmentItemStyles.SegmentItemXsPilledSecondary
    size == SegmentItemSize.Xs && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Accent -> SegmentItemStyles.SegmentItemXsPilledAccent
    size == SegmentItemSize.Xl && view == SegmentItemView.Primary ->
        SegmentItemStyles.SegmentItemXlPrimary
    size == SegmentItemSize.Xl && view == SegmentItemView.Secondary ->
        SegmentItemStyles.SegmentItemXlSecondary
    size == SegmentItemSize.Xl && view == SegmentItemView.Accent ->
        SegmentItemStyles.SegmentItemXlAccent
    size == SegmentItemSize.L && view == SegmentItemView.Primary ->
        SegmentItemStyles.SegmentItemLPrimary
    size == SegmentItemSize.L && view == SegmentItemView.Secondary ->
        SegmentItemStyles.SegmentItemLSecondary
    size == SegmentItemSize.L && view == SegmentItemView.Accent ->
        SegmentItemStyles.SegmentItemLAccent
    size == SegmentItemSize.M && view == SegmentItemView.Primary ->
        SegmentItemStyles.SegmentItemMPrimary
    size == SegmentItemSize.M && view == SegmentItemView.Secondary ->
        SegmentItemStyles.SegmentItemMSecondary
    size == SegmentItemSize.M && view == SegmentItemView.Accent ->
        SegmentItemStyles.SegmentItemMAccent
    size == SegmentItemSize.S && view == SegmentItemView.Primary ->
        SegmentItemStyles.SegmentItemSPrimary
    size == SegmentItemSize.S && view == SegmentItemView.Secondary ->
        SegmentItemStyles.SegmentItemSSecondary
    size == SegmentItemSize.S && view == SegmentItemView.Accent ->
        SegmentItemStyles.SegmentItemSAccent
    size == SegmentItemSize.Xs && view == SegmentItemView.Primary ->
        SegmentItemStyles.SegmentItemXsPrimary
    size == SegmentItemSize.Xs && view == SegmentItemView.Secondary ->
        SegmentItemStyles.SegmentItemXsSecondary
    size == SegmentItemSize.Xs && view == SegmentItemView.Accent ->
        SegmentItemStyles.SegmentItemXsAccent
    else -> error("Unsupported segment-item style combination")
}

/**
 * Возвращает [SegmentItemStyle] для segment-item
 */
@Composable
public fun SegmentItemStyles.Companion.style(
    size: SegmentItemSize = SegmentItemSize.Xl,
    shape: SegmentItemShape = SegmentItemShape.Default,
    view: SegmentItemView = SegmentItemView.Primary,
    modify: @Composable SegmentItemStyleBuilder.() -> Unit = {},
): SegmentItemStyle = resolve(size, shape, view).style(modify)
