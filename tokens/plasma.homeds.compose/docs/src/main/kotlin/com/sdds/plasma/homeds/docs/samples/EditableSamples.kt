package com.sdds.plasma.homeds.docs.samples

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Editable
import com.sdds.compose.uikit.EditableIconPlacement
import com.sdds.compose.uikit.FormItem
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.docs.DocSample
import com.sdds.icons.R
import com.sdds.plasma.homeds.styles.editable.Editable
import com.sdds.plasma.homeds.styles.editable.H2
import com.sdds.plasma.homeds.styles.formitem.Default
import com.sdds.plasma.homeds.styles.formitem.FormItem

@Composable
@DocSample(needScreenshot = false)
fun Editable_WithFormItem() {
    composableCodeSnippet {
        FormItem(
            style = FormItem.Default.style(),
            caption = { Text("Caption is long enough") },
        ) {
            var text by remember { mutableStateOf(TextFieldValue("Value")) }
            Editable(
                modifier = Modifier.fillMaxWidth(),
                style = Editable.H2.style(),
                value = text,
                onValueChange = { text = it },
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Editable_WithFormItemAndIcon() {
    composableCodeSnippet {
        FormItem(
            style = FormItem.Default.style(),
            caption = { Text("Caption is long enough") },
        ) {
            var text by remember { mutableStateOf(TextFieldValue("Value")) }
            val focusRequester = remember { FocusRequester() }
            Editable(
                modifier = Modifier
                    .fillMaxWidth()
                    .focusRequester(focusRequester),
                style = Editable.H2.style(),
                value = text,
                onValueChange = { text = it },
                icon = {
                    Icon(
                        modifier = Modifier
                            .clickable(
                                indication = null,
                                interactionSource = remember { MutableInteractionSource() },
                            ) {
                                focusRequester.requestFocus()
                                text = text.copy(selection = TextRange(text.text.length))
                            },
                        painter = painterResource(R.drawable.ic_edit_fill_36),
                        contentDescription = null,
                    )
                },
                iconPlacement = EditableIconPlacement.Absolute,
                textAlign = TextAlign.Center,
            )
        }
    }
}
