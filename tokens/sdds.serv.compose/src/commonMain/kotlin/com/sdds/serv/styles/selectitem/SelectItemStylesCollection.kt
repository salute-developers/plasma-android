// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.selectitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.SelectItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента SelectItem
 */
public enum class SelectItemStyles(
    public val key: String,
) {
    SelectItemSingleNormalXl("SelectItemSingleNormal.Xl"),
    SelectItemSingleNormalL("SelectItemSingleNormal.L"),
    SelectItemSingleNormalM("SelectItemSingleNormal.M"),
    SelectItemSingleNormalS("SelectItemSingleNormal.S"),
    SelectItemSingleNormalXs("SelectItemSingleNormal.Xs"),
    SelectItemSingleTightXl("SelectItemSingleTight.Xl"),
    SelectItemSingleTightL("SelectItemSingleTight.L"),
    SelectItemSingleTightM("SelectItemSingleTight.M"),
    SelectItemSingleTightS("SelectItemSingleTight.S"),
    SelectItemSingleTightXs("SelectItemSingleTight.Xs"),
    SelectItemMultipleNormalXl("SelectItemMultipleNormal.Xl"),
    SelectItemMultipleNormalL("SelectItemMultipleNormal.L"),
    SelectItemMultipleNormalM("SelectItemMultipleNormal.M"),
    SelectItemMultipleNormalS("SelectItemMultipleNormal.S"),
    SelectItemMultipleNormalXs("SelectItemMultipleNormal.Xs"),
    SelectItemMultipleTightXl("SelectItemMultipleTight.Xl"),
    SelectItemMultipleTightL("SelectItemMultipleTight.L"),
    SelectItemMultipleTightM("SelectItemMultipleTight.M"),
    SelectItemMultipleTightS("SelectItemMultipleTight.S"),
    SelectItemMultipleTightXs("SelectItemMultipleTight.Xs"),
    ;

    /**
     * Typed API для подбора стиля select-item-single-normal
     */
    public object SingleNormal

    /**
     * Typed API для подбора стиля select-item-single-tight
     */
    public object SingleTight

    /**
     * Typed API для подбора стиля select-item-multiple-normal
     */
    public object MultipleNormal

    /**
     * Typed API для подбора стиля select-item-multiple-tight
     */
    public object MultipleTight
}

/**
 * Возможные значения свойства size для select-item-single-normal
 */
public enum class SelectItemSingleNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для select-item-single-tight
 */
public enum class SelectItemSingleTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для select-item-multiple-normal
 */
public enum class SelectItemMultipleNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для select-item-multiple-tight
 */
public enum class SelectItemMultipleTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [SelectItemStyle] для [SelectItemStyles]
 */
