// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.spinner

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SpinnerStrokeCap
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.SpinnerStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
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

public val WrapperSpinnerView.Primary: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                SddsSbComTheme.colors.surfaceDefaultSolidPrimary.asInteractive(),
            )
            endColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Secondary: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
            endColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.GlobalWhite: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                SddsSbComTheme.colors.surfaceOnDarkSolidPrimary.asInteractive(),
            )
            endColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Accent: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
            endColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.Danger: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                SddsSbComTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            endColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
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
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }

public val Spinner.M: WrapperSpinnerM
    @Composable
    @JvmName("WrapperSpinnerM")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(40.0.dp)
        }
        .wrap(::WrapperSpinnerM)

public val Spinner.S: WrapperSpinnerS
    @Composable
    @JvmName("WrapperSpinnerS")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(32.0.dp)
        }
        .wrap(::WrapperSpinnerS)

public val Spinner.Xs: WrapperSpinnerXs
    @Composable
    @JvmName("WrapperSpinnerXs")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(24.0.dp)
        }
        .wrap(::WrapperSpinnerXs)

public val Spinner.Xxs: WrapperSpinnerXxs
    @Composable
    @JvmName("WrapperSpinnerXxs")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(16.0.dp)
        }
        .wrap(::WrapperSpinnerXxs)
