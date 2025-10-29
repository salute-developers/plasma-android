package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.avatar.Avatar
import com.sdds.plasma.homeds.styles.avatar.L
import com.sdds.plasma.homeds.styles.avatar.M
import com.sdds.plasma.homeds.styles.avatar.Pilled
import com.sdds.plasma.homeds.styles.avatar.S
import com.sdds.plasma.homeds.styles.avatar.Xxl
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsAvatarVariationsCompose : ComposeStyleProvider<String, AvatarStyle>() {
    override val variations: Map<String, @Composable () -> AvatarStyle> =
        mapOf(
            "Xxl" to { Avatar.Xxl.style() },
            "Xxl.Pilled" to { Avatar.Xxl.Pilled.style() },
            "L" to { Avatar.L.style() },
            "L.Pilled" to { Avatar.L.Pilled.style() },
            "M" to { Avatar.M.style() },
            "M.Pilled" to { Avatar.M.Pilled.style() },
            "S" to { Avatar.S.style() },
            "S.Pilled" to { Avatar.S.Pilled.style() },
        )
}
