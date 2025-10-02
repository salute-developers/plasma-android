// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.spinner

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SpinnerStrokeCap
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.SpinnerStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
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
                PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            endColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Secondary: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefault.multiplyAlpha(0.32f).asInteractive(),
            )
            endColor(

                PlasmaHomeDsTheme.colors.surfaceDefaultTransparentPrimary.multiplyAlpha(0.32f).asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Accent: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
            endColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultTransparentAccent.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Positive: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultPositive.asInteractive(),
            )
            endColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultTransparentPositive.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Negative: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            endColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultTransparentNegative.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Warning: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultWarning.asInteractive(),
            )
            endColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultTransparentWarning.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Info: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultInfo.asInteractive(),
            )
            endColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultTransparentInfo.asInteractive(),
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
                PlasmaHomeDsTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }

public val Spinner.M: WrapperSpinnerM
    @Composable
    @JvmName("WrapperSpinnerM")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(48.0.dp)
            padding(4.0.dp)
        }
        .wrap(::WrapperSpinnerM)

public val Spinner.S: WrapperSpinnerS
    @Composable
    @JvmName("WrapperSpinnerS")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(36.0.dp)
            padding(3.0.dp)
        }
        .wrap(::WrapperSpinnerS)

public val Spinner.Xs: WrapperSpinnerXs
    @Composable
    @JvmName("WrapperSpinnerXs")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(24.0.dp)
            padding(2.0.dp)
        }
        .wrap(::WrapperSpinnerXs)

public val Spinner.Xxs: WrapperSpinnerXxs
    @Composable
    @JvmName("WrapperSpinnerXxs")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(16.0.dp)
            padding(1.0.dp)
        }
        .wrap(::WrapperSpinnerXxs)

public val Spinner.Scalable: WrapperSpinnerScalable
    @Composable
    @JvmName("WrapperSpinnerScalable")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(16.0.dp)
            padding(0.0.dp)
        }
        .wrap(::WrapperSpinnerScalable)
