package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlankXlsFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlankXlsFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.5 2.006 C 12.345 2.0 12.18 2.0 11.997 2.0 H 8.719 C 8.045 2.0 7.495 2.0 7.047 2.037 C 6.584 2.074 6.165 2.155 5.775 2.354 c -0.612 0.312 -1.11 0.81 -1.42 1.42 c -0.2 0.391 -0.28 0.81 -0.318 1.273 C 4.0 5.495 4.0 6.045 4.0 6.719 v 10.563 c 0.0 0.673 0.0 1.224 0.037 1.671 c 0.037 0.463 0.118 0.882 0.317 1.273 c 0.312 0.611 0.809 1.108 1.42 1.42 c 0.391 0.199 0.81 0.28 1.273 0.317 C 7.494 22.0 8.045 22.0 8.719 22.0 h 6.562 c 0.674 0.0 1.225 0.0 1.672 -0.037 c 0.463 -0.037 0.882 -0.118 1.273 -0.317 c 0.611 -0.312 1.108 -0.809 1.42 -1.42 c 0.199 -0.391 0.28 -0.81 0.317 -1.273 C 20.0 18.506 20.0 17.955 20.0 17.282 v -7.279 c 0.0 -0.182 0.0 -0.348 -0.006 -0.503 H 16.42 c -0.535 0.0 -0.98 0.0 -1.345 -0.03 c -0.38 -0.03 -0.736 -0.098 -1.073 -0.27 C 13.483 8.937 13.063 8.516 12.8 8.0 c -0.172 -0.338 -0.24 -0.694 -0.27 -1.074 C 12.5 6.56 12.5 6.115 12.5 5.58 V 2.006 Z m 2.52 14.732 c 0.33 0.113 0.606 0.207 0.606 0.472 c 0.0 0.242 -0.175 0.402 -0.59 0.402 c -0.56 0.0 -0.935 -0.276 -1.115 -0.446 v 0.92 c 0.255 0.16 0.705 0.264 1.16 0.264 c 1.015 0.0 1.44 -0.43 1.44 -1.174 c 0.0 -0.89 -0.65 -1.101 -1.165 -1.269 c -0.339 -0.11 -0.62 -0.201 -0.62 -0.455 c 0.0 -0.204 0.125 -0.364 0.6 -0.364 c 0.375 0.0 0.755 0.15 1.005 0.337 v -0.888 c -0.24 -0.11 -0.625 -0.187 -1.07 -0.187 c -1.0 0.0 -1.365 0.424 -1.365 1.119 c 0.0 0.888 0.618 1.1 1.114 1.269 Z m -3.735 1.54 v -3.856 h 0.82 v 3.03 h 1.54 v 0.826 h -2.36 Z M 8.52 16.3 L 7.5 18.278 h 0.94 l 0.685 -1.371 l 0.72 1.371 h 0.965 l -1.06 -1.994 l 1.005 -1.862 H 9.82 L 9.16 15.71 l -0.635 -1.29 h -0.95 l 0.945 1.88 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 5.55 V 2.5 c 0.22 0.16 0.422 0.36 0.666 0.606 l 4.228 4.228 C 19.14 7.578 19.341 7.78 19.5 8.0 h -3.05 c -0.572 0.0 -0.957 0.0 -1.252 -0.025 c -0.288 -0.023 -0.425 -0.065 -0.516 -0.111 c -0.235 -0.12 -0.426 -0.311 -0.546 -0.546 c -0.046 -0.091 -0.088 -0.228 -0.111 -0.515 C 14.0 6.507 14.0 6.123 14.0 5.55 Z")
        )
    }.build()
}
