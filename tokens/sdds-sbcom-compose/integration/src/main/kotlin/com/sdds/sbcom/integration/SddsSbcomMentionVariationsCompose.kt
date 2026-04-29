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
import com.sdds.sbcom.styles.iconbadge.IconBadgeMentionMute
import com.sdds.sbcom.styles.iconbadge.IconBadgeStyles
import com.sdds.sbcom.styles.iconbadge.Mention
import com.sdds.sbcom.styles.iconbadge.MuteNo
import com.sdds.sbcom.styles.iconbadge.MuteYes
import com.sdds.sbcom.styles.iconbadge.resolve

internal object SddsSbcomMentionVariationsCompose : ComposeStyleProvider<BadgeStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "mute", value = "No", variants = listOf("No", "Yes")),
        )

    override val variations: Map<String, ComposeStyleReference<BadgeStyle>> =
        mapOf(
            "Mention.MuteNo" to ComposeStyleReference { Mention.MuteNo.style() },
            "Mention.MuteYes" to ComposeStyleReference { Mention.MuteYes.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconBadgeStyles.Mention.resolve(
            mute = when (bindings["mute"]?.toString()) {
                "No" -> IconBadgeMentionMute.No
                "Yes" -> IconBadgeMentionMute.Yes
                else -> IconBadgeMentionMute.No
            },
        ).key
    }
}
