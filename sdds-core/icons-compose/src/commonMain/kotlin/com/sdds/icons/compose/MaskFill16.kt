package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MaskFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MaskFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.914 1.545 C 2.344 1.357 1.743 1.787 1.75 2.392 c 0.067 5.432 1.167 8.465 2.515 10.149 C 5.632 14.248 7.2 14.5 8.0 14.5 c 0.8 0.0 2.368 -0.252 3.735 -1.96 c 1.348 -1.682 2.449 -4.716 2.515 -10.148 c 0.007 -0.605 -0.594 -1.035 -1.164 -0.847 C 12.219 1.83 10.244 2.385 8.0 2.385 s -4.219 -0.554 -5.086 -0.84 Z m 4.043 4.994 c 0.0 0.4 -0.467 0.53 -0.815 0.33 L 6.008 6.792 c -0.273 -0.157 -0.608 -0.157 -0.881 0.0 L 4.992 6.87 c -0.347 0.2 -0.814 0.07 -0.814 -0.33 c 0.0 -0.243 0.064 -0.482 0.186 -0.692 C 4.486 5.637 4.66 5.46 4.873 5.34 c 0.21 -0.122 0.45 -0.186 0.694 -0.186 c 0.244 0.0 0.484 0.064 0.695 0.186 C 6.473 5.46 6.65 5.636 6.771 5.847 c 0.122 0.21 0.186 0.449 0.186 0.692 Z m 2.9 0.33 C 9.51 7.07 9.044 6.94 9.044 6.54 c 0.0 -0.243 0.064 -0.482 0.186 -0.692 c 0.122 -0.21 0.298 -0.386 0.509 -0.507 c 0.211 -0.122 0.45 -0.186 0.694 -0.186 c 0.245 0.0 0.484 0.064 0.695 0.186 c 0.212 0.121 0.387 0.296 0.509 0.507 c 0.122 0.21 0.186 0.449 0.186 0.692 c 0.0 0.4 -0.467 0.53 -0.815 0.33 l -0.134 -0.077 c -0.273 -0.157 -0.608 -0.157 -0.88 0.0 L 9.857 6.87 Z M 5.276 9.954 C 5.135 9.343 5.789 8.964 6.4 9.107 l 1.063 0.248 c 0.353 0.083 0.721 0.083 1.075 0.0 L 9.6 9.107 c 0.61 -0.142 1.264 0.236 1.125 0.847 c -0.083 0.364 -0.261 0.707 -0.52 1.002 c -0.26 0.295 -0.594 0.534 -0.977 0.698 c -0.382 0.164 -0.802 0.25 -1.229 0.25 c -0.426 0.0 -0.847 -0.086 -1.229 -0.25 c -0.382 -0.164 -0.716 -0.403 -0.976 -0.698 c -0.26 -0.295 -0.437 -0.638 -0.52 -1.002 Z")
        )
    }.build()
}
