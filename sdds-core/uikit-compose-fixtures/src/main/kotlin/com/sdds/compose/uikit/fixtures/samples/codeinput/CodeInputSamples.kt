package com.sdds.compose.uikit.fixtures.samples.codeinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.CodeInput
import com.sdds.compose.uikit.CodeInputCaptionAlignment
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.CodeInputStyle
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun CodeInput_Simple() {
    composableCodeSnippet {
        val focusRequester = remember { FocusRequester() }
        val validCode = "123456"
        val invalidChar = "q"
        LaunchedEffect(Unit) { focusRequester.requestFocus() }
        CodeInput(
            modifier = Modifier.focusRequester(focusRequester),
            codeLength = 6,
            hidden = true,
            onCodeComplete = { it == validCode },
            isItemValid = { it != invalidChar },
            caption = "Caption",
            captionAlignment = CodeInputCaptionAlignment.Center,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun CodeInput_Style() {
    composableCodeSnippet {
        CodeInputStyle.builder()
            .codeStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .captionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .colors {
                codeColor(
                    placeholder(Color.Black, "/** Токен цвета */").asStatefulValue(
                        setOf(CodeInputStates.Error)
                            to placeholder(Color.Red, "/** Цвет в состоянии error */"),
                    ),
                )
                captionColor(
                    placeholder(Color.LightGray, "/** Токен типографики */").asStatefulValue(
                        setOf(CodeInputStates.Error)
                            to placeholder(Color.Red, "/** Цвет в состоянии error */"),
                    ),
                )
                fillColor(
                    placeholder(Color.Transparent, "/** Токен цвета */").asStatefulValue(
                        setOf(CodeInputStates.Error)
                            to placeholder(Color.Red, "/** Цвет в состоянии error */"),
                    ),
                )
                strokeColor(
                    placeholder(Color.Black, "/** Токен цвета */").asStatefulValue(
                        setOf(CodeInputStates.Error)
                            to placeholder(Color.Red, "/** Цвет в состоянии error */"),
                    ),
                )
            }
            .dimensions {
                circleSize(16.0.dp)
                strokeWidth(1.5.dp)
                itemHeight(36.0.dp)
                itemWidth(60.0.dp)
                itemSpacing(8.0.dp)
                groupSpacing(28.0.dp)
                captionPadding(28.0.dp)
            }
            .style()
    }
}
