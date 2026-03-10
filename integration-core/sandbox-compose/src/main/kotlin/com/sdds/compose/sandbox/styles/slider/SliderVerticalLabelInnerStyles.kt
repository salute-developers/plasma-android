// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.slider

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.styles.tooltip.S
import com.sdds.compose.sandbox.styles.tooltip.Tooltip
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.sandbox.theme.singleColor
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
                SddsSandboxTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            thumbStrokeColor(
                SolidColor(SddsSandboxTheme.colors.outlineDefaultSolidSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.outlineDefaultSolidDefault),
                ),
            )
        }
        .wrap(::WrapperSliderVerticalLabelInnerTerminate)

public val WrapperSliderVerticalLabelInnerView.Accent: WrapperSliderVerticalLabelInnerTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsSandboxTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
            thumbStrokeColor(
                SolidColor(SddsSandboxTheme.colors.outlineDefaultSolidSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceDefaultAccent),
                ),
            )
        }
        .wrap(::WrapperSliderVerticalLabelInnerTerminate)

public val WrapperSliderVerticalLabelInnerView.Gradient: WrapperSliderVerticalLabelInnerTerminate
    @Composable
    get() = builder
        .colors {
            indicatorColor(
                SddsSandboxTheme.gradients.surfaceDefaultAccentGradient.asLayered().asStatefulValue(),
            )
            thumbStrokeColor(

                listOf(singleColor(SddsSandboxTheme.colors.outlineDefaultSolidSecondary)).asLayered().asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.gradients.surfaceDefaultAccentGradient.asLayered(),
                ),
            )
        }
        .wrap(::WrapperSliderVerticalLabelInnerTerminate)

private val SliderStyleBuilder.invariantProps: SliderStyleBuilder
    @Composable
    get() = this
        .tooltipStyle(Tooltip.S.style())
        .orientation(SliderOrientation.Vertical)
        .alignment(SliderAlignment.Center)
        .limitLabelAlignment(LimitLabelAlignment.Center)
        .valuePlacement(ValuePlacement.End)
        .shape(CircleShape)
        .indicatorShape(CircleShape)
        .thumbShape(CircleShape)
        .colors {
            thumbColor(
                SddsSandboxTheme.colors.surfaceOnLightSolidCard.asInteractive(),
            )
            trackColor(
                SddsSandboxTheme.colors.surfaceDefaultSolidTertiary.asInteractive(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
            titleColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(),
            )
            limitLabelColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(),
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
        .titleStyle(SddsSandboxTheme.typography.bodyLNormal)
        .limitLabelStyle(SddsSandboxTheme.typography.bodySNormal)
        .titleAlignment(TitleAlignment.Start)
        .labelAlignment(LabelAlignment.Top)
        .slideDirection(SlideDirection.Normal)
        .dimensions {
            thumbSize(20.0.dp)
            iconSize(24.0.dp)
            labelMargin(16.0.dp)
            limitLabelMargin(12.0.dp)
            titleMargin(4.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerL)

public val WrapperSliderVerticalLabelInnerL.LabelEnd: WrapperSliderVerticalLabelInnerLLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerLLabelEnd")
    get() = builder
        .titleAlignment(TitleAlignment.End)
        .labelAlignment(LabelAlignment.Bottom)
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
        .titleStyle(SddsSandboxTheme.typography.bodyMNormal)
        .limitLabelStyle(SddsSandboxTheme.typography.bodySNormal)
        .titleAlignment(TitleAlignment.Start)
        .labelAlignment(LabelAlignment.Top)
        .slideDirection(SlideDirection.Normal)
        .dimensions {
            thumbSize(20.0.dp)
            iconSize(24.0.dp)
            labelMargin(12.0.dp)
            limitLabelMargin(10.0.dp)
            titleMargin(4.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerM)

public val WrapperSliderVerticalLabelInnerM.LabelEnd: WrapperSliderVerticalLabelInnerMLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerMLabelEnd")
    get() = builder
        .titleAlignment(TitleAlignment.End)
        .labelAlignment(LabelAlignment.Bottom)
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
        .titleStyle(SddsSandboxTheme.typography.bodySNormal)
        .limitLabelStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .titleAlignment(TitleAlignment.Start)
        .labelAlignment(LabelAlignment.Top)
        .slideDirection(SlideDirection.Normal)
        .dimensions {
            thumbSize(20.0.dp)
            iconSize(16.0.dp)
            labelMargin(10.0.dp)
            limitLabelMargin(8.0.dp)
            titleMargin(4.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelInnerS)

public val WrapperSliderVerticalLabelInnerS.LabelEnd: WrapperSliderVerticalLabelInnerSLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelInnerSLabelEnd")
    get() = builder
        .titleAlignment(TitleAlignment.End)
        .labelAlignment(LabelAlignment.Bottom)
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
