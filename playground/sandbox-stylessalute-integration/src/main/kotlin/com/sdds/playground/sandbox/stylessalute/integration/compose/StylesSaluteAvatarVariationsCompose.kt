package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.avatar.Avatar
import com.sdds.stylessalute.styles.avatar.L
import com.sdds.stylessalute.styles.avatar.M
import com.sdds.stylessalute.styles.avatar.S
import com.sdds.stylessalute.styles.avatar.Xxl

internal object StylesSaluteAvatarVariationsCompose : ComposeStyleProvider<String, AvatarStyle>() {
    override val variations: Map<String, @Composable () -> AvatarStyle> =
        mapOf(
            "Xxl" to { Avatar.Xxl.style() },
            "L" to { Avatar.L.style() },
            "M" to { Avatar.M.style() },
            "S" to { Avatar.S.style() },
        )
}
