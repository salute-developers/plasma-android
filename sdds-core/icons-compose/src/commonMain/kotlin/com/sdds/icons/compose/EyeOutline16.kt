package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EyeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EyeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.733 7.362 C 3.033 5.347 5.35 4.0 8.0 4.0 c 2.65 0.0 4.967 1.346 6.267 3.36 c 0.152 0.236 0.184 0.29 0.218 0.435 c 0.005 0.025 0.014 0.1 0.014 0.204 c 0.0 0.105 -0.008 0.18 -0.014 0.205 c -0.034 0.144 -0.066 0.199 -0.218 0.434 c -1.3 2.016 -3.618 3.363 -6.268 3.363 c -2.649 0.0 -4.966 -1.346 -6.266 -3.36 C 1.58 8.404 1.549 8.35 1.515 8.205 C 1.51 8.18 1.501 8.106 1.5 8.0 c 0.0 -0.104 0.01 -0.18 0.015 -0.204 c 0.034 -0.145 0.066 -0.2 0.218 -0.435 Z M 8.0 3.0 C 5.007 3.0 2.374 4.523 0.892 6.82 l -0.01 0.017 c -0.149 0.23 -0.266 0.411 -0.34 0.733 C 0.51 7.703 0.5 7.867 0.5 8.0 c 0.0 0.135 0.01 0.298 0.041 0.432 c 0.075 0.322 0.192 0.503 0.341 0.733 l 0.01 0.016 C 2.376 11.48 5.007 13.001 8.0 13.001 c 2.994 0.0 5.627 -1.523 7.109 -3.82 l 0.01 -0.017 c 0.149 -0.23 0.266 -0.412 0.34 -0.733 C 15.49 8.297 15.5 8.134 15.5 7.999 c 0.0 -0.134 -0.01 -0.298 -0.04 -0.431 c -0.076 -0.322 -0.193 -0.503 -0.341 -0.734 l -0.01 -0.016 C 13.624 4.522 10.992 3.0 8.0 3.0 Z M 8.0 10.77 c 1.582 0.0 2.864 -1.24 2.864 -2.77 S 9.581 5.23 8.0 5.23 C 6.417 5.23 5.135 6.47 5.135 8.0 s 1.282 2.77 2.864 2.77 Z")
        )
    }.build()
}
