// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.chip

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
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
                StarDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
            contentStartColor(
                StarDsTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textInversePrimaryHover,
                ),
            )
            contentEndColor(
                StarDsTheme.colors.textInverseSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textInverseSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textInverseSecondaryHover,
                ),
            )
            labelColor(
                StarDsTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperChipTerminate)

public val WrapperChipView.Accent: WrapperChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultAccentMain.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultAccentMainActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultAccentMainHover,
                ),
            )
            contentStartColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            contentEndColor(
                StarDsTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            labelColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperChipTerminate)

public val WrapperChipView.Negative: WrapperChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultNegativeHover,
                ),
            )
            contentStartColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            contentEndColor(
                StarDsTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            labelColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperChipTerminate)

public val WrapperChipView.Positive: WrapperChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultPositiveHover,
                ),
            )
            contentStartColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            contentEndColor(
                StarDsTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            labelColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperChipTerminate)

public val WrapperChipView.Secondary: WrapperChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultTransparentSecondaryHover,
                ),
            )
            contentStartColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                ),
            )
            contentEndColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultSecondaryHover,
                ),
            )
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperChipTerminate)

public val WrapperChipView.Warning: WrapperChipTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultWarningHover,
                ),
            )
            contentStartColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            contentEndColor(
                StarDsTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            labelColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textOnDarkPrimaryHover,
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
        .shape(StarDsTheme.shapes.roundM)
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_chip_height_l))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_chip_padding_start_l))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_chip_padding_end_l))
            contentStartPadding(dimensionResource(R.dimen.sdkit_cmp_chip_content_start_padding_l))
            contentEndPadding(dimensionResource(R.dimen.sdkit_cmp_chip_content_end_padding_l))
            contentStartSize(dimensionResource(R.dimen.sdkit_cmp_chip_content_start_size_l))
            contentEndSize(dimensionResource(R.dimen.sdkit_cmp_chip_content_end_size_l))
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
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_chip_shapeAdjustment_m),
            ),
        )
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_chip_height_m))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_chip_padding_start_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_chip_padding_end_m))
            contentStartPadding(dimensionResource(R.dimen.sdkit_cmp_chip_content_start_padding_m))
            contentEndPadding(dimensionResource(R.dimen.sdkit_cmp_chip_content_end_padding_m))
            contentStartSize(dimensionResource(R.dimen.sdkit_cmp_chip_content_start_size_m))
            contentEndSize(dimensionResource(R.dimen.sdkit_cmp_chip_content_end_size_m))
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
        .shape(StarDsTheme.shapes.roundS)
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_chip_height_s))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_chip_padding_start_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_chip_padding_end_s))
            contentStartPadding(dimensionResource(R.dimen.sdkit_cmp_chip_content_start_padding_s))
            contentEndPadding(dimensionResource(R.dimen.sdkit_cmp_chip_content_end_padding_s))
            contentStartSize(dimensionResource(R.dimen.sdkit_cmp_chip_content_start_size_s))
            contentEndSize(dimensionResource(R.dimen.sdkit_cmp_chip_content_end_size_s))
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
        .shape(StarDsTheme.shapes.roundXs)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_chip_height_xs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_chip_padding_start_xs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_chip_padding_end_xs))
            contentStartPadding(dimensionResource(R.dimen.sdkit_cmp_chip_content_start_padding_xs))
            contentEndPadding(dimensionResource(R.dimen.sdkit_cmp_chip_content_end_padding_xs))
            contentStartSize(dimensionResource(R.dimen.sdkit_cmp_chip_content_start_size_xs))
            contentEndSize(dimensionResource(R.dimen.sdkit_cmp_chip_content_end_size_xs))
        }
        .wrap(::WrapperChipXs)

public val WrapperChipXs.Pilled: WrapperChipXsPilled
    @Composable
    @JvmName("WrapperChipXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperChipXsPilled)
