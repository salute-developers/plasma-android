package com.sdds.testing.compose.textarea

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
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorMode
import com.sdds.icons.R

/**
 * Тест кейсы для TextArea, TextAreaClear
 */
/**
 * PLASMA-T1580
 */
@Composable
fun TextAreaLDefaultInnerLeft(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1918
 */
@Composable
fun TextAreaMDefaultOuterOptional(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1582
 */
@Composable
fun TextAreaSWarningInnerRight(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
    )
}

/**
 * PLASMA-T1583
 */
@Composable
fun TextAreaXsErrorInnerOptional(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_16),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1584
 */
@Composable
fun TextAreaLReadOnly(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    Box(modifier = Modifier.padding(start = 20.dp)) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholderText = "Placeholder",
            value = value,
            style = style,
            labelText = "Label",
            optionalText = "Optional",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = { value = it },
            readOnly = true,
            focusSelectorMode = FocusSelectorMode.None,
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

/**
 * PLASMA-T1585
 */
@Composable
fun TextAreaMWarningInnerOptional(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
    )
}

/**
 * PLASMA-T1586
 */
@Composable
fun TextAreaSDefaultInnerRight(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1919
 */
@Composable
fun TextAreaXSDefaultOuterOptional(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_16),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1588
 */
@Composable
fun TextAreaLDisabled(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "",
        counterText = "",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = false,
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_16),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1589
 */
@Composable
fun TextAreaMErrorOuterOptional(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
    )
}

/**
 * PLASMA-T1590
 */
@Composable
fun TextAreaSWarningInnerRightFocused(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
        endContent = {
            Icon(
                painter = painterResource(id = com.sdds.icons.R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1591
 */
@Composable
fun TextAreaMInnerOptionalChips(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
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

/**
 * PLASMA-T1592
 */
@Composable
fun TextAreaSDefaultOuterRightChips(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
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

/**
 * PLASMA-T1219
 */
@Composable
fun TextAreaSLongText(style: TextFieldStyle) {
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
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = { value = it },
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
    )
}

/**
 * PLASMA-T1617
 */
@Composable
fun TextAreaLDefaultTBTA(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
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

/**
 * PLASMA-T1593
 */
@Composable
fun TextAreaClearLErrorInnerOptional(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        TextField(
            value = value,
            style = style,
            captionText = "Сaption",
            counterText = "Counter",
            labelText = "Label",
            optionalText = "Optional",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            readOnly = false,
            focusSelectorMode = FocusSelectorMode.None,
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

/**
 * PLASMA-T1594
 */
@Composable
fun TextAreaClearMWarningRequiredStartInner(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        TextField(
            value = value,
            style = style,
            captionText = "Сaption",
            counterText = "",
            labelText = "Label",
            optionalText = "Optional",
            placeholderText = "",
            onValueChange = { value = it },
            readOnly = false,
            focusSelectorMode = FocusSelectorMode.None,
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

/**
 * PLASMA-T1595
 */
@Composable
fun TextAreaClearSDefaultOuterOptional(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        TextField(
            value = value,
            style = style,
            captionText = "",
            counterText = "Counter",
            labelText = "Label",
            optionalText = "Optional",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            readOnly = false,
            focusSelectorMode = FocusSelectorMode.None,
            enabled = true,
        )
    }
}

/**
 * PLASMA-T1928
 */
@Composable
fun TextAreaClearXsDefaultOuterRequireEndFocused(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        TextField(
            value = value,
            style = style,
            captionText = "Сaption",
            counterText = "Counter",
            labelText = "Label",
            optionalText = "Optional",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            readOnly = false,
            focusSelectorMode = FocusSelectorMode.None,
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

/**
 * PLASMA-T1597
 */
@Composable
fun TextAreaClearLDefaultChipsInnerRequiredEnd(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = value,
            style = style,
            labelText = "Label",
            optionalText = "Optional",
            placeholderText = "Placeholder",
            captionText = "Caption",
            counterText = "Counter",
            onValueChange = {},
            readOnly = false,
            focusSelectorMode = FocusSelectorMode.None,
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

/**
 * PLASMA-T1598
 */
@Composable
fun TextAreaClearMErrorInnerRequiredStart(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        TextField(
            value = value,
            style = style,
            captionText = "Сaption",
            counterText = "Counter",
            labelText = "",
            optionalText = "Optional",
            placeholderText = "",
            onValueChange = { value = it },
            readOnly = false,
            focusSelectorMode = FocusSelectorMode.None,
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

/**
 * PLASMA-T1944
 */
@Composable
fun TextAreaXlDefault(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("Value")) }
    TextField(
        modifier = Modifier.fillMaxWidth(),
        placeholderText = "Placeholder",
        value = value,
        style = style,
        labelText = "Label",
        optionalText = "Optional",
        captionText = "Caption",
        counterText = "Counter",
        onValueChange = {},
        readOnly = false,
        focusSelectorMode = FocusSelectorMode.None,
        enabled = true,
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
    )
}
