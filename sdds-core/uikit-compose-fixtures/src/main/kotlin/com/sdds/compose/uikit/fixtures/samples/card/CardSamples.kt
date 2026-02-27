package com.sdds.compose.uikit.fixtures.samples.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.CardContent
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.Icon
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
                .width(150.dp)
                .height(200.dp),
            focusSelectorSettings = LocalFocusSelectorSettings.current,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Заголовок",
                    color = placeholder({ Color.Gray }, replace = "/** Токен цвета */"),
                )
                CardContent(
                    modifier = Modifier,
                    focusSelectorSettings = FocusSelectorSettings.None,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            contentScale = ContentScale.Crop,
                            painter = painterResource(id = R.drawable.ic_bulb_diode_fill_36),
                            colorFilter = ColorFilter.tint(Color.Black),
                            contentDescription = "Android",
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Подзаголовок",
                            color = placeholder({ Color.Black }, replace = "/** Токен цвета */"),
                        )
                        Row(
                            modifier = Modifier.padding(top = 12.dp),
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                contentScale = ContentScale.Crop,
                                painter = painterResource(id = R.drawable.ic_power_16),
                                colorFilter = ColorFilter.tint(Color.Black),
                                contentDescription = "Power",
                            )

                            Image(
                                contentScale = ContentScale.Crop,
                                painter = painterResource(id = R.drawable.ic_reset_outline_16),
                                colorFilter = ColorFilter.tint(Color.Black),
                                contentDescription = "Reset",
                            )

                            Image(
                                contentScale = ContentScale.Crop,
                                painter = painterResource(id = R.drawable.ic_settings_outline_16),
                                colorFilter = ColorFilter.tint(Color.Black),
                                contentDescription = "Settings",
                            )
                        }
                    }
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
            modifier = Modifier
                .width(350.dp)
                .height(200.dp),
            focusSelectorSettings = LocalFocusSelectorSettings.current,
            extra = {
                Cell(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.TopCenter),
                    title = AnnotatedString("Заголовок"),
                    subtitle = AnnotatedString("Подзаголовок"),
                    startContent = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_camera_video_rec_outline_36),
                            contentDescription = "",
                        )
                    },
                    disclosureText = AnnotatedString("Текст"),
                    disclosureContentEnabled = true,
                    disclosureIconRes = R.drawable.ic_chevron_right_24,
                )
            }
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    modifier = Modifier.align(Alignment.Center),
                    painter = painterResource(id = R.drawable.ic_video_clip_outline_36),
                    colorFilter = placeholder(
                        ColorFilter.tint(Color.Black),
                        replace = "/** Токен цвета */"
                    ),
                    contentDescription = "",
                )
            }
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
