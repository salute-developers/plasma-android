package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.982 13.6 C 9.694 14.417 8.915 15.0 8.001 15.0 c -0.914 0.0 -1.692 -0.584 -1.98 -1.4 h 3.961 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.002 1.0 c 0.184 0.0 0.365 0.036 0.535 0.106 c 0.17 0.07 0.325 0.174 0.455 0.304 s 0.234 0.284 0.304 0.454 c 0.07 0.17 0.106 0.353 0.106 0.536 H 9.29 c 0.707 0.18 1.276 0.518 1.725 0.99 c 0.677 0.712 1.026 1.673 1.22 2.677 c 0.195 1.007 0.244 2.116 0.28 3.162 l 0.01 0.318 c 0.026 0.772 0.049 1.5 0.119 2.153 h 0.61 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 2.75 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 0.61 c 0.07 -0.652 0.093 -1.381 0.119 -2.153 l 0.01 -0.318 c 0.036 -1.046 0.085 -2.155 0.28 -3.162 c 0.194 -1.004 0.543 -1.965 1.22 -2.677 c 0.449 -0.472 1.018 -0.81 1.725 -0.99 H 6.602 c 0.0 -0.183 0.036 -0.366 0.106 -0.536 c 0.07 -0.17 0.174 -0.324 0.304 -0.454 s 0.284 -0.233 0.454 -0.304 C 7.636 1.036 7.818 1.0 8.002 1.0 Z")
        )
    }.build()
}
