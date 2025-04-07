package com.sdds.playground.sandbox.sdds.serv.integration.cell.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.cell.Cell
import com.sdds.serv.styles.cell.L
import com.sdds.serv.styles.cell.M
import com.sdds.serv.styles.cell.S
import com.sdds.serv.styles.cell.Xs

internal object SddsServCellVariationsCompose : ComposeStyleProvider<String, CellStyle>() {
    override val variations: Map<String, @Composable () -> CellStyle> =
        mapOf(
            "L" to { Cell.L.style() },
            "M" to { Cell.M.style() },
            "S" to { Cell.S.style() },
            "Xs" to { Cell.Xs.style() },
        )
}
