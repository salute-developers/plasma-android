// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.chip

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperChip : BuilderWrapper<ChipStyle, ChipStyleBuilder>

/**
 * Обертка для вариации ChipSlotPadding
 */
@JvmInline
public value class WrapperChipChipSlotPadding(
    public override val builder: ChipStyleBuilder,
) : WrapperChip

/**
 * Обертка для вариации ChipSlotAvatar
 */
@JvmInline
public value class WrapperChipChipSlotAvatar(
    public override val builder: ChipStyleBuilder,
) : WrapperChip

private val ChipStyleBuilder.invariantProps: ChipStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .labelStyle(SddsSbComTheme.typography.bodyMNormal)
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                    setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultAccentPrimary,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.surfaceDefaultAccentPrimary,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentTertiaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentTertiaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.surfaceDefaultAccentPrimary,
                ),
            )
            contentStartColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textOnDarkPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textOnDarkPrimary,
                ),
            )
            contentEndColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textOnDarkPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textOnDarkPrimary,
                ),
            )
            labelColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textOnDarkPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textOnDarkPrimary,
                ),
            )
        }
        .dimensions {
            height(26.0.dp)
            paddingEnd(8.0.dp)
            contentStartPadding(3.0.dp)
            contentEndPadding(3.0.dp)
            contentStartSize(24.0.dp)
            contentEndSize(24.0.dp)
        }
        .disableAlpha(0.4f)

public val Chip.ChipSlotPadding: WrapperChipChipSlotPadding
    @Composable
    @JvmName("WrapperChipChipSlotPadding")
    get() = ChipStyle.builder(this)
        .invariantProps
        .dimensions {
            paddingStart(
                8.0.dp.asStatefulValue(
                    setOf(InteractiveState.Selected) to 1.0.dp,
                ),
            )
        }
        .wrap(::WrapperChipChipSlotPadding)

public val Chip.ChipSlotAvatar: WrapperChipChipSlotAvatar
    @Composable
    @JvmName("WrapperChipChipSlotAvatar")
    get() = ChipStyle.builder(this)
        .invariantProps
        .dimensions {
            paddingStart(1.0.dp)
        }
        .wrap(::WrapperChipChipSlotAvatar)
