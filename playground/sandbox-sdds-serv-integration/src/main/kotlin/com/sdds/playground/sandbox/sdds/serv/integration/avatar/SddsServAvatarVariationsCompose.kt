package com.sdds.playground.sandbox.sdds.serv.integration.avatar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.avatar.L
import com.sdds.serv.styles.avatar.M
import com.sdds.serv.styles.avatar.S
import com.sdds.serv.styles.avatar.Xxl

internal object SddsServAvatarVariationsCompose : ComposeStyleProvider<String, AvatarStyle>() {
    override val variations: Map<String, @Composable () -> AvatarStyle>
        get() = mapOf(
            "S" to { Avatar.S.style() },
            "M" to { Avatar.M.style() },
            "L" to { Avatar.L.style() },
            "Xxl" to { Avatar.Xxl.style() },
        )
}
