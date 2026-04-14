// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.iconbadge.Size14
import com.sdds.sbcom.styles.iconbadge.Size16
import com.sdds.sbcom.styles.iconbadge.Size18
import com.sdds.sbcom.styles.iconbadge.Size20
import com.sdds.sbcom.styles.iconbadge.VoiceChatBadge

internal object SddsSbcomVoiceChatBadgeVariationsCompose : ComposeStyleProvider<BadgeStyle>() {
    override val variations: Map<String, ComposeStyleReference<BadgeStyle>> =
        mapOf(
            "Size20" to ComposeStyleReference { VoiceChatBadge.Size20.style() },
            "Size18" to ComposeStyleReference { VoiceChatBadge.Size18.style() },
            "Size16" to ComposeStyleReference { VoiceChatBadge.Size16.style() },
            "Size14" to ComposeStyleReference { VoiceChatBadge.Size14.style() },
        )
}
