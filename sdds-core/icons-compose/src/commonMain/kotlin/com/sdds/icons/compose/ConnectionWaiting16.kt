package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ConnectionWaiting16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ConnectionWaiting16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.857 3.753 C 4.957 2.63 6.45 2.0 8.001 2.0 s 3.043 0.63 4.143 1.753 c 0.194 0.197 0.51 0.2 0.707 0.007 c 0.198 -0.193 0.201 -0.51 0.008 -0.707 C 11.572 1.74 9.825 1.0 8.0 1.0 C 6.177 1.0 4.429 1.74 3.143 3.053 C 2.95 3.251 2.953 3.567 3.15 3.76 c 0.197 0.194 0.514 0.19 0.707 -0.007 Z m 1.46 1.49 c 0.714 -0.729 1.68 -1.136 2.684 -1.136 c 1.005 0.0 1.97 0.407 2.684 1.136 c 0.193 0.197 0.51 0.2 0.707 0.007 c 0.197 -0.193 0.2 -0.51 0.007 -0.707 c -0.9 -0.918 -2.122 -1.436 -3.398 -1.436 c -1.277 0.0 -2.499 0.518 -3.398 1.436 C 4.409 4.741 4.413 5.057 4.61 5.25 c 0.197 0.194 0.514 0.19 0.707 -0.007 Z M 4.61 10.745 c 0.197 -0.193 0.514 -0.19 0.707 0.008 c 0.714 0.728 1.68 1.136 2.684 1.136 c 1.005 0.0 1.97 -0.408 2.684 -1.136 c 0.193 -0.198 0.51 -0.2 0.707 -0.008 c 0.197 0.194 0.2 0.51 0.007 0.707 c -0.9 0.919 -2.122 1.437 -3.398 1.437 c -1.277 0.0 -2.499 -0.518 -3.398 -1.437 c -0.194 -0.197 -0.19 -0.514 0.007 -0.707 Z m -0.753 1.498 c -0.193 -0.197 -0.51 -0.2 -0.707 -0.007 c -0.197 0.193 -0.2 0.51 -0.007 0.707 C 4.429 14.257 6.177 14.996 8.0 14.996 c 1.824 0.0 3.571 -0.74 4.858 -2.053 c 0.193 -0.197 0.19 -0.514 -0.008 -0.707 c -0.197 -0.193 -0.513 -0.19 -0.707 0.007 c -1.1 1.124 -2.591 1.753 -4.143 1.753 c -1.552 0.0 -3.043 -0.629 -4.144 -1.753 Z")
        )
    }.build()
}
