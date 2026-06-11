// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.avatar.Avatar
import com.sdds.plasma.giga.styles.avatar.AvatarSize
import com.sdds.plasma.giga.styles.avatar.AvatarStyles
import com.sdds.plasma.giga.styles.avatar.L
import com.sdds.plasma.giga.styles.avatar.M
import com.sdds.plasma.giga.styles.avatar.S
import com.sdds.plasma.giga.styles.avatar.Xxl
import com.sdds.plasma.giga.styles.avatar.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaAvatarVariationsCompose : ComposeStyleProvider<AvatarStyle>() {
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
