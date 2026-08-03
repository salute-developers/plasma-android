package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PanelSidebarDFocusOutlineOff36: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PanelSidebarDFocusOutlineOff36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.16 5.496 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 l -1.92 1.92 H 7.05 C 4.813 6.002 3.0 7.815 3.0 10.052 v 15.9 c 0.0 1.329 0.64 2.508 1.629 3.247 L 4.29 29.538 c -0.39 0.39 -0.39 1.023 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 L 31.16 5.496 Z M 6.073 27.755 l 2.253 -2.253 H 8.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -4.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 6.076 l 11.5 -11.5 H 7.05 C 5.918 8.002 5.0 8.92 5.0 10.052 v 15.9 c 0.0 0.778 0.434 1.456 1.073 1.803 Z m 24.519 -18.93 l 1.421 -1.422 C 32.628 8.113 33.0 9.039 33.0 10.052 v 15.9 c 0.0 2.237 -1.813 4.05 -4.05 4.05 H 9.414 l 2.0 -2.0 H 28.95 c 1.132 0.0 2.05 -0.918 2.05 -2.05 v -15.9 c 0.0 -0.46 -0.152 -0.886 -0.408 -1.228 Z M 27.75 25.501 H 13.914 l 6.0 -6.0 h 7.836 c 0.414 0.0 0.75 0.336 0.75 0.75 v 4.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 Z")
        )
    }.build()
}
