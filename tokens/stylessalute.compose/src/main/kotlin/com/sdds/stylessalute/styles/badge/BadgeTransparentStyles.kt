// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.stylessalute.styles.badge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeStyleBuilder
import com.sdds.compose.uikit.BadgeTransparent
import com.sdds.compose.uikit.badgeTransparentBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
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
                StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            endContentColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentDefaultViewTerminate)

public val WrapperBadgeTransparentView.Accent: WrapperBadgeTransparentAccentViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentAccentMain.asInteractive(),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultAccentMain.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultAccentMain.asInteractive(),
            )
            endContentColor(
                StylesSaluteTheme.colors.textDefaultAccentMain.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentAccentViewTerminate)

public val WrapperBadgeTransparentView.Negative: WrapperBadgeTransparentNegativeViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentNegative.asInteractive(),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(),
            )
            endContentColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentNegativeViewTerminate)

public val WrapperBadgeTransparentView.Positive: WrapperBadgeTransparentPositiveViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentPositive.asInteractive(),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultPositive.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultPositive.asInteractive(),
            )
            endContentColor(
                StylesSaluteTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentPositiveViewTerminate)

public val WrapperBadgeTransparentView.Warning: WrapperBadgeTransparentWarningViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentWarning.asInteractive(),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(),
            )
            endContentColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentWarningViewTerminate)

public val WrapperBadgeTransparentView.Dark: WrapperBadgeTransparentDarkViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceOnLightTransparentDeep.asInteractive(),
            )
            labelColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentDarkViewTerminate)

public val WrapperBadgeTransparentView.Light: WrapperBadgeTransparentLightViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceOnDarkTransparentSecondary.asInteractive(),
            )
            labelColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(),
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
        .shape(StylesSaluteTheme.shapes.roundS)
        .labelStyle(StylesSaluteTheme.typography.bodySNormal)
        .dimensions {
            height(28.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
            startContentMargin(4.0.dp)
            endContentMargin(4.0.dp)
            startPadding(11.0.dp)
            endPadding(11.0.dp)
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
        .shape(StylesSaluteTheme.shapes.roundXs)
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .dimensions {
            height(24.0.dp)
            startContentSize(12.0.dp)
            endContentSize(12.0.dp)
            startContentMargin(3.0.dp)
            endContentMargin(3.0.dp)
            startPadding(9.0.dp)
            endPadding(9.0.dp)
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
        .shape(StylesSaluteTheme.shapes.roundXs)
        .labelStyle(StylesSaluteTheme.typography.bodyXxsNormal)
        .dimensions {
            height(20.0.dp)
            startContentSize(12.0.dp)
            endContentSize(12.0.dp)
            startContentMargin(2.0.dp)
            endContentMargin(2.0.dp)
            startPadding(7.0.dp)
            endPadding(7.0.dp)
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
        .shape(StylesSaluteTheme.shapes.roundXxs)
        .labelStyle(StylesSaluteTheme.typography.bodyXxsNormal)
        .dimensions {
            height(16.0.dp)
            startContentSize(10.0.dp)
            endContentSize(10.0.dp)
            startContentMargin(2.0.dp)
            endContentMargin(2.0.dp)
            startPadding(4.0.dp)
            endPadding(4.0.dp)
        }
        .wrap(::WrapperBadgeTransparentXs)

public val WrapperBadgeTransparentXs.Pilled: WrapperBadgeTransparentXsPilled
    @Composable
    @JvmName("WrapperBadgeTransparentXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeTransparentXsPilled)
