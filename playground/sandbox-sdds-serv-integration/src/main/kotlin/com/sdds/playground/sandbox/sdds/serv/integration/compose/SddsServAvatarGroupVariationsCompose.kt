package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.avatargroup.AvatarGroup
import com.sdds.serv.styles.avatargroup.S

internal object SddsServAvatarGroupVariationsCompose : ComposeStyleProvider<String, AvatarGroupStyle>() {
    override val variations: Map<String, @Composable () -> AvatarGroupStyle> =
        mapOf(
            "S" to { AvatarGroup.S.style() },
        )
}
