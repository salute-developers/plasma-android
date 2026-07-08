package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RepeatOneOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RepeatOneOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.463 4.043 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 c -0.39 0.39 -0.39 1.023 0.0 1.414 l 2.077 2.079 H 13.46 C 7.682 7.536 3.0 12.22 3.0 17.999 c 0.0 2.355 0.778 4.53 2.091 6.28 c 0.332 0.44 0.959 0.53 1.4 0.198 c 0.442 -0.331 0.531 -0.958 0.2 -1.4 C 5.629 21.663 5.0 19.906 5.0 18.0 c 0.0 -4.674 3.788 -8.463 8.46 -8.463 h 9.08 c 0.404 0.0 0.769 -0.244 0.924 -0.618 c 0.154 -0.373 0.069 -0.803 -0.217 -1.09 l -3.784 -3.785 Z m 11.444 7.677 c -0.332 -0.442 -0.959 -0.531 -1.4 -0.2 c -0.442 0.332 -0.531 0.959 -0.2 1.4 C 30.37 14.336 31.0 16.093 31.0 18.0 c 0.0 4.674 -3.788 8.463 -8.46 8.463 h -9.08 c -0.404 0.0 -0.769 0.244 -0.924 0.617 c -0.155 0.374 -0.07 0.804 0.217 1.09 l 3.783 3.786 c 0.39 0.39 1.024 0.39 1.415 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 l -2.078 -2.079 h 6.668 c 5.777 0.0 10.459 -4.685 10.459 -10.464 c 0.0 -2.354 -0.779 -4.53 -2.092 -6.28 Z m -11.53 1.737 c 0.0 -0.405 -0.243 -0.77 -0.617 -0.924 c -0.374 -0.155 -0.804 -0.069 -1.09 0.217 l -2.27 2.271 c -0.39 0.391 -0.39 1.024 0.0 1.415 c 0.391 0.39 1.024 0.39 1.415 0.0 l 0.563 -0.564 v 6.67 c 0.0 0.553 0.447 1.0 1.0 1.0 c 0.552 0.0 1.0 -0.447 1.0 -1.0 v -9.085 Z")
        )
    }.build()
}
