package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WaveLine24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WaveLine24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.872 11.132 C 5.186 12.062 4.19 12.75 2.75 12.75 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 c 0.685 0.0 1.126 -0.281 1.511 -0.804 C 4.691 9.363 5.0 8.542 5.334 7.554 l 0.097 -0.287 C 5.716 6.417 6.04 5.45 6.5 4.692 C 7.048 3.792 7.9 3.0 9.25 3.0 c 0.898 0.0 1.564 0.47 2.008 1.102 c 0.415 0.592 0.668 1.36 0.84 2.144 c 0.332 1.513 0.44 3.48 0.544 5.348 l 0.013 0.226 c 0.11 1.996 0.226 3.865 0.556 5.235 c 0.165 0.687 0.362 1.146 0.566 1.415 c 0.173 0.23 0.311 0.28 0.473 0.28 c 0.22 0.0 0.495 -0.104 0.854 -0.843 c 0.302 -0.621 0.532 -1.422 0.8 -2.36 l 0.167 -0.577 c 0.325 -1.114 0.728 -2.382 1.392 -3.371 c 0.7 -1.043 1.745 -1.849 3.287 -1.849 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 c -0.708 0.0 -1.194 0.319 -1.627 0.964 c -0.469 0.698 -0.8 1.68 -1.132 2.816 l -0.148 0.517 c -0.266 0.932 -0.554 1.94 -0.94 2.734 c -0.46 0.948 -1.248 1.969 -2.653 1.969 c -0.9 0.0 -1.59 -0.442 -2.069 -1.074 c -0.447 -0.592 -0.725 -1.363 -0.915 -2.153 c -0.381 -1.583 -0.5 -3.652 -0.608 -5.592 l -0.007 -0.122 c -0.108 -1.956 -0.21 -3.782 -0.507 -5.134 C 9.992 5.983 9.81 5.521 9.62 5.251 C 9.46 5.022 9.352 5.0 9.25 5.0 C 8.849 5.0 8.546 5.177 8.21 5.73 C 7.873 6.285 7.622 7.03 7.317 7.933 L 7.228 8.196 c -0.321 0.95 -0.715 2.066 -1.356 2.936 Z")
        )
    }.build()
}
