package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BallOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BallOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.82 2.462 C 3.612 3.332 2.05 5.483 2.05 8.0 c 0.0 0.492 0.457 1.106 1.59 1.627 c 0.3 0.137 0.635 0.262 0.999 0.37 C 4.549 9.362 4.5 8.692 4.5 8.0 c 0.0 -1.846 0.343 -3.543 0.92 -4.798 c 0.118 -0.259 0.252 -0.508 0.4 -0.74 Z M 8.0 1.0 C 4.134 1.0 1.0 4.134 1.0 8.0 s 3.134 7.0 7.0 7.0 s 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 Z m 5.95 7.0 c 0.0 -3.286 -2.664 -5.95 -5.95 -5.95 c -0.492 0.0 -1.106 0.457 -1.627 1.59 C 5.873 4.73 5.55 6.27 5.55 8.0 c 0.0 0.801 0.07 1.562 0.194 2.256 C 6.438 10.381 7.199 10.45 8.0 10.45 c 1.73 0.0 3.27 -0.323 4.36 -0.823 C 13.492 9.106 13.95 8.492 13.95 8.0 Z m -7.947 3.361 C 6.638 11.451 7.308 11.5 8.0 11.5 c 1.846 0.0 3.543 -0.343 4.798 -0.92 c 0.259 -0.118 0.508 -0.252 0.74 -0.4 c -0.87 2.208 -3.021 3.77 -5.538 3.77 c -0.492 0.0 -1.106 -0.457 -1.627 -1.59 c -0.137 -0.3 -0.262 -0.635 -0.37 -0.999 Z m -1.146 -0.218 c -0.607 -0.148 -1.165 -0.337 -1.655 -0.562 c -0.259 -0.12 -0.508 -0.253 -0.74 -0.401 c 0.604 1.533 1.825 2.754 3.358 3.358 c -0.148 -0.232 -0.282 -0.481 -0.4 -0.74 c -0.226 -0.49 -0.415 -1.048 -0.563 -1.655 Z")
        )
    }.build()
}
