// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.badge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeStyleBuilder
import com.sdds.compose.uikit.badgeBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
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
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue())
            labelColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
            endContentColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Accent: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceDefaultTransparentAccentMain).asStatefulValue())
            labelColor(SolidColor(StarDsTheme.colors.textDefaultAccentMain).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textDefaultAccentMain).asStatefulValue())
            endContentColor(SolidColor(StarDsTheme.colors.textDefaultAccentMain).asStatefulValue())
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Negative: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue())
            labelColor(SolidColor(StarDsTheme.colors.textDefaultNegative).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textDefaultNegative).asStatefulValue())
            endContentColor(SolidColor(StarDsTheme.colors.textDefaultNegative).asStatefulValue())
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Positive: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue())
            labelColor(SolidColor(StarDsTheme.colors.textDefaultPositive).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textDefaultPositive).asStatefulValue())
            endContentColor(SolidColor(StarDsTheme.colors.textDefaultPositive).asStatefulValue())
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Warning: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue())
            labelColor(SolidColor(StarDsTheme.colors.textDefaultWarning).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textDefaultWarning).asStatefulValue())
            endContentColor(SolidColor(StarDsTheme.colors.textDefaultWarning).asStatefulValue())
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Dark: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceOnLightTransparentDeep).asStatefulValue())
            labelColor(SolidColor(StarDsTheme.colors.textOnDarkPrimary).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textOnDarkPrimary).asStatefulValue())
            endContentColor(SolidColor(StarDsTheme.colors.textOnDarkPrimary).asStatefulValue())
        }
        .wrap(::WrapperBadgeTransparentTerminate)

public val WrapperBadgeTransparentView.Light: WrapperBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceOnDarkTransparentSecondary).asStatefulValue())
            labelColor(SolidColor(StarDsTheme.colors.textOnDarkPrimary).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textOnDarkPrimary).asStatefulValue())
            endContentColor(SolidColor(StarDsTheme.colors.textOnDarkPrimary).asStatefulValue())
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
        .shape(StarDsTheme.shapes.roundS)
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_height_l))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_content_size_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_content_size_l))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_content_margin_l))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_content_margin_l))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_padding_l))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_padding_l))
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
        .shape(StarDsTheme.shapes.roundXs)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_height_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_content_size_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_content_size_m))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_content_margin_m))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_content_margin_m))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_padding_m))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_padding_m))
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
        .shape(StarDsTheme.shapes.roundXs)
        .labelStyle(StarDsTheme.typography.bodyXxsNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_height_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_content_size_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_content_size_s))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_content_margin_s))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_content_margin_s))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_padding_s))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_padding_s))
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
        .shape(StarDsTheme.shapes.roundXxs)
        .labelStyle(StarDsTheme.typography.bodyXxsNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_height_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_content_size_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_content_size_xs))
            startContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_content_margin_xs))
            endContentMargin(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_content_margin_xs))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_start_padding_xs))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_badge_transparent_end_padding_xs))
        }
        .wrap(::WrapperBadgeTransparentXs)

public val WrapperBadgeTransparentXs.Pilled: WrapperBadgeTransparentXsPilled
    @Composable
    @JvmName("WrapperBadgeTransparentXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeTransparentXsPilled)
