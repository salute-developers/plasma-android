package com.sdds.playground.sandbox.editable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Editable
import com.sdds.compose.uikit.EditableIconPlacement
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.Icon
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.serv.theme.SddsServTheme

@Composable
@Preview(showBackground = true)
private fun EditablePreview() {
    SandboxTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            var text by remember { mutableStateOf(TextFieldValue("Value")) }
            val focusRequester = remember { FocusRequester() }
            Editable(
                modifier = Modifier.focusRequester(focusRequester),
                style = EditableStyle.builder()
                    .textStyle(SddsServTheme.typography.headerH2Bold)
                    .colors {
                        textColor(Color.Black)
                        iconColor(Color.DarkGray)
                        cursorColor(Color.Cyan)
                    }
                    .dimensions {
                        iconSize(24.dp)
                        iconMargin(4.dp)
                    }
                    .style(),
                value = text,
                onValueChange = { text = it },
                iconPlacement = EditableIconPlacement.Relative,
                icon = {
                    Icon(
                        modifier = Modifier.clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() },
                        ) {
                            focusRequester.requestFocus()
                            text = text.copy(selection = TextRange(text.text.length))
                        },
                        painter = painterResource(com.sdds.icons.R.drawable.ic_edit_fill_16),
                        contentDescription = "",
                    )
                },
            )
        }
    }
}
