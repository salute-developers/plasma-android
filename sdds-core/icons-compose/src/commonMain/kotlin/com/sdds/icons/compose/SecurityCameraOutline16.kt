package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SecurityCameraOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SecurityCameraOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.259 2.5 c -0.856 0.0 -1.55 0.694 -1.55 1.55 v 3.762 c 0.0 0.856 0.694 1.55 1.55 1.55 h 4.239 v 1.386 c 0.0 0.303 -0.246 0.55 -0.55 0.55 H 2.002 v -0.711 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 2.415 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -0.704 h 4.946 c 0.856 0.0 1.55 -0.694 1.55 -1.55 V 9.362 h 2.843 c 0.857 0.0 1.55 -0.694 1.55 -1.55 V 4.05 c 0.0 -0.856 -0.694 -1.55 -1.55 -1.55 H 3.26 Z m -0.55 1.55 c 0.0 -0.304 0.246 -0.55 0.55 -0.55 h 8.082 c 0.304 0.0 0.55 0.246 0.55 0.55 v 3.762 c 0.0 0.304 -0.246 0.55 -0.55 0.55 H 3.26 c -0.304 0.0 -0.55 -0.246 -0.55 -0.55 V 4.05 Z m 12.29 0.327 c 0.0 -0.173 -0.09 -0.333 -0.236 -0.424 c -0.146 -0.092 -0.33 -0.101 -0.484 -0.025 L 13.927 4.1 c -0.172 0.084 -0.28 0.259 -0.28 0.45 v 2.76 c 0.0 0.19 0.108 0.364 0.28 0.448 l 0.352 0.173 c 0.155 0.075 0.338 0.066 0.484 -0.025 C 14.91 7.814 15.0 7.654 15.0 7.48 V 4.377 Z M 3.814 5.067 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.46 c 0.275 0.0 0.5 0.224 0.5 0.5 c 0.0 0.277 -0.225 0.5 -0.5 0.5 h -2.46 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 Z")
        )
    }.build()
}
