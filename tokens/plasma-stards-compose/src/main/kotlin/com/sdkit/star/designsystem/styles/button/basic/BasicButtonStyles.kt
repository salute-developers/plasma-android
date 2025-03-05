// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.button.basic

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.basicButtonBuilder
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
public interface WrapperBasicButton : BuilderWrapper<ButtonStyle, BasicButtonStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperBasicButtonL(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperBasicButtonM(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperBasicButtonS(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperBasicButtonXs(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

private val BasicButtonStyleBuilder.invariantProps: BasicButtonStyleBuilder
    @Composable
    get() = this
        .colors {
            spinnerColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInversePrimary,
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInversePrimary,
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                ),
            )
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInversePrimary,
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInverseSecondary,
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.surfaceDefaultSolidDefault,
                    setOf(InteractiveState.Pressed)
                        to StarDsTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StarDsTheme.colors.surfaceDefaultTransparentSecondaryHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .disableAlpha(0.4f)

public val BasicButton.L: WrapperBasicButtonL
    @Composable
    @JvmName("WrapperBasicButtonL")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundL.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_basic_button_shapeAdjustment_l),
            ),
        )
        .labelStyle(StarDsTheme.typography.bodyLBold)
        .valueStyle(StarDsTheme.typography.bodyLBold)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_basic_button_height_l))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_basic_button_padding_start_l))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_basic_button_padding_end_l))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_basic_button_min_width_l))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_basic_button_icon_size_l))
            spinnerSize(dimensionResource(R.dimen.sdkit_cmp_basic_button_spinner_size_l))
            spinnerStrokeWidth(dimensionResource(R.dimen.sdkit_cmp_basic_button_spinner_stroke_width_l))
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_basic_button_icon_margin_l))
            valueMargin(dimensionResource(R.dimen.sdkit_cmp_basic_button_value_margin_l))
        }
        .wrap(::WrapperBasicButtonL)

public val BasicButton.M: WrapperBasicButtonM
    @Composable
    @JvmName("WrapperBasicButtonM")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundM)
        .labelStyle(StarDsTheme.typography.bodyMBold)
        .valueStyle(StarDsTheme.typography.bodyMBold)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_basic_button_height_m))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_basic_button_padding_start_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_basic_button_padding_end_m))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_basic_button_min_width_m))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_basic_button_icon_size_m))
            spinnerSize(dimensionResource(R.dimen.sdkit_cmp_basic_button_spinner_size_m))
            spinnerStrokeWidth(dimensionResource(R.dimen.sdkit_cmp_basic_button_spinner_stroke_width_m))
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_basic_button_icon_margin_m))
            valueMargin(dimensionResource(R.dimen.sdkit_cmp_basic_button_value_margin_m))
        }
        .wrap(::WrapperBasicButtonM)

public val BasicButton.S: WrapperBasicButtonS
    @Composable
    @JvmName("WrapperBasicButtonS")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_basic_button_shapeAdjustment_s),
            ),
        )
        .labelStyle(StarDsTheme.typography.bodySBold)
        .valueStyle(StarDsTheme.typography.bodySBold)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_basic_button_height_s))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_basic_button_padding_start_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_basic_button_padding_end_s))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_basic_button_min_width_s))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_basic_button_icon_size_s))
            spinnerSize(dimensionResource(R.dimen.sdkit_cmp_basic_button_spinner_size_s))
            spinnerStrokeWidth(dimensionResource(R.dimen.sdkit_cmp_basic_button_spinner_stroke_width_s))
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_basic_button_icon_margin_s))
            valueMargin(dimensionResource(R.dimen.sdkit_cmp_basic_button_value_margin_s))
        }
        .wrap(::WrapperBasicButtonS)

public val BasicButton.Xs: WrapperBasicButtonXs
    @Composable
    @JvmName("WrapperBasicButtonXs")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .labelStyle(StarDsTheme.typography.bodyXsBold)
        .valueStyle(StarDsTheme.typography.bodyXsBold)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_basic_button_height_xs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_basic_button_padding_start_xs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_basic_button_padding_end_xs))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_basic_button_min_width_xs))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_basic_button_icon_size_xs))
            spinnerSize(dimensionResource(R.dimen.sdkit_cmp_basic_button_spinner_size_xs))
            spinnerStrokeWidth(dimensionResource(R.dimen.sdkit_cmp_basic_button_spinner_stroke_width_xs))
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_basic_button_icon_margin_xs))
            valueMargin(dimensionResource(R.dimen.sdkit_cmp_basic_button_value_margin_xs))
        }
        .wrap(::WrapperBasicButtonXs)
