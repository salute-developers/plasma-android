package com.sdds.playground.sandbox.plasma.stards.integration.avatar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.avatar.Avatar
import com.sdkit.star.designsystem.styles.avatar.L
import com.sdkit.star.designsystem.styles.avatar.M
import com.sdkit.star.designsystem.styles.avatar.S
import com.sdkit.star.designsystem.styles.avatar.Xxl

internal object StarDsAvatarVariationsCompose : ComposeStyleProvider<String, AvatarStyle>() {
    override val variations: Map<String, @Composable () -> AvatarStyle> =
        mapOf(
            "S" to { Avatar.S.style() },
            "M" to { Avatar.M.style() },
            "L" to { Avatar.L.style() },
            "Xxl" to { Avatar.Xxl.style() },
        )
}
