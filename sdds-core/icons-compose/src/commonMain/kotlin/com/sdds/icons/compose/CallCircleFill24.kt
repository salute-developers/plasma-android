package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallCircleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallCircleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z M 10.842 8.168 C 10.234 7.284 9.268 6.246 8.47 7.044 c -0.636 0.637 -3.184 3.185 1.058 7.428 c 4.243 4.243 6.791 1.694 7.428 1.058 c 0.798 -0.798 -0.24 -1.763 -1.124 -2.372 c -0.264 -0.182 -0.396 -0.273 -0.54 -0.313 c -0.158 -0.044 -0.23 -0.048 -0.391 -0.021 c -0.147 0.024 -0.42 0.171 -0.965 0.466 c -0.675 0.363 -1.66 0.53 -2.708 -0.518 c -1.049 -1.049 -0.881 -2.033 -0.518 -2.708 c 0.295 -0.545 0.442 -0.817 0.466 -0.965 c 0.027 -0.162 0.023 -0.233 -0.021 -0.391 c -0.04 -0.144 -0.131 -0.276 -0.313 -0.54 Z")
        )
    }.build()
}
