package com.sdds.plasma.sd.service.sandbox.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.icons.R
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.styles.Accent
import com.sdds.plasma.sd.service.styles.Clear
import com.sdds.plasma.sd.service.styles.Dark
import com.sdds.plasma.sd.service.styles.Default
import com.sdds.plasma.sd.service.styles.L
import com.sdds.plasma.sd.service.styles.M
import com.sdds.plasma.sd.service.styles.Negative
import com.sdds.plasma.sd.service.styles.Pilled
import com.sdds.plasma.sd.service.styles.Positive
import com.sdds.plasma.sd.service.styles.S
import com.sdds.plasma.sd.service.styles.Secondary
import com.sdds.plasma.sd.service.styles.Warning
import com.sdds.plasma.sd.service.styles.White
import com.sdds.plasma.sd.service.styles.Xs

/**
 * Previews для тестирования
 */
@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeLDefault() {
    SandboxTheme {
        Button(
            style = BasicButton.L.Default.style(),
            label = "Label",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeMAccent() {
    SandboxTheme {
        Button(
            style = BasicButton.M.Accent.style(),
            icons = Button.Icons(start = painterResource(id = R.drawable.ic_plasma_24)),
            label = "Label",
            value = "",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeSWarning() {
    SandboxTheme {
        Button(
            style = BasicButton.S.Warning.style(),
            icons = Button.Icons(end = painterResource(id = R.drawable.ic_plasma_24)),
            label = "Label",
            value = "",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeXSDark() {
    SandboxTheme {
        Button(
            style = BasicButton.Xs.Dark.style(),
            label = "Label",
            value = "Value",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeLIsLoading() {
    SandboxTheme {
        Button(
            style = BasicButton.L.Default.style(),
            label = "Label",
            value = "",
            enabled = true,
            loading = true,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeLDisabled() {
    SandboxTheme {
        Button(
            style = BasicButton.L.Default.style(),
            spacing = Button.Spacing.Packed,
            label = "Label",
            value = "",
            enabled = false,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeLSecondary() {
    SandboxTheme {
        Button(
            style = BasicButton.L.Secondary.style(),
            icons = Button.Icons(start = painterResource(id = R.drawable.ic_plasma_24)),
            spacing = Button.Spacing.Packed,
            label = "Label",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeMSpaceBetween() {
    SandboxTheme {
        Button(
            style = BasicButton.M.Clear.style(),
            icons = Button.Icons(start = painterResource(id = R.drawable.ic_plasma_16)),
            spacing = Button.Spacing.SpaceBetween,
            label = "Label",
            value = "Value",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeSLongText() {
    SandboxTheme {
        Button(
            style = BasicButton.S.Positive.style(),
            icons = Button.Icons(end = painterResource(id = R.drawable.ic_plasma_16)),
            spacing = Button.Spacing.Packed,
            label = "LabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabel",
            value = "",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeXSNegative() {
    SandboxTheme {
        Button(
            style = BasicButton.Xs.Negative.style(),
            icons = Button.Icons(end = painterResource(id = R.drawable.ic_plasma_16)),
            spacing = Button.Spacing.Packed,
            label = "Label",
            value = "",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxButtonPreviewSizeLWhiteDarkTheme() {
    SandboxTheme(darkTheme = true) {
        Button(
            style = BasicButton.L.White.style(),
            icons = Button.Icons(end = painterResource(id = R.drawable.ic_plasma_24)),
            spacing = Button.Spacing.Packed,
            label = "Label",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxIconButtonPreviewLDefault() {
    SandboxTheme {
        IconButton(
            style = IconButton.L.Default.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@Preview
internal fun SandboxIconButtonPreviewMAccent() {
    SandboxTheme {
        IconButton(
            style = IconButton.M.Accent.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxIconButtonPreviewSWarning() {
    SandboxTheme {
        IconButton(
            style = IconButton.S.Warning.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxIconButtonPreviewXSDark() {
    SandboxTheme {
        IconButton(
            style = IconButton.Xs.Dark.style(),
            icon = painterResource(id = R.drawable.ic_plasma_16),
            onClick = {},
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxIconButtonPreviewIsLoading() {
    SandboxTheme {
        IconButton(
            style = IconButton.L.Default.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = true,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxIconButtonPreviewLDisabled() {
    SandboxTheme {
        IconButton(
            style = IconButton.L.Default.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = false,
            loading = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxIconButtonPreviewLSecondary() {
    SandboxTheme {
        IconButton(
            style = IconButton.L.Pilled.Secondary.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxIconButtonPreviewMClear() {
    SandboxTheme {
        IconButton(
            style = IconButton.M.Clear.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxIconButtonPreviewSPositive() {
    SandboxTheme {
        IconButton(
            style = IconButton.S.Positive.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxIconButtonPreviewXSNegative() {
    SandboxTheme {
        IconButton(
            style = IconButton.Xs.Pilled.Negative.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = true,
        )
    }
}

@Composable
@Preview
internal fun SandboxIconButtonPreviewLWhiteDarkTheme() {
    SandboxTheme(darkTheme = true) {
        IconButton(
            style = IconButton.L.White.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = false,
        )
    }
}