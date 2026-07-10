package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarDashOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarDashOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.162 5.707 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 l -7.74 7.74 l -2.794 -6.718 c -0.449 -1.08 -1.979 -1.08 -2.428 0.0 l -3.178 7.64 l -8.248 0.661 c -1.166 0.094 -1.638 1.549 -0.75 2.31 l 6.284 5.383 l -0.576 2.414 l -6.026 6.026 c -0.39 0.39 -0.39 1.023 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 L 31.162 5.707 Z m -18.19 15.361 l 7.506 -7.506 L 18.0 7.604 l -2.706 6.506 c -0.19 0.455 -0.617 0.766 -1.109 0.805 l -7.023 0.563 l 5.35 4.584 c 0.298 0.255 0.463 0.625 0.46 1.006 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.543 15.134 l 1.857 -1.857 l 4.24 0.34 c 1.166 0.093 1.639 1.548 0.75 2.309 l -6.284 5.383 l 1.92 8.049 c 0.271 1.137 -0.966 2.037 -1.965 1.427 L 18.0 26.472 l -7.061 4.313 c -0.626 0.382 -1.345 0.171 -1.729 -0.319 l 2.492 -2.49 l 5.613 -3.43 c 0.42 -0.256 0.95 -0.256 1.37 0.0 L 24.7 28.22 l -1.635 -6.854 c -0.115 -0.48 0.049 -0.983 0.423 -1.304 l 5.351 -4.584 l -4.295 -0.344 Z")
        )
    }.build()
}
