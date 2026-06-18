// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.indicator

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.IndicatorStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
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
            backgroundColor(SolidColor(SddsSbComTheme.colors.textDefaultPositive).asStatefulValue())
        }
        .wrap(::WrapperIndicatorTerminate)

public val Indicator.StateGlobalWhite: WrapperIndicatorTerminate
    @Composable
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimary).asStatefulValue())
        }
        .wrap(::WrapperIndicatorTerminate)

public val Indicator.StateMute: WrapperIndicatorTerminate
    @Composable
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(SolidColor(SddsSbComTheme.colors.textDefaultParagraph).asStatefulValue())
        }
        .wrap(::WrapperIndicatorTerminate)

public val Indicator.StateDanger: WrapperIndicatorTerminate
    @Composable
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue())
        }
        .wrap(::WrapperIndicatorTerminate)

public val Indicator.StateWarning: WrapperIndicatorTerminate
    @Composable
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .color {
            backgroundColor(SolidColor(SddsSbComTheme.colors.textDefaultWarning).asStatefulValue())
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
