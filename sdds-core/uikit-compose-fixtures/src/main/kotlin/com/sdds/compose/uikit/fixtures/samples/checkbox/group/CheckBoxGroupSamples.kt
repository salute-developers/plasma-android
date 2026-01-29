package com.sdds.compose.uikit.fixtures.samples.checkbox.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun CheckBoxGroup_Simple() {
    composableCodeSnippet {
        CheckBoxGroup {
            rootCheckbox {
                CheckBox(
                    state = ToggleableState.On,
                    label = "Label",
                    description = "Description",
                )
            }
            checkbox {
                CheckBox(
                    state = ToggleableState.On,
                    label = "Label",
                    description = "Description",
                )
            }
            checkbox {
                CheckBox(
                    state = ToggleableState.On,
                    label = "Label",
                    description = "Description",
                )
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun CheckBoxGroup_Style() {
    composableCodeSnippet {
        CheckBoxGroupStyle.builder()
            .checkBoxStyle(placeholder(CheckBoxStyle.builder().style(), "/** Стиль компонента */"))
            .dimensions {
                itemSpacing(14.0.dp)
                itemOffset(36.0.dp)
            }
            .style()
    }
}
