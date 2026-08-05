package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ScissorsFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ScissorsFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.072 1.7 c 1.42 0.0 2.572 1.152 2.573 2.572 c 0.0 0.341 -0.069 0.666 -0.189 0.963 l 1.556 1.557 l 3.485 -3.484 c 0.009 -0.01 0.342 -0.427 1.47 -0.735 c 1.134 -0.309 1.706 -0.004 1.715 0.0 L 6.493 10.76 c 0.096 0.27 0.151 0.56 0.152 0.862 c 0.0 1.42 -1.152 2.572 -2.573 2.572 c -1.42 0.0 -2.572 -1.151 -2.572 -2.572 c 0.0 -1.42 1.152 -2.572 2.572 -2.572 c 0.482 0.0 0.931 0.135 1.317 0.365 l 1.398 -1.399 l -1.485 -1.485 c -0.366 0.2 -0.784 0.314 -1.23 0.314 c -1.42 0.0 -2.572 -1.152 -2.572 -2.573 C 1.5 2.852 2.652 1.7 4.072 1.7 Z m 0.0 8.35 c -0.868 0.0 -1.572 0.704 -1.572 1.572 c 0.0 0.868 0.704 1.572 1.572 1.572 c 0.869 0.0 1.573 -0.704 1.573 -1.572 c 0.0 -0.868 -0.704 -1.572 -1.573 -1.572 Z m 3.871 -2.47 c -0.1 0.001 -0.195 0.031 -0.273 0.084 C 7.54 7.752 7.453 7.9 7.453 8.07 c 0.0 0.068 0.014 0.132 0.04 0.19 c 0.074 0.176 0.248 0.3 0.45 0.3 c 0.068 0.0 0.132 -0.014 0.19 -0.039 c 0.06 -0.024 0.113 -0.06 0.157 -0.105 c 0.022 -0.022 0.042 -0.046 0.06 -0.072 c 0.052 -0.079 0.083 -0.172 0.084 -0.274 c 0.0 -0.067 -0.014 -0.132 -0.038 -0.19 C 8.383 7.85 8.367 7.822 8.35 7.796 c -0.053 -0.078 -0.128 -0.14 -0.216 -0.177 c -0.03 -0.012 -0.06 -0.022 -0.092 -0.028 C 8.01 7.584 7.977 7.58 7.943 7.58 Z M 4.073 2.7 C 3.203 2.7 2.5 3.404 2.5 4.272 c 0.0 0.869 0.704 1.572 1.572 1.573 c 0.869 0.0 1.573 -0.704 1.573 -1.573 C 5.645 3.404 4.94 2.7 4.072 2.7 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.68 13.46 c -0.02 0.012 -0.593 0.307 -1.714 0.0 c -1.124 -0.306 -1.46 -0.721 -1.47 -0.735 L 8.678 9.908 l 1.224 -1.225 l 4.779 4.779 Z")
        )
    }.build()
}
