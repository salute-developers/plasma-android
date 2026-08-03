package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartBoxFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartBoxFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.354 1.25 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 7.292 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 4.354 Z m 0.118 2.103 h 7.056 c 0.371 0.0 0.681 0.0 0.934 0.02 c 0.264 0.023 0.511 0.07 0.746 0.193 c 0.359 0.188 0.651 0.487 0.834 0.856 c 0.12 0.24 0.166 0.494 0.188 0.765 c 0.02 0.26 0.02 0.577 0.02 0.957 v 5.813 c 0.0 0.38 0.0 0.698 -0.02 0.958 c -0.022 0.27 -0.068 0.525 -0.188 0.765 c -0.183 0.368 -0.475 0.668 -0.834 0.856 c -0.235 0.122 -0.482 0.17 -0.746 0.192 c -0.253 0.021 -0.563 0.021 -0.934 0.021 H 4.472 c -0.37 0.0 -0.68 0.0 -0.934 -0.02 c -0.263 -0.023 -0.511 -0.07 -0.745 -0.193 c -0.36 -0.188 -0.652 -0.488 -0.835 -0.856 c -0.12 -0.24 -0.166 -0.495 -0.187 -0.765 c -0.021 -0.26 -0.021 -0.577 -0.021 -0.957 V 6.143 c 0.0 -0.38 0.0 -0.698 0.02 -0.957 c 0.022 -0.27 0.069 -0.525 0.188 -0.765 c 0.183 -0.369 0.475 -0.668 0.835 -0.856 c 0.234 -0.122 0.482 -0.17 0.745 -0.192 c 0.253 -0.021 0.563 -0.021 0.934 -0.021 Z m 1.919 2.671 c -1.155 0.0 -1.864 1.02 -1.864 1.856 c 0.0 1.544 1.484 2.993 2.812 4.049 c 0.225 0.178 0.337 0.268 0.475 0.306 c 0.116 0.031 0.256 0.031 0.371 0.0 c 0.138 -0.038 0.25 -0.128 0.475 -0.306 c 1.328 -1.056 2.812 -2.505 2.812 -4.049 c 0.0 -0.836 -0.708 -1.856 -1.863 -1.856 c -0.645 0.0 -1.196 0.52 -1.61 1.013 c -0.413 -0.494 -0.964 -1.013 -1.608 -1.013 Z")
        )
    }.build()
}
