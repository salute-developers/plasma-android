package com.sdds.compose.uikit.fixtures.samples.accordion

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Accordion
import com.sdds.compose.uikit.AccordionIconPlacement
import com.sdds.compose.uikit.AccordionItem
import com.sdds.compose.uikit.AccordionItemStyle
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = false)
fun Accordion_ItemStyle() {
    composableCodeSnippet {
        AccordionItemStyle.builder()
            .iconPlacement(AccordionIconPlacement.End)
            .iconRotation(90.0f)
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токен формы (скругления) */"))
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .contentTextStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .colors {
                backgroundColor(
                    Color.White.asInteractive(
                        placeholder(Color.White, "/** Токен цвета */"),
                    ),
                )
                titleColor(
                    Color.LightGray.asInteractive(
                        placeholder(Color.LightGray, "/** Токен цвета */"),
                    ),
                )
                contentTextColor(
                    Color.LightGray.asInteractive(
                        placeholder(Color.LightGray, "/** Токен цвета */"),
                    ),
                )
            }
            .dimensions {
                contentPaddingStart(12.0.dp)
                contentPaddingEnd(12.0.dp)
                contentPaddingBottom(10.0.dp)
                paddingStart(12.0.dp)
                paddingEnd(12.0.dp)
                paddingTop(8.0.dp)
                paddingBottom(8.0.dp)
                iconPadding(10.0.dp)
            }
            .iconClosed(com.sdds.icons.R.drawable.ic_plus_16)
            .iconOpened(com.sdds.icons.R.drawable.ic_minus_16)
            .style()
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Accordion_Style() {
    composableCodeSnippet {
        AccordionStyle.builder()
            .accordionItemStyle(placeholder(AccordionItemStyle.builder().style(), "/** Стиль компонента */"))
            .dividerStyle(placeholder(DividerStyle.builder().style(), "/** Стиль компонента */"))
            .dimensions {
                itemSpacing(4.0.dp)
            }
            .style()
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Accordion_Simple() {
    composableCodeSnippet {
        Accordion {
            repeat(4) {
                var opened by remember { mutableStateOf(false) }
                AccordionItem(
                    opened = opened,
                    onClick = { opened = !opened },
                    title = "Title $it",
                ) { Text(text = "Content text $it") }
            }
        }
    }
}
