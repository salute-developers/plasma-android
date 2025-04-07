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
import com.sdds.serv.styles.basicbutton.Accent
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Clear
import com.sdds.serv.styles.basicbutton.Dark
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.basicbutton.Negative
import com.sdds.serv.styles.basicbutton.Positive
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.basicbutton.Warning
import com.sdds.serv.styles.basicbutton.White
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.styles.iconbutton.Accent
import com.sdds.serv.styles.iconbutton.Clear
import com.sdds.serv.styles.iconbutton.Dark
import com.sdds.serv.styles.iconbutton.Default
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.L
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.Negative
import com.sdds.serv.styles.iconbutton.Pilled
import com.sdds.serv.styles.iconbutton.Positive
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Secondary
import com.sdds.serv.styles.iconbutton.Warning
import com.sdds.serv.styles.iconbutton.White
import com.sdds.serv.styles.iconbutton.Xs
import com.sdds.serv.styles.linkbutton.Accent
import com.sdds.serv.styles.linkbutton.Default
import com.sdds.serv.styles.linkbutton.L
import com.sdds.serv.styles.linkbutton.LinkButton
import com.sdds.serv.styles.linkbutton.M
import com.sdds.serv.styles.linkbutton.S
import com.sdds.serv.styles.linkbutton.Warning
import com.sdds.serv.styles.linkbutton.Xs

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
