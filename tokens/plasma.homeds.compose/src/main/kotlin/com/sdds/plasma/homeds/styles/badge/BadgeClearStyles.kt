// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.badge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeStyleBuilder
import com.sdds.compose.uikit.badgeBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperBadgeClear : BuilderWrapper<BadgeStyle, BadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperBadgeClearView : WrapperBadgeClear

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperBadgeClearTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeClear

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperBadgeClearL(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeClearView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperBadgeClearLPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeClearView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperBadgeClearM(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeClearView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperBadgeClearMPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeClearView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperBadgeClearS(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeClearView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperBadgeClearSPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeClearView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperBadgeClearXs(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeClearView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperBadgeClearXsPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeClearView

public val WrapperBadgeClearView.Default: WrapperBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeClearTerminate)

public val WrapperBadgeClearView.Accent: WrapperBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                PlasmaHomeDsTheme.colors.textDefaultAccent.asInteractive(),
            )
            startContentColor(
                PlasmaHomeDsTheme.colors.textDefaultAccent.asInteractive(),
            )
            endContentColor(
                PlasmaHomeDsTheme.colors.textDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeClearTerminate)

public val WrapperBadgeClearView.Negative: WrapperBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                PlasmaHomeDsTheme.colors.textDefaultNegative.asInteractive(),
            )
            startContentColor(
                PlasmaHomeDsTheme.colors.textDefaultNegative.asInteractive(),
            )
            endContentColor(
                PlasmaHomeDsTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeClearTerminate)

public val WrapperBadgeClearView.Positive: WrapperBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                PlasmaHomeDsTheme.colors.textDefaultPositive.asInteractive(),
            )
            startContentColor(
                PlasmaHomeDsTheme.colors.textDefaultPositive.asInteractive(),
            )
            endContentColor(
                PlasmaHomeDsTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeClearTerminate)

public val WrapperBadgeClearView.Warning: WrapperBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                PlasmaHomeDsTheme.colors.textDefaultWarning.asInteractive(),
            )
            startContentColor(
                PlasmaHomeDsTheme.colors.textDefaultWarning.asInteractive(),
            )
            endContentColor(
                PlasmaHomeDsTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeClearTerminate)

public val WrapperBadgeClearView.Dark: WrapperBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                PlasmaHomeDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaHomeDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaHomeDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeClearTerminate)

public val WrapperBadgeClearView.Light: WrapperBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                PlasmaHomeDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaHomeDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaHomeDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeClearTerminate)

private val BadgeStyleBuilder.invariantProps: BadgeStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }

public val BadgeClear.L: WrapperBadgeClearL
    @Composable
    @JvmName("WrapperBadgeClearL")
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaHomeDsTheme.shapes.roundS)
        .labelStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .dimensions {
            height(28.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
            startContentMargin(4.0.dp)
            endContentMargin(4.0.dp)
            startPadding(11.0.dp)
            endPadding(11.0.dp)
        }
        .wrap(::WrapperBadgeClearL)

public val WrapperBadgeClearL.Pilled: WrapperBadgeClearLPilled
    @Composable
    @JvmName("WrapperBadgeClearLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeClearLPilled)

public val BadgeClear.M: WrapperBadgeClearM
    @Composable
    @JvmName("WrapperBadgeClearM")
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaHomeDsTheme.shapes.roundXs)
        .labelStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .dimensions {
            height(24.0.dp)
            startContentSize(12.0.dp)
            endContentSize(12.0.dp)
            startContentMargin(3.0.dp)
            endContentMargin(3.0.dp)
            startPadding(9.0.dp)
            endPadding(9.0.dp)
        }
        .wrap(::WrapperBadgeClearM)

public val WrapperBadgeClearM.Pilled: WrapperBadgeClearMPilled
    @Composable
    @JvmName("WrapperBadgeClearMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeClearMPilled)

public val BadgeClear.S: WrapperBadgeClearS
    @Composable
    @JvmName("WrapperBadgeClearS")
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaHomeDsTheme.shapes.roundXs)
        .labelStyle(PlasmaHomeDsTheme.typography.bodyXxsNormal)
        .dimensions {
            height(20.0.dp)
            startContentSize(12.0.dp)
            endContentSize(12.0.dp)
            startContentMargin(2.0.dp)
            endContentMargin(2.0.dp)
            startPadding(7.0.dp)
            endPadding(7.0.dp)
        }
        .wrap(::WrapperBadgeClearS)

public val WrapperBadgeClearS.Pilled: WrapperBadgeClearSPilled
    @Composable
    @JvmName("WrapperBadgeClearSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeClearSPilled)

public val BadgeClear.Xs: WrapperBadgeClearXs
    @Composable
    @JvmName("WrapperBadgeClearXs")
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaHomeDsTheme.shapes.roundXxs)
        .labelStyle(PlasmaHomeDsTheme.typography.bodyXxsNormal)
        .dimensions {
            height(16.0.dp)
            startContentSize(10.0.dp)
            endContentSize(10.0.dp)
            startContentMargin(2.0.dp)
            endContentMargin(2.0.dp)
            startPadding(4.0.dp)
            endPadding(4.0.dp)
        }
        .wrap(::WrapperBadgeClearXs)

public val WrapperBadgeClearXs.Pilled: WrapperBadgeClearXsPilled
    @Composable
    @JvmName("WrapperBadgeClearXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeClearXsPilled)
