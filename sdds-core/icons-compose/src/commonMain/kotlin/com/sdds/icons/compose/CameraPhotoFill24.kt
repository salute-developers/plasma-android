package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraPhotoFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraPhotoFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 9.0 c -1.795 0.0 -3.25 1.455 -3.25 3.25 S 10.205 15.5 12.0 15.5 s 3.25 -1.455 3.25 -3.25 S 13.795 9.0 12.0 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.17 3.25 h 1.66 c 0.535 0.0 0.98 0.0 1.345 0.03 c 0.38 0.03 0.736 0.098 1.073 0.27 c 0.518 0.263 0.939 0.684 1.202 1.202 c 0.133 0.26 0.27 0.463 0.41 0.594 c 0.128 0.121 0.226 0.154 0.318 0.154 h 0.103 c 0.674 0.0 1.225 0.0 1.672 0.037 c 0.463 0.037 0.882 0.118 1.273 0.317 c 0.611 0.312 1.108 0.809 1.42 1.42 c 0.199 0.391 0.28 0.81 0.317 1.273 C 22.0 8.994 22.0 9.545 22.0 10.219 v 5.062 c 0.0 0.674 0.0 1.225 -0.037 1.672 c -0.037 0.463 -0.118 0.882 -0.317 1.273 c -0.312 0.611 -0.809 1.108 -1.42 1.42 c -0.391 0.199 -0.81 0.28 -1.273 0.317 C 18.506 20.0 17.955 20.0 17.281 20.0 H 6.72 c -0.674 0.0 -1.225 0.0 -1.672 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 C 2.0 16.506 2.0 15.955 2.0 15.281 V 10.22 c 0.0 -0.674 0.0 -1.225 0.037 -1.672 c 0.037 -0.463 0.118 -0.882 0.317 -1.272 c 0.312 -0.612 0.809 -1.11 1.42 -1.42 c 0.391 -0.2 0.81 -0.28 1.273 -0.318 C 5.495 5.5 6.045 5.5 6.719 5.5 h 0.103 c 0.092 0.0 0.19 -0.033 0.319 -0.154 c 0.139 -0.13 0.276 -0.334 0.409 -0.594 c 0.263 -0.518 0.684 -0.939 1.202 -1.202 c 0.337 -0.172 0.693 -0.24 1.073 -0.27 c 0.365 -0.03 0.81 -0.03 1.345 -0.03 Z m -3.92 9.0 C 7.25 9.627 9.377 7.5 12.0 7.5 s 4.75 2.127 4.75 4.75 S 14.623 17.0 12.0 17.0 s -4.75 -2.127 -4.75 -4.75 Z M 19.0 9.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z")
        )
    }.build()
}
