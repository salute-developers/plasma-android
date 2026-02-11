package com.sdds.compose.uikit.fixtures.samples.tooltip

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Tooltip_Simple() {
    composableCodeSnippet {
        val showTooltip = remember { mutableStateOf(placeholder(true, "false")) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            modifier = Modifier
                .popoverTrigger(triggerInfo),
            label = "show",
            onClick = { showTooltip.value = true },
        )
        Tooltip(
            show = showTooltip.value,
            triggerInfo = { triggerInfo.value },
            placement = PopoverPlacement.Top,
            placementMode = PopoverPlacementMode.Loose,
            triggerCentered = false,
            alignment = PopoverAlignment.Start,
            onDismissRequest = {
                showTooltip.value = false
            },
            duration = 3000,
            text = AnnotatedString("Tooltip Text"),
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Tooltip_Style() {
    composableCodeSnippet {
        TooltipStyle.builder()
            .shadow(placeholder(ShadowAppearance(), "/** Токен тени */"))
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токен формы(скругления) */"))
            .dimensions {
                offset(8.0.dp)
                tailWidth(20.0.dp)
                tailHeight(8.0.dp)
                tailPadding(20.0.dp)
                contentStartSize(16.dp)
                contentStartPadding(4.dp)
                paddingStart(8.dp)
                paddingEnd(8.dp)
                paddingTop(8.dp)
                paddingBottom(8.dp)
            }
            .colors {
                backgroundColor(SolidColor(Color.Gray))
                textColor(SolidColor(Color.Black))
                contentStartColor(Color.Black)
            }
            .style()
    }
}
