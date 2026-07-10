package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.975 5.125 c -5.385 0.0 -9.75 4.365 -9.75 9.75 c 0.0 3.237 1.576 6.106 4.008 7.881 c 0.039 -0.004 0.078 -0.006 0.117 -0.006 H 23.6 c 0.04 0.0 0.078 0.002 0.117 0.006 c 2.431 -1.775 4.008 -4.644 4.008 -7.881 c 0.0 -5.385 -4.365 -9.75 -9.75 -9.75 Z M 21.747 25.0 h -7.544 c 0.117 0.277 0.207 0.572 0.261 0.883 l 0.431 2.443 c 0.159 0.896 0.937 1.549 1.847 1.549 h 2.466 c 0.91 0.0 1.688 -0.653 1.847 -1.55 l 0.43 -2.442 c 0.056 -0.311 0.145 -0.606 0.262 -0.883 Z M 5.975 14.875 c 0.0 -6.627 5.373 -12.0 12.0 -12.0 s 12.0 5.373 12.0 12.0 c 0.0 4.098 -2.056 7.716 -5.187 9.88 c -0.603 0.417 -0.988 0.959 -1.087 1.52 l -0.43 2.442 c -0.288 1.627 -1.505 2.89 -3.046 3.281 V 32.5 c 0.0 1.035 -0.84 1.875 -1.875 1.875 H 17.6 c -1.036 0.0 -1.875 -0.84 -1.875 -1.875 v -0.502 c -1.541 -0.391 -2.758 -1.654 -3.045 -3.281 l -0.431 -2.443 c -0.1 -0.56 -0.484 -1.102 -1.087 -1.52 c -3.131 -2.163 -5.187 -5.78 -5.187 -9.879 Z")
        )
    }.build()
}
