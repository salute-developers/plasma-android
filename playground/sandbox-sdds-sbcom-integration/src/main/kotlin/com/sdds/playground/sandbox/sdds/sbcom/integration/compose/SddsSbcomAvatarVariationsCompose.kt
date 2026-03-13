package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.avatar.Avatar
import com.sdds.sbcom.styles.avatar.Size180
import com.sdds.sbcom.styles.avatar.Size20
import com.sdds.sbcom.styles.avatar.Size24
import com.sdds.sbcom.styles.avatar.Size26
import com.sdds.sbcom.styles.avatar.Size32
import com.sdds.sbcom.styles.avatar.Size36
import com.sdds.sbcom.styles.avatar.Size40
import com.sdds.sbcom.styles.avatar.Size44
import com.sdds.sbcom.styles.avatar.Size48
import com.sdds.sbcom.styles.avatar.Size56
import com.sdds.sbcom.styles.avatar.Size64
import com.sdds.sbcom.styles.avatar.Size72

internal object SddsSbcomAvatarVariationsCompose : ComposeStyleProvider<String, AvatarStyle>() {
    override val variations: Map<String, @Composable () -> AvatarStyle> =
        mapOf(
            "Size180" to { Avatar.Size180.style() },
            "Size72" to { Avatar.Size72.style() },
            "Size64" to { Avatar.Size64.style() },
            "Size56" to { Avatar.Size56.style() },
            "Size48" to { Avatar.Size48.style() },
            "Size44" to { Avatar.Size44.style() },
            "Size40" to { Avatar.Size40.style() },
            "Size36" to { Avatar.Size36.style() },
            "Size32" to { Avatar.Size32.style() },
            "Size26" to { Avatar.Size26.style() },
            "Size24" to { Avatar.Size24.style() },
            "Size20" to { Avatar.Size20.style() },
        )
}
