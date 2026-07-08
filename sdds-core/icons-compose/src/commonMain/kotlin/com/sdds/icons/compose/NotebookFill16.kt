package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NotebookFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NotebookFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.486 10.668 C 13.6 10.443 13.6 10.149 13.6 9.56 v -4.38 c 0.0 -0.589 0.0 -0.883 -0.114 -1.107 c -0.101 -0.198 -0.262 -0.358 -0.46 -0.46 C 12.803 3.5 12.509 3.5 11.92 3.5 H 4.08 c -0.588 0.0 -0.882 0.0 -1.107 0.115 c -0.197 0.1 -0.358 0.261 -0.459 0.459 C 2.4 4.298 2.4 4.592 2.4 5.18 v 4.381 c 0.0 0.588 0.0 0.882 0.114 1.107 c 0.101 0.198 0.262 0.358 0.46 0.459 c 0.224 0.114 0.518 0.114 1.106 0.114 h 7.84 c 0.588 0.0 0.882 0.0 1.107 -0.114 c 0.197 -0.1 0.358 -0.261 0.459 -0.46 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.528 11.945 C 1.236 11.945 1.0 12.182 1.0 12.473 c 0.0 0.292 0.236 0.528 0.528 0.528 h 12.944 C 14.764 13.0 15.0 12.765 15.0 12.473 c 0.0 -0.291 -0.236 -0.528 -0.528 -0.528 H 1.528 Z")
        )
    }.build()
}
