// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.checkbox.CheckBox
import com.sdds.sbcom.styles.checkbox.CheckBoxStyles
import com.sdds.sbcom.styles.checkbox.CheckBoxVariant
import com.sdds.sbcom.styles.checkbox.VariantDefault
import com.sdds.sbcom.styles.checkbox.VariantPoll
import com.sdds.sbcom.styles.checkbox.resolve

internal object SddsSbcomCheckBoxVariationsCompose : ComposeStyleProvider<CheckBoxStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "variant", value = "Default", variants = listOf("Default", "Poll")),
        )

    override val variations: Map<String, ComposeStyleReference<CheckBoxStyle>> =
        mapOf(
            "CheckBox.VariantDefault" to ComposeStyleReference { CheckBox.VariantDefault.style() },
            "CheckBox.VariantPoll" to ComposeStyleReference { CheckBox.VariantPoll.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CheckBoxStyles.resolve(
            variant = when (bindings["variant"]?.toString()) {
                "Default" -> CheckBoxVariant.Default
                "Poll" -> CheckBoxVariant.Poll
                else -> CheckBoxVariant.Default
            },
        ).key
    }
}
