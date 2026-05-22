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
 * Обертка для вариации Mute
 */
@JvmInline
public value class WrapperCounterMute(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterView

/**
 * Интерфейс, который реализуют все обертки вариации danger
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperCounterDangerView : WrapperCounterView

/**
 * Обертка для вариации Danger
 */
@JvmInline
public value class WrapperCounterDanger(
    public override val builder: CounterStyleBuilder,
) : WrapperCounterDangerView

public val WrapperCounterView.MuteNo: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
            textColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterView.MuteYes: WrapperCounterTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.textDefaultParagraph.asInteractive(),
            )
            textColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(),
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

public val Counter.Mute: WrapperCounterMute
    @Composable
    @JvmName("WrapperCounterMute")
    get() = CounterStyle.builder(this)
        .invariantProps
        .wrap(::WrapperCounterMute)

public val WrapperCounterDangerView.MuteNo: WrapperCounterTerminate
    @Composable
    @JvmName("WrapperCounterDangerViewMuteNo")
    get() = builder
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            textColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val WrapperCounterDangerView.MuteYes: WrapperCounterTerminate
    @Composable
    @JvmName("WrapperCounterDangerViewMuteYes")
    get() = builder
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.textDefaultParagraph.asInteractive(),
            )
            textColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val Counter.Danger: WrapperCounterDanger
    @Composable
    @JvmName("WrapperCounterDanger")
    get() = CounterStyle.builder(this)
        .invariantProps
        .wrap(::WrapperCounterDanger)
