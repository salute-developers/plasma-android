package com.sdds.plasma.sd.service.styles.button.icon

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.IconButtonColorsBuilder
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.plasma.sd.service.tokens.compose.PlasmaSdServiceTheme

/**
 * Вариация [IconButton] цвета Default
 */
val IconButtonStyleBuilder.Default: IconButtonStyleBuilder
    @Composable
    get() = colors { iconDefaultColors() }

/**
 * Вариация [IconButton] цвета Secondary
 */
val IconButtonStyleBuilder.Secondary: IconButtonStyleBuilder
    @Composable
    get() = colors { iconSecondaryColors() }

/**
 * Вариация [IconButton] цвета Accent
 */
val IconButtonStyleBuilder.Accent: IconButtonStyleBuilder
    @Composable
    get() = colors { iconAccentColors() }

/**
 * Вариация [IconButton] цвета Positive
 */
val IconButtonStyleBuilder.Positive: IconButtonStyleBuilder
    @Composable
    get() = colors { iconPositiveColors() }

/**
 * Вариация [IconButton] цвета Warning
 */
val IconButtonStyleBuilder.Warning: IconButtonStyleBuilder
    @Composable
    get() = colors { iconWarningColors() }

/**
 * Вариация [IconButton] цвета Negative
 */
val IconButtonStyleBuilder.Negative: IconButtonStyleBuilder
    @Composable
    get() = colors { iconNegativeColors() }

/**
 * Вариация [IconButton] цвета Clear
 */
val IconButtonStyleBuilder.Clear: IconButtonStyleBuilder
    @Composable
    get() = colors { iconClearColors() }

/**
 * Вариация [IconButton] цвета Dark
 */
val IconButtonStyleBuilder.Dark: IconButtonStyleBuilder
    @Composable
    get() = colors { iconDarkColors() }

/**
 * Вариация [IconButton] цвета Black
 */
val IconButtonStyleBuilder.Black: IconButtonStyleBuilder
    @Composable
    get() = colors { iconBlackColors() }

/**
 * Вариация [IconButton] цвета White
 */
val IconButtonStyleBuilder.White: IconButtonStyleBuilder
    @Composable
    get() = colors { iconWhiteColors() }

/**
 * Вариация [IconButton] со скругленными на 50% углами (figma: Pilled)
 */
val IconButtonStyleBuilder.Pilled: IconButtonStyleBuilder
    @Composable
    get() = shape(CircleShape)

val IconButton.L: IconButtonStyleBuilder
    @Composable
    get() = IconButtonStyleBuilder.builder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundL)
        .dimensions(
            Button.Dimensions(
                height = 56.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 16.dp),
                minWidth = 56.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            ),
        )
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyLBold)

val IconButton.M: IconButtonStyleBuilder
    @Composable
    get() = IconButtonStyleBuilder.builder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .dimensions(
            Button.Dimensions(
                height = 48.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 12.dp),
                minWidth = 48.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            ),
        )
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyMBold)

val IconButton.S: IconButtonStyleBuilder
    @Composable
    get() = IconButtonStyleBuilder.builder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = (-2).dp))
        .dimensions(
            Button.Dimensions(
                height = 40.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 8.dp),
                minWidth = 40.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            ),
        )
        .labelStyle(PlasmaSdServiceTheme.typography.bodySBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodySBold)

val IconButton.Xs: IconButtonStyleBuilder
    @Composable
    get() = IconButtonStyleBuilder.builder(this)
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .dimensions(
            Button.Dimensions(
                height = 32.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 8.dp),
                minWidth = 32.dp,
                iconSize = 16.dp,
                spinnerSize = 16.dp,
            ),
        )
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyXsBold)

@Composable
private fun IconButtonColorsBuilder.iconDefaultColors(): IconButtonColorsBuilder = apply {
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
private fun IconButtonColorsBuilder.iconSecondaryColors(): IconButtonColorsBuilder = apply {
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
private fun IconButtonColorsBuilder.iconAccentColors(): IconButtonColorsBuilder = apply {
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
private fun IconButtonColorsBuilder.iconPositiveColors(): IconButtonColorsBuilder = apply {
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
private fun IconButtonColorsBuilder.iconNegativeColors(): IconButtonColorsBuilder = apply {
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
private fun IconButtonColorsBuilder.iconWarningColors(): IconButtonColorsBuilder = apply {
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
private fun IconButtonColorsBuilder.iconClearColors(): IconButtonColorsBuilder = apply {
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
private fun IconButtonColorsBuilder.iconDarkColors(): IconButtonColorsBuilder = apply {
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
private fun IconButtonColorsBuilder.iconBlackColors(): IconButtonColorsBuilder = apply {
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
private fun IconButtonColorsBuilder.iconWhiteColors(): IconButtonColorsBuilder = apply {
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
