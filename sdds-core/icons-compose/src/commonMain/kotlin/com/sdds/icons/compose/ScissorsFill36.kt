package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScissorsFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScissorsFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.85 5.25 c 2.9 0.0 5.25 2.35 5.25 5.25 c 0.0 0.696 -0.137 1.36 -0.383 1.967 l 3.174 3.174 l 7.11 -7.108 c 0.008 -0.01 0.682 -0.868 3.0 -1.5 c 2.323 -0.633 3.491 -0.004 3.5 0.0 L 14.794 23.737 c 0.197 0.551 0.305 1.145 0.305 1.763 c 0.0 2.9 -2.35 5.25 -5.25 5.25 S 4.6 28.4 4.6 25.5 s 2.35 -5.25 5.25 -5.25 c 0.984 0.0 1.905 0.27 2.691 0.741 l 2.85 -2.85 l -3.03 -3.03 c -0.746 0.406 -1.601 0.639 -2.51 0.639 c -2.9 0.0 -5.25 -2.35 -5.25 -5.25 s 2.35 -5.25 5.25 -5.25 Z m 0.0 17.0 c -1.795 0.0 -3.25 1.455 -3.25 3.25 s 1.455 3.25 3.25 3.25 s 3.25 -1.455 3.25 -3.25 s -1.455 -3.25 -3.25 -3.25 Z m 7.9 -5.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.38 0.212 0.71 0.524 0.879 c 0.028 0.015 0.057 0.03 0.087 0.043 l 0.093 0.033 c 0.062 0.02 0.127 0.033 0.194 0.04 c 0.034 0.003 0.068 0.005 0.102 0.005 c 0.138 0.0 0.27 -0.028 0.39 -0.078 c 0.06 -0.025 0.116 -0.057 0.17 -0.093 c 0.132 -0.09 0.242 -0.21 0.32 -0.352 c 0.03 -0.057 0.056 -0.117 0.076 -0.18 c 0.029 -0.093 0.044 -0.193 0.044 -0.297 c 0.0 -0.104 -0.015 -0.204 -0.044 -0.298 c -0.127 -0.407 -0.507 -0.702 -0.956 -0.702 Z m -7.9 -10.0 c -1.795 0.0 -3.25 1.455 -3.25 3.25 s 1.455 3.25 3.25 3.25 s 3.25 -1.455 3.25 -3.25 s -1.455 -3.25 -3.25 -3.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.5 29.25 s -1.168 0.636 -3.5 0.0 c -2.312 -0.63 -2.988 -1.486 -3.0 -1.5 L 19.25 22.0 l 2.5 -2.5 l 9.75 9.75 Z")
        )
    }.build()
}
