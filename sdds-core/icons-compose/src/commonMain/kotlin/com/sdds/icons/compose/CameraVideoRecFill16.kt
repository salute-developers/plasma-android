package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 5.733 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 h 5.8 c 1.105 0.0 2.0 0.895 2.0 2.0 v 4.5 c 0.0 1.104 -0.895 2.0 -2.0 2.0 H 3.0 c -1.105 0.0 -2.0 -0.896 -2.0 -2.0 v -4.5 Z M 6.0 9.75 c 0.966 0.0 1.75 -0.784 1.75 -1.75 c 0.0 -0.967 -0.784 -1.75 -1.75 -1.75 c -0.967 0.0 -1.75 0.783 -1.75 1.75 c 0.0 0.966 0.783 1.75 1.75 1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.86 5.154 C 14.277 4.73 15.0 5.027 15.0 5.623 v 4.758 c 0.0 0.608 -0.747 0.9 -1.158 0.45 L 11.58 8.364 c -0.24 -0.262 -0.233 -0.666 0.017 -0.919 l 2.263 -2.29 Z")
        )
    }.build()
}
