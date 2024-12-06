package com.sdds.serv.styles.button.link

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.LinkButtonColorsBuilder
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.serv.theme.SddsServTheme

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
        .labelStyle(SddsServTheme.typography.bodyLBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(SddsServTheme.colors.surfaceDefaultClear)
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
        .labelStyle(SddsServTheme.typography.bodyMBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(SddsServTheme.colors.surfaceDefaultClear)
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
        .labelStyle(SddsServTheme.typography.bodySBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(SddsServTheme.colors.surfaceDefaultClear)
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
        .labelStyle(SddsServTheme.typography.bodyXsBold)
        .spinnerMode(Button.SpinnerMode.SemitransparentContent(SEMITRANSPARENT_SPINNER_ALPHA))
        .colors {
            backgroundColor(SddsServTheme.colors.surfaceDefaultClear)
        }

@Composable
private fun LinkButtonColorsBuilder.linkDefaultColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultPrimary.asInteractive(
            pressed = SddsServTheme.colors.textDefaultPrimaryActive,
        ),
    )
}

@Composable
private fun LinkButtonColorsBuilder.linkSecondaryColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultSecondary.asInteractive(
            pressed = SddsServTheme.colors.textDefaultSecondaryActive,
        ),
    )
}

@Composable
private fun LinkButtonColorsBuilder.linkAccentColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultAccent.asInteractive(
            pressed = SddsServTheme.colors.textDefaultAccentActive,
        ),
    )
}

@Composable
private fun LinkButtonColorsBuilder.linkPositiveColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultPositive.asInteractive(
            pressed = SddsServTheme.colors.textDefaultPositiveActive,
        ),
    )
}

@Composable
private fun LinkButtonColorsBuilder.linkNegativeColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultNegative.asInteractive(
            pressed = SddsServTheme.colors.textDefaultNegativeActive,
        ),
    )
}

@Composable
private fun LinkButtonColorsBuilder.linkWarningColors(): LinkButtonColorsBuilder = apply {
    contentColor(
        SddsServTheme.colors.textDefaultWarning.asInteractive(
            pressed = SddsServTheme.colors.textDefaultWarningActive,
        ),
    )
}

private const val SEMITRANSPARENT_SPINNER_ALPHA = 0.06f
