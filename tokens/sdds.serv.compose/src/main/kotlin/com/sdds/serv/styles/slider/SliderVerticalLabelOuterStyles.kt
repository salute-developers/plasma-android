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
public interface WrapperSliderVerticalLabelOuter : BuilderWrapper<SliderStyle, SliderStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSliderVerticalLabelOuterView : WrapperSliderVerticalLabelOuter

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterTerminate(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuter

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterL(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации LAlignmentEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterLAlignmentEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации LAlignmentEndLabelEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterLAlignmentEndLabelEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации LAlignmentEndLabelEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterLAlignmentEndLabelEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации LAlignmentEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterLAlignmentEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации LLabelEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterLLabelEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации LLabelEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterLLabelEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации LThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterLThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterM(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации MAlignmentEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterMAlignmentEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации MAlignmentEndLabelEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterMAlignmentEndLabelEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации MAlignmentEndLabelEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterMAlignmentEndLabelEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации MAlignmentEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterMAlignmentEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации MLabelEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterMLabelEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации MLabelEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterMLabelEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации MThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterMThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации SAlignmentEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterSAlignmentEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации SAlignmentEndLabelEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterSAlignmentEndLabelEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации SAlignmentEndLabelEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterSAlignmentEndLabelEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации SAlignmentEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterSAlignmentEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации SLabelEnd
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterSLabelEnd(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации SLabelEndThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterSLabelEndThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

/**
 * Обертка для вариации SThumbS
 */
@JvmInline
public value class WrapperSliderVerticalLabelOuterSThumbS(
    public override val builder: SliderStyleBuilder,
) : WrapperSliderVerticalLabelOuterView

public val WrapperSliderVerticalLabelOuterView.Default: WrapperSliderVerticalLabelOuterTerminate
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
        .wrap(::WrapperSliderVerticalLabelOuterTerminate)

public val WrapperSliderVerticalLabelOuterView.Accent: WrapperSliderVerticalLabelOuterTerminate
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
        .wrap(::WrapperSliderVerticalLabelOuterTerminate)

public val WrapperSliderVerticalLabelOuterView.Gradient: WrapperSliderVerticalLabelOuterTerminate
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
        .wrap(::WrapperSliderVerticalLabelOuterTerminate)

private val SliderStyleBuilder.invariantProps: SliderStyleBuilder
    @Composable
    get() = this
        .tooltipStyle(Tooltip.S.style())
        .orientation(SliderOrientation.Vertical)
        .valuePlacement(ValuePlacement.End)
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

public val SliderVerticalLabelOuter.L: WrapperSliderVerticalLabelOuterL
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterL")
    get() = SliderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodyLNormal)
        .limitLabelStyle(SddsServTheme.typography.bodySNormal)
        .titleAlignment(TitleAlignment.End)
        .labelAlignment(LabelAlignment.Top)
        .alignment(SliderAlignment.Start)
        .limitLabelAlignment(LimitLabelAlignment.End)
        .slideDirection(SlideDirection.Normal)
        .dimensions {
            thumbSize(20.0.dp)
            iconSize(24.0.dp)
            labelMargin(16.0.dp)
            limitLabelMargin(14.0.dp)
            titleMargin(4.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterL)

public val WrapperSliderVerticalLabelOuterL.AlignmentEnd:
    WrapperSliderVerticalLabelOuterLAlignmentEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterLAlignmentEnd")
    get() = builder
        .titleAlignment(TitleAlignment.Start)
        .alignment(SliderAlignment.End)
        .limitLabelAlignment(LimitLabelAlignment.Start)
        .wrap(::WrapperSliderVerticalLabelOuterLAlignmentEnd)

public val WrapperSliderVerticalLabelOuterLAlignmentEnd.LabelEnd:
    WrapperSliderVerticalLabelOuterLAlignmentEndLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterLAlignmentEndLabelEnd")
    get() = builder
        .labelAlignment(LabelAlignment.Bottom)
        .wrap(::WrapperSliderVerticalLabelOuterLAlignmentEndLabelEnd)

public val WrapperSliderVerticalLabelOuterLAlignmentEndLabelEnd.ThumbS:
    WrapperSliderVerticalLabelOuterLAlignmentEndLabelEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterLAlignmentEndLabelEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterLAlignmentEndLabelEndThumbS)

public val WrapperSliderVerticalLabelOuterLAlignmentEnd.ThumbS:
    WrapperSliderVerticalLabelOuterLAlignmentEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterLAlignmentEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterLAlignmentEndThumbS)

public val WrapperSliderVerticalLabelOuterL.LabelEnd: WrapperSliderVerticalLabelOuterLLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterLLabelEnd")
    get() = builder
        .labelAlignment(LabelAlignment.Bottom)
        .wrap(::WrapperSliderVerticalLabelOuterLLabelEnd)

public val WrapperSliderVerticalLabelOuterLLabelEnd.ThumbS:
    WrapperSliderVerticalLabelOuterLLabelEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterLLabelEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterLLabelEndThumbS)

public val WrapperSliderVerticalLabelOuterL.ThumbS: WrapperSliderVerticalLabelOuterLThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterLThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterLThumbS)

