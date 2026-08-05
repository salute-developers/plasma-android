package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PawFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PawFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.365 3.351 c 0.0 -0.866 0.682 -1.6 1.563 -1.6 c 0.88 0.0 1.562 0.734 1.562 1.6 c 0.0 0.866 -0.682 1.6 -1.562 1.6 s -1.563 -0.734 -1.563 -1.6 Z M 2.813 5.315 c -0.881 0.0 -1.563 0.734 -1.563 1.6 c 0.0 0.867 0.682 1.601 1.563 1.601 c 0.88 0.0 1.562 -0.734 1.562 -1.6 c 0.0 -0.867 -0.682 -1.601 -1.562 -1.601 Z M 9.856 7.1 c -0.876 -1.432 -2.83 -1.432 -3.706 0.0 l -2.108 3.446 c -0.48 0.784 -0.461 1.7 -0.114 2.417 c 0.348 0.718 1.053 1.283 1.967 1.283 h 4.216 c 0.914 0.0 1.62 -0.565 1.968 -1.283 c 0.347 -0.717 0.365 -1.633 -0.115 -2.417 L 9.856 7.101 Z m 3.332 -1.786 c -0.88 0.0 -1.562 0.734 -1.562 1.6 c 0.0 0.867 0.682 1.601 1.563 1.601 c 0.88 0.0 1.562 -0.734 1.562 -1.6 c 0.0 -0.867 -0.682 -1.601 -1.563 -1.601 Z M 8.515 3.35 c 0.0 -0.866 0.682 -1.6 1.563 -1.6 c 0.88 0.0 1.562 0.734 1.562 1.6 c 0.0 0.866 -0.682 1.6 -1.562 1.6 s -1.563 -0.734 -1.563 -1.6 Z")
        )
    }.build()
}
