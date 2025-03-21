// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.counter

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.CounterStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
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
                StarDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            textColor(
                StarDsTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Accent: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultAccentMain.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultAccentMainActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultAccentMainHover,
                ),
            )
            textColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Positive: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultPositiveHover,
                ),
            )
            textColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Warning: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultWarningHover,
                ),
            )
            textColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Negative: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultNegativeHover,
                ),
            )
            textColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.Black: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceOnLightSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceOnLightSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceOnLightSolidDefaultHover,
                ),
            )
            textColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.White: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceOnDarkSolidDefaultHover,
                ),
            )
            textColor(
                StarDsTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnLightPrimaryHover,
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
        .textStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            minHeight(dimensionResource(R.dimen.sdkit_cmp_counter_minHeight_l))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_counter_minWidth_l))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_counter_paddingStart_l))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_counter_paddingEnd_l))
        }
        .wrap(::WrapperCounterL)

public val Counter.M: WrapperCounterM
    @Composable
    @JvmName("WrapperCounterM")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            minHeight(dimensionResource(R.dimen.sdkit_cmp_counter_minHeight_m))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_counter_minWidth_m))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_counter_paddingStart_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_counter_paddingEnd_m))
        }
        .wrap(::WrapperCounterM)

public val Counter.S: WrapperCounterS
    @Composable
    @JvmName("WrapperCounterS")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.bodyXxsNormal)
        .dimensions {
            minHeight(dimensionResource(R.dimen.sdkit_cmp_counter_minHeight_s))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_counter_minWidth_s))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_counter_paddingStart_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_counter_paddingEnd_s))
        }
        .wrap(::WrapperCounterS)

public val Counter.Xs: WrapperCounterXs
    @Composable
    @JvmName("WrapperCounterXs")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.bodyXxsNormal)
        .dimensions {
            minHeight(dimensionResource(R.dimen.sdkit_cmp_counter_minHeight_xs))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_counter_minWidth_xs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_counter_paddingStart_xs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_counter_paddingEnd_xs))
        }
        .wrap(::WrapperCounterXs)

public val Counter.Xxs: WrapperCounterXxs
    @Composable
    @JvmName("WrapperCounterXxs")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.bodyXxsNormal)
        .dimensions {
            minHeight(dimensionResource(R.dimen.sdkit_cmp_counter_minHeight_xxs))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_counter_minWidth_xxs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_counter_paddingStart_xxs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_counter_paddingEnd_xxs))
        }
        .wrap(::WrapperCounterXxs)
