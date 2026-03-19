// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.avatargroup.AvatarGroup
import com.sdds.plasma.homeds.styles.avatargroup.S

internal object PlasmaHomedsAvatarGroupVariationsCompose : ComposeStyleProvider<AvatarGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<AvatarGroupStyle>> =
        mapOf(
            "S" to ComposeStyleReference { AvatarGroup.S.style() },
        )
}
