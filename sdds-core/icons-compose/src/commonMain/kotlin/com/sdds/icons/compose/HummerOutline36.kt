package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HummerOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HummerOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.222 5.939 l 2.271 2.283 l 0.042 0.042 c 0.284 0.285 0.481 0.483 0.637 0.676 c 1.403 1.74 1.404 4.22 0.004 5.96 l 2.343 2.355 c 1.755 -1.398 4.257 -1.378 5.99 0.06 c 0.176 0.146 0.358 0.328 0.62 0.591 l 0.867 0.872 l 3.09 -3.105 l -9.048 -9.094 c -1.855 -1.864 -4.728 -2.078 -6.816 -0.64 Z m 3.864 12.711 l -2.302 -2.313 L 5.478 27.701 c -0.637 0.64 -0.637 1.68 0.0 2.32 c 0.634 0.638 1.66 0.638 2.294 0.0 l 11.314 -11.37 Z M 13.037 5.168 c 2.877 -2.89 7.543 -2.89 10.42 0.0 l 9.749 9.8 c 0.388 0.39 0.388 1.02 0.0 1.41 l -4.5 4.523 c -0.189 0.19 -0.444 0.295 -0.71 0.295 c -0.266 0.0 -0.52 -0.106 -0.709 -0.295 l -1.537 -1.545 c -0.316 -0.318 -0.425 -0.425 -0.517 -0.502 c -1.018 -0.844 -2.493 -0.844 -3.51 0.0 c -0.093 0.077 -0.202 0.184 -0.517 0.502 L 9.19 31.432 c -1.416 1.424 -3.714 1.424 -5.13 0.0 c -1.413 -1.42 -1.413 -3.72 0.0 -5.141 l 12.016 -12.077 c 0.342 -0.344 0.458 -0.463 0.54 -0.564 c 0.813 -1.008 0.813 -2.446 0.0 -3.454 c -0.082 -0.1 -0.198 -0.22 -0.54 -0.564 L 13.037 6.58 c -0.388 -0.39 -0.388 -1.02 0.0 -1.41 Z")
        )
    }.build()
}
