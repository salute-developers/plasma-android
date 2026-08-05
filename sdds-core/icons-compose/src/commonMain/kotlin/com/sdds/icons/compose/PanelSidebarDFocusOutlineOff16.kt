package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarDFocusOutlineOff16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarDFocusOutlineOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.443 2.354 c 0.196 -0.196 0.196 -0.512 0.0 -0.708 c -0.195 -0.195 -0.511 -0.195 -0.707 0.0 L 12.883 2.5 H 2.89 C 1.846 2.5 1.0 3.346 1.0 4.39 v 7.22 c 0.0 0.75 0.437 1.398 1.07 1.703 l -0.213 0.213 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 l 11.88 -11.88 Z M 2.883 12.5 l 1.1 -1.1 H 3.45 c -0.194 0.0 -0.35 -0.157 -0.35 -0.35 v -2.1 c 0.0 -0.193 0.156 -0.35 0.35 -0.35 h 3.333 l 5.1 -5.1 H 2.89 C 2.398 3.5 2.0 3.898 2.0 4.39 v 7.22 c 0.0 0.49 0.395 0.886 0.883 0.89 Z m 11.101 -8.277 l 0.769 -0.768 C 14.91 3.73 15.0 4.05 15.0 4.39 v 7.22 c 0.0 1.044 -0.846 1.89 -1.89 1.89 H 4.707 l 1.0 -1.0 h 7.403 c 0.492 0.0 0.89 -0.399 0.89 -0.89 V 4.39 c 0.0 -0.057 -0.005 -0.113 -0.016 -0.167 Z M 12.55 11.4 H 6.807 l 2.8 -2.8 h 2.943 c 0.193 0.0 0.35 0.157 0.35 0.35 v 2.1 c 0.0 0.193 -0.157 0.35 -0.35 0.35 Z")
        )
    }.build()
}
