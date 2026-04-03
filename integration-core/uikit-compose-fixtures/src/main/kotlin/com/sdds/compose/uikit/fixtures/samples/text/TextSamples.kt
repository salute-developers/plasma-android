package com.sdds.compose.uikit.fixtures.samples.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.Text
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Text_Simple() {
    composableCodeSnippet {
        Text(
            text = "Hello, world!",
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun TextStyle_Simple() {
    composableCodeSnippet {
        Text(
            text = "Hello, world",
            style = TextStyle(fontSize = 16.sp),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Text_Custom() {
    composableCodeSnippet {
        val text = buildAnnotatedString {
            append("Текст с ")
            withStyle(SpanStyle(color = Color.Red)) {
                append("цветным фрагментом")
            }
        }
        Text(
            text = text,
            style = TextStyle(fontSize = 16.sp),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Text_Style() {
    composableCodeSnippet {
        ProvideTextStyle(TextStyle(color = Color.Gray, fontSize = 20.sp)) {
            Column {
                Text("Заголовок")
                Text("Описание")
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun TextInlineContent_Simple() {
    composableCodeSnippet {
        val inlineContent = mapOf(
            "icon" to InlineTextContent(
                placeholder = Placeholder(16.sp, 16.sp, PlaceholderVerticalAlign.Center),
            ) {
                Icon(
                    imageVector = ImageVector.Builder(
                        name = "icon",
                        defaultWidth = 16.dp,
                        defaultHeight = 16.dp,
                        viewportWidth = 16f,
                        viewportHeight = 16f,
                    ).apply {
                        // путь
                    }
                        .build(),
                    contentDescription = null,
                )
            },
        )

        val text = buildAnnotatedString {
            append("Добавляем иконку")
            appendInlineContent("icon", "[icon]")
        }

        Text(
            text = text,
            inlineContent = inlineContent,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun TextFormat_Simple() {
    composableCodeSnippet {
        Text(
            text = "Длинное описание чего то, содержащее много строк",
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            softWrap = true,
        )
    }
}
