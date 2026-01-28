package com.sdds.compose.uikit.fixtures.samples.segment

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.SegmentHorizontal
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Segment_Simple() {
    composableCodeSnippet {
        SegmentHorizontal(
            stretch = false,
            hasBackground = true,
        ) {
            segmentItem {
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
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Segment_Style() {
    composableCodeSnippet {
        SegmentStyle.builder()
            .segmentItemStyle(
                placeholder(
                    SegmentItemStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .colors {
                backgroundColor(
                    placeholder(Color.LightGray, "/** Токен цвета */").asInteractive(),
                )
            }
            .shape(
                placeholder(
                    RoundedCornerShape(8.dp),
                    "/** Токен формы(скругления) */",
                ).adjustBy(all = -2.0.dp),
            )
            .dimensions {
                paddingStart(2.0.dp)
                paddingEnd(2.0.dp)
                paddingTop(2.0.dp)
                paddingBottom(2.0.dp)
            }
            .style()
    }
}
