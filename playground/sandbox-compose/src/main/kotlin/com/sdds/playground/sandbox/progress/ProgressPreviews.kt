package com.sdds.playground.sandbox.progress

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ProgressBar
import com.sdds.playground.sandbox.SandboxTheme

@Composable
@Preview(showBackground = true)
internal fun ProgressPreviewDefault() {
    SandboxTheme {
        ProgressBar(
            progress = 0.5f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Default.style(),
        )
    }
}

@Composable
@Preview
internal fun ProgressPreviewNegative() {
    SandboxTheme {
        ProgressBar(
            progress = 0.5f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Negative.style(),
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun ProgressPreviewWarning() {
    SandboxTheme {
        ProgressBar(
            progress = 0.8f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Warning.style(),
        )
    }
}

@Composable
@Preview
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
@Preview
internal fun ProgressPreviewDefaultDark() {
    SandboxTheme(darkTheme = true) {
        ProgressBar(
            progress = 0.2f,
            modifier = Modifier.width(240.dp),
            style = ProgressBar.Default.style(),
        )
    }
}
