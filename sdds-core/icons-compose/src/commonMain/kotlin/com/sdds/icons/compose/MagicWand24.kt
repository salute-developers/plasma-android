package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MagicWand24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MagicWand24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.767 2.722 c 0.075 -0.23 0.4 -0.23 0.475 0.0 L 8.52 3.57 c 0.297 0.905 1.007 1.615 1.912 1.913 l 0.849 0.28 c 0.23 0.074 0.23 0.399 0.0 0.474 l -0.849 0.28 C 9.528 6.813 8.818 7.523 8.521 8.428 L 8.24 9.277 c -0.075 0.23 -0.4 0.23 -0.474 0.0 L 7.487 8.43 C 7.19 7.524 6.48 6.814 5.575 6.516 L 4.726 6.237 c -0.229 -0.075 -0.229 -0.4 0.0 -0.475 l 0.849 -0.279 C 6.48 5.185 7.19 4.475 7.487 3.57 l 0.28 -0.848 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.877 17.413 c 0.038 -0.126 0.216 -0.126 0.255 0.0 l 0.136 0.442 c 0.13 0.421 0.46 0.75 0.88 0.88 l 0.443 0.137 c 0.125 0.039 0.125 0.216 0.0 0.255 l -0.442 0.136 c -0.421 0.13 -0.751 0.46 -0.881 0.881 l -0.136 0.442 c -0.04 0.126 -0.217 0.126 -0.255 0.0 l -0.137 -0.441 c -0.13 -0.422 -0.46 -0.752 -0.88 -0.882 l -0.443 -0.136 c -0.125 -0.039 -0.125 -0.216 0.0 -0.255 l 0.442 -0.136 c 0.421 -0.13 0.751 -0.46 0.881 -0.881 l 0.137 -0.442 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.195 12.62 c -0.058 -0.189 -0.324 -0.189 -0.382 0.0 l -0.204 0.662 c -0.195 0.632 -0.69 1.127 -1.322 1.322 l -0.663 0.205 c -0.188 0.058 -0.188 0.324 0.0 0.382 l 0.663 0.204 c 0.632 0.195 1.127 0.69 1.322 1.322 l 0.204 0.663 c 0.058 0.188 0.324 0.188 0.382 0.0 l 0.205 -0.663 c 0.195 -0.632 0.69 -1.127 1.321 -1.322 l 0.663 -0.204 c 0.188 -0.058 0.188 -0.325 0.0 -0.383 l -0.663 -0.204 c -0.632 -0.195 -1.127 -0.69 -1.321 -1.322 l -0.205 -0.663 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.099 3.594 c 0.914 -0.914 2.396 -0.914 3.31 0.0 c 0.915 0.914 0.915 2.397 0.0 3.311 L 6.913 20.407 c -0.916 0.916 -2.4 0.916 -3.316 0.0 c -0.915 -0.915 -0.915 -2.4 0.0 -3.315 L 17.1 3.594 Z m -0.5 5.0 L 5.851 19.347 c -0.33 0.33 -0.864 0.33 -1.194 0.0 c -0.33 -0.33 -0.33 -0.864 0.0 -1.193 L 15.41 7.404 l 1.19 1.19 Z")
        )
    }.build()
}
