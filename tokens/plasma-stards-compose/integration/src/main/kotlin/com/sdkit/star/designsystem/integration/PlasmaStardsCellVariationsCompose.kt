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
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.cell.Cell
import com.sdkit.star.designsystem.styles.cell.CellDefaultSize
import com.sdkit.star.designsystem.styles.cell.CellStyles
import com.sdkit.star.designsystem.styles.cell.L
import com.sdkit.star.designsystem.styles.cell.M
import com.sdkit.star.designsystem.styles.cell.S
import com.sdkit.star.designsystem.styles.cell.Xs
import com.sdkit.star.designsystem.styles.cell.resolve

internal object PlasmaStardsCellVariationsCompose : ComposeStyleProvider<CellStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<CellStyle>> =
        mapOf(
            "Cell.L" to ComposeStyleReference { Cell.L.style() },
            "Cell.M" to ComposeStyleReference { Cell.M.style() },
            "Cell.S" to ComposeStyleReference { Cell.S.style() },
            "Cell.Xs" to ComposeStyleReference { Cell.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CellStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CellDefaultSize.L
                "M" -> CellDefaultSize.M
                "S" -> CellDefaultSize.S
                "Xs" -> CellDefaultSize.Xs
                else -> CellDefaultSize.L
            },
        ).key
    }
}
