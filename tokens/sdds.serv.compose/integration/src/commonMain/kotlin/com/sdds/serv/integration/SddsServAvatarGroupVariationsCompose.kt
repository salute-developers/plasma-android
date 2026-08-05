// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.avatargroup.AvatarGroup
import com.sdds.serv.styles.avatargroup.AvatarGroupSize
import com.sdds.serv.styles.avatargroup.AvatarGroupStyles
import com.sdds.serv.styles.avatargroup.S
import com.sdds.serv.styles.avatargroup.resolve

internal object SddsServAvatarGroupVariationsCompose : ComposeStyleProvider<AvatarGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S")),
        )

    override val variations: Map<String, ComposeStyleReference<AvatarGroupStyle>> =
        mapOf(
            "AvatarGroup.S" to ComposeStyleReference { AvatarGroup.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AvatarGroupStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> AvatarGroupSize.S
                else -> AvatarGroupSize.S
            },
        ).key
    }
}
