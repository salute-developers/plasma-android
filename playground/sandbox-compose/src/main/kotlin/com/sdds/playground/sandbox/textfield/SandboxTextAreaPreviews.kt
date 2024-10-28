package com.sdds.playground.sandbox.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.CoreTextField
import com.sdds.compose.uikit.Icon
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.chip.L
import com.sdds.playground.sandbox.chip.S
import com.sdds.playground.sandbox.chip.Secondary

@Composable
@Preview(showBackground = true)
internal fun SandboxTextAreaPreviewL() {
    SandboxTheme {
        SandboxTextField(
            singleLine = false,
            size = SandboxTextField.Size.L,
            state = SandboxTextField.State.Default,
            placeholderText = "Placeholder",
            value = TextFieldValue(text = "Value"),
            labelPosition = CoreTextField.LabelPosition.Outer,
            dotBadgePosition = CoreTextField.DotBadge.Position.Start,
            fieldType = SandboxTextField.FieldType.Required,
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
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
internal fun SandboxTextAreaPreviewM() {
    SandboxTheme {
        SandboxTextField(
            singleLine = false,
            size = SandboxTextField.Size.M,
            state = SandboxTextField.State.Error,
            placeholderText = "Placeholder",
            value = TextFieldValue(text = "Value"),
            labelPosition = CoreTextField.LabelPosition.Inner,
            dotBadgePosition = CoreTextField.DotBadge.Position.End,
            fieldType = SandboxTextField.FieldType.Required,
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
        SandboxTextField(
            singleLine = false,
            size = SandboxTextField.Size.S,
            state = SandboxTextField.State.Warning,
            placeholderText = "Placeholder",
            value = TextFieldValue(text = ""),
            labelPosition = CoreTextField.LabelPosition.Outer,
            dotBadgePosition = CoreTextField.DotBadge.Position.Start,
            fieldType = SandboxTextField.FieldType.Optional,
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            chips = {
                Chip(
                    label = "Chip",
                    style = Chip.S.Secondary.style(),
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
                Chip(
                    label = "Chip",
                    style = Chip.S.Secondary.style(),
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
        SandboxTextField(
            singleLine = false,
            size = SandboxTextField.Size.XS,
            state = SandboxTextField.State.Default,
            placeholderText = "Placeholder",
            value = TextFieldValue(text = ""),
            labelPosition = CoreTextField.LabelPosition.Outer,
            dotBadgePosition = CoreTextField.DotBadge.Position.Start,
            fieldType = SandboxTextField.FieldType.Required,
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
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
internal fun SandboxTextAreaPreviewDisabled() {
    SandboxTheme {
        SandboxTextField(
            singleLine = false,
            size = SandboxTextField.Size.L,
            state = SandboxTextField.State.Default,
            placeholderText = "Placeholder",
            value = TextFieldValue(text = "Value"),
            labelPosition = CoreTextField.LabelPosition.Outer,
            dotBadgePosition = CoreTextField.DotBadge.Position.Start,
            fieldType = SandboxTextField.FieldType.Required,
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = false,
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
internal fun SandboxTextAreaPreviewReadOnly() {
    SandboxTheme {
        SandboxTextField(
            singleLine = false,
            size = SandboxTextField.Size.M,
            state = SandboxTextField.State.Default,
            placeholderText = "Placeholder",
            value = TextFieldValue(text = "Value"),
            labelPosition = CoreTextField.LabelPosition.Outer,
            dotBadgePosition = CoreTextField.DotBadge.Position.Start,
            fieldType = SandboxTextField.FieldType.Optional,
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
        SandboxTextField(
            singleLine = false,
            size = SandboxTextField.Size.S,
            state = SandboxTextField.State.Error,
            placeholderText = "Placeholder",
            value = TextFieldValue(text = ""),
            labelPosition = CoreTextField.LabelPosition.Inner,
            dotBadgePosition = CoreTextField.DotBadge.Position.End,
            fieldType = SandboxTextField.FieldType.Required,
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                    contentDescription = "",
                )
            },
            chips = {
                Chip(
                    label = "Chip",
                    style = Chip.S.Secondary.style(),
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
                Chip(
                    label = "Chip",
                    style = Chip.S.Secondary.style(),
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
        SandboxTextField(
            singleLine = false,
            size = SandboxTextField.Size.XS,
            state = SandboxTextField.State.Warning,
            placeholderText = "Placeholder",
            value = TextFieldValue(text = ""),
            labelPosition = CoreTextField.LabelPosition.Inner,
            dotBadgePosition = CoreTextField.DotBadge.Position.Start,
            fieldType = SandboxTextField.FieldType.Optional,
            labelText = "Label",
            optionalText = "Optional",
            captionText = "",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
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
internal fun SandboxTextAreaPreviewTextMovesToNextLines() {
    SandboxTheme {
        SandboxTextField(
            singleLine = false,
            size = SandboxTextField.Size.M,
            state = SandboxTextField.State.Default,
            placeholderText = "Placeholder",
            value = TextFieldValue(
                text = "O Captain! my Captain! our fearful trip is done,\n" +
                    "The ship has weather’d every rack, the prize we sought is won",
            ),
            labelPosition = CoreTextField.LabelPosition.Outer,
            dotBadgePosition = CoreTextField.DotBadge.Position.Start,
            fieldType = SandboxTextField.FieldType.Required,
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            enabled = true,
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
internal fun SandboxTextAreaPreviewTitleNotDisplayedWithChips() {
    SandboxTheme {
        SandboxTextField(
            singleLine = false,
            size = SandboxTextField.Size.L,
            state = SandboxTextField.State.Default,
            placeholderText = "Placeholder",
            value = TextFieldValue(text = ""),
            labelPosition = CoreTextField.LabelPosition.Inner,
            dotBadgePosition = CoreTextField.DotBadge.Position.Start,
            fieldType = SandboxTextField.FieldType.Required,
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = true,
            enabled = true,
            chips = {
                Chip(
                    label = "Chip",
                    style = Chip.L.Secondary.style(),
                    endContent = {
                        Icon(
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_24),
                            contentDescription = "",
                        )
                    },
                )
                Chip(
                    label = "Chip",
                    style = Chip.L.Secondary.style(),
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
