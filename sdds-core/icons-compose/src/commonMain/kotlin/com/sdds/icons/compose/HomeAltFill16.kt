package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HomeAltFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HomeAltFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.463 1.302 c -0.305 -0.07 -0.621 -0.07 -0.926 0.0 C 7.19 1.382 6.877 1.578 6.46 1.84 L 2.376 4.403 C 2.002 4.638 1.72 4.815 1.508 5.063 C 1.322 5.282 1.182 5.536 1.097 5.81 C 1.0 6.122 1.0 6.458 1.0 6.904 v 4.793 c 0.0 0.427 0.0 0.78 0.023 1.066 c 0.024 0.298 0.076 0.572 0.206 0.83 c 0.201 0.398 0.523 0.723 0.918 0.926 c 0.254 0.131 0.526 0.183 0.82 0.208 c 0.285 0.023 0.634 0.023 1.056 0.023 h 7.954 c 0.422 0.0 0.771 0.0 1.055 -0.023 c 0.295 -0.025 0.567 -0.077 0.821 -0.208 c 0.396 -0.203 0.717 -0.528 0.918 -0.927 c 0.13 -0.257 0.182 -0.53 0.206 -0.829 C 15.0 12.476 15.0 12.124 15.0 11.697 V 6.904 c 0.0 -0.446 0.0 -0.782 -0.097 -1.094 c -0.085 -0.274 -0.225 -0.528 -0.41 -0.747 c -0.212 -0.248 -0.495 -0.425 -0.87 -0.66 L 9.54 1.84 C 9.124 1.578 8.81 1.38 8.463 1.302 Z m 1.637 6.38 c -1.16 0.0 -2.1 0.94 -2.1 2.1 v 3.907 h 4.2 V 9.782 c 0.0 -1.16 -0.94 -2.1 -2.1 -2.1 Z")
        )
    }.build()
}
