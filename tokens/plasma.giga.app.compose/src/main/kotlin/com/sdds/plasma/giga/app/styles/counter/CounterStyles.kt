// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.counter

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.CounterStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCounter : BuilderWrapper<CounterStyle, CounterStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperCounterView : WrapperCounter

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperCounterTerminate(
    public override val builder: CounterStyleBuilder,
) : WrapperCounter

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCounterL(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCounterM(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperCounterS(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperCounterXs(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

/**
 * Обертка для вариации Xxs
 */
@JvmInline
public value class WrapperCounterXxs(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

public val WrapperCounterView.Default: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Accent: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Positive: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultPositiveHover,
                ),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Warning: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultWarningHover,
                ),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Negative: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultNegativeHover,
                ),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Black: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceOnLightSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceOnLightSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceOnLightSolidDefaultHover,
                ),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.White: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceOnDarkSolidDefaultHover,
                ),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnLightPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

private val CounterStyleBuilder.invariantProps: CounterStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)

public val Counter.L: WrapperCounterL
    @Composable
    @JvmName("WrapperCounterL")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .dimensions {
            minHeight(28.0.dp)
            minWidth(28.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(10.0.dp)
        }
        .wrap(::WrapperCounterL)

public val Counter.M: WrapperCounterM
    @Composable
    @JvmName("WrapperCounterM")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .dimensions {
            minHeight(24.0.dp)
            minWidth(24.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
        }
        .wrap(::WrapperCounterM)

public val Counter.S: WrapperCounterS
    @Composable
    @JvmName("WrapperCounterS")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaGigaAppTheme.typography.bodyXxsNormal)
        .dimensions {
            minHeight(20.0.dp)
            minWidth(20.0.dp)
            paddingStart(6.0.dp)
            paddingEnd(6.0.dp)
        }
        .wrap(::WrapperCounterS)

public val Counter.Xs: WrapperCounterXs
    @Composable
    @JvmName("WrapperCounterXs")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaGigaAppTheme.typography.bodyXxsNormal)
        .dimensions {
            minHeight(16.0.dp)
            minWidth(16.0.dp)
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
        }
        .wrap(::WrapperCounterXs)

public val Counter.Xxs: WrapperCounterXxs
    @Composable
    @JvmName("WrapperCounterXxs")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaGigaAppTheme.typography.bodyXxsNormal)
        .dimensions {
            minHeight(12.0.dp)
            minWidth(12.0.dp)
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
        }
        .wrap(::WrapperCounterXxs)
