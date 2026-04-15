// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.avatar.Avatar
import com.sdds.sbcom.styles.avatar.Size24
import com.sdds.sbcom.styles.avatar.Size26
import com.sdds.sbcom.styles.avatar.Size32
import com.sdds.sbcom.styles.avatar.Size36
import com.sdds.sbcom.styles.avatar.Size40
import com.sdds.sbcom.styles.avatar.Size44
import com.sdds.sbcom.styles.avatar.Size56
import com.sdds.sbcom.styles.avatar.Size64
import com.sdds.sbcom.styles.avatar.Size72

internal object SddsSbcomAvatarVariationsCompose : ComposeStyleProvider<AvatarStyle>() {
    override val variations: Map<String, ComposeStyleReference<AvatarStyle>> =
        mapOf(
            "Size72" to ComposeStyleReference { Avatar.Size72.style() },
            "Size64" to ComposeStyleReference { Avatar.Size64.style() },
            "Size56" to ComposeStyleReference { Avatar.Size56.style() },
            "Size44" to ComposeStyleReference { Avatar.Size44.style() },
            "Size40" to ComposeStyleReference { Avatar.Size40.style() },
            "Size36" to ComposeStyleReference { Avatar.Size36.style() },
            "Size32" to ComposeStyleReference { Avatar.Size32.style() },
            "Size26" to ComposeStyleReference { Avatar.Size26.style() },
            "Size24" to ComposeStyleReference { Avatar.Size24.style() },
        )
}
