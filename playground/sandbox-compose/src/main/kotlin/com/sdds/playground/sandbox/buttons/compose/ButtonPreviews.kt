package com.sdds.playground.sandbox.buttons.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonIcons
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.style.style
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.styles.button.basic.Accent
import com.sdds.serv.styles.button.basic.BasicButton
import com.sdds.serv.styles.button.basic.Clear
import com.sdds.serv.styles.button.basic.Dark
import com.sdds.serv.styles.button.basic.Default
import com.sdds.serv.styles.button.basic.L
import com.sdds.serv.styles.button.basic.M
import com.sdds.serv.styles.button.basic.Negative
import com.sdds.serv.styles.button.basic.Positive
import com.sdds.serv.styles.button.basic.S
import com.sdds.serv.styles.button.basic.Secondary
import com.sdds.serv.styles.button.basic.Warning
import com.sdds.serv.styles.button.basic.White
import com.sdds.serv.styles.button.basic.Xs
import com.sdds.serv.styles.button.icon.Accent
import com.sdds.serv.styles.button.icon.Clear
import com.sdds.serv.styles.button.icon.Dark
import com.sdds.serv.styles.button.icon.Default
import com.sdds.serv.styles.button.icon.IconButton
import com.sdds.serv.styles.button.icon.L
import com.sdds.serv.styles.button.icon.M
import com.sdds.serv.styles.button.icon.Negative
import com.sdds.serv.styles.button.icon.Pilled
import com.sdds.serv.styles.button.icon.Positive
import com.sdds.serv.styles.button.icon.S
import com.sdds.serv.styles.button.icon.Secondary
import com.sdds.serv.styles.button.icon.Warning
import com.sdds.serv.styles.button.icon.White
import com.sdds.serv.styles.button.icon.Xs
import com.sdds.serv.styles.button.link.Accent
import com.sdds.serv.styles.button.link.Default
import com.sdds.serv.styles.button.link.L
import com.sdds.serv.styles.button.link.LinkButton
import com.sdds.serv.styles.button.link.M
import com.sdds.serv.styles.button.link.S
import com.sdds.serv.styles.button.link.Warning
import com.sdds.serv.styles.button.link.Xs

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
            icons = ButtonIcons(start = painterResource(id = R.drawable.ic_plasma_24)),
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
            icons = ButtonIcons(end = painterResource(id = R.drawable.ic_plasma_24)),
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
            spacing = ButtonSpacing.Packed,
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
            icons = ButtonIcons(start = painterResource(id = R.drawable.ic_plasma_24)),
            spacing = ButtonSpacing.Packed,
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
            icons = ButtonIcons(start = painterResource(id = R.drawable.ic_plasma_16)),
            spacing = ButtonSpacing.SpaceBetween,
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
            icons = ButtonIcons(end = painterResource(id = R.drawable.ic_plasma_16)),
            spacing = ButtonSpacing.Packed,
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
            icons = ButtonIcons(end = painterResource(id = R.drawable.ic_plasma_16)),
            spacing = ButtonSpacing.Packed,
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
internal fun SandboxButtonPreviewSizeLWhite() {
    SandboxTheme {
        Button(
            style = BasicButton.L.White.style(),
            icons = ButtonIcons(end = painterResource(id = R.drawable.ic_plasma_24)),
            spacing = ButtonSpacing.Packed,
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
@Preview(showBackground = true)
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
@Preview(showBackground = true)
internal fun SandboxIconButtonPreviewLWhiteDarkTheme() {
    SandboxTheme {
        IconButton(
            style = IconButton.L.White.style(),
            icon = painterResource(id = R.drawable.ic_plasma_24),
            onClick = {},
            enabled = true,
            loading = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxLinkButtonPreviewSizeLDefault() {
    SandboxTheme {
        Button(
            style = LinkButton.L.Default.style(),
            label = "Label",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxLinkButtonPreviewSizeLIsLoading() {
    SandboxTheme {
        Button(
            style = LinkButton.L.Default.style(),
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
internal fun SandboxLinkButtonPreviewSizeMAccent() {
    SandboxTheme {
        Button(
            style = LinkButton.M.Accent.style(),
            icons = ButtonIcons(start = painterResource(id = R.drawable.ic_plasma_24)),
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
internal fun SandboxLinkButtonPreviewSizeLDisabled() {
    SandboxTheme {
        Button(
            style = LinkButton.L.Default.style(),
            spacing = ButtonSpacing.Packed,
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
internal fun SandboxLinkButtonPreviewSizeSWarning() {
    SandboxTheme {
        Button(
            style = LinkButton.S.Warning.style(),
            icons = ButtonIcons(end = painterResource(id = R.drawable.ic_plasma_24)),
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
internal fun SandboxLinkButtonPreviewSizeXSAccent() {
    SandboxTheme {
        Button(
            style = LinkButton.Xs.Accent.style(),
            label = "Label",
            enabled = true,
            loading = false,
            onClick = {},
        )
    }
}
