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

public val Counter.MuteNo: WrapperCounterTerminate
    @Composable
    get() = CounterStyle.builder(this)
        .invariantProps
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
            textColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperCounterTerminate)

public val Counter.MuteYes: WrapperCounterTerminate
    @Composable
    get() = CounterStyle.builder(this)
        .invariantProps
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
