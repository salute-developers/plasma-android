package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldLinesOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldLinesOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.393 8.07 c 2.053 -0.937 3.764 -1.944 4.598 -2.459 c 0.833 0.515 2.545 1.522 4.598 2.458 c 2.054 0.937 4.548 1.848 6.883 2.064 c -0.183 9.224 -3.018 14.258 -5.765 17.0 c -2.529 2.521 -5.081 3.2 -5.716 3.337 c -0.636 -0.136 -3.188 -0.816 -5.716 -3.338 c -2.748 -2.741 -5.583 -7.775 -5.766 -16.999 c 2.336 -0.216 4.83 -1.127 6.883 -2.064 Z m 5.34 -4.354 c -0.455 -0.288 -1.03 -0.288 -1.484 0.0 c -0.585 0.372 -2.42 1.5 -4.686 2.533 c -2.294 1.046 -4.9 1.933 -7.063 1.933 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 10.258 3.077 16.089 6.362 19.366 c 3.263 3.255 6.608 3.868 6.955 3.925 l 0.026 0.004 c 0.024 0.003 0.078 0.01 0.148 0.01 c 0.07 0.0 0.124 -0.007 0.147 -0.01 l 0.023 -0.004 h 0.003 c 0.348 -0.057 3.692 -0.67 6.955 -3.925 c 3.285 -3.277 6.362 -9.108 6.362 -19.366 c 0.0 -0.553 -0.447 -1.0 -1.0 -1.0 c -2.162 0.0 -4.769 -0.887 -7.063 -1.933 c -2.265 -1.032 -4.1 -2.161 -4.686 -2.533 Z m -7.176 8.488 c -0.553 0.0 -1.0 0.448 -1.0 1.0 s 0.447 1.0 1.0 1.0 h 12.869 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -12.87 Z m 0.0 5.12 c -0.553 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.447 1.0 1.0 1.0 h 12.869 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 h -12.87 Z m 4.542 5.119 c -0.553 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.447 1.0 1.0 1.0 h 3.785 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 h -3.785 Z")
        )
    }.build()
}
