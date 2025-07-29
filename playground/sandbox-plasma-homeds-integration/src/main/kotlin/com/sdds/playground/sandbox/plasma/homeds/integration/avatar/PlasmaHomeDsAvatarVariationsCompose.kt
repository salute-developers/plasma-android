package com.sdds.playground.sandbox.plasma.homeds.integration.avatar

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

internal object PlasmaHomeDsAvatarVariationsCompose : ComposeStyleProvider<String, AvatarStyle>() {
    override val variations: Map<String, @Composable () -> AvatarStyle> =
        mapOf(
            "S" to { Avatar.S.style() },
            "M" to { Avatar.M.style() },
            "L" to { Avatar.L.style() },
            "Xxl" to { Avatar.Xxl.style() },
            "SPilled" to { Avatar.S.Pilled.style() },
            "MPilled" to { Avatar.M.Pilled.style() },
            "LPilled" to { Avatar.L.Pilled.style() },
            "XxlPilled" to { Avatar.Xxl.Pilled.style() },
        )
}
