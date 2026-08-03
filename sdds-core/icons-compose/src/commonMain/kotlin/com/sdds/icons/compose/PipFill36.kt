package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PipFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PipFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.88 4.5 h 18.24 c 0.802 0.0 1.47 0.0 2.017 0.045 c 0.57 0.046 1.105 0.147 1.61 0.405 c 0.777 0.395 1.408 1.026 1.803 1.802 c 0.258 0.506 0.359 1.041 0.405 1.611 C 33.0 8.909 33.0 9.578 33.0 10.379 V 18.0 L 22.742 18.0 c -0.79 0.0 -1.473 0.0 -2.035 0.046 c -0.593 0.048 -1.182 0.155 -1.75 0.445 c -0.847 0.43 -1.535 1.12 -1.966 1.966 c -0.29 0.568 -0.397 1.157 -0.445 1.75 C 16.5 22.77 16.5 23.451 16.5 24.242 V 28.5 H 8.88 c -0.802 0.0 -1.47 0.0 -2.017 -0.045 c -0.57 -0.046 -1.105 -0.147 -1.61 -0.405 c -0.777 -0.395 -1.408 -1.026 -1.803 -1.802 c -0.258 -0.506 -0.359 -1.041 -0.405 -1.611 C 3.0 24.091 3.0 23.422 3.0 22.621 V 10.379 c 0.0 -0.8 0.0 -1.47 0.045 -2.016 c 0.046 -0.57 0.147 -1.105 0.405 -1.61 c 0.395 -0.777 1.026 -1.408 1.802 -1.803 c 0.506 -0.258 1.041 -0.359 1.611 -0.405 C 7.409 4.5 8.078 4.5 8.879 4.5 Z m 9.447 16.638 C 18.0 21.78 18.0 22.62 18.0 24.3 v 2.4 c 0.0 1.68 0.0 2.52 0.327 3.162 c 0.288 0.565 0.746 1.023 1.311 1.311 C 20.28 31.5 21.12 31.5 22.8 31.5 h 6.9 c 1.68 0.0 2.52 0.0 3.162 -0.327 c 0.564 -0.288 1.023 -0.746 1.311 -1.311 C 34.5 29.22 34.5 28.38 34.5 26.7 v -2.4 c 0.0 -1.68 0.0 -2.52 -0.327 -3.162 c -0.288 -0.565 -0.747 -1.023 -1.311 -1.311 C 32.22 19.5 31.38 19.5 29.7 19.5 h -6.9 c -1.68 0.0 -2.52 0.0 -3.162 0.327 c -0.565 0.288 -1.023 0.746 -1.311 1.311 Z")
        )
    }.build()
}
