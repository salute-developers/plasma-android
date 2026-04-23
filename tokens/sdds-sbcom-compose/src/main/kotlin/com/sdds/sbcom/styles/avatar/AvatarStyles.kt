// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.avatar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.AvatarStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.modify
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

private val AvatarStyleBuilder.invariantProps: AvatarStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .dimensions {
            statusCutoutPadding(3.0.dp)
        }
        .colors {
            backgroundColor(

                SddsSbComTheme.gradients.personasDefaultBlueSurfaceAccentGradient.asLayered().asStatefulValue(),
            )
            textColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .statusCutoutEnabled(true)

public val Avatar.Size72: WrapperAvatarSize72
    @Composable
    @JvmName("WrapperAvatarSize72")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(72.0.dp)
            height(72.0.dp)
            statusOffsetX(4.0.dp)
            statusOffsetY(4.0.dp)
        }
        .textStyle(SddsSbComTheme.typography.headerH1Medium)
        .iconBadgeStyle(VoiceChatBadge.Size20.style())
        .statusStyle(
            AvatarIndicator.Size14.modify {
                color {
                    backgroundColor(
                        SddsSbComTheme.colors.textDefaultTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to SddsSbComTheme.colors.surfaceDefaultAccent,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarSize72)

public val Avatar.Size64: WrapperAvatarSize64
    @Composable
    @JvmName("WrapperAvatarSize64")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(64.0.dp)
            height(64.0.dp)
            statusOffsetX(3.0.dp)
            statusOffsetY(3.0.dp)
        }
        .textStyle(SddsSbComTheme.typography.headerH1Medium)
        .iconBadgeStyle(VoiceChatBadge.Size20.style())
        .statusStyle(
            AvatarIndicator.Size12.modify {
                color {
                    backgroundColor(
                        SddsSbComTheme.colors.textDefaultTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to SddsSbComTheme.colors.surfaceDefaultAccent,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarSize64)

public val Avatar.Size56: WrapperAvatarSize56
    @Composable
    @JvmName("WrapperAvatarSize56")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(56.0.dp)
            height(56.0.dp)
            statusOffsetX(4.0.dp)
            statusOffsetY(4.0.dp)
        }
        .textStyle(SddsSbComTheme.typography.headerH2Medium)
        .iconBadgeStyle(VoiceChatBadge.Size20.style())
        .statusStyle(
            AvatarIndicator.Size10.modify {
                color {
                    backgroundColor(
                        SddsSbComTheme.colors.textDefaultTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to SddsSbComTheme.colors.surfaceDefaultAccent,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarSize56)

public val Avatar.Size44: WrapperAvatarSize44
    @Composable
    @JvmName("WrapperAvatarSize44")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(44.0.dp)
            height(44.0.dp)
            statusOffsetX(3.0.dp)
            statusOffsetY(3.0.dp)
        }
        .textStyle(SddsSbComTheme.typography.headerH3Medium)
        .iconBadgeStyle(VoiceChatBadge.Size18.style())
        .statusStyle(
            AvatarIndicator.Size8.modify {
                color {
                    backgroundColor(
                        SddsSbComTheme.colors.textDefaultTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to SddsSbComTheme.colors.surfaceDefaultAccent,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarSize44)

public val Avatar.Size40: WrapperAvatarSize40
    @Composable
    @JvmName("WrapperAvatarSize40")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(40.0.dp)
            height(40.0.dp)
            statusOffsetX(2.0.dp)
            statusOffsetY(2.0.dp)
        }
        .textStyle(SddsSbComTheme.typography.headerH4Medium)
        .iconBadgeStyle(VoiceChatBadge.Size16.style())
        .statusStyle(
            AvatarIndicator.Size8.modify {
                color {
                    backgroundColor(
                        SddsSbComTheme.colors.textDefaultTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to SddsSbComTheme.colors.surfaceDefaultAccent,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarSize40)

public val Avatar.Size36: WrapperAvatarSize36
    @Composable
    @JvmName("WrapperAvatarSize36")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(36.0.dp)
            height(36.0.dp)
            statusOffsetX(2.0.dp)
            statusOffsetY(2.0.dp)
        }
        .textStyle(SddsSbComTheme.typography.bodyLMedium)
        .iconBadgeStyle(VoiceChatBadge.Size14.style())
        .statusStyle(
            AvatarIndicator.Size6.modify {
                color {
                    backgroundColor(
                        SddsSbComTheme.colors.textDefaultTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to SddsSbComTheme.colors.surfaceDefaultAccent,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarSize36)

public val Avatar.Size32: WrapperAvatarSize32
    @Composable
    @JvmName("WrapperAvatarSize32")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(32.0.dp)
            height(32.0.dp)
            statusOffsetX(1.0.dp)
            statusOffsetY(1.0.dp)
        }
        .textStyle(SddsSbComTheme.typography.bodySMedium)
        .iconBadgeStyle(VoiceChatBadge.Size14.style())
        .statusStyle(
            AvatarIndicator.Size6.modify {
                color {
                    backgroundColor(
                        SddsSbComTheme.colors.textDefaultTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to SddsSbComTheme.colors.surfaceDefaultAccent,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarSize32)

public val Avatar.Size26: WrapperAvatarSize26
    @Composable
    @JvmName("WrapperAvatarSize26")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(26.0.dp)
            height(26.0.dp)
        }
        .textStyle(SddsSbComTheme.typography.bodyXxsMedium)
        .wrap(::WrapperAvatarSize26)

public val Avatar.Size24: WrapperAvatarSize24
    @Composable
    @JvmName("WrapperAvatarSize24")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(24.0.dp)
            height(24.0.dp)
        }
        .textStyle(SddsSbComTheme.typography.bodyXxsMedium)
        .wrap(::WrapperAvatarSize24)
