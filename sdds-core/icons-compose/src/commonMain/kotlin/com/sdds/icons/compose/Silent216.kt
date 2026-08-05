package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Silent216: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Silent216",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 8.0 c 0.0 -3.866 3.138 -7.0 7.01 -7.0 c 1.358 0.0 2.627 0.386 3.7 1.054 L 11.165 2.6 c -0.935 0.933 -0.35 2.45 0.7 2.45 h 2.505 C 14.787 5.946 15.02 6.946 15.02 8.0 c 0.0 3.866 -3.138 7.0 -7.01 7.0 S 1.0 11.865 1.0 8.0 Z m 6.31 -2.8 c 0.0 -0.387 0.314 -0.7 0.702 -0.7 c 0.387 0.0 0.7 0.313 0.7 0.7 v 3.096 l 1.471 0.848 c 0.336 0.193 0.45 0.62 0.257 0.956 c -0.194 0.335 -0.622 0.45 -0.958 0.256 L 7.674 9.313 C 7.645 9.298 7.618 9.28 7.592 9.261 c -0.158 -0.119 -0.265 -0.303 -0.28 -0.512 C 7.311 8.73 7.31 8.71 7.311 8.69 V 5.2 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.6 0.75 c 0.0 -0.331 0.269 -0.6 0.6 -0.6 h 3.03 c 0.65 0.0 0.949 0.809 0.455 1.231 L 13.622 3.15 H 15.3 c 0.331 0.0 0.6 0.269 0.6 0.6 c 0.0 0.331 -0.269 0.6 -0.6 0.6 h -3.03 c -0.65 0.0 -0.949 -0.809 -0.455 -1.231 l 2.063 -1.769 H 12.2 c -0.331 0.0 -0.6 -0.269 -0.6 -0.6 Z")
        )
    }.build()
}
