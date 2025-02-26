// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.badge.icon

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.IconBadgeTransparent
import com.sdds.compose.uikit.iconBadgeTransparentBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperIconBadgeTransparent : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

public interface WrapperIconBadgeTransparentView : WrapperIconBadgeTransparent

@JvmInline
public value class WrapperIconBadgeTransparentDefaultViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparent

@JvmInline
public value class WrapperIconBadgeTransparentAccentViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparent

@JvmInline
public value class WrapperIconBadgeTransparentNegativeViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparent

@JvmInline
public value class WrapperIconBadgeTransparentPositiveViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparent

@JvmInline
public value class WrapperIconBadgeTransparentWarningViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparent

@JvmInline
public value class WrapperIconBadgeTransparentDarkViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparent

@JvmInline
public value class WrapperIconBadgeTransparentLightViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparent

@JvmInline
public value class WrapperIconBadgeTransparentL(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

@JvmInline
public value class WrapperIconBadgeTransparentLPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

@JvmInline
public value class WrapperIconBadgeTransparentM(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

@JvmInline
public value class WrapperIconBadgeTransparentMPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

@JvmInline
public value class WrapperIconBadgeTransparentS(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

@JvmInline
public value class WrapperIconBadgeTransparentSPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

@JvmInline
public value class WrapperIconBadgeTransparentXs(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

@JvmInline
public value class WrapperIconBadgeTransparentXsPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

public val WrapperIconBadgeTransparentView.Default: WrapperIconBadgeTransparentDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentDefaultViewTerminate)

public val WrapperIconBadgeTransparentView.Accent: WrapperIconBadgeTransparentAccentViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentAccentMain.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultAccentMain.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentAccentViewTerminate)

public val WrapperIconBadgeTransparentView.Negative:
    WrapperIconBadgeTransparentNegativeViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentNegative.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentNegativeViewTerminate)

public val WrapperIconBadgeTransparentView.Positive:
    WrapperIconBadgeTransparentPositiveViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentPositive.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentPositiveViewTerminate)

public val WrapperIconBadgeTransparentView.Warning: WrapperIconBadgeTransparentWarningViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentWarning.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentWarningViewTerminate)

public val WrapperIconBadgeTransparentView.Dark: WrapperIconBadgeTransparentDarkViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceOnLightTransparentDeep.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentDarkViewTerminate)

public val WrapperIconBadgeTransparentView.Light: WrapperIconBadgeTransparentLightViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceOnDarkTransparentSecondary.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentLightViewTerminate)

private val IconBadgeStyleBuilder.invariantProps: IconBadgeStyleBuilder
    @Composable
    get() = this

public val IconBadgeTransparent.L: WrapperIconBadgeTransparentL
    @Composable
    @JvmName("WrapperIconBadgeTransparentL")
    get() = BadgeStyle.iconBadgeTransparentBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_height_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_startContentSize_l))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_startPadding_l))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_endPadding_l))
        }
        .wrap(::WrapperIconBadgeTransparentL)

public val WrapperIconBadgeTransparentL.Pilled: WrapperIconBadgeTransparentLPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentLPilled)

public val IconBadgeTransparent.M: WrapperIconBadgeTransparentM
    @Composable
    @JvmName("WrapperIconBadgeTransparentM")
    get() = BadgeStyle.iconBadgeTransparentBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXs)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_height_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_startContentSize_m))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_startPadding_m))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_endPadding_m))
        }
        .wrap(::WrapperIconBadgeTransparentM)

public val WrapperIconBadgeTransparentM.Pilled: WrapperIconBadgeTransparentMPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentMPilled)

public val IconBadgeTransparent.S: WrapperIconBadgeTransparentS
    @Composable
    @JvmName("WrapperIconBadgeTransparentS")
    get() = BadgeStyle.iconBadgeTransparentBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXs)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_height_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_startContentSize_s))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_startPadding_s))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_endPadding_s))
        }
        .wrap(::WrapperIconBadgeTransparentS)

public val WrapperIconBadgeTransparentS.Pilled: WrapperIconBadgeTransparentSPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentSPilled)

public val IconBadgeTransparent.Xs: WrapperIconBadgeTransparentXs
    @Composable
    @JvmName("WrapperIconBadgeTransparentXs")
    get() = BadgeStyle.iconBadgeTransparentBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXxs)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_height_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_startContentSize_xs))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_startPadding_xs))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_endPadding_xs))
        }
        .wrap(::WrapperIconBadgeTransparentXs)

public val WrapperIconBadgeTransparentXs.Pilled: WrapperIconBadgeTransparentXsPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentXsPilled)
