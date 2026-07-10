package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ThermometerOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ThermometerOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.5 c 0.414 0.0 0.75 0.336 0.75 0.75 v 5.5 c 0.0 0.035 -0.004 0.07 -0.009 0.104 c 1.159 0.323 2.009 1.384 2.009 2.646 c 0.0 1.519 -1.231 2.75 -2.75 2.75 s -2.75 -1.231 -2.75 -2.75 c 0.0 -1.261 0.85 -2.322 2.008 -2.646 c -0.005 -0.034 -0.008 -0.069 -0.008 -0.104 v -5.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z m 0.0 7.75 c -0.69 0.0 -1.25 0.56 -1.25 1.25 s 0.56 1.25 1.25 1.25 s 1.25 -0.56 1.25 -1.25 s -0.56 -1.25 -1.25 -1.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.017 2.0 c 0.492 0.002 0.979 0.108 1.428 0.309 c 0.45 0.2 0.852 0.493 1.182 0.858 c 0.33 0.365 0.58 0.796 0.734 1.263 c 0.062 0.186 0.107 0.377 0.137 0.57 H 15.5 v 7.258 c 0.725 0.598 1.288 1.375 1.63 2.259 c 0.43 1.115 0.487 2.34 0.16 3.49 c -0.328 1.15 -1.021 2.161 -1.975 2.882 c -0.953 0.72 -2.116 1.11 -3.311 1.111 c -1.195 0.0 -2.36 -0.388 -3.314 -1.107 c -0.954 -0.72 -1.65 -1.73 -1.978 -2.88 c -0.33 -1.148 -0.274 -2.374 0.155 -3.49 c 0.341 -0.886 0.906 -1.665 1.633 -2.264 V 5.0 h 0.003 c 0.031 -0.204 0.08 -0.406 0.146 -0.603 c 0.16 -0.465 0.414 -0.893 0.747 -1.255 c 0.334 -0.362 0.74 -0.651 1.19 -0.848 c 0.452 -0.196 0.94 -0.296 1.431 -0.294 Z M 12.01 3.5 c -0.284 -0.001 -0.565 0.057 -0.825 0.17 c -0.26 0.113 -0.493 0.28 -0.685 0.488 c -0.192 0.209 -0.34 0.455 -0.43 0.723 C 10.038 4.97 10.016 5.06 10.0 5.152 v 7.865 c -0.035 0.032 -0.073 0.062 -0.114 0.088 c -0.738 0.459 -1.306 1.146 -1.619 1.957 c -0.312 0.812 -0.352 1.703 -0.113 2.539 c 0.24 0.835 0.744 1.571 1.439 2.094 c 0.694 0.523 1.54 0.805 2.41 0.805 c 0.869 0.0 1.714 -0.285 2.408 -0.809 s 1.197 -1.26 1.436 -2.095 c 0.238 -0.836 0.197 -1.728 -0.117 -2.538 c -0.313 -0.811 -0.882 -1.498 -1.62 -1.956 c -0.04 -0.025 -0.077 -0.054 -0.11 -0.084 V 5.142 C 13.984 5.06 13.963 4.98 13.937 4.9 c -0.089 -0.269 -0.233 -0.517 -0.423 -0.727 c -0.19 -0.21 -0.422 -0.38 -0.681 -0.495 c -0.26 -0.116 -0.54 -0.177 -0.823 -0.178 Z")
        )
    }.build()
}
