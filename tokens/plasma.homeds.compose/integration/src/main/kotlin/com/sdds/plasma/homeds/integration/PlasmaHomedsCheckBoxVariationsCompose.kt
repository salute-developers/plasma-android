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
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.checkbox.CheckBox
import com.sdds.plasma.homeds.styles.checkbox.CheckBoxSize
import com.sdds.plasma.homeds.styles.checkbox.CheckBoxStyles
import com.sdds.plasma.homeds.styles.checkbox.CheckBoxView
import com.sdds.plasma.homeds.styles.checkbox.Default
import com.sdds.plasma.homeds.styles.checkbox.L
import com.sdds.plasma.homeds.styles.checkbox.M
import com.sdds.plasma.homeds.styles.checkbox.Negative
import com.sdds.plasma.homeds.styles.checkbox.S
import com.sdds.plasma.homeds.styles.checkbox.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsCheckBoxVariationsCompose : ComposeStyleProvider<CheckBoxStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Negative")),
        )

    override val variations: Map<String, ComposeStyleReference<CheckBoxStyle>> =
        mapOf(
            "CheckBox.L.Default" to ComposeStyleReference { CheckBox.L.Default.style() },
            "CheckBox.L.Negative" to ComposeStyleReference { CheckBox.L.Negative.style() },
            "CheckBox.M.Default" to ComposeStyleReference { CheckBox.M.Default.style() },
            "CheckBox.M.Negative" to ComposeStyleReference { CheckBox.M.Negative.style() },
            "CheckBox.S.Default" to ComposeStyleReference { CheckBox.S.Default.style() },
            "CheckBox.S.Negative" to ComposeStyleReference { CheckBox.S.Negative.style() },
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
                else -> CheckBoxView.Default
            },
        ).key
    }
}
