// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.select

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.SelectStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Select
 */
public enum class SelectStyles(
    public val key: String,
) {
    SelectSingleNormalXl("SelectSingleNormal.Xl"),
    SelectSingleNormalL("SelectSingleNormal.L"),
    SelectSingleNormalM("SelectSingleNormal.M"),
    SelectSingleNormalS("SelectSingleNormal.S"),
    SelectSingleNormalXs("SelectSingleNormal.Xs"),
    SelectSingleTightXl("SelectSingleTight.Xl"),
    SelectSingleTightL("SelectSingleTight.L"),
    SelectSingleTightM("SelectSingleTight.M"),
    SelectSingleTightS("SelectSingleTight.S"),
    SelectSingleTightXs("SelectSingleTight.Xs"),
    SelectMultipleNormalXl("SelectMultipleNormal.Xl"),
    SelectMultipleNormalL("SelectMultipleNormal.L"),
    SelectMultipleNormalM("SelectMultipleNormal.M"),
    SelectMultipleNormalS("SelectMultipleNormal.S"),
    SelectMultipleNormalXs("SelectMultipleNormal.Xs"),
    SelectMultipleTightXl("SelectMultipleTight.Xl"),
    SelectMultipleTightL("SelectMultipleTight.L"),
    SelectMultipleTightM("SelectMultipleTight.M"),
    SelectMultipleTightS("SelectMultipleTight.S"),
    SelectMultipleTightXs("SelectMultipleTight.Xs"),
    ;

    /**
     * Typed API для подбора стиля select-single-normal
     */
    public object SingleNormal

    /**
     * Typed API для подбора стиля select-single-tight
     */
    public object SingleTight

    /**
     * Typed API для подбора стиля select-multiple-normal
     */
    public object MultipleNormal

    /**
     * Typed API для подбора стиля select-multiple-tight
     */
    public object MultipleTight
}

/**
 * Возможные значения свойства size для select-single-normal
 */
public enum class SelectSingleNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для select-single-tight
 */
public enum class SelectSingleTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для select-multiple-normal
 */
public enum class SelectMultipleNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для select-multiple-tight
 */
public enum class SelectMultipleTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [SelectStyle] для [SelectStyles]
 */
