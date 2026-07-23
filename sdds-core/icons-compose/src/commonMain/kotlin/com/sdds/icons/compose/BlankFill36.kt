package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlankFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlankFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.875 3.015 v 5.351 c 0.0 0.805 0.0 1.47 0.044 2.01 c 0.046 0.563 0.145 1.08 0.392 1.565 c 0.384 0.753 0.995 1.365 1.748 1.748 c 0.485 0.247 1.002 0.346 1.564 0.392 c 0.541 0.044 1.206 0.044 2.01 0.044 h 5.352 C 30.0 14.393 30.0 14.681 30.0 15.005 v 10.917 c 0.0 1.01 0.0 1.836 -0.055 2.508 c -0.057 0.695 -0.178 1.322 -0.476 1.908 c -0.468 0.918 -1.213 1.663 -2.13 2.13 c -0.587 0.3 -1.214 0.42 -1.91 0.477 C 24.76 33.0 23.933 33.0 22.923 33.0 h -9.844 c -1.01 0.0 -1.836 0.0 -2.508 -0.055 c -0.694 -0.056 -1.322 -0.178 -1.908 -0.476 c -0.917 -0.468 -1.663 -1.213 -2.13 -2.13 c -0.3 -0.587 -0.42 -1.214 -0.477 -1.91 C 6.0 27.76 6.0 26.933 6.0 25.923 V 10.078 c 0.0 -1.01 0.0 -1.836 0.055 -2.508 c 0.057 -0.694 0.178 -1.322 0.476 -1.908 C 7.0 4.745 7.745 3.999 8.661 3.532 c 0.587 -0.3 1.215 -0.42 1.91 -0.477 C 11.24 3.0 12.067 3.0 13.077 3.0 h 4.918 c 0.323 0.0 0.61 0.0 0.879 0.015 Z m 2.0 0.648 v 4.662 c 0.0 0.857 0.0 1.439 0.038 1.89 c 0.035 0.438 0.1 0.662 0.18 0.818 c 0.192 0.376 0.498 0.682 0.874 0.874 c 0.156 0.08 0.38 0.145 0.819 0.18 c 0.45 0.037 1.032 0.038 1.889 0.038 h 4.662 c -0.251 -0.381 -0.582 -0.712 -0.995 -1.124 L 22.0 4.659 c -0.413 -0.413 -0.744 -0.745 -1.125 -0.996 Z")
        )
    }.build()
}
