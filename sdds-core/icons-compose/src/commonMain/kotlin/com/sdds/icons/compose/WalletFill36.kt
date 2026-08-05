package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WalletFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WalletFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.334 5.355 c 0.48 -0.054 0.771 -0.085 0.987 -0.09 c 0.132 -0.004 0.189 0.004 0.204 0.008 C 24.6 5.305 24.66 5.36 24.7 5.43 c 0.005 0.015 0.02 0.07 0.03 0.203 c 0.019 0.217 0.02 0.51 0.02 0.997 v 3.66 L 7.613 8.986 C 7.126 8.948 6.75 8.54 6.75 8.049 c 0.0 -0.479 0.357 -0.88 0.83 -0.933 l 15.754 -1.761 Z M 7.332 4.866 C 5.72 5.046 4.5 6.417 4.5 8.05 v 15.23 c 0.0 0.948 0.0 1.725 0.05 2.36 c 0.052 0.66 0.162 1.255 0.432 1.82 c 0.425 0.888 1.105 1.626 1.953 2.119 c 0.54 0.314 1.122 0.47 1.771 0.571 c 0.626 0.098 1.396 0.157 2.336 0.228 l 12.844 0.98 c 1.079 0.082 1.96 0.149 2.675 0.143 c 0.74 -0.006 1.411 -0.089 2.044 -0.372 c 0.987 -0.441 1.8 -1.2 2.312 -2.156 c 0.329 -0.614 0.461 -1.282 0.523 -2.023 c 0.06 -0.717 0.06 -1.605 0.06 -2.694 v -6.85 c 0.0 -0.948 0.0 -1.725 -0.05 -2.36 c -0.052 -0.66 -0.162 -1.255 -0.432 -1.82 c -0.425 -0.888 -1.105 -1.626 -1.953 -2.119 c -0.54 -0.314 -1.122 -0.47 -1.771 -0.571 C 27.199 10.52 27.1 10.506 27.0 10.493 V 6.587 c 0.0 -0.43 0.0 -0.822 -0.027 -1.146 c -0.03 -0.347 -0.097 -0.73 -0.3 -1.099 c -0.287 -0.523 -0.742 -0.933 -1.29 -1.162 c -0.389 -0.162 -0.774 -0.187 -1.12 -0.178 c -0.323 0.008 -0.71 0.051 -1.136 0.099 L 7.333 4.866 Z M 22.576 19.55 c -0.55 -0.042 -1.031 0.37 -1.073 0.92 c -0.042 0.551 0.37 1.032 0.921 1.074 l 3.75 0.286 c 0.55 0.042 1.031 -0.37 1.073 -0.922 c 0.042 -0.55 -0.37 -1.03 -0.921 -1.073 l -3.75 -0.285 Z")
        )
    }.build()
}
