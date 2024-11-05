package com.sdds.plasma.b2c.styles

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
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
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTheme

/**
 * Вариация [Button] цвета Default
 */
val ButtonStyleBuilder.Default: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkDefaultColors() }
    }.applyExclude(LinkButton) {
        colors { defaultColors() }
    }

/**
 * Вариация [Button] цвета Secondary
 */
val ButtonStyleBuilder.Secondary: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkSecondaryColors() }
    }.applyExclude(LinkButton) {
        colors { secondaryColors() }
    }

/**
 * Вариация [Button] цвета Accent
 */
val ButtonStyleBuilder.Accent: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkAccentColors() }
    }.applyExclude(LinkButton) {
        colors { accentColors() }
    }

/**
 * Вариация [Button] цвета Positive
 */
val ButtonStyleBuilder.Positive: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkPositiveColors() }
    }.applyExclude(LinkButton) {
        colors { positiveColors() }
    }

/**
 * Вариация [Button] цвета Warning
 */
val ButtonStyleBuilder.Warning: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkWarningColors() }
    }.applyExclude(LinkButton) {
        colors { warningColors() }
    }

/**
 * Вариация [Button] цвета Negative
 */
val ButtonStyleBuilder.Negative: ButtonStyleBuilder
    @Composable
    get() = applyFor(LinkButton) {
        colors { linkNegativeColors() }
    }.applyExclude(LinkButton) {
        colors { negativeColors() }
    }

/**
 * Вариация [Button] цвета Clear
 */
val ButtonStyleBuilder.Clear: ButtonStyleBuilder
    @Composable
    get() = applyExclude(LinkButton) {
        colors { clearColors() }
        spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
    }

/**
 * Вариация [Button] цвета Dark
 */
val ButtonStyleBuilder.Dark: ButtonStyleBuilder
    @Composable
    get() = applyExclude(LinkButton) {
        colors { darkColors() }
    }

/**
 * Вариация [Button] цвета Black
 */
val ButtonStyleBuilder.Black: ButtonStyleBuilder
    @Composable
    get() = applyExclude(LinkButton) {
        colors { blackColors() }
    }

/**
 * Вариация [Button] цвета White
 */
val ButtonStyleBuilder.White: ButtonStyleBuilder
    @Composable
    get() = applyExclude(LinkButton) {
        colors { whiteColors() }
    }

/**
 * Вариация [Button] со скругленными на 50% углами (figma: Pilled)
 */
val ButtonStyleBuilder.Pilled: ButtonStyleBuilder
    @Composable
    get() = applyExclude(LinkButton) {
        shape(CircleShape)
    }

/**
 * Стиль [BasicButton] размера L
 */
val BasicButton.L: ButtonStyleBuilder
    @Composable
    @ReadOnlyComposable
    get() = ButtonStyle.builder(this)
        .shape(PlasmaB2cTheme.shapes.roundL)
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
        .labelStyle(PlasmaB2cTheme.typography.bodyLBold)
        .valueStyle(PlasmaB2cTheme.typography.bodyLBold)

/**
 * Стиль [BasicButton] размера M
 */
val BasicButton.M: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(PlasmaB2cTheme.shapes.roundM)
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
        .labelStyle(PlasmaB2cTheme.typography.bodyMBold)
        .valueStyle(PlasmaB2cTheme.typography.bodyMBold)

/**
 * Стиль [BasicButton] размера S
 */
val BasicButton.S: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(PlasmaB2cTheme.shapes.roundM.adjustBy(all = (-2).dp))
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
        .labelStyle(PlasmaB2cTheme.typography.bodySBold)
        .valueStyle(PlasmaB2cTheme.typography.bodySBold)

/**
 * Стиль [BasicButton] размера XS
 */
val BasicButton.Xs: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(PlasmaB2cTheme.shapes.roundS)
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
        .labelStyle(PlasmaB2cTheme.typography.bodyXsBold)
        .valueStyle(PlasmaB2cTheme.typography.bodyXsBold)

/**
 * Стиль [IconButton] размера L
 */
val IconButton.L: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(PlasmaB2cTheme.shapes.roundL)
        .dimensions(
            Button.Dimensions(
                height = 56.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 16.dp),
                minWidth = 56.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            ),
        )
        .labelStyle(PlasmaB2cTheme.typography.bodyLBold)
        .valueStyle(PlasmaB2cTheme.typography.bodyLBold)

/**
 * Стиль [IconButton] размера M
 */
val IconButton.M: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(PlasmaB2cTheme.shapes.roundM)
        .dimensions(
            Button.Dimensions(
                height = 48.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 12.dp),
                minWidth = 48.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            ),
        )
        .labelStyle(PlasmaB2cTheme.typography.bodyMBold)
        .valueStyle(PlasmaB2cTheme.typography.bodyMBold)

/**
 * Стиль [IconButton] размера S
 */
val IconButton.S: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(PlasmaB2cTheme.shapes.roundM.adjustBy(all = (-2).dp))
        .dimensions(
            Button.Dimensions(
                height = 40.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 8.dp),
                minWidth = 40.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            ),
        )
        .labelStyle(PlasmaB2cTheme.typography.bodySBold)
        .valueStyle(PlasmaB2cTheme.typography.bodySBold)

