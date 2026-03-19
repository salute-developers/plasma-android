// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.avatar.Avatar
import com.sdds.plasma.homeds.styles.avatar.L
import com.sdds.plasma.homeds.styles.avatar.M
import com.sdds.plasma.homeds.styles.avatar.Pilled
import com.sdds.plasma.homeds.styles.avatar.S
import com.sdds.plasma.homeds.styles.avatar.Xxl

internal object PlasmaHomedsAvatarVariationsCompose : ComposeStyleProvider<AvatarStyle>() {
    override val variations: Map<String, ComposeStyleReference<AvatarStyle>> =
        mapOf(
            "Xxl" to ComposeStyleReference { Avatar.Xxl.style() },
            "Xxl.Pilled" to ComposeStyleReference { Avatar.Xxl.Pilled.style() },
            "L" to ComposeStyleReference { Avatar.L.style() },
            "L.Pilled" to ComposeStyleReference { Avatar.L.Pilled.style() },
            "M" to ComposeStyleReference { Avatar.M.style() },
            "M.Pilled" to ComposeStyleReference { Avatar.M.Pilled.style() },
            "S" to ComposeStyleReference { Avatar.S.style() },
            "S.Pilled" to ComposeStyleReference { Avatar.S.Pilled.style() },
        )
}
