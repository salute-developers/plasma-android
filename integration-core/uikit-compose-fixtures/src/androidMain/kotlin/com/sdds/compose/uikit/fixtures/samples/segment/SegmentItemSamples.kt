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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.motion.components.segment.SegmentItemMotionStyle
import com.sdds.compose.uikit.motion.components.segment.rememberSegmentItemMotion
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.transition
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet

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
                            to placeholder(Color.Black, "/** Цвет в состоянии hovered */"),
                    ),
                )
                valueColor(
                    placeholder(Color.Gray, "/** Токен типографики */").asInteractive(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.LightGray, "/** Цвет в состоянии hovered */"),
                    ),
                )
                backgroundColor(
                    placeholder(Color.Transparent, "/** Токен типографики */").asInteractive(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Gray, "/** Цвет в состоянии hovered */"),
                    ),
                )
                startContentColor(
                    placeholder(Color.Black, "/** Цвет токена */").asInteractive(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии hovered */"),
                    ),
                )
                endContentColor(
                    placeholder(Color.Black, "/** Цвет токена */").asInteractive(
                        setOf(InteractiveState.Hovered)
                            to placeholder(Color.Black, "/** Цвет в состоянии hovered */"),
                    ),
                )
            }
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токе формы(скругления) */").adjustBy(all = 0.0.dp))
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
            .counterStyle(placeholder(CounterStyle.builder().style(), "/** Стиль компонента */"))
            .style()
    }
}

@Composable
@DocSample(needScreenshot = false)
fun SegmentItem_Motion() {
    composableCodeSnippet {
        var selected by remember { mutableStateOf(false) }
        val selectedState = setOf(InteractiveState.Selected)
        val counterStyle = CounterStyle.builder()
            .colors { backgroundBrush(Color.LightGray.asStatefulBrush(selectedState to Color.Green)) }
            .style()
        val style = SegmentItemStyle.builder()
            .colors { backgroundColor(Color.LightGray.asStatefulBrush(selectedState to Color.Cyan)) }
            .labelStyle(TextStyle(fontSize = 14.sp))
            .dimensions {
                minHeight(40.dp.asStatefulValue(selectedState to 48.dp))
                valueMargin(4.dp.asStatefulValue(selectedState to 12.dp))
            }
            .counterStyle(counterStyle)
            .style()
        val motion = rememberSegmentItemMotion(
            style = SegmentItemMotionStyle.builder()
                .backgroundColor(transition { segment {} changesWith { finite(tween(200)) } })
                .minHeight(transition { segment {} changesWith { finite(tween(200)) } })
                .valueMargin(transition { segment {} changesWith { finite(tween(200)) } })
                .style(),
        )
        SegmentItem(
            motion = motion,
            style = style,
            label = "Сообщения",
            value = "Новые",
            counter = "7",
            isSelected = selected,
            modifier = Modifier.clickable(
                interactionSource = motion.context.interactionSource,
                indication = null,
            ) { selected = !selected },
        )
    }
}
