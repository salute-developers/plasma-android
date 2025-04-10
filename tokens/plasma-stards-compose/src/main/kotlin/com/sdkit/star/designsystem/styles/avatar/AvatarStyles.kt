// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.avatar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
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
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.indicator.Indicator
import com.sdkit.star.designsystem.styles.indicator.L
import com.sdkit.star.designsystem.styles.indicator.M
import com.sdkit.star.designsystem.styles.indicator.S
import com.sdkit.star.designsystem.theme.StarDsTheme
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
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAvatarL(
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
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAvatarS(
    public override val builder: AvatarStyleBuilder,
) : WrapperAvatar

private val AvatarStyleBuilder.invariantProps: AvatarStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .colors {
            backgroundColor(
                StarDsTheme.gradients.surfaceDefaultGradientMain.asLayered(0.2f).asStatefulValue(),
            )
            textColor(
                StarDsTheme.gradients.textDefaultGradientMain.asLayered().asStatefulValue(),
            )
        }

public val Avatar.Xxl: WrapperAvatarXxl
    @Composable
    @JvmName("WrapperAvatarXxl")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_avatar_width_xxl))
            height(dimensionResource(R.dimen.sdkit_cmp_avatar_height_xxl))
            statusOffsetX(dimensionResource(R.dimen.sdkit_cmp_avatar_statusOffsetX_xxl))
            statusOffsetY(dimensionResource(R.dimen.sdkit_cmp_avatar_statusOffsetY_xxl))
        }
        .textStyle(StarDsTheme.typography.headerH2Bold)
        .statusStyle(
            Indicator.L.modify {
                color {
                    backgroundColor(
                        StarDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to StarDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarXxl)

public val Avatar.L: WrapperAvatarL
    @Composable
    @JvmName("WrapperAvatarL")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_avatar_width_l))
            height(dimensionResource(R.dimen.sdkit_cmp_avatar_height_l))
            statusOffsetX(dimensionResource(R.dimen.sdkit_cmp_avatar_statusOffsetX_l))
            statusOffsetY(dimensionResource(R.dimen.sdkit_cmp_avatar_statusOffsetY_l))
        }
        .textStyle(StarDsTheme.typography.headerH4Bold)
        .statusStyle(
            Indicator.M.modify {
                color {
                    backgroundColor(
                        StarDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to StarDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarL)

public val Avatar.M: WrapperAvatarM
    @Composable
    @JvmName("WrapperAvatarM")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_avatar_width_m))
            height(dimensionResource(R.dimen.sdkit_cmp_avatar_height_m))
            statusOffsetX(dimensionResource(R.dimen.sdkit_cmp_avatar_statusOffsetX_m))
            statusOffsetY(dimensionResource(R.dimen.sdkit_cmp_avatar_statusOffsetY_m))
        }
        .textStyle(StarDsTheme.typography.bodySBold)
        .statusStyle(
            Indicator.M.modify {
                color {
                    backgroundColor(
                        StarDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to StarDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarM)

public val Avatar.S: WrapperAvatarS
    @Composable
    @JvmName("WrapperAvatarS")
    get() = AvatarStyle.builder(this)
        .invariantProps
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_avatar_width_s))
            height(dimensionResource(R.dimen.sdkit_cmp_avatar_height_s))
            statusOffsetX(dimensionResource(R.dimen.sdkit_cmp_avatar_statusOffsetX_s))
            statusOffsetY(dimensionResource(R.dimen.sdkit_cmp_avatar_statusOffsetY_s))
        }
        .textStyle(StarDsTheme.typography.bodyXxsBold)
        .statusStyle(
            Indicator.S.modify {
                color {
                    backgroundColor(
                        StarDsTheme.colors.surfaceOnLightSolidTertiary.asInteractive(
                            setOf(AvatarStatus.Active)
                                to StarDsTheme.colors.surfaceDefaultPositive,
                        ),
                    )
                }
            }
                .style(),
        )
        .wrap(::WrapperAvatarS)
