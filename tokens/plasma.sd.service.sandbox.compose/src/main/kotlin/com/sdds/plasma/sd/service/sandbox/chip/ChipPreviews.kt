package com.sdds.plasma.sd.service.sandbox.chip

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.styles.chip.Accent
import com.sdds.plasma.sd.service.styles.chip.Default
import com.sdds.plasma.sd.service.styles.chip.L
import com.sdds.plasma.sd.service.styles.chip.M
import com.sdds.plasma.sd.service.styles.chip.Pilled
import com.sdds.plasma.sd.service.styles.chip.S
import com.sdds.plasma.sd.service.styles.chip.Secondary
import com.sdds.plasma.sd.service.styles.chip.Xs

@Composable
@Preview(showBackground = true)
internal fun ChipPreview() {
    SandboxTheme {
        Chip(
            style = Chip.M.Default.style(),
            label = "label",
            isSelected = true,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_accessibility_24),
                    contentDescription = "",
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview
internal fun ChipPreviewSizeLDefault() {
    SandboxTheme {
        Chip(
            style = Chip.L.Default.style(),
            label = "Label",
            onClick = {},
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_24),
                    contentDescription = null,
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close_24),
                    contentDescription = null,
                )
            },
            enabled = true,
        )
    }
}

@Composable
@Preview
internal fun ChipPreviewSizeXsSecondary() {
    SandboxTheme(darkTheme = true) {
        Chip(
            style = Chip.Xs.Secondary.style(),
            label = "Label",
            onClick = {},
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_24),
                    contentDescription = null,
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close_24),
                    contentDescription = null,
                )
            },
            enabled = true,
        )
    }
}

@Composable
@Preview
internal fun ChipPreviewSizeMAccent() {
    SandboxTheme {
        Chip(
            style = Chip.M.Accent.Pilled.style(),
            label = "Label",
            onClick = {},
            enabled = true,
        )
    }
}

@Composable
@Preview
internal fun ChipPreviewSizeSDisabled() {
    SandboxTheme {
        Chip(
            style = Chip.S.Default.style(),
            label = "Label",
            onClick = {},
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_24),
                    contentDescription = null,
                )
            },
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close_24),
                    contentDescription = null,
                )
            },
            enabled = false,
        )
    }
}
