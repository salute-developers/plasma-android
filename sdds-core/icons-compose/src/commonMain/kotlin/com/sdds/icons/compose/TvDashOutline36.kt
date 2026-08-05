package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvDashOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvDashOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.749 4.082 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 30.952 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 4.384 -4.384 H 4.58 c -0.087 0.0 -0.204 0.001 -0.309 -0.008 c -0.124 -0.01 -0.317 -0.037 -0.521 -0.141 c -0.259 -0.132 -0.47 -0.343 -0.602 -0.602 c -0.104 -0.204 -0.13 -0.397 -0.14 -0.521 C 3.0 23.777 3.0 23.66 3.0 23.573 V 7.583 c 0.0 -0.087 0.0 -0.204 0.009 -0.309 c 0.01 -0.124 0.036 -0.317 0.14 -0.521 c 0.132 -0.259 0.343 -0.47 0.602 -0.602 c 0.204 -0.104 0.397 -0.13 0.521 -0.14 C 4.377 6.002 4.494 6.0 4.582 6.0 h 23.247 l 1.92 -1.919 Z M 5.0 8.002 v 15.152 h 5.677 L 25.829 8.002 H 5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.108 27.002 v 2.002 l -19.69 -0.002 l 2.0 -2.001 h 17.69 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 32.737 6.568 c 0.042 0.058 0.08 0.12 0.114 0.185 c 0.104 0.204 0.13 0.397 0.14 0.521 C 33.0 7.38 33.001 7.496 33.0 7.583 v 15.99 c 0.0 0.087 0.0 0.204 -0.009 0.309 c -0.01 0.124 -0.036 0.317 -0.14 0.521 c -0.132 0.259 -0.343 0.47 -0.602 0.602 c -0.204 0.104 -0.397 0.131 -0.522 0.141 c -0.104 0.009 -0.221 0.008 -0.308 0.008 H 14.266 l 2.0 -2.0 H 31.0 V 8.42 l 1.516 -1.516 c 0.099 -0.099 0.172 -0.213 0.221 -0.336 Z")
        )
    }.build()
}
