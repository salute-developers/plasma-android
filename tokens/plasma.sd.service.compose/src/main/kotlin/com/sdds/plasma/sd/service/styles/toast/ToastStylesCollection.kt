// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.sd.service.styles.toast

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.ToastStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Toast
 */
public enum class ToastStyles(
    public val key: String,
) {
    ToastRoundedDefault("Toast.Rounded.Default"),
    ToastRoundedPositive("Toast.Rounded.Positive"),
    ToastRoundedNegative("Toast.Rounded.Negative"),
    ToastPilledDefault("Toast.Pilled.Default"),
    ToastPilledPositive("Toast.Pilled.Positive"),
    ToastPilledNegative("Toast.Pilled.Negative"),
    ;

    /**
     * Typed API для подбора стиля toast
     */
    public companion object
}

/**
 * Возможные значения свойства shape для toast
 */
public enum class ToastShape {
    Rounded,
    Pilled,
}

/**
 * Возможные значения свойства view для toast
 */
public enum class ToastView {
    Default,
    Positive,
    Negative,
}

/**
 * Возвращает [ToastStyle] для [ToastStyles]
 */
@Composable
public fun ToastStyles.style(modify: @Composable ToastStyleBuilder.() -> Unit = {}): ToastStyle {
    val builder = when (this) {
        ToastStyles.ToastRoundedDefault -> Toast.Rounded.Default
        ToastStyles.ToastRoundedPositive -> Toast.Rounded.Positive
        ToastStyles.ToastRoundedNegative -> Toast.Rounded.Negative
        ToastStyles.ToastPilledDefault -> Toast.Pilled.Default
        ToastStyles.ToastPilledPositive -> Toast.Pilled.Positive
        ToastStyles.ToastPilledNegative -> Toast.Pilled.Negative
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ToastStyles] для toast
 */
public fun ToastStyles.Companion.resolve(
    shape: ToastShape = ToastShape.Rounded,
    view: ToastView =
        ToastView.Default,
): ToastStyles = when {
    shape == ToastShape.Rounded && view == ToastView.Default -> ToastStyles.ToastRoundedDefault
    shape == ToastShape.Rounded && view == ToastView.Positive -> ToastStyles.ToastRoundedPositive
    shape == ToastShape.Rounded && view == ToastView.Negative -> ToastStyles.ToastRoundedNegative
    shape == ToastShape.Pilled && view == ToastView.Default -> ToastStyles.ToastPilledDefault
    shape == ToastShape.Pilled && view == ToastView.Positive -> ToastStyles.ToastPilledPositive
    shape == ToastShape.Pilled && view == ToastView.Negative -> ToastStyles.ToastPilledNegative
    else -> error("Unsupported toast style combination")
}

/**
 * Возвращает [ToastStyle] для toast
 */
@Composable
public fun ToastStyles.Companion.style(
    shape: ToastShape = ToastShape.Rounded,
    view: ToastView = ToastView.Default,
    modify: @Composable ToastStyleBuilder.() -> Unit = {},
): ToastStyle = resolve(shape, view).style(modify)
