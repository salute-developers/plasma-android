package com.sdds.plasma.sd.service.styles

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.LinkButtonColorsBuilder
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.plasma.sd.service.tokens.compose.PlasmaSdServiceTheme

/**
 * Вариация [LinkButton] цвета Default
 */
val LinkButtonStyleBuilder.Default: LinkButtonStyleBuilder
    @Composable
    get() = colors { linkDefaultColors() }

/**
 * Вариация [LinkButton] цвета Secondary
 */
val LinkButtonStyleBuilder.Secondary: LinkButtonStyleBuilder
    @Composable
    get() = colors { linkSecondaryColors() }

/**
 * Вариация [LinkButton] цвета Accent
 */
val LinkButtonStyleBuilder.Accent: LinkButtonStyleBuilder
    @Composable
    get() = colors { linkAccentColors() }

/**
 * Вариация [LinkButton] цвета Positive
 */
val LinkButtonStyleBuilder.Positive: LinkButtonStyleBuilder
    @Composable
    get() = colors { linkPositiveColors() }


/**
 * Вариация [LinkButton] цвета Warning
 */
val LinkButtonStyleBuilder.Warning: LinkButtonStyleBuilder
    @Composable
    get() = colors { linkWarningColors() }

/**
 * Вариация [LinkButton] цвета Negative
 */
val LinkButtonStyleBuilder.Negative: LinkButtonStyleBuilder
    @Composable
    get() = colors { linkNegativeColors() }

/**
 * Вариация [LinkButton] цвета Clear
 */
val LinkButtonStyleBuilder.Clear: LinkButtonStyleBuilder
    @Composable
    get() = colors { linkClearColors() }

/**
 * Вариация [LinkButton] цвета Dark
 */
val LinkButtonStyleBuilder.Dark: LinkButtonStyleBuilder
    @Composable
    get() = colors { linkDarkColors() }

/**
 * Вариация [LinkButton] цвета Black
 */
val LinkButtonStyleBuilder.Black: LinkButtonStyleBuilder
    @Composable
    get() = colors { linkBlackColors() }

/**
 * Вариация [LinkButton] цвета White
 */
val LinkButtonStyleBuilder.White: LinkButtonStyleBuilder
    @Composable
    get() = colors { linkWhiteColors() }

val LinkButton.L: LinkButtonStyleBuilder
    @Composable
    get() = LinkButtonStyleBuilder.builder(this)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear)
        }

val LinkButton.M: LinkButtonStyleBuilder
    @Composable
    get() = LinkButtonStyleBuilder.builder(this)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear)
        }

val LinkButton.S: LinkButtonStyleBuilder
    @Composable
    get() = LinkButtonStyleBuilder.builder(this)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodySBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear)
        }

val LinkButton.Xs: LinkButtonStyleBuilder
    @Composable
    get() = LinkButtonStyleBuilder.builder(this)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear)
        }

@Composable
private fun LinkButtonColorsBuilder.linkClearColors(): LinkButtonColorsBuilder = apply {
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
private fun LinkButtonColorsBuilder.linkDarkColors(): LinkButtonColorsBuilder = apply {
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
private fun LinkButtonColorsBuilder.linkBlackColors(): LinkButtonColorsBuilder = apply {
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
private fun LinkButtonColorsBuilder.linkWhiteColors(): LinkButtonColorsBuilder = apply {
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

@Composable
private fun LinkButtonColorsBuilder.linkDefaultColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
        ),
    )
}

@Composable
private fun LinkButtonColorsBuilder.linkSecondaryColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
        ),
    )
}

@Composable
private fun LinkButtonColorsBuilder.linkAccentColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textDefaultAccent.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textDefaultAccentActive,
        ),
    )
}

@Composable
private fun LinkButtonColorsBuilder.linkPositiveColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textDefaultPositiveActive,
        ),
    )
}

@Composable
private fun LinkButtonColorsBuilder.linkNegativeColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textDefaultNegativeActive,
        ),
    )
}

@Composable
private fun LinkButtonColorsBuilder.linkWarningColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(
            pressed = PlasmaSdServiceTheme.colors.textDefaultWarningActive,
        ),
    )
}

private const val SEMITRANSPARENT_SPINNER_ALPHA = 0.06f
