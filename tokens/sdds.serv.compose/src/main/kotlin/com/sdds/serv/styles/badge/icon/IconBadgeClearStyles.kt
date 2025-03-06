// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.badge.icon

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeClear
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.iconBadgeClearBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperIconBadgeClear : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

public interface WrapperIconBadgeClearView : WrapperIconBadgeClear

@JvmInline
public value class WrapperIconBadgeClearDefaultViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClear

@JvmInline
public value class WrapperIconBadgeClearAccentViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClear

@JvmInline
public value class WrapperIconBadgeClearNegativeViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClear

@JvmInline
public value class WrapperIconBadgeClearPositiveViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClear

@JvmInline
public value class WrapperIconBadgeClearWarningViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClear

@JvmInline
public value class WrapperIconBadgeClearDarkViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClear

@JvmInline
public value class WrapperIconBadgeClearLightViewTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClear

@JvmInline
public value class WrapperIconBadgeClearL(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

@JvmInline
public value class WrapperIconBadgeClearLPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

@JvmInline
public value class WrapperIconBadgeClearM(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

@JvmInline
public value class WrapperIconBadgeClearMPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

@JvmInline
public value class WrapperIconBadgeClearS(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

@JvmInline
public value class WrapperIconBadgeClearSPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

@JvmInline
public value class WrapperIconBadgeClearXs(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

@JvmInline
public value class WrapperIconBadgeClearXsPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

public val WrapperIconBadgeClearView.Default: WrapperIconBadgeClearDefaultViewTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearDefaultViewTerminate)

public val WrapperIconBadgeClearView.Accent: WrapperIconBadgeClearAccentViewTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearAccentViewTerminate)

public val WrapperIconBadgeClearView.Negative: WrapperIconBadgeClearNegativeViewTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearNegativeViewTerminate)

public val WrapperIconBadgeClearView.Positive: WrapperIconBadgeClearPositiveViewTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearPositiveViewTerminate)

public val WrapperIconBadgeClearView.Warning: WrapperIconBadgeClearWarningViewTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearWarningViewTerminate)

public val WrapperIconBadgeClearView.Dark: WrapperIconBadgeClearDarkViewTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearDarkViewTerminate)

public val WrapperIconBadgeClearView.Light: WrapperIconBadgeClearLightViewTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearLightViewTerminate)

private val IconBadgeStyleBuilder.invariantProps: IconBadgeStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }

public val IconBadgeClear.L: WrapperIconBadgeClearL
    @Composable
    @JvmName("WrapperIconBadgeClearL")
    get() = BadgeStyle.iconBadgeClearBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .dimensions {
            height(28.0.dp)
            startContentSize(16.0.dp)
            startPadding(6.0.dp)
            endPadding(6.0.dp)
        }
        .wrap(::WrapperIconBadgeClearL)

public val WrapperIconBadgeClearL.Pilled: WrapperIconBadgeClearLPilled
    @Composable
    @JvmName("WrapperIconBadgeClearLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeClearLPilled)

public val IconBadgeClear.M: WrapperIconBadgeClearM
    @Composable
    @JvmName("WrapperIconBadgeClearM")
    get() = BadgeStyle.iconBadgeClearBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXs)
        .dimensions {
            height(24.0.dp)
            startContentSize(12.0.dp)
            startPadding(6.0.dp)
            endPadding(6.0.dp)
        }
        .wrap(::WrapperIconBadgeClearM)

public val WrapperIconBadgeClearM.Pilled: WrapperIconBadgeClearMPilled
    @Composable
    @JvmName("WrapperIconBadgeClearMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeClearMPilled)

public val IconBadgeClear.S: WrapperIconBadgeClearS
    @Composable
    @JvmName("WrapperIconBadgeClearS")
    get() = BadgeStyle.iconBadgeClearBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXs)
        .dimensions {
            height(20.0.dp)
            startContentSize(12.0.dp)
            startPadding(4.0.dp)
            endPadding(4.0.dp)
        }
        .wrap(::WrapperIconBadgeClearS)

public val WrapperIconBadgeClearS.Pilled: WrapperIconBadgeClearSPilled
    @Composable
    @JvmName("WrapperIconBadgeClearSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeClearSPilled)

public val IconBadgeClear.Xs: WrapperIconBadgeClearXs
    @Composable
    @JvmName("WrapperIconBadgeClearXs")
    get() = BadgeStyle.iconBadgeClearBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXxs)
        .dimensions {
            height(16.0.dp)
            startContentSize(10.0.dp)
            startPadding(3.0.dp)
            endPadding(3.0.dp)
        }
        .wrap(::WrapperIconBadgeClearXs)

public val WrapperIconBadgeClearXs.Pilled: WrapperIconBadgeClearXsPilled
    @Composable
    @JvmName("WrapperIconBadgeClearXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeClearXsPilled)
