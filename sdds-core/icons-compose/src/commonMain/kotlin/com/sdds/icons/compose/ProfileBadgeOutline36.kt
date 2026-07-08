package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileBadgeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileBadgeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.664 11.185 c 0.0 -3.016 2.405 -5.435 5.34 -5.435 c 2.934 0.0 5.339 2.42 5.339 5.435 c 0.0 3.016 -2.405 5.436 -5.34 5.436 c -2.934 0.0 -5.339 -2.42 -5.339 -5.436 Z m 5.34 -7.435 c -4.068 0.0 -7.34 3.343 -7.34 7.435 s 3.272 7.436 7.34 7.436 c 4.067 0.0 7.339 -3.343 7.339 -7.436 c 0.0 -4.092 -3.272 -7.435 -7.34 -7.435 Z M 7.452 26.382 c 3.024 -2.034 6.65 -3.218 10.549 -3.218 c 3.899 0.0 7.523 1.183 10.547 3.217 c 0.49 0.329 0.75 0.88 0.695 1.412 c -0.049 0.464 -0.129 0.742 -0.237 0.954 c -0.264 0.518 -0.684 0.939 -1.202 1.202 c -0.236 0.12 -0.553 0.206 -1.117 0.252 c -0.575 0.047 -1.315 0.048 -2.381 0.048 H 11.695 c -1.066 0.0 -1.806 0.0 -2.381 -0.048 c -0.564 -0.046 -0.88 -0.131 -1.117 -0.252 c -0.517 -0.264 -0.938 -0.684 -1.202 -1.202 c -0.108 -0.212 -0.188 -0.49 -0.237 -0.953 c -0.055 -0.532 0.206 -1.083 0.695 -1.412 Z m 10.549 -5.218 c -4.311 0.0 -8.323 1.31 -11.666 3.559 c -1.058 0.711 -1.705 1.958 -1.567 3.28 c 0.063 0.602 0.185 1.144 0.444 1.652 c 0.456 0.894 1.182 1.62 2.076 2.076 c 0.566 0.288 1.175 0.407 1.862 0.463 c 0.666 0.055 1.488 0.055 2.502 0.055 h 12.696 c 1.014 0.0 1.836 0.0 2.502 -0.055 c 0.687 -0.056 1.297 -0.175 1.862 -0.463 c 0.894 -0.455 1.62 -1.182 2.076 -2.076 c 0.26 -0.508 0.381 -1.051 0.444 -1.654 c 0.138 -1.321 -0.51 -2.568 -1.568 -3.28 c -3.342 -2.247 -7.353 -3.557 -11.663 -3.557 Z m 2.984 5.3 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 4.475 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -4.475 Z")
        )
    }.build()
}
