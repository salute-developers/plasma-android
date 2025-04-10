package com.sdds.playground.sandbox.plasma.giga.app.integration.avatar.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.avatargroup.AvatarGroup
import com.sdds.plasma.giga.app.styles.avatargroup.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppAvatarGroupVariationsCompose :
    ComposeStyleProvider<String, AvatarGroupStyle>() {
    override val variations: Map<String, @Composable () -> AvatarGroupStyle> = mapOf(
        "S" to { AvatarGroup.S.style() },
    )
}
