package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePinOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePinOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.422 4.693 c 0.372 0.0 0.656 0.344 0.598 0.723 l -0.358 2.307 c -0.037 0.236 0.022 0.478 0.163 0.669 l 1.031 1.395 c 0.426 0.576 0.027 1.405 -0.674 1.406 H 12.47 v 2.75 l -0.564 0.75 l -0.566 -0.75 v -2.75 H 9.63 c -0.701 0.0 -1.1 -0.83 -0.674 -1.406 l 1.031 -1.395 c 0.141 -0.19 0.2 -0.433 0.163 -0.67 L 9.793 5.417 c -0.059 -0.38 0.225 -0.723 0.598 -0.723 h 3.03 Z M 5.984 7.788 c 1.06 0.04 2.063 0.303 2.967 0.743 L 8.354 9.342 l -0.008 0.01 c -0.81 -0.366 -1.705 -0.57 -2.647 -0.57 c -1.322 0.0 -2.552 0.4 -3.582 1.09 c -0.134 0.09 -0.225 0.26 -0.225 0.464 c 0.0 0.355 0.288 0.642 0.642 0.642 h 5.64 c 0.2 0.462 0.6 0.831 1.145 0.934 c -0.144 0.042 -0.295 0.066 -0.453 0.066 H 2.534 c -0.907 0.0 -1.642 -0.735 -1.642 -1.642 c 0.0 -0.494 0.223 -0.997 0.67 -1.296 c 1.187 -0.794 2.61 -1.257 4.137 -1.258 l 0.285 0.006 Z M 11.14 7.57 c 0.077 0.497 -0.046 1.008 -0.347 1.416 L 9.9 10.193 h 4.012 L 13.02 8.986 c -0.3 -0.408 -0.423 -0.92 -0.346 -1.416 l 0.29 -1.877 h -2.116 l 0.29 1.877 Z m -5.44 -5.913 c 1.51 0.0 2.718 1.248 2.718 2.764 c 0.0 1.517 -1.208 2.763 -2.719 2.763 c -1.51 0.0 -2.72 -1.246 -2.72 -2.763 s 1.21 -2.763 2.72 -2.764 Z m 0.0 1.0 c -0.941 0.0 -1.72 0.781 -1.72 1.764 s 0.78 1.763 1.72 1.763 s 1.718 -0.78 1.718 -1.763 c 0.0 -0.983 -0.779 -1.763 -1.719 -1.764 Z")
        )
    }.build()
}
