package com.sdds.compose.uikit.fixtures.samples.toast

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Toast
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayHost
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showToast
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Toast_Simple() {
    OverlayHost {
        val overlayManager = LocalOverlayManager.current

        LaunchedEffect(Unit) {
            overlayManager.showToast(
                position = OverlayPosition.Center,
            ) {
                composableCodeSnippet {
                    Toast(
                        text = "Toast text",
                        contentStart = {
                            Icon(
                                painter = painterResource(com.sdds.icons.R.drawable.ic_shazam_16),
                                contentDescription = null,
                            )
                        },
                        contentEnd = {
                            Icon(
                                painter = painterResource(com.sdds.icons.R.drawable.ic_close_16),
                                contentDescription = null,
                            )
                        },
                    )
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Toast_Style() {
    composableCodeSnippet {
        ToastStyle.builder()
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токен формы(скругления) */"))
            .textStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                contentStartSize(16.0.dp)
                contentStartPadding(4.0.dp)
                contentEndSize(16.0.dp)
                contentEndPadding(4.0.dp)
                paddingStart(8.dp)
                paddingEnd(8.dp)
                paddingTop(8.dp)
                paddingBottom(8.dp)
            }
            .colors {
                backgroundColor(SolidColor(Color.Black))
                textColor(Color.LightGray)
                contentStartColor(Color.LightGray)
                contentEndColor(Color.LightGray)
            }
            .style()
    }
}
