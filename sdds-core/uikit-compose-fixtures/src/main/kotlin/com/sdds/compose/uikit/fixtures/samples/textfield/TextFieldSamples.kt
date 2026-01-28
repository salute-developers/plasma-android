package com.sdds.compose.uikit.fixtures.samples.textfield

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextFieldHelperTextPlacement
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun TextField_Simple() {
    composableCodeSnippet {
        var value by remember { mutableStateOf(TextFieldValue("value")) }
        TextField(
            value = value,
            captionText = "Caption",
            labelText = "Label",
            placeholderText = "Placeholder",
            onValueChange = { value = it },
            startContent = {
                Icon(
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_add_fill_24),
                    contentDescription = "",
                    tint = Color.Black,
                )
            },
            chipsContent = { Chip(label = "Chip") },
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun TextField_Style() {
    composableCodeSnippet {
        TextFieldStyle.builder()
            .colors {
                captionColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Activated)
                            to placeholder(Color.LightGray, "/** Токен цвета */"),
                    ),
                )
                backgroundColor(
                    placeholder(Color.Yellow, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Activated)
                            to placeholder(Color.LightGray, "/** Токен цвета */"),
                    ),
                )
                optionalColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(),
                )
                valueColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(),
                )
                placeholderColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Activated)
                            to placeholder(Color.Black, "/** Токен цвета */"),
                    ),
                )
                indicatorColor(
                    placeholder(Color.Red, "/** Токен цвета */").asInteractive(),
                )
                startContentColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(),
                )
                endContentColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Pressed)
                            to placeholder(Color.Gray, "/** Токен цвета */"),
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Gray, "/** Токен цвета */"),
                    ),
                )
                endContentColorReadOnly(
                    placeholder(Color.Gray, "/** Токен цвета */").multiplyAlpha(0.4f)
                        .asInteractive(),
                )
                captionColorReadOnly(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(),
                )
                counterColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(),
                )
                backgroundColorReadOnly(
                    placeholder(Color.Black, "/** Токен цвета */").multiplyAlpha(0.4f)
                        .asInteractive(),
                )
                cursorColor(
                    placeholder(Color.Blue, "/** Токен цвета */").asInteractive(),
                )
                prefixColor(
                    placeholder(Color.Green, "/** Токен цвета */").asInteractive(),
                )
                suffixColor(
                    placeholder(Color.Green, "/** Токен цвета */").asInteractive(),
                )
            }
            .singleLine(true)
            .shape(
                placeholder(
                    RoundedCornerShape(8.dp),
                    "/** Токен формы(скругления) */",
                ).adjustBy(all = 0.0.dp),
            )
            .dimensions {
                optionalPadding(4.0.dp)
                helperTextPadding(4.0.dp)
                chipsPadding(6.0.dp)
                boxPaddingStart(8.0.dp)
                boxPaddingEnd(8.0.dp)
                boxPaddingTop(8.0.dp)
                boxPaddingBottom(8.0.dp)
                boxMinHeight(32.0.dp)
                alignmentLineHeight(32.0.dp)
                startContentPadding(4.0.dp)
                endContentPadding(4.0.dp)
                startContentSize(16.0.dp)
                endContentSize(16.0.dp)
            }
            .captionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .counterStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .captionPlacement(TextFieldHelperTextPlacement.Outer)
            .counterPlacement(TextFieldHelperTextPlacement.Outer)
            .valueStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .prefixStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .suffixStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .placeholderStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .chipGroupStyle(
                placeholder(
                    ChipGroupStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .labelPlacement(TextFieldLabelPlacement.None)
            .style()
    }
}
