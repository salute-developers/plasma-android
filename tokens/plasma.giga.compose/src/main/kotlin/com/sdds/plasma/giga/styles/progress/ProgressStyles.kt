package com.sdds.plasma.giga.styles.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.ProgressBarStyleBuilder
import com.sdds.plasma.giga.theme.PlasmaGigaTheme

/**
 * Стиль [ProgressBar] цвета Default
 */
val ProgressBar.Default: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaTheme.colors.surfaceDefaultSolidDefault)
            backgroundColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Secondary
 */
val ProgressBar.Secondary: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaTheme.colors.surfaceDefaultSolidTertiary)
            backgroundColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Accent
 */
val ProgressBar.Accent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaTheme.colors.surfaceDefaultAccent)
            backgroundColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета GradientAccent
 */
val ProgressBar.GradientAccent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaTheme.gradients.surfaceDefaultAccentGradient)
            backgroundColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Positive
 */
val ProgressBar.Positive: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaTheme.colors.surfaceDefaultPositive)
            backgroundColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Warning
 */
val ProgressBar.Warning: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaTheme.colors.surfaceDefaultWarning)
            backgroundColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Negative
 */
val ProgressBar.Negative: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaTheme.colors.surfaceDefaultNegative)
            backgroundColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Negative
 */
val ProgressBar.Info: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(PlasmaGigaTheme.colors.surfaceDefaultInfo)
            backgroundColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary)
        }
