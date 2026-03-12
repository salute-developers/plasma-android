// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.segmentitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentItemStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSegmentItem : BuilderWrapper<SegmentItemStyle, SegmentItemStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperSegmentItemDefault(
    public override val builder: SegmentItemStyleBuilder,
) : WrapperSegmentItem

public val SegmentItem.Default: WrapperSegmentItemDefault
    @Composable
    @JvmName("WrapperSegmentItemDefault")
    get() = SegmentItemStyle.builder(this)
        .labelStyle(SddsSbComTheme.typography.bodySMedium)
        .valueStyle(SddsSbComTheme.typography.bodySMedium)
        .colors {
            labelColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsSbComTheme.colors.textDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.textDefaultAccentHover,
                ),
            )
            valueColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textInverseSecondary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsSbComTheme.colors.textInverseSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultClearHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultClearActive,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsSbComTheme.colors.surfaceDefaultTransparentAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.surfaceDefaultTransparentAccentHover,
                ),
            )
            startContentColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsSbComTheme.colors.textDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.textDefaultAccentHover,
                ),
            )
            endContentColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Pressed,
                    )
                        to SddsSbComTheme.colors.textDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.textDefaultAccentHover,
                ),
            )
        }
        .dimensions {
            minWidth(108.0.dp)
            minHeight(40.0.dp)
            paddingStart(22.0.dp)
            paddingEnd(22.0.dp)
            startContentPadding(8.0.dp)
            endContentPadding(6.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            valueMargin(6.0.dp)
        }
        .wrap(::WrapperSegmentItemDefault)
