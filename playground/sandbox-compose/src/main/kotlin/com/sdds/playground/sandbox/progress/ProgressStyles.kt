package com.sdds.playground.sandbox.progress

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.ProgressBarStyle
import com.sdds.compose.uikit.ProgressBarStyleBuilder
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

/**
 * Вариации стиля [ProgressBarStyle]
 * @author Малышев Александр on 25.10.2024
 */
internal val ProgressBar.Default: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultSolidDefault)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

internal val ProgressBar.Secondary: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultSolidTertiary)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

internal val ProgressBar.Accent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultAccent)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

internal val ProgressBar.GradientAccent: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.gradients.surfaceDefaultAccentGradient.first())
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

internal val ProgressBar.Positive: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultPositive)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

internal val ProgressBar.Warning: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultWarning)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }

internal val ProgressBar.Negative: ProgressBarStyleBuilder
    @Composable
    get() = ProgressBarStyle.builder()
        .colors {
            indicatorColor(SddsServTheme.colors.surfaceDefaultNegative)
            backgroundColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary)
        }
