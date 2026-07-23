package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinListOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinListOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.337 4.175 c 0.463 -0.59 1.337 -0.643 1.867 -0.113 l 3.753 3.753 c 0.53 0.53 0.478 1.405 -0.113 1.868 l -3.854 3.021 c -0.298 0.234 -0.513 0.558 -0.61 0.924 l -0.907 3.376 c -0.349 1.301 -1.975 1.737 -2.928 0.784 l -1.95 -1.95 l -3.889 3.89 l -1.768 0.353 l 0.354 -1.768 l 3.89 -3.889 l -1.95 -1.95 c -0.953 -0.952 -0.518 -2.579 0.783 -2.928 L 8.391 8.64 c 0.366 -0.098 0.69 -0.312 0.924 -0.61 l 3.022 -3.855 Z m 1.006 1.148 l -2.847 3.632 C 10.062 9.51 9.46 9.907 8.78 10.09 l -3.376 0.906 c -0.186 0.05 -0.248 0.282 -0.112 0.418 l 5.314 5.314 c 0.136 0.137 0.369 0.074 0.418 -0.111 l 0.906 -3.377 c 0.183 -0.68 0.58 -1.281 1.134 -1.715 l 3.633 -2.848 l -3.354 -3.353 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.25 18.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 c 0.0 0.415 0.336 0.75 0.75 0.75 H 21.0 c 0.414 0.0 0.75 -0.335 0.75 -0.75 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 h -5.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.75 6.75 C 18.75 6.336 19.086 6.0 19.5 6.0 h 1.75 C 21.664 6.0 22.0 6.336 22.0 6.75 S 21.664 7.5 21.25 7.5 H 19.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.5 12.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 c 0.0 0.415 0.336 0.75 0.75 0.75 h 3.75 c 0.414 0.0 0.75 -0.335 0.75 -0.75 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 H 17.5 Z")
        )
    }.build()
}
