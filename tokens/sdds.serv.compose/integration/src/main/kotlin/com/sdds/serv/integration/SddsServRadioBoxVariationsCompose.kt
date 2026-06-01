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
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.radiobox.L
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.RadioBox
import com.sdds.serv.styles.radiobox.RadioBoxSize
import com.sdds.serv.styles.radiobox.RadioBoxStyles
import com.sdds.serv.styles.radiobox.S
import com.sdds.serv.styles.radiobox.resolve

internal object SddsServRadioBoxVariationsCompose : ComposeStyleProvider<RadioBoxStyle>() {
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
