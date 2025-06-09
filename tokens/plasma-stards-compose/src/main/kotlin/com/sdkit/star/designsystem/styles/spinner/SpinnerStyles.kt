// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.spinner

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.SpinnerStrokeCap
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.SpinnerStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
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
public interface WrapperSpinner : BuilderWrapper<SpinnerStyle, SpinnerStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSpinnerView : WrapperSpinner

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperSpinnerTerminate(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinner

/**
 * Обертка для вариации Xxl
 */
@JvmInline
public value class WrapperSpinnerXxl(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSpinnerXl(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSpinnerL(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSpinnerM(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSpinnerS(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSpinnerXs(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

/**
 * Обертка для вариации Xxs
 */
@JvmInline
public value class WrapperSpinnerXxs(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

/**
 * Обертка для вариации Scalable
 */
@JvmInline
public value class WrapperSpinnerScalable(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

public val WrapperSpinnerView.Default: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                StarDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            endColor(
                StarDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Secondary: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                StarDsTheme.colors.surfaceDefaultSolidDefault.multiplyAlpha(0.32f).asInteractive(),
            )
            endColor(
                StarDsTheme.colors.surfaceDefaultTransparentPrimary.multiplyAlpha(0.32f).asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Accent: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                StarDsTheme.colors.surfaceDefaultAccentMain.asInteractive(),
            )
            endColor(
                StarDsTheme.colors.surfaceDefaultTransparentAccentMain.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Positive: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                StarDsTheme.colors.surfaceDefaultPositive.asInteractive(),
            )
            endColor(
                StarDsTheme.colors.surfaceDefaultTransparentPositive.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Negative: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                StarDsTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            endColor(
                StarDsTheme.colors.surfaceDefaultTransparentNegative.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Warning: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                StarDsTheme.colors.surfaceDefaultWarning.asInteractive(),
            )
            endColor(
                StarDsTheme.colors.surfaceDefaultTransparentWarning.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Info: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                StarDsTheme.colors.surfaceDefaultInfo.asInteractive(),
            )
            endColor(
                StarDsTheme.colors.surfaceDefaultTransparentInfo.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

private val SpinnerStyleBuilder.invariantProps: SpinnerStyleBuilder
    @Composable
    get() = this
        .angle(360.0f)
        .strokeCap(SpinnerStrokeCap.Round)
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }

public val Spinner.Xxl: WrapperSpinnerXxl
    @Composable
    @JvmName("WrapperSpinnerXxl")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(dimensionResource(R.dimen.sdkit_cmp_spinner_size_xxl))
            padding(dimensionResource(R.dimen.sdkit_cmp_spinner_padding_xxl))
        }
        .wrap(::WrapperSpinnerXxl)

public val Spinner.Xl: WrapperSpinnerXl
    @Composable
    @JvmName("WrapperSpinnerXl")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(dimensionResource(R.dimen.sdkit_cmp_spinner_size_xl))
            padding(dimensionResource(R.dimen.sdkit_cmp_spinner_padding_xl))
        }
        .wrap(::WrapperSpinnerXl)

public val Spinner.L: WrapperSpinnerL
    @Composable
    @JvmName("WrapperSpinnerL")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(dimensionResource(R.dimen.sdkit_cmp_spinner_size_l))
            padding(dimensionResource(R.dimen.sdkit_cmp_spinner_padding_l))
        }
        .wrap(::WrapperSpinnerL)

public val Spinner.M: WrapperSpinnerM
    @Composable
    @JvmName("WrapperSpinnerM")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(dimensionResource(R.dimen.sdkit_cmp_spinner_size_m))
            padding(dimensionResource(R.dimen.sdkit_cmp_spinner_padding_m))
        }
        .wrap(::WrapperSpinnerM)

public val Spinner.S: WrapperSpinnerS
    @Composable
    @JvmName("WrapperSpinnerS")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(dimensionResource(R.dimen.sdkit_cmp_spinner_size_s))
            padding(dimensionResource(R.dimen.sdkit_cmp_spinner_padding_s))
        }
        .wrap(::WrapperSpinnerS)

public val Spinner.Xs: WrapperSpinnerXs
    @Composable
    @JvmName("WrapperSpinnerXs")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(dimensionResource(R.dimen.sdkit_cmp_spinner_size_xs))
            padding(dimensionResource(R.dimen.sdkit_cmp_spinner_padding_xs))
        }
        .wrap(::WrapperSpinnerXs)

public val Spinner.Xxs: WrapperSpinnerXxs
    @Composable
    @JvmName("WrapperSpinnerXxs")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(dimensionResource(R.dimen.sdkit_cmp_spinner_size_xxs))
            padding(dimensionResource(R.dimen.sdkit_cmp_spinner_padding_xxs))
        }
        .wrap(::WrapperSpinnerXxs)

public val Spinner.Scalable: WrapperSpinnerScalable
    @Composable
    @JvmName("WrapperSpinnerScalable")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(dimensionResource(R.dimen.sdkit_cmp_spinner_size_scalable))
            padding(dimensionResource(R.dimen.sdkit_cmp_spinner_padding_scalable))
        }
        .wrap(::WrapperSpinnerScalable)
