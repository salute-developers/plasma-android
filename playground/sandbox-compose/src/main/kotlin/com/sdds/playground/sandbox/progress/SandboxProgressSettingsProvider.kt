package com.sdds.playground.sandbox.progress

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

internal object SandboxProgressSettingsProvider {
    @Composable
    fun progressBrushFor(style: SandboxProgress.Style): Brush {
        return when (style) {
            SandboxProgress.Style.Default -> SolidColor(SddsServTheme.colors.surfaceDefaultSolidDefault)
            SandboxProgress.Style.Secondary -> SolidColor(SddsServTheme.colors.surfaceDefaultSolidSecondary)
            SandboxProgress.Style.Accent -> SolidColor(SddsServTheme.colors.surfaceDefaultAccent)
            SandboxProgress.Style.GradientAccent -> SddsServTheme.gradients.surfaceDefaultAccentGradient.first()
            SandboxProgress.Style.Positive -> SolidColor(SddsServTheme.colors.surfaceDefaultPositive)
            SandboxProgress.Style.Warning -> SolidColor(SddsServTheme.colors.surfaceDefaultWarning)
            SandboxProgress.Style.Negative -> SolidColor(SddsServTheme.colors.surfaceDefaultNegative)
        }
    }
}
