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
import com.sdds.compose.uikit.BadgeSolid
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeStyleBuilder
import com.sdds.compose.uikit.badgeSolidBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperBadgeSolid : BuilderWrapper<BadgeStyle, BadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperBadgeSolidView : WrapperBadgeSolid

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperBadgeSolidTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolid

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperBadgeSolidL(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperBadgeSolidLPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperBadgeSolidM(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperBadgeSolidMPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperBadgeSolidS(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperBadgeSolidSPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperBadgeSolidXs(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperBadgeSolidXsPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

public val WrapperBadgeSolidView.Default: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            labelColor(
                StarDsTheme.colors.textInversePrimary.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textInversePrimary.asInteractive(),
            )
            endContentColor(
                StarDsTheme.colors.textInversePrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Accent: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultAccentMain.asInteractive(),
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
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Negative: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultNegative.asInteractive(),
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
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Positive: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultPositive.asInteractive(),
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
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Warning: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultWarning.asInteractive(),
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
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Dark: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceOnLightSolidDefault.asInteractive(),
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
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Light: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
            )
            labelColor(
                StarDsTheme.colors.textOnLightPrimary.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnLightPrimary.asInteractive(),
            )
            endContentColor(
                StarDsTheme.colors.textOnLightPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidTerminate)

private val BadgeStyleBuilder.invariantProps: BadgeStyleBuilder
    @Composable
    get() = this

public val BadgeSolid.L: WrapperBadgeSolidL
    @Composable
    @JvmName("WrapperBadgeSolidL")
    get() = BadgeStyle.badgeSolidBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_solid_height_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startContentSize_l))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endContentSize_l))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startContentMargin_l))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endContentMargin_l))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startPadding_l))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endPadding_l))
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
        .shape(StarDsTheme.shapes.roundXs)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_solid_height_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startContentSize_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endContentSize_m))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startContentMargin_m))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endContentMargin_m))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startPadding_m))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endPadding_m))
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
        .shape(StarDsTheme.shapes.roundXs)
        .labelStyle(StarDsTheme.typography.bodyXxsNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_solid_height_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startContentSize_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endContentSize_s))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startContentMargin_s))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endContentMargin_s))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startPadding_s))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endPadding_s))
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
        .shape(StarDsTheme.shapes.roundXxs)
        .labelStyle(StarDsTheme.typography.bodyXxsNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_solid_height_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startContentSize_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endContentSize_xs))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startContentMargin_xs))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endContentMargin_xs))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_solid_startPadding_xs))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_solid_endPadding_xs))
        }
        .wrap(::WrapperBadgeSolidXs)

public val WrapperBadgeSolidXs.Pilled: WrapperBadgeSolidXsPilled
    @Composable
    @JvmName("WrapperBadgeSolidXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeSolidXsPilled)
