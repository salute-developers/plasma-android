package com.sdds.compose.uikit.fixtures.samples.segment

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun SegmentItem_Simple() {
    composableCodeSnippet {
        SegmentItem(
            isSelected = true,
            label = "Label",
            value = "Value",
            startIcon = painterResource(id = com.sdds.icons.R.drawable.ic_scribble_diagonal_24),
            counter = "55",
            enabled = true,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun SegmentItem_Style() {
    composableCodeSnippet {
        SegmentItemStyle.builder()
            .colors {
                labelColor(
                    placeholder(Color.Black, "/** Цвет токена */").asInteractive(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет токена */"),
                    ),
                )
                valueColor(
                    placeholder(Color.Gray, "/** Токен типографики */").asInteractive(
                        setOf(InteractiveState.Hovered)
                            to placeholder(
                                Color.LightGray,
                                "/** Токен типографики */",
                            ),
                    ),
                )
                backgroundColor(
                    placeholder(
                        Color.Transparent,
                        "/** Токен типографики */",
                    ).asInteractive(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Gray, "/** Токен типографики */"),
                    ),
                )
                startContentColor(
                    placeholder(Color.Black, "/** Цвет токена */").asInteractive(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет токена */"),
                    ),
                )
                endContentColor(
                    placeholder(Color.Black, "/** Цвет токена */").asInteractive(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет токена */"),
                    ),
                )
            }
            .shape(
                placeholder(
                    RoundedCornerShape(8.dp),
                    "/** Токе формы(скругления) */",
                ).adjustBy(all = 0.0.dp),
            )
            .labelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .valueStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .dimensions {
                minWidth(110.0.dp)
                minHeight(64.0.dp)
                paddingStart(28.0.dp)
                paddingEnd(28.0.dp)
                startContentSize(24.0.dp)
                endContentSize(24.0.dp)
                valueMargin(6.0.dp)
            }
            .counterStyle(
                placeholder(
                    CounterStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .style()
    }
}
