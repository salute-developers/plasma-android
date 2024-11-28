package com.sdds.serv.styles.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.ProgressBarStyleBuilder
import com.sdds.serv.tokens.compose.SddsServTheme

/**
 * Стиль [ProgressBar] цвета Default
 */
val ProgressBar.Default: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultSolidDefault)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Secondary
 */
val ProgressBar.Secondary: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultSolidTertiary)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Accent
 */
val ProgressBar.Accent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultAccent)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета GradientAccent
 */
val ProgressBar.GradientAccent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.gradients.surfaceDefaultAccentGradient)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Positive
 */
val ProgressBar.Positive: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultPositive)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Warning
 */
val ProgressBar.Warning: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultWarning)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

/**
 * Стиль [ProgressBar] цвета Negative
 */
val ProgressBar.Negative: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }
