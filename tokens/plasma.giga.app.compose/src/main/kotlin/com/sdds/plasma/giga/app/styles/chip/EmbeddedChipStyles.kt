// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.chip

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperEmbeddedChip : BuilderWrapper<ChipStyle, ChipStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedChipView : WrapperEmbeddedChip

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperEmbeddedChipTerminate(
    public override val builder: ChipStyleBuilder,
) : WrapperEmbeddedChip

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperEmbeddedChipL(
    public override val builder: ChipStyleBuilder,
) : WrapperEmbeddedChipView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperEmbeddedChipM(
    public override val builder: ChipStyleBuilder,
) : WrapperEmbeddedChipView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperEmbeddedChipS(
    public override val builder: ChipStyleBuilder,
) : WrapperEmbeddedChipView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperEmbeddedChipXs(
    public override val builder: ChipStyleBuilder,
) : WrapperEmbeddedChipView

public val WrapperEmbeddedChipView.Default: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            contentStartColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textInversePrimaryHover,
                ),
            )
            contentEndColor(
                PlasmaGigaAppTheme.colors.textInverseSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textInverseSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textInverseSecondaryHover,
                ),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

public val WrapperEmbeddedChipView.Accent: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultAccentHover,
                ),
            )
            contentStartColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textInversePrimaryHover,
                ),
            )
            contentEndColor(
                PlasmaGigaAppTheme.colors.textInverseSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textInverseSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textInverseSecondaryHover,
                ),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

public val WrapperEmbeddedChipView.Negative: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultNegativeHover,
                ),
            )
            contentStartColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            contentEndColor(
                PlasmaGigaAppTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

public val WrapperEmbeddedChipView.Positive: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultPositiveHover,
                ),
            )
            contentStartColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            contentEndColor(
                PlasmaGigaAppTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

public val WrapperEmbeddedChipView.Secondary: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondaryHover,
                ),
            )
            contentStartColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultPrimaryHover,
                ),
            )
            contentEndColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultSecondaryHover,
                ),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

public val WrapperEmbeddedChipView.Warning: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultWarningHover,
                ),
            )
            contentStartColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            contentEndColor(
                PlasmaGigaAppTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaAppTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

private val ChipStyleBuilder.invariantProps: ChipStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)

public val EmbeddedChip.L: WrapperEmbeddedChipL
    @Composable
    @JvmName("WrapperEmbeddedChipL")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundM.adjustBy(all = -4.0.dp))
        .labelStyle(PlasmaGigaAppTheme.typography.bodyLNormal)
        .dimensions {
            height(44.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(12.0.dp)
            contentStartPadding(8.0.dp)
            contentEndPadding(8.0.dp)
            contentStartSize(24.0.dp)
            contentEndSize(24.0.dp)
        }
        .wrap(::WrapperEmbeddedChipL)

public val EmbeddedChip.M: WrapperEmbeddedChipM
    @Composable
    @JvmName("WrapperEmbeddedChipM")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundM.adjustBy(all = -6.0.dp))
        .labelStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .dimensions {
            height(36.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(10.0.dp)
            contentStartPadding(6.0.dp)
            contentEndPadding(6.0.dp)
            contentStartSize(24.0.dp)
            contentEndSize(24.0.dp)
        }
        .wrap(::WrapperEmbeddedChipM)

public val EmbeddedChip.S: WrapperEmbeddedChipS
    @Composable
    @JvmName("WrapperEmbeddedChipS")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundM.adjustBy(all = -8.0.dp))
        .labelStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .dimensions {
            height(28.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(8.0.dp)
            contentStartPadding(4.0.dp)
            contentEndPadding(4.0.dp)
            contentStartSize(16.0.dp)
            contentEndSize(16.0.dp)
        }
        .wrap(::WrapperEmbeddedChipS)

public val EmbeddedChip.Xs: WrapperEmbeddedChipXs
    @Composable
    @JvmName("WrapperEmbeddedChipXs")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundS.adjustBy(all = -6.0.dp))
        .labelStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .dimensions {
            height(20.0.dp)
            paddingStart(6.0.dp)
            paddingEnd(6.0.dp)
            contentStartPadding(2.0.dp)
            contentEndPadding(2.0.dp)
            contentStartSize(12.0.dp)
            contentEndSize(12.0.dp)
        }
        .wrap(::WrapperEmbeddedChipXs)
