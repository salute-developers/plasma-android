package com.sdds.playground.sandbox.buttons

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonColorsBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.ButtonStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

/**
 * Вариации [ButtonStyle]
 * @author Малышев Александр on 18.10.2024
 */
internal val ButtonStyleBuilder.Default: ButtonStyleBuilder
    @Composable
    get() = this.colors { defaultColors() }

internal val ButtonStyleBuilder.Secondary: ButtonStyleBuilder
    @Composable
    get() = this.colors { secondaryColors() }

internal val ButtonStyleBuilder.Accent: ButtonStyleBuilder
    @Composable
    get() = this.colors { accentColors() }

internal val ButtonStyleBuilder.Positive: ButtonStyleBuilder
    @Composable
    get() = this.colors { positiveColors() }

internal val ButtonStyleBuilder.Warning: ButtonStyleBuilder
    @Composable
    get() = this.colors { warningColors() }

internal val ButtonStyleBuilder.Negative: ButtonStyleBuilder
    @Composable
    get() = this.colors { negativeColors() }

internal val ButtonStyleBuilder.Clear: ButtonStyleBuilder
    @Composable
    get() = this
        .colors { clearColors() }
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))

internal val ButtonStyleBuilder.Dark: ButtonStyleBuilder
    @Composable
    get() = this.colors { darkColors() }

internal val ButtonStyleBuilder.Black: ButtonStyleBuilder
    @Composable
    get() = this.colors { blackColors() }

internal val ButtonStyleBuilder.White: ButtonStyleBuilder
    @Composable
    get() = this.colors { whiteColors() }

internal val ButtonStyleBuilder.Pilled: ButtonStyleBuilder
    @Composable
    get() = this.shape(CircleShape)

internal object BasicButton {

    val L: ButtonStyleBuilder
        @Composable
        @ReadOnlyComposable
        get() = ButtonStyle.builder()
            .shape(SddsServTheme.shapes.roundL)
            .dimensions(
                Button.Dimensions(
                    height = 56.dp,
                    paddings = Button.Dimensions.PaddingValues(horizontal = 24.dp),
                    minWidth = 98.dp,
                    iconSize = 24.dp,
                    spinnerSize = 22.dp,
                    iconMargin = 8.dp,
                    valueMargin = 4.dp,
                ),
            )
            .labelStyle(SddsServTheme.typography.bodyLBold)
            .valueStyle(SddsServTheme.typography.bodyLBold)

    val M: ButtonStyleBuilder
        @Composable
        @ReadOnlyComposable
        get() = ButtonStyle.builder()
            .shape(SddsServTheme.shapes.roundM)
            .dimensions(
                Button.Dimensions(
                    height = 48.dp,
                    paddings = Button.Dimensions.PaddingValues(horizontal = 20.dp),
                    minWidth = 84.dp,
                    iconSize = 24.dp,
                    spinnerSize = 22.dp,
                    iconMargin = 6.dp,
                    valueMargin = 4.dp,
                ),
            )
            .labelStyle(SddsServTheme.typography.bodyMBold)
            .valueStyle(SddsServTheme.typography.bodyMBold)

    val S: ButtonStyleBuilder
        @Composable
        @ReadOnlyComposable
        get() = ButtonStyle.builder()
            .shape(SddsServTheme.shapes.roundS)
            .dimensions(
                Button.Dimensions(
                    height = 40.dp,
                    paddings = Button.Dimensions.PaddingValues(horizontal = 16.dp),
                    minWidth = 71.dp,
                    iconSize = 24.dp,
                    spinnerSize = 22.dp,
                    iconMargin = 4.dp,
                    valueMargin = 4.dp,
                ),
            )
            .labelStyle(SddsServTheme.typography.bodySBold)
            .valueStyle(SddsServTheme.typography.bodySBold)

    val Xs: ButtonStyleBuilder
        @Composable
        @ReadOnlyComposable
        get() = ButtonStyle.builder()
            .shape(SddsServTheme.shapes.roundXs)
            .dimensions(
                Button.Dimensions(
                    height = 32.dp,
                    paddings = Button.Dimensions.PaddingValues(horizontal = 12.dp),
                    minWidth = 57.dp,
                    iconSize = 16.dp,
                    spinnerSize = 16.dp,
                    iconMargin = 4.dp,
                    valueMargin = 2.dp,
                ),
            )
            .labelStyle(SddsServTheme.typography.bodyXsBold)
            .valueStyle(SddsServTheme.typography.bodyXsBold)
}

internal object IconButton {

    val L: ButtonStyleBuilder
        @Composable
        @ReadOnlyComposable
        get() = ButtonStyle.builder()
            .shape(SddsServTheme.shapes.roundL)
            .dimensions(
                Button.Dimensions(
                    height = 56.dp,
                    paddings = Button.Dimensions.PaddingValues(horizontal = 16.dp),
                    minWidth = 56.dp,
                    iconSize = 24.dp,
                    spinnerSize = 22.dp,
                ),
            )
            .labelStyle(SddsServTheme.typography.bodyLBold)
            .valueStyle(SddsServTheme.typography.bodyLBold)

