package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ClipPlus16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ClipPlus16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.163 3.048 c -1.66 -1.66 -4.351 -1.66 -6.01 0.0 L 1.728 8.471 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.196 0.195 0.512 0.195 0.708 0.0 l 5.422 -5.423 c 1.27 -1.27 3.327 -1.27 4.597 0.0 C 13.5 4.8 13.686 6.38 13.009 7.614 c 0.334 0.076 0.653 0.19 0.953 0.335 c 0.793 -1.59 0.527 -3.575 -0.8 -4.901 Z m -5.118 11.1 c -0.169 -0.31 -0.302 -0.643 -0.395 -0.991 l -0.076 0.076 c -0.501 0.501 -1.29 0.571 -1.872 0.166 c -0.748 -0.521 -0.843 -1.592 -0.199 -2.237 l 4.925 -4.924 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 c -0.196 -0.195 -0.512 -0.195 -0.707 0.0 l -4.925 4.925 c -1.085 1.085 -0.925 2.887 0.334 3.764 c 0.893 0.622 2.074 0.58 2.915 -0.071 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 15.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.07 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.68 3.75 3.75 3.75 Z m 0.35 -5.795 c 0.0 -0.193 -0.156 -0.35 -0.35 -0.35 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 1.695 H 9.955 c -0.194 0.0 -0.35 0.157 -0.35 0.35 c 0.0 0.194 0.156 0.35 0.35 0.35 h 1.695 v 1.696 c 0.0 0.193 0.157 0.35 0.35 0.35 c 0.194 0.0 0.35 -0.157 0.35 -0.35 V 12.35 h 1.696 c 0.193 0.0 0.35 -0.157 0.35 -0.35 c 0.0 -0.194 -0.157 -0.35 -0.35 -0.35 H 12.35 V 9.954 Z")
        )
    }.build()
}
