package com.sdds.plasma.giga.app.styles.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.ProgressBarStyleBuilder
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme

/**
 * Стиль [ProgressBar] цвета Default
 */
val ProgressBar.Default: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefault)
            backgroundColor(PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Secondary
 */
val ProgressBar.Secondary: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaAppTheme.colors.surfaceDefaultSolidTertiary)
            backgroundColor(PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Accent
 */
val ProgressBar.Accent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaAppTheme.colors.surfaceDefaultAccent)
            backgroundColor(PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета GradientAccent
 */
val ProgressBar.GradientAccent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaAppTheme.gradients.surfaceDefaultAccentGradient)
            backgroundColor(PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Positive
 */
val ProgressBar.Positive: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaAppTheme.colors.surfaceDefaultPositive)
            backgroundColor(PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Warning
 */
val ProgressBar.Warning: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaAppTheme.colors.surfaceDefaultWarning)
            backgroundColor(PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Negative
 */
val ProgressBar.Negative: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaAppTheme.colors.surfaceDefaultNegative)
            backgroundColor(PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Negative
 */
val ProgressBar.Info: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaAppTheme.colors.surfaceDefaultInfo)
            backgroundColor(PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondary)
        }
