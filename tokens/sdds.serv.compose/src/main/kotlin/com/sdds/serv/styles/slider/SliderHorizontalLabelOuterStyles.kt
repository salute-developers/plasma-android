// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.slider

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.LabelAlignment
import com.sdds.compose.uikit.LimitLabelAlignment
import com.sdds.compose.uikit.SlideDirection
import com.sdds.compose.uikit.SliderAlignment
import com.sdds.compose.uikit.SliderOrientation
import com.sdds.compose.uikit.SliderStyle
import com.sdds.compose.uikit.SliderStyleBuilder
import com.sdds.compose.uikit.TitleAlignment
import com.sdds.compose.uikit.ValuePlacement
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.tooltip.S
import com.sdds.serv.styles.tooltip.Tooltip
import com.sdds.serv.theme.SddsServTheme
import com.sdds.serv.theme.singleColor
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
            thumbStrokeColor(
                SolidColor(SddsServTheme.colors.outlineDefaultSolidSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.outlineDefaultSolidDefault),
                ),
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
            thumbStrokeColor(
                SolidColor(SddsServTheme.colors.outlineDefaultSolidSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultAccent),
                ),
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
            thumbStrokeColor(

                listOf(singleColor(SddsServTheme.colors.outlineDefaultSolidSecondary)).asLayered().asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.gradients.surfaceDefaultAccentGradient.asLayered(),
                ),
            )
        }
        .wrap(::WrapperSliderHorizontalLabelOuterTerminate)

private val SliderStyleBuilder.invariantProps: SliderStyleBuilder
    @Composable
    get() = this
        .tooltipStyle(Tooltip.S.style())
        .orientation(SliderOrientation.Horizontal)
        .titleAlignment(TitleAlignment.End)
        .labelAlignment(LabelAlignment.Top)
        .slideDirection(SlideDirection.Normal)
        .valuePlacement(ValuePlacement.Top)
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
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            titleColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            limitLabelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
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
        .titleStyle(SddsServTheme.typography.bodyLNormal)
        .limitLabelStyle(SddsServTheme.typography.bodySNormal)
        .alignment(SliderAlignment.Start)
        .limitLabelAlignment(LimitLabelAlignment.End)
        .dimensions {
            thumbSize(20.0.dp)
            iconSize(24.0.dp)
            labelMargin(14.0.dp)
            limitLabelMargin(12.0.dp)
            titleMargin(4.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterL)

public val WrapperSliderHorizontalLabelOuterL.LimitLabelCenter:
    WrapperSliderHorizontalLabelOuterLLimitLabelCenter
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterLLimitLabelCenter")
    get() = builder
        .limitLabelAlignment(LimitLabelAlignment.Center)
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
        .titleStyle(SddsServTheme.typography.bodyMNormal)
        .limitLabelStyle(SddsServTheme.typography.bodySNormal)
        .alignment(SliderAlignment.Start)
        .limitLabelAlignment(LimitLabelAlignment.End)
        .dimensions {
            thumbSize(20.0.dp)
            iconSize(24.0.dp)
            labelMargin(12.0.dp)
            limitLabelMargin(10.0.dp)
            titleMargin(4.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterM)

public val WrapperSliderHorizontalLabelOuterM.LimitLabelCenter:
    WrapperSliderHorizontalLabelOuterMLimitLabelCenter
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterMLimitLabelCenter")
    get() = builder
        .limitLabelAlignment(LimitLabelAlignment.Center)
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
        .titleStyle(SddsServTheme.typography.bodySNormal)
        .limitLabelStyle(SddsServTheme.typography.bodyXsNormal)
        .alignment(SliderAlignment.Start)
        .limitLabelAlignment(LimitLabelAlignment.End)
        .dimensions {
            thumbSize(20.0.dp)
            iconSize(16.0.dp)
            labelMargin(10.0.dp)
            limitLabelMargin(8.0.dp)
            titleMargin(4.0.dp)
        }
        .wrap(::WrapperSliderHorizontalLabelOuterS)

public val WrapperSliderHorizontalLabelOuterS.LimitLabelCenter:
    WrapperSliderHorizontalLabelOuterSLimitLabelCenter
    @Composable
    @JvmName("WrapperSliderHorizontalLabelOuterSLimitLabelCenter")
    get() = builder
        .limitLabelAlignment(LimitLabelAlignment.Center)
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
