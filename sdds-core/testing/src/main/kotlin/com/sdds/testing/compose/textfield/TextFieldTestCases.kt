package com.sdds.testing.compose.textfield

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.icons.R

/**
 * Тест кейсы для TextField, TextFieldClear
 */

/**
 * PLASMA-T1501
 */
@Composable
fun TextFieldLDefaultInnerLeft(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T1517
 */
@Composable
fun TextFieldMSuccessOuterLabel(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T1554
 */
@Composable
fun TextFieldWarningInnerRight(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T1555
 */
@Composable
fun TextFieldXSErrorInner(style: TextFieldStyle) {
    TextField(
        value = TextFieldValue(text = ""),
        style = style,
        captionText = "Caption",
        labelText = "Label",
        optionalText = "",
        placeholderText = "Placeholder",
        onValueChange = {},
        enabled = true,
        readOnly = false,
    )
}

/**
 * PLASMA-T1556
 */
@Composable
fun TextFieldLSuccessRequiredLeftOuter(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    Box(modifier = Modifier.padding(start = 20.dp)) {
        TextField(
            value = value,
            style = style,
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

/**
 * PLASMA-T1557
 */
@Composable
fun TextFieldMWarningInnerLabelOptional(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T1558
 */
@Composable
fun TextFieldSReadOnly(style: TextFieldStyle) {
    TextField(
        value = TextFieldValue(text = ""),
        style = style,
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

/**
 * PLASMA-T1559
 */
@Composable
fun TextFieldXSSuccessOuterLabelOptional(style: TextFieldStyle) {
    TextField(
        value = TextFieldValue(text = "Value"),
        style = style,
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

/**
 * PLASMA-T1560
 */
@Composable
fun TextFieldLDisabled(style: TextFieldStyle) {
    TextField(
        value = TextFieldValue(text = ""),
        style = style,
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

/**
 * PLASMA-T1561
 */
@Composable
fun TextFieldMErrorOuterLabelOptional(style: TextFieldStyle) {
    TextField(
        value = TextFieldValue(text = ""),
        style = style,
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

/**
 * PLASMA-T1563
 */
@Composable
fun TextFieldSWarningInnerLabelRightFocused(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T1564
 */
@Composable
fun TextFieldMSuccessInnerLabelChips(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T1565
 */
@Composable
fun TextFieldSOuterLabelRightChips(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T962
 */
@Composable
fun TextFieldLInputText(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T1572
 */
@Composable
fun TextFieldLSuffixPrefix(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    Box(modifier = Modifier.padding(start = 20.dp)) {
        TextField(
            value = value,
            style = style,
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

/**
 * PLASMA-T1566
 */
@Composable
fun TextFieldClearLErrorInnerOptional(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T1567
 */
@Composable
fun TextFieldClearMWarningInnerRequiredLeft(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        TextField(
            value = value,
            style = style,
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

/**
 * PLASMA-T1568
 */
@Composable
fun TextFieldClearSDefaultOuterOptional(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T1569
 */
@Composable
fun TextFieldClearXSSuccessOuterRequiredRightFocused(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = value,
        style = style,
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

/**
 * PLASMA-T1570
 */
@Composable
fun TextFieldClearLDefaultInnerRequiredRight(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ) {
        TextField(
            value = value,
            style = style,
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

/**
 * PLASMA-T1571
 */
@Composable
fun TextFieldClearMErrorInnerRequiredLeft(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        TextField(
            value = value,
            style = style,
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

/**
 * PLASMA-T1920
 */
@Composable
fun TextFieldLSuffixPrefixCyrillic(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    Box(modifier = Modifier.padding(start = 20.dp)) {
        TextField(
            value = value,
            style = style,
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            prefix = "префикс",
            suffix = "суффикс",
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

/**
 * PLASMA-T1891
 */
@Composable
fun TextFieldLDisabledOuterLeft(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    Box(modifier = Modifier.padding(start = 20.dp)) {
        TextField(
            value = value,
            style = style,
            captionText = "Сaption",
            labelText = "Label",
            optionalText = "optional",
            placeholderText = "Placeholder",
            prefix = "",
            suffix = "",
            onValueChange = { value = it },
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
