package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WhistleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WhistleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.022 4.258 C 3.77 3.764 4.65 3.5 5.55 3.5 c 0.14 0.0 0.273 0.055 0.371 0.152 C 6.02 3.75 6.075 3.882 6.075 4.02 v 1.385 h 1.05 V 4.019 C 7.125 3.732 7.36 3.5 7.65 3.5 h 6.825 C 14.765 3.5 15.0 3.732 15.0 4.02 v 2.595 c 0.0 0.232 -0.155 0.436 -0.38 0.5 l -4.393 1.24 C 10.164 8.375 10.08 8.449 10.06 8.59 C 9.97 9.269 9.722 9.924 9.333 10.5 c -0.5 0.74 -1.21 1.317 -2.042 1.658 c -0.831 0.34 -1.746 0.43 -2.629 0.256 c -0.882 -0.174 -1.693 -0.603 -2.33 -1.232 c -0.636 -0.63 -1.069 -1.431 -1.245 -2.304 c -0.175 -0.873 -0.085 -1.778 0.26 -2.6 c 0.344 -0.822 0.927 -1.525 1.675 -2.02 Z")
        )
    }.build()
}
