package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlagOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlagOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 4.156 v 9.092 c 1.505 -0.707 2.833 -0.924 4.057 -0.832 c 1.496 0.114 2.765 0.688 3.888 1.219 l 0.188 0.089 c 1.079 0.51 2.01 0.95 3.03 1.088 c 0.945 0.127 2.011 -0.006 3.337 -0.742 V 5.03 c -1.297 0.605 -2.484 0.742 -3.61 0.588 c -1.32 -0.18 -2.513 -0.762 -3.588 -1.287 L 12.11 4.237 c -1.166 -0.567 -2.22 -1.05 -3.382 -1.146 C 7.68 3.005 6.477 3.23 5.0 4.156 Z m 16.0 -0.405 c 0.0 -0.276 -0.15 -0.53 -0.393 -0.66 c -0.242 -0.131 -0.537 -0.12 -0.767 0.031 c -1.488 0.973 -2.683 1.155 -3.746 1.01 c -1.076 -0.147 -2.068 -0.63 -3.203 -1.182 l -0.125 -0.062 C 11.619 2.331 10.329 1.72 8.85 1.597 C 7.335 1.47 5.699 1.86 3.829 3.13 C 3.623 3.27 3.5 3.502 3.5 3.75 v 17.5 C 3.5 21.664 3.836 22.0 4.25 22.0 S 5.0 21.664 5.0 21.25 v -6.317 c 1.592 -0.883 2.86 -1.103 3.943 -1.02 c 1.191 0.09 2.235 0.546 3.362 1.078 l 0.236 0.112 c 1.028 0.488 2.16 1.025 3.421 1.195 c 1.409 0.19 2.925 -0.078 4.681 -1.159 C 20.865 15.003 21.0 14.761 21.0 14.5 V 3.751 Z")
        )
    }.build()
}
