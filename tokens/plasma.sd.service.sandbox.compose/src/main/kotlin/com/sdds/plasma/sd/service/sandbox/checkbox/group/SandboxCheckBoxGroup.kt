package com.sdds.plasma.sd.service.sandbox.checkbox.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.plasma.sd.service.sandbox.SandboxTheme
import com.sdds.plasma.sd.service.styles.M

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
