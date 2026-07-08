package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SortAlphabetDesc24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SortAlphabetDesc24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.895 11.6 H 4.36 l 3.38 -9.7 h 1.569 l 3.332 9.7 h -1.467 l -0.81 -2.388 H 6.717 L 5.895 11.6 Z M 9.85 7.682 L 8.55 3.845 l -1.31 3.837 H 9.85 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.022 10.12 c 0.297 -0.288 0.305 -0.763 0.017 -1.06 l -2.5 -2.581 C 17.397 6.333 17.203 6.25 17.0 6.25 s -0.397 0.083 -0.539 0.229 l -2.5 2.58 c -0.288 0.298 -0.28 0.773 0.017 1.06 c 0.298 0.289 0.773 0.281 1.06 -0.016 l 1.212 -1.25 V 17.0 c 0.0 0.415 0.336 0.75 0.75 0.75 s 0.75 -0.335 0.75 -0.75 V 8.852 l 1.211 1.25 c 0.289 0.298 0.763 0.306 1.06 0.018 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.092 22.1 l 1.869 -3.126 c 0.095 0.012 0.191 0.018 0.287 0.018 h 1.858 V 22.1 H 11.6 v -9.7 H 8.61 c -1.214 0.0 -2.156 0.275 -2.81 0.839 c -0.656 0.567 -0.977 1.408 -0.977 2.505 c 0.0 0.74 0.143 1.361 0.437 1.856 c 0.276 0.464 0.68 0.811 1.209 1.041 l -2.149 3.46 h 1.772 Z m 2.494 -4.624 c -0.798 0.0 -1.36 -0.13 -1.706 -0.374 c -0.327 -0.246 -0.503 -0.666 -0.503 -1.29 c 0.0 -0.708 0.19 -1.182 0.541 -1.454 c 0.37 -0.28 0.922 -0.428 1.668 -0.428 h 1.52 v 3.546 h -1.52 Z")
        )
    }.build()
}
