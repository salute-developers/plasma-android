package com.sdds.playground.sandbox.plasma.stards.integration.badge

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.badgeClearBuilder
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object StarDsBadgeClearVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "Default" to { BadgeStyle.badgeClearBuilder().style() },
        )
}
