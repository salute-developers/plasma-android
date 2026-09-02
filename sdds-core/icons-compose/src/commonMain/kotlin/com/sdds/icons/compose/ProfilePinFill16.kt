package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfilePinFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfilePinFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.422 4.693 c 0.372 0.0 0.656 0.344 0.598 0.723 l -0.358 2.307 c -0.037 0.236 0.022 0.478 0.163 0.669 l 1.031 1.395 c 0.426 0.576 0.027 1.405 -0.674 1.406 H 12.47 v 2.75 l -0.564 0.75 l -0.566 -0.75 v -2.75 H 9.63 c -0.701 0.0 -1.1 -0.83 -0.674 -1.406 l 1.031 -1.395 c 0.141 -0.19 0.2 -0.433 0.163 -0.67 L 9.793 5.417 c -0.059 -0.38 0.225 -0.723 0.598 -0.723 h 3.03 Z M 5.984 7.788 c 1.06 0.04 2.063 0.303 2.967 0.743 L 8.354 9.342 c -0.705 0.953 -0.183 2.353 0.965 2.57 c -0.143 0.042 -0.295 0.066 -0.452 0.066 H 2.534 c -0.907 0.0 -1.642 -0.735 -1.642 -1.642 c 0.0 -0.494 0.223 -0.997 0.67 -1.296 c 1.187 -0.794 2.61 -1.257 4.137 -1.258 l 0.285 0.006 Z m -0.286 -6.13 c 1.511 0.0 2.72 1.247 2.72 2.763 c 0.0 1.517 -1.21 2.763 -2.72 2.763 c -1.51 0.0 -2.72 -1.246 -2.72 -2.763 s 1.21 -2.763 2.72 -2.764 Z")
        )
    }.build()
}
