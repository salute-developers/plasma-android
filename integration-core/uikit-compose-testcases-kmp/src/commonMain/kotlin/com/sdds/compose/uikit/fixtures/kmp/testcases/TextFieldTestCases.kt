package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.icons.compose.ScribbleDiagonal24
import com.sdds.icons.compose.SddsIcons
import com.sdds.icons.compose.Shazam24

/**
 * PLASMA-T1501
 */
@Composable
fun TextFieldLDefaultKmp(style: TextFieldStyle) {
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
        focusSelectorSettings = FocusSelectorSettings.None,
        startContent = { KmpStartIcon() },
        endContent = { KmpEndIcon() },
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
            focusSelectorSettings = FocusSelectorSettings.None,
            startContent = { KmpStartIcon() },
            endContent = { KmpEndIcon() },
        )
    }
}

/**
 * PLASMA-T1558
 */
@Composable
fun TextFieldSReadOnlyKmp(style: TextFieldStyle) {
    TextField(
        value = TextFieldValue(text = ""),
        style = style,
        captionText = "Caption",
        labelText = "",
        optionalText = "",
        placeholderText = "Placeholder",
        onValueChange = {},
        enabled = true,
        readOnly = true,
        focusSelectorSettings = FocusSelectorSettings.None,
        startContent = { KmpStartIcon() },
        endContent = { KmpEndIcon() },
    )
}

/**
 * PLASMA-T1560
 */
@Composable
fun TextFieldLDisabledKmp(style: TextFieldStyle) {
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
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASMA-T1566
 */
@Composable
fun TextFieldClearLErrorInnerOptionalKmp(style: TextFieldStyle) {
    var value by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = value,
        style = style,
        captionText = "Caption",
        labelText = "Label",
        optionalText = "optional",
        placeholderText = "Placeholder",
        onValueChange = { value = it },
        readOnly = false,
        enabled = true,
        focusSelectorSettings = FocusSelectorSettings.None,
        startContent = { KmpStartIcon() },
        endContent = { KmpEndIcon() },
    )
}

@Composable
private fun KmpStartIcon() {
    Icon(
        imageVector = SddsIcons.ScribbleDiagonal24,
        contentDescription = "",
    )
}

@Composable
private fun KmpEndIcon() {
    Icon(
        imageVector = SddsIcons.Shazam24,
        contentDescription = "",
    )
}
