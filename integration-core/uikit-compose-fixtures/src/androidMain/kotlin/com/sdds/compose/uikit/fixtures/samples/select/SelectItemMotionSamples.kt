package com.sdds.compose.uikit.fixtures.samples.select

import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.SelectItem
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.motion.components.cell.rememberCellMotion
import com.sdds.compose.uikit.motion.components.select.SelectItemMotionStyle
import com.sdds.compose.uikit.motion.components.select.rememberSelectItemMotion
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.transition
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet

@Composable
@DocSample(needScreenshot = false)
fun SelectItem_Motion() {
    composableCodeSnippet {
        var checked by remember { mutableStateOf(false) }
        val selected = setOf(InteractiveState.Selected)
        val itemMotion = rememberSelectItemMotion(
            style = SelectItemMotionStyle.builder()
                .backgroundColor(transition { segment {} changesWith { finite(tween(200)) } })
                .style(),
        )
        SelectItem(
            motion = itemMotion,
            checked = checked,
            onClick = { checked = !checked },
            modifier = Modifier.fillMaxWidth(),
            style = SelectItemStyle.builder()
                .colors { backgroundColor(Color.Transparent.asStatefulBrush(selected to Color.LightGray)) }
                .dimensions { height(48.dp.asStatefulValue(selected to 56.dp)) }
                .style(),
            titleContent = { Text("Встроенная Cell разделяет контекст строки") },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun SelectItem_CustomCellMotion() {
    composableCodeSnippet {
        var checked by remember { mutableStateOf(false) }
        val itemMotion = rememberSelectItemMotion()
        SelectItem(
            motion = itemMotion,
            checked = checked,
            onClick = { checked = !checked },
            content = {
                Cell(
                    motion = rememberCellMotion(motionContext = itemMotion.context),
                    titleContent = { Text("Общий контекст передан явно") },
                )
            },
        )
    }
}
