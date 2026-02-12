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
}

/**
 * Возвращает [FormItemStyle] для [FormItemStyles]
 */
@Composable
public fun FormItemStyles.style(modifyAction: @Composable FormItemStyleBuilder.() -> Unit = {}): FormItemStyle {
    val builder = when (this) {
        FormItemStyles.FormItemDefault -> FormItem.Default
        FormItemStyles.FormItemPositive -> FormItem.Positive
        FormItemStyles.FormItemNegative -> FormItem.Negative
        FormItemStyles.FormItemWarning -> FormItem.Warning
    }
    return builder.modify(modifyAction).style()
}
