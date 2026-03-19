// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.cell.Cell
import com.sdds.plasma.homeds.styles.cell.L
import com.sdds.plasma.homeds.styles.cell.M
import com.sdds.plasma.homeds.styles.cell.S
import com.sdds.plasma.homeds.styles.cell.Xs

internal object PlasmaHomedsCellVariationsCompose : ComposeStyleProvider<CellStyle>() {
    override val variations: Map<String, ComposeStyleReference<CellStyle>> =
        mapOf(
            "L" to ComposeStyleReference { Cell.L.style() },
            "M" to ComposeStyleReference { Cell.M.style() },
            "S" to ComposeStyleReference { Cell.S.style() },
            "Xs" to ComposeStyleReference { Cell.Xs.style() },
        )
}
