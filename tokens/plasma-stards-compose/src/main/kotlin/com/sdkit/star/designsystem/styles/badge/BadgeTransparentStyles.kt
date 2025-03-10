// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.badge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeStyleBuilder
import com.sdds.compose.uikit.BadgeTransparent
import com.sdds.compose.uikit.badgeTransparentBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperBadgeTransparent : BuilderWrapper<BadgeStyle, BadgeStyleBuilder>

public interface WrapperBadgeTransparentView : WrapperBadgeTransparent

@JvmInline
public value class WrapperBadgeTransparentDefaultViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparent

@JvmInline
public value class WrapperBadgeTransparentAccentViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparent

@JvmInline
public value class WrapperBadgeTransparentNegativeViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparent

@JvmInline
public value class WrapperBadgeTransparentPositiveViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparent

@JvmInline
public value class WrapperBadgeTransparentWarningViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparent

@JvmInline
public value class WrapperBadgeTransparentDarkViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparent

@JvmInline
public value class WrapperBadgeTransparentLightViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparent

@JvmInline
public value class WrapperBadgeTransparentL(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

@JvmInline
public value class WrapperBadgeTransparentLPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

@JvmInline
public value class WrapperBadgeTransparentM(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

@JvmInline
public value class WrapperBadgeTransparentMPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

@JvmInline
public value class WrapperBadgeTransparentS(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

@JvmInline
public value class WrapperBadgeTransparentSPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

@JvmInline
public value class WrapperBadgeTransparentXs(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

@JvmInline
public value class WrapperBadgeTransparentXsPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

public val WrapperBadgeTransparentView.Default: WrapperBadgeTransparentDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            endContentColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentDefaultViewTerminate)

public val WrapperBadgeTransparentView.Accent: WrapperBadgeTransparentAccentViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentAccentMain.asInteractive(),
            )
            labelColor(
                StarDsTheme.colors.textDefaultAccentMain.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultAccentMain.asInteractive(),
            )
            endContentColor(
                StarDsTheme.colors.textDefaultAccentMain.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentAccentViewTerminate)

public val WrapperBadgeTransparentView.Negative: WrapperBadgeTransparentNegativeViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentNegative.asInteractive(),
            )
            labelColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(),
            )
            endContentColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentNegativeViewTerminate)

public val WrapperBadgeTransparentView.Positive: WrapperBadgeTransparentPositiveViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentPositive.asInteractive(),
            )
            labelColor(
                StarDsTheme.colors.textDefaultPositive.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultPositive.asInteractive(),
            )
            endContentColor(
                StarDsTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentPositiveViewTerminate)

public val WrapperBadgeTransparentView.Warning: WrapperBadgeTransparentWarningViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentWarning.asInteractive(),
            )
            labelColor(
                StarDsTheme.colors.textDefaultWarning.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultWarning.asInteractive(),
            )
            endContentColor(
                StarDsTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentWarningViewTerminate)

public val WrapperBadgeTransparentView.Dark: WrapperBadgeTransparentDarkViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceOnLightTransparentDeep.asInteractive(),
            )
            labelColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentDarkViewTerminate)

public val WrapperBadgeTransparentView.Light: WrapperBadgeTransparentLightViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceOnDarkTransparentSecondary.asInteractive(),
            )
            labelColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentLightViewTerminate)

private val BadgeStyleBuilder.invariantProps: BadgeStyleBuilder
    @Composable
    get() = this

public val BadgeTransparent.L: WrapperBadgeTransparentL
    @Composable
    @JvmName("WrapperBadgeTransparentL")
    get() = BadgeStyle.badgeTransparentBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_height_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startContentSize_l))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endContentSize_l))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startContentMargin_l))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endContentMargin_l))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startPadding_l))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endPadding_l))
        }
        .wrap(::WrapperBadgeTransparentL)

public val WrapperBadgeTransparentL.Pilled: WrapperBadgeTransparentLPilled
    @Composable
    @JvmName("WrapperBadgeTransparentLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeTransparentLPilled)

public val BadgeTransparent.M: WrapperBadgeTransparentM
    @Composable
    @JvmName("WrapperBadgeTransparentM")
    get() = BadgeStyle.badgeTransparentBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXs)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_height_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startContentSize_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endContentSize_m))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startContentMargin_m))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endContentMargin_m))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startPadding_m))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endPadding_m))
        }
        .wrap(::WrapperBadgeTransparentM)

public val WrapperBadgeTransparentM.Pilled: WrapperBadgeTransparentMPilled
    @Composable
    @JvmName("WrapperBadgeTransparentMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeTransparentMPilled)

public val BadgeTransparent.S: WrapperBadgeTransparentS
    @Composable
    @JvmName("WrapperBadgeTransparentS")
    get() = BadgeStyle.badgeTransparentBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXs)
        .labelStyle(StarDsTheme.typography.bodyXxsNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_height_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startContentSize_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endContentSize_s))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startContentMargin_s))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endContentMargin_s))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startPadding_s))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endPadding_s))
        }
        .wrap(::WrapperBadgeTransparentS)

public val WrapperBadgeTransparentS.Pilled: WrapperBadgeTransparentSPilled
    @Composable
    @JvmName("WrapperBadgeTransparentSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeTransparentSPilled)

public val BadgeTransparent.Xs: WrapperBadgeTransparentXs
    @Composable
    @JvmName("WrapperBadgeTransparentXs")
    get() = BadgeStyle.badgeTransparentBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXxs)
        .labelStyle(StarDsTheme.typography.bodyXxsNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_height_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startContentSize_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endContentSize_xs))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startContentMargin_xs))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endContentMargin_xs))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_startPadding_xs))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_endPadding_xs))
        }
        .wrap(::WrapperBadgeTransparentXs)

public val WrapperBadgeTransparentXs.Pilled: WrapperBadgeTransparentXsPilled
    @Composable
    @JvmName("WrapperBadgeTransparentXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeTransparentXsPilled)
