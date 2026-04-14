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
import com.sdds.sbcom.styles.iconbadge.Mention
import com.sdds.sbcom.styles.iconbadge.MuteNo
import com.sdds.sbcom.styles.iconbadge.MuteYes

internal object SddsSbcomMentionVariationsCompose : ComposeStyleProvider<BadgeStyle>() {
    override val variations: Map<String, ComposeStyleReference<BadgeStyle>> =
        mapOf(
            "MuteNo" to ComposeStyleReference { Mention.MuteNo.style() },
            "MuteYes" to ComposeStyleReference { Mention.MuteYes.style() },
        )
}
