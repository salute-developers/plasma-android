package com.sdds.serv.styles.button.icon

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.IconButtonColorsBuilder
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.serv.theme.SddsServTheme

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

val IconButton.M: IconButtonStyleBuilder
    @Composable
    get() = IconButtonStyleBuilder.builder(this)
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

val IconButton.S: IconButtonStyleBuilder
    @Composable
    get() = IconButtonStyleBuilder.builder(this)
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

val IconButton.Xs: IconButtonStyleBuilder
    @Composable
    get() = IconButtonStyleBuilder.builder(this)
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

@Composable
private fun IconButtonColorsBuilder.iconDefaultColors(): IconButtonColorsBuilder = apply {
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
}

@Composable
private fun IconButtonColorsBuilder.iconSecondaryColors(): IconButtonColorsBuilder = apply {
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
}

@Composable
private fun IconButtonColorsBuilder.iconAccentColors(): IconButtonColorsBuilder = apply {
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
}

@Composable
private fun IconButtonColorsBuilder.iconPositiveColors(): IconButtonColorsBuilder = apply {
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
}

@Composable
private fun IconButtonColorsBuilder.iconNegativeColors(): IconButtonColorsBuilder = apply {
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
}

@Composable
private fun IconButtonColorsBuilder.iconWarningColors(): IconButtonColorsBuilder = apply {
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
}

@Composable
private fun IconButtonColorsBuilder.iconClearColors(): IconButtonColorsBuilder = apply {
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
}

@Composable
private fun IconButtonColorsBuilder.iconDarkColors(): IconButtonColorsBuilder = apply {
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
}

@Composable
private fun IconButtonColorsBuilder.iconBlackColors(): IconButtonColorsBuilder = apply {
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
}

@Composable
private fun IconButtonColorsBuilder.iconWhiteColors(): IconButtonColorsBuilder = apply {
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
}
