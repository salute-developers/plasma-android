package com.sdds.compose.uikit.fixtures.samples.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.CardContent
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun Card_Simple() {
    composableCodeSnippet {
        Card(
            modifier = Modifier
                .width(100.dp)
                .height(150.dp),
            focusSelectorSettings = LocalFocusSelectorSettings.current,
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f),
                ) {
                    Text(
                        "Card text",
                        modifier = Modifier
                            .align(Alignment.Center),
                    )
                }
                CardContent(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    focusSelectorSettings = FocusSelectorSettings.None,
                ) {
                    Image(
                        contentScale = ContentScale.Crop,
                        painter = painterResource(id = R.drawable.ic_add_smile_fill_36),
                        contentDescription = "Android",
                    )
                    Text(
                        text = "Content",
                    )
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Card_Extra() {
    composableCodeSnippet {
        Card(
            label = { Text("Title") },
            extra = {
                IconButton(
                    modifier = Modifier.align(Alignment.BottomEnd),
                    iconRes = R.drawable.ic_plasma_24,
                    onClick = {},
                )
            },
        ) {
            Image(
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.ic_add_smile_fill_36),
                contentDescription = "Android",
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Card_Style() {
    composableCodeSnippet {
        CardStyle.builder()
            .colors {
                backgroundColor(
                    Color.Black.asInteractive(placeholder(Color.Black, "/** Токен цвета */")),
                )
            }
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токен формы (скругления) */"))
            .contentShape(placeholder(RoundedCornerShape(4.dp), "/** Токен формы (скругления) */"))
            .dimensions {
                paddingTop(12.0.dp)
                paddingBottom(12.0.dp)
                paddingStart(12.0.dp)
                paddingEnd(12.0.dp)
            }
            .style()
    }
}
