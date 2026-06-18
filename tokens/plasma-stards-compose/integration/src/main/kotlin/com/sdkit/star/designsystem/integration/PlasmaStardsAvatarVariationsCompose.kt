// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.avatar.Avatar
import com.sdkit.star.designsystem.styles.avatar.AvatarSize
import com.sdkit.star.designsystem.styles.avatar.AvatarStyles
import com.sdkit.star.designsystem.styles.avatar.L
import com.sdkit.star.designsystem.styles.avatar.M
import com.sdkit.star.designsystem.styles.avatar.S
import com.sdkit.star.designsystem.styles.avatar.Xxl
import com.sdkit.star.designsystem.styles.avatar.resolve

internal object PlasmaStardsAvatarVariationsCompose : ComposeStyleProvider<AvatarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xxl", variants = listOf("Xxl", "L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<AvatarStyle>> =
        mapOf(
            "Avatar.Xxl" to ComposeStyleReference { Avatar.Xxl.style() },
            "Avatar.L" to ComposeStyleReference { Avatar.L.style() },
            "Avatar.M" to ComposeStyleReference { Avatar.M.style() },
            "Avatar.S" to ComposeStyleReference { Avatar.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AvatarStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xxl" -> AvatarSize.Xxl
                "L" -> AvatarSize.L
                "M" -> AvatarSize.M
                "S" -> AvatarSize.S
                else -> AvatarSize.Xxl
            },
        ).key
    }
}
