package com.sdds.playground.sandbox.checkbox.compose.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.styles.checkbboxgroup.CheckBoxGroup
import com.sdds.serv.styles.checkbboxgroup.M

/**
 * Превью [CheckBoxGroup]
 */
@Composable
@Preview(showBackground = true)
fun SandboxCheckBoxPreview() {
    SandboxTheme {
        CheckBoxGroup(
            style = CheckBoxGroup.M.style(),
        ) {
            rootCheckbox {
                CheckBox(
                    state = ToggleableState.Indeterminate,
                    label = "label",
                    description = "description",
                )
            }
            checkbox {
                CheckBox(
                    checked = true,
                    label = "label",
                    description = "description",
                )
            }
            checkbox {
                CheckBox(
                    checked = false,
                    label = "label",
                    description = "description",
                )
            }
        }
    }
}
