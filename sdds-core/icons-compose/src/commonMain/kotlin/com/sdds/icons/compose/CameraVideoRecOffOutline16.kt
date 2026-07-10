package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecOffOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecOffOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.525 1.646 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.707 l -11.88 11.88 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.708 l 1.307 -1.306 H 2.931 c -1.0 0.0 -1.822 -0.76 -1.921 -1.734 L 1.0 10.288 V 5.649 c 0.0 -1.066 0.864 -1.93 1.93 -1.93 h 5.795 l 0.197 0.01 c 0.654 0.066 1.21 0.46 1.506 1.014 l 3.097 -3.097 Z M 2.931 4.72 C 2.417 4.719 2.0 5.135 2.0 5.649 v 4.639 c 0.0 0.514 0.417 0.93 0.93 0.93 h 1.022 l 1.836 -1.835 C 5.06 9.28 4.5 8.657 4.5 7.9 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 c 0.756 0.0 1.38 0.56 1.482 1.288 l 2.164 -2.164 C 9.584 5.07 9.196 4.72 8.725 4.72 H 2.93 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.655 10.288 l -0.01 0.197 c -0.092 0.909 -0.814 1.632 -1.723 1.724 l -0.197 0.01 h -2.95 l 1.0 -1.0 h 1.95 c 0.513 0.0 0.93 -0.417 0.93 -0.931 v -1.95 l 1.0 -1.0 v 2.95 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.86 5.154 C 14.277 4.731 15.0 5.027 15.0 5.623 v 4.759 c 0.0 0.608 -0.747 0.898 -1.158 0.45 l -2.263 -2.469 c -0.24 -0.262 -0.233 -0.666 0.017 -0.919 l 2.263 -2.29 Z")
        )
    }.build()
}
