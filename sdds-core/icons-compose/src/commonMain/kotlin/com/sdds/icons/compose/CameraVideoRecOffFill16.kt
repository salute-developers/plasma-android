package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecOffFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecOffFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.525 1.646 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.707 l -11.88 11.88 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.708 l 1.295 -1.296 C 1.864 12.2 1.001 11.32 1.0 10.233 v -4.5 c 0.0 -1.104 0.895 -2.0 2.0 -2.0 h 5.8 c 0.716 0.0 1.342 0.377 1.695 0.943 l 3.03 -3.03 Z M 6.0 6.251 C 5.034 6.25 4.25 7.034 4.25 8.0 c 0.0 0.79 0.525 1.458 1.245 1.675 l 2.18 -2.18 C 7.458 6.776 6.79 6.251 6.0 6.251 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.8 10.233 c 0.0 1.105 -0.896 2.0 -2.0 2.0 H 5.76 l 5.04 -5.039 v 3.04 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.86 5.154 C 14.277 4.731 15.0 5.027 15.0 5.623 v 4.759 c 0.0 0.607 -0.747 0.898 -1.158 0.45 l -2.263 -2.468 c -0.24 -0.262 -0.233 -0.667 0.017 -0.92 l 2.263 -2.29 Z")
        )
    }.build()
}
