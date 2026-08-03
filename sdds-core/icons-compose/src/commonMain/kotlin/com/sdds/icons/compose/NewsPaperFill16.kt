package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NewsPaperFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NewsPaperFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.925 2.25 C 1.862 2.25 1.0 3.135 1.0 4.227 v 7.546 c 0.0 1.092 0.862 1.977 1.925 1.977 h 10.15 c 1.063 0.0 1.925 -0.885 1.925 -1.977 V 4.227 c 0.0 -1.092 -0.862 -1.977 -1.925 -1.977 H 2.925 Z m 0.7 8.266 c -0.29 0.0 -0.525 0.241 -0.525 0.539 c 0.0 0.297 0.235 0.539 0.525 0.539 h 8.75 c 0.29 0.0 0.525 -0.242 0.525 -0.54 c 0.0 -0.297 -0.235 -0.538 -0.525 -0.538 h -8.75 Z M 3.1 8.898 c 0.0 -0.297 0.235 -0.539 0.525 -0.539 h 8.75 c 0.29 0.0 0.525 0.242 0.525 0.54 c 0.0 0.297 -0.235 0.539 -0.525 0.539 h -8.75 c -0.29 0.0 -0.525 -0.242 -0.525 -0.54 Z m 0.057 -4.197 C 3.1 4.816 3.1 4.967 3.1 5.269 v 1.15 c 0.0 0.302 0.0 0.453 0.057 0.568 c 0.05 0.101 0.13 0.184 0.23 0.236 C 3.499 7.28 3.646 7.28 3.94 7.28 h 3.22 c 0.294 0.0 0.441 0.0 0.553 -0.058 c 0.1 -0.052 0.18 -0.135 0.23 -0.236 C 8.0 6.872 8.0 6.72 8.0 6.419 v -1.15 C 8.0 4.967 8.0 4.816 7.943 4.7 c -0.05 -0.102 -0.13 -0.184 -0.23 -0.236 C 7.601 4.406 7.454 4.406 7.16 4.406 H 3.94 c -0.294 0.0 -0.441 0.0 -0.553 0.059 c -0.1 0.052 -0.18 0.134 -0.23 0.236 Z")
        )
    }.build()
}
