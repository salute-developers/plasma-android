package com.sdds.playground.sandbox.plasma.giga.integration.avatar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.avatar.Avatar
import com.sdds.plasma.giga.styles.avatar.L
import com.sdds.plasma.giga.styles.avatar.M
import com.sdds.plasma.giga.styles.avatar.S
import com.sdds.plasma.giga.styles.avatar.Xxl
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAvatarVariationsCompose : ComposeStyleProvider<String, AvatarStyle>() {
    override val variations: Map<String, @Composable () -> AvatarStyle> =
        mapOf(
            "S" to { Avatar.S.style() },
            "M" to { Avatar.M.style() },
            "L" to { Avatar.L.style() },
            "Xxl" to { Avatar.Xxl.style() },
        )
}
