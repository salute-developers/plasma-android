package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.714 2.311 l -0.167 -0.13 c -0.321 -0.242 -0.773 -0.242 -1.094 0.0 L 11.12 2.445 l -0.195 0.161 c -0.2 0.167 -0.415 0.353 -0.642 0.556 C 9.423 3.932 8.562 4.8 7.756 5.75 C 5.416 8.514 4.0 11.395 4.0 14.287 C 4.0 18.546 7.582 22.0 12.0 22.0 s 8.0 -3.454 8.0 -7.714 c 0.0 -2.892 -1.416 -5.773 -3.756 -8.534 c -0.806 -0.95 -1.666 -1.82 -2.528 -2.591 c -0.227 -0.203 -0.442 -0.389 -0.642 -0.556 l -0.36 -0.294 Z m -0.595 1.451 L 12.0 3.664 L 11.884 3.76 c -0.186 0.154 -0.386 0.328 -0.6 0.518 c -0.815 0.73 -1.627 1.55 -2.383 2.443 C 6.678 9.344 5.5 11.891 5.5 14.286 c 0.0 3.38 2.859 6.214 6.5 6.214 c 3.642 0.0 6.5 -2.833 6.5 -6.214 c 0.0 -2.395 -1.178 -4.942 -3.4 -7.565 c -0.757 -0.893 -1.57 -1.713 -2.385 -2.443 c -0.211 -0.19 -0.41 -0.362 -0.595 -0.516 Z")
        )
    }.build()
}
