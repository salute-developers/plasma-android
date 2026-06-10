// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.combobox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ComboBoxStyle
import com.sdds.compose.uikit.ComboBoxStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ComboBox
 */
public enum class ComboBoxStyles(
    public val key: String,
) {
    ComboBoxSingleNormalXl("ComboBoxSingleNormal.Xl"),
    ComboBoxSingleNormalL("ComboBoxSingleNormal.L"),
    ComboBoxSingleNormalM("ComboBoxSingleNormal.M"),
    ComboBoxSingleNormalS("ComboBoxSingleNormal.S"),
    ComboBoxSingleNormalXs("ComboBoxSingleNormal.Xs"),
    ComboBoxSingleTightXl("ComboBoxSingleTight.Xl"),
    ComboBoxSingleTightL("ComboBoxSingleTight.L"),
    ComboBoxSingleTightM("ComboBoxSingleTight.M"),
    ComboBoxSingleTightS("ComboBoxSingleTight.S"),
    ComboBoxSingleTightXs("ComboBoxSingleTight.Xs"),
    ComboBoxMultipleNormalXl("ComboBoxMultipleNormal.Xl"),
    ComboBoxMultipleNormalL("ComboBoxMultipleNormal.L"),
    ComboBoxMultipleNormalM("ComboBoxMultipleNormal.M"),
    ComboBoxMultipleNormalS("ComboBoxMultipleNormal.S"),
    ComboBoxMultipleNormalXs("ComboBoxMultipleNormal.Xs"),
    ComboBoxMultipleTightXl("ComboBoxMultipleTight.Xl"),
    ComboBoxMultipleTightL("ComboBoxMultipleTight.L"),
    ComboBoxMultipleTightM("ComboBoxMultipleTight.M"),
    ComboBoxMultipleTightS("ComboBoxMultipleTight.S"),
    ComboBoxMultipleTightXs("ComboBoxMultipleTight.Xs"),
    ;

    /**
     * Typed API для подбора стиля combo-box-single-normal
     */
    public object SingleNormal

    /**
     * Typed API для подбора стиля combo-box-single-tight
     */
    public object SingleTight

    /**
     * Typed API для подбора стиля combo-box-multiple-normal
     */
    public object MultipleNormal

    /**
     * Typed API для подбора стиля combo-box-multiple-tight
     */
    public object MultipleTight
}

/**
 * Возможные значения свойства size для combo-box-single-normal
 */
public enum class ComboBoxSingleNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для combo-box-single-tight
 */
public enum class ComboBoxSingleTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для combo-box-multiple-normal
 */
public enum class ComboBoxMultipleNormalSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства size для combo-box-multiple-tight
 */
public enum class ComboBoxMultipleTightSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [ComboBoxStyle] для [ComboBoxStyles]
 */
@Composable
public fun ComboBoxStyles.style(modify: @Composable ComboBoxStyleBuilder.() -> Unit = {}): ComboBoxStyle {
    val builder = when (this) {
        ComboBoxStyles.ComboBoxSingleNormalXl -> ComboBoxSingleNormal.Xl
        ComboBoxStyles.ComboBoxSingleNormalL -> ComboBoxSingleNormal.L
        ComboBoxStyles.ComboBoxSingleNormalM -> ComboBoxSingleNormal.M
        ComboBoxStyles.ComboBoxSingleNormalS -> ComboBoxSingleNormal.S
        ComboBoxStyles.ComboBoxSingleNormalXs -> ComboBoxSingleNormal.Xs
        ComboBoxStyles.ComboBoxSingleTightXl -> ComboBoxSingleTight.Xl
        ComboBoxStyles.ComboBoxSingleTightL -> ComboBoxSingleTight.L
        ComboBoxStyles.ComboBoxSingleTightM -> ComboBoxSingleTight.M
        ComboBoxStyles.ComboBoxSingleTightS -> ComboBoxSingleTight.S
        ComboBoxStyles.ComboBoxSingleTightXs -> ComboBoxSingleTight.Xs
        ComboBoxStyles.ComboBoxMultipleNormalXl -> ComboBoxMultipleNormal.Xl
        ComboBoxStyles.ComboBoxMultipleNormalL -> ComboBoxMultipleNormal.L
        ComboBoxStyles.ComboBoxMultipleNormalM -> ComboBoxMultipleNormal.M
        ComboBoxStyles.ComboBoxMultipleNormalS -> ComboBoxMultipleNormal.S
        ComboBoxStyles.ComboBoxMultipleNormalXs -> ComboBoxMultipleNormal.Xs
        ComboBoxStyles.ComboBoxMultipleTightXl -> ComboBoxMultipleTight.Xl
        ComboBoxStyles.ComboBoxMultipleTightL -> ComboBoxMultipleTight.L
        ComboBoxStyles.ComboBoxMultipleTightM -> ComboBoxMultipleTight.M
        ComboBoxStyles.ComboBoxMultipleTightS -> ComboBoxMultipleTight.S
        ComboBoxStyles.ComboBoxMultipleTightXs -> ComboBoxMultipleTight.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ComboBoxStyles] для combo-box-single-normal
 */
public fun ComboBoxStyles.SingleNormal.resolve(
    size: ComboBoxSingleNormalSize =
        ComboBoxSingleNormalSize.Xl,
): ComboBoxStyles = when {
    size == ComboBoxSingleNormalSize.Xl -> ComboBoxStyles.ComboBoxSingleNormalXl
    size == ComboBoxSingleNormalSize.L -> ComboBoxStyles.ComboBoxSingleNormalL
    size == ComboBoxSingleNormalSize.M -> ComboBoxStyles.ComboBoxSingleNormalM
    size == ComboBoxSingleNormalSize.S -> ComboBoxStyles.ComboBoxSingleNormalS
    size == ComboBoxSingleNormalSize.Xs -> ComboBoxStyles.ComboBoxSingleNormalXs
    else -> error("Unsupported combo-box-single-normal style combination")
}

/**
 * Возвращает [ComboBoxStyle] для combo-box-single-normal
 */
@Composable
public fun ComboBoxStyles.SingleNormal.style(
    size: ComboBoxSingleNormalSize =
        ComboBoxSingleNormalSize.Xl,
    modify: @Composable ComboBoxStyleBuilder.() -> Unit = {},
): ComboBoxStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ComboBoxStyles] для combo-box-single-tight
 */
