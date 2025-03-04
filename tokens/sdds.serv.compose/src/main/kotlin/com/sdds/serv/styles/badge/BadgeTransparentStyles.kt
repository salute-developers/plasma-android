// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.badge

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
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех врапперов этого стиля
 */
public interface WrapperBadgeTransparent : BuilderWrapper<BadgeStyle, BadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все врапперы вариаций корневого уровня
 * и врапперы их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим врапперам.
 */
public interface WrapperBadgeTransparentView : WrapperBadgeTransparent

/**
 * Терминальный враппер
 */
@JvmInline
public value class WrapperBadgeTransparentTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparent

/**
 * Враппер для вариации L
 */
@JvmInline
public value class WrapperBadgeTransparentL(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Враппер для вариации LPilled
 */
@JvmInline
public value class WrapperBadgeTransparentLPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Враппер для вариации M
 */
@JvmInline
public value class WrapperBadgeTransparentM(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Враппер для вариации MPilled
 */
@JvmInline
public value class WrapperBadgeTransparentMPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Враппер для вариации S
 */
@JvmInline
public value class WrapperBadgeTransparentS(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Враппер для вариации SPilled
 */
@JvmInline
public value class WrapperBadgeTransparentSPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Враппер для вариации Xs
 */
@JvmInline
public value class WrapperBadgeTransparentXs(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Враппер для вариации XsPilled
 */
@JvmInline
public value class WrapperBadgeTransparentXsPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

public val WrapperBadgeTransparentView.Default: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            endContentColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Accent: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentAccent.asInteractive(),
            )
            labelColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(),
            )
            endContentColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Negative: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentNegative.asInteractive(),
            )
            labelColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
            endContentColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Positive: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentPositive.asInteractive(),
            )
            labelColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
            endContentColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Warning: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultTransparentWarning.asInteractive(),
            )
            labelColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
            endContentColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Dark: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceOnLightTransparentDeep.asInteractive(),
            )
            labelColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Light: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceOnDarkTransparentSecondary.asInteractive(),
            )
            labelColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

private val BadgeStyleBuilder.invariantProps: BadgeStyleBuilder
    @Composable
    get() = this

public val BadgeTransparent.L: WrapperBadgeTransparentL
    @Composable
    @JvmName("WrapperBadgeTransparentL")
    get() = BadgeStyle.badgeTransparentBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .labelStyle(SddsServTheme.typography.bodySNormal)
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
        .shape(SddsServTheme.shapes.roundXs)
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
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
        .shape(SddsServTheme.shapes.roundXs)
        .labelStyle(SddsServTheme.typography.bodyXxsNormal)
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
        .shape(SddsServTheme.shapes.roundXxs)
        .labelStyle(SddsServTheme.typography.bodyXxsNormal)
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
