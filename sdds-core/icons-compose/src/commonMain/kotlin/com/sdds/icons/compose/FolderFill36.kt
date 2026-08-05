package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FolderFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FolderFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.478 6.5 c 1.132 0.0 1.499 0.009 1.774 0.084 c 0.81 0.222 1.442 0.855 1.664 1.665 c 0.041 0.15 0.062 0.327 0.073 0.643 H 10.2 c -2.52 0.0 -3.78 0.0 -4.743 0.49 C 5.346 9.44 5.237 9.5 5.132 9.565 c 0.006 -0.306 0.017 -0.568 0.036 -0.8 c 0.04 -0.501 0.116 -0.772 0.216 -0.968 c 0.228 -0.447 0.59 -0.81 1.038 -1.038 c 0.196 -0.1 0.467 -0.175 0.968 -0.216 C 7.902 6.5 8.563 6.5 9.525 6.5 h 3.953 Z M 3.125 12.572 v -1.714 c 0.0 -0.91 0.0 -1.652 0.05 -2.256 c 0.05 -0.625 0.16 -1.188 0.427 -1.713 c 0.42 -0.823 1.089 -1.493 1.912 -1.912 C 6.039 4.709 6.602 4.6 7.227 4.549 C 7.83 4.5 8.574 4.5 9.483 4.5 h 4.142 c 0.924 0.0 1.585 0.0 2.154 0.155 c 1.492 0.408 2.658 1.574 3.066 3.066 c 0.094 0.344 0.131 0.722 0.146 1.17 H 25.8 c 2.52 0.0 3.78 0.0 4.743 0.491 c 0.847 0.432 1.535 1.12 1.967 1.967 C 33.0 12.31 33.0 13.572 33.0 16.092 v 6.703 c 0.0 2.52 0.0 3.78 -0.49 4.743 c -0.432 0.847 -1.12 1.535 -1.967 1.967 c -0.963 0.49 -2.223 0.49 -4.743 0.49 H 10.2 c -2.52 0.0 -3.78 0.0 -4.743 -0.49 c -0.847 -0.432 -1.535 -1.12 -1.967 -1.967 C 3.0 26.575 3.0 25.315 3.0 22.795 v -6.703 c 0.0 -1.598 0.0 -2.69 0.125 -3.52 Z")
        )
    }.build()
}
