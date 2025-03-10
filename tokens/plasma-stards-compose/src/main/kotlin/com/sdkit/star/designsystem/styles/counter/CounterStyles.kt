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
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.CounterStyleBuilder
import com.sdds.compose.uikit.counterBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperCounter : BuilderWrapper<CounterStyle, CounterStyleBuilder>

public interface WrapperCounterView : WrapperCounter

@JvmInline
public value class WrapperCounterDefaultViewTerminate(
    public override val builder: CounterStyleBuilder,
) : WrapperCounter

@JvmInline
public value class WrapperCounterAccentViewTerminate(
    public override val builder: CounterStyleBuilder,
) : WrapperCounter

@JvmInline
public value class WrapperCounterPositiveViewTerminate(
    public override val builder: CounterStyleBuilder,
) : WrapperCounter

@JvmInline
public value class WrapperCounterWarningViewTerminate(
    public override val builder: CounterStyleBuilder,
) : WrapperCounter

@JvmInline
public value class WrapperCounterNegativeViewTerminate(
    public override val builder: CounterStyleBuilder,
) : WrapperCounter

@JvmInline
public value class WrapperCounterBlackViewTerminate(
    public override val builder: CounterStyleBuilder,
) : WrapperCounter

@JvmInline
public value class WrapperCounterWhiteViewTerminate(
    public override val builder: CounterStyleBuilder,
) : WrapperCounter

@JvmInline
public value class WrapperCounterL(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

@JvmInline
public value class WrapperCounterM(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

@JvmInline
public value class WrapperCounterS(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

@JvmInline
public value class WrapperCounterXs(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

@JvmInline
public value class WrapperCounterXxs(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

public val WrapperCounterView.Default: WrapperCounterDefaultViewTerminate
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
        .wrap(::WrapperCounterDefaultViewTerminate)

public val WrapperCounterView.Accent: WrapperCounterAccentViewTerminate
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
        .wrap(::WrapperCounterAccentViewTerminate)

public val WrapperCounterView.Positive: WrapperCounterPositiveViewTerminate
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
        .wrap(::WrapperCounterPositiveViewTerminate)

public val WrapperCounterView.Warning: WrapperCounterWarningViewTerminate
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
        .wrap(::WrapperCounterWarningViewTerminate)

public val WrapperCounterView.Negative: WrapperCounterNegativeViewTerminate
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
        .wrap(::WrapperCounterNegativeViewTerminate)

public val WrapperCounterView.Black: WrapperCounterBlackViewTerminate
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
        .wrap(::WrapperCounterBlackViewTerminate)

public val WrapperCounterView.White: WrapperCounterWhiteViewTerminate
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
        .wrap(::WrapperCounterWhiteViewTerminate)

private val CounterStyleBuilder.invariantProps: CounterStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)

public val Counter.L: WrapperCounterL
    @Composable
    @JvmName("WrapperCounterL")
    get() = CounterStyle.counterBuilder(this)
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
    get() = CounterStyle.counterBuilder(this)
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
    get() = CounterStyle.counterBuilder(this)
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
    get() = CounterStyle.counterBuilder(this)
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
    get() = CounterStyle.counterBuilder(this)
        .invariantProps
        .textStyle(StarDsTheme.typography.bodyXxsNormal)
        .dimensions {
            minHeight(dimensionResource(R.dimen.sdkit_cmp_counter_minHeight_xxs))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_counter_minWidth_xxs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_counter_paddingStart_xxs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_counter_paddingEnd_xxs))
        }
        .wrap(::WrapperCounterXxs)
