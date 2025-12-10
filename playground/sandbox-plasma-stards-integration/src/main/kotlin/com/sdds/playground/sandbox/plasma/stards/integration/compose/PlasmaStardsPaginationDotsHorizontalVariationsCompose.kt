package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.paginationdots.ActiveTypeLine
import com.sdkit.star.designsystem.styles.paginationdots.M
import com.sdkit.star.designsystem.styles.paginationdots.PaginationDotsHorizontal
import com.sdkit.star.designsystem.styles.paginationdots.S

internal object PlasmaStardsPaginationDotsHorizontalVariationsCompose : ComposeStyleProvider<String, PaginationDotsStyle>() {
    override val variations: Map<String, @Composable () -> PaginationDotsStyle> =
        mapOf(
            "M" to { PaginationDotsHorizontal.M.style() },
            "M.ActiveTypeLine" to { PaginationDotsHorizontal.M.ActiveTypeLine.style() },
            "S" to { PaginationDotsHorizontal.S.style() },
            "S.ActiveTypeLine" to { PaginationDotsHorizontal.S.ActiveTypeLine.style() },
        )
}
