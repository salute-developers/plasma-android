package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicPodcastOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicPodcastOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.0 C 6.066 1.0 4.5 2.567 4.5 4.5 v 4.328 c 0.0 1.765 1.306 3.225 3.005 3.465 C 7.502 12.316 7.5 12.34 7.5 12.362 v 1.637 H 6.588 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 9.41 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 9.687 14.0 9.41 14.0 H 8.5 v -1.637 c 0.0 -0.024 -0.002 -0.046 -0.005 -0.069 c 1.698 -0.24 3.004 -1.7 3.004 -3.465 V 4.5 C 11.499 2.567 9.932 1.0 7.999 1.0 Z M 5.516 4.205 C 5.663 2.963 6.72 2.0 8.0 2.0 c 1.281 0.0 2.337 0.963 2.483 2.205 H 9.234 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 10.5 v 1.137 H 9.234 c -0.276 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.276 0.224 0.5 0.5 0.5 H 10.5 v 1.137 H 9.234 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 1.18 c -0.287 1.065 -1.26 1.849 -2.415 1.849 s -2.127 -0.784 -2.414 -1.85 h 1.179 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.275 -0.224 -0.5 -0.5 -0.5 H 5.5 V 7.343 h 1.264 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 H 5.5 V 5.205 h 1.264 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 5.517 Z")
        )
    }.build()
}
