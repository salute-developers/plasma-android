package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.cell.Cell
import com.sdds.stylessalute.styles.cell.L
import com.sdds.stylessalute.styles.cell.M
import com.sdds.stylessalute.styles.cell.S
import com.sdds.stylessalute.styles.cell.Xs

internal object StylesSaluteCellVariationsCompose : ComposeStyleProvider<String, CellStyle>() {
    override val variations: Map<String, @Composable () -> CellStyle> =
        mapOf(
            "L" to { Cell.L.style() },
            "M" to { Cell.M.style() },
            "S" to { Cell.S.style() },
            "Xs" to { Cell.Xs.style() },
        )
}
