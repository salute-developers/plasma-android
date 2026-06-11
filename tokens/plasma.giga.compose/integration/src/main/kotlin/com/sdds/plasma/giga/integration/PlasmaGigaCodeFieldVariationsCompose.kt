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
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.codefield.CodeField
import com.sdds.plasma.giga.styles.codefield.CodeFieldShape
import com.sdds.plasma.giga.styles.codefield.CodeFieldSize
import com.sdds.plasma.giga.styles.codefield.CodeFieldStyles
import com.sdds.plasma.giga.styles.codefield.L
import com.sdds.plasma.giga.styles.codefield.M
import com.sdds.plasma.giga.styles.codefield.Segmented
import com.sdds.plasma.giga.styles.codefield.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaCodeFieldVariationsCompose : ComposeStyleProvider<CodeFieldStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M")),
            Property.SingleChoiceProperty(name = "shape", value = "Segmented", variants = listOf("Segmented")),
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
                "Segmented" -> CodeFieldShape.Segmented
                else -> CodeFieldShape.Segmented
            },
        ).key
    }
}
