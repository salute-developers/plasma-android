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
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.iconbadge.IconBadgeStyles
import com.sdds.sbcom.styles.iconbadge.IconBadgeVoiceChatBadgeSize
import com.sdds.sbcom.styles.iconbadge.Size14
import com.sdds.sbcom.styles.iconbadge.Size16
import com.sdds.sbcom.styles.iconbadge.Size18
import com.sdds.sbcom.styles.iconbadge.Size20
import com.sdds.sbcom.styles.iconbadge.VoiceChatBadge
import com.sdds.sbcom.styles.iconbadge.resolve

internal object SddsSbcomVoiceChatBadgeVariationsCompose : ComposeStyleProvider<BadgeStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Size20",
                variants = listOf("Size20", "Size18", "Size16", "Size14"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<BadgeStyle>> =
        mapOf(
            "VoiceChatBadge.Size20" to ComposeStyleReference { VoiceChatBadge.Size20.style() },
            "VoiceChatBadge.Size18" to ComposeStyleReference { VoiceChatBadge.Size18.style() },
            "VoiceChatBadge.Size16" to ComposeStyleReference { VoiceChatBadge.Size16.style() },
            "VoiceChatBadge.Size14" to ComposeStyleReference { VoiceChatBadge.Size14.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconBadgeStyles.VoiceChatBadge.resolve(
            size = when (bindings["size"]?.toString()) {
                "Size20" -> IconBadgeVoiceChatBadgeSize.Size20
                "Size18" -> IconBadgeVoiceChatBadgeSize.Size18
                "Size16" -> IconBadgeVoiceChatBadgeSize.Size16
                "Size14" -> IconBadgeVoiceChatBadgeSize.Size14
                else -> IconBadgeVoiceChatBadgeSize.Size20
            },
        ).key
    }
}
