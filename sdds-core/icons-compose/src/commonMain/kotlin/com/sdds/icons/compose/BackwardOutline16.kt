package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BackwardOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BackwardOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.27 2.713 V 2.86 v 1.736 c 0.0 0.321 0.257 0.584 0.579 0.591 c 3.603 0.083 6.549 2.76 7.07 6.22 c -0.51 -0.632 -1.067 -1.22 -1.78 -1.697 c -1.12 -0.75 -2.584 -1.204 -4.792 -1.27 H 7.333 C 7.25 8.436 7.16 8.433 7.08 8.438 c -0.091 0.005 -0.208 0.02 -0.329 0.08 c -0.163 0.078 -0.3 0.21 -0.384 0.372 c -0.062 0.12 -0.081 0.237 -0.089 0.329 C 6.27 9.299 6.27 9.39 6.27 9.477 v 1.28 v 0.145 l -0.102 -0.103 l -3.963 -3.991 l 3.963 -3.992 l 0.102 -0.103 Z m 0.796 -0.917 C 6.889 1.59 6.623 1.48 6.351 1.502 C 6.118 1.52 5.944 1.657 5.844 1.74 C 5.736 1.832 5.61 1.96 5.473 2.097 L 1.145 6.455 c -0.193 0.195 -0.193 0.51 0.0 0.705 l 4.328 4.358 c 0.137 0.138 0.263 0.265 0.371 0.356 c 0.1 0.084 0.274 0.22 0.507 0.24 c 0.272 0.021 0.538 -0.088 0.715 -0.295 c 0.152 -0.178 0.18 -0.398 0.192 -0.527 c 0.012 -0.141 0.012 -0.32 0.012 -0.515 V 9.491 V 9.437 L 7.317 9.44 c 2.081 0.062 3.345 0.486 4.265 1.101 c 0.926 0.62 1.55 1.46 2.322 2.497 l 0.025 0.033 C 14.27 13.53 15.0 13.29 15.0 12.716 v -0.213 c 0.0 -4.386 -3.399 -7.994 -7.73 -8.298 V 2.838 c 0.0 -0.195 0.0 -0.374 -0.012 -0.515 c -0.012 -0.13 -0.04 -0.349 -0.192 -0.527 Z")
        )
    }.build()
}
