package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherNormalFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherNormalFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.355 4.04 c 0.0 -1.269 1.036 -2.29 2.305 -2.29 c 1.27 0.0 2.306 1.021 2.306 2.29 h 3.57 c 0.296 0.0 0.535 0.237 0.535 0.53 c 0.0 0.292 -0.24 0.53 -0.534 0.53 h -0.89 v 4.788 c 0.0 0.476 0.0 0.865 -0.027 1.18 l -0.002 0.034 H 7.28 c -0.773 0.0 -1.4 0.627 -1.4 1.4 v 0.718 h 3.332 l -0.01 -0.03 h -1.72 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 6.767 c 0.276 0.0 0.5 0.224 0.5 0.5 c 0.0 0.277 -0.224 0.5 -0.5 0.5 H 12.53 c -0.207 0.611 -0.783 1.059 -1.468 1.059 H 10.67 c -0.673 0.0 -1.241 -0.433 -1.457 -1.029 H 6.035 c -0.48 0.0 -0.871 0.0 -1.19 -0.026 c -0.33 -0.026 -0.628 -0.083 -0.906 -0.224 c -0.436 -0.22 -0.79 -0.571 -1.012 -1.003 c -0.142 -0.276 -0.2 -0.571 -0.226 -0.898 c -0.026 -0.316 -0.026 -0.705 -0.026 -1.18 v -4.79 h -0.89 C 1.488 5.1 1.25 4.863 1.25 4.57 c 0.0 -0.293 0.24 -0.53 0.534 -0.53 h 3.57 Z m 1.05 0.0 c 0.0 -0.68 0.558 -1.24 1.255 -1.24 c 0.698 0.0 1.256 0.56 1.256 1.24 H 6.405 Z m 4.264 9.209 c -0.087 0.0 -0.17 -0.021 -0.243 -0.059 h 0.88 c -0.074 0.038 -0.157 0.059 -0.244 0.059 H 10.67 Z")
        )
    }.build()
}
