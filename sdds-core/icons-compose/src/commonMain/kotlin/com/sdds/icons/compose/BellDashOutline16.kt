package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellDashOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellDashOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.982 13.6 C 9.694 14.417 8.915 15.0 8.001 15.0 c -0.915 0.0 -1.693 -0.584 -1.982 -1.4 h 3.963 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.002 1.0 c 0.184 0.0 0.365 0.036 0.535 0.106 c 0.17 0.07 0.325 0.174 0.455 0.304 s 0.234 0.284 0.304 0.454 c 0.07 0.17 0.106 0.353 0.106 0.536 H 9.29 c 0.707 0.18 1.276 0.518 1.725 0.99 c 0.126 0.132 0.24 0.274 0.344 0.422 l 2.167 -2.166 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.708 l -11.88 11.88 c -0.195 0.194 -0.511 0.194 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.709 l 0.88 -0.88 C 2.363 12.562 2.25 12.395 2.25 12.2 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 0.61 c 0.07 -0.652 0.093 -1.381 0.118 -2.153 L 3.49 9.229 c 0.036 -1.046 0.085 -2.155 0.28 -3.162 c 0.194 -1.004 0.543 -1.965 1.22 -2.677 c 0.449 -0.472 1.018 -0.81 1.725 -0.99 H 6.602 c 0.0 -0.183 0.036 -0.366 0.106 -0.536 c 0.07 -0.17 0.174 -0.324 0.304 -0.454 s 0.284 -0.233 0.454 -0.304 C 7.636 1.036 7.818 1.0 8.002 1.0 Z M 8.0 3.25 c -1.114 0.0 -1.816 0.334 -2.287 0.83 C 5.226 4.591 4.929 5.336 4.75 6.257 C 4.573 7.176 4.524 8.21 4.488 9.264 l -0.01 0.321 c -0.012 0.386 -0.026 0.774 -0.045 1.153 l 6.205 -6.205 c -0.104 -0.167 -0.22 -0.318 -0.349 -0.454 C 9.818 3.583 9.116 3.25 8.001 3.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.234 6.067 c 0.195 1.006 0.244 2.116 0.28 3.162 l 0.01 0.319 c 0.026 0.772 0.049 1.5 0.119 2.152 h 0.61 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 5.295 l 1.0 -1.0 h 5.343 c -0.066 -0.67 -0.09 -1.395 -0.114 -2.115 l -0.01 -0.321 c -0.03 -0.898 -0.07 -1.782 -0.19 -2.592 l 0.858 -0.859 c 0.018 0.085 0.036 0.17 0.052 0.254 Z")
        )
    }.build()
}
