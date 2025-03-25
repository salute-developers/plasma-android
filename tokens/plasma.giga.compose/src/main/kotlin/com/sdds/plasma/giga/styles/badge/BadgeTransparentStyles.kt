// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.badge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeStyleBuilder
import com.sdds.compose.uikit.badgeBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperBadgeTransparent : BuilderWrapper<BadgeStyle, BadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperBadgeTransparentView : WrapperBadgeTransparent

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperBadgeTransparentTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparent

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperBadgeTransparentL(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperBadgeTransparentLPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperBadgeTransparentM(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperBadgeTransparentMPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperBadgeTransparentS(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperBadgeTransparentSPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperBadgeTransparentXs(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeTransparentView

/**
 * Обертка для вариации XsPilled
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
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Accent: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentAccent.asInteractive(),
            )
            labelColor(
                PlasmaGigaTheme.colors.textDefaultAccent.asInteractive(),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultAccent.asInteractive(),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Negative: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentNegative.asInteractive(),
            )
            labelColor(
                PlasmaGigaTheme.colors.textDefaultNegative.asInteractive(),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultNegative.asInteractive(),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Positive: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentPositive.asInteractive(),
            )
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPositive.asInteractive(),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultPositive.asInteractive(),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Warning: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentWarning.asInteractive(),
            )
            labelColor(
                PlasmaGigaTheme.colors.textDefaultWarning.asInteractive(),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textDefaultWarning.asInteractive(),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Dark: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceOnLightTransparentDeep.asInteractive(),
            )
            labelColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Light: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceOnDarkTransparentSecondary.asInteractive(),
            )
            labelColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeTransparentTerminate)

private val BadgeStyleBuilder.invariantProps: BadgeStyleBuilder
    @Composable
    get() = this

public val BadgeTransparent.L: WrapperBadgeTransparentL
    @Composable
    @JvmName("WrapperBadgeTransparentL")
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundS)
        .labelStyle(PlasmaGigaTheme.typography.bodySNormal)
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
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundXs)
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
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
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundXs)
        .labelStyle(PlasmaGigaTheme.typography.bodyXxsNormal)
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
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundXxs)
        .labelStyle(PlasmaGigaTheme.typography.bodyXxsNormal)
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
