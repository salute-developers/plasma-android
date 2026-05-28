package com.sdds.compose.uikit.fixtures.samples.aiheader

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.AiHeader
import com.sdds.compose.uikit.AiHeaderStyle
import com.sdds.compose.uikit.AiHeaderTitleAlignment
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun AiHeader_Simple() {
    composableCodeSnippet {
        AiHeader(
            modifier = Modifier.fillMaxWidth(),
            titleContent = { Text(text = "Заголовок") },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun AiHeader_WithSubtitle() {
    composableCodeSnippet {
        AiHeader(
            modifier = Modifier.fillMaxWidth(),
            titleContent = { Text(text = "Заголовок") },
            subtitleContent = { Text(text = "Подзаголовок") },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun AiHeader_WithButtons() {
    composableCodeSnippet {
        AiHeader(
            modifier = Modifier.fillMaxWidth(),
            hasStartButton = true,
            hasEndButton = true,
            onStartButtonClick = { /* handle */ },
            onEndButtonClick = { /* handle */ },
            titleContent = { Text(text = "Заголовок") },
            subtitleContent = { Text(text = "Подзаголовок") },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun AiHeader_TitleAlignment() {
    composableCodeSnippet {
        AiHeader(
            modifier = Modifier.fillMaxWidth(),
            titleAlignment = AiHeaderTitleAlignment.Center,
            hasStartButton = true,
            hasEndButton = true,
            titleContent = { Text(text = "Заголовок") },
            subtitleContent = { Text(text = "Подзаголовок") },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun AiHeader_WithDivider() {
    composableCodeSnippet {
        AiHeader(
            modifier = Modifier.fillMaxWidth(),
            hasDivider = true,
            hasStartButton = true,
            hasEndButton = true,
            titleContent = { Text(text = "Заголовок") },
            subtitleContent = { Text(text = "Подзаголовок") },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun AiHeader_Style() {
    composableCodeSnippet {
        AiHeaderStyle.builder()
            .shape(placeholder(RoundedCornerShape(0.dp), "/** Токен формы (скругления) */"))
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .subtitleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .colors {
                backgroundColor(placeholder(Color.White, "/** Токен цвета */"))
                titleColor(placeholder(Color.Black, "/** Токен цвета */"))
                subtitleColor(placeholder(Color.Gray, "/** Токен цвета */"))
                dividerColor(placeholder(Color.LightGray, "/** Токен цвета */"))
            }
            .dimensions {
                paddingStart(0.0.dp)
                paddingEnd(0.0.dp)
                paddingTop(0.0.dp)
                paddingBottom(0.0.dp)
                textPaddingStart(10.0.dp)
                textPaddingEnd(10.0.dp)
                textPaddingTop(9.0.dp)
                textPaddingBottom(9.0.dp)
                subtitlePadding(4.0.dp)
                dividerThickness(1.0.dp)
            }
            .startButtonStyle(
                placeholder(ButtonStyle.iconButtonBuilder().style(), "/** Стиль кнопки слева */"),
            )
            .startButtonIcon(
                placeholder(
                    com.sdds.icons.R.drawable.ic_panel_sidebar_l_outline_16,
                    "/** Ресурс иконки кнопки слева */",
                ),
            )
            .endButtonStyle(
                placeholder(ButtonStyle.iconButtonBuilder().style(), "/** Стиль кнопки справа */"),
            )
            .endButtonIcon(
                placeholder(
                    com.sdds.icons.R.drawable.ic_close_16,
                    "/** Ресурс иконки кнопки справа */",
                ),
            )
            .style()
    }
}
