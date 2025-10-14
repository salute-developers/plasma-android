package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.list.L
import com.sdkit.star.designsystem.styles.list.List
import com.sdkit.star.designsystem.styles.list.M
import com.sdkit.star.designsystem.styles.list.S
import com.sdkit.star.designsystem.styles.list.Xs

internal object PlasmaStardsListVariationsCompose : ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "L" to { List.L.style() },
            "M" to { List.M.style() },
            "S" to { List.S.style() },
            "Xs" to { List.Xs.style() },
        )
}
