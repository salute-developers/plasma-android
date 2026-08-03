package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShareOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShareOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.73 2.713 V 2.86 v 1.736 c 0.0 0.321 -0.257 0.584 -0.579 0.591 c -3.603 0.083 -6.549 2.76 -7.07 6.22 c 0.51 -0.632 1.067 -1.22 1.78 -1.697 c 1.12 -0.75 2.584 -1.204 4.792 -1.27 h 0.014 C 8.75 8.436 8.84 8.433 8.92 8.438 c 0.091 0.005 0.208 0.02 0.329 0.08 c 0.163 0.078 0.3 0.21 0.384 0.372 c 0.062 0.12 0.081 0.237 0.089 0.329 C 9.73 9.299 9.73 9.39 9.73 9.477 v 1.28 v 0.145 l 0.102 -0.103 l 3.963 -3.991 l -3.963 -3.992 L 9.73 2.713 Z M 8.934 1.796 C 9.111 1.59 9.377 1.48 9.649 1.502 c 0.233 0.019 0.407 0.155 0.507 0.238 c 0.108 0.092 0.234 0.219 0.371 0.357 l 4.328 4.358 c 0.193 0.195 0.193 0.51 0.0 0.705 l -4.328 4.358 c -0.137 0.138 -0.263 0.265 -0.371 0.356 c -0.1 0.084 -0.274 0.22 -0.507 0.24 c -0.272 0.021 -0.538 -0.088 -0.715 -0.295 c -0.152 -0.178 -0.18 -0.398 -0.192 -0.527 c -0.012 -0.141 -0.012 -0.32 -0.012 -0.515 V 9.491 V 9.437 L 8.683 9.44 C 6.602 9.5 5.338 9.925 4.418 10.54 c -0.926 0.62 -1.55 1.46 -2.322 2.497 L 2.071 13.07 C 1.73 13.53 1.0 13.29 1.0 12.716 v -0.213 C 1.0 8.117 4.399 4.51 8.73 4.205 V 2.838 c 0.0 -0.195 0.0 -0.374 0.012 -0.515 c 0.012 -0.13 0.04 -0.349 0.192 -0.527 Z")
        )
    }.build()
}
