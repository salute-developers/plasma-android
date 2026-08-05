package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellDoneFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellDoneFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.555 19.445 C 27.207 19.481 26.855 19.5 26.5 19.5 c -5.523 0.0 -10.0 -4.477 -10.0 -10.0 c 0.0 -2.43 0.866 -4.656 2.307 -6.389 C 18.545 3.038 18.273 3.0 18.0 3.0 c -0.394 0.0 -0.784 0.078 -1.148 0.23 c -0.364 0.152 -0.695 0.374 -0.973 0.655 c -0.279 0.28 -0.5 0.613 -0.65 0.98 c -0.144 0.349 -0.222 0.722 -0.228 1.1 c -1.386 0.4 -2.51 1.098 -3.406 2.045 c -1.436 1.521 -2.179 3.578 -2.593 5.737 c -0.415 2.163 -0.521 4.55 -0.597 6.808 L 8.382 21.24 c -0.055 1.692 -0.107 3.29 -0.262 4.72 H 6.75 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 22.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 h -1.37 c -0.155 -1.43 -0.207 -3.028 -0.262 -4.72 l -0.023 -0.685 c -0.012 -0.367 -0.025 -0.738 -0.04 -1.11 Z M 13.756 29.98 C 14.374 31.74 16.041 33.0 18.0 33.0 c 1.96 0.0 3.627 -1.26 4.244 -3.02 h -8.488 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 18.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 31.194 1.0 26.5 1.0 S 18.0 4.806 18.0 9.5 s 3.806 8.5 8.5 8.5 Z m 5.1 -11.55 c 0.248 -0.331 0.181 -0.801 -0.15 -1.05 c -0.331 -0.249 -0.802 -0.181 -1.05 0.15 l -5.445 7.26 l -2.89 -3.304 c -0.273 -0.312 -0.747 -0.343 -1.059 -0.07 c -0.312 0.272 -0.343 0.746 -0.07 1.058 l 3.5 4.0 c 0.148 0.17 0.366 0.264 0.592 0.255 c 0.226 -0.008 0.436 -0.118 0.572 -0.299 l 6.0 -8.0 Z")
        )
    }.build()
}
