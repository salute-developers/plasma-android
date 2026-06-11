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
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.cell.Cell
import com.sdds.plasma.sd.service.styles.cell.CellSize
import com.sdds.plasma.sd.service.styles.cell.CellStyles
import com.sdds.plasma.sd.service.styles.cell.L
import com.sdds.plasma.sd.service.styles.cell.M
import com.sdds.plasma.sd.service.styles.cell.S
import com.sdds.plasma.sd.service.styles.cell.Xs
import com.sdds.plasma.sd.service.styles.cell.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cCellVariationsCompose : ComposeStyleProvider<CellStyle>() {
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
        return CellStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CellSize.L
                "M" -> CellSize.M
                "S" -> CellSize.S
                "Xs" -> CellSize.Xs
                else -> CellSize.L
            },
        ).key
    }
}
