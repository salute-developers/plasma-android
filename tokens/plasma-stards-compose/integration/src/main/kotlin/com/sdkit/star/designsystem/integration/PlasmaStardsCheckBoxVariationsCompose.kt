// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.checkbox.CheckBox
import com.sdkit.star.designsystem.styles.checkbox.CheckBoxSize
import com.sdkit.star.designsystem.styles.checkbox.CheckBoxStyles
import com.sdkit.star.designsystem.styles.checkbox.CheckBoxView
import com.sdkit.star.designsystem.styles.checkbox.Default
import com.sdkit.star.designsystem.styles.checkbox.L
import com.sdkit.star.designsystem.styles.checkbox.M
import com.sdkit.star.designsystem.styles.checkbox.Negative
import com.sdkit.star.designsystem.styles.checkbox.S
import com.sdkit.star.designsystem.styles.checkbox.resolve

internal object PlasmaStardsCheckBoxVariationsCompose : ComposeStyleProvider<CheckBoxStyle>() {
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
