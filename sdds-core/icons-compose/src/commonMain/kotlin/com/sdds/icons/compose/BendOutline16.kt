package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BendOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BendOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 3.25 c 0.9 0.0 1.653 0.619 1.863 1.453 L 9.9 4.7 h 4.6 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -3.294 c 1.033 0.758 1.785 1.873 2.08 3.162 C 14.248 8.967 15.0 9.782 15.0 10.774 c 0.0 1.063 -0.862 1.925 -1.925 1.925 c -1.063 0.0 -1.925 -0.861 -1.925 -1.925 c 0.0 -0.784 0.47 -1.459 1.144 -1.758 C 11.96 7.656 11.0 6.544 9.735 6.004 l 0.007 -0.016 C 9.435 6.644 8.772 7.1 8.0 7.1 C 7.225 7.1 6.56 6.64 6.254 5.98 l 0.01 0.023 c -1.265 0.54 -2.225 1.653 -2.559 3.012 C 4.38 9.315 4.85 9.989 4.85 10.774 c 0.0 1.064 -0.862 1.925 -1.925 1.925 C 1.862 12.7 1.0 11.838 1.0 10.774 c 0.0 -0.991 0.75 -1.807 1.714 -1.912 c 0.295 -1.29 1.047 -2.404 2.08 -3.162 H 1.5 C 1.224 5.7 1.0 5.476 1.0 5.2 s 0.224 -0.5 0.5 -0.5 h 4.6 l 0.035 0.003 C 6.345 3.868 7.1 3.25 8.0 3.25 Z m -5.075 6.6 C 2.415 9.85 2.0 10.264 2.0 10.774 C 2.0 11.285 2.414 11.7 2.925 11.7 c 0.51 0.0 0.925 -0.414 0.925 -0.925 c 0.0 -0.51 -0.415 -0.924 -0.925 -0.924 Z m 10.15 0.0 c -0.51 0.0 -0.924 0.414 -0.925 0.924 c 0.0 0.511 0.414 0.925 0.925 0.925 c 0.51 0.0 0.925 -0.414 0.925 -0.925 c 0.0 -0.51 -0.414 -0.924 -0.925 -0.924 Z M 8.0 4.25 c -0.51 0.0 -0.925 0.414 -0.925 0.925 C 7.075 5.685 7.49 6.1 8.0 6.1 c 0.51 0.0 0.925 -0.414 0.925 -0.925 C 8.925 4.665 8.51 4.25 8.0 4.25 Z")
        )
    }.build()
}
