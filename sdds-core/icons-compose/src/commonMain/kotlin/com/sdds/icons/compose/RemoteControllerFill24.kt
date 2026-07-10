package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RemoteControllerFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RemoteControllerFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.938 9.75 c 0.0 -1.14 0.923 -2.063 2.062 -2.063 c 1.14 0.0 2.063 0.924 2.063 2.063 c 0.0 1.14 -0.924 2.063 -2.063 2.063 c -1.14 0.0 -2.063 -0.924 -2.063 -2.063 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.469 1.0 h 3.062 c 0.674 0.0 1.224 0.0 1.672 0.037 c 0.463 0.037 0.882 0.118 1.273 0.317 c 0.611 0.312 1.108 0.809 1.42 1.42 c 0.199 0.391 0.28 0.81 0.317 1.273 c 0.037 0.447 0.037 0.998 0.037 1.672 V 18.28 c 0.0 0.674 0.0 1.225 -0.037 1.672 c -0.037 0.463 -0.118 0.882 -0.317 1.273 c -0.312 0.611 -0.809 1.108 -1.42 1.42 c -0.391 0.199 -0.81 0.28 -1.273 0.317 C 14.756 23.0 14.205 23.0 13.531 23.0 H 10.47 c -0.674 0.0 -1.225 0.0 -1.672 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 c -0.037 -0.447 -0.037 -0.998 -0.037 -1.672 V 5.72 c 0.0 -0.674 0.0 -1.225 0.037 -1.672 c 0.037 -0.463 0.118 -0.882 0.317 -1.272 c 0.312 -0.612 0.809 -1.11 1.42 -1.42 c 0.391 -0.2 0.81 -0.28 1.273 -0.318 C 9.244 1.0 9.795 1.0 10.469 1.0 Z M 9.5 5.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z m 0.0 10.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z m 6.0 -11.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z m -1.0 11.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z M 12.0 6.312 c -1.899 0.0 -3.438 1.54 -3.438 3.438 c 0.0 1.899 1.54 3.438 3.438 3.438 c 1.899 0.0 3.438 -1.54 3.438 -3.438 c 0.0 -1.898 -1.54 -3.438 -3.438 -3.438 Z")
        )
    }.build()
}
