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
import com.sdds.compose.uikit.IconBadgeSolid
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.iconBadgeSolidBuilder
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
public interface WrapperIconBadgeSolid : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconBadgeSolidView : WrapperIconBadgeSolid

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperIconBadgeSolidTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolid

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperIconBadgeSolidL(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperIconBadgeSolidLPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIconBadgeSolidM(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperIconBadgeSolidMPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperIconBadgeSolidS(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperIconBadgeSolidSPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperIconBadgeSolidXs(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperIconBadgeSolidXsPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

public val WrapperIconBadgeSolidView.Default: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textInversePrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Accent: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultAccentMain.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Negative: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Positive: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultPositive.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Warning: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultWarning.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Dark: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceOnLightSolidDefault.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Light: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
            )
            startContentColor(
                StarDsTheme.colors.textOnLightPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

private val IconBadgeStyleBuilder.invariantProps: IconBadgeStyleBuilder
    @Composable
    get() = this

public val IconBadgeSolid.L: WrapperIconBadgeSolidL
    @Composable
    @JvmName("WrapperIconBadgeSolidL")
    get() = BadgeStyle.iconBadgeSolidBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_height_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_startContentSize_l))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_startPadding_l))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_endPadding_l))
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
        .shape(StarDsTheme.shapes.roundXs)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_height_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_startContentSize_m))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_startPadding_m))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_endPadding_m))
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
        .shape(StarDsTheme.shapes.roundXs)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_height_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_startContentSize_s))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_startPadding_s))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_endPadding_s))
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
        .shape(StarDsTheme.shapes.roundXxs)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_height_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_startContentSize_xs))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_startPadding_xs))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_solid_endPadding_xs))
        }
        .wrap(::WrapperIconBadgeSolidXs)

public val WrapperIconBadgeSolidXs.Pilled: WrapperIconBadgeSolidXsPilled
    @Composable
    @JvmName("WrapperIconBadgeSolidXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeSolidXsPilled)
