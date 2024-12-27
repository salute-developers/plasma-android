package com.sdds.playground.sandbox.radiobox.compose.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.isChecked
import com.sdds.compose.uikit.updateSelection
import com.sdds.playground.sandbox.SandboxTheme

/**
 * Превью RadioBoxGroup
 */
@Composable
@Preview(showBackground = true)
fun RadioBoxPreview() {
    SandboxTheme {
        RadioBoxGroup(default = 1) { selection ->
            radioBoxItem(key = 1) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "RadioBox 1",
                    description = "Description 1",
                    onClick = {
                        updateSelection(selection, key)
                    },
                )
            }
            radioBoxItem(key = 2) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "RadioBox 2",
                    description = "Description 2",
                    onClick = {
                        updateSelection(selection, key)
                    },
                )
            }
            radioBoxItem(key = 3) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "RadioBox 3",
                    description = "Description 3",
                    onClick = {
                        updateSelection(selection, key)
                    },
                )
            }
        }
    }
}
