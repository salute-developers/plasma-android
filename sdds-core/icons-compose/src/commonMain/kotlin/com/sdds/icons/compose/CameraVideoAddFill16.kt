package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoAddFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoAddFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 3.733 c -1.105 0.0 -2.0 0.895 -2.0 2.0 V 8.67 C 1.825 7.651 3.086 7.0 4.5 7.0 C 6.985 7.0 9.0 9.015 9.0 11.5 c 0.0 0.248 -0.02 0.491 -0.059 0.728 c 1.04 -0.072 1.86 -0.938 1.86 -1.995 v -4.5 c 0.0 -1.105 -0.896 -2.0 -2.0 -2.0 H 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.0 5.623 c 0.0 -0.596 -0.722 -0.893 -1.14 -0.469 l -2.264 2.29 c -0.25 0.253 -0.257 0.657 -0.017 0.92 l 2.263 2.468 C 14.253 11.28 15.0 10.989 15.0 10.382 v -4.76 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.25 11.5 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 Z M 4.5 9.105 c 0.193 0.0 0.35 0.157 0.35 0.35 v 1.695 h 1.696 c 0.193 0.0 0.35 0.157 0.35 0.35 c 0.0 0.194 -0.157 0.35 -0.35 0.35 H 4.85 v 1.696 c 0.0 0.193 -0.157 0.35 -0.35 0.35 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 v -1.695 H 2.455 c -0.194 0.0 -0.35 -0.157 -0.35 -0.35 c 0.0 -0.194 0.156 -0.35 0.35 -0.35 H 4.15 V 9.454 c 0.0 -0.193 0.157 -0.35 0.35 -0.35 Z")
        )
    }.build()
}
