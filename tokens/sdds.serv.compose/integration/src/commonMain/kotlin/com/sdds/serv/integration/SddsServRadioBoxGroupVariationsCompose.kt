// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.radioboxgroup.M
import com.sdds.serv.styles.radioboxgroup.RadioBoxGroup
import com.sdds.serv.styles.radioboxgroup.RadioBoxGroupSize
import com.sdds.serv.styles.radioboxgroup.RadioBoxGroupStyles
import com.sdds.serv.styles.radioboxgroup.S
import com.sdds.serv.styles.radioboxgroup.resolve

internal object SddsServRadioBoxGroupVariationsCompose : ComposeStyleProvider<RadioBoxGroupStyle>() {
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
