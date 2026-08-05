package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlankTextFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlankTextFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.875 3.015 C 18.607 3.0 18.319 3.0 17.995 3.0 h -4.917 c -1.01 0.0 -1.836 0.0 -2.508 0.055 C 9.876 3.112 9.248 3.233 8.662 3.53 C 7.745 4.0 6.999 4.745 6.532 5.661 c -0.3 0.587 -0.42 1.215 -0.477 1.91 C 6.0 8.24 6.0 9.067 6.0 10.077 v 15.844 c 0.0 1.01 0.0 1.836 0.055 2.508 c 0.057 0.695 0.178 1.322 0.476 1.908 c 0.468 0.918 1.214 1.663 2.13 2.13 c 0.587 0.3 1.215 0.42 1.91 0.477 C 11.24 33.0 12.067 33.0 13.077 33.0 h 9.844 c 1.01 0.0 1.836 0.0 2.508 -0.055 c 0.695 -0.056 1.322 -0.178 1.908 -0.476 c 0.918 -0.468 1.663 -1.213 2.13 -2.13 c 0.3 -0.587 0.42 -1.214 0.477 -1.91 C 30.0 27.76 30.0 26.933 30.0 25.923 V 15.005 c 0.0 -0.324 0.0 -0.612 -0.015 -0.88 h -5.351 c -0.805 0.0 -1.47 0.0 -2.01 -0.044 c -0.563 -0.046 -1.08 -0.145 -1.565 -0.392 c -0.753 -0.383 -1.364 -0.995 -1.748 -1.748 c -0.247 -0.485 -0.346 -1.002 -0.392 -1.564 c -0.044 -0.541 -0.044 -1.206 -0.044 -2.01 V 3.014 Z m 2.0 5.31 V 3.663 C 21.256 3.914 21.587 4.246 22.0 4.66 L 28.34 11.0 c 0.413 0.412 0.745 0.743 0.996 1.124 h -4.662 c -0.857 0.0 -1.439 0.0 -1.889 -0.037 c -0.438 -0.036 -0.663 -0.101 -0.819 -0.18 c -0.376 -0.193 -0.682 -0.499 -0.874 -0.875 c -0.08 -0.156 -0.145 -0.38 -0.18 -0.819 c -0.037 -0.45 -0.038 -1.032 -0.038 -1.889 Z M 12.0 18.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 12.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 12.0 Z m 0.0 6.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 12.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 12.0 Z")
        )
    }.build()
}
