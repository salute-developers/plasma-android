package com.sdds.playground.sandbox.progress

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

internal object SandboxProgressSettingsProvider {
    @Composable
    fun progressBrushFor(style: SandboxProgress.Style): Brush {
        return when (style) {
            SandboxProgress.Style.Default -> SolidColor(StylesSaluteTheme.colors.surfaceDefaultSolidDefault)
            SandboxProgress.Style.Secondary -> SolidColor(StylesSaluteTheme.colors.surfaceDefaultSolidSecondary)
            SandboxProgress.Style.Accent -> SolidColor(StylesSaluteTheme.colors.surfaceDefaultAccent)
            SandboxProgress.Style.GradientAccent -> StylesSaluteTheme.gradients.surfaceDefaultAccentGradient.first()
            SandboxProgress.Style.Positive -> SolidColor(StylesSaluteTheme.colors.surfaceDefaultPositive)
            SandboxProgress.Style.Warning -> SolidColor(StylesSaluteTheme.colors.surfaceDefaultWarning)
            SandboxProgress.Style.Negative -> SolidColor(StylesSaluteTheme.colors.surfaceDefaultNegative)
        }
    }
}
