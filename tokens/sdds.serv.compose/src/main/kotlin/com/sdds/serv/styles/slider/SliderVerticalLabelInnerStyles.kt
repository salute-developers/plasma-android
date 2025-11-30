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
public interface WrapperSliderVerticalLabelInner : BuilderWrapper<SliderStyle, SliderStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSliderVerticalLabelInnerView : WrapperSliderVerticalLabelInner

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerTerminate(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInner

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerL(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации LLabelEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerLLabelEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации LLabelEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerLLabelEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации LThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerLThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerM(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации MLabelEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerMLabelEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации MLabelEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerMLabelEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации MThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerMThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации SLabelEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerSLabelEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации SLabelEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerSLabelEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

/**
 * Обертка для вариации SThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelInnerSThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelInnerView

public val WrapperSliderVerticalLabelInnerView.Default: WrapperSliderVerticalLabelInnerTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsServTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
        }
        .wrap(::WrapperSliderVerticalLabelInnerTerminate)

public val WrapperSliderVerticalLabelInnerView.Accent: WrapperSliderVerticalLabelInnerTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsServTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperSliderVerticalLabelInnerTerminate)

public val WrapperSliderVerticalLabelInnerView.Gradient: WrapperSliderVerticalLabelInnerTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsServTheme.gradients.surfaceDefaultAccentGradient.asLayered().asStatefulValue(),
            )
        }
        .wrap(::WrapperSliderVerticalLabelInnerTerminate)

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

public val SliderVerticalLabelInner.L: WrapperSliderVerticalLabelInnerL
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerL")
    get() = SliderStyle.builder(this)
        .invariantProps
        .dimensions {
            thumbSize(20.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerL)

public val WrapperSliderVerticalLabelInnerL.LabelEnd: WrapperSliderVerticalLabelInnerLLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerLLabelEnd")
    get() = builder
        .wrap(::WrapperSliderVerticalLabelInnerLLabelEnd)

public val WrapperSliderVerticalLabelInnerLLabelEnd.ThumbS:
    WrapperSliderVerticalLabelInnerLLabelEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerLLabelEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerLLabelEndThumbS)

public val WrapperSliderVerticalLabelInnerL.ThumbS: WrapperSliderVerticalLabelInnerLThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerLThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerLThumbS)

public val SliderVerticalLabelInner.M: WrapperSliderVerticalLabelInnerM
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerM")
    get() = SliderStyle.builder(this)
        .invariantProps
        .dimensions {
            thumbSize(20.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerM)

public val WrapperSliderVerticalLabelInnerM.LabelEnd: WrapperSliderVerticalLabelInnerMLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerMLabelEnd")
    get() = builder
        .wrap(::WrapperSliderVerticalLabelInnerMLabelEnd)

public val WrapperSliderVerticalLabelInnerMLabelEnd.ThumbS:
    WrapperSliderVerticalLabelInnerMLabelEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerMLabelEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerMLabelEndThumbS)

public val WrapperSliderVerticalLabelInnerM.ThumbS: WrapperSliderVerticalLabelInnerMThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerMThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerMThumbS)

public val SliderVerticalLabelInner.S: WrapperSliderVerticalLabelInnerS
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerS")
    get() = SliderStyle.builder(this)
        .invariantProps
        .dimensions {
            thumbSize(20.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerS)

public val WrapperSliderVerticalLabelInnerS.LabelEnd: WrapperSliderVerticalLabelInnerSLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerSLabelEnd")
    get() = builder
        .wrap(::WrapperSliderVerticalLabelInnerSLabelEnd)

public val WrapperSliderVerticalLabelInnerSLabelEnd.ThumbS:
    WrapperSliderVerticalLabelInnerSLabelEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerSLabelEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerSLabelEndThumbS)

public val WrapperSliderVerticalLabelInnerS.ThumbS: WrapperSliderVerticalLabelInnerSThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerSThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerSThumbS)
