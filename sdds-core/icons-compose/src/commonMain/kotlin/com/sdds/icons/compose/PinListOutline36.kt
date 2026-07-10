package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinListOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinListOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.114 7.877 l -4.365 5.574 c -0.634 0.81 -1.514 1.391 -2.506 1.658 l -5.076 1.363 c -0.372 0.1 -0.496 0.565 -0.224 0.837 L 15.93 25.3 c 0.272 0.273 0.736 0.148 0.836 -0.224 l 1.362 -5.08 c 0.266 -0.993 0.848 -1.873 1.657 -2.508 l 5.568 -4.37 l -5.238 -5.242 Z m -1.4 -1.456 c 0.648 -0.827 1.872 -0.9 2.614 -0.158 l 5.637 5.642 c 0.742 0.742 0.669 1.967 -0.157 2.615 l -5.791 4.544 c -0.468 0.367 -0.805 0.877 -0.96 1.452 l -1.361 5.08 c -0.499 1.86 -2.82 2.481 -4.18 1.12 l -2.932 -2.933 l -5.93 5.935 L 3.0 30.249 l 0.53 -2.657 l 5.93 -5.935 l -2.93 -2.933 c -1.36 -1.361 -0.739 -3.685 1.119 -4.184 l 5.076 -1.364 c 0.574 -0.154 1.083 -0.49 1.45 -0.96 l 4.54 -5.795 Z m 4.275 20.828 c -0.553 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.447 1.0 1.0 1.0 h 8.634 c 0.552 0.0 1.0 -0.447 1.0 -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 22.99 Z m 5.381 -17.035 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 2.628 c 0.553 0.0 1.0 0.448 1.0 1.0 s -0.447 1.0 -1.0 1.0 H 29.37 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z m -2.003 8.018 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 5.631 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.447 -1.0 -1.0 -1.0 h -5.63 Z")
        )
    }.build()
}
