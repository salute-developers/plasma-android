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
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.codefield.CodeField
import com.sdds.serv.styles.codefield.CodeFieldShape
import com.sdds.serv.styles.codefield.CodeFieldSize
import com.sdds.serv.styles.codefield.CodeFieldStyles
import com.sdds.serv.styles.codefield.L
import com.sdds.serv.styles.codefield.M
import com.sdds.serv.styles.codefield.Segmented
import com.sdds.serv.styles.codefield.resolve

internal object SddsServCodeFieldVariationsCompose : ComposeStyleProvider<CodeFieldStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Segmented")),
        )

    override val variations: Map<String, ComposeStyleReference<CodeFieldStyle>> =
        mapOf(
            "CodeField.L" to ComposeStyleReference { CodeField.L.style() },
            "CodeField.L.Segmented" to ComposeStyleReference { CodeField.L.Segmented.style() },
            "CodeField.M" to ComposeStyleReference { CodeField.M.style() },
            "CodeField.M.Segmented" to ComposeStyleReference { CodeField.M.Segmented.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CodeFieldStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CodeFieldSize.L
                "M" -> CodeFieldSize.M
                else -> CodeFieldSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> CodeFieldShape.Default
                "Segmented" -> CodeFieldShape.Segmented
                else -> CodeFieldShape.Default
            },
        ).key
    }
}
