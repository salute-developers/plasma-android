package com.sdds.stylessalute.styles.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.ProgressBarStyleBuilder
import com.sdds.stylessalute.theme.StylesSaluteTheme

/**
 * Стиль [ProgressBar] цвета Default
 */
val ProgressBar.Default: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(StylesSaluteTheme.colors.surfaceDefaultSolidDefault)
            backgroundColor(StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Secondary
 */
val ProgressBar.Secondary: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(StylesSaluteTheme.colors.surfaceDefaultSolidTertiary)
            backgroundColor(StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Accent
 */
val ProgressBar.Accent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(StylesSaluteTheme.colors.surfaceDefaultAccentMain)
            backgroundColor(StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета GradientAccent
 */
val ProgressBar.GradientAccent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(StylesSaluteTheme.gradients.surfaceDefaultAccentGradient)
            backgroundColor(StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Positive
 */
val ProgressBar.Positive: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(StylesSaluteTheme.colors.surfaceDefaultPositive)
            backgroundColor(StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Warning
 */
val ProgressBar.Warning: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(StylesSaluteTheme.colors.surfaceDefaultWarning)
            backgroundColor(StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Negative
 */
val ProgressBar.Negative: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(StylesSaluteTheme.colors.surfaceDefaultNegative)
            backgroundColor(StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Info
 */
val ProgressBar.Info: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(StylesSaluteTheme.colors.surfaceDefaultInfo)
            backgroundColor(StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary)
        }
