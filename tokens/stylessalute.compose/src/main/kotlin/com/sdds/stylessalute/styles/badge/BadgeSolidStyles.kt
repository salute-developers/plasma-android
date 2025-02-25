// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.stylessalute.styles.badge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeSolid
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeStyleBuilder
import com.sdds.compose.uikit.badgeSolidBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperBadgeSolid : BuilderWrapper<BadgeStyle, BadgeStyleBuilder>

public interface WrapperBadgeSolidView : WrapperBadgeSolid

@JvmInline
public value class WrapperBadgeSolidDefaultViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolid

@JvmInline
public value class WrapperBadgeSolidAccentViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolid

@JvmInline
public value class WrapperBadgeSolidNegativeViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolid

@JvmInline
public value class WrapperBadgeSolidPositiveViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolid

@JvmInline
public value class WrapperBadgeSolidWarningViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolid

@JvmInline
public value class WrapperBadgeSolidDarkViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolid

@JvmInline
public value class WrapperBadgeSolidLightViewTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolid

@JvmInline
public value class WrapperBadgeSolidL(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

@JvmInline
public value class WrapperBadgeSolidLPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

@JvmInline
public value class WrapperBadgeSolidM(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

@JvmInline
public value class WrapperBadgeSolidMPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

@JvmInline
public value class WrapperBadgeSolidS(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

@JvmInline
public value class WrapperBadgeSolidSPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

@JvmInline
public value class WrapperBadgeSolidXs(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

@JvmInline
public value class WrapperBadgeSolidXsPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

public val WrapperBadgeSolidView.Default: WrapperBadgeSolidDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            labelColor(
                StylesSaluteTheme.colors.textInversePrimary.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textInversePrimary.asInteractive(),
            )
            endContentColor(
                StylesSaluteTheme.colors.textInversePrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidDefaultViewTerminate)

public val WrapperBadgeSolidView.Accent: WrapperBadgeSolidAccentViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultAccentMain.asInteractive(),
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
        .wrap(::WrapperBadgeSolidAccentViewTerminate)

public val WrapperBadgeSolidView.Negative: WrapperBadgeSolidNegativeViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultNegative.asInteractive(),
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
        .wrap(::WrapperBadgeSolidNegativeViewTerminate)

public val WrapperBadgeSolidView.Positive: WrapperBadgeSolidPositiveViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultPositive.asInteractive(),
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
        .wrap(::WrapperBadgeSolidPositiveViewTerminate)

public val WrapperBadgeSolidView.Warning: WrapperBadgeSolidWarningViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultWarning.asInteractive(),
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
        .wrap(::WrapperBadgeSolidWarningViewTerminate)

public val WrapperBadgeSolidView.Dark: WrapperBadgeSolidDarkViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceOnLightSolidDefault.asInteractive(),
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
        .wrap(::WrapperBadgeSolidDarkViewTerminate)

public val WrapperBadgeSolidView.Light: WrapperBadgeSolidLightViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
            )
            labelColor(
                StylesSaluteTheme.colors.textOnLightPrimary.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textOnLightPrimary.asInteractive(),
            )
            endContentColor(
                StylesSaluteTheme.colors.textOnLightPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidLightViewTerminate)

private val BadgeStyleBuilder.invariantProps: BadgeStyleBuilder
    @Composable
    get() = this

public val BadgeSolid.L: WrapperBadgeSolidL
    @Composable
    @JvmName("WrapperBadgeSolidL")
    get() = BadgeStyle.badgeSolidBuilder(this)
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
        .wrap(::WrapperBadgeSolidL)

public val WrapperBadgeSolidL.Pilled: WrapperBadgeSolidLPilled
    @Composable
    @JvmName("WrapperBadgeSolidLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeSolidLPilled)

public val BadgeSolid.M: WrapperBadgeSolidM
    @Composable
    @JvmName("WrapperBadgeSolidM")
    get() = BadgeStyle.badgeSolidBuilder(this)
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
        .wrap(::WrapperBadgeSolidM)

public val WrapperBadgeSolidM.Pilled: WrapperBadgeSolidMPilled
    @Composable
    @JvmName("WrapperBadgeSolidMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeSolidMPilled)

public val BadgeSolid.S: WrapperBadgeSolidS
    @Composable
    @JvmName("WrapperBadgeSolidS")
    get() = BadgeStyle.badgeSolidBuilder(this)
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
        .wrap(::WrapperBadgeSolidS)

public val WrapperBadgeSolidS.Pilled: WrapperBadgeSolidSPilled
    @Composable
    @JvmName("WrapperBadgeSolidSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeSolidSPilled)

public val BadgeSolid.Xs: WrapperBadgeSolidXs
    @Composable
    @JvmName("WrapperBadgeSolidXs")
    get() = BadgeStyle.badgeSolidBuilder(this)
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
        .wrap(::WrapperBadgeSolidXs)

public val WrapperBadgeSolidXs.Pilled: WrapperBadgeSolidXsPilled
    @Composable
    @JvmName("WrapperBadgeSolidXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeSolidXsPilled)
