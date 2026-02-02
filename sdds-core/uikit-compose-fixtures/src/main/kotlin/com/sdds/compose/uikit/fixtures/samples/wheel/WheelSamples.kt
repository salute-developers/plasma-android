package com.sdds.compose.uikit.fixtures.samples.wheel

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Wheel
import com.sdds.compose.uikit.WheelAlignment
import com.sdds.compose.uikit.WheelDataSet
import com.sdds.compose.uikit.WheelItemData
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Wheel_Simple() {
    composableCodeSnippet {
        Wheel(
            wheelCount = 2,
            visibleItemsCount = 3,
            onItemSelected = { wheelIndex, itemIndex ->
                println("item selected: $itemIndex in wheel $wheelIndex")
            },
        ) { wheelIndex ->
            WheelDataSet(
                dataSet = List(10) {
                    WheelItemData(
                        text = "Label$wheelIndex",
                        textAfter = "TA$wheelIndex",
                    )
                },
                description = "Description",
            )
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Wheel_Style() {
    composableCodeSnippet {
        WheelStyle.builder()
            .controlIconUp(com.sdds.icons.R.drawable.ic_disclosure_up_outline_36)
            .controlIconDown(com.sdds.icons.R.drawable.ic_disclosure_down_outline_36)
            .wheelCount(3)
            .visibleItemsCount(3)
            .colors {
                itemTextColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
                itemTextAfterColor(placeholder(Color.LightGray, "/** Токен цвета */").asInteractive())
                descriptionColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
                controlIconUpColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Focused)
                            to placeholder(Color.Black, "/** Токен цвета в состоянии focused */"),
                    ),
                )
                controlIconDownColor(
                    placeholder(Color.Gray, "/** Токен цвета */").asInteractive(
                        setOf(InteractiveState.Focused)
                            to placeholder(Color.Black, "/** Токен цвета в состоянии focused */"),
                    ),
                )
                separatorColor(placeholder(Color.Black, "/** Токен цвета */").asInteractive())
            }
            .itemTextStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .itemTextAfterStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .descriptionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                itemTextAfterPadding(2.0.dp)
                descriptionPadding(8.0.dp)
                separatorSpacing(40.0.dp)
                itemMinSpacing(20.0.dp)
            }
            .itemAlignment(WheelAlignment.Center)
            .style()
    }
}
