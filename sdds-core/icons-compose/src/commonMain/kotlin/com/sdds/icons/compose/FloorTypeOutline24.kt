package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FloorTypeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FloorTypeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.054 14.58 c 0.279 -0.08 0.586 0.044 0.725 0.312 c 0.16 0.306 0.041 0.683 -0.264 0.843 L 12.776 20.3 c -0.425 0.222 -0.922 0.25 -1.365 0.083 l -0.186 -0.083 l -8.739 -4.566 l -0.106 -0.07 c -0.225 -0.183 -0.298 -0.506 -0.158 -0.773 c 0.14 -0.268 0.446 -0.392 0.725 -0.312 l 0.117 0.047 l 8.74 4.566 l 0.095 0.036 c 0.1 0.024 0.206 0.012 0.298 -0.036 l 8.739 -4.566 l 0.118 -0.047 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.497 4.275 c 0.313 -0.171 0.693 -0.171 1.006 0.0 l 8.902 4.854 c 0.043 0.023 0.08 0.051 0.112 0.082 c 0.269 0.114 0.458 0.38 0.458 0.692 V 12.3 c 0.0 0.276 -0.15 0.513 -0.373 0.644 c -0.042 0.053 -0.095 0.1 -0.16 0.136 l -8.94 4.875 l -0.12 0.056 c -0.245 0.096 -0.519 0.096 -0.765 0.0 l -0.12 -0.056 l -8.918 -4.864 c -0.066 -0.036 -0.12 -0.082 -0.162 -0.136 c -0.233 -0.127 -0.392 -0.371 -0.392 -0.655 V 9.896 c 0.0 -0.315 0.194 -0.583 0.468 -0.695 c 0.03 -0.027 0.064 -0.051 0.102 -0.072 l 8.902 -4.854 Z m -7.972 7.663 l 2.326 1.21 l 1.34 0.664 l 4.059 2.214 V 14.77 l -7.725 -4.213 v 1.38 Z m 9.225 2.833 v 1.254 l 4.049 -2.208 l 1.351 -0.67 l 2.325 -1.316 v -1.274 L 12.75 14.77 Z m -3.585 -2.846 L 12.0 13.471 l 1.783 -0.974 l -2.846 -1.557 l -1.772 0.985 Z m 2.807 -1.56 l 2.856 1.563 l 4.288 -2.338 l -2.9 -1.582 l -4.244 2.357 Z M 4.882 9.59 l 3.243 1.768 l 4.168 -2.317 l -3.198 -1.749 L 4.883 9.59 Z m 5.258 -2.868 l 3.19 1.744 l 1.846 -1.025 L 12.0 5.708 l -1.86 1.014 Z")
        )
    }.build()
}
