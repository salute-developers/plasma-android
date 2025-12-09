package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.paginationdots.ActiveTypeLine
import com.sdds.plasma.sd.service.styles.paginationdots.M
import com.sdds.plasma.sd.service.styles.paginationdots.PaginationDotsVertical
import com.sdds.plasma.sd.service.styles.paginationdots.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cPaginationDotsVerticalVariationsCompose : ComposeStyleProvider<String, PaginationDotsStyle>() {
    override val variations: Map<String, @Composable () -> PaginationDotsStyle> =
        mapOf(
            "M" to { PaginationDotsVertical.M.style() },
            "M.ActiveTypeLine" to { PaginationDotsVertical.M.ActiveTypeLine.style() },
            "S" to { PaginationDotsVertical.S.style() },
            "S.ActiveTypeLine" to { PaginationDotsVertical.S.ActiveTypeLine.style() },
        )
}
