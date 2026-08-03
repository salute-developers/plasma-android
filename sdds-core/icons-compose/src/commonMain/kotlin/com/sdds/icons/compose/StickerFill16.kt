package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StickerFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StickerFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.347 1.236 c -0.442 0.86 -0.613 1.837 -0.486 2.8 c 0.137 1.04 0.613 2.006 1.355 2.748 c 0.742 0.742 1.708 1.218 2.749 1.355 c 0.962 0.127 1.939 -0.044 2.8 -0.486 l -0.041 -0.08 C 14.565 7.28 14.366 7.08 14.1 6.815 L 9.185 1.9 C 8.919 1.634 8.72 1.435 8.427 1.276 l -0.08 -0.04 Z M 15.0 8.65 c 0.001 0.2 -0.028 0.363 -0.064 0.564 l -0.003 0.014 C 14.343 12.51 11.473 15.0 8.023 15.0 C 4.143 15.0 1.0 11.856 1.0 7.978 c 0.0 -3.452 2.49 -6.32 5.771 -6.911 l 0.014 -0.003 C 6.985 1.028 7.148 1.0 7.349 1.0 C 6.895 1.986 6.727 3.083 6.87 4.166 C 7.036 5.424 7.613 6.593 8.51 7.49 c 0.898 0.897 2.067 1.474 3.325 1.64 c 1.083 0.142 2.18 -0.026 3.166 -0.48 Z")
        )
    }.build()
}
