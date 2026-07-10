package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudErrorOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudErrorOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -1.2 -5.444 c -0.136 -0.137 -0.357 -0.137 -0.494 0.0 s -0.137 0.358 0.0 0.495 L 11.505 4.0 l -1.2 1.199 c -0.136 0.137 -0.136 0.358 0.0 0.495 c 0.138 0.137 0.36 0.137 0.496 0.0 L 12.0 4.495 l 1.198 1.199 c 0.137 0.137 0.359 0.137 0.495 0.0 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 L 12.495 4.0 l 1.199 -1.199 c 0.136 -0.137 0.136 -0.358 0.0 -0.495 c -0.137 -0.137 -0.359 -0.137 -0.496 0.0 L 12.0 3.505 l -1.2 -1.199 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.831 2.302 C 6.026 2.576 4.563 3.898 4.03 5.633 C 2.28 6.087 1.0 7.713 1.0 9.63 c 0.0 2.262 1.783 4.121 4.014 4.121 h 6.85 c 1.746 0.0 3.136 -1.454 3.136 -3.216 c 0.0 -0.978 -0.427 -1.86 -1.106 -2.45 c -0.399 0.184 -0.83 0.313 -1.281 0.375 C 13.417 8.77 14.0 9.577 14.0 10.534 c 0.0 1.238 -0.97 2.216 -2.135 2.216 H 5.014 C 3.364 12.75 2.0 11.367 2.0 9.63 c 0.0 -1.56 1.1 -2.836 2.516 -3.08 C 4.678 6.524 4.844 6.51 5.014 6.51 c 1.65 0.0 3.013 1.383 3.013 3.12 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 c 0.0 -2.218 -1.716 -4.05 -3.887 -4.118 c 0.452 -1.035 1.333 -1.82 2.401 -2.124 c 0.052 -0.379 0.15 -0.742 0.29 -1.085 Z")
        )
    }.build()
}
