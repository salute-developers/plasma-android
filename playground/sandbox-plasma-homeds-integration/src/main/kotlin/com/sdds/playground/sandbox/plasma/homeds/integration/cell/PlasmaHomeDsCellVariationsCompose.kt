package com.sdds.playground.sandbox.plasma.homeds.integration.cell

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.cell.Cell
import com.sdds.plasma.homeds.styles.cell.L
import com.sdds.plasma.homeds.styles.cell.M
import com.sdds.plasma.homeds.styles.cell.S
import com.sdds.plasma.homeds.styles.cell.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsCellVariationsCompose : ComposeStyleProvider<String, CellStyle>() {
    override val variations: Map<String, @Composable () -> CellStyle> =
        mapOf(
            "L" to { Cell.L.style() },
            "M" to { Cell.M.style() },
            "S" to { Cell.S.style() },
            "Xs" to { Cell.Xs.style() },
        )
}
