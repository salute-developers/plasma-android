package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NotebookDownloadFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NotebookDownloadFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z m 2.0 4.8 c -0.193 0.0 -0.35 0.157 -0.35 0.35 c 0.0 0.36 -0.291 0.65 -0.65 0.65 h -2.0 c -0.359 0.0 -0.65 -0.29 -0.65 -0.65 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 c -0.193 0.0 -0.35 0.157 -0.35 0.35 c 0.0 0.746 0.604 1.35 1.35 1.35 h 2.0 c 0.745 0.0 1.35 -0.604 1.35 -1.35 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 Z m -2.0 -3.945 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 2.682 L 10.75 11.21 c -0.135 -0.139 -0.356 -0.141 -0.495 -0.007 c -0.139 0.135 -0.142 0.357 -0.007 0.495 l 1.499 1.545 c 0.066 0.068 0.157 0.106 0.252 0.106 s 0.185 -0.038 0.251 -0.106 l 1.5 -1.545 c 0.135 -0.138 0.132 -0.36 -0.007 -0.495 s -0.36 -0.132 -0.495 0.007 l -0.9 0.927 V 9.455 c 0.0 -0.193 -0.156 -0.35 -0.349 -0.35 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.5 12.0 c 0.0 0.344 0.04 0.678 0.113 1.0 H 1.527 C 1.237 13.0 1.0 12.764 1.0 12.473 c 0.0 -0.292 0.236 -0.528 0.527 -0.528 h 5.974 L 7.5 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.92 3.5 c 0.588 0.0 0.882 0.0 1.106 0.114 c 0.198 0.1 0.359 0.262 0.46 0.46 C 13.6 4.297 13.6 4.591 13.6 5.18 v 2.614 C 13.102 7.604 12.563 7.5 12.0 7.5 c -2.227 0.0 -4.074 1.617 -4.435 3.741 H 4.08 c -0.588 0.0 -0.882 0.0 -1.106 -0.115 c -0.198 -0.1 -0.359 -0.261 -0.46 -0.459 C 2.4 10.442 2.4 10.148 2.4 9.561 V 5.18 c 0.0 -0.588 0.0 -0.882 0.115 -1.107 c 0.1 -0.197 0.261 -0.358 0.459 -0.459 C 3.198 3.5 3.492 3.5 4.08 3.5 h 7.84 Z")
        )
    }.build()
}
