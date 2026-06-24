// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.segmentitem

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
    SegmentItemXlPilledPrimary("SegmentItem.Xl.Pilled.Primary"),
    SegmentItemXlPilledSecondary("SegmentItem.Xl.Pilled.Secondary"),
    SegmentItemLPrimary("SegmentItem.L.Primary"),
    SegmentItemLSecondary("SegmentItem.L.Secondary"),
    SegmentItemLPilledPrimary("SegmentItem.L.Pilled.Primary"),
    SegmentItemLPilledSecondary("SegmentItem.L.Pilled.Secondary"),
    SegmentItemMPrimary("SegmentItem.M.Primary"),
    SegmentItemMSecondary("SegmentItem.M.Secondary"),
    SegmentItemMPilledPrimary("SegmentItem.M.Pilled.Primary"),
    SegmentItemMPilledSecondary("SegmentItem.M.Pilled.Secondary"),
    SegmentItemSPrimary("SegmentItem.S.Primary"),
    SegmentItemSSecondary("SegmentItem.S.Secondary"),
    SegmentItemSPilledPrimary("SegmentItem.S.Pilled.Primary"),
    SegmentItemSPilledSecondary("SegmentItem.S.Pilled.Secondary"),
    SegmentItemXsPrimary("SegmentItem.Xs.Primary"),
    SegmentItemXsSecondary("SegmentItem.Xs.Secondary"),
    SegmentItemXsPilledPrimary("SegmentItem.Xs.Pilled.Primary"),
    SegmentItemXsPilledSecondary("SegmentItem.Xs.Pilled.Secondary"),
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
}

/**
 * Возвращает [SegmentItemStyle] для [SegmentItemStyles]
 */
@Composable
public fun SegmentItemStyles.style(modify: @Composable SegmentItemStyleBuilder.() -> Unit = {}): SegmentItemStyle {
    val builder = when (this) {
        SegmentItemStyles.SegmentItemXlPrimary -> SegmentItem.Xl.Primary
        SegmentItemStyles.SegmentItemXlSecondary -> SegmentItem.Xl.Secondary
        SegmentItemStyles.SegmentItemXlPilledPrimary -> SegmentItem.Xl.Pilled.Primary
        SegmentItemStyles.SegmentItemXlPilledSecondary -> SegmentItem.Xl.Pilled.Secondary
        SegmentItemStyles.SegmentItemLPrimary -> SegmentItem.L.Primary
        SegmentItemStyles.SegmentItemLSecondary -> SegmentItem.L.Secondary
        SegmentItemStyles.SegmentItemLPilledPrimary -> SegmentItem.L.Pilled.Primary
        SegmentItemStyles.SegmentItemLPilledSecondary -> SegmentItem.L.Pilled.Secondary
        SegmentItemStyles.SegmentItemMPrimary -> SegmentItem.M.Primary
        SegmentItemStyles.SegmentItemMSecondary -> SegmentItem.M.Secondary
        SegmentItemStyles.SegmentItemMPilledPrimary -> SegmentItem.M.Pilled.Primary
        SegmentItemStyles.SegmentItemMPilledSecondary -> SegmentItem.M.Pilled.Secondary
        SegmentItemStyles.SegmentItemSPrimary -> SegmentItem.S.Primary
        SegmentItemStyles.SegmentItemSSecondary -> SegmentItem.S.Secondary
        SegmentItemStyles.SegmentItemSPilledPrimary -> SegmentItem.S.Pilled.Primary
        SegmentItemStyles.SegmentItemSPilledSecondary -> SegmentItem.S.Pilled.Secondary
        SegmentItemStyles.SegmentItemXsPrimary -> SegmentItem.Xs.Primary
        SegmentItemStyles.SegmentItemXsSecondary -> SegmentItem.Xs.Secondary
        SegmentItemStyles.SegmentItemXsPilledPrimary -> SegmentItem.Xs.Pilled.Primary
        SegmentItemStyles.SegmentItemXsPilledSecondary -> SegmentItem.Xs.Pilled.Secondary
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
    size == SegmentItemSize.L && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Primary -> SegmentItemStyles.SegmentItemLPilledPrimary
    size == SegmentItemSize.L && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Secondary -> SegmentItemStyles.SegmentItemLPilledSecondary
    size == SegmentItemSize.M && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Primary -> SegmentItemStyles.SegmentItemMPilledPrimary
    size == SegmentItemSize.M && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Secondary -> SegmentItemStyles.SegmentItemMPilledSecondary
    size == SegmentItemSize.S && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Primary -> SegmentItemStyles.SegmentItemSPilledPrimary
    size == SegmentItemSize.S && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Secondary -> SegmentItemStyles.SegmentItemSPilledSecondary
    size == SegmentItemSize.Xs && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Primary -> SegmentItemStyles.SegmentItemXsPilledPrimary
    size == SegmentItemSize.Xs && shape == SegmentItemShape.Pilled && view ==
        SegmentItemView.Secondary -> SegmentItemStyles.SegmentItemXsPilledSecondary
    size == SegmentItemSize.Xl && view == SegmentItemView.Primary ->
        SegmentItemStyles.SegmentItemXlPrimary
    size == SegmentItemSize.Xl && view == SegmentItemView.Secondary ->
        SegmentItemStyles.SegmentItemXlSecondary
    size == SegmentItemSize.L && view == SegmentItemView.Primary ->
        SegmentItemStyles.SegmentItemLPrimary
    size == SegmentItemSize.L && view == SegmentItemView.Secondary ->
        SegmentItemStyles.SegmentItemLSecondary
    size == SegmentItemSize.M && view == SegmentItemView.Primary ->
        SegmentItemStyles.SegmentItemMPrimary
    size == SegmentItemSize.M && view == SegmentItemView.Secondary ->
        SegmentItemStyles.SegmentItemMSecondary
    size == SegmentItemSize.S && view == SegmentItemView.Primary ->
        SegmentItemStyles.SegmentItemSPrimary
    size == SegmentItemSize.S && view == SegmentItemView.Secondary ->
        SegmentItemStyles.SegmentItemSSecondary
    size == SegmentItemSize.Xs && view == SegmentItemView.Primary ->
        SegmentItemStyles.SegmentItemXsPrimary
    size == SegmentItemSize.Xs && view == SegmentItemView.Secondary ->
        SegmentItemStyles.SegmentItemXsSecondary
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
