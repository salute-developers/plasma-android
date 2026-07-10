package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileSquareFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileSquareFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.482 3.0 H 8.518 c -0.813 0.0 -1.469 0.0 -2.0 0.043 c -0.546 0.045 -1.026 0.14 -1.47 0.366 c -0.706 0.36 -1.28 0.933 -1.64 1.639 c -0.226 0.444 -0.32 0.924 -0.365 1.47 C 3.0 7.05 3.0 7.706 3.0 8.519 v 6.964 c 0.0 0.813 0.0 1.469 0.043 2.0 c 0.045 0.546 0.14 1.026 0.366 1.47 c 0.36 0.706 0.933 1.28 1.639 1.64 c 0.444 0.226 0.924 0.32 1.47 0.365 C 7.05 21.0 7.706 21.0 8.519 21.0 h 6.964 c 0.813 0.0 1.469 0.0 2.0 -0.043 c 0.546 -0.045 1.026 -0.14 1.47 -0.366 c 0.706 -0.36 1.28 -0.933 1.64 -1.639 c 0.226 -0.444 0.32 -0.924 0.365 -1.47 C 21.0 16.95 21.0 16.294 21.0 15.482 V 8.518 c 0.0 -0.813 0.0 -1.469 -0.043 -2.0 c -0.045 -0.546 -0.14 -1.026 -0.366 -1.47 c -0.36 -0.706 -0.933 -1.28 -1.639 -1.64 c -0.444 -0.226 -0.924 -0.32 -1.47 -0.365 C 16.95 3.0 16.294 3.0 15.482 3.0 Z m 0.018 7.0 c 0.0 1.933 -1.567 3.5 -3.5 3.5 S 8.5 11.933 8.5 10.0 s 1.567 -3.5 3.5 -3.5 s 3.5 1.567 3.5 3.5 Z m 3.48 8.69 c -0.195 0.233 -0.435 0.425 -0.709 0.565 c -0.48 0.245 -1.11 0.245 -2.371 0.245 H 8.1 c -1.26 0.0 -1.89 0.0 -2.371 -0.245 c -0.274 -0.14 -0.514 -0.332 -0.708 -0.566 C 5.298 16.625 8.317 15.0 12.0 15.0 c 3.683 0.0 6.702 1.625 6.98 3.69 Z")
        )
    }.build()
}
