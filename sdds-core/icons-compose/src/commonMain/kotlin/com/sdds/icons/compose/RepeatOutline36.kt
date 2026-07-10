package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RepeatOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RepeatOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.05 4.043 c 0.39 -0.39 1.024 -0.39 1.414 0.0 l 3.784 3.786 c 0.39 0.39 0.39 1.023 0.0 1.414 l -3.784 3.785 c -0.39 0.391 -1.023 0.391 -1.414 0.0 c -0.39 -0.39 -0.391 -1.023 0.0 -1.414 l 2.077 -2.078 H 13.46 C 8.788 9.536 5.0 13.325 5.0 18.0 c 0.0 1.907 0.629 3.664 1.69 5.078 c 0.332 0.442 0.243 1.069 -0.198 1.4 c -0.442 0.332 -1.069 0.243 -1.4 -0.199 C 3.777 22.529 3.0 20.355 3.0 18.0 C 3.0 12.221 7.682 7.536 13.46 7.536 h 6.667 l -2.078 -2.08 c -0.39 -0.39 -0.39 -1.023 0.0 -1.413 Z m 11.458 7.478 c 0.441 -0.332 1.068 -0.243 1.4 0.199 C 32.22 13.47 33.0 15.645 33.0 18.0 c 0.0 5.779 -4.682 10.464 -10.46 10.464 h -6.667 l 2.078 2.08 c 0.39 0.39 0.39 1.023 0.0 1.413 c -0.392 0.39 -1.025 0.39 -1.415 0.0 l -3.784 -3.786 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 3.784 -3.785 c 0.39 -0.391 1.023 -0.391 1.414 0.0 c 0.39 0.39 0.391 1.023 0.0 1.413 l -2.077 2.08 h 6.668 C 27.212 26.464 31.0 22.674 31.0 18.0 c 0.0 -1.907 -0.63 -3.664 -1.692 -5.079 c -0.331 -0.442 -0.242 -1.069 0.2 -1.4 Z")
        )
    }.build()
}
