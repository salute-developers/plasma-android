package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.25 3.956 c -0.034 4.815 -1.43 7.57 -2.928 9.133 c -1.506 1.571 -3.055 1.872 -3.231 1.902 l -0.002 0.001 H 8.086 l -0.014 0.002 C 8.058 14.996 8.032 15.0 8.0 15.0 c -0.032 0.0 -0.058 -0.004 -0.072 -0.006 l -0.015 -0.002 H 7.91 c -0.168 -0.029 -1.579 -0.303 -3.013 -1.683 L 5.605 12.6 C 6.677 13.627 7.713 13.924 8.0 13.99 c 0.306 -0.07 1.458 -0.403 2.6 -1.594 c 1.187 -1.238 2.412 -3.454 2.62 -7.411 l 1.03 -1.03 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.625 1.15 c 0.228 -0.151 0.522 -0.151 0.75 0.0 C 8.65 1.33 9.491 1.87 10.53 2.364 c 0.578 0.275 1.196 0.522 1.797 0.692 l 1.41 -1.41 c 0.196 -0.195 0.512 -0.195 0.707 0.0 c 0.196 0.196 0.196 0.512 0.0 0.708 L 2.563 14.233 c -0.195 0.195 -0.511 0.195 -0.706 0.0 c -0.195 -0.196 -0.196 -0.512 0.0 -0.707 l 1.78 -1.782 C 2.574 10.058 1.75 7.537 1.75 3.784 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 c 0.98 0.0 2.167 -0.42 3.22 -0.92 C 6.508 1.871 7.352 1.331 7.625 1.15 Z M 8.0 2.099 C 7.605 2.352 6.827 2.827 5.9 3.268 C 4.965 3.712 3.828 4.146 2.755 4.257 C 2.818 7.439 3.51 9.58 4.362 11.019 l 7.166 -7.165 c -0.502 -0.172 -0.987 -0.377 -1.427 -0.586 C 9.173 2.827 8.396 2.352 8.0 2.098 Z")
        )
    }.build()
}
