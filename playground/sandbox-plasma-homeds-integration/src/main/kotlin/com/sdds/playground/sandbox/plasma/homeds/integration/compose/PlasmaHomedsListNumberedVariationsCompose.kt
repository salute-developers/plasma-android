package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.list.ListNumbered
import com.sdds.plasma.homeds.styles.list.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsListNumberedVariationsCompose : ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "S" to { ListNumbered.S.style() },
        )
}
