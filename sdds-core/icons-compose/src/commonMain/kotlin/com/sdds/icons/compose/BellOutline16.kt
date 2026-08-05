package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.295 1.864 c 0.07 0.17 0.107 0.352 0.107 0.536 H 9.29 c 0.708 0.18 1.277 0.518 1.725 0.99 c 0.678 0.712 1.026 1.674 1.22 2.678 c 0.194 1.006 0.244 2.115 0.28 3.162 l 0.01 0.317 c 0.025 0.772 0.05 1.5 0.119 2.153 h 0.61 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 2.75 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 0.61 c 0.07 -0.653 0.094 -1.38 0.119 -2.153 l 0.01 -0.317 c 0.036 -1.047 0.085 -2.156 0.28 -3.162 c 0.194 -1.004 0.542 -1.966 1.22 -2.678 c 0.448 -0.472 1.017 -0.81 1.725 -0.99 H 6.6 c 0.0 -0.184 0.037 -0.366 0.107 -0.536 C 6.778 1.694 6.88 1.54 7.01 1.41 s 0.285 -0.233 0.455 -0.303 C 7.636 1.037 7.818 1.0 8.002 1.0 c 0.184 0.0 0.366 0.036 0.536 0.107 c 0.17 0.07 0.324 0.173 0.454 0.303 s 0.233 0.284 0.303 0.454 Z m 2.343 9.836 c -0.066 -0.67 -0.09 -1.395 -0.113 -2.115 l -0.01 -0.321 c -0.036 -1.053 -0.085 -2.088 -0.263 -3.007 c -0.178 -0.92 -0.475 -1.665 -0.962 -2.178 C 9.818 3.583 9.116 3.25 8.0 3.25 c -1.114 0.0 -1.816 0.333 -2.288 0.829 C 5.226 4.592 4.93 5.336 4.751 6.257 c -0.178 0.92 -0.227 1.954 -0.262 3.007 l -0.01 0.321 c -0.024 0.72 -0.048 1.446 -0.114 2.115 h 7.273 Z M 6.02 13.6 C 6.308 14.416 7.086 15.0 8.001 15.0 s 1.693 -0.584 1.981 -1.4 H 6.02 Z")
        )
    }.build()
}
