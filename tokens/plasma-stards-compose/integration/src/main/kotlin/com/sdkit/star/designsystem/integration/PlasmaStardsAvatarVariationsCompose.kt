// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.avatar.Avatar
import com.sdkit.star.designsystem.styles.avatar.L
import com.sdkit.star.designsystem.styles.avatar.M
import com.sdkit.star.designsystem.styles.avatar.S
import com.sdkit.star.designsystem.styles.avatar.Xxl

internal object PlasmaStardsAvatarVariationsCompose : ComposeStyleProvider<AvatarStyle>() {
    override val variations: Map<String, ComposeStyleReference<AvatarStyle>> =
        mapOf(
            "Xxl" to ComposeStyleReference { Avatar.Xxl.style() },
            "L" to ComposeStyleReference { Avatar.L.style() },
            "M" to ComposeStyleReference { Avatar.M.style() },
            "S" to ComposeStyleReference { Avatar.S.style() },
        )
}
