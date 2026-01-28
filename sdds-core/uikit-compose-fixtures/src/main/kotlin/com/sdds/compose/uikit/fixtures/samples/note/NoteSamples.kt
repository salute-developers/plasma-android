package com.sdds.compose.uikit.fixtures.samples.note

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ContentBeforeVerticalArrangement
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LocalLinkButtonStyle
import com.sdds.compose.uikit.Note
import com.sdds.compose.uikit.NoteCompact
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun NoteCompact_Simple() {
    composableCodeSnippet {
        NoteCompact(
            title = "Title",
            text = "Text",
            contentBefore = {
                Icon(
                    painter = painterResource(com.sdds.icons.R.drawable.ic_salute_outline_24),
                    contentDescription = null,
                )
            },
            action = {
                Button(
                    style = LocalLinkButtonStyle.current,
                    label = "Label",
                    onClick = {},
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Note_Simple() {
    composableCodeSnippet {
        Note(
            title = "Title",
            text = "Text",
            contentBefore = {
                Icon(
                    painter = painterResource(com.sdds.icons.R.drawable.ic_salute_outline_24),
                    contentDescription = null,
                )
            },
            action = {
                Button(
                    style = LocalLinkButtonStyle.current,
                    label = "Label",
                    onClick = {},
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun NoteCompact_Style() {
    composableCodeSnippet {
        NoteCompactStyle.builder()
            .shape(
                placeholder(
                    RoundedCornerShape(8.dp),
                    "/** Токе формы(скругления) */",
                ).adjustBy(all = -2.0.dp),
            )
            .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .textStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                paddingStart(30.0.dp)
                paddingEnd(30.0.dp)
                paddingTop(7.0.dp)
                paddingBottom(24.0.dp)
                iconSize(24.0.dp)
                contentBeforeEndMargin(12.0.dp)
                textTopMargin(4.0.dp)
                closeStartMargin(0.0.dp)
                actionStartMargin(16.0.dp)
                actionEndMargin(0.0.dp)
            }
            .style()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Note_Style() {
    composableCodeSnippet {
        NoteStyle.builder()
            .shape(
                placeholder(
                    RoundedCornerShape(8.dp),
                    "/** Токе формы(скругления) */",
                ).adjustBy(all = -2.0.dp),
            )
            .contentBeforeArrangement(ContentBeforeVerticalArrangement.Top)
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .textStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                paddingStart(28.0.dp)
                paddingEnd(28.0.dp)
                paddingTop(24.0.dp)
                paddingBottom(7.0.dp)
                iconSize(24.0.dp)
                closeTopMargin(0.0.dp)
                contentBeforeEndMargin(12.0.dp)
                textTopMargin(4.0.dp)
                titlePaddingEnd(0.0.dp)
                closeEndMargin(0.0.dp)
                actionTopMargin(0.0.dp)
            }
            .style()
    }
}
