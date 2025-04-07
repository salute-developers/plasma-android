// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.segmentitem

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.styles.counter.Accent
import com.sdds.stylessalute.styles.counter.Counter
import com.sdds.stylessalute.styles.counter.S
import com.sdds.stylessalute.styles.counter.Xs
import com.sdds.stylessalute.styles.counter.Xxs
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSegmentItem : BuilderWrapper<SegmentItemStyle, SegmentItemStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperSegmentItemView : WrapperSegmentItem

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperSegmentItemTerminate(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItem

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSegmentItemL(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperSegmentItemLPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSegmentItemM(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperSegmentItemMPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSegmentItemS(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperSegmentItemSPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSegmentItemXs(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperSegmentItemXsPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

public val WrapperSegmentItemView.Primary: WrapperSegmentItemTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StylesSaluteTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StylesSaluteTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StylesSaluteTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to StylesSaluteTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StylesSaluteTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StylesSaluteTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to StylesSaluteTheme.colors.surfaceDefaultSolidDefault,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StylesSaluteTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StylesSaluteTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StylesSaluteTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StylesSaluteTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StylesSaluteTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StylesSaluteTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StylesSaluteTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StylesSaluteTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemView.Secondary: WrapperSegmentItemTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StylesSaluteTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StylesSaluteTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to StylesSaluteTheme.colors.textDefaultSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StylesSaluteTheme.colors.textDefaultSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StylesSaluteTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentCard,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentCardActive,
                    setOf(InteractiveState.Selected, InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentCardHover,
                ),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StylesSaluteTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                ),
            )
            endContentColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StylesSaluteTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

private val SegmentItemStyleBuilder.invariantProps: SegmentItemStyleBuilder
    @Composable
    get() = this

public val SegmentItem.L: WrapperSegmentItemL
    @Composable
    @JvmName("WrapperSegmentItemL")
    get() = SegmentItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .labelStyle(StylesSaluteTheme.typography.bodyLBold)
        .valueStyle(StylesSaluteTheme.typography.bodyLBold)
        .dimensions {
            minWidth(102.0.dp)
            minHeight(56.0.dp)
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            valueMargin(6.0.dp)
        }
        .counterStyle(Counter.S.Accent.style())
        .wrap(::WrapperSegmentItemL)

public val WrapperSegmentItemL.Pilled: WrapperSegmentItemLPilled
    @Composable
    @JvmName("WrapperSegmentItemLPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(86.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
        }
        .wrap(::WrapperSegmentItemLPilled)

public val SegmentItem.M: WrapperSegmentItemM
    @Composable
    @JvmName("WrapperSegmentItemM")
    get() = SegmentItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = 0.0.dp))
        .labelStyle(StylesSaluteTheme.typography.bodyMBold)
        .valueStyle(StylesSaluteTheme.typography.bodyMBold)
        .dimensions {
            minWidth(88.0.dp)
            minHeight(48.0.dp)
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            valueMargin(4.0.dp)
        }
        .counterStyle(Counter.Xs.Accent.style())
        .wrap(::WrapperSegmentItemM)

public val WrapperSegmentItemM.Pilled: WrapperSegmentItemMPilled
    @Composable
    @JvmName("WrapperSegmentItemMPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(72.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
        }
        .wrap(::WrapperSegmentItemMPilled)

public val SegmentItem.S: WrapperSegmentItemS
    @Composable
    @JvmName("WrapperSegmentItemS")
    get() = SegmentItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .labelStyle(StylesSaluteTheme.typography.bodySBold)
        .valueStyle(StylesSaluteTheme.typography.bodySBold)
        .dimensions {
            minWidth(75.0.dp)
            minHeight(40.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            valueMargin(2.0.dp)
        }
        .counterStyle(Counter.Xs.Accent.style())
        .wrap(::WrapperSegmentItemS)

public val WrapperSegmentItemS.Pilled: WrapperSegmentItemSPilled
    @Composable
    @JvmName("WrapperSegmentItemSPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(59.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
        }
        .wrap(::WrapperSegmentItemSPilled)

public val SegmentItem.Xs: WrapperSegmentItemXs
    @Composable
    @JvmName("WrapperSegmentItemXs")
    get() = SegmentItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundS.adjustBy(all = 0.0.dp))
        .labelStyle(StylesSaluteTheme.typography.bodyXsBold)
        .valueStyle(StylesSaluteTheme.typography.bodyXsBold)
        .dimensions {
            minWidth(61.0.dp)
            minHeight(32.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
            valueMargin(2.0.dp)
        }
        .counterStyle(Counter.Xxs.Accent.style())
        .wrap(::WrapperSegmentItemXs)

public val WrapperSegmentItemXs.Pilled: WrapperSegmentItemXsPilled
    @Composable
    @JvmName("WrapperSegmentItemXsPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(53.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
        }
        .wrap(::WrapperSegmentItemXsPilled)
