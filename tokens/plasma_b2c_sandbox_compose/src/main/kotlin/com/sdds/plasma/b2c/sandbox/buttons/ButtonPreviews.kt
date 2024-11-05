package com.sdds.plasma.b2c.sandbox.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.IconButton
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme

/**
 * Previews для тестирования
 */
@Composable
@Preview
internal fun SandboxButtonPreviewSizeLDefault() {
    SandboxTheme {
        Button(
            style = BasicButton.L.Default.style(),
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
@Preview
internal fun SandboxButtonPreviewSizeXSDefault() {
    SandboxTheme {
        Button(
            style = BasicButton.Xs.Default.style(),
            icons = Button.Icons(start = painterResource(id = R.drawable.ic_plasma_16)),
            spacing = Button.Spacing.Packed,
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
internal fun SandboxButtonPreviewSizeMSecondary() {
    SandboxTheme {
        Button(
            style = BasicButton.M.Secondary.style(),
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
@Preview
internal fun SandboxButtonPreviewSizeSClear() {
    SandboxTheme {
        Button(
            style = BasicButton.S.Clear.style(),
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
@Preview
internal fun SandboxButtonPreviewSizeLPositive() {
    SandboxTheme {
        Button(
            style = BasicButton.L.Positive.style(),
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
@Preview
internal fun SandboxButtonPreviewSizeMNegative() {
    SandboxTheme {
        Button(
            style = BasicButton.M.Negative.style(),
            icons = Button.Icons(start = painterResource(id = R.drawable.ic_plasma_24)),
            spacing = Button.Spacing.Packed,
            label = "Label",
            value = "Value",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview
internal fun SandboxButtonPreviewSizeSWarning() {
    SandboxTheme {
        Button(
            style = BasicButton.S.Warning.style(),
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
@Preview
internal fun SandboxButtonPreviewSizeXsBlack() {
    SandboxTheme {
        Button(
            style = BasicButton.Xs.Black.style(),
            icons = Button.Icons(end = painterResource(id = R.drawable.ic_plasma_16)),
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
@Preview
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
@Preview
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
internal fun SandboxIconButtonPreviewMWarning() {
    SandboxTheme {
        IconButton(
            style = IconButton.M.Pilled.Warning.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@Preview
internal fun SandboxIconButtonPreviewSDisabled() {
    SandboxTheme {
        IconButton(
            style = IconButton.S.Positive.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = false,
            loading = false,
        )
    }
}

@Composable
@Preview
internal fun SandboxIconButtonPreviewXsLoading() {
    SandboxTheme {
        IconButton(
            style = IconButton.Xs.Pilled.Dark.style(),
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
