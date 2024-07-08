package com.sdds.playground.sandbox.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

/**
 * Провайдер настроек кнопки для демо-приложения
 */
object DefaultButtonSettingsProvider : Button.ButtonSettingsProvider {
    @Composable
    override fun shapeFor(size: Button.Size) =
        when (size) {
            Button.Size.L -> DefaultTheme.shapes.roundL
            Button.Size.M -> DefaultTheme.shapes.roundM
            Button.Size.S -> DefaultTheme.shapes.roundS
            Button.Size.XS -> DefaultTheme.shapes.roundXs
        }

    @Composable
    override fun contentColorFor(style: Button.Style) =
        when (style) {
            Button.Style.Default -> DefaultTheme.colors.textInversePrimary
            Button.Style.Secondary, Button.Style.Clear -> DefaultTheme.colors.textDefaultPrimary
            Button.Style.White -> DefaultTheme.colors.textOnLightPrimary
            else -> DefaultTheme.colors.textOnDarkPrimary
        }

    @Composable
    override fun backgroundColorFor(style: Button.Style) =
        when (style) {
            Button.Style.Default -> DefaultTheme.colors.surfaceDefaultSolidDefault
            Button.Style.Secondary -> DefaultTheme.colors.surfaceDefaultTransparentSecondary
            Button.Style.Accent -> DefaultTheme.colors.surfaceDefaultAccent
            Button.Style.Positive -> DefaultTheme.colors.surfaceDefaultPositive
            Button.Style.Negative -> DefaultTheme.colors.surfaceDefaultNegative
            Button.Style.Warning -> DefaultTheme.colors.surfaceDefaultWarning
            Button.Style.Clear -> DefaultTheme.colors.surfaceDefaultClear
            Button.Style.Dark -> DefaultTheme.colors.surfaceOnLightTransparentDeep
            Button.Style.Black -> DefaultTheme.colors.surfaceOnLightSolidDefault
            Button.Style.White -> DefaultTheme.colors.surfaceOnDarkSolidDefault
        }

    @Composable
    override fun textStyleFor(size: Button.Size) =
        when (size) {
            Button.Size.L -> DefaultTheme.typography.bodyLBold
            Button.Size.M -> DefaultTheme.typography.bodyMBold
            Button.Size.S -> DefaultTheme.typography.bodySBold
            Button.Size.XS -> DefaultTheme.typography.bodyXsBold
        }

    @Composable
    override fun iconButtonDimensionsFor(size: Button.Size): Button.Dimensions =
        when (size) {
            Button.Size.L -> Button.Dimensions(
                height = 56.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 16.dp),
                minWidth = 56.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            )

            Button.Size.M -> Button.Dimensions(
                height = 48.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 12.dp),
                minWidth = 48.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            )

            Button.Size.S -> Button.Dimensions(
                height = 40.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 8.dp),
                minWidth = 40.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            )

            Button.Size.XS -> Button.Dimensions(
                height = 32.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 8.dp),
                minWidth = 32.dp,
                iconSize = 16.dp,
                spinnerSize = 16.dp,
            )
        }
}
