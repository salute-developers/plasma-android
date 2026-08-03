package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerExpressSpeedOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerExpressSpeedOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.213 2.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.805 c 0.276 0.0 0.5 0.224 0.5 0.5 S 11.793 3.0 11.518 3.0 h -0.9 v 0.919 c 2.454 0.246 4.38 2.285 4.38 4.78 c 0.0 2.662 -2.193 4.805 -4.881 4.805 S 5.234 11.36 5.234 8.699 c 0.0 -2.496 1.928 -4.535 4.383 -4.78 V 3.0 H 8.713 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 2.727 3.472 c 0.08 0.049 0.117 0.15 0.087 0.243 l -0.57 1.795 h 1.566 c 0.079 0.0 0.15 0.048 0.18 0.123 c 0.032 0.075 0.019 0.162 -0.034 0.222 L 9.54 11.386 c -0.063 0.072 -0.165 0.089 -0.246 0.04 c -0.08 -0.05 -0.116 -0.152 -0.087 -0.244 l 0.57 -1.795 H 8.212 c -0.078 0.0 -0.149 -0.048 -0.18 -0.123 C 7.999 9.19 8.012 9.102 8.065 9.042 l 2.63 -3.031 c 0.062 -0.072 0.165 -0.089 0.245 -0.04 Z M 6.234 8.699 c 0.0 -2.093 1.73 -3.805 3.883 -3.805 c 2.152 0.0 3.882 1.712 3.882 3.805 s -1.73 3.805 -3.882 3.805 c -2.153 0.0 -3.883 -1.712 -3.883 -3.805 Z M 2.402 4.755 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 2.454 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 2.402 Z M 1.0 7.509 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 h 2.454 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 1.0 Z m 0.2 3.255 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 h 2.453 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 1.7 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
