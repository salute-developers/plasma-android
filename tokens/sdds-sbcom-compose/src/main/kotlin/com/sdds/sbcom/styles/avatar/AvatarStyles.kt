// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.avatar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.AvatarStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.iconbadge.Size14
import com.sdds.sbcom.styles.iconbadge.Size16
import com.sdds.sbcom.styles.iconbadge.Size18
import com.sdds.sbcom.styles.iconbadge.Size20
import com.sdds.sbcom.styles.iconbadge.VoiceChatBadge
import com.sdds.sbcom.styles.indicator.AvatarIndicator
import com.sdds.sbcom.styles.indicator.Size10
import com.sdds.sbcom.styles.indicator.Size12
import com.sdds.sbcom.styles.indicator.Size14
import com.sdds.sbcom.styles.indicator.Size6
import com.sdds.sbcom.styles.indicator.Size8
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAvatar : BuilderWrapper<AvatarStyle, AvatarStyleBuilder>

/**
 * Обертка для вариации Size180
 */
@JvmInline
public value class WrapperAvatarSize180(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size120
 */
@JvmInline
public value class WrapperAvatarSize120(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size100
 */
@JvmInline
public value class WrapperAvatarSize100(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size72
 */
@JvmInline
public value class WrapperAvatarSize72(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size64
 */
@JvmInline
public value class WrapperAvatarSize64(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size56
 */
@JvmInline
public value class WrapperAvatarSize56(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size44
 */
@JvmInline
public value class WrapperAvatarSize44(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size40
 */
@JvmInline
public value class WrapperAvatarSize40(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size36
 */
@JvmInline
public value class WrapperAvatarSize36(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size32
 */
@JvmInline
public value class WrapperAvatarSize32(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size26
 */
@JvmInline
public value class WrapperAvatarSize26(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size24
 */
@JvmInline
public value class WrapperAvatarSize24(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации Size16
 */
@JvmInline
public value class WrapperAvatarSize16(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

private val AvatarStyleBuilder.invariantProps: AvatarStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .statusCutoutEnabled(true)
        .colors {
            textColor(SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue())
            backgroundColor(
                SddsSbComTheme.gradients.personasDefaultBlueSurfaceAccentGradient.asLayered().asStatefulValue(),
            )
        }
        .dimensions {
            statusCutoutPadding(3.0.dp)
        }

public val Avatar.Size180: WrapperAvatarSize180
    @Composable
    @JvmName("WrapperAvatarSize180")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.headerHXxlMedium)
        .dimensions {
            width(180.0.dp)
            height(180.0.dp)
        }
        .wrap(::WrapperAvatarSize180)

public val Avatar.Size120: WrapperAvatarSize120
    @Composable
    @JvmName("WrapperAvatarSize120")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.headerHXlMedium)
        .dimensions {
            width(120.0.dp)
            height(120.0.dp)
        }
        .wrap(::WrapperAvatarSize120)

public val Avatar.Size100: WrapperAvatarSize100
    @Composable
    @JvmName("WrapperAvatarSize100")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.headerHXlMedium)
        .dimensions {
            width(100.0.dp)
            height(100.0.dp)
        }
        .wrap(::WrapperAvatarSize100)

public val Avatar.Size72: WrapperAvatarSize72
    @Composable
    @JvmName("WrapperAvatarSize72")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.headerH1Medium)
        .statusStyle(AvatarIndicator.Size14.style())
        .iconBadgeStyle(VoiceChatBadge.Size20.style())
        .dimensions {
            statusOffsetX(4.0.dp)
            statusOffsetY(4.0.dp)
            width(72.0.dp)
            height(72.0.dp)
        }
        .wrap(::WrapperAvatarSize72)

public val Avatar.Size64: WrapperAvatarSize64
    @Composable
    @JvmName("WrapperAvatarSize64")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.headerH1Medium)
        .statusStyle(AvatarIndicator.Size12.style())
        .iconBadgeStyle(VoiceChatBadge.Size20.style())
        .dimensions {
            statusOffsetX(3.0.dp)
            statusOffsetY(3.0.dp)
            width(64.0.dp)
            height(64.0.dp)
        }
        .wrap(::WrapperAvatarSize64)

public val Avatar.Size56: WrapperAvatarSize56
    @Composable
    @JvmName("WrapperAvatarSize56")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.headerH2Medium)
        .statusStyle(AvatarIndicator.Size10.style())
        .iconBadgeStyle(VoiceChatBadge.Size20.style())
        .dimensions {
            statusOffsetX(4.0.dp)
            statusOffsetY(4.0.dp)
            width(56.0.dp)
            height(56.0.dp)
        }
        .wrap(::WrapperAvatarSize56)

public val Avatar.Size44: WrapperAvatarSize44
    @Composable
    @JvmName("WrapperAvatarSize44")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.headerH3Medium)
        .statusStyle(AvatarIndicator.Size8.style())
        .iconBadgeStyle(VoiceChatBadge.Size18.style())
        .dimensions {
            statusOffsetX(3.0.dp)
            statusOffsetY(3.0.dp)
            width(44.0.dp)
            height(44.0.dp)
        }
        .wrap(::WrapperAvatarSize44)

public val Avatar.Size40: WrapperAvatarSize40
    @Composable
    @JvmName("WrapperAvatarSize40")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.headerH4Medium)
        .statusStyle(AvatarIndicator.Size8.style())
        .iconBadgeStyle(VoiceChatBadge.Size16.style())
        .dimensions {
            statusOffsetX(2.0.dp)
            statusOffsetY(2.0.dp)
            width(40.0.dp)
            height(40.0.dp)
        }
        .wrap(::WrapperAvatarSize40)

public val Avatar.Size36: WrapperAvatarSize36
    @Composable
    @JvmName("WrapperAvatarSize36")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.bodyLMedium)
        .statusStyle(AvatarIndicator.Size6.style())
        .iconBadgeStyle(VoiceChatBadge.Size14.style())
        .dimensions {
            statusOffsetX(2.0.dp)
            statusOffsetY(2.0.dp)
            width(36.0.dp)
            height(36.0.dp)
        }
        .wrap(::WrapperAvatarSize36)

public val Avatar.Size32: WrapperAvatarSize32
    @Composable
    @JvmName("WrapperAvatarSize32")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.bodySMedium)
        .statusStyle(AvatarIndicator.Size6.style())
        .iconBadgeStyle(VoiceChatBadge.Size14.style())
        .dimensions {
            statusOffsetX(1.0.dp)
            statusOffsetY(1.0.dp)
            width(32.0.dp)
            height(32.0.dp)
        }
        .wrap(::WrapperAvatarSize32)

public val Avatar.Size26: WrapperAvatarSize26
    @Composable
    @JvmName("WrapperAvatarSize26")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.bodyXxsMedium)
        .dimensions {
            width(26.0.dp)
            height(26.0.dp)
        }
        .wrap(::WrapperAvatarSize26)

public val Avatar.Size24: WrapperAvatarSize24
    @Composable
    @JvmName("WrapperAvatarSize24")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.bodyXxsMedium)
        .dimensions {
            width(24.0.dp)
            height(24.0.dp)
        }
        .wrap(::WrapperAvatarSize24)

public val Avatar.Size16: WrapperAvatarSize16
    @Composable
    @JvmName("WrapperAvatarSize16")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .textStyle(SddsSbComTheme.typography.bodyXxxsMedium)
        .dimensions {
            width(16.0.dp)
            height(16.0.dp)
        }
        .wrap(::WrapperAvatarSize16)
