package com.sdds.plasma.homeds.docs.samples

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupOrientation
import com.sdds.compose.uikit.Overlay
import com.sdds.compose.uikit.style.style
import com.sdds.docs.DocSample
import com.sdds.plasma.homeds.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.homeds.styles.buttongroup.Default
import com.sdds.plasma.homeds.styles.buttongroup.M
import com.sdds.plasma.homeds.styles.buttongroup.Wide
import com.sdds.plasma.homeds.styles.overlay.DirectionBottom
import com.sdds.plasma.homeds.styles.overlay.Overlay

@Composable
@DocSample(needScreenshot = false)
fun FloatingButtonBar_WithOverlay() {
    composableCodeSnippet {
        Overlay(
            style = Overlay.DirectionBottom.style(),
        ) {
            ButtonGroup(
                modifier = Modifier.padding(vertical = 16.dp, horizontal = 20.dp),
                style = BasicButtonGroup.M.Wide.Default.style(),
                orientation = ButtonGroupOrientation.Vertical,
            ) {
                button { Button(label = "Label", onClick = {}) }
                button { Button(label = "Label", onClick = {}) }
            }
        }
    }
}
