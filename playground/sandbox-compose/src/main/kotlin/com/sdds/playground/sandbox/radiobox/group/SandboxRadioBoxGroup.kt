package com.sdds.playground.sandbox.radiobox.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.VerticalRadioBoxGroup
import com.sdds.playground.sandbox.SandboxTheme

/**
 * Превью RadioBoxGroup
 */
@Composable
@Preview(showBackground = true)
fun RadioBoxPreview() {
    SandboxTheme {
        VerticalRadioBoxGroup(
            items = listOf(
                RadioBoxGroup.Item(
                    id = 1,
                    label = "RadioBox 1",
                    description = "Description 1",
                ),
                RadioBoxGroup.Item(
                    id = 2,
                    label = "RadioBox 2",
                    description = "Description 2",
                ),
                RadioBoxGroup.Item(
                    id = 3,
                    label = "RadioBox 3",
                    description = "Description 3",
                ),
            ),
            default = 1,
        )
    }
}