public val SliderVerticalLabelOuter.M: WrapperSliderVerticalLabelOuterM
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterM")
    get() = SliderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodyMNormal)
        .limitLabelStyle(SddsServTheme.typography.bodySNormal)
        .titleAlignment(TitleAlignment.End)
        .labelAlignment(LabelAlignment.Top)
        .alignment(SliderAlignment.Start)
        .limitLabelAlignment(LimitLabelAlignment.End)
        .slideDirection(SlideDirection.Normal)
        .dimensions {
            thumbSize(20.0.dp)
            iconSize(24.0.dp)
            labelMargin(12.0.dp)
            limitLabelMargin(14.0.dp)
            titleMargin(4.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterM)

public val WrapperSliderVerticalLabelOuterM.AlignmentEnd:
    WrapperSliderVerticalLabelOuterMAlignmentEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterMAlignmentEnd")
    get() = builder
        .titleAlignment(TitleAlignment.Start)
        .alignment(SliderAlignment.End)
        .limitLabelAlignment(LimitLabelAlignment.Start)
        .wrap(::WrapperSliderVerticalLabelOuterMAlignmentEnd)

public val WrapperSliderVerticalLabelOuterMAlignmentEnd.LabelEnd:
    WrapperSliderVerticalLabelOuterMAlignmentEndLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterMAlignmentEndLabelEnd")
    get() = builder
        .labelAlignment(LabelAlignment.Bottom)
        .wrap(::WrapperSliderVerticalLabelOuterMAlignmentEndLabelEnd)

public val WrapperSliderVerticalLabelOuterMAlignmentEndLabelEnd.ThumbS:
    WrapperSliderVerticalLabelOuterMAlignmentEndLabelEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterMAlignmentEndLabelEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterMAlignmentEndLabelEndThumbS)

public val WrapperSliderVerticalLabelOuterMAlignmentEnd.ThumbS:
    WrapperSliderVerticalLabelOuterMAlignmentEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterMAlignmentEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterMAlignmentEndThumbS)

public val WrapperSliderVerticalLabelOuterM.LabelEnd: WrapperSliderVerticalLabelOuterMLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterMLabelEnd")
    get() = builder
        .labelAlignment(LabelAlignment.Bottom)
        .wrap(::WrapperSliderVerticalLabelOuterMLabelEnd)

public val WrapperSliderVerticalLabelOuterMLabelEnd.ThumbS:
    WrapperSliderVerticalLabelOuterMLabelEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterMLabelEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterMLabelEndThumbS)

public val WrapperSliderVerticalLabelOuterM.ThumbS: WrapperSliderVerticalLabelOuterMThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterMThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterMThumbS)

public val SliderVerticalLabelOuter.S: WrapperSliderVerticalLabelOuterS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterS")
    get() = SliderStyle.builder(this)
        .invariantProps
        .titleStyle(SddsServTheme.typography.bodySNormal)
        .limitLabelStyle(SddsServTheme.typography.bodyXsNormal)
        .titleAlignment(TitleAlignment.End)
        .labelAlignment(LabelAlignment.Top)
        .alignment(SliderAlignment.Start)
        .limitLabelAlignment(LimitLabelAlignment.End)
        .slideDirection(SlideDirection.Normal)
        .dimensions {
            thumbSize(20.0.dp)
            iconSize(16.0.dp)
            labelMargin(10.0.dp)
            limitLabelMargin(10.0.dp)
            titleMargin(4.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterS)

public val WrapperSliderVerticalLabelOuterS.AlignmentEnd:
    WrapperSliderVerticalLabelOuterSAlignmentEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterSAlignmentEnd")
    get() = builder
        .titleAlignment(TitleAlignment.Start)
        .alignment(SliderAlignment.End)
        .limitLabelAlignment(LimitLabelAlignment.Start)
        .wrap(::WrapperSliderVerticalLabelOuterSAlignmentEnd)

public val WrapperSliderVerticalLabelOuterSAlignmentEnd.LabelEnd:
    WrapperSliderVerticalLabelOuterSAlignmentEndLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterSAlignmentEndLabelEnd")
    get() = builder
        .labelAlignment(LabelAlignment.Bottom)
        .wrap(::WrapperSliderVerticalLabelOuterSAlignmentEndLabelEnd)

public val WrapperSliderVerticalLabelOuterSAlignmentEndLabelEnd.ThumbS:
    WrapperSliderVerticalLabelOuterSAlignmentEndLabelEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterSAlignmentEndLabelEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterSAlignmentEndLabelEndThumbS)

public val WrapperSliderVerticalLabelOuterSAlignmentEnd.ThumbS:
    WrapperSliderVerticalLabelOuterSAlignmentEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterSAlignmentEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterSAlignmentEndThumbS)

public val WrapperSliderVerticalLabelOuterS.LabelEnd: WrapperSliderVerticalLabelOuterSLabelEnd
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterSLabelEnd")
    get() = builder
        .labelAlignment(LabelAlignment.Bottom)
        .wrap(::WrapperSliderVerticalLabelOuterSLabelEnd)

public val WrapperSliderVerticalLabelOuterSLabelEnd.ThumbS:
    WrapperSliderVerticalLabelOuterSLabelEndThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterSLabelEndThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterSLabelEndThumbS)

public val WrapperSliderVerticalLabelOuterS.ThumbS: WrapperSliderVerticalLabelOuterSThumbS
    @Composable
    @JvmName("WrapperSliderVerticalLabelOuterSThumbS")
    get() = builder
        .dimensions {
            thumbSize(16.0.dp)
        }
        .wrap(::WrapperSliderVerticalLabelOuterSThumbS)
