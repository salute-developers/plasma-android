package com.sdds.compose.uikit.fixtures.samples.aiinput

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.ai.AiInput
import com.sdds.compose.uikit.ai.AiInputMode
import com.sdds.compose.uikit.ai.AiInputStyle
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun AiInput_Simple() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    composableCodeSnippet {
        AiInput(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "Введите сообщение") },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun AiInput_WithControls() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    composableCodeSnippet {
        AiInput(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "Введите сообщение") },
            startControls = {
                IconButton(iconRes = R.drawable.ic_ai_outline_24, onClick = { /* handle */ })
            },
            sendButton = {
                IconButton(iconRes = R.drawable.ic_arrow_up_24, onClick = { /* handle */ })
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun AiInput_WithContent() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    composableCodeSnippet {
        AiInput(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "Введите сообщение") },
            content = {
                File(label = "file.png")
            },
            sendButton = {
                IconButton(iconRes = R.drawable.ic_arrow_up_24, onClick = { /* handle */ })
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun AiInput_Extended() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    composableCodeSnippet {
        AiInput(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth(),
            style = AiInputStyle.builder().mode(AiInputMode.Extended).style(),
            placeholder = { Text(text = "Введите сообщение") },
            startControls = {
                IconButton(iconRes = R.drawable.ic_ai_outline_24, onClick = {})
            },
            sendButton = {
                IconButton(iconRes = R.drawable.ic_arrow_up_24, onClick = {})
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun AiInput_Style() {
    composableCodeSnippet {
        AiInputStyle.builder()
            .mode(AiInputMode.Condensed)
            .inputStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .placeholderStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .colors {
                backgroundColor(placeholder(Color.Transparent, "/** Токен цвета фона */"))
                inputColor(placeholder(Color.Black, "/** Токен цвета текста */"))
                placeholderColor(placeholder(Color.Gray, "/** Токен цвета placeholder */"))
                cursorColor(placeholder(Color.Black, "/** Токен цвета курсора */"))
            }
            .dimensions {
                paddingStart(0.dp)
                paddingEnd(0.dp)
                paddingTop(0.dp)
                paddingBottom(0.dp)
                textFieldPaddingStart(12.dp)
                textFieldPaddingEnd(12.dp)
                textFieldPaddingTop(8.dp)
                textFieldPaddingBottom(8.dp)
                contentPadding(8.dp)
            }
            .startButtonGroupStyle(
                placeholder(ButtonGroupStyle.builder().style(), "/** Стиль группы слева */"),
            )
            .endButtonGroupStyle(
                placeholder(ButtonGroupStyle.builder().style(), "/** Стиль группы справа */"),
            )
            .sendButtonStyle(
                placeholder(ButtonStyle.iconButtonBuilder().style(), "/** Стиль кнопки отправки */"),
            )
            .style()
    }
}
