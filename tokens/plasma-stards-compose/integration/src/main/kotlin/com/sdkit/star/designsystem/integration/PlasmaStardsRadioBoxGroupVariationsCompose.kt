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
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.radioboxgroup.M
import com.sdkit.star.designsystem.styles.radioboxgroup.RadioBoxGroup
import com.sdkit.star.designsystem.styles.radioboxgroup.RadioBoxGroupSize
import com.sdkit.star.designsystem.styles.radioboxgroup.RadioBoxGroupStyles
import com.sdkit.star.designsystem.styles.radioboxgroup.S
import com.sdkit.star.designsystem.styles.radioboxgroup.resolve

internal object PlasmaStardsRadioBoxGroupVariationsCompose : ComposeStyleProvider<RadioBoxGroupStyle>() {
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
