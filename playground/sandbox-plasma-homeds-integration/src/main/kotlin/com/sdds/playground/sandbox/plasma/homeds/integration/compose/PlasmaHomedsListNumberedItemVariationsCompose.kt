package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.listitem.ListNumberedItem
import com.sdds.plasma.homeds.styles.listitem.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsListNumberedItemVariationsCompose : ComposeStyleProvider<String, ListItemStyle>() {
    override val variations: Map<String, @Composable () -> ListItemStyle> =
        mapOf(
            "S" to { ListNumberedItem.S.style() },
        )
}
