package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Magic24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Magic24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.455 3.777 c 0.332 -1.009 1.758 -1.009 2.09 0.0 l 0.803 2.441 c 0.223 0.679 0.755 1.211 1.434 1.434 l 2.441 0.803 c 1.009 0.332 1.009 1.758 0.0 2.09 l -2.44 0.803 c -0.68 0.223 -1.212 0.756 -1.435 1.434 l -0.803 2.442 c -0.332 1.008 -1.758 1.008 -2.09 0.0 l -0.803 -2.442 c -0.223 -0.678 -0.755 -1.21 -1.434 -1.434 l -2.441 -0.803 c -1.009 -0.332 -1.009 -1.758 0.0 -2.09 l 2.44 -0.803 C 6.898 7.43 7.43 6.897 7.653 6.218 l 0.803 -2.441 Z M 9.5 5.4 L 9.077 6.687 c -0.372 1.13 -1.26 2.018 -2.39 2.39 L 5.4 9.5 l 1.285 0.423 c 1.132 0.372 2.019 1.26 2.391 2.39 L 9.5 13.6 l 0.423 -1.286 c 0.372 -1.132 1.26 -2.019 2.39 -2.39 L 13.6 9.5 l -1.285 -0.423 c -1.132 -0.372 -2.02 -1.26 -2.391 -2.39 L 9.5 5.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.873 17.413 c 0.038 -0.125 0.216 -0.125 0.254 0.0 l 0.137 0.442 c 0.13 0.422 0.46 0.752 0.88 0.881 l 0.443 0.137 c 0.125 0.038 0.125 0.216 0.0 0.255 l -0.442 0.136 c -0.421 0.13 -0.751 0.46 -0.881 0.881 l -0.137 0.442 c -0.038 0.125 -0.216 0.125 -0.254 0.0 l -0.137 -0.442 c -0.13 -0.421 -0.46 -0.751 -0.88 -0.881 l -0.443 -0.136 c -0.125 -0.039 -0.125 -0.216 0.0 -0.255 l 0.442 -0.137 c 0.421 -0.13 0.751 -0.46 0.881 -0.88 l 0.137 -0.443 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.691 10.62 c -0.058 -0.188 -0.324 -0.188 -0.382 0.0 l -0.44 1.427 c -0.195 0.632 -0.69 1.127 -1.322 1.322 l -1.427 0.44 c -0.188 0.058 -0.188 0.324 0.0 0.382 l 1.427 0.44 c 0.632 0.195 1.127 0.69 1.322 1.322 l 0.44 1.428 c 0.058 0.188 0.324 0.188 0.382 0.0 l 0.44 -1.428 c 0.195 -0.632 0.69 -1.127 1.322 -1.321 l 1.427 -0.44 c 0.188 -0.059 0.188 -0.325 0.0 -0.383 l -1.427 -0.44 c -0.632 -0.195 -1.127 -0.69 -1.322 -1.322 l -0.44 -1.427 Z")
        )
    }.build()
}
