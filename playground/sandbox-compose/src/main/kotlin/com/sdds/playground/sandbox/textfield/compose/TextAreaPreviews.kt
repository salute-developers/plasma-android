package com.sdds.playground.sandbox.textfield.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextArea
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.style.style
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.styles.textarea.Default
import com.sdds.serv.styles.textarea.Error
import com.sdds.serv.styles.textarea.InnerLabel
import com.sdds.serv.styles.textarea.L
import com.sdds.serv.styles.textarea.M
import com.sdds.serv.styles.textarea.OuterLabel
import com.sdds.serv.styles.textarea.RequiredEnd
import com.sdds.serv.styles.textarea.RequiredStart
import com.sdds.serv.styles.textarea.S
import com.sdds.serv.styles.textarea.Success
import com.sdds.serv.styles.textarea.Warning
import com.sdds.serv.styles.textarea.Xs

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewLDefaultInnerLeft() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.L.InnerLabel.RequiredStart.Default.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewMSuccessOuterOptional() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.M.OuterLabel.Success.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewSWarningInnerRight() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.S.InnerLabel.RequiredEnd.Warning.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewXsErrorInnerOptional() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.Xs.Error.style(),
            labelText = "",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewLReadOnly() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "",
            value = value,
            style = TextArea.L.OuterLabel.RequiredStart.Success.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "",
            counterText = "",
            onValueChange = {},
            readOnly = true,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewMWarningInnerOptional() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.M.InnerLabel.Warning.style(),
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
internal fun SandboxTextAreaPreviewSDefaultInnerRight() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.S.InnerLabel.RequiredEnd.Default.style(),
            labelText = "",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewXSSuccessOuterOptional() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.Xs.OuterLabel.Success.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewLDisabled() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.L.InnerLabel.RequiredStart.Default.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "",
            counterText = "",
            onValueChange = {},
            readOnly = false,
            enabled = false,
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewMErrorOuterOptional() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.M.OuterLabel.Error.style(),
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
internal fun SandboxTextAreaPreviewSWarningInnerRightFocused() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.S.InnerLabel.RequiredEnd.Warning.style(),
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
internal fun SandboxTextAreaPreviewMSuccessInnerOptionalChips() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.M.Success.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_24),
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
                            painter = painterResource(id = R.drawable.ic_close_24),
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
internal fun SandboxTextAreaPreviewSDefaultOuterRightChips() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.S.OuterLabel.RequiredEnd.Default.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
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
                            painter = painterResource(id = R.drawable.ic_close_24),
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
internal fun SandboxTextAreaPreviewSLongText() {
    SandboxTheme {
        var value by remember {
            mutableStateOf(
                TextFieldValue(
                    "O Captain! my Captain! our fearful trip is done,\n" +
                        "The ship has weather’d every rack, the prize we sought is won,\n" +
                        "The port is near, the bells I hear, the people all exulting,\n" +
                        "While follow eyes the steady keel, the vessel grim and daring;\n" +
                        "But O heart! heart! heart!\n" +
                        "O the bleeding drops of red,\n" +
                        "Where on the deck my Captain lies,\n" +
                        "                                  Fallen cold and dead.",
                ),
            )
        }

        TextField(
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.S.InnerLabel.Warning.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = { value = it },
            readOnly = false,
            enabled = true,
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewLDefaultTBTA() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = TextArea.L.InnerLabel.RequiredEnd.Default.style(),
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            prefix = "TB1!",
            suffix = "TA2@",
            endContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
        )
    }
}
