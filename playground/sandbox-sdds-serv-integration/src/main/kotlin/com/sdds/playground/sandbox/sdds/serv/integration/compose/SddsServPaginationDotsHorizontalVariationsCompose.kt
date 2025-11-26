package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.paginationdots.ActiveTypeLine
import com.sdds.serv.styles.paginationdots.M
import com.sdds.serv.styles.paginationdots.PaginationDotsHorizontal
import com.sdds.serv.styles.paginationdots.S

internal object SddsServPaginationDotsHorizontalVariationsCompose : ComposeStyleProvider<String, PaginationDotsStyle>() {
    override val variations: Map<String, @Composable () -> PaginationDotsStyle> =
        mapOf(
            "M" to { PaginationDotsHorizontal.M.style() },
            "M.ActiveTypeLine" to { PaginationDotsHorizontal.M.ActiveTypeLine.style() },
            "S" to { PaginationDotsHorizontal.S.style() },
            "S.ActiveTypeLine" to { PaginationDotsHorizontal.S.ActiveTypeLine.style() },
        )
}