public fun ComboBoxStyles.SingleTight.resolve(
    size: ComboBoxSingleTightSize =
        ComboBoxSingleTightSize.Xl,
): ComboBoxStyles = when {
    size == ComboBoxSingleTightSize.Xl -> ComboBoxStyles.ComboBoxSingleTightXl
    size == ComboBoxSingleTightSize.L -> ComboBoxStyles.ComboBoxSingleTightL
    size == ComboBoxSingleTightSize.M -> ComboBoxStyles.ComboBoxSingleTightM
    size == ComboBoxSingleTightSize.S -> ComboBoxStyles.ComboBoxSingleTightS
    size == ComboBoxSingleTightSize.Xs -> ComboBoxStyles.ComboBoxSingleTightXs
    else -> error("Unsupported combo-box-single-tight style combination")
}

/**
 * Возвращает [ComboBoxStyle] для combo-box-single-tight
 */
@Composable
public fun ComboBoxStyles.SingleTight.style(
    size: ComboBoxSingleTightSize =
        ComboBoxSingleTightSize.Xl,
    modify: @Composable ComboBoxStyleBuilder.() -> Unit = {},
): ComboBoxStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ComboBoxStyles] для combo-box-multiple-normal
 */
public fun ComboBoxStyles.MultipleNormal.resolve(
    size: ComboBoxMultipleNormalSize =
        ComboBoxMultipleNormalSize.Xl,
): ComboBoxStyles = when {
    size == ComboBoxMultipleNormalSize.Xl -> ComboBoxStyles.ComboBoxMultipleNormalXl
    size == ComboBoxMultipleNormalSize.L -> ComboBoxStyles.ComboBoxMultipleNormalL
    size == ComboBoxMultipleNormalSize.M -> ComboBoxStyles.ComboBoxMultipleNormalM
    size == ComboBoxMultipleNormalSize.S -> ComboBoxStyles.ComboBoxMultipleNormalS
    size == ComboBoxMultipleNormalSize.Xs -> ComboBoxStyles.ComboBoxMultipleNormalXs
    else -> error("Unsupported combo-box-multiple-normal style combination")
}

/**
 * Возвращает [ComboBoxStyle] для combo-box-multiple-normal
 */
@Composable
public fun ComboBoxStyles.MultipleNormal.style(
    size: ComboBoxMultipleNormalSize =
        ComboBoxMultipleNormalSize.Xl,
    modify: @Composable ComboBoxStyleBuilder.() -> Unit = {},
): ComboBoxStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ComboBoxStyles] для combo-box-multiple-tight
 */
public fun ComboBoxStyles.MultipleTight.resolve(
    size: ComboBoxMultipleTightSize =
        ComboBoxMultipleTightSize.Xl,
): ComboBoxStyles = when {
    size == ComboBoxMultipleTightSize.Xl -> ComboBoxStyles.ComboBoxMultipleTightXl
    size == ComboBoxMultipleTightSize.L -> ComboBoxStyles.ComboBoxMultipleTightL
    size == ComboBoxMultipleTightSize.M -> ComboBoxStyles.ComboBoxMultipleTightM
    size == ComboBoxMultipleTightSize.S -> ComboBoxStyles.ComboBoxMultipleTightS
    size == ComboBoxMultipleTightSize.Xs -> ComboBoxStyles.ComboBoxMultipleTightXs
    else -> error("Unsupported combo-box-multiple-tight style combination")
}

/**
 * Возвращает [ComboBoxStyle] для combo-box-multiple-tight
 */
@Composable
public fun ComboBoxStyles.MultipleTight.style(
    size: ComboBoxMultipleTightSize =
        ComboBoxMultipleTightSize.Xl,
    modify: @Composable ComboBoxStyleBuilder.() -> Unit = {},
): ComboBoxStyle = resolve(size).style(modify)
