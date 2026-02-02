package com.sdds.compose.uikit.fixtures.samples.list

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun List_Simple() {
    composableCodeSnippet {
        com.sdds.compose.uikit.List {
            items(5) {
                val interactionSource = remember { MutableInteractionSource() }
                val isFocused = interactionSource.collectIsFocusedAsState()
                ListItem(
                    modifier = Modifier
                        .focusable(interactionSource = interactionSource)
                        .focusSelector(
                            settings = LocalFocusSelectorSettings.current,
                        ) { isFocused.value },
                    text = "List item title",
                    label = "List item label",
                    disclosureEnabled = true,
                    interactionSource = interactionSource,
                )
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun List_Style() {
    composableCodeSnippet {
        ListStyle.builder()
            .listItemStyle(
                placeholder(ListItemStyle.builder().style(), "/** Стиль компонента */"),
            )
            .style()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun ListItem_Style() {
    composableCodeSnippet {
        ListItemStyle.builder()
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токен формы (скругления) */"))
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
            .colors {
                titleColor(Color.Black)
                disclosureIconColor(Color.Gray)
                backgroundColor(Color.Transparent)
            }
            .dimensions {
                contentPaddingEnd(4.dp)
                height(32.dp)
                paddingStart(8.dp)
                paddingEnd(8.dp)
                paddingTop(8.dp)
                paddingBottom(8.dp)
            }
            .style()
    }
}
