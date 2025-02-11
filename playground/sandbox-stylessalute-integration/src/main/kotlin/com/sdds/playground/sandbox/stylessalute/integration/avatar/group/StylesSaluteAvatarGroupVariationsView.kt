package com.sdds.playground.sandbox.stylessalute.integration.avatar.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object StylesSaluteAvatarGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "S" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_AvatarS,
        )
}