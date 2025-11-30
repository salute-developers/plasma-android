// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.slider

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SliderStyle
import com.sdds.compose.uikit.SliderStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSliderHorizontalLabelOuter : BuilderWrapper<SliderStyle, SliderStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSliderHorizontalLabelOuterView : WrapperSliderHorizontalLabelOuter

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterTerminate(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuter

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterL(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации LLimitLabelCenter
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterLLimitLabelCenter(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации LLimitLabelCenterThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterLLimitLabelCenterThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации LThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterLThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterM(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации MLimitLabelCenter
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterMLimitLabelCenter(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации MLimitLabelCenterThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterMLimitLabelCenterThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации MThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterMThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации SLimitLabelCenter
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterSLimitLabelCenter(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации SLimitLabelCenterThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterSLimitLabelCenterThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

/**
 * Обертка для вариации SThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelOuterSThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelOuterView

public val WrapperSliderHorizontalLabelOuterView.Default: WrapperSliderHorizontalLabelOuterTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsServTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
        }
        .wrap(::WrapperSliderHorizontalLabelOuterTerminate)

public val WrapperSliderHorizontalLabelOuterView.Accent: WrapperSliderHorizontalLabelOuterTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsServTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperSliderHorizontalLabelOuterTerminate)

public val WrapperSliderHorizontalLabelOuterView.Gradient:
    WrapperSliderHorizontalLabelOuterTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsServTheme.gradients.surfaceDefaultAccentGradient.asLayered().asStatefulValue(),
            )
        }
        .wrap(::WrapperSliderHorizontalLabelOuterTerminate)

private val SliderStyleBuilder.invariantProps: SliderStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .indicatorShape(CircleShape)
        .thumbShape(CircleShape)
        .colors {
            thumbColor(
                SddsServTheme.colors.surfaceOnLightSolidCard.asInteractive(),
            )
            trackColor(
                SddsServTheme.colors.surfaceDefaultSolidTertiary.asInteractive(),
            )
        }
        .dimensions {
            trackThickness(4.0.dp)
            indicatorThickness(4.0.dp)
            thumbStrokeWidth(1.0.dp)
        }

public val SliderHorizontalLabelOuter.L: WrapperSliderHorizontalLabelOuterL
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterL")
    get() = SliderStyle.builder(this)
        .invariantProps
        .dimensions {
            thumbSize(20.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterL)

public val WrapperSliderHorizontalLabelOuterL.LimitLabelCenter:
    WrapperSliderHorizontalLabelOuterLLimitLabelCenter
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterLLimitLabelCenter")
    get() = builder
        .wrap(::WrapperSliderHorizontalLabelOuterLLimitLabelCenter)

public val WrapperSliderHorizontalLabelOuterLLimitLabelCenter.ThumbS:
    WrapperSliderHorizontalLabelOuterLLimitLabelCenterThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterLLimitLabelCenterThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterLLimitLabelCenterThumbS)

public val WrapperSliderHorizontalLabelOuterL.ThumbS: WrapperSliderHorizontalLabelOuterLThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterLThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterLThumbS)

public val SliderHorizontalLabelOuter.M: WrapperSliderHorizontalLabelOuterM
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterM")
    get() = SliderStyle.builder(this)
        .invariantProps
        .dimensions {
            thumbSize(20.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterM)

public val WrapperSliderHorizontalLabelOuterM.LimitLabelCenter:
    WrapperSliderHorizontalLabelOuterMLimitLabelCenter
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterMLimitLabelCenter")
    get() = builder
        .wrap(::WrapperSliderHorizontalLabelOuterMLimitLabelCenter)

public val WrapperSliderHorizontalLabelOuterMLimitLabelCenter.ThumbS:
    WrapperSliderHorizontalLabelOuterMLimitLabelCenterThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterMLimitLabelCenterThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterMLimitLabelCenterThumbS)

public val WrapperSliderHorizontalLabelOuterM.ThumbS: WrapperSliderHorizontalLabelOuterMThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterMThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterMThumbS)

public val SliderHorizontalLabelOuter.S: WrapperSliderHorizontalLabelOuterS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterS")
    get() = SliderStyle.builder(this)
        .invariantProps
        .dimensions {
            thumbSize(20.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterS)

public val WrapperSliderHorizontalLabelOuterS.LimitLabelCenter:
    WrapperSliderHorizontalLabelOuterSLimitLabelCenter
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterSLimitLabelCenter")
    get() = builder
        .wrap(::WrapperSliderHorizontalLabelOuterSLimitLabelCenter)

public val WrapperSliderHorizontalLabelOuterSLimitLabelCenter.ThumbS:
    WrapperSliderHorizontalLabelOuterSLimitLabelCenterThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterSLimitLabelCenterThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterSLimitLabelCenterThumbS)

public val WrapperSliderHorizontalLabelOuterS.ThumbS: WrapperSliderHorizontalLabelOuterSThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterSThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterSThumbS)
