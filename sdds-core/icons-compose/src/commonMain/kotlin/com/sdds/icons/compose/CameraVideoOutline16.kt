package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 5.65 c 0.0 -1.067 0.865 -1.931 1.931 -1.931 h 5.793 c 1.067 0.0 1.931 0.864 1.931 1.93 v 4.639 c 0.0 1.066 -0.864 1.93 -1.93 1.93 H 2.93 C 1.865 12.219 1.0 11.355 1.0 10.289 V 5.65 Z m 1.931 -0.931 h 5.793 c 0.514 0.0 0.931 0.417 0.931 0.93 v 4.639 c 0.0 0.514 -0.417 0.93 -0.93 0.93 H 2.93 C 2.417 11.219 2.0 10.803 2.0 10.289 V 5.65 c 0.0 -0.514 0.417 -0.931 0.931 -0.931 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.0 5.623 c 0.0 -0.596 -0.722 -0.892 -1.14 -0.469 l -2.264 2.29 c -0.25 0.253 -0.257 0.658 -0.017 0.92 l 2.263 2.468 C 14.252 11.28 15.0 10.99 15.0 10.382 V 5.623 Z")
        )
    }.build()
}
