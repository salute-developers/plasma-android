package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SteeringWheelOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SteeringWheelOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.409 13.25 c 0.06 -0.408 0.091 -0.825 0.091 -1.25 c 0.0 -0.253 -0.011 -0.503 -0.033 -0.75 c -2.19 -0.008 -3.458 -0.783 -4.598 -1.48 l -0.01 -0.006 C 14.757 9.09 13.782 8.498 12.0 8.498 c -1.719 0.0 -2.563 0.548 -3.566 1.198 L 8.345 9.754 c -0.534 0.346 -1.14 0.73 -1.92 1.02 c -0.779 0.288 -1.702 0.473 -2.892 0.476 C 3.51 11.497 3.5 11.747 3.5 12.0 c 0.0 0.425 0.031 0.842 0.091 1.25 H 7.0 c 2.071 0.0 3.75 1.679 3.75 3.75 v 3.409 c 0.408 0.06 0.825 0.091 1.25 0.091 c 0.425 0.0 0.842 -0.031 1.25 -0.091 V 17.0 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 h 3.409 Z m -0.364 1.5 H 17.0 c -1.243 0.0 -2.25 1.007 -2.25 2.25 v 3.045 c 2.482 -0.848 4.447 -2.813 5.295 -5.295 Z M 9.25 20.045 c -2.482 -0.848 -4.447 -2.813 -5.295 -5.295 H 7.0 c 1.243 0.0 2.25 1.007 2.25 2.25 v 3.045 Z m -5.448 -10.3 C 4.79 6.146 8.086 3.5 12.0 3.5 c 3.913 0.0 7.21 2.645 8.198 6.244 c -1.594 -0.063 -2.519 -0.625 -3.557 -1.26 l -0.01 -0.006 c -1.145 -0.7 -2.42 -1.48 -4.631 -1.48 c -2.164 0.0 -3.317 0.749 -4.372 1.433 L 7.53 8.495 C 7.002 8.836 6.515 9.14 5.903 9.367 c -0.545 0.202 -1.21 0.351 -2.1 0.379 Z M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 2.0 -10.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 s -2.0 -0.895 -2.0 -2.0 s 0.895 -2.0 2.0 -2.0 s 2.0 0.895 2.0 2.0 Z")
        )
    }.build()
}
