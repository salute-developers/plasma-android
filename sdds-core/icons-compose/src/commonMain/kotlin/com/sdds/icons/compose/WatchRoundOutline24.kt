package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WatchRoundOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WatchRoundOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.792 2.0 C 8.98 2.0 8.275 2.559 8.089 3.35 l -0.82 3.478 l 0.011 0.003 C 5.88 8.11 5.0 9.953 5.0 12.0 c 0.0 2.047 0.879 3.89 2.28 5.17 l -0.01 0.002 l 0.819 3.479 C 8.275 21.44 8.979 22.0 9.792 22.0 h 4.416 c 0.812 0.0 1.518 -0.559 1.704 -1.35 l 0.818 -3.478 l -0.01 -0.003 c 1.049 -0.958 1.805 -2.23 2.119 -3.669 h 0.911 c 0.138 0.0 0.25 -0.112 0.25 -0.25 v -2.5 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -0.911 c -0.314 -1.438 -1.07 -2.711 -2.12 -3.67 l 0.011 -0.002 l -0.819 -3.479 C 15.726 2.56 15.021 2.0 14.209 2.0 H 9.792 Z M 12.0 5.0 c -1.037 0.0 -2.022 0.226 -2.907 0.63 l 0.456 -1.937 C 9.575 3.58 9.676 3.5 9.792 3.5 h 4.416 c 0.116 0.0 0.217 0.08 0.243 0.193 l 0.456 1.937 C 14.022 5.226 13.037 5.0 12.0 5.0 Z M 9.549 20.307 L 9.093 18.37 C 9.978 18.774 10.963 19.0 12.0 19.0 s 2.022 -0.226 2.907 -0.63 l -0.456 1.937 c -0.026 0.113 -0.127 0.193 -0.243 0.193 H 9.792 c -0.116 0.0 -0.217 -0.08 -0.243 -0.193 Z M 12.0 6.5 c -3.038 0.0 -5.5 2.462 -5.5 5.5 s 2.462 5.5 5.5 5.5 s 5.5 -2.462 5.5 -5.5 s -2.462 -5.5 -5.5 -5.5 Z")
        )
    }.build()
}
