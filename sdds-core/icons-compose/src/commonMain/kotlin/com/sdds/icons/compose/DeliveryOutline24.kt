package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DeliveryOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DeliveryOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.529 3.554 C 4.144 3.4 3.708 3.587 3.554 3.972 C 3.4 4.356 3.587 4.792 3.972 4.947 l 2.044 0.817 c 0.072 0.03 0.127 0.09 0.148 0.164 l 2.068 7.238 c 0.556 1.945 2.553 3.099 4.515 2.608 l 7.185 -1.796 c 0.402 -0.1 0.646 -0.508 0.546 -0.91 c -0.1 -0.402 -0.508 -0.646 -0.91 -0.545 l -7.185 1.796 c -1.177 0.294 -2.375 -0.398 -2.709 -1.565 L 7.606 5.516 c -0.149 -0.52 -0.53 -0.943 -1.033 -1.144 L 4.53 3.554 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.882 6.933 c -1.067 0.285 -1.7 1.382 -1.414 2.449 l 0.724 2.702 c 0.286 1.067 1.382 1.7 2.45 1.414 l 4.064 -1.09 c 1.067 -0.285 1.7 -1.382 1.414 -2.449 l -0.724 -2.701 c -0.286 -1.067 -1.383 -1.7 -2.45 -1.414 l -4.064 1.089 Z m 4.453 0.36 L 11.27 8.38 c -0.266 0.072 -0.425 0.346 -0.353 0.613 l 0.724 2.701 c 0.071 0.267 0.345 0.425 0.612 0.354 l 4.064 -1.089 c 0.267 -0.072 0.425 -0.346 0.354 -0.612 l -0.724 -2.702 c -0.071 -0.267 -0.346 -0.425 -0.612 -0.354 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.75 20.75 c 1.38 0.0 2.5 -1.119 2.5 -2.5 c 0.0 -1.38 -1.12 -2.5 -2.5 -2.5 s -2.5 1.12 -2.5 2.5 c 0.0 1.381 1.12 2.5 2.5 2.5 Z m 0.0 -1.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z")
        )
    }.build()
}
