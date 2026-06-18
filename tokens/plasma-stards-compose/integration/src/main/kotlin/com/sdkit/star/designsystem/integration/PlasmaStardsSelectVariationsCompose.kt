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
import com.sdds.compose.uikit.SelectStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.select.L
import com.sdkit.star.designsystem.styles.select.M
import com.sdkit.star.designsystem.styles.select.S
import com.sdkit.star.designsystem.styles.select.Select
import com.sdkit.star.designsystem.styles.select.SelectSize
import com.sdkit.star.designsystem.styles.select.SelectStyles
import com.sdkit.star.designsystem.styles.select.Xs
import com.sdkit.star.designsystem.styles.select.resolve

internal object PlasmaStardsSelectVariationsCompose : ComposeStyleProvider<SelectStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<SelectStyle>> =
        mapOf(
            "Select.L" to ComposeStyleReference { Select.L.style() },
            "Select.M" to ComposeStyleReference { Select.M.style() },
            "Select.S" to ComposeStyleReference { Select.S.style() },
            "Select.Xs" to ComposeStyleReference { Select.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SelectStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> SelectSize.L
                "M" -> SelectSize.M
                "S" -> SelectSize.S
                "Xs" -> SelectSize.Xs
                else -> SelectSize.L
            },
        ).key
    }
}
