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
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.radiobox.L
import com.sdkit.star.designsystem.styles.radiobox.M
import com.sdkit.star.designsystem.styles.radiobox.RadioBox
import com.sdkit.star.designsystem.styles.radiobox.RadioBoxSize
import com.sdkit.star.designsystem.styles.radiobox.RadioBoxStyles
import com.sdkit.star.designsystem.styles.radiobox.S
import com.sdkit.star.designsystem.styles.radiobox.resolve

internal object PlasmaStardsRadioBoxVariationsCompose : ComposeStyleProvider<RadioBoxStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<RadioBoxStyle>> =
        mapOf(
            "RadioBox.L" to ComposeStyleReference { RadioBox.L.style() },
            "RadioBox.M" to ComposeStyleReference { RadioBox.M.style() },
            "RadioBox.S" to ComposeStyleReference { RadioBox.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return RadioBoxStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> RadioBoxSize.L
                "M" -> RadioBoxSize.M
                "S" -> RadioBoxSize.S
                else -> RadioBoxSize.L
            },
        ).key
    }
}
