package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 15.0 C 6.0 8.373 11.373 3.0 18.0 3.0 s 12.0 5.373 12.0 12.0 c 0.0 4.098 -2.056 7.716 -5.187 9.88 c -0.603 0.417 -0.988 0.959 -1.087 1.52 l -0.43 2.442 c -0.288 1.627 -1.505 2.89 -3.046 3.281 v 0.502 c 0.0 1.035 -0.84 1.875 -1.875 1.875 h -0.75 c -1.035 0.0 -1.875 -0.84 -1.875 -1.875 v -0.502 c -1.541 -0.391 -2.758 -1.654 -3.045 -3.281 l -0.431 -2.443 c -0.1 -0.56 -0.484 -1.102 -1.087 -1.52 C 8.056 22.716 6.0 19.1 6.0 15.0 Z m 8.49 11.008 c -0.056 -0.311 -0.145 -0.606 -0.262 -0.883 h 7.544 c -0.117 0.277 -0.206 0.572 -0.261 0.883 l -0.431 2.443 C 20.92 29.347 20.142 30.0 19.232 30.0 h -2.466 c -0.91 0.0 -1.688 -0.653 -1.846 -1.55 l -0.432 -2.442 Z")
        )
    }.build()
}
