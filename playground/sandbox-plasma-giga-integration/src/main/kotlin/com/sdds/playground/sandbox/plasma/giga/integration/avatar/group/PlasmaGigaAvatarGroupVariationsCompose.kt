package com.sdds.playground.sandbox.plasma.giga.integration.avatar.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.plasma.giga.styles.avatar.AvatarGroup
import com.sdds.plasma.giga.styles.avatar.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAvatarGroupVariationsCompose :
    ComposeStyleProvider<String, AvatarGroupStyle>() {
    override val variations: Map<String, @Composable () -> AvatarGroupStyle> = mapOf(
        "S" to { AvatarGroup.S.style() },
    )
}
