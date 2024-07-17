package com.sdds.playground.sandbox.progress

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

internal object SandboxProgressSettingsProvider {
    @Composable
    fun progressBrushFor(style: SandboxProgress.Style): Brush {
        return when (style) {
            SandboxProgress.Style.Default -> SolidColor(DefaultTheme.colors.surfaceDefaultSolidDefault)
            SandboxProgress.Style.Secondary -> SolidColor(DefaultTheme.colors.surfaceDefaultSolidSecondary)
            SandboxProgress.Style.Accent -> SolidColor(DefaultTheme.colors.surfaceDefaultAccent)
            SandboxProgress.Style.GradientAccent -> DefaultTheme.gradients.surfaceDefaultAccentGradient.first()
            SandboxProgress.Style.Positive -> SolidColor(DefaultTheme.colors.surfaceDefaultPositive)
            SandboxProgress.Style.Warning -> SolidColor(DefaultTheme.colors.surfaceDefaultWarning)
            SandboxProgress.Style.Negative -> SolidColor(DefaultTheme.colors.surfaceDefaultNegative)
        }
    }
}
