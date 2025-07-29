package com.sdds.playground.sandbox.plasma.homeds.integration.avatar.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.avatargroup.AvatarGroup
import com.sdds.plasma.homeds.styles.avatargroup.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsAvatarGroupVariationsCompose :
    ComposeStyleProvider<String, AvatarGroupStyle>() {
    override val variations: Map<String, @Composable () -> AvatarGroupStyle> =
        mapOf(
            "S" to { AvatarGroup.S.style() },
        )
}
