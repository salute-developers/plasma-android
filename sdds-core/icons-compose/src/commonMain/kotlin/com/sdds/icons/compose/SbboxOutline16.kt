package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.356 1.356 c -0.068 -0.068 -0.179 -0.068 -0.247 0.0 L 11.995 2.47 C 11.758 2.707 11.727 3.07 11.9 3.342 L 9.148 6.094 C 8.787 5.74 8.505 5.488 8.195 5.335 c -0.725 -0.357 -1.575 -0.357 -2.3 0.0 c -0.386 0.19 -0.73 0.534 -1.238 1.043 l -1.87 1.871 C 2.276 8.757 1.933 9.1 1.742 9.487 c -0.357 0.725 -0.357 1.575 0.0 2.3 c 0.191 0.386 0.534 0.73 1.043 1.237 l 0.139 0.14 c 0.508 0.508 0.852 0.852 1.238 1.042 c 0.725 0.358 1.575 0.358 2.3 0.0 c 0.386 -0.19 0.73 -0.534 1.238 -1.043 l 1.87 -1.87 c 0.51 -0.51 0.853 -0.852 1.043 -1.239 c 0.358 -0.725 0.358 -1.575 0.0 -2.3 c -0.152 -0.31 -0.403 -0.591 -0.759 -0.953 l 2.752 -2.752 c 0.271 0.174 0.636 0.143 0.873 -0.094 l 1.114 -1.114 c 0.068 -0.068 0.068 -0.18 0.0 -0.248 l -1.238 -1.237 Z m -4.56 5.798 C 8.19 6.55 7.97 6.34 7.752 6.232 c -0.446 -0.22 -0.97 -0.22 -1.415 0.0 C 6.119 6.34 5.9 6.55 5.295 7.154 L 3.563 8.887 C 2.958 9.49 2.748 9.71 2.64 9.929 c -0.22 0.446 -0.22 0.97 0.0 1.415 c 0.108 0.219 0.318 0.438 0.923 1.043 c 0.604 0.604 0.824 0.815 1.042 0.922 c 0.446 0.22 0.97 0.22 1.415 0.0 c 0.219 -0.107 0.438 -0.317 1.043 -0.922 l 1.732 -1.732 C 9.4 10.05 9.61 9.83 9.718 9.612 c 0.22 -0.446 0.22 -0.97 0.0 -1.415 C 9.61 7.978 9.4 7.759 8.795 7.154 Z")
        )
    }.build()
}
