package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SteeringWheelOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SteeringWheelOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.933 8.9 C 13.977 8.606 14.0 8.306 14.0 8.0 c 0.0 -0.176 -0.008 -0.35 -0.022 -0.522 c -1.244 -0.107 -2.131 -0.58 -2.945 -1.015 l -0.019 -0.01 C 10.093 5.96 9.264 5.523 8.0 5.523 c -1.22 0.0 -1.89 0.405 -2.68 0.88 L 5.259 6.44 C 4.457 6.922 3.557 7.438 2.021 7.495 C 2.007 7.66 2.0 7.83 2.0 8.0 c 0.0 0.306 0.023 0.606 0.067 0.9 H 4.5 c 1.436 0.0 2.6 1.164 2.6 2.6 v 2.433 C 7.394 13.977 7.694 14.0 8.0 14.0 c 0.306 0.0 0.606 -0.023 0.9 -0.067 V 11.5 c 0.0 -1.436 1.164 -2.6 2.6 -2.6 h 2.433 Z m -0.24 1.0 H 11.5 c -0.884 0.0 -1.6 0.716 -1.6 1.6 v 2.193 c 1.785 -0.596 3.197 -2.008 3.793 -3.793 Z M 6.1 13.693 C 4.315 13.097 2.903 11.685 2.307 9.9 H 4.5 c 0.884 0.0 1.6 0.716 1.6 1.6 v 2.193 Z M 2.193 6.484 C 2.865 3.904 5.21 2.0 8.0 2.0 c 2.778 0.0 5.116 1.888 5.798 4.452 c -0.893 -0.127 -1.573 -0.486 -2.313 -0.881 l -0.018 -0.01 C 10.544 5.068 9.525 4.524 8.0 4.524 c -1.499 0.0 -2.372 0.526 -3.177 1.01 l -0.08 0.05 c -0.706 0.424 -1.394 0.818 -2.55 0.9 Z M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z m 1.4 -7.0 c 0.0 0.773 -0.627 1.4 -1.4 1.4 c -0.773 0.0 -1.4 -0.627 -1.4 -1.4 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 c 0.773 0.0 1.4 0.627 1.4 1.4 Z")
        )
    }.build()
}
