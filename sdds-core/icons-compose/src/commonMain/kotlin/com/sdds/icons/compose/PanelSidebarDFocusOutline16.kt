package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarDFocusOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarDFocusOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.89 3.0 h 10.22 C 13.602 3.0 14.0 3.398 14.0 3.89 v 7.22 c 0.0 0.492 -0.399 0.89 -0.89 0.89 H 2.89 C 2.398 12.0 2.0 11.601 2.0 11.11 V 3.89 C 2.0 3.398 2.398 3.0 2.89 3.0 Z M 1.0 3.89 C 1.0 2.846 1.846 2.0 2.89 2.0 h 10.22 C 14.154 2.0 15.0 2.846 15.0 3.89 v 7.22 c 0.0 1.044 -0.846 1.89 -1.89 1.89 H 2.89 C 1.846 13.0 1.0 12.154 1.0 11.11 V 3.89 Z M 3.45 8.1 C 3.256 8.1 3.1 8.257 3.1 8.45 v 2.1 c 0.0 0.193 0.156 0.35 0.35 0.35 h 9.1 c 0.193 0.0 0.35 -0.157 0.35 -0.35 v -2.1 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 h -9.1 Z")
        )
    }.build()
}
