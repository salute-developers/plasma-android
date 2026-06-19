// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.avatar.Avatar
import com.sdds.sbcom.styles.avatar.AvatarSize
import com.sdds.sbcom.styles.avatar.AvatarStyles
import com.sdds.sbcom.styles.avatar.Size100
import com.sdds.sbcom.styles.avatar.Size120
import com.sdds.sbcom.styles.avatar.Size16
import com.sdds.sbcom.styles.avatar.Size180
import com.sdds.sbcom.styles.avatar.Size24
import com.sdds.sbcom.styles.avatar.Size26
import com.sdds.sbcom.styles.avatar.Size32
import com.sdds.sbcom.styles.avatar.Size36
import com.sdds.sbcom.styles.avatar.Size40
import com.sdds.sbcom.styles.avatar.Size44
import com.sdds.sbcom.styles.avatar.Size56
import com.sdds.sbcom.styles.avatar.Size64
import com.sdds.sbcom.styles.avatar.Size72
import com.sdds.sbcom.styles.avatar.resolve

internal object SddsSbcomAvatarVariationsCompose : ComposeStyleProvider<AvatarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Size72",
                variants = listOf("Size180", "Size120", "Size100", "Size72", "Size64", "Size56", "Size44", "Size40", "Size36", "Size32", "Size26", "Size24", "Size16"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<AvatarStyle>> =
        mapOf(
            "Avatar.Size180" to ComposeStyleReference { Avatar.Size180.style() },
            "Avatar.Size120" to ComposeStyleReference { Avatar.Size120.style() },
            "Avatar.Size100" to ComposeStyleReference { Avatar.Size100.style() },
            "Avatar.Size72" to ComposeStyleReference { Avatar.Size72.style() },
            "Avatar.Size64" to ComposeStyleReference { Avatar.Size64.style() },
            "Avatar.Size56" to ComposeStyleReference { Avatar.Size56.style() },
            "Avatar.Size44" to ComposeStyleReference { Avatar.Size44.style() },
            "Avatar.Size40" to ComposeStyleReference { Avatar.Size40.style() },
            "Avatar.Size36" to ComposeStyleReference { Avatar.Size36.style() },
            "Avatar.Size32" to ComposeStyleReference { Avatar.Size32.style() },
            "Avatar.Size26" to ComposeStyleReference { Avatar.Size26.style() },
            "Avatar.Size24" to ComposeStyleReference { Avatar.Size24.style() },
            "Avatar.Size16" to ComposeStyleReference { Avatar.Size16.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AvatarStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Size180" -> AvatarSize.Size180
                "Size120" -> AvatarSize.Size120
                "Size100" -> AvatarSize.Size100
                "Size72" -> AvatarSize.Size72
                "Size64" -> AvatarSize.Size64
                "Size56" -> AvatarSize.Size56
                "Size44" -> AvatarSize.Size44
                "Size40" -> AvatarSize.Size40
                "Size36" -> AvatarSize.Size36
                "Size32" -> AvatarSize.Size32
                "Size26" -> AvatarSize.Size26
                "Size24" -> AvatarSize.Size24
                "Size16" -> AvatarSize.Size16
                else -> AvatarSize.Size72
            },
        ).key
    }
}
