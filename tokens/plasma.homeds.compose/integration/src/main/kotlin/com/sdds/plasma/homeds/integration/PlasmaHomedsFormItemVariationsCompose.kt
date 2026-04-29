// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.formitem.Default
import com.sdds.plasma.homeds.styles.formitem.FormItem
import com.sdds.plasma.homeds.styles.formitem.FormItemStyles
import com.sdds.plasma.homeds.styles.formitem.FormItemView
import com.sdds.plasma.homeds.styles.formitem.Negative
import com.sdds.plasma.homeds.styles.formitem.Positive
import com.sdds.plasma.homeds.styles.formitem.Warning
import com.sdds.plasma.homeds.styles.formitem.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsFormItemVariationsCompose : ComposeStyleProvider<FormItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Positive", "Negative", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<FormItemStyle>> =
        mapOf(
            "FormItem.Default" to ComposeStyleReference { FormItem.Default.style() },
            "FormItem.Positive" to ComposeStyleReference { FormItem.Positive.style() },
            "FormItem.Negative" to ComposeStyleReference { FormItem.Negative.style() },
            "FormItem.Warning" to ComposeStyleReference { FormItem.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return FormItemStyles.resolve(
            view = when (bindings["view"]?.toString()) {
                "Default" -> FormItemView.Default
                "Positive" -> FormItemView.Positive
                "Negative" -> FormItemView.Negative
                "Warning" -> FormItemView.Warning
                else -> FormItemView.Default
            },
        ).key
    }
}
