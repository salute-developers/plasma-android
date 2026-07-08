package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropDashOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropDashOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.168 12.46 C 28.973 15.407 30.0 18.414 30.0 21.43 c 0.0 6.39 -5.373 11.57 -12.0 11.571 c -3.183 0.0 -6.076 -1.195 -8.224 -3.145 l 1.416 -1.417 C 12.967 30.022 15.35 31.0 18.0 31.0 c 5.591 0.0 10.0 -4.354 10.0 -9.571 c 0.0 -2.427 -0.788 -4.942 -2.289 -7.51 l 1.457 -1.458 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.179 3.272 c 0.482 -0.363 1.16 -0.363 1.642 0.0 l 0.25 0.195 l 0.54 0.44 c 0.3 0.25 0.622 0.53 0.962 0.834 c 1.293 1.157 2.584 2.46 3.792 3.886 c 0.162 0.19 0.32 0.382 0.476 0.573 l 4.908 -4.907 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 31.163 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 3.031 -3.031 C 6.478 25.133 6.0 23.334 6.0 21.428 c 0.0 -4.337 2.124 -8.66 5.634 -12.801 c 1.208 -1.426 2.5 -2.729 3.792 -3.886 c 0.34 -0.304 0.662 -0.583 0.963 -0.834 l 0.293 -0.241 l 0.497 -0.394 Z m 0.759 1.95 l -0.273 0.225 c -0.28 0.235 -0.584 0.497 -0.905 0.784 c -1.23 1.102 -2.457 2.34 -3.6 3.689 C 9.807 13.877 8.0 17.753 8.0 21.429 c 0.0 1.341 0.292 2.626 0.82 3.794 l 14.6 -14.601 c -0.189 -0.234 -0.382 -0.468 -0.58 -0.702 c -1.143 -1.35 -2.37 -2.587 -3.6 -3.689 c -0.32 -0.286 -0.622 -0.547 -0.902 -0.78 L 18.0 5.173 l -0.061 0.048 Z")
        )
    }.build()
}
