package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherIntensiveFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherIntensiveFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.355 4.04 c 0.0 -1.27 1.037 -2.29 2.305 -2.29 c 1.27 0.0 2.306 1.02 2.306 2.29 h 3.57 c 0.296 0.0 0.535 0.237 0.535 0.53 c 0.0 0.292 -0.24 0.53 -0.534 0.53 h -0.89 v 4.868 v -0.985 H 7.28 c -0.773 0.0 -1.4 0.626 -1.4 1.4 v 2.836 c -0.41 0.0 -0.752 -0.003 -1.035 -0.026 c -0.33 -0.027 -0.628 -0.084 -0.906 -0.224 c -0.436 -0.22 -0.79 -0.571 -1.012 -1.003 c -0.142 -0.276 -0.2 -0.571 -0.226 -0.898 c -0.026 -0.316 -0.026 -0.705 -0.026 -1.18 V 5.098 h -0.89 C 1.488 5.1 1.25 4.862 1.25 4.57 c 0.0 -0.292 0.24 -0.529 0.534 -0.529 h 3.57 Z m 1.05 0.0 c 0.0 -0.68 0.557 -1.24 1.255 -1.24 c 0.699 0.0 1.256 0.56 1.256 1.24 H 6.405 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.982 10.57 c 0.0 -0.275 0.224 -0.5 0.5 -0.5 h 6.767 c 0.276 0.0 0.5 0.225 0.5 0.5 c 0.0 0.277 -0.224 0.5 -0.5 0.5 H 7.482 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.982 12.69 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 6.767 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 12.53 c -0.207 0.61 -0.783 1.058 -1.468 1.058 H 10.67 c -0.685 0.0 -1.26 -0.447 -1.467 -1.058 h -1.72 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 3.444 0.5 c 0.074 0.037 0.156 0.058 0.243 0.058 h 0.393 c 0.087 0.0 0.17 -0.021 0.244 -0.058 h -0.88 Z")
        )
    }.build()
}
