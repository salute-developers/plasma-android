package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherSelfcleanFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherSelfcleanFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.625 3.0 C 6.933 3.0 4.75 5.183 4.75 7.875 V 12.0 h 26.83 V 7.875 C 31.58 5.183 29.397 3.0 26.705 3.0 H 9.625 Z m 2.578 6.0 c 0.0 0.828 -0.668 1.5 -1.49 1.5 c -0.824 0.0 -1.491 -0.672 -1.491 -1.5 s 0.667 -1.5 1.49 -1.5 s 1.49 0.672 1.49 1.5 Z m 7.08 -1.125 c -0.622 0.0 -1.125 0.504 -1.125 1.125 s 0.503 1.125 1.125 1.125 h 6.707 c 0.621 0.0 1.125 -0.504 1.125 -1.125 s -0.504 -1.125 -1.125 -1.125 h -6.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.58 14.25 H 4.75 v 13.875 C 4.75 30.817 6.933 33.0 9.625 33.0 h 17.08 h 0.024 h -3.427 c -0.067 -0.13 -0.122 -0.256 -0.162 -0.38 l -0.785 -2.402 c -0.222 -0.679 -0.751 -1.211 -1.426 -1.435 l -2.386 -0.79 c -2.392 -0.791 -2.392 -4.195 0.0 -4.987 l 2.386 -0.79 c 0.675 -0.223 1.204 -0.755 1.426 -1.434 l 0.785 -2.402 c 0.786 -2.406 4.169 -2.406 4.955 0.0 l 0.785 2.402 c 0.222 0.679 0.751 1.211 1.426 1.434 l 1.274 0.422 V 14.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.974 19.09 c -0.113 -0.344 -0.6 -0.344 -0.713 0.0 l -0.782 2.394 c -0.444 1.358 -1.507 2.425 -2.863 2.874 l -2.376 0.786 c -0.342 0.114 -0.342 0.599 0.0 0.712 l 2.376 0.786 c 1.356 0.45 2.419 1.516 2.863 2.874 l 0.782 2.393 c 0.113 0.345 0.6 0.345 0.713 0.0 l 0.782 -2.393 c 0.444 -1.358 1.507 -2.425 2.863 -2.874 l 2.375 -0.786 c 0.343 -0.114 0.343 -0.599 0.0 -0.712 l -2.375 -0.786 c -1.356 -0.45 -2.42 -1.516 -2.863 -2.874 l -0.782 -2.393 Z")
        )
    }.build()
}
