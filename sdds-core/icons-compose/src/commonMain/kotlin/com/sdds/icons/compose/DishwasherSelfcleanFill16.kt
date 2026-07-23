package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherSelfcleanFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherSelfcleanFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.775 1.0 C 2.519 1.0 1.5 2.019 1.5 3.275 V 5.2 h 12.683 V 3.275 C 14.183 2.019 13.165 1.0 11.908 1.0 H 3.775 Z m 1.248 2.8 c 0.0 0.387 -0.315 0.7 -0.705 0.7 c -0.389 0.0 -0.704 -0.313 -0.704 -0.7 c 0.0 -0.386 0.315 -0.7 0.704 -0.7 c 0.39 0.0 0.705 0.313 0.705 0.7 Z M 8.37 3.275 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.525 0.525 0.525 h 3.17 c 0.29 0.0 0.526 -0.235 0.526 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 8.37 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.183 6.25 H 1.5 v 6.475 C 1.5 13.981 2.519 15.0 3.775 15.0 h 8.133 h 0.027 h -1.665 c -0.032 -0.06 -0.057 -0.12 -0.077 -0.178 l -0.37 -1.12 c -0.106 -0.317 -0.356 -0.566 -0.675 -0.67 L 8.02 12.664 c -1.13 -0.37 -1.13 -1.958 0.0 -2.328 l 1.128 -0.368 c 0.32 -0.105 0.57 -0.353 0.674 -0.67 l 0.371 -1.12 c 0.372 -1.124 1.971 -1.124 2.343 0.0 l 0.371 1.12 c 0.105 0.317 0.355 0.565 0.674 0.67 l 0.602 0.196 V 6.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.53 8.502 c -0.052 -0.16 -0.279 -0.16 -0.332 0.0 l -0.372 1.125 c -0.21 0.633 -0.708 1.129 -1.341 1.336 l -1.134 0.37 c -0.161 0.053 -0.161 0.28 0.0 0.333 l 1.134 0.37 c 0.633 0.208 1.131 0.704 1.341 1.337 l 0.372 1.125 c 0.053 0.16 0.28 0.16 0.333 0.0 l 0.372 -1.125 c 0.21 -0.633 0.708 -1.129 1.342 -1.336 l 1.134 -0.37 c 0.16 -0.053 0.16 -0.28 0.0 -0.333 l -1.134 -0.37 c -0.634 -0.208 -1.132 -0.704 -1.342 -1.337 l -0.372 -1.125 Z")
        )
    }.build()
}
