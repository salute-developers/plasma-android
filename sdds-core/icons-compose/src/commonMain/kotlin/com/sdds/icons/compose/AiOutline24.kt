package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AiOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AiOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.455 8.477 c 0.331 -1.008 1.758 -1.008 2.09 0.0 l 0.802 2.441 c 0.224 0.679 0.756 1.21 1.435 1.434 l 2.441 0.804 c 1.009 0.332 1.009 1.758 0.0 2.09 l -2.441 0.802 c -0.679 0.224 -1.211 0.756 -1.435 1.435 l -0.802 2.44 c -0.332 1.009 -1.759 1.009 -2.09 0.0 l -0.803 -2.44 c -0.223 -0.679 -0.756 -1.212 -1.434 -1.435 l -2.44 -0.802 c -1.01 -0.332 -1.01 -1.759 0.0 -2.09 l 2.44 -0.804 c 0.678 -0.223 1.21 -0.755 1.434 -1.434 l 0.803 -2.441 Z m 0.622 2.91 c -0.372 1.13 -1.26 2.019 -2.39 2.39 L 5.4 14.202 l 1.286 0.422 c 1.132 0.373 2.019 1.26 2.39 2.391 L 9.5 18.3 l 0.423 -1.285 c 0.372 -1.131 1.26 -2.018 2.39 -2.39 L 13.6 14.2 l -1.286 -0.423 c -1.131 -0.372 -2.018 -1.26 -2.39 -2.392 L 9.5 10.101 l -0.423 1.285 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.31 4.32 c 0.057 -0.187 0.323 -0.187 0.381 0.0 l 0.44 1.428 c 0.195 0.632 0.69 1.127 1.322 1.322 l 1.428 0.44 c 0.188 0.057 0.188 0.324 0.0 0.382 l -1.428 0.44 c -0.632 0.194 -1.127 0.69 -1.321 1.322 l -0.44 1.427 c -0.059 0.188 -0.325 0.188 -0.383 0.0 l -0.44 -1.427 c -0.195 -0.632 -0.69 -1.128 -1.322 -1.323 L 14.12 7.892 c -0.188 -0.058 -0.188 -0.325 0.0 -0.383 l 1.427 -0.44 c 0.632 -0.194 1.127 -0.69 1.322 -1.321 l 0.44 -1.427 Z")
        )
    }.build()
}
