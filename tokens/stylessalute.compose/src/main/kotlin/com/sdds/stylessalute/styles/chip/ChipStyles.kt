// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.chip

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperChip : BuilderWrapper<ChipStyle, ChipStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperChipView : WrapperChip

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperChipTerminate(
    public override val builder: ChipStyleBuilder,
) : WrapperChip

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperChipL(
    public override val builder: ChipStyleBuilder,
) : WrapperChipView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperChipLPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperChipM(
    public override val builder: ChipStyleBuilder,
) : WrapperChipView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperChipMPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperChipS(
    public override val builder: ChipStyleBuilder,
) : WrapperChipView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperChipSPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperChipXs(
    public override val builder: ChipStyleBuilder,
) : WrapperChipView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperChipXsPilled(
    public override val builder: ChipStyleBuilder,
) : WrapperChipView

public val WrapperChipView.Default: WrapperChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            contentStartColor(
                StylesSaluteTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textInversePrimaryHover,
                ),
            )
            contentEndColor(
                StylesSaluteTheme.colors.textInverseSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textInverseSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textInverseSecondaryHover,
                ),
            )
            labelColor(
                StylesSaluteTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperChipTerminate)

public val WrapperChipView.Accent: WrapperChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            contentStartColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            contentEndColor(
                StylesSaluteTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            labelColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperChipTerminate)

public val WrapperChipView.Secondary: WrapperChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentSecondaryHover,
                ),
            )
            contentStartColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                ),
            )
            contentEndColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultSecondaryHover,
                ),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperChipTerminate)

private val ChipStyleBuilder.invariantProps: ChipStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)

public val Chip.L: WrapperChipL
    @Composable
    @JvmName("WrapperChipL")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .labelStyle(StylesSaluteTheme.typography.bodyLNormal)
        .dimensions {
            height(48.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            contentStartPadding(8.0.dp)
            contentEndPadding(8.0.dp)
            contentStartSize(24.0.dp)
            contentEndSize(24.0.dp)
        }
        .wrap(::WrapperChipL)

public val WrapperChipL.Pilled: WrapperChipLPilled
    @Composable
    @JvmName("WrapperChipLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipLPilled)

public val Chip.M: WrapperChipM
    @Composable
    @JvmName("WrapperChipM")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .labelStyle(StylesSaluteTheme.typography.bodyMNormal)
        .dimensions {
            height(40.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            contentStartPadding(6.0.dp)
            contentEndPadding(6.0.dp)
            contentStartSize(24.0.dp)
            contentEndSize(24.0.dp)
        }
        .wrap(::WrapperChipM)

public val WrapperChipM.Pilled: WrapperChipMPilled
    @Composable
    @JvmName("WrapperChipMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipMPilled)

public val Chip.S: WrapperChipS
    @Composable
    @JvmName("WrapperChipS")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundS)
        .labelStyle(StylesSaluteTheme.typography.bodySNormal)
        .dimensions {
            height(32.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            contentStartPadding(4.0.dp)
            contentEndPadding(4.0.dp)
            contentStartSize(16.0.dp)
            contentEndSize(16.0.dp)
        }
        .wrap(::WrapperChipS)

public val WrapperChipS.Pilled: WrapperChipSPilled
    @Composable
    @JvmName("WrapperChipSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipSPilled)

public val Chip.Xs: WrapperChipXs
    @Composable
    @JvmName("WrapperChipXs")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundXs)
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .dimensions {
            height(24.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(10.0.dp)
            contentStartPadding(2.0.dp)
            contentEndPadding(2.0.dp)
            contentStartSize(12.0.dp)
            contentEndSize(12.0.dp)
        }
        .wrap(::WrapperChipXs)

public val WrapperChipXs.Pilled: WrapperChipXsPilled
    @Composable
    @JvmName("WrapperChipXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipXsPilled)
