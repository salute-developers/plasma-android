package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EditFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EditFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.766 31.352 l 1.068 -5.342 c 0.608 0.037 1.207 0.175 1.771 0.409 C 7.272 26.695 7.88 27.1 8.39 27.61 c 0.511 0.51 0.916 1.117 1.193 1.784 c 0.234 0.565 0.371 1.163 0.408 1.772 l -5.342 1.068 c -0.524 0.105 -0.987 -0.358 -0.882 -0.883 Z m 8.574 -1.426 c -0.137 0.137 -0.283 0.265 -0.435 0.382 c -0.092 -0.575 -0.252 -1.138 -0.475 -1.678 c -0.377 -0.91 -0.93 -1.737 -1.626 -2.433 C 9.107 25.5 8.28 24.947 7.37 24.57 c -0.54 -0.224 -1.103 -0.383 -1.678 -0.476 c 0.118 -0.152 0.245 -0.297 0.382 -0.434 L 21.232 8.504 c 0.206 0.008 0.412 0.025 0.617 0.052 c 1.418 0.186 2.736 0.836 3.748 1.848 c 1.011 1.012 1.661 2.329 1.848 3.748 c 0.027 0.205 0.044 0.411 0.051 0.617 L 12.34 29.926 Z m 16.922 -16.923 l 1.691 -1.69 c 1.73 -1.73 1.73 -4.536 0.0 -6.266 c -1.73 -1.73 -4.534 -1.73 -6.264 0.0 l -1.69 1.691 c 1.513 0.366 2.903 1.142 4.012 2.252 c 1.11 1.109 1.886 2.5 2.252 4.013 Z")
        )
    }.build()
}
