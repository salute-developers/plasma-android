package com.sdds.playground.sandbox.progress

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Progress
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.progress.SandboxProgressSettingsProvider.progressBrushFor
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

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
        background = SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary),
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

@Composable
@Preview(showBackground = true)
internal fun SandboxProgressPreviewDefault() {
    SandboxTheme {
        SandboxProgress(
            progress = 0.5f,
            modifier = Modifier.width(240.dp),
            style = SandboxProgress.Style.Default,
        )
    }
}

@Composable
@Preview
internal fun SandboxProgressPreviewNegative() {
    SandboxTheme {
        SandboxProgress(
            progress = 0.5f,
            modifier = Modifier.width(240.dp),
            style = SandboxProgress.Style.Negative,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxProgressPreviewWarning() {
    SandboxTheme {
        SandboxProgress(
            progress = 0.8f,
            modifier = Modifier.width(240.dp),
            style = SandboxProgress.Style.Warning,
        )
    }
}

@Composable
@Preview
internal fun SandboxProgressPreviewPositive() {
    SandboxTheme {
        SandboxProgress(
            progress = 0.5f,
            modifier = Modifier.width(240.dp),
            style = SandboxProgress.Style.Positive,
        )
    }
}

@Composable
@Preview
internal fun SandboxProgressPreviewDefaultDark() {
    SandboxTheme(darkTheme = true) {
        SandboxProgress(
            progress = 0.2f,
            modifier = Modifier.width(240.dp),
            style = SandboxProgress.Style.Default,
        )
    }
}
