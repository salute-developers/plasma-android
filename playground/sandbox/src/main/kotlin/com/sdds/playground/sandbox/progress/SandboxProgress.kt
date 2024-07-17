package com.sdds.playground.sandbox.progress

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import com.sdds.compose.uikit.Progress
import com.sdds.playground.sandbox.progress.SandboxProgressSettingsProvider.progressBrushFor
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

@Composable
internal fun SandboxProgress(
    progress: Float,
    modifier: Modifier = Modifier,
    style: SandboxProgress.Style = SandboxProgress.Style.Default,
) {
    Progress(
        progress = progress,
        modifier = modifier,
        main = progressBrushFor(style),
        background = SolidColor(DefaultTheme.colors.surfaceDefaultTransparentSecondary),
    )
}

/**
 * Параметры компонента [SandboxProgress]
 */
internal object SandboxProgress {

    /**
     * Стиль
     */
    enum class Style {
        Default,
        Secondary,
        Accent,
        GradientAccent,
        Positive,
        Warning,
        Negative,
    }
}
