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
import com.sdkit.star.designsystem.styles.cell.CellSelect
import com.sdkit.star.designsystem.styles.cell.CellSelectSize
import com.sdkit.star.designsystem.styles.cell.CellStyles
import com.sdkit.star.designsystem.styles.cell.L
import com.sdkit.star.designsystem.styles.cell.M
import com.sdkit.star.designsystem.styles.cell.S
import com.sdkit.star.designsystem.styles.cell.Xs
import com.sdkit.star.designsystem.styles.cell.resolve

internal object PlasmaStardsCellSelectVariationsCompose : ComposeStyleProvider<CellStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<CellStyle>> =
        mapOf(
            "CellSelect.L" to ComposeStyleReference { CellSelect.L.style() },
            "CellSelect.M" to ComposeStyleReference { CellSelect.M.style() },
            "CellSelect.S" to ComposeStyleReference { CellSelect.S.style() },
            "CellSelect.Xs" to ComposeStyleReference { CellSelect.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CellStyles.Select.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> CellSelectSize.L
                "M" -> CellSelectSize.M
                "S" -> CellSelectSize.S
                "Xs" -> CellSelectSize.Xs
                else -> CellSelectSize.L
            },
        ).key
    }
}