@Composable
public fun SelectItemStyles.style(modify: @Composable SelectItemStyleBuilder.() -> Unit = {}): SelectItemStyle {
    val builder = when (this) {
        SelectItemStyles.SelectItemSingleNormalXl -> SelectItemSingleNormal.Xl
        SelectItemStyles.SelectItemSingleNormalL -> SelectItemSingleNormal.L
        SelectItemStyles.SelectItemSingleNormalM -> SelectItemSingleNormal.M
        SelectItemStyles.SelectItemSingleNormalS -> SelectItemSingleNormal.S
        SelectItemStyles.SelectItemSingleNormalXs -> SelectItemSingleNormal.Xs
        SelectItemStyles.SelectItemSingleTightXl -> SelectItemSingleTight.Xl
        SelectItemStyles.SelectItemSingleTightL -> SelectItemSingleTight.L
        SelectItemStyles.SelectItemSingleTightM -> SelectItemSingleTight.M
        SelectItemStyles.SelectItemSingleTightS -> SelectItemSingleTight.S
        SelectItemStyles.SelectItemSingleTightXs -> SelectItemSingleTight.Xs
        SelectItemStyles.SelectItemMultipleNormalXl -> SelectItemMultipleNormal.Xl
        SelectItemStyles.SelectItemMultipleNormalL -> SelectItemMultipleNormal.L
        SelectItemStyles.SelectItemMultipleNormalM -> SelectItemMultipleNormal.M
        SelectItemStyles.SelectItemMultipleNormalS -> SelectItemMultipleNormal.S
        SelectItemStyles.SelectItemMultipleNormalXs -> SelectItemMultipleNormal.Xs
        SelectItemStyles.SelectItemMultipleTightXl -> SelectItemMultipleTight.Xl
        SelectItemStyles.SelectItemMultipleTightL -> SelectItemMultipleTight.L
        SelectItemStyles.SelectItemMultipleTightM -> SelectItemMultipleTight.M
        SelectItemStyles.SelectItemMultipleTightS -> SelectItemMultipleTight.S
        SelectItemStyles.SelectItemMultipleTightXs -> SelectItemMultipleTight.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SelectItemStyles] для select-item-single-normal
 */
public fun SelectItemStyles.SingleNormal.resolve(
    size: SelectItemSingleNormalSize =
        SelectItemSingleNormalSize.Xl,
): SelectItemStyles = when {
    size == SelectItemSingleNormalSize.Xl -> SelectItemStyles.SelectItemSingleNormalXl
    size == SelectItemSingleNormalSize.L -> SelectItemStyles.SelectItemSingleNormalL
    size == SelectItemSingleNormalSize.M -> SelectItemStyles.SelectItemSingleNormalM
    size == SelectItemSingleNormalSize.S -> SelectItemStyles.SelectItemSingleNormalS
    size == SelectItemSingleNormalSize.Xs -> SelectItemStyles.SelectItemSingleNormalXs
    else -> error("Unsupported select-item-single-normal style combination")
}

/**
 * Возвращает [SelectItemStyle] для select-item-single-normal
 */
@Composable
public fun SelectItemStyles.SingleNormal.style(
    size: SelectItemSingleNormalSize =
        SelectItemSingleNormalSize.Xl,
    modify: @Composable SelectItemStyleBuilder.() -> Unit = {},
): SelectItemStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [SelectItemStyles] для select-item-single-tight
 */
public fun SelectItemStyles.SingleTight.resolve(
    size: SelectItemSingleTightSize =
        SelectItemSingleTightSize.Xl,
): SelectItemStyles = when {
    size == SelectItemSingleTightSize.Xl -> SelectItemStyles.SelectItemSingleTightXl
    size == SelectItemSingleTightSize.L -> SelectItemStyles.SelectItemSingleTightL
    size == SelectItemSingleTightSize.M -> SelectItemStyles.SelectItemSingleTightM
    size == SelectItemSingleTightSize.S -> SelectItemStyles.SelectItemSingleTightS
    size == SelectItemSingleTightSize.Xs -> SelectItemStyles.SelectItemSingleTightXs
    else -> error("Unsupported select-item-single-tight style combination")
}

/**
 * Возвращает [SelectItemStyle] для select-item-single-tight
 */
@Composable
public fun SelectItemStyles.SingleTight.style(
    size: SelectItemSingleTightSize =
        SelectItemSingleTightSize.Xl,
    modify: @Composable SelectItemStyleBuilder.() -> Unit = {},
): SelectItemStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [SelectItemStyles] для select-item-multiple-normal
 */
public fun SelectItemStyles.MultipleNormal.resolve(
    size: SelectItemMultipleNormalSize =
        SelectItemMultipleNormalSize.Xl,
): SelectItemStyles = when {
    size == SelectItemMultipleNormalSize.Xl -> SelectItemStyles.SelectItemMultipleNormalXl
    size == SelectItemMultipleNormalSize.L -> SelectItemStyles.SelectItemMultipleNormalL
    size == SelectItemMultipleNormalSize.M -> SelectItemStyles.SelectItemMultipleNormalM
    size == SelectItemMultipleNormalSize.S -> SelectItemStyles.SelectItemMultipleNormalS
    size == SelectItemMultipleNormalSize.Xs -> SelectItemStyles.SelectItemMultipleNormalXs
    else -> error("Unsupported select-item-multiple-normal style combination")
}

/**
 * Возвращает [SelectItemStyle] для select-item-multiple-normal
 */
@Composable
public fun SelectItemStyles.MultipleNormal.style(
    size: SelectItemMultipleNormalSize =
        SelectItemMultipleNormalSize.Xl,
    modify: @Composable SelectItemStyleBuilder.() -> Unit =
        {},
): SelectItemStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [SelectItemStyles] для select-item-multiple-tight
 */
public fun SelectItemStyles.MultipleTight.resolve(
    size: SelectItemMultipleTightSize =
        SelectItemMultipleTightSize.Xl,
): SelectItemStyles = when {
    size == SelectItemMultipleTightSize.Xl -> SelectItemStyles.SelectItemMultipleTightXl
    size == SelectItemMultipleTightSize.L -> SelectItemStyles.SelectItemMultipleTightL
    size == SelectItemMultipleTightSize.M -> SelectItemStyles.SelectItemMultipleTightM
    size == SelectItemMultipleTightSize.S -> SelectItemStyles.SelectItemMultipleTightS
    size == SelectItemMultipleTightSize.Xs -> SelectItemStyles.SelectItemMultipleTightXs
    else -> error("Unsupported select-item-multiple-tight style combination")
}

/**
 * Возвращает [SelectItemStyle] для select-item-multiple-tight
 */
@Composable
public fun SelectItemStyles.MultipleTight.style(
    size: SelectItemMultipleTightSize =
        SelectItemMultipleTightSize.Xl,
    modify: @Composable SelectItemStyleBuilder.() -> Unit = {},
): SelectItemStyle = resolve(size).style(modify)
