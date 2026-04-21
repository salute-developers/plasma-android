// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.formitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.FormItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента FormItem
 */
public enum class FormItemStyles(
    public val key: String,
) {
    FormItemDefault("FormItem.Default"),
    FormItemPositive("FormItem.Positive"),
    FormItemNegative("FormItem.Negative"),
    FormItemWarning("FormItem.Warning"),
    ;

    /**
     * Typed API для подбора стиля form-item
     */
    public companion object
}

/**
 * Возможные значения свойства view для form-item
 */
public enum class FormItemView {
    Default,
    Positive,
    Negative,
    Warning,
}

/**
 * Возвращает [FormItemStyle] для [FormItemStyles]
 */
@Composable
public fun FormItemStyles.style(modify: @Composable FormItemStyleBuilder.() -> Unit = {}): FormItemStyle {
    val builder = when (this) {
        FormItemStyles.FormItemDefault -> FormItem.Default
        FormItemStyles.FormItemPositive -> FormItem.Positive
        FormItemStyles.FormItemNegative -> FormItem.Negative
        FormItemStyles.FormItemWarning -> FormItem.Warning
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [FormItemStyles] для form-item
 */
public fun FormItemStyles.Companion.resolve(view: FormItemView = FormItemView.Default): FormItemStyles = when {
    view == FormItemView.Default -> FormItemStyles.FormItemDefault
    view == FormItemView.Positive -> FormItemStyles.FormItemPositive
    view == FormItemView.Negative -> FormItemStyles.FormItemNegative
    view == FormItemView.Warning -> FormItemStyles.FormItemWarning
    else -> error("Unsupported form-item style combination")
}

/**
 * Возвращает [FormItemStyle] для form-item
 */
@Composable
public fun FormItemStyles.Companion.style(
    view: FormItemView = FormItemView.Default,
    modify: @Composable FormItemStyleBuilder.() -> Unit = {},
): FormItemStyle =
    resolve(view).style(modify)
