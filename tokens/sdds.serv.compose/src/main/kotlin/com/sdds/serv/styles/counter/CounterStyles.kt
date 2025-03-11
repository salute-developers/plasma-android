// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.counter

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
import com.sdds.serv.theme.SddsServTheme
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
                SddsServTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            textColor(
                SddsServTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterDefaultViewTerminate)

public val WrapperCounterView.Accent: WrapperCounterAccentViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            textColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterAccentViewTerminate)

public val WrapperCounterView.Positive: WrapperCounterPositiveViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceDefaultPositiveHover,
                ),
            )
            textColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterPositiveViewTerminate)

public val WrapperCounterView.Warning: WrapperCounterWarningViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceDefaultWarningHover,
                ),
            )
            textColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterWarningViewTerminate)

public val WrapperCounterView.Negative: WrapperCounterNegativeViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceDefaultNegativeHover,
                ),
            )
            textColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterNegativeViewTerminate)

public val WrapperCounterView.Black: WrapperCounterBlackViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceOnLightSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.surfaceOnLightSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceOnLightSolidDefaultHover,
                ),
            )
            textColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterBlackViewTerminate)

public val WrapperCounterView.White: WrapperCounterWhiteViewTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceOnDarkSolidDefaultHover,
                ),
            )
            textColor(
                SddsServTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textOnLightPrimaryHover,
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
        .textStyle(SddsServTheme.typography.bodySNormal)
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
        .textStyle(SddsServTheme.typography.bodyXsNormal)
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
        .textStyle(SddsServTheme.typography.bodyXxsNormal)
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
        .textStyle(SddsServTheme.typography.bodyXxsNormal)
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
        .textStyle(SddsServTheme.typography.bodyXxsNormal)
        .dimensions {
            minHeight(12.0.dp)
            minWidth(12.0.dp)
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
        }
        .wrap(::WrapperCounterXxs)
