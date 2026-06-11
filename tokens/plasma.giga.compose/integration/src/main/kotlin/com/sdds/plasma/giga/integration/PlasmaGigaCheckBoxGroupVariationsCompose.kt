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
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.checkboxgroup.CheckBoxGroup
import com.sdds.plasma.giga.styles.checkboxgroup.CheckBoxGroupSize
import com.sdds.plasma.giga.styles.checkboxgroup.CheckBoxGroupStyles
import com.sdds.plasma.giga.styles.checkboxgroup.L
import com.sdds.plasma.giga.styles.checkboxgroup.M
import com.sdds.plasma.giga.styles.checkboxgroup.S
import com.sdds.plasma.giga.styles.checkboxgroup.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaCheckBoxGroupVariationsCompose : ComposeStyleProvider<CheckBoxGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<CheckBoxGroupStyle>> =
        mapOf(
            "CheckBoxGroup.L" to ComposeStyleReference { CheckBoxGroup.L.style() },
            "CheckBoxGroup.M" to ComposeStyleReference { CheckBoxGroup.M.style() },
            "CheckBoxGroup.S" to ComposeStyleReference { CheckBoxGroup.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CheckBoxGroupStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CheckBoxGroupSize.L
                "M" -> CheckBoxGroupSize.M
                "S" -> CheckBoxGroupSize.S
                else -> CheckBoxGroupSize.L
            },
        ).key
    }
}
