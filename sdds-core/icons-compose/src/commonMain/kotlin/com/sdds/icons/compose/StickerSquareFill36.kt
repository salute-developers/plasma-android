package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StickerSquareFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StickerSquareFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.5 20.375 v -8.797 c 0.0 -1.01 0.0 -1.836 -0.055 -2.508 c -0.057 -0.694 -0.178 -1.322 -0.476 -1.908 c -0.468 -0.917 -1.213 -1.663 -2.13 -2.13 c -0.587 -0.3 -1.214 -0.42 -1.91 -0.477 C 26.26 4.5 25.433 4.5 24.423 4.5 H 11.578 c -1.01 0.0 -1.836 0.0 -2.508 0.055 C 8.376 4.612 7.748 4.733 7.162 5.03 C 6.245 5.5 5.499 6.245 5.032 7.161 c -0.3 0.587 -0.42 1.215 -0.477 1.91 C 4.5 9.74 4.5 10.567 4.5 11.577 v 12.844 c 0.0 1.01 0.0 1.836 0.055 2.508 c 0.057 0.695 0.178 1.322 0.476 1.908 c 0.468 0.918 1.214 1.663 2.13 2.13 c 0.587 0.3 1.215 0.42 1.91 0.477 c 0.67 0.055 1.497 0.055 2.507 0.055 h 8.797 v -5.366 c 0.0 -0.805 0.0 -1.47 0.044 -2.01 c 0.046 -0.563 0.145 -1.08 0.392 -1.565 c 0.384 -0.753 0.995 -1.364 1.748 -1.748 c 0.485 -0.247 1.002 -0.346 1.564 -0.392 c 0.541 -0.044 1.206 -0.044 2.01 -0.044 H 31.5 Z m -0.534 2.0 h -4.791 c -0.857 0.0 -1.439 0.0 -1.889 0.038 c -0.438 0.035 -0.663 0.1 -0.819 0.18 c -0.376 0.192 -0.682 0.498 -0.874 0.874 c -0.08 0.156 -0.145 0.38 -0.18 0.819 c -0.037 0.45 -0.038 1.032 -0.038 1.889 v 4.791 l 8.591 -8.591 Z")
        )
    }.build()
}
