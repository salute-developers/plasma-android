package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.015 4.045 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.292 -0.294 -0.767 -0.294 -1.06 0.0 l -2.72 2.72 C 16.041 4.645 14.47 4.0 12.75 4.0 C 9.744 4.0 7.199 5.964 6.324 8.678 C 3.838 9.313 2.0 11.566 2.0 14.25 c 0.0 1.827 0.852 3.455 2.18 4.508 l -1.196 1.197 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.061 0.0 l 16.97 -16.97 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.207 19.974 L 18.996 8.186 c 0.325 0.79 0.504 1.656 0.504 2.564 c 0.0 0.236 -0.012 0.47 -0.036 0.7 C 20.964 12.18 22.0 13.718 22.0 15.5 c 0.0 2.485 -2.015 4.5 -4.5 4.5 H 7.75 c -0.183 0.0 -0.364 -0.009 -0.543 -0.026 Z")
        )
    }.build()
}
