package com.sdds.compose.uikit.fixtures.samples.dropdownmenu

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.DropdownMenu
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.ListItem
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.PopoverPlacement
import com.sdds.compose.uikit.PopoverPlacementMode
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.popoverTrigger
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun DropdownMenu_Simple() {
    composableCodeSnippet {
        val showDropdownMenu = remember { mutableStateOf(false) }
        val triggerInfo = remember { mutableStateOf(TriggerInfo()) }
        Button(
            modifier = Modifier.popoverTrigger(triggerInfo),
            label = "Show dropdown menu",
            onClick = { showDropdownMenu.value = true },
        )
        DropdownMenu(
            opened = showDropdownMenu.value,
            onDismissRequest = {
                showDropdownMenu.value = false
            },
            triggerInfo = triggerInfo.value,
            placement = PopoverPlacement.Bottom,
            placementMode = PopoverPlacementMode.Loose,
            alignment = PopoverAlignment.Center,
        ) {
            com.sdds.compose.uikit.List(
                modifier = Modifier
                    .width(200.dp)
                    .height(300.dp),
            ) {
                item {
                    ListItem(
                        text = "Item title 2",
                        disclosureEnabled = true,
                    )
                }
                item {
                    Divider()
                }
                item {
                    ListItem(
                        text = "Item title 2",
                        disclosureEnabled = true,
                    )
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun DropdownMenu_Style() {
    composableCodeSnippet {
        DropdownMenuStyle.builder()
            .shadow(placeholder(ShadowAppearance(), "/** Токен тени */"))
            .shape(placeholder(RoundedCornerShape(10.dp), "/** Токен формы (скругления) */"))
            .listStyle(placeholder(ListStyle.builder().style(), "/** Стиль компонента */"))
            .dividerStyle(placeholder(DividerStyle.builder().style(), "/** Стиль разделителя */"))
            .dimensions {
                width(200.dp)
                strokeWidth(1.dp)
                offset(8.0.dp)
            }
            .colors {
                backgroundColor(SolidColor(Color.LightGray))
                strokeColor(SolidColor(Color.Black))
            }
            .style()
    }
}
