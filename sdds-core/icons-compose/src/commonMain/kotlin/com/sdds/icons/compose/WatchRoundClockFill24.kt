package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WatchRoundClockFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WatchRoundClockFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.75 8.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 4.0 c 0.0 0.25 0.125 0.485 0.334 0.624 l 2.25 1.5 c 0.345 0.23 0.81 0.137 1.04 -0.208 c 0.23 -0.345 0.137 -0.81 -0.208 -1.04 l -1.916 -1.277 V 8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.089 3.35 C 8.275 2.558 8.979 2.0 9.792 2.0 h 4.416 c 0.812 0.0 1.518 0.559 1.704 1.35 l 0.818 3.478 l -0.01 0.003 c 1.049 0.958 1.805 2.23 2.119 3.669 h 0.911 c 0.138 0.0 0.25 0.112 0.25 0.25 v 2.5 c 0.0 0.138 -0.112 0.25 -0.25 0.25 h -0.911 c -0.314 1.438 -1.07 2.711 -2.12 3.67 l 0.011 0.002 l -0.819 3.479 C 15.726 21.44 15.021 22.0 14.209 22.0 H 9.792 c -0.812 0.0 -1.517 -0.559 -1.703 -1.35 l -0.82 -3.478 l 0.011 -0.003 C 5.88 15.89 5.0 14.047 5.0 12.0 c 0.0 -2.047 0.879 -3.89 2.28 -5.17 L 7.27 6.829 L 8.089 3.35 Z M 6.5 12.0 c 0.0 -3.038 2.462 -5.5 5.5 -5.5 s 5.5 2.462 5.5 5.5 s -2.462 5.5 -5.5 5.5 s -5.5 -2.462 -5.5 -5.5 Z")
        )
    }.build()
}
