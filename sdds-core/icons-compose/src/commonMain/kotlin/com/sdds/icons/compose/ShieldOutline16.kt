package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 2.099 C 7.604 2.352 6.827 2.827 5.9 3.267 c -0.935 0.444 -2.073 0.88 -3.145 0.99 c 0.086 4.418 1.388 6.829 2.645 8.14 C 6.542 13.588 7.694 13.92 8.0 13.99 c 0.306 -0.07 1.458 -0.402 2.6 -1.593 c 1.257 -1.311 2.559 -3.722 2.645 -8.14 c -1.072 -0.11 -2.21 -0.546 -3.144 -0.99 C 9.173 2.827 8.396 2.352 8.0 2.1 Z m -0.375 -0.95 C 7.853 1.0 8.147 1.0 8.375 1.15 C 8.648 1.33 9.49 1.871 10.53 2.364 c 1.053 0.5 2.24 0.92 3.22 0.92 c 0.276 0.0 0.5 0.224 0.5 0.5 c 0.0 4.92 -1.412 7.724 -2.928 9.305 c -1.507 1.572 -3.057 1.873 -3.231 1.903 H 8.089 H 8.086 l -0.013 0.003 C 8.059 14.997 8.033 15.0 8.0 15.0 c -0.033 0.0 -0.059 -0.003 -0.073 -0.005 l -0.013 -0.002 l -0.003 -0.001 H 7.909 c -0.174 -0.03 -1.724 -0.331 -3.231 -1.903 C 3.163 11.508 1.75 8.705 1.75 3.784 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 c 0.98 0.0 2.167 -0.42 3.22 -0.92 C 6.51 1.871 7.352 1.33 7.625 1.15 Z")
        )
    }.build()
}
