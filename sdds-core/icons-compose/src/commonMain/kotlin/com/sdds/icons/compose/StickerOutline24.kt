package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StickerOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StickerOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.957 3.832 C 11.822 4.365 11.75 4.924 11.75 5.5 c 0.0 3.728 3.022 6.75 6.75 6.75 c 0.576 0.0 1.135 -0.072 1.668 -0.207 c -0.103 -0.162 -0.25 -0.315 -0.62 -0.684 l -6.907 -6.907 c -0.37 -0.37 -0.522 -0.516 -0.684 -0.62 Z m 8.404 9.707 c -0.599 0.138 -1.222 0.211 -1.861 0.211 c -4.556 0.0 -8.25 -3.694 -8.25 -8.25 c 0.0 -0.64 0.073 -1.262 0.211 -1.861 C 6.501 4.363 3.5 7.832 3.5 12.0 c 0.0 4.695 3.806 8.5 8.5 8.5 c 4.168 0.0 7.637 -3.001 8.361 -6.96 Z M 10.238 2.155 c 0.392 -0.07 0.68 -0.123 1.151 -0.07 c 0.082 0.009 0.165 0.023 0.245 0.04 c 0.298 0.063 0.678 0.189 0.943 0.332 c 0.417 0.226 0.7 0.509 1.079 0.888 l 0.046 0.046 l 6.907 6.907 l 0.046 0.047 c 0.38 0.378 0.662 0.661 0.888 1.078 c 0.143 0.265 0.269 0.645 0.332 0.944 c 0.017 0.079 0.031 0.162 0.04 0.244 c 0.053 0.47 0.0 0.76 -0.07 1.151 l -0.003 0.02 C 21.0 18.455 16.915 22.0 12.0 22.0 C 6.477 22.0 2.0 17.523 2.0 12.0 c 0.0 -4.915 3.545 -9.0 8.218 -9.841 l 0.02 -0.004 Z")
        )
    }.build()
}
