package com.sdds.compose.uikit.fixtures.samples.answer

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.ai.Answer
import com.sdds.compose.uikit.ai.AnswerError
import com.sdds.compose.uikit.ai.AnswerLoading
import com.sdds.compose.uikit.ai.AnswerState
import com.sdds.compose.uikit.ai.AnswerStyle
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun Answer_Default() {
    composableCodeSnippet {
        Answer(
            title = { Text("Ответ ассистента") },
            content = {
                Text("SDDS Compose позволяет собрать ответ из обычных composable-слотов.")
            },
            actionsStart = {
                button { IconButton(iconRes = R.drawable.ic_copy_outline_24, onClick = {}) }
                button { IconButton(iconRes = R.drawable.ic_like_outline_24, onClick = {}) }
                button { IconButton(iconRes = R.drawable.ic_dislike_outline_24, onClick = {}) }
            },
            actionsEnd = {
                button { Button(label = "Повторить", onClick = {}) }
            },
            suggestions = {
                Chip(label = "Подробнее", onClick = {})
                Chip(label = "Кратко", onClick = {})
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Answer_LoadingCustom() {
    composableCodeSnippet {
        Answer(
            state = AnswerState.Loading,
            loading = {
                AnswerLoading(text = { Text("Ищем подходящий ответ") })
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Answer_ErrorCustom() {
    composableCodeSnippet {
        Answer(
            state = AnswerState.Error,
            error = {
                AnswerError(
                    title = { Text("Ответ недоступен") },
                    text = { Text("Попробуйте изменить запрос.") },
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Answer_Style() {
    composableCodeSnippet {
        AnswerStyle.builder()
            .colors {
                background(Color.Transparent)
                titleColor(Color.Black)
                contentColor(Color.DarkGray)
                loadingTextColor(Color.DarkGray)
            }
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .contentStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .loadingTextStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                paddingStart(0.dp)
                paddingEnd(0.dp)
                paddingTop(0.dp)
                paddingBottom(0.dp)
                contentGap(8.dp)
                actionsGap(12.dp)
                suggestionsGap(12.dp)
                loadingGap(8.dp)
            }
            .noteStyle(placeholder(NoteStyle.builder().style(), "/** Стиль Note */"))
            .loadingSpinnerStyle(placeholder(SpinnerStyle.builder().style(), "/** Стиль Spinner */"))
            .actionsStartButtonGroupStyle(placeholder(ButtonGroupStyle.builder().style(), "/** Стиль ButtonGroup */"))
            .actionsEndButtonGroupStyle(placeholder(ButtonGroupStyle.builder().style(), "/** Стиль ButtonGroup */"))
            .suggestionsChipGroupStyle(placeholder(ChipGroupStyle.builder().style(), "/** Стиль ChipGroup */"))
            .style()
    }
}
