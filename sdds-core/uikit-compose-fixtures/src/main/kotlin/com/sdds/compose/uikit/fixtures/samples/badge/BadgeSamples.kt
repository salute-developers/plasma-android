package com.sdds.compose.uikit.fixtures.samples.badge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Badge
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconBadge
import com.sdds.compose.uikit.badgeBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun Badge_Simple() {
    composableCodeSnippet {
        Badge(
            label = "Label",
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Badge_Style() {
    composableCodeSnippet {
        BadgeStyle.badgeBuilder()
            .shape(CircleShape)
            .colors {
                backgroundColor(
                    placeholder(Color.Black, "/** Токен цвета */").asInteractive(),
                )
                labelColor(
                    placeholder(Color.White, "/** Токен цвета */").asInteractive(),
                )
                startContentColor(
                    placeholder(Color.White, "/** Токен цевета */").asInteractive(),
                )
                endContentColor(
                    placeholder(Color.White, "/** Токен цвета */").asInteractive(),
                )
            }
            .labelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                height(28.0.dp)
                startContentSize(16.0.dp)
                endContentSize(16.0.dp)
                startContentMargin(4.0.dp)
                endContentMargin(4.0.dp)
                startPadding(11.0.dp)
                endPadding(11.0.dp)
            }
            .style()
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Badge_WithoutLabel() {
    composableCodeSnippet {
        Badge(
            label = "",
            startContent = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_16),
                    contentDescription = "",
                )
            },
        )
    }
}

@Composable
@DocSample
fun IconBadge_Simple() {
    composableCodeSnippet {
        IconBadge(
            content = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plasma_16),
                    contentDescription = "",
                )
            },
        )
    }
}
