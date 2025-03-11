package com.sdds.playground.sandbox.plasma.stards.integration.badge

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object StarDsBadgeVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "Default" to 0,
    )
}
