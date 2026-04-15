// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.indicator

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.IndicatorStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperIndicator : BuilderWrapper<IndicatorStyle, IndicatorStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperIndicatorTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

public val Indicator.StateSuccess: WrapperIndicatorTerminate
    @Composable
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(
                SddsSbComTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val Indicator.StateGlobalWhite: WrapperIndicatorTerminate
    @Composable
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultSolidPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val Indicator.StateMute: WrapperIndicatorTerminate
    @Composable
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(
                SddsSbComTheme.colors.textDefaultParagraph.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val Indicator.StateDanger: WrapperIndicatorTerminate
    @Composable
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(
                SddsSbComTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

public val Indicator.StateWarning: WrapperIndicatorTerminate
    @Composable
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(
                SddsSbComTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperIndicatorTerminate)

private val IndicatorStyleBuilder.invariantProps: IndicatorStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .dimensions {
            height(8.0.dp)
            width(8.0.dp)
        }
