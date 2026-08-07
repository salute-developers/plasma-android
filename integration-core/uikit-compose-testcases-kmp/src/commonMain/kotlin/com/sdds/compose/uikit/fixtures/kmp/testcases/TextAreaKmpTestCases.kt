package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.icons.compose.SddsIcons
import com.sdds.icons.compose.Shazam24

/**
 * PLASMA-T1918
 */
@Composable
fun TextAreaMDefaultOuterOptionalKmp(style: TextFieldStyle) {
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
        onValueChange = { value = it },
        readOnly = false,
        focusSelectorSettings = FocusSelectorSettings.None,
        enabled = true,
        endContent = { TextAreaKmpEndIcon() },
    )
}

/**
 * PLASMA-T1219
 */
@Composable
fun TextAreaSLongTextKmp(style: TextFieldStyle) {
    var value by remember {
        mutableStateOf(
            TextFieldValue(
                "O Captain! my Captain! our fearful trip is done,\n" +
                    "The ship has weather'd every rack, the prize we sought is won,\n" +
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
        focusSelectorSettings = FocusSelectorSettings.None,
        enabled = true,
        endContent = { TextAreaKmpEndIcon() },
    )
}

@Composable
private fun TextAreaKmpEndIcon() {
    Icon(
        imageVector = SddsIcons.Shazam24,
        contentDescription = "",
    )
}
