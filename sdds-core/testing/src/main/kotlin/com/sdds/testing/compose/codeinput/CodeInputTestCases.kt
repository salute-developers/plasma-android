package com.sdds.testing.compose.codeinput

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.sdds.compose.uikit.CodeInput
import com.sdds.compose.uikit.CodeInputStyle

/**
 * Тест-кейсы для компонента [CodeInput]
 */

/**
 * Тест-кейс с четырёхзначным кодом
 */
@Composable
fun CodeInputCodeLengthFour(style: CodeInputStyle) {
    CodeInput(
        modifier = Modifier
            .testTag("CodeInput"),
        style = style,
        codeLength = 4,
        hidden = false,
        caption = "Caption",
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        captionAlignment = Alignment.Start,
        animationSpec = null,
    )
}

/**
 * Тест-кейс с пятизначным кодом
 */
@Composable
fun CodeInputCodeLengthFive(style: CodeInputStyle) {
    CodeInput(
        modifier = Modifier
            .testTag("CodeInput"),
        style = style,
        codeLength = 5,
        hidden = false,
        caption = "Caption",
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        captionAlignment = Alignment.CenterHorizontally,
        animationSpec = null,
    )
}

/**
 * Тест-кейс со скрытым кодом
 */
@Composable
fun CodeInputCodeLengthSixHidden(style: CodeInputStyle) {
    CodeInput(
        modifier = Modifier
            .testTag("CodeInput"),
        style = style,
        codeLength = 6,
        hidden = true,
        caption = "Caption",
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        enabled = true,
        captionAlignment = Alignment.CenterHorizontally,
        animationSpec = null,
    )
}

/**
 * Тест-кейс с шестизначным кодом
 */
@Composable
fun CodeInputCodeLengthSix(style: CodeInputStyle) {
    CodeInput(
        modifier = Modifier
            .testTag("CodeInput"),
        style = style,
        codeLength = 6,
        hidden = false,
        caption = "Caption",
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        captionAlignment = Alignment.CenterHorizontally,
    )
}

/**
 * Тест-кейс с четырёхзначным кодом без Caption
 */
@Composable
fun CodeInputCodeLengthSixNoCaption(style: CodeInputStyle) {
    CodeInput(
        modifier = Modifier
            .testTag("CodeInput"),
        style = style,
        codeLength = 6,
        hidden = false,
        caption = "",
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        captionAlignment = Alignment.CenterHorizontally,
        animationSpec = null,
    )
}
