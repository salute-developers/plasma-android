// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.iconbadge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.iconBadgeBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperVoiceChatBadge : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

/**
 * Обертка для вариации Size20
 */
@JvmInline
public value class WrapperVoiceChatBadgeSize20(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperVoiceChatBadge

/**
 * Обертка для вариации Size18
 */
@JvmInline
public value class WrapperVoiceChatBadgeSize18(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperVoiceChatBadge

/**
 * Обертка для вариации Size16
 */
@JvmInline
public value class WrapperVoiceChatBadgeSize16(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperVoiceChatBadge

/**
 * Обертка для вариации Size14
 */
@JvmInline
public value class WrapperVoiceChatBadgeSize14(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperVoiceChatBadge

private val IconBadgeStyleBuilder.invariantProps: IconBadgeStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
            startContentColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .dimensions {
            startPadding(0.0.dp)
            endPadding(0.0.dp)
        }

public val VoiceChatBadge.Size20: WrapperVoiceChatBadgeSize20
    @Composable
    @JvmName("WrapperVoiceChatBadgeSize20")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .dimensions {
            height(20.0.dp)
            startContentSize(20.0.dp)
        }
        .wrap(::WrapperVoiceChatBadgeSize20)

public val VoiceChatBadge.Size18: WrapperVoiceChatBadgeSize18
    @Composable
    @JvmName("WrapperVoiceChatBadgeSize18")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .dimensions {
            height(18.0.dp)
            startContentSize(18.0.dp)
        }
        .wrap(::WrapperVoiceChatBadgeSize18)

public val VoiceChatBadge.Size16: WrapperVoiceChatBadgeSize16
    @Composable
    @JvmName("WrapperVoiceChatBadgeSize16")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .dimensions {
            height(16.0.dp)
            startContentSize(16.0.dp)
        }
        .wrap(::WrapperVoiceChatBadgeSize16)

public val VoiceChatBadge.Size14: WrapperVoiceChatBadgeSize14
    @Composable
    @JvmName("WrapperVoiceChatBadgeSize14")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .dimensions {
            height(14.0.dp)
            startContentSize(14.0.dp)
        }
        .wrap(::WrapperVoiceChatBadgeSize14)
