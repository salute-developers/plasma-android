package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.672 3.248 c 0.504 -0.33 1.152 -0.33 1.656 0.0 c 0.585 0.384 2.397 1.537 4.63 2.59 c 1.467 0.69 3.051 1.308 4.556 1.658 l 3.008 -3.007 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.023 0.0 1.414 L 6.48 31.359 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.415 L 8.46 26.55 C 5.978 22.946 4.0 17.403 4.0 8.924 c 0.0 -0.622 0.504 -1.125 1.125 -1.125 c 2.1 0.0 4.65 -0.893 6.916 -1.961 c 2.234 -1.053 4.046 -2.206 4.631 -2.59 Z m -5.916 26.017 L 31.0 9.021 c -0.019 10.461 -3.056 16.435 -6.32 19.811 c -3.255 3.366 -6.602 4.01 -6.979 4.074 H 17.7 l -0.006 0.001 l -0.01 0.002 l -0.02 0.002 c -0.03 0.005 -0.088 0.012 -0.163 0.012 c -0.075 0.0 -0.133 -0.007 -0.163 -0.012 l -0.03 -0.004 l -0.008 -0.001 c -0.36 -0.061 -3.432 -0.652 -6.543 -3.64 Z")
        )
    }.build()
}
