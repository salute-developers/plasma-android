package com.sdds.compose.uikit.fixtures.samples.file

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.CircularProgressBar
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun FileCircular_Simple() {
    composableCodeSnippet {
        File(
            label = "image.png",
            description = "226 КБ",
            isLoading = true,
            image = {
                Icon(
                    painterResource(com.sdds.icons.R.drawable.ic_file_check_fill_36),
                    contentDescription = "",
                )
            },
            progress = {
                CircularProgressBar(
                    progress = 0.4f,
                    valueContent = {
                        Icon(
                            modifier = Modifier.size(12.dp),
                            painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                            contentDescription = "",
                        )
                    },
                )
            },
            action = {
                IconButton(
                    iconRes = com.sdds.icons.R.drawable.ic_close_36,
                    onClick = {},
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun FileLinear_Simple() {
    composableCodeSnippet {
        File(
            label = "image.png",
            description = "226 КБ",
            isLoading = true,
            image = {
                Icon(
                    painterResource(com.sdds.icons.R.drawable.ic_file_check_fill_36),
                    contentDescription = "",
                )
            },
            progress = {
                ProgressBar(progress = 0.4f)
            },
            action = {
                IconButton(
                    iconRes = com.sdds.icons.R.drawable.ic_close_36,
                    onClick = {},
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun File_Style() {
    composableCodeSnippet {
        FileStyle.builder()
            .colors {
                iconColor(Color.Cyan)
                descriptionColor(Color.Gray)
                labelColor(Color.Black)
            }
            .dimensions {
                descriptionPadding(2.dp)
                startContentPadding(12.dp)
                endContentPadding(12.dp)
                bottomContentPadding(12.dp)
            }
            .labelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .descriptionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .actionButtonStyle(
                placeholder(
                    ButtonStyle.iconButtonBuilder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .circularProgressBarStyle(
                placeholder(
                    CircularProgressBarStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .style()
    }
}
