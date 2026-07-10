package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicErrorFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicErrorFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.523 1.143 C 8.273 1.05 8.005 1.0 7.725 1.0 c -1.353 0.0 -2.45 1.175 -2.45 2.625 v 4.2 c 0.0 1.45 1.097 2.625 2.45 2.625 c 1.264 0.0 2.304 -1.025 2.436 -2.342 C 8.592 7.405 7.5 5.83 7.5 4.0 c 0.0 -1.085 0.384 -2.08 1.023 -2.857 Z m 2.813 7.308 c -0.144 0.834 -0.569 1.596 -1.207 2.156 c -0.675 0.592 -1.542 0.918 -2.44 0.918 c -0.898 0.0 -1.765 -0.326 -2.44 -0.918 c -0.674 -0.592 -1.111 -1.409 -1.228 -2.299 c -0.036 -0.274 -0.288 -0.467 -0.561 -0.43 c -0.274 0.036 -0.467 0.287 -0.43 0.56 c 0.148 1.131 0.703 2.169 1.56 2.92 c 0.731 0.642 1.64 1.038 2.599 1.14 v 1.627 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -1.627 c 0.959 -0.102 1.868 -0.498 2.599 -1.14 c 0.845 -0.74 1.396 -1.76 1.554 -2.87 C 12.23 8.495 12.115 8.5 12.0 8.5 c -0.226 0.0 -0.448 -0.017 -0.664 -0.049 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -1.2 -5.444 c -0.136 -0.137 -0.358 -0.137 -0.494 0.0 c -0.137 0.137 -0.137 0.358 0.0 0.495 L 11.505 4.0 l -1.2 1.199 c -0.136 0.137 -0.136 0.358 0.0 0.495 c 0.137 0.137 0.359 0.137 0.496 0.0 l 1.198 -1.199 l 1.2 1.199 c 0.136 0.137 0.358 0.137 0.494 0.0 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 L 12.495 4.0 l 1.198 -1.199 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 c -0.136 -0.137 -0.358 -0.137 -0.495 0.0 L 12.0 3.505 l -1.198 -1.199 Z")
        )
    }.build()
}
