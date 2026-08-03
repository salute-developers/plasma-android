package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardLockFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardLockFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.004 5.6 c 0.011 -0.823 0.06 -1.32 0.262 -1.723 c 0.242 -0.48 0.631 -0.87 1.111 -1.11 C 2.907 2.5 3.6 2.5 4.983 2.5 h 6.034 c 1.384 0.0 2.076 0.0 2.606 0.266 c 0.48 0.242 0.87 0.631 1.11 1.111 c 0.203 0.403 0.252 0.9 0.263 1.723 H 1.004 Z M 1.0 7.1 h 14.0 v 1.546 C 14.204 7.933 13.152 7.5 12.0 7.5 c -2.485 0.0 -4.5 2.015 -4.5 4.5 c 0.0 0.526 0.09 1.03 0.256 1.5 H 5.0 c -1.4 0.0 -2.1 0.0 -2.635 -0.273 c -0.47 -0.24 -0.853 -0.622 -1.093 -1.092 C 1.0 11.6 1.0 10.9 1.0 9.5 V 7.1 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 9.955 c -0.377 0.0 -0.682 0.305 -0.682 0.682 v 0.681 h 1.364 v -0.681 c 0.0 -0.377 -0.305 -0.682 -0.682 -0.682 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 15.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m 1.364 -5.114 v 0.682 c 0.376 0.0 0.681 0.305 0.681 0.681 v 1.705 c 0.0 0.377 -0.305 0.682 -0.681 0.682 h -2.728 c -0.376 0.0 -0.682 -0.305 -0.682 -0.682 V 12.0 c 0.0 -0.376 0.306 -0.681 0.682 -0.681 v -0.682 c 0.0 -0.753 0.611 -1.364 1.364 -1.364 c 0.753 0.0 1.364 0.61 1.364 1.364 Z")
        )
    }.build()
}
