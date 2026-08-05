package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarDFocusOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarDFocusOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.7 5.5 h 14.6 c 0.663 0.0 1.2 0.537 1.2 1.2 v 10.6 c 0.0 0.663 -0.537 1.2 -1.2 1.2 H 4.7 c -0.663 0.0 -1.2 -0.537 -1.2 -1.2 V 6.7 c 0.0 -0.663 0.537 -1.2 1.2 -1.2 Z M 2.0 6.7 C 2.0 5.209 3.209 4.0 4.7 4.0 h 14.6 C 20.791 4.0 22.0 5.209 22.0 6.7 v 10.6 c 0.0 1.491 -1.209 2.7 -2.7 2.7 H 4.7 C 3.209 20.0 2.0 18.791 2.0 17.3 V 6.7 Z M 5.5 13.0 C 5.224 13.0 5.0 13.224 5.0 13.5 v 3.0 C 5.0 16.776 5.224 17.0 5.5 17.0 h 13.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -3.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -13.0 Z")
        )
    }.build()
}
