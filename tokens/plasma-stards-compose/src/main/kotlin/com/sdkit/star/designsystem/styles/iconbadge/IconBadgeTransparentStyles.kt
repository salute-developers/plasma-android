// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.iconbadge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.iconBadgeBuilder
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
public interface WrapperIconBadgeTransparent : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconBadgeTransparentView : WrapperIconBadgeTransparent

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperIconBadgeTransparentTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparent

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperIconBadgeTransparentL(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentLPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIconBadgeTransparentM(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentMPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperIconBadgeTransparentS(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentSPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperIconBadgeTransparentXs(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentXsPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

public val WrapperIconBadgeTransparentView.Default: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Accent: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceDefaultTransparentAccentMain).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textDefaultAccentMain).asStatefulValue())
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Negative: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textDefaultNegative).asStatefulValue())
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Positive: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceDefaultTransparentPositive).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textDefaultPositive).asStatefulValue())
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Warning: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceDefaultTransparentWarning).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textDefaultWarning).asStatefulValue())
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Dark: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceOnLightTransparentDeep).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textOnDarkPrimary).asStatefulValue())
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Light: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(SolidColor(StarDsTheme.colors.surfaceOnDarkTransparentSecondary).asStatefulValue())
            startContentColor(SolidColor(StarDsTheme.colors.textOnDarkPrimary).asStatefulValue())
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

private val IconBadgeStyleBuilder.invariantProps: IconBadgeStyleBuilder
    @Composable
    get() = this

public val IconBadgeTransparent.L: WrapperIconBadgeTransparentL
    @Composable
    @JvmName("WrapperIconBadgeTransparentL")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_height_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_start_content_size_l))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_start_padding_l))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_end_padding_l))
        }
        .wrap(::WrapperIconBadgeTransparentL)

public val WrapperIconBadgeTransparentL.Pilled: WrapperIconBadgeTransparentLPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentLPilled)

public val IconBadgeTransparent.M: WrapperIconBadgeTransparentM
    @Composable
    @JvmName("WrapperIconBadgeTransparentM")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXs)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_height_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_start_content_size_m))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_start_padding_m))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_end_padding_m))
        }
        .wrap(::WrapperIconBadgeTransparentM)

public val WrapperIconBadgeTransparentM.Pilled: WrapperIconBadgeTransparentMPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentMPilled)

public val IconBadgeTransparent.S: WrapperIconBadgeTransparentS
    @Composable
    @JvmName("WrapperIconBadgeTransparentS")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXs)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_height_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_start_content_size_s))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_start_padding_s))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_end_padding_s))
        }
        .wrap(::WrapperIconBadgeTransparentS)

public val WrapperIconBadgeTransparentS.Pilled: WrapperIconBadgeTransparentSPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentSPilled)

public val IconBadgeTransparent.Xs: WrapperIconBadgeTransparentXs
    @Composable
    @JvmName("WrapperIconBadgeTransparentXs")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXxs)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_height_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_start_content_size_xs))
            startPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_start_padding_xs))
            endPadding(dimensionResource(R.dimen.sdkit_cmp_icon_badge_transparent_end_padding_xs))
        }
        .wrap(::WrapperIconBadgeTransparentXs)

public val WrapperIconBadgeTransparentXs.Pilled: WrapperIconBadgeTransparentXsPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentXsPilled)
