package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MoneybagOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MoneybagOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.574 1.498 c -0.182 0.0 -0.35 0.1 -0.438 0.26 c -0.088 0.16 -0.081 0.356 0.018 0.51 l 1.79 2.794 C 3.472 5.794 2.34 7.145 1.923 8.824 L 1.87 9.037 c -0.627 2.523 1.282 4.965 3.882 4.965 h 4.492 c 2.6 0.0 4.509 -2.442 3.882 -4.965 l -0.053 -0.213 c -0.418 -1.68 -1.55 -3.03 -3.023 -3.763 l 1.79 -2.793 c 0.099 -0.154 0.106 -0.35 0.018 -0.51 c -0.088 -0.16 -0.256 -0.26 -0.439 -0.26 H 3.574 Z m 2.397 3.313 L 4.49 2.498 h 7.016 l -1.482 2.313 H 5.97 Z m -0.257 1.0 C 4.339 6.37 3.268 7.558 2.894 9.065 L 2.84 9.278 c -0.47 1.893 0.96 3.724 2.91 3.724 h 4.493 c 1.95 0.0 3.381 -1.831 2.911 -3.724 l -0.053 -0.213 c -0.375 -1.507 -1.446 -2.695 -2.82 -3.254 H 5.714 Z")
        )
    }.build()
}
