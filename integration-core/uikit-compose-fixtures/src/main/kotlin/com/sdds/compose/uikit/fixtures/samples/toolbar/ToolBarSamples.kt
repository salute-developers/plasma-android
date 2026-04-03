package com.sdds.compose.uikit.fixtures.samples.toolbar

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ToolBar
import com.sdds.compose.uikit.ToolBarOrientation
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun ToolBar_Simple() {
    composableCodeSnippet {
        ToolBar(
            hasDivider = true,
            orientation = ToolBarOrientation.Horizontal,
        ) {
            section {
                IconButton(R.drawable.ic_plasma_24) { }
            }
            section {
                IconButton(R.drawable.ic_salute_outline_24) { }
            }
            section {
                Button("Label", {})
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun ToolBar_Style() {
    composableCodeSnippet {
        ToolBarStyle.builder()
            .shadow(placeholder(ShadowAppearance(), "/** Токен тени */"))
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токен формы(скругления) */"))
            .dividerStyle(placeholder(DividerStyle.builder().style(), "/** Стиль разделителя */"))
            .orientation(ToolBarOrientation.Horizontal)
            .dimensions {
                dividerMargin(4.dp)
                sectionPadding(4.dp)
                paddingStart(8.dp)
                paddingEnd(8.dp)
                paddingTop(8.dp)
                paddingBottom(8.dp)
            }
            .colors {
                backgroundColor(SolidColor(Color.White))
            }
            .style()
    }
}
