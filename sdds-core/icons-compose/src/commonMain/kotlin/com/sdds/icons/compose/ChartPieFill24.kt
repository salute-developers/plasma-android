package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChartPieFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChartPieFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.695 2.086 C 9.393 2.257 8.137 2.683 7.0 3.34 l 2.125 3.68 C 9.97 6.53 10.953 6.25 12.0 6.25 c 0.515 0.0 1.014 0.068 1.489 0.195 l 1.1 -4.104 c -1.27 -0.34 -2.592 -0.427 -3.894 -0.255 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.1 7.894 C 12.75 7.8 12.38 7.75 12.0 7.75 c -0.774 0.0 -1.5 0.207 -2.125 0.569 c -0.323 0.186 -0.618 0.414 -0.88 0.676 C 8.225 9.764 7.75 10.826 7.75 12.0 s 0.476 2.236 1.245 3.005 c 0.262 0.262 0.557 0.49 0.88 0.676 c 0.625 0.362 1.35 0.569 2.125 0.569 c 2.347 0.0 4.25 -1.903 4.25 -4.25 c 0.0 -0.38 -0.05 -0.75 -0.144 -1.1 c -0.294 -1.1 -1.018 -2.024 -1.98 -2.581 c -0.319 -0.184 -0.663 -0.328 -1.026 -0.425 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.876 7.02 c 1.302 0.753 2.282 2.003 2.68 3.491 l 4.103 -1.1 C 20.973 6.85 19.297 4.667 17.0 3.34 l -2.124 3.68 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.75 12.0 c 0.0 3.176 -2.574 5.75 -5.75 5.75 c -1.047 0.0 -2.03 -0.28 -2.875 -0.77 L 7.0 20.66 C 8.52 21.538 10.245 22.0 12.0 22.0 s 3.48 -0.462 5.0 -1.34 c 1.52 -0.877 2.783 -2.14 3.66 -3.66 c 0.878 -1.52 1.34 -3.245 1.34 -5.0 h -4.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.25 12.0 c 0.0 1.588 0.644 3.025 1.684 4.066 L 4.93 19.07 C 4.0 18.142 3.264 17.041 2.76 15.827 C 2.26 14.614 2.0 13.313 2.0 12.0 c 0.0 -1.313 0.259 -2.614 0.761 -3.827 C 3.264 6.96 4.001 5.858 4.93 4.93 l 3.005 3.005 C 6.894 8.974 6.25 10.412 6.25 12.0 Z")
        )
    }.build()
}
