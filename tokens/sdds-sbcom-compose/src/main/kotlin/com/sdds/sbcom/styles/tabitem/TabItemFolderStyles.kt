// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.tabitem

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.TabItemStyleBuilder
import com.sdds.compose.uikit.graphics.asLayered
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.internal.common.BrushFillStyle
import com.sdds.compose.uikit.internal.common.asBrushFillStyle
import com.sdds.compose.uikit.internal.common.asFillStyle
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.counter.Counter
import com.sdds.sbcom.styles.counter.Secondary
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabItemFolder : BuilderWrapper<TabItemStyle, TabItemStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperTabItemFolderDefault(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemFolder

public val TabItemFolder.Default: WrapperTabItemFolderDefault
    @Composable
    @JvmName("WrapperTabItemFolderDefault")
    get() = TabItemStyle.builder(this)
        .shape(CircleShape)
        .labelStyle(SddsSbComTheme.typography.bodyMMedium)
        .colors {
            backgroundFillStyle(
                SddsSbComTheme.colors.surfaceDefaultClear.asBrushFillStyle().asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.gradients.backgroundDefaultGradient.asFillStyle(),
                ),
            )
            labelColor(
                SddsSbComTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.textDefaultAccentHover,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                ),
            )
            startContentColor(
                SddsSbComTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.textDefaultAccentHover,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                ),
            )
            endContentColor(
                SddsSbComTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultAccentActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.textDefaultAccentHover,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                ),
            )
        }
        .dimensions {
            minHeight(32.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            counterPadding(5.0.dp)
        }
        .counterStyle(Counter.Secondary.modify {
            colors {
                backgroundColor(
                    SddsSbComTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                        setOf(InteractiveState.Selected) to SddsSbComTheme.colors.surfaceDefaultAccent
                    ),
                )
            }
        }.style())
        .disableAlpha(0.4f)
        .wrap(::WrapperTabItemFolderDefault)
