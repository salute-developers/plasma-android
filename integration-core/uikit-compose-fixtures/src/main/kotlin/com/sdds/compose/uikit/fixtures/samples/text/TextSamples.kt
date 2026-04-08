package com.sdds.compose.uikit.fixtures.samples.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.annotatedStringSource
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.stringSource
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Text_Simple() {
    composableCodeSnippet {
        Text(
            source = stringSource("Hello, world!"),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Text_String() {
    composableCodeSnippet {
        Text(
            source = stringSource("Текст со строковым источником"),
            style = TextStyle(fontSize = 16.sp),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Text_Annotated() {
    composableCodeSnippet {
        val text = buildAnnotatedString {
            append("Текст с ")
            withStyle(SpanStyle(color = Color.Red)) {
                append("цветным фрагментом")
            }
        }
        Text(
            source = annotatedStringSource(text),
            style = TextStyle(fontSize = 16.sp),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Text_ProvideStyle() {
    composableCodeSnippet {
        ProvideTextStyle(TextStyle(fontSize = 20.sp), color = { Color.Gray }) {
            Column {
                Text(source = stringSource("Заголовок"))
                Text(source = stringSource("Описание"))
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Text_InlineContent() {
    composableCodeSnippet {
        val inlineContent = mapOf(
            "icon" to InlineTextContent(
                placeholder = Placeholder(16.sp, 16.sp, PlaceholderVerticalAlign.Center),
            ) {
                Icon(
                    source = resourceImageSource(com.sdds.icons.R.drawable.ic_alarm_done_fill_36),
                    contentDescription = null,
                    brush = { Color.Red.asBrush() },
                )
            },
        )

        val text = buildAnnotatedString {
            append("Добавляем иконку")
            appendInlineContent("icon", "[icon]")
        }

        Text(
            source = annotatedStringSource(text),
            inlineContent = inlineContent,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Text_Formatting() {
    composableCodeSnippet {
        Text(
            source = stringSource("Длинное описание чего то, содержащее много строк"),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            softWrap = true,
        )
    }
}
