package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SortAlphabetAsc16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SortAlphabetAsc16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.651 7.72 h 1.076 l 0.575 -1.672 h 2.552 L 7.42 7.72 h 1.027 L 6.115 0.93 H 5.017 L 2.65 7.72 Z m 2.935 -5.43 l 0.909 2.687 H 4.669 L 5.586 2.29 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.173 12.881 L 3.864 15.07 h -1.24 l 1.504 -2.422 c -0.37 -0.16 -0.653 -0.404 -0.846 -0.729 c -0.206 -0.346 -0.306 -0.78 -0.306 -1.299 c 0.0 -0.767 0.225 -1.356 0.684 -1.753 C 4.118 8.472 4.777 8.28 5.627 8.28 H 7.72 v 6.79 H 6.674 v -2.176 h -1.3 c -0.067 0.0 -0.135 -0.004 -0.201 -0.013 Z m -0.757 -1.31 c 0.242 0.17 0.635 0.262 1.194 0.262 h 1.064 V 9.35 H 5.61 c -0.522 0.0 -0.908 0.103 -1.167 0.299 c -0.247 0.19 -0.38 0.522 -0.38 1.018 c 0.0 0.437 0.124 0.73 0.353 0.903 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.402 9.334 C 9.204 9.526 9.2 9.843 9.391 10.041 l 1.75 1.807 C 11.235 11.945 11.365 12.0 11.5 12.0 c 0.135 0.0 0.265 -0.055 0.36 -0.152 l 1.75 -1.807 c 0.191 -0.198 0.186 -0.515 -0.012 -0.707 c -0.198 -0.192 -0.515 -0.187 -0.707 0.011 L 12.0 10.265 V 4.5 C 12.0 4.224 11.776 4.0 11.5 4.0 S 11.0 4.224 11.0 4.5 v 5.765 l -0.89 -0.92 C 9.916 9.147 9.6 9.142 9.401 9.335 Z")
        )
    }.build()
}
