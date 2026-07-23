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
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.codeinput.CodeInput
import com.sdds.serv.styles.codeinput.CodeInputSize
import com.sdds.serv.styles.codeinput.CodeInputStyles
import com.sdds.serv.styles.codeinput.L
import com.sdds.serv.styles.codeinput.M
import com.sdds.serv.styles.codeinput.S
import com.sdds.serv.styles.codeinput.resolve

internal object SddsServCodeInputVariationsCompose : ComposeStyleProvider<CodeInputStyle>() {
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
