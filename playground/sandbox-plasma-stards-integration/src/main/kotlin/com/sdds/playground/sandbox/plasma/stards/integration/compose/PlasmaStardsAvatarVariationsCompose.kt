package com.sdds.playground.sandbox.plasma.stards.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.avatar.Avatar
import com.sdkit.star.designsystem.styles.avatar.L
import com.sdkit.star.designsystem.styles.avatar.M
import com.sdkit.star.designsystem.styles.avatar.S
import com.sdkit.star.designsystem.styles.avatar.Xxl

internal object PlasmaStardsAvatarVariationsCompose : ComposeStyleProvider<String, AvatarStyle>() {
    override val variations: Map<String, @Composable () -> AvatarStyle> =
        mapOf(
            "Xxl" to { Avatar.Xxl.style() },
            "L" to { Avatar.L.style() },
            "M" to { Avatar.M.style() },
            "S" to { Avatar.S.style() },
        )
}
