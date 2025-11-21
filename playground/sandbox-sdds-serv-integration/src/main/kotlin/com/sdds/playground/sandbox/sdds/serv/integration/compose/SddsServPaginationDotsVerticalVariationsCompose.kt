package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.paginationdots.ActiveTypeLine
import com.sdds.serv.styles.paginationdots.M
import com.sdds.serv.styles.paginationdots.PaginationDotsVertical
import com.sdds.serv.styles.paginationdots.S

internal object SddsServPaginationDotsVerticalVariationsCompose : ComposeStyleProvider<String, PaginationDotsStyle>() {
    override val variations: Map<String, @Composable () -> PaginationDotsStyle> =
        mapOf(
            "M" to { PaginationDotsVertical.M.style() },
            "M.ActiveTypeLine" to { PaginationDotsVertical.M.ActiveTypeLine.style() },
            "S" to { PaginationDotsVertical.S.style() },
            "S.ActiveTypeLine" to { PaginationDotsVertical.S.ActiveTypeLine.style() },
        )
}
