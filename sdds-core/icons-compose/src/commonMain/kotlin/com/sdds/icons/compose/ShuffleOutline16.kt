package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShuffleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShuffleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.092 2.643 c -0.197 -0.193 -0.513 -0.19 -0.707 0.007 c -0.193 0.197 -0.19 0.513 0.007 0.707 l 0.883 0.867 h -1.762 c -1.15 0.0 -2.043 0.512 -2.786 1.215 c -0.517 0.488 -0.98 1.09 -1.42 1.699 C 6.164 5.553 4.754 3.88 2.38 3.88 H 1.502 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 2.38 c 1.946 0.0 3.1 1.414 4.315 3.12 c -1.215 1.708 -2.37 3.121 -4.315 3.121 H 1.502 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 H 2.38 c 2.374 0.0 3.784 -1.673 4.927 -3.258 c 0.44 0.61 0.903 1.21 1.42 1.7 c 0.743 0.702 1.636 1.214 2.786 1.214 h 1.762 l -0.883 0.868 c -0.197 0.193 -0.2 0.51 -0.007 0.707 c 0.194 0.197 0.51 0.2 0.707 0.006 l 1.757 -1.724 c 0.095 -0.094 0.15 -0.223 0.15 -0.357 c 0.0 -0.134 -0.055 -0.263 -0.15 -0.357 l -1.757 -1.724 c -0.197 -0.194 -0.513 -0.19 -0.707 0.006 c -0.193 0.197 -0.19 0.514 0.007 0.708 l 0.883 0.867 h -1.762 c -0.815 0.0 -1.475 -0.35 -2.099 -0.94 C 8.888 9.338 8.417 8.7 7.92 8.0 c 0.497 -0.7 0.968 -1.339 1.494 -1.836 c 0.624 -0.59 1.284 -0.94 2.099 -0.94 h 1.762 l -0.883 0.867 c -0.197 0.193 -0.2 0.51 -0.007 0.707 c 0.194 0.197 0.51 0.2 0.707 0.006 l 1.757 -1.724 c 0.095 -0.094 0.15 -0.223 0.15 -0.357 c 0.0 -0.134 -0.055 -0.262 -0.15 -0.357 l -1.757 -1.724 Z")
        )
    }.build()
}
