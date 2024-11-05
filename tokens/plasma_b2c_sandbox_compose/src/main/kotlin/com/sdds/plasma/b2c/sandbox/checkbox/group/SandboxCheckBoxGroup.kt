package com.sdds.plasma.b2c.sandbox.checkbox.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.playground.sandbox.SandboxTheme

/**
 * Превью [CheckBoxGroup]
 */
@Composable
@Preview(showBackground = true)
fun SandboxCheckBoxPreview() {
    SandboxTheme {
        CheckBoxGroup(
            style = CheckBoxGroup.M.style(),
            rootItem = CheckBoxGroup.RootItem(
                label = "label",
                description = "description",
            ),
            items = listOf(
                CheckBoxGroup.Item(
                    id = 1,
                    label = "label",
                    description = "description",
                    initialChecked = true,
                ),
                CheckBoxGroup.Item(
                    id = 2,
                    label = "label",
                    description = "description",
                    initialChecked = false,
                ),
            ),
        )
    }
}
