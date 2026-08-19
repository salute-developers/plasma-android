// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.radiobox.M
import com.sdds.finai.styles.radiobox.RadioBox
import com.sdds.finai.styles.radiobox.RadioBoxSize
import com.sdds.finai.styles.radiobox.RadioBoxStyles
import com.sdds.finai.styles.radiobox.S
import com.sdds.finai.styles.radiobox.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiRadioBoxVariationsCompose : ComposeStyleProvider<RadioBoxStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<RadioBoxStyle>> =
        mapOf(
            "RadioBox.M" to ComposeStyleReference { RadioBox.M.style() },
            "RadioBox.S" to ComposeStyleReference { RadioBox.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return RadioBoxStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> RadioBoxSize.M
                "S" -> RadioBoxSize.S
                else -> RadioBoxSize.M
            },
        ).key
    }
}
