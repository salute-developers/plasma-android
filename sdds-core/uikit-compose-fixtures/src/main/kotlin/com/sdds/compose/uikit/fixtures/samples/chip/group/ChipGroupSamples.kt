package com.sdds.compose.uikit.fixtures.samples.chip.group

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.Icon
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun ChipGroup_Simple() {
    composableCodeSnippet {
        val items: List<String> = List(3) { "label" }
        ChipGroup {
            items.forEach {
                var isSelected by remember { mutableStateOf(false) }
                Chip(
                    isSelected = isSelected,
                    onSelectedChange = { value -> isSelected = value },
                    label = it,
                    endContent = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_close_24),
                            contentDescription = null,
                        )
                    },
                    enabled = true,
                )
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun ChipGroup_Style() {
    composableCodeSnippet {
        ChipGroupStyle.builder()
            .dimensions {
                gap(2.0.dp)
                lineSpacing(2.0.dp)
            }
            .chipStyle(placeholder(ChipStyle.builder().style(), "/** Стиль компонента */"))
            .style()
    }
}
