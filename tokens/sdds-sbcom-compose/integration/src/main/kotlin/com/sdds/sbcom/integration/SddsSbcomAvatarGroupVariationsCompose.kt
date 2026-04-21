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
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.avatargroup.AvatarGroup
import com.sdds.sbcom.styles.avatargroup.AvatarGroupSize
import com.sdds.sbcom.styles.avatargroup.AvatarGroupStyles
import com.sdds.sbcom.styles.avatargroup.Size24
import com.sdds.sbcom.styles.avatargroup.resolve

internal object SddsSbcomAvatarGroupVariationsCompose : ComposeStyleProvider<AvatarGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Size24", variants = listOf("Size24")),
        )

    override val variations: Map<String, ComposeStyleReference<AvatarGroupStyle>> =
        mapOf(
            "AvatarGroup.Size24" to ComposeStyleReference { AvatarGroup.Size24.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AvatarGroupStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Size24" -> AvatarGroupSize.Size24
                else -> AvatarGroupSize.Size24
            },
        ).key
    }
}
