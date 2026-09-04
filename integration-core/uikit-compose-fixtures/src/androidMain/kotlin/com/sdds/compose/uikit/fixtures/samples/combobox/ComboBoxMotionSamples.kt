package com.sdds.compose.uikit.fixtures.samples.combobox

import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ComboBox
import com.sdds.compose.uikit.ComboBoxTextField
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectState
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.motion.components.dropdownmenu.rememberDropdownMenuMotion
import com.sdds.compose.uikit.motion.components.textfield.TextFieldMotionStyle
import com.sdds.compose.uikit.motion.components.textfield.rememberTextFieldMotion
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.transition
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet

@Composable
@DocSample(needScreenshot = false)
fun ComboBox_Motion() {
    composableCodeSnippet {
        val state = remember { SelectState() }
        var value by remember { mutableStateOf("") }
        val fieldMotion = rememberTextFieldMotion(
            style = TextFieldMotionStyle.builder().backgroundColor(
                transition { segment {} changesWith { finite(tween(200)) } },
            ).style(),
        )
        // Передаётся существующий Motion меню. Доступные переходы задаёт DropdownMenuMotionStyle.
        val dropdownMotion = rememberDropdownMenuMotion()
        ComboBox(
            dropdownMotion = dropdownMotion,
            state = state,
            trigger = {
                ComboBoxTextField(
                    motion = fieldMotion,
                    value = value,
                    onValueChange = { value = it },
                    modifier = Modifier.width(260.dp),
                    style = TextFieldStyle.builder().colors {
                        backgroundColor(
                            Color.LightGray.asStatefulBrush(
                                setOf(InteractiveState.Activated) to Color.White,
                            ),
                        )
                    }.style(),
                )
            },
            listContent = {
                item {
                    SelectItem(
                        checked = value == "Москва",
                        onClick = {
                            value = "Москва"
                            state.close()
                        },
                        titleContent = { Text("Москва") },
                    )
                }
            },
        )
    }
}
