package com.sdds.compose.uikit.fixtures.samples.autocomplete

import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Autocomplete
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fs.FocusSelectorSettings
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
fun Autocomplete_Motion() {
    composableCodeSnippet {
        var value by remember { mutableStateOf("") }
        var showDropdown by remember { mutableStateOf(false) }
        val suggestions = listOf("Москва", "Мурманск", "Самара").filter { it.contains(value, ignoreCase = true) }
        val fieldMotion = rememberTextFieldMotion(
            style = TextFieldMotionStyle.builder().backgroundColor(
                transition { segment {} changesWith { finite(tween(200)) } },
            ).style(),
        )
        val dropdownMotion = rememberDropdownMenuMotion()
        Autocomplete(
            dropdownMotion = dropdownMotion,
            style = AutocompleteStyle.builder().textFieldStyle(
                TextFieldStyle.builder().colors {
                    backgroundColor(
                        Color.LightGray.asStatefulBrush(setOf(InteractiveState.Focused) to Color.White),
                    )
                }.style(),
            ).style(),
            showDropdown = showDropdown,
            onDismissRequest = { showDropdown = false },
            field = {
                TextField(
                    value = value,
                    onValueChange = {
                        value = it
                        showDropdown = true
                    },
                    modifier = Modifier.width(260.dp),
                    placeholderText = "Город",
                    focusSelectorSettings = FocusSelectorSettings.None,
                    motion = fieldMotion,
                )
            },
            listContent = {
                items(suggestions.size) { index ->
                    ListItem(
                        text = suggestions[index],
                        modifier = Modifier.clickable {
                            value = suggestions[index]
                            showDropdown = false
                        },
                    )
                }
            },
        )
    }
}
