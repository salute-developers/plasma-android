package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MarkerOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MarkerOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.059 29.13 l -2.176 -2.176 l -3.215 3.215 l 3.247 1.104 l 2.144 -2.144 Z m 2.422 0.08 l 0.707 -0.706 c 2.6 -2.601 4.477 -3.553 5.617 -3.887 c 0.567 -0.166 0.959 -0.182 1.178 -0.17 c 0.11 0.007 0.18 0.02 0.211 0.028 l 0.013 0.003 c 0.364 0.131 0.772 0.042 1.047 -0.233 l 12.77 -12.771 c 0.374 -0.373 0.723 -0.973 0.62 -1.707 c -0.135 -0.972 -0.704 -2.65 -2.725 -4.672 c -2.02 -2.02 -3.7 -2.59 -4.672 -2.725 c -0.734 -0.103 -1.334 0.247 -1.707 0.62 L 11.77 15.76 c -0.275 0.275 -0.365 0.683 -0.234 1.047 l 0.003 0.013 c 0.007 0.03 0.021 0.101 0.027 0.211 c 0.013 0.22 -0.003 0.61 -0.169 1.178 c -0.334 1.14 -1.286 3.017 -3.886 5.617 l -0.707 0.707 l 4.677 4.678 Z m 20.13 -19.15 L 19.546 22.123 l -5.656 -5.656 L 25.954 4.404 c 0.02 -0.02 0.037 -0.033 0.05 -0.043 l 0.008 -0.005 c 0.523 0.083 1.792 0.452 3.493 2.153 c 1.701 1.702 2.07 2.97 2.153 3.494 l -0.005 0.007 c -0.01 0.014 -0.023 0.03 -0.043 0.05 Z M 17.28 22.686 l -3.953 -3.953 l -0.012 0.04 c -0.415 1.416 -1.43 3.332 -3.695 5.75 l 1.871 1.87 c 2.417 -2.265 4.334 -3.28 5.75 -3.695 l 0.04 -0.012 Z")
        )
    }.build()
}
