// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.avatar.Avatar
import com.sdds.plasma.giga.styles.avatar.L
import com.sdds.plasma.giga.styles.avatar.M
import com.sdds.plasma.giga.styles.avatar.S
import com.sdds.plasma.giga.styles.avatar.Xxl

internal object PlasmaGigaAvatarVariationsCompose : ComposeStyleProvider<AvatarStyle>() {
    override val variations: Map<String, ComposeStyleReference<AvatarStyle>> =
        mapOf(
            "Xxl" to ComposeStyleReference { Avatar.Xxl.style() },
            "L" to ComposeStyleReference { Avatar.L.style() },
            "M" to ComposeStyleReference { Avatar.M.style() },
            "S" to ComposeStyleReference { Avatar.S.style() },
        )
}
