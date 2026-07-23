package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EarDashOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EarDashOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.5 10.0 c 0.0 -3.59 2.91 -6.5 6.5 -6.5 c 2.034 0.0 3.85 0.934 5.042 2.397 l -1.068 1.068 c -0.467 -0.61 -1.07 -1.107 -1.762 -1.45 c -0.837 -0.412 -1.773 -0.582 -2.702 -0.49 c -0.929 0.09 -1.813 0.44 -2.554 1.008 C 8.216 6.601 7.65 7.365 7.321 8.24 c -0.33 0.873 -0.407 1.821 -0.225 2.736 c 0.182 0.916 0.617 1.762 1.255 2.443 c 0.08 0.086 0.164 0.169 0.25 0.249 c 0.117 0.108 0.222 0.23 0.312 0.36 l -3.389 3.388 C 5.508 17.279 5.5 17.14 5.5 17.0 c 0.0 -0.3 0.038 -0.59 0.108 -0.867 c 0.103 -0.402 -0.14 -0.81 -0.541 -0.912 c -0.402 -0.103 -0.81 0.14 -0.912 0.541 C 4.054 16.16 4.0 16.574 4.0 17.0 c 0.0 0.581 0.1 1.139 0.282 1.658 l -1.298 1.297 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.294 0.768 0.294 1.061 0.0 l 16.97 -16.97 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 l -1.848 1.847 C 16.64 3.1 14.448 2.0 12.0 2.0 c -4.418 0.0 -8.0 3.582 -8.0 8.0 c 0.0 0.414 0.336 0.75 0.75 0.75 S 5.5 10.414 5.5 10.0 Z m 9.4 -1.96 c -0.34 -0.503 -0.806 -0.91 -1.352 -1.179 c -0.586 -0.289 -1.24 -0.408 -1.891 -0.344 c -0.65 0.064 -1.27 0.309 -1.788 0.706 c -0.518 0.398 -0.914 0.933 -1.145 1.544 c -0.23 0.612 -0.284 1.275 -0.157 1.916 c 0.128 0.64 0.432 1.233 0.879 1.71 c 0.056 0.06 0.114 0.118 0.175 0.174 c 0.128 0.118 0.25 0.249 0.363 0.389 L 14.9 8.04 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.0 20.5 c -0.663 0.0 -1.284 -0.185 -1.813 -0.505 l -1.082 1.082 C 6.922 21.658 7.921 22.0 9.0 22.0 c 1.786 0.0 3.353 -0.937 4.236 -2.343 c 0.672 -1.068 1.494 -2.054 2.47 -2.566 C 18.256 15.756 20.0 13.082 20.0 10.0 c 0.0 -0.85 -0.133 -1.67 -0.379 -2.44 l -1.233 1.234 C 18.462 9.184 18.5 9.588 18.5 10.0 c 0.0 2.502 -1.414 4.676 -3.49 5.763 c -1.332 0.697 -2.328 1.958 -3.044 3.096 C 11.346 19.846 10.25 20.5 9.0 20.5 Z")
        )
    }.build()
}
