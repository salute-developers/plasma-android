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
 * Обертка для вариации Size40
 */
@JvmInline
public value class WrapperSpinnerSize40(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

/**
 * Обертка для вариации Size32
 */
@JvmInline
public value class WrapperSpinnerSize32(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

/**
 * Обертка для вариации Size24
 */
@JvmInline
public value class WrapperSpinnerSize24(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

/**
 * Обертка для вариации Size16
 */
@JvmInline
public value class WrapperSpinnerSize16(
    public override val builder: SpinnerStyleBuilder,
) : WrapperSpinnerView

public val WrapperSpinnerView.ModeColorPrimary: WrapperSpinnerTerminate
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

public val WrapperSpinnerView.ModeColorSecondary: WrapperSpinnerTerminate
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

public val WrapperSpinnerView.ModeColorGlobalWhite: WrapperSpinnerTerminate
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

public val WrapperSpinnerView.ModeColorAccent: WrapperSpinnerTerminate
    @Composable
    get() = builder
        .colors {
            startColor(
                SddsSbComTheme.colors.surfaceDefaultAccentPrimary.asInteractive(),
            )
            endColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .wrap(::WrapperSpinnerTerminate)

public val WrapperSpinnerView.ModeColorDanger: WrapperSpinnerTerminate
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

public val Spinner.Size40: WrapperSpinnerSize40
    @Composable
    @JvmName("WrapperSpinnerSize40")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(40.0.dp)
        }
        .wrap(::WrapperSpinnerSize40)

public val Spinner.Size32: WrapperSpinnerSize32
    @Composable
    @JvmName("WrapperSpinnerSize32")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(32.0.dp)
        }
        .wrap(::WrapperSpinnerSize32)

public val Spinner.Size24: WrapperSpinnerSize24
    @Composable
    @JvmName("WrapperSpinnerSize24")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(24.0.dp)
        }
        .wrap(::WrapperSpinnerSize24)

public val Spinner.Size16: WrapperSpinnerSize16
    @Composable
    @JvmName("WrapperSpinnerSize16")
    get() = SpinnerStyle.builder(this)
        .invariantProps
        .dimensions {
            size(16.0.dp)
        }
        .wrap(::WrapperSpinnerSize16)
