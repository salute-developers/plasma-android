// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.indicator

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.Indicator
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.IndicatorStyleBuilder
import com.sdds.compose.uikit.indicatorBuilder
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
public interface WrapperIndicator : BuilderWrapper<IndicatorStyle, IndicatorStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIndicatorView : WrapperIndicator

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperIndicatorTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperIndicatorL(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIndicatorM(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperIndicatorS(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

public val WrapperIndicatorView.Default: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.Accent: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultAccentMain.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.Inactive: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultSolidTertiary.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.Positive: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.Warning: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.Negative: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.Dark: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceOnLightTransparentDeep.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.Black: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceOnLightSolidDefault.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.White: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(
                StarDsTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

private val IndicatorStyleBuilder.invariantProps: IndicatorStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)

public val Indicator.L: WrapperIndicatorL
    @Composable
    @JvmName("WrapperIndicatorL")
    get() = IndicatorStyle.indicatorBuilder(this)
        .invariantProps
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_indicator_height_l))
            width(dimensionResource(R.dimen.sdkit_cmp_indicator_width_l))
        }
        .wrap(::WrapperIndicatorL)

public val Indicator.M: WrapperIndicatorM
    @Composable
    @JvmName("WrapperIndicatorM")
    get() = IndicatorStyle.indicatorBuilder(this)
        .invariantProps
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_indicator_height_m))
            width(dimensionResource(R.dimen.sdkit_cmp_indicator_width_m))
        }
        .wrap(::WrapperIndicatorM)

public val Indicator.S: WrapperIndicatorS
    @Composable
    @JvmName("WrapperIndicatorS")
    get() = IndicatorStyle.indicatorBuilder(this)
        .invariantProps
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_indicator_height_s))
            width(dimensionResource(R.dimen.sdkit_cmp_indicator_width_s))
        }
        .wrap(::WrapperIndicatorS)
