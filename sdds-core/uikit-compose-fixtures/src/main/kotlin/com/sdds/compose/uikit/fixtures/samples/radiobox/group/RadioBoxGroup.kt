package com.sdds.compose.uikit.fixtures.samples.radiobox.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.isChecked
import com.sdds.compose.uikit.updateSelection
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun RadioBoxGroup_Simple() {
    composableCodeSnippet {
        RadioBoxGroup(
            default = 1,
        ) { selection ->
            radioBoxItem(key = 1) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 2) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
            radioBoxItem(key = 3) { key ->
                RadioBox(
                    checked = isChecked(selection, key),
                    label = "Label",
                    description = "Description",
                    onClick = { updateSelection(selection, key) },
                )
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun RadioBoxGroup_Style() {
    composableCodeSnippet {
        RadioBoxGroupStyle.builder()
            .radioBoxStyle(
                placeholder(
                    RadioBoxStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .dimensions {
                itemSpacing(12.0.dp)
            }
            .style()
    }
}
