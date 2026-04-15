// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.cell.Cell
import com.sdkit.star.designsystem.styles.cell.L
import com.sdkit.star.designsystem.styles.cell.M
import com.sdkit.star.designsystem.styles.cell.S
import com.sdkit.star.designsystem.styles.cell.Xs

internal object PlasmaStardsCellVariationsCompose : ComposeStyleProvider<CellStyle>() {
    override val variations: Map<String, ComposeStyleReference<CellStyle>> =
        mapOf(
            "L" to ComposeStyleReference { Cell.L.style() },
            "M" to ComposeStyleReference { Cell.M.style() },
            "S" to ComposeStyleReference { Cell.S.style() },
            "Xs" to ComposeStyleReference { Cell.Xs.style() },
        )
}
