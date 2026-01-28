package com.sdds.compose.uikit.fixtures.samples.popover

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Popover
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Popover_Simple() {
    composableCodeSnippet {
        val showPopover = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            modifier = Modifier
                .popoverTrigger(triggerInfo),
            label = "show",
            onClick = { showPopover.value = true },
        )
        Popover(
            show = showPopover.value,
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Top,
            placementMode = PopoverPlacementMode.Loose,
            triggerCentered = false,
            alignment = PopoverAlignment.Start,
            onDismissRequest = {
                showPopover.value = false
            },
            duration = 3000,
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 8.dp, start = 8.dp, end = 8.dp),
            ) {
                Text("Title")
                Spacer(Modifier.height(4.dp))
                Text("Description")
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Popover_Style() {
    composableCodeSnippet {
        PopoverStyle.builder()
            .shadow(placeholder(ShadowAppearance(), "/** Токен тени */"))
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токен формы (скругления) */"))
            .dimensions {
                width(182.0.dp)
                offset(8.0.dp)
                tailWidth(20.0.dp)
                tailHeight(8.0.dp)
                tailPadding(20.0.dp)
            }
            .colors {
                backgroundColor(SolidColor(Color.Gray))
            }
            .style()
    }
}
