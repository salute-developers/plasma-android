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
public interface WrapperSliderHorizontalLabelInner : BuilderWrapper<SliderStyle, SliderStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSliderHorizontalLabelInnerView : WrapperSliderHorizontalLabelInner

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerTerminate(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInner

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerL(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации LLimitLabelCenter
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerLLimitLabelCenter(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации LLimitLabelCenterThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerLLimitLabelCenterThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации LThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerLThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerM(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации MLimitLabelCenter
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerMLimitLabelCenter(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации MLimitLabelCenterThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerMLimitLabelCenterThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации MThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerMThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации SLimitLabelCenter
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerSLimitLabelCenter(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации SLimitLabelCenterThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerSLimitLabelCenterThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

/**
 * Обертка для вариации SThumbS
 */
@JvmInline
public value class WrapperSliderHorizontalLabelInnerSThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderHorizontalLabelInnerView

public val WrapperSliderHorizontalLabelInnerView.Default: WrapperSliderHorizontalLabelInnerTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsServTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
        }
        .wrap(::WrapperSliderHorizontalLabelInnerTerminate)

public val WrapperSliderHorizontalLabelInnerView.Accent: WrapperSliderHorizontalLabelInnerTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsServTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperSliderHorizontalLabelInnerTerminate)

public val WrapperSliderHorizontalLabelInnerView.Gradient:
    WrapperSliderHorizontalLabelInnerTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsServTheme.gradients.surfaceDefaultAccentGradient.asLayered().asStatefulValue(),
            )
        }
        .wrap(::WrapperSliderHorizontalLabelInnerTerminate)

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

public val SliderHorizontalLabelInner.L: WrapperSliderHorizontalLabelInnerL
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerL")
    get() = SliderStyle.builder(this)
        .invariantProps
        .dimensions {
            thumbSize(20.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelInnerL)

public val WrapperSliderHorizontalLabelInnerL.LimitLabelCenter:
    WrapperSliderHorizontalLabelInnerLLimitLabelCenter
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerLLimitLabelCenter")
    get() = builder
        .wrap(::WrapperSliderHorizontalLabelInnerLLimitLabelCenter)

public val WrapperSliderHorizontalLabelInnerLLimitLabelCenter.ThumbS:
    WrapperSliderHorizontalLabelInnerLLimitLabelCenterThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerLLimitLabelCenterThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelInnerLLimitLabelCenterThumbS)

public val WrapperSliderHorizontalLabelInnerL.ThumbS: WrapperSliderHorizontalLabelInnerLThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerLThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelInnerLThumbS)

public val SliderHorizontalLabelInner.M: WrapperSliderHorizontalLabelInnerM
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerM")
    get() = SliderStyle.builder(this)
        .invariantProps
        .dimensions {
            thumbSize(20.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelInnerM)

public val WrapperSliderHorizontalLabelInnerM.LimitLabelCenter:
    WrapperSliderHorizontalLabelInnerMLimitLabelCenter
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerMLimitLabelCenter")
    get() = builder
        .wrap(::WrapperSliderHorizontalLabelInnerMLimitLabelCenter)

public val WrapperSliderHorizontalLabelInnerMLimitLabelCenter.ThumbS:
    WrapperSliderHorizontalLabelInnerMLimitLabelCenterThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerMLimitLabelCenterThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelInnerMLimitLabelCenterThumbS)

public val WrapperSliderHorizontalLabelInnerM.ThumbS: WrapperSliderHorizontalLabelInnerMThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerMThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelInnerMThumbS)

public val SliderHorizontalLabelInner.S: WrapperSliderHorizontalLabelInnerS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerS")
    get() = SliderStyle.builder(this)
        .invariantProps
        .dimensions {
            thumbSize(20.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelInnerS)

public val WrapperSliderHorizontalLabelInnerS.LimitLabelCenter:
    WrapperSliderHorizontalLabelInnerSLimitLabelCenter
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerSLimitLabelCenter")
    get() = builder
        .wrap(::WrapperSliderHorizontalLabelInnerSLimitLabelCenter)

public val WrapperSliderHorizontalLabelInnerSLimitLabelCenter.ThumbS:
    WrapperSliderHorizontalLabelInnerSLimitLabelCenterThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerSLimitLabelCenterThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelInnerSLimitLabelCenterThumbS)

public val WrapperSliderHorizontalLabelInnerS.ThumbS: WrapperSliderHorizontalLabelInnerSThumbS
    @Composable
    @JvmName("WrapperSliderHorizontalLabelInnerSThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelInnerSThumbS)
