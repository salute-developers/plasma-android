package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoAddOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoAddOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.931 4.719 h 5.793 c 0.514 0.0 0.931 0.417 0.931 0.93 v 4.639 c 0.0 0.418 -0.276 0.772 -0.655 0.89 c -0.002 0.357 -0.05 0.704 -0.14 1.036 c 1.003 -0.07 1.795 -0.906 1.795 -1.926 V 5.65 c 0.0 -1.067 -0.864 -1.931 -1.93 -1.931 H 2.93 C 1.865 3.719 1.0 4.583 1.0 5.649 v 2.805 c 0.285 -0.336 0.622 -0.63 1.0 -0.871 V 5.65 c 0.0 -0.514 0.417 -0.931 0.931 -0.931 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.0 5.623 c 0.0 -0.596 -0.722 -0.892 -1.14 -0.469 l -2.264 2.29 c -0.25 0.253 -0.257 0.658 -0.017 0.92 l 2.263 2.468 C 14.252 11.28 15.0 10.99 15.0 10.382 V 5.623 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.25 11.5 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 Z M 4.5 9.105 c 0.193 0.0 0.35 0.157 0.35 0.35 v 1.695 h 1.696 c 0.193 0.0 0.35 0.157 0.35 0.35 c 0.0 0.194 -0.157 0.35 -0.35 0.35 H 4.85 v 1.696 c 0.0 0.193 -0.157 0.35 -0.35 0.35 c -0.193 0.0 -0.35 -0.157 -0.35 -0.35 v -1.695 H 2.455 c -0.194 0.0 -0.35 -0.157 -0.35 -0.35 c 0.0 -0.194 0.156 -0.35 0.35 -0.35 H 4.15 V 9.454 c 0.0 -0.193 0.157 -0.35 0.35 -0.35 Z")
        )
    }.build()
}
