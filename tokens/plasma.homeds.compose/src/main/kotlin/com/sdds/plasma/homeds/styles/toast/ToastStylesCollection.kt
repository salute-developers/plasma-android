// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.toast

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
    ToastDefault("Toast.Default"),
    ToastPositive("Toast.Positive"),
    ToastNegative("Toast.Negative"),
    ;

    /**
     * Typed API для подбора стиля toast
     */
    public companion object
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
        ToastStyles.ToastDefault -> Toast.Default
        ToastStyles.ToastPositive -> Toast.Positive
        ToastStyles.ToastNegative -> Toast.Negative
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ToastStyles] для toast
 */
public fun ToastStyles.Companion.resolve(view: ToastView = ToastView.Default): ToastStyles = when {
    view == ToastView.Default -> ToastStyles.ToastDefault
    view == ToastView.Positive -> ToastStyles.ToastPositive
    view == ToastView.Negative -> ToastStyles.ToastNegative
    else -> error("Unsupported toast style combination")
}

/**
 * Возвращает [ToastStyle] для toast
 */
@Composable
public fun ToastStyles.Companion.style(
    view: ToastView = ToastView.Default,
    modify: @Composable
    ToastStyleBuilder.() -> Unit = {},
): ToastStyle = resolve(view).style(modify)
