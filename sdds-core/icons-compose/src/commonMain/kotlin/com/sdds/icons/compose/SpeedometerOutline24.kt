package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpeedometerOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpeedometerOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.8 6.688 c 1.169 -0.485 2.466 -0.57 3.688 -0.242 c 0.4 0.107 0.812 -0.13 0.919 -0.53 c 0.107 -0.4 -0.13 -0.812 -0.53 -0.919 c -1.542 -0.413 -3.177 -0.306 -4.651 0.305 c -1.475 0.61 -2.707 1.69 -3.505 3.073 c -0.798 1.382 -1.117 2.989 -0.909 4.571 c 0.208 1.583 0.933 3.052 2.061 4.18 c 0.293 0.293 0.768 0.293 1.061 0.0 c 0.293 -0.292 0.293 -0.767 0.0 -1.06 c -0.895 -0.895 -1.47 -2.06 -1.635 -3.315 c -0.165 -1.255 0.088 -2.53 0.721 -3.626 S 8.63 7.172 9.8 6.688 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.084 9.593 c 0.4 -0.107 0.812 0.13 0.919 0.53 c 0.33 1.23 0.33 2.524 0.0 3.753 c -0.33 1.23 -0.977 2.35 -1.877 3.25 c -0.292 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 c 0.714 -0.714 1.227 -1.603 1.488 -2.578 c 0.261 -0.975 0.261 -2.001 0.0 -2.976 c -0.107 -0.4 0.13 -0.812 0.53 -0.919 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.998 6.917 c -0.22 -0.185 -0.543 -0.182 -0.76 0.007 l -5.37 4.672 c -0.792 0.69 -0.781 1.923 0.023 2.598 c 0.805 0.675 2.022 0.472 2.563 -0.428 l 3.67 -6.1 c 0.148 -0.246 0.095 -0.564 -0.126 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 6.477 2.0 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z M 3.5 12.0 c 0.0 -4.694 3.806 -8.5 8.5 -8.5 s 8.5 3.806 8.5 8.5 s -3.806 8.5 -8.5 8.5 s -8.5 -3.806 -8.5 -8.5 Z")
        )
    }.build()
}
