// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.avatar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.AvatarStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.badge.Accent
import com.sdds.plasma.homeds.styles.badge.BadgeSolid
import com.sdds.plasma.homeds.styles.badge.L
import com.sdds.plasma.homeds.styles.badge.Pilled
import com.sdds.plasma.homeds.styles.badge.S
import com.sdds.plasma.homeds.styles.badge.Xs
import com.sdds.plasma.homeds.styles.counter.Counter
import com.sdds.plasma.homeds.styles.counter.L
import com.sdds.plasma.homeds.styles.counter.Negative
import com.sdds.plasma.homeds.styles.counter.S
import com.sdds.plasma.homeds.styles.counter.Xs
import com.sdds.plasma.homeds.styles.counter.Xxs
import com.sdds.plasma.homeds.styles.indicator.Indicator
import com.sdds.plasma.homeds.styles.indicator.L
import com.sdds.plasma.homeds.styles.indicator.M
import com.sdds.plasma.homeds.styles.indicator.S
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperAvatar : BuilderWrapper<AvatarStyle, AvatarStyleBuilder>

/**
 * Обертка для вариации Xxl
 */
@JvmInline
public value class WrapperAvatarXxl(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации XxlPilled
 */
@JvmInline
public value class WrapperAvatarXxlPilled(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAvatarL(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperAvatarLPilled(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAvatarM(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperAvatarMPilled(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAvatarS(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperAvatarSPilled(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

private val AvatarStyleBuilder.invariantProps: AvatarStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .colors {
            backgroundColor(
                PlasmaHomeDsTheme.gradients.surfaceDefaultAccentGradient.asLayered(0.2f).asStatefulValue(),
            )
            textColor(
                PlasmaHomeDsTheme.gradients.textDefaultAccentGradient.asLayered().asStatefulValue(),
            )
        }

public val Avatar.Xxl: WrapperAvatarXxl
    @Composable
    @JvmName("WrapperAvatarXxl")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(88.0.dp)
            height(88.0.dp)
            statusOffsetX(1.0.dp)
            statusOffsetY(7.0.dp)
        }
        .textStyle(PlasmaHomeDsTheme.typography.headerH2Bold)
        .badgeStyle(BadgeSolid.L.Pilled.Accent.style())
        .counterStyle(Counter.L.Negative.style())
        .statusStyle(
            Indicator.L.modify {
                color {
                    backgroundColor(
                        PlasmaHomeDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to PlasmaHomeDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarXxl)

public val WrapperAvatarXxl.Pilled: WrapperAvatarXxlPilled
    @Composable
    @JvmName("WrapperAvatarXxlPilled")
    get() = builder
        .shape(PlasmaHomeDsTheme.shapes.roundXl.adjustBy(all = -2.0.dp))
        .dimensions {
            statusOffsetX(0.0.dp)
            statusOffsetY(0.0.dp)
        }
        .statusStyle(
            Indicator.L.modify {
                color {
                    backgroundColor(
                        PlasmaHomeDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to PlasmaHomeDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarXxlPilled)

public val Avatar.L: WrapperAvatarL
    @Composable
    @JvmName("WrapperAvatarL")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(48.0.dp)
            height(48.0.dp)
            statusOffsetX(1.0.dp)
            statusOffsetY(3.0.dp)
        }
        .textStyle(PlasmaHomeDsTheme.typography.headerH4Bold)
        .badgeStyle(BadgeSolid.S.Pilled.Accent.style())
        .counterStyle(Counter.S.Negative.style())
        .statusStyle(
            Indicator.M.modify {
                color {
                    backgroundColor(
                        PlasmaHomeDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to PlasmaHomeDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarL)

public val WrapperAvatarL.Pilled: WrapperAvatarLPilled
    @Composable
    @JvmName("WrapperAvatarLPilled")
    get() = builder
        .shape(PlasmaHomeDsTheme.shapes.roundM)
        .dimensions {
            statusOffsetX(0.0.dp)
            statusOffsetY(0.0.dp)
        }
        .statusStyle(
            Indicator.M.modify {
                color {
                    backgroundColor(
                        PlasmaHomeDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to PlasmaHomeDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarLPilled)

public val Avatar.M: WrapperAvatarM
    @Composable
    @JvmName("WrapperAvatarM")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(36.0.dp)
            height(36.0.dp)
            statusOffsetX(0.0.dp)
            statusOffsetY(2.0.dp)
        }
        .textStyle(PlasmaHomeDsTheme.typography.bodySBold)
        .badgeStyle(BadgeSolid.Xs.Pilled.Accent.style())
        .counterStyle(Counter.Xs.Negative.style())
        .statusStyle(
            Indicator.M.modify {
                color {
                    backgroundColor(
                        PlasmaHomeDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to PlasmaHomeDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarM)

public val WrapperAvatarM.Pilled: WrapperAvatarMPilled
    @Composable
    @JvmName("WrapperAvatarMPilled")
    get() = builder
        .shape(PlasmaHomeDsTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            statusOffsetX(0.0.dp)
            statusOffsetY(0.0.dp)
        }
        .statusStyle(
            Indicator.M.modify {
                color {
                    backgroundColor(
                        PlasmaHomeDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to PlasmaHomeDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarMPilled)

public val Avatar.S: WrapperAvatarS
    @Composable
    @JvmName("WrapperAvatarS")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(24.0.dp)
            height(24.0.dp)
            statusOffsetX(0.0.dp)
            statusOffsetY(0.0.dp)
        }
        .textStyle(PlasmaHomeDsTheme.typography.bodyXxsBold)
        .counterStyle(Counter.Xxs.Negative.style())
        .statusStyle(
            Indicator.S.modify {
                color {
                    backgroundColor(
                        PlasmaHomeDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to PlasmaHomeDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarS)

public val WrapperAvatarS.Pilled: WrapperAvatarSPilled
    @Composable
    @JvmName("WrapperAvatarSPilled")
    get() = builder
        .shape(PlasmaHomeDsTheme.shapes.roundS)
        .statusStyle(
            Indicator.S.modify {
                color {
                    backgroundColor(
                        PlasmaHomeDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to PlasmaHomeDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarSPilled)
