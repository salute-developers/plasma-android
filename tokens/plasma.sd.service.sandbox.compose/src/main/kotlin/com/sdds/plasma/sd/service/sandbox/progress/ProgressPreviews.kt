package com.sdds.plasma.sd.service.sandbox.progress

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ProgressBar
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.styles.progress.Accent
import com.sdds.plasma.sd.service.styles.progress.Default
import com.sdds.plasma.sd.service.styles.progress.GradientAccent
import com.sdds.plasma.sd.service.styles.progress.Negative
import com.sdds.plasma.sd.service.styles.progress.Positive
import com.sdds.plasma.sd.service.styles.progress.Secondary
import com.sdds.plasma.sd.service.styles.progress.Warning

@Composable
@Preview(showBackground = true)
internal fun ProgressPreviewDefault() {
    SandboxTheme {
        ProgressBar(
            progress = 0.25f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Default.style(),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun ProgressPreviewSecondary() {
    SandboxTheme {
        ProgressBar(
            progress = 0.25f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Secondary.style(),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun ProgressPreviewWarning() {
    SandboxTheme {
        ProgressBar(
            progress = 0.25f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Warning.style(),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun ProgressPreviewPositive() {
    SandboxTheme {
        ProgressBar(
            progress = 0.5f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Positive.style(),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun ProgressPreviewNegative() {
    SandboxTheme {
        ProgressBar(
            progress = 0.99f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Negative.style(),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun ProgressPreviewAccent() {
    SandboxTheme {
        ProgressBar(
            progress = 1f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Accent.style(),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun ProgressPreviewGradientAccent() {
    SandboxTheme {
        ProgressBar(
            progress = 0.5f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.GradientAccent.style(),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun ProgressPreviewDefaultValueOne() {
    SandboxTheme {
        ProgressBar(
            progress = 0.01f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Default.style(),
        )
    }
}
