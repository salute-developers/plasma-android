package com.sdds.playground.sandbox.sdds.serv.integration.avatar.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.avatar.AvatarGroup
import com.sdds.serv.styles.avatar.S

internal object SddsServAvatarGroupVariationsCompose :
    ComposeStyleProvider<String, AvatarGroupStyle>() {
    override val variations: Map<String, @Composable () -> AvatarGroupStyle> = mapOf(
        "S" to { AvatarGroup.S.style() },
    )
}
