package com.sdds.playground.sandbox.plasma.stards.integration.badge.icon

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.iconBadgeClearBuilder
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object StarDsIconBadgeClearVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "Default" to { BadgeStyle.iconBadgeClearBuilder().style() },
        )
}
