package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SleepOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SleepOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.836 5.335 l 0.038 0.023 c 4.274 2.621 7.13 7.34 7.13 12.725 c 0.0 8.239 -6.68 14.918 -14.92 14.918 C 12.7 33.0 7.98 30.146 5.36 25.872 l -0.023 -0.037 c -0.233 -0.38 -0.443 -0.722 -0.583 -1.005 c -0.128 -0.259 -0.322 -0.697 -0.228 -1.19 c 0.111 -0.579 0.499 -1.057 1.043 -1.285 c 0.274 -0.115 0.54 -0.118 0.73 -0.102 c 0.196 0.017 0.392 0.061 0.574 0.11 c 0.35 0.096 0.8 0.256 1.326 0.444 l 0.039 0.014 c 1.195 0.425 2.484 0.658 3.83 0.658 c 6.303 0.0 11.413 -5.11 11.413 -11.413 c 0.0 -1.345 -0.232 -2.634 -0.658 -3.83 l -0.014 -0.038 c -0.187 -0.527 -0.347 -0.976 -0.443 -1.326 c -0.05 -0.182 -0.094 -0.379 -0.11 -0.574 c -0.017 -0.19 -0.014 -0.456 0.101 -0.73 c 0.228 -0.544 0.706 -0.932 1.286 -1.043 c 0.492 -0.094 0.93 0.1 1.19 0.228 c 0.282 0.14 0.624 0.35 1.004 0.582 Z M 24.448 6.83 c 0.069 0.202 0.154 0.442 0.258 0.734 c 0.502 1.408 0.774 2.924 0.774 4.501 c 0.0 7.408 -6.005 13.413 -13.414 13.413 c -1.577 0.0 -3.092 -0.273 -4.5 -0.774 c -0.292 -0.104 -0.533 -0.19 -0.734 -0.258 l 0.232 0.38 C 9.337 28.532 13.423 31.0 18.084 31.0 c 7.136 0.0 12.92 -5.783 12.92 -12.917 c 0.0 -4.661 -2.47 -8.747 -6.176 -11.02 l -0.38 -0.232 Z")
        )
    }.build()
}
