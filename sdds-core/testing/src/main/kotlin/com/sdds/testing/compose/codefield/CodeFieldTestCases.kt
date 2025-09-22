package com.sdds.testing.compose.codefield

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.sdds.compose.uikit.CodeField
import com.sdds.compose.uikit.CodeFieldCaptionAlignment
import com.sdds.compose.uikit.CodeFieldStyle

/**
 * Тест-кейсы для компонента [CodeField]
 */

/**
 * Тест-кейс с четырехзначным кодом
 */
@Composable
fun CodeFieldCodeLengthFour(style: CodeFieldStyle) {
    CodeField(
        modifier = Modifier
            .testTag("CodeField"),
        style = style,
        codeLength = 4,
        hidden = false,
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        caption = "Caption",
        captionAlignment = CodeFieldCaptionAlignment.Start,
        enabled = true,
        animationSpec = null,
    )
}

/**
 * Тест-кейс с четырехзначным кодом
 */
@Composable
fun CodeFieldCodeLengthFive(style: CodeFieldStyle) {
    CodeField(
        modifier = Modifier
            .testTag("CodeField"),
        style = style,
        codeLength = 5,
        hidden = false,
        isItemValid = { it != "q" },
        onCodeComplete = { it == "12345" },
        caption = "Caption",
        captionAlignment = CodeFieldCaptionAlignment.Center,
        enabled = true,
        animationSpec = null,
    )
}

/**
 * Тест-кейс со скрытым кодом
 */
@Composable
fun CodeFieldCodeHidden(style: CodeFieldStyle) {
    CodeField(
        modifier = Modifier
            .testTag("CodeField"),
        style = style,
        codeLength = 4,
        hidden = true,
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        caption = "Caption",
        captionAlignment = CodeFieldCaptionAlignment.Center,
        enabled = true,
        animationSpec = null,
    )
}

/**
 * Тест-кейс с шестизначным кодом
 */
@Composable
fun CodeFieldCodeLengthSix(style: CodeFieldStyle) {
    CodeField(
        modifier = Modifier
            .testTag("CodeField"),
        style = style,
        codeLength = 6,
        hidden = false,
        isItemValid = { it != "q" },
        onCodeComplete = { it == "123456" },
        caption = "Caption",
        captionAlignment = CodeFieldCaptionAlignment.Center,
        enabled = true,
        animationSpec = null,
    )
}

/**
 * Тест-кейс с шестизначным кодом без Caption
 */
@Composable
fun CodeFieldCodeLengthSixNoCaption(style: CodeFieldStyle) {
    CodeField(
        modifier = Modifier
            .testTag("CodeField"),
        style = style,
        codeLength = 6,
        hidden = false,
        isItemValid = { it != "q" },
        onCodeComplete = { it == "123456" },
        caption = "",
        captionAlignment = CodeFieldCaptionAlignment.Center,
        enabled = true,
        animationSpec = null,
    )
}

/**
 * Тест-кейс с длинным Caption
 */
@Composable
fun CodeFieldCodeLongText(style: CodeFieldStyle) {
    CodeField(
        modifier = Modifier
            .testTag("CodeField"),
        style = style,
        codeLength = 4,
        hidden = false,
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        caption = "Here is a very long caption to test the code field component",
        captionAlignment = CodeFieldCaptionAlignment.Center,
        enabled = true,
        animationSpec = null,
    )
}

/**
 * Тест-кейс с четырехзначным кодом и Caption center
 */
@Composable
fun CodeFieldCodeLengthFourCaptionCenter(style: CodeFieldStyle) {
    CodeField(
        modifier = Modifier
            .testTag("CodeField"),
        style = style,
        codeLength = 4,
        hidden = false,
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        caption = "Caption",
        captionAlignment = CodeFieldCaptionAlignment.Center,
        enabled = true,
        animationSpec = null,
    )
}
