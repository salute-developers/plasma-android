package com.sdds.playground.sandbox.buttons

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonColorsBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.ButtonStyleBuilder
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.applyExclude
import com.sdds.compose.uikit.style.applyFor
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

/**
 * Вариации [ButtonStyle]
 * @author Малышев Александр on 18.10.2024
 */
internal val ButtonStyleBuilder.Default: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkDefaultColors() }
    }.applyExclude(LinkButton) {
        colors { defaultColors() }
    }

internal val ButtonStyleBuilder.Secondary: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkSecondaryColors() }
    }.applyExclude(LinkButton) {
        colors { secondaryColors() }
    }

internal val ButtonStyleBuilder.Accent: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkAccentColors() }
    }.applyExclude(LinkButton) {
        colors { accentColors() }
    }

internal val ButtonStyleBuilder.Positive: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkPositiveColors() }
    }.applyExclude(LinkButton) {
        colors { positiveColors() }
    }

internal val ButtonStyleBuilder.Warning: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkWarningColors() }
    }.applyExclude(LinkButton) {
        colors { warningColors() }
    }

internal val ButtonStyleBuilder.Negative: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkNegativeColors() }
    }.applyExclude(LinkButton) {
        colors { negativeColors() }
    }

internal val ButtonStyleBuilder.Clear: ButtonStyleBuilder
    @Composable
    get() = applyExclude(LinkButton) {
        colors { clearColors() }
        spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
    }

internal val ButtonStyleBuilder.Dark: ButtonStyleBuilder
    @Composable
    get() = applyExclude(LinkButton) {
        colors { darkColors() }
    }

internal val ButtonStyleBuilder.Black: ButtonStyleBuilder
    @Composable
    get() = applyExclude(LinkButton) {
        colors { blackColors() }
    }

internal val ButtonStyleBuilder.White: ButtonStyleBuilder
    @Composable
    get() = applyExclude(LinkButton) {
        colors { whiteColors() }
    }

internal val ButtonStyleBuilder.Pilled: ButtonStyleBuilder
    @Composable
    get() = applyExclude(LinkButton) {
        shape(CircleShape)
    }

internal val BasicButton.L: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = (-2).dp))
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

internal val BasicButton.M: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
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

internal val BasicButton.S: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = (-2).dp))
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

internal val BasicButton.Xs: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(SddsServTheme.shapes.roundS)
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

internal val IconButton.L: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
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

internal val IconButton.M: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
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

internal val IconButton.S: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = (-2).dp))
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

internal val IconButton.Xs: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(SddsServTheme.shapes.roundS)
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

internal val LinkButton.L: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .dimensions(
            Button.Dimensions(
                height = 56.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 0.dp),
                minWidth = 50.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
                iconMargin = 8.dp,
            ),
        )
        .labelStyle(SddsServTheme.typography.bodyLBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(SddsServTheme.colors.surfaceDefaultClear)
        }

internal val LinkButton.M: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .dimensions(
            Button.Dimensions(
                height = 48.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 0.dp),
                minWidth = 44.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
                iconMargin = 6.dp,
            ),
        )
        .labelStyle(SddsServTheme.typography.bodyMBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(SddsServTheme.colors.surfaceDefaultClear)
        }

internal val LinkButton.S: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .dimensions(
            Button.Dimensions(
                height = 40.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 0.dp),
                minWidth = 39.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
                iconMargin = 4.dp,
            ),
        )
        .labelStyle(SddsServTheme.typography.bodySBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(SddsServTheme.colors.surfaceDefaultClear)
        }

internal val LinkButton.Xs: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .dimensions(
            Button.Dimensions(
                height = 32.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 0.dp),
                minWidth = 33.dp,
                iconSize = 16.dp,
                spinnerSize = 16.dp,
                iconMargin = 4.dp,
            ),
        )
        .labelStyle(SddsServTheme.typography.bodyXsBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(SddsServTheme.colors.surfaceDefaultClear)
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

@Composable
private fun ButtonColorsBuilder.linkDefaultColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultPrimary.asInteractive(
            pressed = SddsServTheme.colors.textDefaultPrimaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkSecondaryColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultSecondary.asInteractive(
            pressed = SddsServTheme.colors.textDefaultSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkAccentColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultAccent.asInteractive(
            pressed = SddsServTheme.colors.textDefaultAccentActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkPositiveColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultPositive.asInteractive(
            pressed = SddsServTheme.colors.textDefaultPositiveActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkNegativeColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultNegative.asInteractive(
            pressed = SddsServTheme.colors.textDefaultNegativeActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkWarningColors(): ButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultWarning.asInteractive(
            pressed = SddsServTheme.colors.textDefaultWarningActive,
        ),
    )
}

private const val SEMITRANSPARENT_SPINNER_ALPHA = 0.06f
