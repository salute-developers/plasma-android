package com.sdds.playground.sandbox.textfield.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldClear
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.Error
import com.sdds.serv.styles.textfield.InnerLabel
import com.sdds.serv.styles.textfield.L
import com.sdds.serv.styles.textfield.M
import com.sdds.serv.styles.textfield.OuterLabel
import com.sdds.serv.styles.textfield.RequiredEnd
import com.sdds.serv.styles.textfield.RequiredStart
import com.sdds.serv.styles.textfield.S
import com.sdds.serv.styles.textfield.Success
import com.sdds.serv.styles.textfield.Warning
import com.sdds.serv.styles.textfield.Xs
import com.sdds.serv.styles.textfield.clear.Default
import com.sdds.serv.styles.textfield.clear.Error
import com.sdds.serv.styles.textfield.clear.InnerLabel
import com.sdds.serv.styles.textfield.clear.L
import com.sdds.serv.styles.textfield.clear.M
import com.sdds.serv.styles.textfield.clear.OuterLabel
import com.sdds.serv.styles.textfield.clear.RequiredEnd
import com.sdds.serv.styles.textfield.clear.RequiredStart
import com.sdds.serv.styles.textfield.clear.S
import com.sdds.serv.styles.textfield.clear.Success
import com.sdds.serv.styles.textfield.clear.Warning
import com.sdds.serv.styles.textfield.clear.Xs

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
            style = TextField.S.OuterLabel.RequiredStart.Warning.style(),
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            startContent = {
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
internal fun SandboxTextFieldPreviewLDefaultInnerLeft() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }

        TextField(
            value = value,
            style = TextField.L.InnerLabel.RequiredStart.Default.style(),
            labelText = "Label",
            placeholderText = "",
            captionText = "Caption",
            onValueChange = { value = it },
            enabled = true,
            readOnly = false,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldPreviewMSuccessOuterLabel() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            value = value,
            style = TextField.M.OuterLabel.Success.style(),
            captionText = "Caption",
            labelText = "Label",
            placeholderText = "Placeholder",
            optionalText = "optional",
            onValueChange = { value = it },
            enabled = true,
            readOnly = false,
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
internal fun SandboxTextFieldPreviewSWarningInnerRight() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            value = value,
            style = TextField.S.InnerLabel.RequiredEnd.Warning.style(),
            captionText = "Caption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            enabled = true,
            readOnly = false,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewXSErrorInner() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = ""),
            style = TextField.Xs.Error.style(),
            captionText = "Caption",
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
internal fun SandboxTextFieldPreviewLSuccessRequiredLeftOuter() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }
        Box(modifier = Modifier.padding(start = 20.dp)) {
            TextField(
                value = value,
                style = TextField.L.OuterLabel.RequiredStart.Success.style(),
                captionText = "Caption",
                labelText = "Label",
                optionalText = "",
                placeholderText = "",
                onValueChange = { value = it },
                enabled = true,
                readOnly = false,
                startContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                        contentDescription = "",
                    )
                },
                endContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_shazam_24),
                        contentDescription = "",
                    )
                },
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewMWarningInnerLabelOptional() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }

        TextField(
            value = value,
            style = TextField.M.InnerLabel.Warning.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "",
            onValueChange = { value = it },
            enabled = true,
            readOnly = false,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldPreviewSReadOnly() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = ""),
            style = TextField.S.InnerLabel.RequiredEnd.Default.style(),
            captionText = "Сaption",
            labelText = "",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = true,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldPreviewXSSuccessOuterLabelOptional() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = "Value"),
            style = TextField.Xs.OuterLabel.Success.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_16),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldPreviewLDisabled() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = ""),
            style = TextField.L.InnerLabel.RequiredStart.Default.style(),
            captionText = "",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = false,
            readOnly = false,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldPreviewMErrorOuterLabelOptional() {
    SandboxTheme {
        TextField(
            value = TextFieldValue(text = ""),
            style = TextField.M.OuterLabel.Error.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = {},
            enabled = true,
            readOnly = false,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldPreviewSWarningInnerLabelRightFocused() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            value = value,
            style = TextField.S.InnerLabel.RequiredEnd.Warning.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            prefix = "",
            suffix = "",
            onValueChange = { value = it },
            enabled = true,
            readOnly = false,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldPreviewMSuccessInnerLabelChips() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            value = value,
            style = TextField.M.InnerLabel.Success.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            enabled = true,
            readOnly = false,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldPreviewSOuterLabelRightChips() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            value = value,
            style = TextField.S.OuterLabel.RequiredEnd.Default.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            enabled = true,
            readOnly = false,
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
internal fun SandboxTextFieldPreviewLInputText() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            value = value,
            style = TextField.L.InnerLabel.Warning.style(),
            captionText = "",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            enabled = true,
            readOnly = false,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldPreviewLSuffixPrefix() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }
        Box(modifier = Modifier.padding(start = 20.dp)) {
            TextField(
                value = value,
                style = TextField.L.OuterLabel.RequiredStart.Default.style(),
                captionText = "Сaption",
                labelText = "Label",
                optionalText = "optional",
                placeholderText = "Placeholder",
                prefix = "TB Prefix",
                suffix = "TA Suffix",
                onValueChange = { value = it },
                enabled = true,
                readOnly = false,
                startContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                        contentDescription = "",
                    )
                },
                endContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_shazam_24),
                        contentDescription = "",
                    )
                },
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldClearLErrorInnerOptional() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            value = value,
            style = TextFieldClear.L.InnerLabel.Error.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            readOnly = false,
            enabled = true,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldClearMWarningInnerRequiredLeft() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            TextField(
                value = value,
                style = TextFieldClear.M.InnerLabel.RequiredStart.Warning.style(),
                captionText = "Сaption",
                labelText = "Label",
                optionalText = "optional",
                placeholderText = "Placeholder",
                onValueChange = { value = it },
                readOnly = false,
                enabled = true,
                startContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                        contentDescription = "",
                    )
                },
                endContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_shazam_24),
                        contentDescription = "",
                    )
                },
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldClearSDefaultOuterOptional() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            value = value,
            style = TextFieldClear.S.OuterLabel.Default.style(),
            captionText = "Сaption",
            labelText = "",
            optionalText = "Optional",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            readOnly = false,
            enabled = true,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldClearXSSuccessOuterRequiredRightFocused() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            value = value,
            style = TextFieldClear.Xs.OuterLabel.RequiredEnd.Success.style(),
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            readOnly = false,
            enabled = true,
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                    contentDescription = "",
                )
            },
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
internal fun SandboxTextFieldClearLDefaultInnerRequiredRight() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ) {
            TextField(
                value = value,
                style = TextFieldClear.L.InnerLabel.RequiredEnd.Default.style(),
                captionText = "Сaption",
                labelText = "Label",
                optionalText = "optional",
                placeholderText = "Placeholder",
                onValueChange = { value = it },
                readOnly = false,
                enabled = true,
                startContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                        contentDescription = "",
                    )
                },
                endContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_shazam_24),
                        contentDescription = "",
                    )
                },
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
internal fun SandboxTextFieldClearMErrorInnerRequiredLeft() {
    SandboxTheme {
        var value by remember { mutableStateOf(TextFieldValue("Value")) }
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            TextField(
                value = value,
                style = TextFieldClear.M.InnerLabel.RequiredStart.Error.style(),
                captionText = "Сaption",
                labelText = "",
                optionalText = "optional",
                placeholderText = "Placeholder",
                onValueChange = { value = it },
                readOnly = false,
                enabled = true,
                startContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                        contentDescription = "",
                    )
                },
                endContent = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_shazam_24),
                        contentDescription = "",
                    )
                },
            )
        }
    }
}
