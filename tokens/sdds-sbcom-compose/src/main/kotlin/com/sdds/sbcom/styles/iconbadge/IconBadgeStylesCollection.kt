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
    ;

    /**
     * Typed API для подбора стиля mention
     */
    public object Mention

    /**
     * Typed API для подбора стиля voice-chat-badge
     */
    public object VoiceChatBadge
}

/**
 * Возможные значения свойства mute для mention
 */
public enum class IconBadgeMentionMute {
    No,
    Yes,
}

/**
 * Возможные значения свойства size для voice-chat-badge
 */
public enum class IconBadgeVoiceChatBadgeSize {
    Size20,
    Size18,
    Size16,
    Size14,
}

/**
 * Возвращает [BadgeStyle] для [IconBadgeStyles]
 */
@Composable
public fun IconBadgeStyles.style(modify: @Composable IconBadgeStyleBuilder.() -> Unit = {}): BadgeStyle {
    val builder = when (this) {
        IconBadgeStyles.MentionMuteNo -> Mention.MuteNo
        IconBadgeStyles.MentionMuteYes -> Mention.MuteYes
        IconBadgeStyles.VoiceChatBadgeSize20 -> VoiceChatBadge.Size20
        IconBadgeStyles.VoiceChatBadgeSize18 -> VoiceChatBadge.Size18
        IconBadgeStyles.VoiceChatBadgeSize16 -> VoiceChatBadge.Size16
        IconBadgeStyles.VoiceChatBadgeSize14 -> VoiceChatBadge.Size14
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IconBadgeStyles] для mention
 */
public fun IconBadgeStyles.Mention.resolve(mute: IconBadgeMentionMute = IconBadgeMentionMute.No):
    IconBadgeStyles = when {
    mute == IconBadgeMentionMute.No -> IconBadgeStyles.MentionMuteNo
    mute == IconBadgeMentionMute.Yes -> IconBadgeStyles.MentionMuteYes
    else -> error("Unsupported mention style combination")
}

/**
 * Возвращает [BadgeStyle] для mention
 */
@Composable
public fun IconBadgeStyles.Mention.style(
    mute: IconBadgeMentionMute = IconBadgeMentionMute.No,
    modify: @Composable IconBadgeStyleBuilder.() -> Unit = {},
): BadgeStyle =
    resolve(mute).style(modify)

/**
 * Возвращает экземпляр [IconBadgeStyles] для voice-chat-badge
 */
public fun IconBadgeStyles.VoiceChatBadge.resolve(
    size: IconBadgeVoiceChatBadgeSize =
        IconBadgeVoiceChatBadgeSize.Size20,
): IconBadgeStyles = when {
    size == IconBadgeVoiceChatBadgeSize.Size20 -> IconBadgeStyles.VoiceChatBadgeSize20
    size == IconBadgeVoiceChatBadgeSize.Size18 -> IconBadgeStyles.VoiceChatBadgeSize18
    size == IconBadgeVoiceChatBadgeSize.Size16 -> IconBadgeStyles.VoiceChatBadgeSize16
    size == IconBadgeVoiceChatBadgeSize.Size14 -> IconBadgeStyles.VoiceChatBadgeSize14
    else -> error("Unsupported voice-chat-badge style combination")
}

/**
 * Возвращает [BadgeStyle] для voice-chat-badge
 */
@Composable
public fun IconBadgeStyles.VoiceChatBadge.style(
    size: IconBadgeVoiceChatBadgeSize =
        IconBadgeVoiceChatBadgeSize.Size20,
    modify: @Composable IconBadgeStyleBuilder.() -> Unit =
        {},
): BadgeStyle = resolve(size).style(modify)
