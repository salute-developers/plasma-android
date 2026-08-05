package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SctivityOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SctivityOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.492 2.605 l 2.701 4.679 l 1.381 -0.797 c -0.673 -1.394 -0.842 -2.919 -0.568 -4.35 c -1.16 -0.2 -2.385 -0.058 -3.514 0.468 Z m 4.532 -0.2 c -0.21 1.173 -0.07 2.413 0.462 3.555 l 2.386 -1.377 c -0.723 -1.033 -1.727 -1.773 -2.848 -2.178 Z m 3.373 3.087 L 11.01 6.87 c 0.723 1.033 1.727 1.773 2.848 2.178 c 0.21 -1.173 0.07 -2.413 -0.462 -3.555 Z m 0.186 4.57 c -1.378 -0.478 -2.613 -1.386 -3.484 -2.666 l -1.38 0.797 l 2.7 4.679 c 1.021 -0.715 1.756 -1.704 2.164 -2.81 Z m -3.073 3.335 L 7.809 8.718 l -1.38 0.797 c 0.672 1.394 0.841 2.919 0.567 4.35 c 1.16 0.2 2.385 0.058 3.514 -0.468 Z m -4.532 0.2 c 0.21 -1.173 0.07 -2.413 -0.462 -3.555 L 3.13 11.42 c 0.723 1.033 1.727 1.773 2.848 2.178 Z M 2.605 10.51 l 2.386 -1.377 C 4.268 8.1 3.264 7.36 2.144 6.955 c -0.21 1.173 -0.071 2.413 0.461 3.555 Z M 2.42 5.94 c 1.378 0.478 2.613 1.387 3.484 2.666 l 1.38 -0.797 l -2.7 -4.679 c -1.02 0.715 -1.756 1.704 -2.164 2.81 Z m 2.082 -4.001 c 1.66 -0.959 3.551 -1.16 5.27 -0.71 c 1.746 0.456 3.318 1.585 4.292 3.272 c 0.974 1.688 1.166 3.613 0.688 5.354 c -0.47 1.713 -1.59 3.25 -3.25 4.208 c -1.66 0.959 -3.551 1.16 -5.27 0.71 c -1.746 -0.456 -3.318 -1.585 -4.292 -3.272 C 0.965 9.814 0.773 7.888 1.25 6.147 c 0.47 -1.712 1.59 -3.25 3.25 -4.208 Z")
        )
    }.build()
}
