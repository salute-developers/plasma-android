// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.iconbadge

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента IconBadge
 */
public enum class IconBadgeStyles(
    public val key: String,
) {
    MentionMuteNo("Mention.MuteNo"),
    MentionMuteYes("Mention.MuteYes"),
    VoiceChatBadgeSize20("VoiceChatBadge.Size20"),
    VoiceChatBadgeSize18("VoiceChatBadge.Size18"),
    VoiceChatBadgeSize16("VoiceChatBadge.Size16"),
    VoiceChatBadgeSize14("VoiceChatBadge.Size14"),
}

/**
 * Возвращает [BadgeStyle] для [IconBadgeStyles]
 */
@Composable
public fun IconBadgeStyles.style(modifyAction: @Composable IconBadgeStyleBuilder.() -> Unit = {}): BadgeStyle {
    val builder = when (this) {
        IconBadgeStyles.MentionMuteNo -> Mention.MuteNo
        IconBadgeStyles.MentionMuteYes -> Mention.MuteYes
        IconBadgeStyles.VoiceChatBadgeSize20 -> VoiceChatBadge.Size20
        IconBadgeStyles.VoiceChatBadgeSize18 -> VoiceChatBadge.Size18
        IconBadgeStyles.VoiceChatBadgeSize16 -> VoiceChatBadge.Size16
        IconBadgeStyles.VoiceChatBadgeSize14 -> VoiceChatBadge.Size14
    }
    return builder.modify(modifyAction).style()
}
