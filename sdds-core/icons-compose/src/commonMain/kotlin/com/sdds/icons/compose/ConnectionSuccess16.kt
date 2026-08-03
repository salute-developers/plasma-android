package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ConnectionSuccess16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ConnectionSuccess16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 2.0 C 6.45 2.0 4.959 2.63 3.858 3.753 C 3.664 3.95 3.347 3.953 3.15 3.76 c -0.197 -0.193 -0.2 -0.51 -0.007 -0.707 C 4.429 1.74 6.177 1.0 8.0 1.0 c 1.824 0.0 3.571 0.74 4.858 2.053 c 0.193 0.198 0.19 0.514 -0.008 0.707 c -0.197 0.194 -0.513 0.19 -0.707 -0.007 C 11.044 2.63 9.553 2.0 8.001 2.0 Z m 0.0 2.107 c -1.004 0.0 -1.97 0.407 -2.683 1.136 c -0.193 0.197 -0.51 0.2 -0.707 0.007 c -0.197 -0.193 -0.2 -0.51 -0.007 -0.707 C 5.503 3.625 6.724 3.107 8.0 3.107 c 1.276 0.0 2.499 0.518 3.398 1.436 c 0.193 0.198 0.19 0.514 -0.007 0.707 c -0.197 0.194 -0.514 0.19 -0.707 -0.007 C 9.97 4.514 9.005 4.107 8.0 4.107 Z m -2.683 6.646 c -0.193 -0.198 -0.51 -0.2 -0.707 -0.008 c -0.197 0.194 -0.2 0.51 -0.007 0.707 c 0.9 0.919 2.121 1.437 3.398 1.437 c 1.276 0.0 2.499 -0.518 3.398 -1.437 c 0.193 -0.197 0.19 -0.514 -0.007 -0.707 c -0.197 -0.193 -0.514 -0.19 -0.707 0.008 C 9.97 11.48 9.005 11.889 8.0 11.889 c -1.005 0.0 -1.97 -0.408 -2.684 -1.136 Z M 3.15 12.236 c 0.197 -0.193 0.514 -0.19 0.707 0.007 c 1.1 1.124 2.592 1.753 4.144 1.753 s 3.043 -0.629 4.143 -1.753 c 0.194 -0.197 0.51 -0.2 0.707 -0.007 c 0.198 0.193 0.201 0.51 0.008 0.707 c -1.287 1.314 -3.034 2.053 -4.858 2.053 c -1.824 0.0 -3.572 -0.74 -4.858 -2.053 c -0.193 -0.197 -0.19 -0.514 0.007 -0.707 Z m 4.851 -2.834 c 0.76 0.0 1.376 -0.629 1.376 -1.405 S 8.761 6.592 8.001 6.592 c -0.76 0.0 -1.376 0.63 -1.376 1.405 C 6.625 8.773 7.24 9.402 8.0 9.402 Z")
        )
    }.build()
}
