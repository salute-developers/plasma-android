package com.sdds.playground.sandbox.textfield

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextField
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme

/**
 * Превью [TextField]
 */
@Composable
@Preview(showBackground = true, backgroundColor = 0x0)
internal fun SandboxTextFieldPreview() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("value")) }

        TextField(
            value = value,
            captionText = "Сaption",
            labelText = "Label",
            style = TextField.S.Warning.RequiredStart.OuterLabel.style(),
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_add_fill_24),
                    contentDescription = "",
                    tint = Color.Black,
                )
            },
            chipsContent = { Chip(label = "Chip") },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewXS() {
    SandboxTheme(darkTheme = true) {
        TextField(
            value = TextFieldValue(text = ""),
            style = TextField.Xs.Default.OuterLabel.RequiredEnd.style(),
            labelText = "Label",
            placeholderText = "Placeholder",
            captionText = "Caption",
            onValueChange = {},
            enabled = true,
            chipsContent = {
                Chip(
                    label = "Chip",
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                            contentDescription = "",
                        )
                    },
                )
                Chip(
                    label = "Chip",
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
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
internal fun SandboxTextFieldPreviewXsError() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = ""),
            style = TextField.Xs.Error.OuterLabel.Optional.style(),
            captionText = "Caption",
            labelText = "Label",
            placeholderText = "Placeholder",
            optionalText = "optional",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            leadingIcon = {
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
internal fun SandboxTextFieldPreviewLSuccess() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = "Value"),
            style = TextField.L.Success.OuterLabel.RequiredStart.style(),
            captionText = "",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewMWarning() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = "Value"),
            style = TextField.M.Warning.RequiredEnd.OuterLabel.style(),
            captionText = "",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewSDisabled() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = "Value"),
            style = TextField.S.Default.InnerLabel.RequiredEnd.style(),
            captionText = "",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = false,
            readOnly = false,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
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
internal fun SandboxTextFieldPreviewSSuccess() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = "Value"),
            style = TextField.S.Success.RequiredEnd.OuterLabel.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewSReadOnly() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = "Value"),
            style = TextField.S.Error.InnerLabel.RequiredStart.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = true,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewLInputText() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = "абвгдежзabcdefg@#643!#\$"),
            style = TextField.L.Warning.InnerLabel.Optional.style(),
            captionText = "",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewXsInputText() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = "абвгдежзabcdefg@#643!#\$"),
            style = TextField.Xs.Success.OuterLabel.RequiredEnd.style(),
            captionText = "",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewXsDotBadgeOutside() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = ""),
            style = TextField.Xs.Warning.OuterLabel.RequiredStart.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_16),
                    contentDescription = "",
                )
            },
            trailingIcon = {
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
internal fun SandboxTextFieldPreviewMDotBadgeInside() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = ""),
            style = TextField.M.Error.InnerLabel.RequiredEnd.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            trailingIcon = {
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
internal fun SandboxTextFieldPreviewXsChipsInside() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = ""),
            style = TextField.Xs.Warning.OuterLabel.Optional.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
            chipsContent = {
                Chip(
                    label = "Chip",
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                            contentDescription = "",
                        )
                    },
                )
                Chip(
                    label = "Chip",
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
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
internal fun SandboxTextFieldPreviewLSuffixPrefix() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = "Value"),
            style = TextField.L.Default.InnerLabel.Optional.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            prefix = "TB Prefix",
            suffix = "TA Suffix",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
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
internal fun SandboxTextFieldPreviewFocused() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = ""),
            style = TextField.L.Default.InnerLabel.RequiredStart.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            prefix = "",
            suffix = "",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
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
internal fun SandboxTextFieldPreviewTextDeletes() {
    SandboxTheme {
        TextField(
            modifier = Modifier
                .testTag("textField"),
            value = TextFieldValue(text = "Value"),
            style = TextField.L.Error.InnerLabel.RequiredEnd.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            prefix = "",
            suffix = "",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            leadingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
        )
    }
}
