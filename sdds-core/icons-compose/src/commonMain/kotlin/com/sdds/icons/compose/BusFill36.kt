package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BusFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BusFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.777 3.0 h 10.446 c 1.22 0.0 2.203 0.0 3.0 0.065 c 0.82 0.067 1.54 0.209 2.206 0.548 c 1.058 0.54 1.919 1.4 2.458 2.458 c 0.34 0.667 0.481 1.387 0.548 2.207 c 0.065 0.796 0.065 1.78 0.065 2.999 v 2.259 c 0.117 -0.042 0.244 -0.064 0.375 -0.064 c 0.621 0.0 1.125 0.504 1.125 1.125 v 2.248 c 0.0 0.621 -0.504 1.125 -1.125 1.125 c -0.131 0.0 -0.258 -0.022 -0.375 -0.064 v 12.467 c 0.0 1.45 -1.175 2.625 -2.625 2.625 s -2.625 -1.175 -2.625 -2.625 v -1.885 H 9.75 v 1.885 c 0.0 1.45 -1.175 2.625 -2.625 2.625 S 4.5 31.823 4.5 30.373 V 17.899 c -0.117 0.042 -0.244 0.064 -0.375 0.064 C 3.504 17.963 3.0 17.46 3.0 16.838 V 14.59 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 c 0.132 0.0 0.258 0.023 0.375 0.064 v -2.252 c 0.0 -1.22 0.0 -2.203 0.065 -3.0 c 0.067 -0.82 0.209 -1.54 0.548 -2.206 c 0.54 -1.058 1.4 -1.919 2.458 -2.458 c 0.667 -0.34 1.387 -0.481 2.207 -0.548 C 10.574 3.0 11.558 3.0 12.777 3.0 Z m 16.473 8.325 v 2.891 H 6.75 v -2.891 c 0.0 -1.279 0.0 -2.17 0.058 -2.864 c 0.055 -0.68 0.159 -1.072 0.31 -1.368 c 0.323 -0.635 0.84 -1.152 1.475 -1.475 c 0.296 -0.151 0.687 -0.255 1.368 -0.31 c 0.694 -0.057 1.585 -0.058 2.864 -0.058 h 10.35 c 1.279 0.0 2.17 0.001 2.864 0.058 c 0.68 0.055 1.072 0.16 1.368 0.31 c 0.635 0.324 1.152 0.84 1.475 1.475 c 0.151 0.296 0.255 0.687 0.31 1.368 c 0.057 0.694 0.058 1.585 0.058 2.864 Z m -18.0 12.657 c 1.243 0.0 2.25 -1.01 2.25 -2.255 c 0.0 -1.244 -1.007 -2.253 -2.25 -2.253 S 9.0 20.483 9.0 21.727 c 0.0 1.245 1.007 2.255 2.25 2.255 Z m 13.5 0.0 c 1.243 0.0 2.25 -1.01 2.25 -2.255 c 0.0 -1.244 -1.007 -2.253 -2.25 -2.253 s -2.25 1.009 -2.25 2.253 c 0.0 1.245 1.007 2.255 2.25 2.255 Z")
        )
    }.build()
}
