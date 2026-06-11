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
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.codeinput.CodeInput
import com.sdds.plasma.sd.service.styles.codeinput.CodeInputSize
import com.sdds.plasma.sd.service.styles.codeinput.CodeInputStyles
import com.sdds.plasma.sd.service.styles.codeinput.L
import com.sdds.plasma.sd.service.styles.codeinput.M
import com.sdds.plasma.sd.service.styles.codeinput.S
import com.sdds.plasma.sd.service.styles.codeinput.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cCodeInputVariationsCompose : ComposeStyleProvider<CodeInputStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S", "M", "L")),
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
                "S" -> CodeInputSize.S
                "M" -> CodeInputSize.M
                "L" -> CodeInputSize.L
                else -> CodeInputSize.S
            },
        ).key
    }
}
