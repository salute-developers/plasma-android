package com.sdds.compose.uikit.fixtures.samples.codefield

import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.sdds.compose.uikit.CodeField
import com.sdds.compose.uikit.CodeFieldCaptionAlignment
import com.sdds.compose.uikit.CodeFieldStyle
import com.sdds.compose.uikit.CodeInputStates
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun CodeField_Simple() {
    composableCodeSnippet {
        val focusRequester = remember { FocusRequester() }
        val validCode = "123456"
        val invalidChar = "q"
        LaunchedEffect(Unit) { focusRequester.requestFocus() }
        CodeField(
            modifier = Modifier.focusRequester(focusRequester),
            codeLength = 6,
            hidden = true,
            onCodeComplete = { it == validCode },
            isItemValid = { it != invalidChar },
            caption = "Caption",
            captionAlignment = CodeFieldCaptionAlignment.Center,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun CodeField_Style() {
    composableCodeSnippet {
        CodeFieldStyle.builder()
            .itemShape(
                placeholder(
                    RoundedCornerShape(8.0.dp),
                    "/** Токен формы (скругления) */",
                ),
            )
            .groupShape(
                placeholder(
                    RoundedCornerShape(8.0.dp),
                    "/** Токен формы (скругления) */",
                ),
            )
            .valueStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .captionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .colors {
                valueColor(
                    placeholder(Color.Red, "/** Токен цвета */").asStatefulValue(
                        setOf(CodeInputStates.Error)
                            to placeholder(Color.Red, "/** Токен цвета */"),
                    ),
                )
                captionColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asStatefulValue(
                        setOf(CodeInputStates.Error)
                            to placeholder(Color.Red, "/** Токен цвета */"),
                    ),
                )
                dotColor(
                    placeholder(Color.Black, "/** Токен цвета */").asStatefulValue(
                        setOf(CodeInputStates.Error)
                            to placeholder(Color.Red, "/** Токен цвета */"),
                    ),
                )
                backgroundColor(
                    placeholder(Color.DarkGray, "/** Токен цвета */").asStatefulValue(
                        setOf(CodeInputStates.Error)
                            to placeholder(Color.Transparent, "/** Токен цвета */"),
                        setOf(InteractiveState.Activated)
                            to placeholder(Color.Transparent, "/** Токен цвета */"),
                    ),
                )
                cursorColor(
                    placeholder(Color.Black, "/** Токен цвета */"),
                )
            }
            .dimensions {
                dotSize(16.0.dp)
                height(36.0.dp)
                width(60.0.dp)
                itemSpacing(8.0.dp)
                groupSpacing(28.0.dp)
                captionSpacing(28.0.dp)
            }
            .style()
    }
}
