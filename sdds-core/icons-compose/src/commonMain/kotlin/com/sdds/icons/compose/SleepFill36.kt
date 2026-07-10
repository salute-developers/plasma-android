package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SleepFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SleepFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.642 4.525 c 0.492 -0.094 0.93 0.1 1.19 0.227 c 0.282 0.14 0.624 0.35 1.003 0.582 l 0.038 0.024 c 4.275 2.621 7.13 7.34 7.13 12.726 c 0.0 8.238 -6.68 14.917 -14.919 14.917 c -5.386 0.0 -10.104 -2.855 -12.725 -7.128 l -0.024 -0.039 c -0.232 -0.379 -0.442 -0.72 -0.582 -1.003 c -0.128 -0.26 -0.322 -0.697 -0.228 -1.19 c 0.11 -0.58 0.499 -1.058 1.043 -1.286 c 0.274 -0.115 0.54 -0.118 0.73 -0.102 c 0.195 0.017 0.392 0.061 0.573 0.11 c 0.35 0.096 0.8 0.257 1.327 0.444 l 0.039 0.014 c 1.195 0.425 2.484 0.658 3.829 0.658 c 6.304 0.0 11.414 -5.11 11.414 -11.413 c 0.0 -1.345 -0.233 -2.634 -0.658 -3.83 l -0.014 -0.038 C 22.62 7.67 22.46 7.222 22.365 6.872 c -0.05 -0.182 -0.094 -0.379 -0.11 -0.574 c -0.017 -0.19 -0.014 -0.456 0.1 -0.73 c 0.229 -0.544 0.708 -0.932 1.287 -1.043 Z")
        )
    }.build()
}
