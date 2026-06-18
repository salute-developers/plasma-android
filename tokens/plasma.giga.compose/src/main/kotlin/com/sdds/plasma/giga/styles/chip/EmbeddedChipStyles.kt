// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.chip

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
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
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperEmbeddedChipXl(
    public override val builder: ChipStyleBuilder,
) : WrapperEmbeddedChipView

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
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInversePrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(PlasmaGigaTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInversePrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(PlasmaGigaTheme.colors.textInverseSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInverseSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInverseSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

public val WrapperEmbeddedChipView.Accent: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInversePrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(PlasmaGigaTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInversePrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(PlasmaGigaTheme.colors.textInverseSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInverseSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInverseSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

public val WrapperEmbeddedChipView.Negative: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultNegativeHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

public val WrapperEmbeddedChipView.Positive: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultPositiveHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

public val WrapperEmbeddedChipView.Secondary: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultPrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultPrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

public val WrapperEmbeddedChipView.Warning: WrapperEmbeddedChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultWarningHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentStartColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            contentEndColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryHover),
                ),
            )
        }
        .wrap(::WrapperEmbeddedChipTerminate)

private val ChipStyleBuilder.invariantProps: ChipStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)

public val EmbeddedChip.Xl: WrapperEmbeddedChipXl
    @Composable
    @JvmName("WrapperEmbeddedChipXl")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .labelStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .dimensions {
            height(52.0.dp)
            contentStartSize(24.0.dp)
            contentEndSize(24.0.dp)
            contentStartPadding(6.0.dp)
            contentEndPadding(6.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(12.0.dp)
        }
        .wrap(::WrapperEmbeddedChipXl)

public val EmbeddedChip.L: WrapperEmbeddedChipL
    @Composable
    @JvmName("WrapperEmbeddedChipL")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM.adjustBy(all = -4.0.dp))
        .labelStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .dimensions {
            height(44.0.dp)
            contentStartSize(24.0.dp)
            contentEndSize(24.0.dp)
            contentStartPadding(8.0.dp)
            contentEndPadding(8.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(12.0.dp)
        }
        .wrap(::WrapperEmbeddedChipL)

public val EmbeddedChip.M: WrapperEmbeddedChipM
    @Composable
    @JvmName("WrapperEmbeddedChipM")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM.adjustBy(all = -6.0.dp))
        .labelStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .dimensions {
            height(36.0.dp)
            contentStartSize(24.0.dp)
            contentEndSize(24.0.dp)
            contentStartPadding(6.0.dp)
            contentEndPadding(6.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(10.0.dp)
        }
        .wrap(::WrapperEmbeddedChipM)

public val EmbeddedChip.S: WrapperEmbeddedChipS
    @Composable
    @JvmName("WrapperEmbeddedChipS")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM.adjustBy(all = -8.0.dp))
        .labelStyle(PlasmaGigaTheme.typography.bodySNormal)
        .dimensions {
            height(28.0.dp)
            contentStartSize(16.0.dp)
            contentEndSize(16.0.dp)
            contentStartPadding(4.0.dp)
            contentEndPadding(4.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(8.0.dp)
        }
        .wrap(::WrapperEmbeddedChipS)

public val EmbeddedChip.Xs: WrapperEmbeddedChipXs
    @Composable
    @JvmName("WrapperEmbeddedChipXs")
    get() = ChipStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundS.adjustBy(all = -6.0.dp))
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .dimensions {
            height(20.0.dp)
            contentStartSize(12.0.dp)
            contentEndSize(12.0.dp)
            contentStartPadding(2.0.dp)
            contentEndPadding(2.0.dp)
            paddingStart(6.0.dp)
            paddingEnd(6.0.dp)
        }
        .wrap(::WrapperEmbeddedChipXs)
