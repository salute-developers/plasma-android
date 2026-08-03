package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RepeatCircleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RepeatCircleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.047 4.296 c 0.388 -0.392 1.021 -0.395 1.414 -0.006 l 3.784 3.75 c 0.189 0.188 0.296 0.443 0.296 0.71 c 0.0 0.267 -0.107 0.522 -0.297 0.71 l -3.783 3.75 c -0.393 0.389 -1.026 0.386 -1.414 -0.006 c -0.39 -0.392 -0.386 -1.026 0.006 -1.414 l 2.058 -2.04 h -6.652 C 8.78 9.75 5.0 13.508 5.0 18.125 S 8.779 26.5 13.46 26.5 h 9.08 c 4.681 0.0 8.46 -3.758 8.46 -8.375 c 0.0 -1.885 -0.628 -3.622 -1.689 -5.022 c -0.333 -0.44 -0.247 -1.067 0.193 -1.4 c 0.44 -0.335 1.067 -0.248 1.401 0.192 C 32.22 13.629 33.0 15.788 33.0 18.125 C 33.0 23.863 28.309 28.5 22.54 28.5 h -9.08 C 7.69 28.5 3.0 23.863 3.0 18.125 S 7.691 7.75 13.46 7.75 h 6.65 l -2.057 -2.04 c -0.392 -0.388 -0.395 -1.022 -0.006 -1.414 Z")
        )
    }.build()
}
