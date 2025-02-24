// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.button.icon

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public interface WrapperIconButton : BuilderWrapper<ButtonStyle, IconButtonStyleBuilder>

@JvmInline
public value class WrapperIconButtonL(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonLPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonM(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonMPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonS(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonSPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonXs(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

@JvmInline
public value class WrapperIconButtonXsPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

private val IconButtonStyleBuilder.invariantProps: IconButtonStyleBuilder
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

public val IconButton.L: WrapperIconButtonL
    @Composable
    @JvmName("WrapperIconButtonL")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundL.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_icon_button_shapeAdjustment_l),
            ),
        )
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_button_height_l))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_icon_button_padding_start_l))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_icon_button_padding_end_l))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_icon_button_min_width_l))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_icon_button_icon_size_l))
            spinnerSize(dimensionResource(R.dimen.sdkit_cmp_icon_button_spinner_size_l))
            spinnerStrokeWidth(dimensionResource(R.dimen.sdkit_cmp_icon_button_spinner_stroke_width_l))
        }
        .wrap(::WrapperIconButtonL)

public val WrapperIconButtonL.Pilled: WrapperIconButtonLPilled
    @Composable
    @JvmName("WrapperIconButtonLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonLPilled)

public val IconButton.M: WrapperIconButtonM
    @Composable
    @JvmName("WrapperIconButtonM")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundM)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_button_height_m))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_icon_button_padding_start_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_icon_button_padding_end_m))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_icon_button_min_width_m))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_icon_button_icon_size_m))
            spinnerSize(dimensionResource(R.dimen.sdkit_cmp_icon_button_spinner_size_m))
            spinnerStrokeWidth(dimensionResource(R.dimen.sdkit_cmp_icon_button_spinner_stroke_width_m))
        }
        .wrap(::WrapperIconButtonM)

public val WrapperIconButtonM.Pilled: WrapperIconButtonMPilled
    @Composable
    @JvmName("WrapperIconButtonMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonMPilled)

public val IconButton.S: WrapperIconButtonS
    @Composable
    @JvmName("WrapperIconButtonS")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_icon_button_shapeAdjustment_s),
            ),
        )
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_button_height_s))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_icon_button_padding_start_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_icon_button_padding_end_s))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_icon_button_min_width_s))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_icon_button_icon_size_s))
            spinnerSize(dimensionResource(R.dimen.sdkit_cmp_icon_button_spinner_size_s))
            spinnerStrokeWidth(dimensionResource(R.dimen.sdkit_cmp_icon_button_spinner_stroke_width_s))
        }
        .wrap(::WrapperIconButtonS)

public val WrapperIconButtonS.Pilled: WrapperIconButtonSPilled
    @Composable
    @JvmName("WrapperIconButtonSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonSPilled)

public val IconButton.Xs: WrapperIconButtonXs
    @Composable
    @JvmName("WrapperIconButtonXs")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .dimensions {
            height(dimensionResource(R.dimen.sdkit_cmp_icon_button_height_xs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_icon_button_padding_start_xs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_icon_button_padding_end_xs))
            minWidth(dimensionResource(R.dimen.sdkit_cmp_icon_button_min_width_xs))
            iconSize(dimensionResource(R.dimen.sdkit_cmp_icon_button_icon_size_xs))
            spinnerSize(dimensionResource(R.dimen.sdkit_cmp_icon_button_spinner_size_xs))
            spinnerStrokeWidth(dimensionResource(R.dimen.sdkit_cmp_icon_button_spinner_stroke_width_xs))
        }
        .wrap(::WrapperIconButtonXs)

public val WrapperIconButtonXs.Pilled: WrapperIconButtonXsPilled
    @Composable
    @JvmName("WrapperIconButtonXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonXsPilled)
