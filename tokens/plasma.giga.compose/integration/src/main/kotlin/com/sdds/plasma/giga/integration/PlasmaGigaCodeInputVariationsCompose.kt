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
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.codeinput.CodeInput
import com.sdds.plasma.giga.styles.codeinput.CodeInputSize
import com.sdds.plasma.giga.styles.codeinput.CodeInputStyles
import com.sdds.plasma.giga.styles.codeinput.L
import com.sdds.plasma.giga.styles.codeinput.M
import com.sdds.plasma.giga.styles.codeinput.S
import com.sdds.plasma.giga.styles.codeinput.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaCodeInputVariationsCompose : ComposeStyleProvider<CodeInputStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<CodeInputStyle>> =
        mapOf(
            "CodeInput.S" to ComposeStyleReference { CodeInput.S.style() },
            "CodeInput.M" to ComposeStyleReference { CodeInput.M.style() },
            "CodeInput.L" to ComposeStyleReference { CodeInput.L.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CodeInputStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CodeInputSize.L
                "M" -> CodeInputSize.M
                "S" -> CodeInputSize.S
                else -> CodeInputSize.L
            },
        ).key
    }
}
