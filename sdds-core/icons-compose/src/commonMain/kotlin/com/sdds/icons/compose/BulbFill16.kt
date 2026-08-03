package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.4 6.6 C 2.4 3.507 4.907 1.0 8.0 1.0 c 3.093 0.0 5.6 2.507 5.6 5.6 c 0.0 1.913 -0.96 3.601 -2.42 4.61 c -0.282 0.195 -0.462 0.448 -0.508 0.71 l -0.201 1.14 c -0.134 0.759 -0.702 1.348 -1.421 1.53 v 0.235 c 0.0 0.483 -0.392 0.875 -0.875 0.875 h -0.35 c -0.483 0.0 -0.875 -0.392 -0.875 -0.875 v -0.234 c -0.72 -0.183 -1.287 -0.772 -1.421 -1.531 l -0.201 -1.14 c -0.047 -0.262 -0.226 -0.515 -0.508 -0.71 C 3.36 10.201 2.4 8.513 2.4 6.6 Z m 3.962 5.137 c -0.026 -0.145 -0.068 -0.283 -0.123 -0.412 H 9.76 c -0.054 0.13 -0.096 0.267 -0.122 0.412 l -0.201 1.14 C 9.363 13.295 9.0 13.6 8.575 13.6 h -1.15 c -0.425 0.0 -0.788 -0.305 -0.862 -0.723 l -0.201 -1.14 Z")
        )
    }.build()
}
