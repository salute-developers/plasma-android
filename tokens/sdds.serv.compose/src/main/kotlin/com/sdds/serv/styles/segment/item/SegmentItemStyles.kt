// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.serv.styles.segment.item

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
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
import com.sdds.serv.styles.counter.Accent
import com.sdds.serv.styles.counter.S
import com.sdds.serv.styles.counter.Xs
import com.sdds.serv.styles.counter.Xxs
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperSegmentItem : BuilderWrapper<SegmentItemStyle, SegmentItemStyleBuilder>

public interface WrapperSegmentItemView : WrapperSegmentItem

@JvmInline
public value class WrapperSegmentItemPrimaryViewTerminate(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItem

@JvmInline
public value class WrapperSegmentItemSecondaryViewTerminate(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItem

@JvmInline
public value class WrapperSegmentItemAccentViewTerminate(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItem

@JvmInline
public value class WrapperSegmentItemXl(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

@JvmInline
public value class WrapperSegmentItemXlPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

@JvmInline
public value class WrapperSegmentItemL(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

@JvmInline
public value class WrapperSegmentItemLPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

@JvmInline
public value class WrapperSegmentItemM(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

@JvmInline
public value class WrapperSegmentItemMPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

@JvmInline
public value class WrapperSegmentItemS(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

@JvmInline
public value class WrapperSegmentItemSPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

@JvmInline
public value class WrapperSegmentItemXs(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

@JvmInline
public value class WrapperSegmentItemXsPilled(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItemView

public val WrapperSegmentItemView.Primary: WrapperSegmentItemPrimaryViewTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.surfaceDefaultSolidDefault,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textInversePrimaryHover,
                ),
            )
            endContentColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textInversePrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.textInversePrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemPrimaryViewTerminate)

public val WrapperSegmentItemView.Secondary: WrapperSegmentItemSecondaryViewTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.surfaceDefaultTransparentCard,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.surfaceDefaultTransparentCardActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.surfaceDefaultTransparentCardHover,
                ),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                ),
            )
            endContentColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textDefaultPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemSecondaryViewTerminate)

public val WrapperSegmentItemView.Accent: WrapperSegmentItemAccentViewTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textOnDarkPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            valueColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textOnDarkSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.textOnDarkSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.surfaceDefaultAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.surfaceDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            startContentColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textOnDarkPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            endContentColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textOnDarkPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperSegmentItemAccentViewTerminate)

private val SegmentItemStyleBuilder.invariantProps: SegmentItemStyleBuilder
    @Composable
    get() = this

public val SegmentItem.Xl: WrapperSegmentItemXl
    @Composable
    @JvmName("WrapperSegmentItemXl")
    get() = SegmentItemStyle.segmentItemBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = 0.0.dp))
        .labelStyle(SddsServTheme.typography.bodyLBold)
        .valueStyle(SddsServTheme.typography.bodyLBold)
        .dimensions {
            minWidth(110.0.dp)
            minHeight(64.0.dp)
            paddingStart(28.0.dp)
            paddingEnd(28.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            valueMargin(6.0.dp)
        }
        .counterStyle(Counter.S.Accent.style())
        .wrap(::WrapperSegmentItemXl)

public val WrapperSegmentItemXl.Pilled: WrapperSegmentItemXlPilled
    @Composable
    @JvmName("WrapperSegmentItemXlPilled")
    get() = builder
        .shape(CircleShape)
        .dimensions {
            minWidth(94.0.dp)
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
        }
        .wrap(::WrapperSegmentItemXlPilled)

public val SegmentItem.L: WrapperSegmentItemL
    @Composable
    @JvmName("WrapperSegmentItemL")
    get() = SegmentItemStyle.segmentItemBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .labelStyle(SddsServTheme.typography.bodyLBold)
        .valueStyle(SddsServTheme.typography.bodyLBold)
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
    get() = SegmentItemStyle.segmentItemBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = 0.0.dp))
        .labelStyle(SddsServTheme.typography.bodyMBold)
        .valueStyle(SddsServTheme.typography.bodyMBold)
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
    get() = SegmentItemStyle.segmentItemBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .labelStyle(SddsServTheme.typography.bodySBold)
        .valueStyle(SddsServTheme.typography.bodySBold)
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
    get() = SegmentItemStyle.segmentItemBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS.adjustBy(all = 0.0.dp))
        .labelStyle(SddsServTheme.typography.bodyXsBold)
        .valueStyle(SddsServTheme.typography.bodyXsBold)
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
