// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.avatar.Avatar
import com.sdds.plasma.homeds.styles.avatar.AvatarShape
import com.sdds.plasma.homeds.styles.avatar.AvatarSize
import com.sdds.plasma.homeds.styles.avatar.AvatarStyles
import com.sdds.plasma.homeds.styles.avatar.L
import com.sdds.plasma.homeds.styles.avatar.M
import com.sdds.plasma.homeds.styles.avatar.Pilled
import com.sdds.plasma.homeds.styles.avatar.S
import com.sdds.plasma.homeds.styles.avatar.Xxl
import com.sdds.plasma.homeds.styles.avatar.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsAvatarVariationsCompose : ComposeStyleProvider<AvatarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xxl", "L", "M", "S")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
        )

    override val variations: Map<String, ComposeStyleReference<AvatarStyle>> =
        mapOf(
            "Avatar.Xxl" to ComposeStyleReference { Avatar.Xxl.style() },
            "Avatar.Xxl.Pilled" to ComposeStyleReference { Avatar.Xxl.Pilled.style() },
            "Avatar.L" to ComposeStyleReference { Avatar.L.style() },
            "Avatar.L.Pilled" to ComposeStyleReference { Avatar.L.Pilled.style() },
            "Avatar.M" to ComposeStyleReference { Avatar.M.style() },
            "Avatar.M.Pilled" to ComposeStyleReference { Avatar.M.Pilled.style() },
            "Avatar.S" to ComposeStyleReference { Avatar.S.style() },
            "Avatar.S.Pilled" to ComposeStyleReference { Avatar.S.Pilled.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AvatarStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xxl" -> AvatarSize.Xxl
                "L" -> AvatarSize.L
                "M" -> AvatarSize.M
                "S" -> AvatarSize.S
                else -> AvatarSize.M
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> AvatarShape.Default
                "Pilled" -> AvatarShape.Pilled
                else -> AvatarShape.Default
            },
        ).key
    }
}
