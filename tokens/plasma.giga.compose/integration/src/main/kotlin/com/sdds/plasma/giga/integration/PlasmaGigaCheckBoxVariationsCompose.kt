// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.checkbox.CheckBox
import com.sdds.plasma.giga.styles.checkbox.CheckBoxSize
import com.sdds.plasma.giga.styles.checkbox.CheckBoxStyles
import com.sdds.plasma.giga.styles.checkbox.CheckBoxView
import com.sdds.plasma.giga.styles.checkbox.Default
import com.sdds.plasma.giga.styles.checkbox.L
import com.sdds.plasma.giga.styles.checkbox.M
import com.sdds.plasma.giga.styles.checkbox.Negative
import com.sdds.plasma.giga.styles.checkbox.Positive
import com.sdds.plasma.giga.styles.checkbox.S
import com.sdds.plasma.giga.styles.checkbox.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaCheckBoxVariationsCompose : ComposeStyleProvider<CheckBoxStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Negative", "Positive"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<CheckBoxStyle>> =
        mapOf(
            "CheckBox.L.Default" to ComposeStyleReference { CheckBox.L.Default.style() },
            "CheckBox.L.Negative" to ComposeStyleReference { CheckBox.L.Negative.style() },
            "CheckBox.L.Positive" to ComposeStyleReference { CheckBox.L.Positive.style() },
            "CheckBox.M.Default" to ComposeStyleReference { CheckBox.M.Default.style() },
            "CheckBox.M.Negative" to ComposeStyleReference { CheckBox.M.Negative.style() },
            "CheckBox.M.Positive" to ComposeStyleReference { CheckBox.M.Positive.style() },
            "CheckBox.S.Default" to ComposeStyleReference { CheckBox.S.Default.style() },
            "CheckBox.S.Negative" to ComposeStyleReference { CheckBox.S.Negative.style() },
            "CheckBox.S.Positive" to ComposeStyleReference { CheckBox.S.Positive.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CheckBoxStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CheckBoxSize.L
                "M" -> CheckBoxSize.M
                "S" -> CheckBoxSize.S
                else -> CheckBoxSize.L
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> CheckBoxView.Default
                "Negative" -> CheckBoxView.Negative
                "Positive" -> CheckBoxView.Positive
                else -> CheckBoxView.Default
            },
        ).key
    }
}
