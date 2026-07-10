package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PipOnFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PipOnFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.12 4.5 H 8.88 c -0.802 0.0 -1.47 0.0 -2.017 0.045 c -0.57 0.046 -1.105 0.147 -1.61 0.405 C 4.475 5.345 3.844 5.976 3.45 6.752 C 3.192 7.258 3.09 7.793 3.045 8.363 C 3.0 8.909 3.0 9.578 3.0 10.379 v 12.242 c 0.0 0.8 0.0 1.47 0.045 2.016 c 0.046 0.57 0.147 1.105 0.405 1.61 c 0.395 0.777 1.026 1.408 1.802 1.803 c 0.506 0.258 1.041 0.359 1.611 0.405 C 7.409 28.5 8.078 28.5 8.879 28.5 H 16.5 v -4.258 c 0.0 -0.79 0.0 -1.473 0.046 -2.035 c 0.048 -0.593 0.155 -1.182 0.445 -1.75 c 0.43 -0.847 1.12 -1.535 1.966 -1.966 c 0.568 -0.29 1.157 -0.397 1.75 -0.445 C 21.27 18.0 21.951 18.0 22.742 18.0 H 33.0 v -7.62 c 0.0 -0.802 0.0 -1.47 -0.045 -2.017 c -0.046 -0.57 -0.147 -1.105 -0.405 -1.61 c -0.395 -0.777 -1.026 -1.408 -1.802 -1.803 c -0.506 -0.258 -1.041 -0.359 -1.611 -0.405 C 28.591 4.5 27.922 4.5 27.121 4.5 Z M 13.5 16.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 V 8.636 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 3.95 L 7.832 7.918 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 c -0.39 0.39 -0.39 1.024 0.0 1.414 L 11.086 14.0 h -3.95 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 H 13.5 Z m 4.827 5.138 C 18.0 21.78 18.0 22.62 18.0 24.3 v 2.4 c 0.0 1.68 0.0 2.52 0.327 3.162 c 0.288 0.565 0.746 1.023 1.311 1.311 C 20.28 31.5 21.12 31.5 22.8 31.5 h 6.9 c 1.68 0.0 2.52 0.0 3.162 -0.327 c 0.564 -0.288 1.023 -0.746 1.311 -1.311 C 34.5 29.22 34.5 28.38 34.5 26.7 v -2.4 c 0.0 -1.68 0.0 -2.52 -0.327 -3.162 c -0.288 -0.565 -0.747 -1.023 -1.311 -1.311 C 32.22 19.5 31.38 19.5 29.7 19.5 h -6.9 c -1.68 0.0 -2.52 0.0 -3.162 0.327 c -0.565 0.288 -1.023 0.746 -1.311 1.311 Z")
        )
    }.build()
}
