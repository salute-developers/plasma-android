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
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperIndicator : BuilderWrapper<IndicatorStyle, IndicatorStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIndicatorView : WrapperIndicator

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperIndicatorTerminate(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicator

/**
 * Обертка для вариации Size14
 */
@JvmInline
public value class WrapperIndicatorSize14(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

/**
 * Обертка для вариации Size12
 */
@JvmInline
public value class WrapperIndicatorSize12(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

/**
 * Обертка для вариации Size10
 */
@JvmInline
public value class WrapperIndicatorSize10(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

/**
 * Обертка для вариации Size8
 */
@JvmInline
public value class WrapperIndicatorSize8(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

/**
 * Обертка для вариации Size6
 */
@JvmInline
public value class WrapperIndicatorSize6(
    public override val builder: IndicatorStyleBuilder,
) : WrapperIndicatorView

public val WrapperIndicatorView.StateAccent: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(SolidColor(SddsSbComTheme.colors.textDefaultAccent).asStatefulValue())
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.StateGlobalWhite: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceOnLightSolidPrimary).asStatefulValue())
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.StateMute: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidDeep).asStatefulValue())
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.StateDanger: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue())
        }
        .wrap(::WrapperIndicatorTerminate)

public val WrapperIndicatorView.StateWarning: WrapperIndicatorTerminate
    @Composable
    get() = builder
        .color {
            backgroundColor(SolidColor(SddsSbComTheme.colors.textDefaultWarning).asStatefulValue())
        }
        .wrap(::WrapperIndicatorTerminate)

private val IndicatorStyleBuilder.invariantProps: IndicatorStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)

public val Indicator.Size14: WrapperIndicatorSize14
    @Composable
    @JvmName("WrapperIndicatorSize14")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(14.0.dp)
            width(14.0.dp)
        }
        .wrap(::WrapperIndicatorSize14)

public val Indicator.Size12: WrapperIndicatorSize12
    @Composable
    @JvmName("WrapperIndicatorSize12")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(12.0.dp)
            width(12.0.dp)
        }
        .wrap(::WrapperIndicatorSize12)

public val Indicator.Size10: WrapperIndicatorSize10
    @Composable
    @JvmName("WrapperIndicatorSize10")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(10.0.dp)
            width(10.0.dp)
        }
        .wrap(::WrapperIndicatorSize10)

public val Indicator.Size8: WrapperIndicatorSize8
    @Composable
    @JvmName("WrapperIndicatorSize8")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(8.0.dp)
            width(8.0.dp)
        }
        .wrap(::WrapperIndicatorSize8)

public val Indicator.Size6: WrapperIndicatorSize6
    @Composable
    @JvmName("WrapperIndicatorSize6")
    get() = IndicatorStyle.builder(this)
        .invariantProps
        .dimensions {
            height(6.0.dp)
            width(6.0.dp)
        }
        .wrap(::WrapperIndicatorSize6)
