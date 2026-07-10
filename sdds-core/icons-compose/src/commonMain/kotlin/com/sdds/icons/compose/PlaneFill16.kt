package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.765 5.07 c -0.34 -0.219 -0.39 -0.695 -0.104 -0.98 c 0.334 -0.335 0.826 -0.456 1.277 -0.314 L 8.827 5.31 l 1.902 -2.023 c 0.527 -0.56 1.412 -0.574 1.956 -0.03 c 0.544 0.544 0.53 1.43 -0.03 1.957 l -2.024 1.902 l 1.534 4.888 c 0.142 0.45 0.021 0.943 -0.313 1.277 c -0.286 0.285 -0.762 0.235 -0.981 -0.105 l -2.527 -3.91 l -1.873 1.762 l 0.007 0.825 c 0.003 0.376 -0.145 0.737 -0.41 1.002 L 5.46 13.462 c -0.091 0.092 -0.247 0.056 -0.29 -0.067 l -0.666 -1.957 l -1.957 -0.668 c -0.123 -0.041 -0.159 -0.197 -0.067 -0.289 l 0.607 -0.607 C 3.353 9.608 3.714 9.46 4.09 9.464 L 4.915 9.47 l 1.761 -1.873 L 2.765 5.07 Z")
        )
    }.build()
}
