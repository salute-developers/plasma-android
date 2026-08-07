package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.sdds.compose.uikit.CodeInput
import com.sdds.compose.uikit.CodeInputCaptionAlignment
import com.sdds.compose.uikit.CodeInputStyle

/**
 * Тест-кейс для CodeInput
 */
@Composable
fun CodeInputCodeLengthFourKmp(style: CodeInputStyle) {
    CodeInput(
        modifier = Modifier.testTag("CodeInput"),
        style = style,
        codeLength = 4,
        hidden = false,
        caption = "Caption",
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        captionAlignment = CodeInputCaptionAlignment.Start,
        animationSpec = null,
        hasItemFocusSelector = false,
    )
}

/**
 * Тест-кейс для CodeInput
 */
@Composable
fun CodeInputCodeLengthSixHiddenKmp(style: CodeInputStyle) {
    CodeInput(
        modifier = Modifier.testTag("CodeInput"),
        style = style,
        codeLength = 6,
        hidden = true,
        caption = "Caption",
        isItemValid = { it != "q" },
        onCodeComplete = { it == "1234" },
        captionAlignment = CodeInputCaptionAlignment.Center,
        animationSpec = null,
        hasItemFocusSelector = false,
    )
}
