package com.sdds.playground.sandbox.chip.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.styles.chip.Accent
import com.sdds.serv.styles.chip.Default
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chip.Pilled
import com.sdds.serv.styles.chip.S
import com.sdds.serv.styles.chip.Secondary
import com.sdds.serv.styles.chip.Xs

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
@Preview(showBackground = true)
internal fun ChipPreviewSizeLDefault() {
    SandboxTheme {
        Chip(
            style = Chip.L.Default.style(),
            label = "Label",
            onClick = {},
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
@Preview(showBackground = true)
internal fun ChipPreviewSizeMSecondaryPilled() {
    SandboxTheme {
        Chip(
            style = Chip.M.Secondary.Pilled.style(),
            label = "Label",
            onClick = {},
            enabled = true,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun ChipPreviewSizeSAccentDisabled() {
    SandboxTheme {
        Chip(
            style = Chip.S.Accent.style(),
            label = "Label",
            onClick = {},
            enabled = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun ChipPreviewSizeXSContentLeft() {
    SandboxTheme {
        Chip(
            style = Chip.Xs.Default.style(),
            label = "Label",
            onClick = {},
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_16),
                    contentDescription = null,
                )
            },
            enabled = true,
        )
    }
}
