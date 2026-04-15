// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.avatargroup.AvatarGroup
import com.sdds.sbcom.styles.avatargroup.Size24

internal object SddsSbcomAvatarGroupVariationsCompose : ComposeStyleProvider<AvatarGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<AvatarGroupStyle>> =
        mapOf(
            "Size24" to ComposeStyleReference { AvatarGroup.Size24.style() },
        )
}
