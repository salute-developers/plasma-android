package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EarFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EarFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.699 25.563 c -1.596 0.863 -2.86 2.33 -3.814 3.873 C 18.565 31.575 16.198 33.0 13.5 33.0 C 9.358 33.0 6.0 29.642 6.0 25.5 c 0.0 -0.66 0.085 -1.3 0.246 -1.911 c 0.46 -1.754 0.65 -3.679 0.174 -5.429 C 6.146 17.153 6.0 16.094 6.0 15.0 C 6.0 8.373 11.373 3.0 18.0 3.0 s 12.0 5.373 12.0 12.0 c 0.0 4.565 -2.549 8.535 -6.301 10.563 Z M 21.262 8.386 c -1.235 -0.61 -2.615 -0.86 -3.985 -0.725 c -1.37 0.134 -2.675 0.65 -3.767 1.488 s -1.927 1.965 -2.412 3.253 c -0.485 1.288 -0.6 2.687 -0.331 4.037 c 0.268 1.35 0.91 2.598 1.85 3.602 c 0.483 0.516 0.872 1.152 1.055 1.773 c 0.18 0.615 0.142 1.143 -0.102 1.564 L 12.634 25.0 c -0.276 0.478 -0.112 1.09 0.366 1.366 s 1.09 0.112 1.366 -0.366 l 0.936 -1.622 c 0.59 -1.021 0.577 -2.146 0.289 -3.127 c -0.286 -0.974 -0.858 -1.876 -1.514 -2.577 c -0.686 -0.732 -1.153 -1.641 -1.349 -2.625 c -0.195 -0.984 -0.112 -2.003 0.242 -2.942 c 0.353 -0.94 0.962 -1.76 1.758 -2.371 s 1.747 -0.987 2.745 -1.085 c 0.999 -0.098 2.005 0.085 2.904 0.528 c 0.9 0.444 1.658 1.13 2.188 1.983 c 0.417 0.671 0.68 1.425 0.773 2.206 c 0.065 0.548 0.562 0.94 1.11 0.875 c 0.549 -0.065 0.94 -0.562 0.876 -1.11 c -0.127 -1.072 -0.488 -2.106 -1.061 -3.027 c -0.727 -1.17 -1.767 -2.112 -3.001 -2.72 Z")
        )
    }.build()
}
