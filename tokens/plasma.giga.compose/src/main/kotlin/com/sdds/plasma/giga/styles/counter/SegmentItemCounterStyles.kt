// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.counter

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.CounterStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSegmentItemCounter : BuilderWrapper<CounterStyle, CounterStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentItemCounterView : WrapperSegmentItemCounter

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperSegmentItemCounterTerminate(
    public override val builder: CounterStyleBuilder,
) : WrapperSegmentItemCounter

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSegmentItemCounterL(
    public override val builder: CounterStyleBuilder,
) : WrapperSegmentItemCounterView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSegmentItemCounterM(
    public override val builder: CounterStyleBuilder,
) : WrapperSegmentItemCounterView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSegmentItemCounterS(
    public override val builder: CounterStyleBuilder,
) : WrapperSegmentItemCounterView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSegmentItemCounterXs(
    public override val builder: CounterStyleBuilder,
) : WrapperSegmentItemCounterView

/**
 * Обертка для вариации Xxs
 */
@JvmInline
public value class WrapperSegmentItemCounterXxs(
    public override val builder: CounterStyleBuilder,
) : WrapperSegmentItemCounterView

public val WrapperSegmentItemCounterView.Default: WrapperSegmentItemCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            textColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemCounterTerminate)

public val WrapperSegmentItemCounterView.Accent: WrapperSegmentItemCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.surfaceDefaultAccentHover,
                    setOf(InteractiveState.Selected) to
                        PlasmaGigaTheme.colors.surfaceOnDarkSolidDefault,
                ),
            )
            textColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                    setOf(InteractiveState.Selected) to
                        PlasmaGigaTheme.colors.textOnLightPrimary,
                ),
            )
        }
        .wrap(::WrapperSegmentItemCounterTerminate)

private val CounterStyleBuilder.invariantProps: CounterStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)

public val SegmentItemCounter.L: WrapperSegmentItemCounterL
    @Composable
    @JvmName("WrapperSegmentItemCounterL")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaGigaTheme.typography.bodySNormal)
        .dimensions {
            minWidth(28.0.dp)
            minHeight(28.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(10.0.dp)
        }
        .wrap(::WrapperSegmentItemCounterL)

public val SegmentItemCounter.M: WrapperSegmentItemCounterM
    @Composable
    @JvmName("WrapperSegmentItemCounterM")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .dimensions {
            minWidth(24.0.dp)
            minHeight(24.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
        }
        .wrap(::WrapperSegmentItemCounterM)

public val SegmentItemCounter.S: WrapperSegmentItemCounterS
    @Composable
    @JvmName("WrapperSegmentItemCounterS")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaGigaTheme.typography.bodyXxsNormal)
        .dimensions {
            minWidth(20.0.dp)
            minHeight(20.0.dp)
            paddingStart(6.0.dp)
            paddingEnd(6.0.dp)
        }
        .wrap(::WrapperSegmentItemCounterS)

public val SegmentItemCounter.Xs: WrapperSegmentItemCounterXs
    @Composable
    @JvmName("WrapperSegmentItemCounterXs")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaGigaTheme.typography.bodyXxsNormal)
        .dimensions {
            minWidth(16.0.dp)
            minHeight(16.0.dp)
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
        }
        .wrap(::WrapperSegmentItemCounterXs)

public val SegmentItemCounter.Xxs: WrapperSegmentItemCounterXxs
    @Composable
    @JvmName("WrapperSegmentItemCounterXxs")
    get() = CounterStyle.builder(this)
        .invariantProps
        .textStyle(PlasmaGigaTheme.typography.bodyXxsNormal)
        .dimensions {
            minWidth(12.0.dp)
            minHeight(12.0.dp)
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
        }
        .wrap(::WrapperSegmentItemCounterXxs)
