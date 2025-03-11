// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.segment.item

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.segmentItemBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.counter.Accent
import com.sdkit.star.designsystem.styles.counter.S
import com.sdkit.star.designsystem.styles.counter.Xs
import com.sdkit.star.designsystem.styles.counter.Xxs
import com.sdkit.star.designsystem.theme.StarDsTheme
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
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperSegmentItemXl(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

/**
 * Обертка для вариации XlPilled
 */
@JvmInline
public value class WrapperSegmentItemXlPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

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
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StarDsTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StarDsTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StarDsTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to StarDsTheme.colors.textDefaultSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StarDsTheme.colors.textDefaultSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StarDsTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to StarDsTheme.colors.surfaceDefaultSolidDefault,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StarDsTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StarDsTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StarDsTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StarDsTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StarDsTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StarDsTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StarDsTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StarDsTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

public val WrapperSegmentItemView.Secondary: WrapperSegmentItemTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StarDsTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to StarDsTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StarDsTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StarDsTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to StarDsTheme.colors.surfaceDefaultTransparentCard,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to StarDsTheme.colors.surfaceDefaultTransparentCardActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StarDsTheme.colors.surfaceDefaultTransparentCardHover,
                ),
            )
            startContentColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                ),
            )
            endContentColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to StarDsTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemTerminate)

private val SegmentItemStyleBuilder.invariantProps: SegmentItemStyleBuilder
    @Composable
    get() = this

public val SegmentItem.Xl: WrapperSegmentItemXl
    @Composable
    @JvmName("WrapperSegmentItemXl")
    get() = SegmentItemStyle.segmentItemBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundL.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_segment_item_shapeAdjustment_xl),
            ),
        )
        .labelStyle(StarDsTheme.typography.bodyLBold)
        .valueStyle(StarDsTheme.typography.bodyLBold)
        .dimensions {
            minWidth(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_width_xl))
            minHeight(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_height_xl))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_start_xl))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_end_xl))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_segment_item_start_content_size_xl))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_segment_item_end_content_size_xl))
            valueMargin(dimensionResource(R.dimen.sdkit_cmp_segment_item_value_margin_xl))
        }
        .counterStyle(Counter.S.Accent.style())
        .wrap(::WrapperSegmentItemXl)

public val WrapperSegmentItemXl.Pilled: WrapperSegmentItemXlPilled
    @Composable
    @JvmName("WrapperSegmentItemXlPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_width_xl_pilled))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_start_xl_pilled))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_end_xl_pilled))
        }
        .wrap(::WrapperSegmentItemXlPilled)

public val SegmentItem.L: WrapperSegmentItemL
    @Composable
    @JvmName("WrapperSegmentItemL")
    get() = SegmentItemStyle.segmentItemBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundL.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_segment_item_shapeAdjustment_l),
            ),
        )
        .labelStyle(StarDsTheme.typography.bodyLBold)
        .valueStyle(StarDsTheme.typography.bodyLBold)
        .dimensions {
            minWidth(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_width_l))
            minHeight(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_height_l))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_start_l))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_end_l))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_segment_item_start_content_size_l))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_segment_item_end_content_size_l))
            valueMargin(dimensionResource(R.dimen.sdkit_cmp_segment_item_value_margin_l))
        }
        .counterStyle(Counter.S.Accent.style())
        .wrap(::WrapperSegmentItemL)

public val WrapperSegmentItemL.Pilled: WrapperSegmentItemLPilled
    @Composable
    @JvmName("WrapperSegmentItemLPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_width_l_pilled))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_start_l_pilled))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_end_l_pilled))
        }
        .wrap(::WrapperSegmentItemLPilled)

public val SegmentItem.M: WrapperSegmentItemM
    @Composable
    @JvmName("WrapperSegmentItemM")
    get() = SegmentItemStyle.segmentItemBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_segment_item_shapeAdjustment_m),
            ),
        )
        .labelStyle(StarDsTheme.typography.bodyMBold)
        .valueStyle(StarDsTheme.typography.bodyMBold)
        .dimensions {
            minWidth(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_width_m))
            minHeight(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_height_m))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_start_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_end_m))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_segment_item_start_content_size_m))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_segment_item_end_content_size_m))
            valueMargin(dimensionResource(R.dimen.sdkit_cmp_segment_item_value_margin_m))
        }
        .counterStyle(Counter.Xs.Accent.style())
        .wrap(::WrapperSegmentItemM)

public val WrapperSegmentItemM.Pilled: WrapperSegmentItemMPilled
    @Composable
    @JvmName("WrapperSegmentItemMPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_width_m_pilled))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_start_m_pilled))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_end_m_pilled))
        }
        .wrap(::WrapperSegmentItemMPilled)

public val SegmentItem.S: WrapperSegmentItemS
    @Composable
    @JvmName("WrapperSegmentItemS")
    get() = SegmentItemStyle.segmentItemBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_segment_item_shapeAdjustment_s),
            ),
        )
        .labelStyle(StarDsTheme.typography.bodySBold)
        .valueStyle(StarDsTheme.typography.bodySBold)
        .dimensions {
            minWidth(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_width_s))
            minHeight(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_height_s))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_start_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_end_s))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_segment_item_start_content_size_s))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_segment_item_end_content_size_s))
            valueMargin(dimensionResource(R.dimen.sdkit_cmp_segment_item_value_margin_s))
        }
        .counterStyle(Counter.Xs.Accent.style())
        .wrap(::WrapperSegmentItemS)

public val WrapperSegmentItemS.Pilled: WrapperSegmentItemSPilled
    @Composable
    @JvmName("WrapperSegmentItemSPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_width_s_pilled))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_start_s_pilled))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_end_s_pilled))
        }
        .wrap(::WrapperSegmentItemSPilled)

public val SegmentItem.Xs: WrapperSegmentItemXs
    @Composable
    @JvmName("WrapperSegmentItemXs")
    get() = SegmentItemStyle.segmentItemBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundS.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_segment_item_shapeAdjustment_xs),
            ),
        )
        .labelStyle(StarDsTheme.typography.bodyXsBold)
        .valueStyle(StarDsTheme.typography.bodyXsBold)
        .dimensions {
            minWidth(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_width_xs))
            minHeight(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_height_xs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_start_xs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_end_xs))
            startContentSize(dimensionResource(R.dimen.sdkit_cmp_segment_item_start_content_size_xs))
            endContentSize(dimensionResource(R.dimen.sdkit_cmp_segment_item_end_content_size_xs))
            valueMargin(dimensionResource(R.dimen.sdkit_cmp_segment_item_value_margin_xs))
        }
        .counterStyle(Counter.Xxs.Accent.style())
        .wrap(::WrapperSegmentItemXs)

public val WrapperSegmentItemXs.Pilled: WrapperSegmentItemXsPilled
    @Composable
    @JvmName("WrapperSegmentItemXsPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(dimensionResource(R.dimen.sdkit_cmp_segment_item_min_width_xs_pilled))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_start_xs_pilled))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_segment_item_padding_end_xs_pilled))
        }
        .wrap(::WrapperSegmentItemXsPilled)