/**
 * Стиль [IconButton] размера Xs
 */
val IconButton.Xs: ButtonStyleBuilder
    @Composable
    get() = ButtonStyle.builder(this)
        .shape(PlasmaB2cTheme.shapes.roundS)
        .dimensions(
            Button.Dimensions(
                height = 32.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 8.dp),
                minWidth = 32.dp,
                iconSize = 16.dp,
                spinnerSize = 16.dp,
            ),
        )
        .labelStyle(PlasmaB2cTheme.typography.bodyXsBold)
        .valueStyle(PlasmaB2cTheme.typography.bodyXsBold)

/**
 * Стиль [LinkButton] размера L
 */
val LinkButton.L: ButtonStyleBuilder
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
        .labelStyle(PlasmaB2cTheme.typography.bodyLBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultClear)
        }

/**
 * Стиль [LinkButton] размера M
 */
val LinkButton.M: ButtonStyleBuilder
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
        .labelStyle(PlasmaB2cTheme.typography.bodyMBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultClear)
        }

/**
 * Стиль [LinkButton] размера S
 */
val LinkButton.S: ButtonStyleBuilder
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
        .labelStyle(PlasmaB2cTheme.typography.bodySBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultClear)
        }

/**
 * Стиль [LinkButton] размера Xs
 */
val LinkButton.Xs: ButtonStyleBuilder
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
        .labelStyle(PlasmaB2cTheme.typography.bodyXsBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultClear)
        }

@Composable
private fun ButtonColorsBuilder.defaultColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textInversePrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textInversePrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaB2cTheme.colors.surfaceDefaultSolidDefault.asInteractive(
            pressed = PlasmaB2cTheme.colors.surfaceDefaultSolidDefaultActive,
        ),
    )
    valueColor(
        PlasmaB2cTheme.colors.textInverseSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textInverseSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.secondaryColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textDefaultPrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textDefaultPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondaryActive,
        ),
    )
    valueColor(
        PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textDefaultSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.accentColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaB2cTheme.colors.surfaceDefaultAccent.asInteractive(
            pressed = PlasmaB2cTheme.colors.surfaceDefaultAccentActive,
        ),
    )
    valueColor(
        PlasmaB2cTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.positiveColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaB2cTheme.colors.surfaceDefaultPositive.asInteractive(
            pressed = PlasmaB2cTheme.colors.surfaceDefaultPositiveActive,
        ),
    )
    valueColor(
        PlasmaB2cTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.negativeColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaB2cTheme.colors.surfaceDefaultNegative.asInteractive(
            pressed = PlasmaB2cTheme.colors.surfaceDefaultNegativeActive,
        ),
    )
    valueColor(
        PlasmaB2cTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.warningColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaB2cTheme.colors.surfaceDefaultWarning.asInteractive(
            pressed = PlasmaB2cTheme.colors.surfaceDefaultWarningActive,
        ),
    )
    valueColor(
        PlasmaB2cTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.clearColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textDefaultPrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textDefaultPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaB2cTheme.colors.surfaceDefaultClear.asInteractive(
            pressed = PlasmaB2cTheme.colors.surfaceDefaultClearActive,
        ),
    )
    valueColor(
        PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textDefaultSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.darkColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaB2cTheme.colors.surfaceOnLightTransparentDeep.asInteractive(
            pressed = PlasmaB2cTheme.colors.surfaceOnLightTransparentDeepActive,
        ),
    )
    valueColor(
        PlasmaB2cTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.blackColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaB2cTheme.colors.surfaceOnLightSolidDefault.asInteractive(
            pressed = PlasmaB2cTheme.colors.surfaceOnLightSolidDefaultActive,
        ),
    )
    valueColor(
        PlasmaB2cTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.whiteColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textOnLightPrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnLightPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaB2cTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
            pressed = PlasmaB2cTheme.colors.surfaceOnDarkSolidDefaultActive,
        ),
    )
    valueColor(
        PlasmaB2cTheme.colors.textOnLightSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textOnLightSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkDefaultColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textDefaultPrimary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textDefaultPrimaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkSecondaryColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textDefaultSecondary.asInteractive(
            pressed = PlasmaB2cTheme.colors.textDefaultSecondaryActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkAccentColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textDefaultAccent.asInteractive(
            pressed = PlasmaB2cTheme.colors.textDefaultAccentActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkPositiveColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textDefaultPositive.asInteractive(
            pressed = PlasmaB2cTheme.colors.textDefaultPositiveActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkNegativeColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textDefaultNegative.asInteractive(
            pressed = PlasmaB2cTheme.colors.textDefaultNegativeActive,
        ),
    )
}

@Composable
private fun ButtonColorsBuilder.linkWarningColors(): ButtonColorsBuilder = apply {
    contentColor(
        PlasmaB2cTheme.colors.textDefaultWarning.asInteractive(
            pressed = PlasmaB2cTheme.colors.textDefaultWarningActive,
        ),
    )
}

private const val SEMITRANSPARENT_SPINNER_ALPHA = 0.06f
