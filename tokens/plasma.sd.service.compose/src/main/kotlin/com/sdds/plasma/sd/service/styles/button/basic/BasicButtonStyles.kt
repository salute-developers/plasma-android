package com.sdds.plasma.sd.service.styles.button.basic

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.BasicButtonColorsBuilder
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme

/**
 * Вариация [Button] цвета Default
 */
val BasicButtonStyleBuilder.Default: BasicButtonStyleBuilder
    @Composable
    get() = colors { defaultColors() }

/**
 * Вариация [Button] цвета Secondary
 */
val BasicButtonStyleBuilder.Secondary: BasicButtonStyleBuilder
    @Composable
    get() = colors { secondaryColors() }

/**
 * Вариация [Button] цвета Accent
 */
val BasicButtonStyleBuilder.Accent: BasicButtonStyleBuilder
    @Composable
    get() = colors { accentColors() }

/**
 * Вариация [Button] цвета Positive
 */
val BasicButtonStyleBuilder.Positive: BasicButtonStyleBuilder
    @Composable
    get() = colors { positiveColors() }

/**
 * Вариация [Button] цвета Warning
 */
val BasicButtonStyleBuilder.Warning: BasicButtonStyleBuilder
    @Composable
    get() = colors { warningColors() }

/**
 * Вариация [Button] цвета Negative
 */
val BasicButtonStyleBuilder.Negative: BasicButtonStyleBuilder
    @Composable
    get() = colors { negativeColors() }

/**
 * Вариация [Button] цвета Clear
 */
val BasicButtonStyleBuilder.Clear: BasicButtonStyleBuilder
    @Composable
    get() = colors { clearColors() }

/**
 * Вариация [Button] цвета Dark
 */
val BasicButtonStyleBuilder.Dark: BasicButtonStyleBuilder
    @Composable
    get() = colors { darkColors() }

/**
 * Вариация [Button] цвета Black
 */
val BasicButtonStyleBuilder.Black: BasicButtonStyleBuilder
    @Composable
    get() = colors { blackColors() }

/**
 * Вариация [Button] цвета White
 */
val BasicButtonStyleBuilder.White: BasicButtonStyleBuilder
    @Composable
    get() = colors { whiteColors() }

/**
 * Вариация [Button] со скругленными на 50% углами (figma: Pilled)
 */
val BasicButtonStyleBuilder.Pilled: BasicButtonStyleBuilder
    @Composable
    get() = shape(CircleShape)

val BasicButton.L: BasicButtonStyleBuilder
    @Composable
    get() = BasicButtonStyleBuilder.builder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = (-2).dp))
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyLBold)

val BasicButton.M: BasicButtonStyleBuilder
    @Composable
    get() = BasicButtonStyleBuilder.builder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundM)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyMBold)

val BasicButton.S: BasicButtonStyleBuilder
    @Composable
    get() = BasicButtonStyleBuilder.builder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = (-2).dp))
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodySBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodySBold)

val BasicButton.Xs: BasicButtonStyleBuilder
    @Composable
    get() = BasicButtonStyleBuilder.builder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundS)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyXsBold)

@Composable
private fun BasicButtonColorsBuilder.defaultColors(): BasicButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textInversePrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textInversePrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefaultActive,
        ),
    )
    valueColor(
        PlasmaSdServiceTheme.colors.textInverseSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textInverseSecondaryActive,
        ),
    )
}

@Composable
private fun BasicButtonColorsBuilder.secondaryColors(): BasicButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondaryActive,
        ),
    )
    valueColor(
        PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
        ),
    )
}

@Composable
private fun BasicButtonColorsBuilder.accentColors(): BasicButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultAccent.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultAccentActive,
        ),
    )
    valueColor(
        PlasmaSdServiceTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun BasicButtonColorsBuilder.positiveColors(): BasicButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultPositive.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultPositiveActive,
        ),
    )
    valueColor(
        PlasmaSdServiceTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun BasicButtonColorsBuilder.negativeColors(): BasicButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultNegative.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultNegativeActive,
        ),
    )
    valueColor(
        PlasmaSdServiceTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun BasicButtonColorsBuilder.warningColors(): BasicButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultWarning.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultWarningActive,
        ),
    )
    valueColor(
        PlasmaSdServiceTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun BasicButtonColorsBuilder.clearColors(): BasicButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceDefaultClear.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.surfaceDefaultClearActive,
        ),
    )
    valueColor(
        PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
        ),
    )
}

@Composable
private fun BasicButtonColorsBuilder.darkColors(): BasicButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeep.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeepActive,
        ),
    )
    valueColor(
        PlasmaSdServiceTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun BasicButtonColorsBuilder.blackColors(): BasicButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefault.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefaultActive,
        ),
    )
    valueColor(
        PlasmaSdServiceTheme.colors.textOnDarkSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive,
        ),
    )
}

@Composable
private fun BasicButtonColorsBuilder.whiteColors(): BasicButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textOnLightPrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnLightPrimaryActive,
        ),
    )
    backgroundColor(
        PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefaultActive,
        ),
    )
    valueColor(
        PlasmaSdServiceTheme.colors.textOnLightSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textOnLightSecondaryActive,
        ),
    )
}
