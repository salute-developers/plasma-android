package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.0 9.398 c 0.828 0.0 1.5 -0.672 1.5 -1.5 s -0.672 -1.5 -1.5 -1.5 s -1.5 0.672 -1.5 1.5 s 0.672 1.5 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.931 3.719 C 1.865 3.719 1.0 4.583 1.0 5.649 v 4.639 c 0.0 1.066 0.865 1.93 1.931 1.93 h 5.793 c 1.067 0.0 1.931 -0.864 1.931 -1.93 V 5.65 c 0.0 -1.067 -0.864 -1.931 -1.93 -1.931 H 2.93 Z m 5.793 1.0 H 2.931 C 2.417 4.719 2.0 5.136 2.0 5.649 v 4.639 c 0.0 0.514 0.417 0.93 0.931 0.93 h 5.793 c 0.514 0.0 0.931 -0.416 0.931 -0.93 V 5.65 c 0.0 -0.514 -0.417 -0.931 -0.93 -0.931 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.86 5.154 C 14.277 4.731 15.0 5.027 15.0 5.623 v 4.759 c 0.0 0.608 -0.747 0.898 -1.158 0.45 l -2.263 -2.468 c -0.24 -0.262 -0.233 -0.667 0.017 -0.92 l 2.263 -2.29 Z")
        )
    }.build()
}
