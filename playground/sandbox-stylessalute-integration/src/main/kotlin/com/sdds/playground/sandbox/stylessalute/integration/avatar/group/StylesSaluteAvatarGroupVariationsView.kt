package com.sdds.playground.sandbox.stylessalute.integration.avatar.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteAvatarGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "S" to s.Salute_StylesSalute_ComponentOverlays_AvatarS,
    )
}
