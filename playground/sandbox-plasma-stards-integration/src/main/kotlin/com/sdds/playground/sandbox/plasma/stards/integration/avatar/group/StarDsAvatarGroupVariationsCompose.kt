package com.sdds.playground.sandbox.plasma.stards.integration.avatar.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.avatar.AvatarGroup
import com.sdkit.star.designsystem.styles.avatar.S

internal object StarDsAvatarGroupVariationsCompose :
    ComposeStyleProvider<String, AvatarGroupStyle>() {
    override val variations: Map<String, @Composable () -> AvatarGroupStyle> =
        mapOf(
            "S" to { AvatarGroup.S.style() },
        )
}
