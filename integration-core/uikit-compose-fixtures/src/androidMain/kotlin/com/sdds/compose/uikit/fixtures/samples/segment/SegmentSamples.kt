package com.sdds.compose.uikit.fixtures.samples.segment

import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.SegmentHorizontal
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.selection
import com.sdds.compose.uikit.motion.components.segment.SegmentMotionStyle
import com.sdds.compose.uikit.motion.components.segment.rememberSegmentMotion
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.transition
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet

@Composable
@DocSample(needScreenshot = true)
fun Segment_Simple() {
    composableCodeSnippet {
        SegmentHorizontal(
            stretch = false,
            hasBackground = true,
        ) {
            repeat(3) { index ->
                segmentItem {
                    SegmentItem(
                        isSelected = index == 0,
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
}

@Composable
@DocSample(needScreenshot = true)
fun Segment_Dividers() {
    val segmentCount = 2
    composableCodeSnippet {
        SegmentHorizontal(
            stretch = false,
            hasBackground = true,
        ) {
            repeat(segmentCount) {
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

                if (it < segmentCount - 1) divider { Divider() }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Segment_Style() {
    composableCodeSnippet {
        SegmentStyle.builder()
            .segmentItemStyle(placeholder(SegmentItemStyle.builder().style(), "/** Стиль компонента */"))
            .colors {
                backgroundColor(
                    placeholder(Color.LightGray, "/** Токен цвета */").asInteractive(),
                )
            }
            .shape(
                placeholder(RoundedCornerShape(8.dp), "/** Токен формы(скругления) */").adjustBy(all = -2.0.dp),
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

@Composable
@DocSample(needScreenshot = false)
fun Segment_Motion() {
    composableCodeSnippet {
        var expanded by remember { mutableStateOf(false) }
        val selectedState = setOf(InteractiveState.Selected)
        val style = SegmentStyle.builder()
            .colors { backgroundColor(Color.LightGray.asStatefulBrush(selectedState to Color.Gray)) }
            .dimensions { gap(4.dp.asStatefulValue(selectedState to 16.dp)) }
            .style()
        val motion = rememberSegmentMotion(
            style = SegmentMotionStyle.builder()
                .gap(transition { segment {} changesWith { finite(tween(200)) } })
                .backgroundColor(transition { segment {} changesWith { finite(tween(200)) } })
                .style(),
        )
        SegmentHorizontal(
            motion = motion,
            style = style,
            stretch = false,
            modifier = Modifier
                .selection(expanded, motion.context.semanticStateSource)
                .clickable(interactionSource = motion.context.interactionSource, indication = null) {
                    expanded = !expanded
                },
        ) {
            segmentItem { SegmentItem(label = "Первый", isSelected = true) }
            segmentItem { SegmentItem(label = "Второй") }
        }
    }
}
