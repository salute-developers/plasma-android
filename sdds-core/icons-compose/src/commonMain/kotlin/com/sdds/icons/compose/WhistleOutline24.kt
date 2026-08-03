package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WhistleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WhistleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.889 7.095 C 5.958 6.381 7.214 6.0 8.5 6.0 c 0.199 0.0 0.39 0.079 0.53 0.22 c 0.141 0.14 0.22 0.331 0.22 0.53 v 2.0 h 1.5 v -2.0 C 10.75 6.336 11.086 6.0 11.5 6.0 h 9.75 C 21.664 6.0 22.0 6.336 22.0 6.75 v 3.75 c 0.0 0.335 -0.222 0.63 -0.544 0.721 l -6.275 1.793 c -0.09 0.026 -0.21 0.133 -0.237 0.336 c -0.13 0.984 -0.484 1.93 -1.04 2.761 c -0.714 1.07 -1.729 1.902 -2.917 2.394 c -1.187 0.492 -2.494 0.62 -3.755 0.37 c -1.261 -0.25 -2.42 -0.87 -3.328 -1.779 c -0.91 -0.909 -1.528 -2.067 -1.78 -3.328 c -0.25 -1.26 -0.121 -2.568 0.37 -3.755 C 2.988 8.825 3.82 7.81 4.89 7.095 Z M 7.75 7.557 c -0.722 0.11 -1.415 0.376 -2.028 0.786 c -0.822 0.55 -1.463 1.33 -1.841 2.244 c -0.379 0.913 -0.478 1.918 -0.285 2.889 c 0.193 0.97 0.67 1.86 1.368 2.56 c 0.7 0.699 1.59 1.175 2.56 1.368 c 0.97 0.193 1.976 0.094 2.89 -0.285 c 0.913 -0.378 1.694 -1.019 2.243 -1.841 c 0.428 -0.64 0.7 -1.367 0.8 -2.124 c 0.09 -0.681 0.544 -1.363 1.312 -1.582 L 20.5 9.934 V 7.5 h -8.25 v 2.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -3.0 c -0.199 0.0 -0.39 -0.079 -0.53 -0.22 C 7.829 9.89 7.75 9.7 7.75 9.5 V 7.557 Z")
        )
    }.build()
}
