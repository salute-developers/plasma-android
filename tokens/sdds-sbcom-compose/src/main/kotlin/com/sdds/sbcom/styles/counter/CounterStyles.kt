// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.counter

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.CounterStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCounter : BuilderWrapper<CounterStyle, CounterStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperCounterTerminate(
    public override val builder: CounterStyleBuilder,
) : WrapperCounter

public val Counter.Primary: WrapperCounterTerminate
    @Composable
    get() = CounterStyle.builder(this)
        .invariantProps
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            textColor(
                SddsSbComTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val Counter.Secondary: WrapperCounterTerminate
    @Composable
    get() = CounterStyle.builder(this)
        .invariantProps
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentTertiaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentTertiaryHover,
                ),
            )
            textColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val Counter.Accent: WrapperCounterTerminate
    @Composable
    get() = CounterStyle.builder(this)
        .invariantProps
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            textColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val Counter.Danger: WrapperCounterTerminate
    @Composable
    get() = CounterStyle.builder(this)
        .invariantProps
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultNegativeHover,
                ),
            )
            textColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperCounterTerminate)

private val CounterStyleBuilder.invariantProps: CounterStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .textStyle(SddsSbComTheme.typography.bodySNormal)
        .dimensions {
            minHeight(18.0.dp)
            minWidth(18.0.dp)
            paddingStart(5.0.dp)
            paddingEnd(5.0.dp)
        }
