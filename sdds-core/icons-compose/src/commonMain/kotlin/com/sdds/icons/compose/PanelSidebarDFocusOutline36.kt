package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarDFocusOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarDFocusOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.05 8.0 h 21.9 C 30.082 8.0 31.0 8.918 31.0 10.05 v 15.9 c 0.0 1.132 -0.918 2.05 -2.05 2.05 H 7.05 C 5.918 28.0 5.0 27.082 5.0 25.95 v -15.9 C 5.0 8.918 5.918 8.0 7.05 8.0 Z M 3.0 10.05 C 3.0 7.813 4.813 6.0 7.05 6.0 h 21.9 C 31.187 6.0 33.0 7.813 33.0 10.05 v 15.9 c 0.0 2.237 -1.813 4.05 -4.05 4.05 H 7.05 C 4.813 30.0 3.0 28.187 3.0 25.95 v -15.9 Z m 5.25 9.45 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 4.5 c 0.0 0.414 0.336 0.75 0.75 0.75 h 19.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 v -4.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 8.25 Z")
        )
    }.build()
}
