package com.sdds.playground.sandbox.buttons

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

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
            SandboxButton.Size.L -> SddsServTheme.shapes.roundL
            SandboxButton.Size.M -> SddsServTheme.shapes.roundM
            SandboxButton.Size.S -> SddsServTheme.shapes.roundS
            SandboxButton.Size.XS -> SddsServTheme.shapes.roundXs
        }

    /**
     * Вернет цвет контента [Color] для соответствующего [style]
     */
    @Composable
    fun contentColorFor(style: SandboxButton.Style): Color =
        when (style) {
            SandboxButton.Style.Default -> SddsServTheme.colors.textInversePrimary
            SandboxButton.Style.Secondary, SandboxButton.Style.Clear -> SddsServTheme.colors.textDefaultPrimary
            SandboxButton.Style.White -> SddsServTheme.colors.textOnLightPrimary
            else -> SddsServTheme.colors.textOnDarkPrimary
        }

    /**
     * Вернет цвет фона [Color] для соответствующего [style]
     */
    @Composable
    fun backgroundColorFor(style: SandboxButton.Style): Color =
        when (style) {
            SandboxButton.Style.Default -> SddsServTheme.colors.surfaceDefaultSolidDefault
            SandboxButton.Style.Secondary -> SddsServTheme.colors.surfaceDefaultTransparentSecondary
            SandboxButton.Style.Accent -> SddsServTheme.colors.surfaceDefaultAccent
            SandboxButton.Style.Positive -> SddsServTheme.colors.surfaceDefaultPositive
            SandboxButton.Style.Negative -> SddsServTheme.colors.surfaceDefaultNegative
            SandboxButton.Style.Warning -> SddsServTheme.colors.surfaceDefaultWarning
            SandboxButton.Style.Clear -> SddsServTheme.colors.surfaceDefaultClear
            SandboxButton.Style.Dark -> SddsServTheme.colors.surfaceOnLightTransparentDeep
            SandboxButton.Style.Black -> SddsServTheme.colors.surfaceOnLightSolidDefault
            SandboxButton.Style.White -> SddsServTheme.colors.surfaceOnDarkSolidDefault
        }

    /**
     * Вернет цвет фона [Color] в нажатом состоянии для соответствующего [style]
     */
    @Composable
    fun pressedBackgroundColorFor(style: SandboxButton.Style): Color =
        when (style) {
            SandboxButton.Style.Default -> SddsServTheme.colors.surfaceDefaultSolidDefaultActive
            SandboxButton.Style.Secondary -> SddsServTheme.colors.surfaceDefaultTransparentSecondaryActive
            SandboxButton.Style.Accent -> SddsServTheme.colors.surfaceDefaultAccentActive
            SandboxButton.Style.Positive -> SddsServTheme.colors.surfaceDefaultPositiveActive
            SandboxButton.Style.Negative -> SddsServTheme.colors.surfaceDefaultNegativeActive
            SandboxButton.Style.Warning -> SddsServTheme.colors.surfaceDefaultWarningActive
            SandboxButton.Style.Clear -> SddsServTheme.colors.surfaceDefaultClearActive
            SandboxButton.Style.Dark -> SddsServTheme.colors.surfaceOnLightTransparentDeepActive
            SandboxButton.Style.Black -> SddsServTheme.colors.surfaceOnLightSolidDefaultActive
            SandboxButton.Style.White -> SddsServTheme.colors.surfaceOnDarkSolidDefaultActive
        }

    /**
     * Вернет стиль текста [TextStyle] для соответствующего [size]
     */
    @Composable
    fun textStyleFor(size: SandboxButton.Size): TextStyle =
        when (size) {
            SandboxButton.Size.L -> SddsServTheme.typography.bodyLBold
            SandboxButton.Size.M -> SddsServTheme.typography.bodyMBold
            SandboxButton.Size.S -> SddsServTheme.typography.bodySBold
            SandboxButton.Size.XS -> SddsServTheme.typography.bodyXsBold
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
                iconSize = 16.dp,
                spinnerSize = 16.dp,
                iconMargin = 4.dp,
                valueMargin = 2.dp,
            )
        }
}
