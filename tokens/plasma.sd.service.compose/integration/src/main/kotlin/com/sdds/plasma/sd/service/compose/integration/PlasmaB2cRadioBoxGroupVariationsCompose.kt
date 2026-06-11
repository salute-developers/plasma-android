// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.radioboxgroup.M
import com.sdds.plasma.sd.service.styles.radioboxgroup.RadioBoxGroup
import com.sdds.plasma.sd.service.styles.radioboxgroup.RadioBoxGroupSize
import com.sdds.plasma.sd.service.styles.radioboxgroup.RadioBoxGroupStyles
import com.sdds.plasma.sd.service.styles.radioboxgroup.S
import com.sdds.plasma.sd.service.styles.radioboxgroup.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cRadioBoxGroupVariationsCompose : ComposeStyleProvider<RadioBoxGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<RadioBoxGroupStyle>> =
        mapOf(
            "RadioBoxGroup.M" to ComposeStyleReference { RadioBoxGroup.M.style() },
            "RadioBoxGroup.S" to ComposeStyleReference { RadioBoxGroup.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return RadioBoxGroupStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> RadioBoxGroupSize.M
                "S" -> RadioBoxGroupSize.S
                else -> RadioBoxGroupSize.M
            },
        ).key
    }
}
