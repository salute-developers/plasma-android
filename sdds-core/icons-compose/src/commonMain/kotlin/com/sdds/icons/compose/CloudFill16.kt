package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.955 5.735 C 2.252 6.195 1.0 7.727 1.0 9.547 C 1.0 11.73 2.802 13.5 5.025 13.5 h 6.825 c 1.74 0.0 3.15 -1.385 3.15 -3.094 c 0.0 -1.225 -0.725 -2.283 -1.775 -2.784 c 0.017 -0.158 0.025 -0.319 0.025 -0.481 c 0.0 -2.563 -2.116 -4.641 -4.725 -4.641 c -1.638 0.0 -3.081 0.819 -3.929 2.062 c 0.391 -0.033 0.786 -0.021 1.176 0.036 c 0.685 0.1 1.344 0.339 1.934 0.7 c 0.59 0.362 1.099 0.84 1.495 1.406 c 0.396 0.565 0.67 1.205 0.804 1.881 c 0.057 0.285 -0.128 0.561 -0.412 0.617 C 9.308 9.26 9.032 9.074 8.976 8.79 C 8.87 8.258 8.654 7.753 8.34 7.306 C 8.028 6.86 7.625 6.481 7.157 6.194 C 6.689 5.907 6.165 5.717 5.619 5.637 c -0.546 -0.08 -1.103 -0.049 -1.636 0.091 L 3.955 5.735 Z")
        )
    }.build()
}