@Composable
public fun SelectStyles.style(modify: @Composable SelectStyleBuilder.() -> Unit = {}): SelectStyle {
    val builder = when (this) {
        SelectStyles.SelectSingleNormalXl -> SelectSingleNormal.Xl
        SelectStyles.SelectSingleNormalL -> SelectSingleNormal.L
        SelectStyles.SelectSingleNormalM -> SelectSingleNormal.M
        SelectStyles.SelectSingleNormalS -> SelectSingleNormal.S
        SelectStyles.SelectSingleNormalXs -> SelectSingleNormal.Xs
        SelectStyles.SelectSingleTightXl -> SelectSingleTight.Xl
        SelectStyles.SelectSingleTightL -> SelectSingleTight.L
        SelectStyles.SelectSingleTightM -> SelectSingleTight.M
        SelectStyles.SelectSingleTightS -> SelectSingleTight.S
        SelectStyles.SelectSingleTightXs -> SelectSingleTight.Xs
        SelectStyles.SelectMultipleNormalXl -> SelectMultipleNormal.Xl
        SelectStyles.SelectMultipleNormalL -> SelectMultipleNormal.L
        SelectStyles.SelectMultipleNormalM -> SelectMultipleNormal.M
        SelectStyles.SelectMultipleNormalS -> SelectMultipleNormal.S
        SelectStyles.SelectMultipleNormalXs -> SelectMultipleNormal.Xs
        SelectStyles.SelectMultipleTightXl -> SelectMultipleTight.Xl
        SelectStyles.SelectMultipleTightL -> SelectMultipleTight.L
        SelectStyles.SelectMultipleTightM -> SelectMultipleTight.M
        SelectStyles.SelectMultipleTightS -> SelectMultipleTight.S
        SelectStyles.SelectMultipleTightXs -> SelectMultipleTight.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SelectStyles] для select-single-normal
 */
public fun SelectStyles.SingleNormal.resolve(
    size: SelectSingleNormalSize =
        SelectSingleNormalSize.Xl,
): SelectStyles = when {
    size == SelectSingleNormalSize.Xl -> SelectStyles.SelectSingleNormalXl
    size == SelectSingleNormalSize.L -> SelectStyles.SelectSingleNormalL
    size == SelectSingleNormalSize.M -> SelectStyles.SelectSingleNormalM
    size == SelectSingleNormalSize.S -> SelectStyles.SelectSingleNormalS
    size == SelectSingleNormalSize.Xs -> SelectStyles.SelectSingleNormalXs
    else -> error("Unsupported select-single-normal style combination")
}

/**
 * Возвращает [SelectStyle] для select-single-normal
 */
@Composable
public fun SelectStyles.SingleNormal.style(
    size: SelectSingleNormalSize = SelectSingleNormalSize.Xl,
    modify: @Composable SelectStyleBuilder.() -> Unit = {},
): SelectStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [SelectStyles] для select-single-tight
 */
public fun SelectStyles.SingleTight.resolve(size: SelectSingleTightSize = SelectSingleTightSize.Xl):
    SelectStyles = when {
    size == SelectSingleTightSize.Xl -> SelectStyles.SelectSingleTightXl
    size == SelectSingleTightSize.L -> SelectStyles.SelectSingleTightL
    size == SelectSingleTightSize.M -> SelectStyles.SelectSingleTightM
    size == SelectSingleTightSize.S -> SelectStyles.SelectSingleTightS
    size == SelectSingleTightSize.Xs -> SelectStyles.SelectSingleTightXs
    else -> error("Unsupported select-single-tight style combination")
}

/**
 * Возвращает [SelectStyle] для select-single-tight
 */
@Composable
public fun SelectStyles.SingleTight.style(
    size: SelectSingleTightSize = SelectSingleTightSize.Xl,
    modify: @Composable SelectStyleBuilder.() -> Unit = {},
): SelectStyle =
    resolve(size).style(modify)

/**
 * Возвращает экземпляр [SelectStyles] для select-multiple-normal
 */
public fun SelectStyles.MultipleNormal.resolve(
    size: SelectMultipleNormalSize =
        SelectMultipleNormalSize.Xl,
): SelectStyles = when {
    size == SelectMultipleNormalSize.Xl -> SelectStyles.SelectMultipleNormalXl
    size == SelectMultipleNormalSize.L -> SelectStyles.SelectMultipleNormalL
    size == SelectMultipleNormalSize.M -> SelectStyles.SelectMultipleNormalM
    size == SelectMultipleNormalSize.S -> SelectStyles.SelectMultipleNormalS
    size == SelectMultipleNormalSize.Xs -> SelectStyles.SelectMultipleNormalXs
    else -> error("Unsupported select-multiple-normal style combination")
}

/**
 * Возвращает [SelectStyle] для select-multiple-normal
 */
@Composable
public fun SelectStyles.MultipleNormal.style(
    size: SelectMultipleNormalSize =
        SelectMultipleNormalSize.Xl,
    modify: @Composable SelectStyleBuilder.() -> Unit = {},
): SelectStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [SelectStyles] для select-multiple-tight
 */
public fun SelectStyles.MultipleTight.resolve(
    size: SelectMultipleTightSize =
        SelectMultipleTightSize.Xl,
): SelectStyles = when {
    size == SelectMultipleTightSize.Xl -> SelectStyles.SelectMultipleTightXl
    size == SelectMultipleTightSize.L -> SelectStyles.SelectMultipleTightL
    size == SelectMultipleTightSize.M -> SelectStyles.SelectMultipleTightM
    size == SelectMultipleTightSize.S -> SelectStyles.SelectMultipleTightS
    size == SelectMultipleTightSize.Xs -> SelectStyles.SelectMultipleTightXs
    else -> error("Unsupported select-multiple-tight style combination")
}

/**
 * Возвращает [SelectStyle] для select-multiple-tight
 */
@Composable
public fun SelectStyles.MultipleTight.style(
    size: SelectMultipleTightSize =
        SelectMultipleTightSize.Xl,
    modify: @Composable SelectStyleBuilder.() -> Unit = {},
): SelectStyle = resolve(size).style(modify)
