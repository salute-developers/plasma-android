package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicOffOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicOffOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.005 17.942 c 0.547 0.072 0.933 0.574 0.862 1.122 c -0.314 2.42 -1.486 4.647 -3.3 6.261 c -1.563 1.39 -3.511 2.245 -5.567 2.455 v 3.593 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 27.78 c -1.666 -0.17 -3.262 -0.764 -4.639 -1.723 l 1.443 -1.443 c 1.253 0.792 2.705 1.218 4.196 1.218 c 1.925 0.0 3.787 -0.71 5.238 -2.0 c 1.452 -1.292 2.393 -3.078 2.646 -5.026 c 0.07 -0.548 0.573 -0.935 1.12 -0.864 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.125 c 3.025 0.0 5.477 2.451 5.477 5.476 v 1.75 l 6.272 -6.27 c 0.39 -0.391 1.024 -0.391 1.414 0.0 c 0.39 0.39 0.39 1.023 0.0 1.413 L 5.707 30.95 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 5.742 -5.743 c -1.018 -1.377 -1.678 -3.003 -1.902 -4.73 c -0.071 -0.547 0.315 -1.05 0.863 -1.12 c 0.548 -0.072 1.049 0.315 1.12 0.863 c 0.167 1.287 0.636 2.504 1.353 3.553 l 1.796 -1.796 c -0.47 -0.807 -0.74 -1.747 -0.74 -2.748 V 8.6 c 0.0 -3.024 2.452 -5.476 5.476 -5.476 Z m 0.0 2.0 c -1.919 0.0 -3.475 1.556 -3.475 3.476 v 9.213 c 0.0 0.443 0.083 0.866 0.234 1.255 l 6.718 -6.717 V 8.6 c 0.0 -1.92 -1.556 -3.476 -3.476 -3.476 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.477 17.814 c 0.0 3.025 -2.452 5.477 -5.476 5.477 c -0.84 0.0 -1.636 -0.19 -2.347 -0.527 l 1.562 -1.562 c 0.252 0.058 0.515 0.089 0.785 0.089 c 1.92 0.0 3.476 -1.557 3.476 -3.477 V 16.94 l 2.0 -2.0 v 2.874 Z")
        )
    }.build()
}
