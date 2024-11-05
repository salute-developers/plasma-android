package com.sdds.plasma.b2c.sandbox.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextField
import com.sdds.icons.R
import com.sdds.plasma.b2c.sandbox.SandboxTheme
import com.sdds.plasma.b2c.styles.Default
import com.sdds.plasma.b2c.styles.Error
import com.sdds.plasma.b2c.styles.InnerLabel
import com.sdds.plasma.b2c.styles.L
import com.sdds.plasma.b2c.styles.M
import com.sdds.plasma.b2c.styles.Optional
import com.sdds.plasma.b2c.styles.OuterLabel
import com.sdds.plasma.b2c.styles.RequiredEnd
import com.sdds.plasma.b2c.styles.RequiredStart
import com.sdds.plasma.b2c.styles.S
import com.sdds.plasma.b2c.styles.Warning
import com.sdds.plasma.b2c.styles.Xs

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewL() {
    SandboxTheme {
        TextField(
            placeholderText = "Placeholder",
            value = TextFieldValue(text = "Value"),
            style = TextArea.L.Default.OuterLabel.RequiredStart.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewM() {
    SandboxTheme {
        TextField(
            placeholderText = "Placeholder",
            value = TextFieldValue(text = "Value"),
            style = TextArea.M.Error.InnerLabel.RequiredEnd.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewS() {
    SandboxTheme {
        TextField(
            placeholderText = "Placeholder",
            value = TextFieldValue(text = ""),
            style = TextArea.S.Warning.OuterLabel.Optional.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            chipsContent = {
                Chip(
                    label = "Chip",
                    endContent = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
                Chip(
                    label = "Chip",
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewXs() {
    SandboxTheme {
        TextField(
            placeholderText = "Placeholder",
            value = TextFieldValue(text = ""),
            style = TextArea.Xs.Default.RequiredStart.OuterLabel.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewDisabled() {
    SandboxTheme {
        TextField(
            placeholderText = "Placeholder",
            value = TextFieldValue(text = "Value"),
            style = TextArea.L.Default.OuterLabel.RequiredStart.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = false,
            endContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewReadOnly() {
    SandboxTheme {
        TextField(
            placeholderText = "Placeholder",
            value = TextFieldValue(text = "Value"),
            style = TextArea.M.Default.OuterLabel.Optional.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = true,
            enabled = true,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewFocused() {
    SandboxTheme {
        TextField(
            placeholderText = "Placeholder",
            value = TextFieldValue(text = ""),
            style = TextArea.S.Error.RequiredEnd.InnerLabel.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            chipsContent = {
                Chip(
                    label = "Chip",
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
                Chip(
                    label = "Chip",
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewTitleInsideNotVisible() {
    SandboxTheme {
        TextField(
            placeholderText = "Placeholder",
            value = TextFieldValue(text = ""),
            style = TextArea.Xs.Warning.InnerLabel.Optional.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewTextMovesToNextLines() {
    SandboxTheme {
        TextField(
            placeholderText = "Placeholder",
            value = TextFieldValue(
                text = "O Captain! my Captain! our fearful trip is done,\n" +
                    "The ship has weather’d every rack, the prize we sought is won",
            ),
            style = TextArea.M.Default.RequiredStart.OuterLabel.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewTitleNotDisplayedWithChips() {
    SandboxTheme {
        TextField(
            placeholderText = "Placeholder",
            value = TextFieldValue(text = ""),
            style = TextArea.L.Default.RequiredStart.InnerLabel.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = true,
            enabled = true,
            chipsContent = {
                Chip(
                    label = "Chip",
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
                Chip(
                    label = "Chip",
                    endContent = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
            },
        )
    }
}
