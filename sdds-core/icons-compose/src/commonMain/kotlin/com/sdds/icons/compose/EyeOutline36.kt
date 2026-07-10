package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EyeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EyeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.717 16.637 C 7.453 12.05 12.385 9.0 18.002 9.0 s 10.549 3.049 13.285 7.637 c 0.301 0.505 0.37 0.633 0.437 0.934 c 0.013 0.061 0.03 0.219 0.03 0.427 s -0.017 0.366 -0.03 0.427 c -0.066 0.302 -0.136 0.429 -0.437 0.934 c -2.736 4.588 -7.668 7.637 -13.285 7.637 S 7.453 23.947 4.717 19.36 c -0.301 -0.505 -0.371 -0.633 -0.437 -0.934 c -0.013 -0.06 -0.03 -0.219 -0.03 -0.427 s 0.017 -0.366 0.03 -0.427 c 0.066 -0.301 0.136 -0.429 0.437 -0.934 Z M 18.002 7.0 c -6.364 0.0 -11.928 3.457 -15.003 8.613 L 2.977 15.65 c -0.289 0.485 -0.512 0.859 -0.65 1.495 c -0.058 0.264 -0.077 0.584 -0.077 0.854 s 0.019 0.59 0.076 0.854 c 0.14 0.637 0.362 1.01 0.651 1.495 L 3.0 20.383 c 3.075 5.156 8.639 8.613 15.003 8.613 c 6.364 0.0 11.928 -3.457 15.003 -8.613 l 0.021 -0.036 c 0.29 -0.485 0.513 -0.858 0.652 -1.495 c 0.057 -0.263 0.076 -0.584 0.076 -0.854 s -0.019 -0.59 -0.076 -0.854 c -0.14 -0.636 -0.362 -1.01 -0.652 -1.495 l -0.021 -0.036 C 29.93 10.457 24.366 7.0 18.002 7.0 Z m 0.002 17.15 c 3.324 0.0 6.019 -2.755 6.019 -6.153 c 0.0 -3.398 -2.695 -6.152 -6.02 -6.152 c -3.324 0.0 -6.019 2.754 -6.019 6.152 s 2.695 6.153 6.02 6.153 Z")
        )
    }.build()
}
