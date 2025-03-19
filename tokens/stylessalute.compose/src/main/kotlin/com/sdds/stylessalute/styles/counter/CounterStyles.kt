// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.counter

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.CounterStyleBuilder
import com.sdds.compose.uikit.counterBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
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
                StylesSaluteTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            textColor(
                StylesSaluteTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Accent: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultAccentMain.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.surfaceDefaultAccentMainActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultAccentMainHover,
                ),
            )
            textColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Positive: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultPositiveHover,
                ),
            )
            textColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Warning: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultWarningHover,
                ),
            )
            textColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Negative: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultNegativeHover,
                ),
            )
            textColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Black: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceOnLightSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.surfaceOnLightSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceOnLightSolidDefaultHover,
                ),
            )
            textColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.White: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceOnDarkSolidDefaultHover,
                ),
            )
            textColor(
                StylesSaluteTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textOnLightPrimaryHover,
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
    get() = CounterStyle.counterBuilder(this)
        .invariantProps
        .textStyle(StylesSaluteTheme.typography.bodySNormal)
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
    get() = CounterStyle.counterBuilder(this)
        .invariantProps
        .textStyle(StylesSaluteTheme.typography.bodyXsNormal)
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
    get() = CounterStyle.counterBuilder(this)
        .invariantProps
        .textStyle(StylesSaluteTheme.typography.bodyXxsNormal)
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
    get() = CounterStyle.counterBuilder(this)
        .invariantProps
        .textStyle(StylesSaluteTheme.typography.bodyXxsNormal)
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
    get() = CounterStyle.counterBuilder(this)
        .invariantProps
        .textStyle(StylesSaluteTheme.typography.bodyXxsNormal)
        .dimensions {
            minHeight(12.0.dp)
            minWidth(12.0.dp)
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
        }
        .wrap(::WrapperCounterXxs)
