package com.sdds.plasma.b2c.styles

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.ProgressBarStyleBuilder
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTheme

/**
 * Стиль [ProgressBar] цвета Default
 */
val ProgressBar.Default: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaB2cTheme.colors.surfaceDefaultSolidDefault)
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Secondary
 */
val ProgressBar.Secondary: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaB2cTheme.colors.surfaceDefaultSolidTertiary)
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Accent
 */
val ProgressBar.Accent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaB2cTheme.colors.surfaceDefaultAccent)
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета GradientAccent
 */
val ProgressBar.GradientAccent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaB2cTheme.gradients.surfaceDefaultAccentGradient.first())
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Positive
 */
val ProgressBar.Positive: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaB2cTheme.colors.surfaceDefaultPositive)
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Warning
 */
val ProgressBar.Warning: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaB2cTheme.colors.surfaceDefaultWarning)
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Negative
 */
val ProgressBar.Negative: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaB2cTheme.colors.surfaceDefaultNegative)
            backgroundColor(PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondary)
        }