    val M: ButtonStyleBuilder
        @Composable
        @ReadOnlyComposable
        get() = ButtonStyle.builder()
            .shape(SddsServTheme.shapes.roundM)
            .dimensions(
                Button.Dimensions(
                    height = 48.dp,
                    paddings = Button.Dimensions.PaddingValues(horizontal = 12.dp),
                    minWidth = 48.dp,
                    iconSize = 24.dp,
                    spinnerSize = 22.dp,
                ),
            )
            .labelStyle(SddsServTheme.typography.bodyMBold)
            .valueStyle(SddsServTheme.typography.bodyMBold)

    val S: ButtonStyleBuilder
        @Composable
        @ReadOnlyComposable
        get() = ButtonStyle.builder()
            .shape(SddsServTheme.shapes.roundS)
            .dimensions(
                Button.Dimensions(
                    height = 40.dp,
                    paddings = Button.Dimensions.PaddingValues(horizontal = 8.dp),
                    minWidth = 40.dp,
                    iconSize = 24.dp,
                    spinnerSize = 22.dp,
                ),
            )
            .labelStyle(SddsServTheme.typography.bodySBold)
            .valueStyle(SddsServTheme.typography.bodySBold)

    val Xs: ButtonStyleBuilder
        @Composable
        @ReadOnlyComposable
        get() = ButtonStyle.builder()
            .shape(SddsServTheme.shapes.roundXs)
            .dimensions(
                Button.Dimensions(
                    height = 32.dp,
                    paddings = Button.Dimensions.PaddingValues(horizontal = 8.dp),
                    minWidth = 32.dp,
                    iconSize = 16.dp,
                    spinnerSize = 16.dp,
                ),
            )
            .labelStyle(SddsServTheme.typography.bodyXsBold)
            .valueStyle(SddsServTheme.typography.bodyXsBold)
}

@Composable
private fun ButtonColorsBuilder.defaultColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textInversePrimary.asInteractive(
            pressed = SddsServTheme.colors.textInversePrimaryActive,
        ),
    )
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultSolidDefault.asInteractive(
            pressed = SddsServTheme.colors.surfaceDefaultSolidDefaultActive,
        ),
    )
    valueColor(
        SddsServTheme.colors.textInverseSecondary.asInteractive(
            pressed = SddsServTheme.colors.textInverseSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.secondaryColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultPrimary.asInteractive(
            pressed = SddsServTheme.colors.textDefaultPrimaryActive,
        ),
    )
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
            pressed = SddsServTheme.colors.surfaceDefaultTransparentSecondaryActive,
        ),
    )
    valueColor(
        SddsServTheme.colors.textDefaultSecondary.asInteractive(
            pressed = SddsServTheme.colors.textDefaultSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.accentColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultAccent.asInteractive(
            pressed = SddsServTheme.colors.surfaceDefaultAccentActive,
        ),
    )
    valueColor(
        SddsServTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.positiveColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultPositive.asInteractive(
            pressed = SddsServTheme.colors.surfaceDefaultPositiveActive,
        ),
    )
    valueColor(
        SddsServTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.negativeColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultNegative.asInteractive(
            pressed = SddsServTheme.colors.surfaceDefaultNegativeActive,
        ),
    )
    valueColor(
        SddsServTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.warningColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultWarning.asInteractive(
            pressed = SddsServTheme.colors.surfaceDefaultWarningActive,
        ),
    )
    valueColor(
        SddsServTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.clearColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultPrimary.asInteractive(
            pressed = SddsServTheme.colors.textDefaultPrimaryActive,
        ),
    )
    backgroundColor(
        SddsServTheme.colors.surfaceDefaultClear.asInteractive(
            pressed = SddsServTheme.colors.surfaceDefaultClearActive,
        ),
    )
    valueColor(
        SddsServTheme.colors.textDefaultSecondary.asInteractive(
            pressed = SddsServTheme.colors.textDefaultSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.darkColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        SddsServTheme.colors.surfaceOnLightTransparentDeep.asInteractive(
            pressed = SddsServTheme.colors.surfaceOnLightTransparentDeepActive,
        ),
    )
    valueColor(
        SddsServTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.blackColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        SddsServTheme.colors.surfaceOnLightSolidDefault.asInteractive(
            pressed = SddsServTheme.colors.surfaceOnLightSolidDefaultActive,
        ),
    )
    valueColor(
        SddsServTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = SddsServTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.whiteColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textOnLightPrimary.asInteractive(
            pressed = SddsServTheme.colors.textOnLightPrimaryActive,
        ),
    )
    backgroundColor(
        SddsServTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
            pressed = SddsServTheme.colors.surfaceOnDarkSolidDefaultActive,
        ),
    )
    valueColor(
        SddsServTheme.colors.textOnLightSecondary.asInteractive(
            pressed = SddsServTheme.colors.textOnLightSecondaryActive,
        ),
    )
}

private const val SEMITRANSPARENT_SPINNER_ALPHA = 0.06f
