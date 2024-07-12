package com.sdds.playground.sandbox.buttons

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

/**
 * Провайдер настроек кнопки для демо-приложения
 */
internal object SandboxButtonSettingsProvider {

    /**
     * Вернет форму [CornerBasedShape] для соответствующего [size]
     */
    @Composable
    fun shapeFor(size: SandboxButton.Size): CornerBasedShape =
        when (size) {
            SandboxButton.Size.L -> DefaultTheme.shapes.roundL
            SandboxButton.Size.M -> DefaultTheme.shapes.roundM
            SandboxButton.Size.S -> DefaultTheme.shapes.roundS
            SandboxButton.Size.XS -> DefaultTheme.shapes.roundXs
        }

    /**
     * Вернет цвет контента [Color] для соответствующего [style]
     */
    @Composable
    fun contentColorFor(style: SandboxButton.Style): Color =
        when (style) {
            SandboxButton.Style.Default -> DefaultTheme.colors.textInversePrimary
            SandboxButton.Style.Secondary, SandboxButton.Style.Clear -> DefaultTheme.colors.textDefaultPrimary
            SandboxButton.Style.White -> DefaultTheme.colors.textOnLightPrimary
            else -> DefaultTheme.colors.textOnDarkPrimary
        }

    /**
     * Вернет цвет фона [Color] для соответствующего [style]
     */
    @Composable
    fun backgroundColorFor(style: SandboxButton.Style): Color =
        when (style) {
            SandboxButton.Style.Default -> DefaultTheme.colors.surfaceDefaultSolidDefault
            SandboxButton.Style.Secondary -> DefaultTheme.colors.surfaceDefaultTransparentSecondary
            SandboxButton.Style.Accent -> DefaultTheme.colors.surfaceDefaultAccent
            SandboxButton.Style.Positive -> DefaultTheme.colors.surfaceDefaultPositive
            SandboxButton.Style.Negative -> DefaultTheme.colors.surfaceDefaultNegative
            SandboxButton.Style.Warning -> DefaultTheme.colors.surfaceDefaultWarning
            SandboxButton.Style.Clear -> DefaultTheme.colors.surfaceDefaultClear
            SandboxButton.Style.Dark -> DefaultTheme.colors.surfaceOnLightTransparentDeep
            SandboxButton.Style.Black -> DefaultTheme.colors.surfaceOnLightSolidDefault
            SandboxButton.Style.White -> DefaultTheme.colors.surfaceOnDarkSolidDefault
        }

    /**
     * Вернет стиль текста [TextStyle] для соответствующего [size]
     */
    @Composable
    fun textStyleFor(size: SandboxButton.Size): TextStyle =
        when (size) {
            SandboxButton.Size.L -> DefaultTheme.typography.bodyLBold
            SandboxButton.Size.M -> DefaultTheme.typography.bodyMBold
            SandboxButton.Size.S -> DefaultTheme.typography.bodySBold
            SandboxButton.Size.XS -> DefaultTheme.typography.bodyXsBold
        }

    /**
     * Вернет размеры [Button.Dimensions] кнопки с иконкой для соответствующего [size]
     */
    @Composable
    fun iconButtonDimensionsFor(size: SandboxButton.Size): Button.Dimensions =
        when (size) {
            SandboxButton.Size.L -> Button.Dimensions(
                height = 56.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 16.dp),
                minWidth = 56.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            )

            SandboxButton.Size.M -> Button.Dimensions(
                height = 48.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 12.dp),
                minWidth = 48.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            )

            SandboxButton.Size.S -> Button.Dimensions(
                height = 40.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 8.dp),
                minWidth = 40.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
            )

            SandboxButton.Size.XS -> Button.Dimensions(
                height = 32.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 8.dp),
                minWidth = 32.dp,
                iconSize = 16.dp,
                spinnerSize = 16.dp,
            )
        }

    /**
     * Вернет размеры [Button.Dimensions] кнопки с иконкой и текстом для соответствующего [size]
     */
    @Composable
    fun basicButtonDimensionsFor(size: SandboxButton.Size): Button.Dimensions =
        when (size) {
            SandboxButton.Size.L -> Button.Dimensions(
                height = 56.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 24.dp),
                minWidth = 98.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
                iconMargin = 8.dp,
                valueMargin = 4.dp,
            )

            SandboxButton.Size.M -> Button.Dimensions(
                height = 48.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 20.dp),
                minWidth = 84.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
                iconMargin = 6.dp,
                valueMargin = 4.dp,
            )

            SandboxButton.Size.S -> Button.Dimensions(
                height = 40.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 16.dp),
                minWidth = 71.dp,
                iconSize = 24.dp,
                spinnerSize = 22.dp,
                iconMargin = 4.dp,
                valueMargin = 4.dp,
            )

            SandboxButton.Size.XS -> Button.Dimensions(
                height = 32.dp,
                paddings = Button.Dimensions.PaddingValues(horizontal = 12.dp),
                minWidth = 57.dp,
                iconSize = 24.dp,
                spinnerSize = 16.dp,
                iconMargin = 4.dp,
                valueMargin = 2.dp,
            )
        }
}
