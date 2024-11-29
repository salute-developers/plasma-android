package com.sdds.serv.styles.button.basic

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.BasicButtonColorsBuilder
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.serv.theme.SddsServTheme

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

val BasicButton.M: BasicButtonStyleBuilder
    @Composable
    get() = BasicButtonStyleBuilder.builder(this)
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

val BasicButton.S: BasicButtonStyleBuilder
    @Composable
    get() = BasicButtonStyleBuilder.builder(this)
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

val BasicButton.Xs: BasicButtonStyleBuilder
    @Composable
    get() = BasicButtonStyleBuilder.builder(this)
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

@Composable
private fun BasicButtonColorsBuilder.defaultColors(): BasicButtonColorsBuilder = apply {
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
private fun BasicButtonColorsBuilder.secondaryColors(): BasicButtonColorsBuilder = apply {
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
private fun BasicButtonColorsBuilder.accentColors(): BasicButtonColorsBuilder = apply {
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
private fun BasicButtonColorsBuilder.positiveColors(): BasicButtonColorsBuilder = apply {
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
private fun BasicButtonColorsBuilder.negativeColors(): BasicButtonColorsBuilder = apply {
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
private fun BasicButtonColorsBuilder.warningColors(): BasicButtonColorsBuilder = apply {
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
private fun BasicButtonColorsBuilder.clearColors(): BasicButtonColorsBuilder = apply {
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
private fun BasicButtonColorsBuilder.darkColors(): BasicButtonColorsBuilder = apply {
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
private fun BasicButtonColorsBuilder.blackColors(): BasicButtonColorsBuilder = apply {
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
private fun BasicButtonColorsBuilder.whiteColors(): BasicButtonColorsBuilder = apply {
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
