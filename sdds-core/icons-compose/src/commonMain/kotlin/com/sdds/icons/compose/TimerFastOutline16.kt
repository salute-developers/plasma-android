package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerFastOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerFastOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.213 2.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.805 c 0.276 0.0 0.5 0.224 0.5 0.5 S 11.793 3.0 11.518 3.0 h -0.9 v 0.918 c 2.454 0.246 4.38 2.284 4.38 4.778 c 0.0 2.662 -2.193 4.804 -4.881 4.804 s -4.883 -2.142 -4.883 -4.804 c 0.0 -2.494 1.928 -4.533 4.383 -4.779 V 3.0 H 8.713 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 1.904 2.393 c -2.153 0.0 -3.883 1.711 -3.883 3.803 c 0.0 2.093 1.73 3.804 3.883 3.804 c 2.152 0.0 3.882 -1.711 3.882 -3.804 c 0.0 -2.092 -1.73 -3.803 -3.882 -3.803 Z m 2.11 1.732 c 0.193 0.197 0.19 0.514 -0.007 0.707 l -1.753 1.722 C 10.27 9.247 9.954 9.244 9.76 9.048 C 9.567 8.85 9.57 8.534 9.767 8.34 L 11.52 6.62 c 0.197 -0.194 0.513 -0.19 0.707 0.006 Z m -9.825 -1.87 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 2.454 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 2.402 Z M 1.0 7.509 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 2.454 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 1.0 Z m 0.2 3.255 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 h 2.453 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 1.7 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
