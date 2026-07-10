package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareScreenFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareScreenFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.528 8.495 h 10.944 c 0.481 0.0 0.882 0.0 1.21 0.024 c 0.342 0.025 0.663 0.08 0.967 0.22 c 0.465 0.214 0.844 0.555 1.081 0.976 c 0.155 0.274 0.215 0.564 0.243 0.872 C 21.0 10.883 21.0 11.246 21.0 11.68 v 6.63 c 0.0 0.434 0.0 0.797 -0.027 1.092 c -0.028 0.31 -0.088 0.599 -0.243 0.873 c -0.237 0.42 -0.616 0.762 -1.081 0.976 c -0.304 0.14 -0.625 0.194 -0.967 0.22 c -0.328 0.024 -0.729 0.024 -1.21 0.024 H 6.528 c -0.481 0.0 -0.882 0.0 -1.21 -0.024 c -0.342 -0.026 -0.663 -0.08 -0.967 -0.22 c -0.465 -0.214 -0.844 -0.556 -1.081 -0.976 C 3.115 20.0 3.055 19.71 3.027 19.402 C 3.0 19.106 3.0 18.744 3.0 18.31 v -6.63 c 0.0 -0.434 0.0 -0.797 0.027 -1.093 C 3.055 10.28 3.115 9.99 3.27 9.715 c 0.237 -0.42 0.616 -0.762 1.081 -0.977 c 0.304 -0.14 0.625 -0.194 0.967 -0.219 c 0.328 -0.024 0.729 -0.024 1.21 -0.024 Z M 11.47 2.72 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 3.0 3.0 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -1.72 -1.72 V 15.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 5.06 L 9.53 6.78 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 3.0 -3.0 Z")
        )
    }.build()
}
