// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.plasma.sd.service.styles.badge.icon

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeSolid
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.iconBadgeSolidBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperIconBadgeSolid : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

public interface WrapperIconBadgeSolidView : WrapperIconBadgeSolid

@JvmInline
public value class WrapperIconBadgeSolidDefaultViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolid

@JvmInline
public value class WrapperIconBadgeSolidAccentViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolid

@JvmInline
public value class WrapperIconBadgeSolidNegativeViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolid

@JvmInline
public value class WrapperIconBadgeSolidPositiveViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolid

@JvmInline
public value class WrapperIconBadgeSolidWarningViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolid

@JvmInline
public value class WrapperIconBadgeSolidDarkViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolid

@JvmInline
public value class WrapperIconBadgeSolidLightViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolid

@JvmInline
public value class WrapperIconBadgeSolidL(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

@JvmInline
public value class WrapperIconBadgeSolidLPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

@JvmInline
public value class WrapperIconBadgeSolidM(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

@JvmInline
public value class WrapperIconBadgeSolidMPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

@JvmInline
public value class WrapperIconBadgeSolidS(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

@JvmInline
public value class WrapperIconBadgeSolidSPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

@JvmInline
public value class WrapperIconBadgeSolidXs(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

@JvmInline
public value class WrapperIconBadgeSolidXsPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

public val WrapperIconBadgeSolidView.Default: WrapperIconBadgeSolidDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textInversePrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidDefaultViewTerminate)

public val WrapperIconBadgeSolidView.Accent: WrapperIconBadgeSolidAccentViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidAccentViewTerminate)

public val WrapperIconBadgeSolidView.Negative: WrapperIconBadgeSolidNegativeViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidNegativeViewTerminate)

public val WrapperIconBadgeSolidView.Positive: WrapperIconBadgeSolidPositiveViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultPositive.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidPositiveViewTerminate)

public val WrapperIconBadgeSolidView.Warning: WrapperIconBadgeSolidWarningViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultWarning.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidWarningViewTerminate)

public val WrapperIconBadgeSolidView.Dark: WrapperIconBadgeSolidDarkViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefault.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidDarkViewTerminate)

public val WrapperIconBadgeSolidView.Light: WrapperIconBadgeSolidLightViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textOnLightPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidLightViewTerminate)

private val IconBadgeStyleBuilder.invariantProps: IconBadgeStyleBuilder
    @Composable
    get() = this

public val IconBadgeSolid.L: WrapperIconBadgeSolidL
    @Composable
    @JvmName("WrapperIconBadgeSolidL")
    get() = BadgeStyle.iconBadgeSolidBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .dimensions {
            height(28.0.dp)
            startContentSize(16.0.dp)
            startPadding(6.0.dp)
            endPadding(6.0.dp)
        }
        .wrap(::WrapperIconBadgeSolidL)

public val WrapperIconBadgeSolidL.Pilled: WrapperIconBadgeSolidLPilled
    @Composable
    @JvmName("WrapperIconBadgeSolidLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeSolidLPilled)

public val IconBadgeSolid.M: WrapperIconBadgeSolidM
    @Composable
    @JvmName("WrapperIconBadgeSolidM")
    get() = BadgeStyle.iconBadgeSolidBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundXs)
        .dimensions {
            height(24.0.dp)
            startContentSize(12.0.dp)
            startPadding(6.0.dp)
            endPadding(6.0.dp)
        }
        .wrap(::WrapperIconBadgeSolidM)

public val WrapperIconBadgeSolidM.Pilled: WrapperIconBadgeSolidMPilled
    @Composable
    @JvmName("WrapperIconBadgeSolidMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeSolidMPilled)

public val IconBadgeSolid.S: WrapperIconBadgeSolidS
    @Composable
    @JvmName("WrapperIconBadgeSolidS")
    get() = BadgeStyle.iconBadgeSolidBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundXs)
        .dimensions {
            height(20.0.dp)
            startContentSize(12.0.dp)
            startPadding(4.0.dp)
            endPadding(4.0.dp)
        }
        .wrap(::WrapperIconBadgeSolidS)

public val WrapperIconBadgeSolidS.Pilled: WrapperIconBadgeSolidSPilled
    @Composable
    @JvmName("WrapperIconBadgeSolidSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeSolidSPilled)

public val IconBadgeSolid.Xs: WrapperIconBadgeSolidXs
    @Composable
    @JvmName("WrapperIconBadgeSolidXs")
    get() = BadgeStyle.iconBadgeSolidBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundXxs)
        .dimensions {
            height(16.0.dp)
            startContentSize(10.0.dp)
            startPadding(3.0.dp)
            endPadding(3.0.dp)
        }
        .wrap(::WrapperIconBadgeSolidXs)

public val WrapperIconBadgeSolidXs.Pilled: WrapperIconBadgeSolidXsPilled
    @Composable
    @JvmName("WrapperIconBadgeSolidXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeSolidXsPilled)
