package com.sdds.compose.uikit.fixtures.samples.navigationbar

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.NavigationBar
import com.sdds.compose.uikit.NavigationBarContentPlacement
import com.sdds.compose.uikit.NavigationBarStyle
import com.sdds.compose.uikit.NavigationBarTextAlign
import com.sdds.compose.uikit.NavigationBarTextPlacement
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun NavigationBar_Simple() {
    composableCodeSnippet {
        NavigationBar(
            textPlacement = NavigationBarTextPlacement.Inline,
            contentPlacement = NavigationBarContentPlacement.Inline,
            textAlign = NavigationBarTextAlign.Start,
            textContent = { Text("Text") },
            content = { Text("Content") },
            actionStart = {
                Icon(
                    painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                    contentDescription = "",
                )
            },
            actionEnd = {
                Icon(
                    painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@DocSample
fun NavigationBar_Style() {
    composableCodeSnippet {
        NavigationBarStyle.builder()
            .shadow(placeholder(ShadowAppearance(), "/** Токен тени */"))
            .bottomShape(placeholder(RoundedCornerShape(8.dp), "/** Токен формы(скругления) */"))
            .textStyle(placeholder(TextStyle.Default, "/** Токен типографки */"))
            .backIcon(com.sdds.icons.R.drawable.ic_disclosure_left_outline_24)
            .colors {
                backIconColor(placeholder(Color.DarkGray, "/** Токен цвета */").asInteractive())
                textColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
                actionStartColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
                actionEndColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
                backgroundColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
            }
            .dimensions {
                paddingStart(20.0.dp)
                paddingEnd(20.0.dp)
                paddingTop(20.0.dp)
                paddingBottom(20.0.dp)
                backIconMargin(4.0.dp)
                textBlockTopMargin(16.0.dp)
                horizontalSpacing(16.0.dp)
            }
            .style()
    }
}
