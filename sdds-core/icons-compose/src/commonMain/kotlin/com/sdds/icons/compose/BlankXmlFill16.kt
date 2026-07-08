package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BlankXmlFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BlankXmlFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.36 1.006 v 2.48 c 0.0 0.383 -0.001 0.7 0.02 0.96 C 8.4 4.71 8.448 4.955 8.566 5.187 c 0.183 0.357 0.473 0.648 0.83 0.83 c 0.232 0.119 0.478 0.164 0.743 0.186 c 0.258 0.021 0.577 0.022 0.96 0.022 h 2.394 C 13.498 6.34 13.5 6.466 13.5 6.603 v 5.094 c 0.0 0.472 0.0 0.857 -0.025 1.17 c -0.026 0.324 -0.081 0.617 -0.218 0.89 c -0.214 0.429 -0.556 0.777 -0.977 0.995 c -0.268 0.14 -0.556 0.196 -0.875 0.223 C 11.098 15.0 10.72 15.0 10.255 15.0 h -4.51 c -0.464 0.0 -0.843 0.0 -1.15 -0.025 c -0.319 -0.027 -0.607 -0.084 -0.875 -0.223 c -0.42 -0.218 -0.763 -0.566 -0.977 -0.994 c -0.137 -0.274 -0.192 -0.567 -0.218 -0.89 c -0.025 -0.314 -0.025 -0.7 -0.025 -1.17 V 4.302 c 0.0 -0.471 0.0 -0.857 0.025 -1.17 c 0.026 -0.324 0.081 -0.617 0.218 -0.89 C 2.957 1.813 3.3 1.465 3.72 1.247 c 0.268 -0.14 0.556 -0.196 0.875 -0.223 C 4.902 1.0 5.28 1.0 5.745 1.0 h 2.253 C 8.13 1.0 8.248 1.0 8.36 1.006 Z M 5.182 10.85 L 4.5 12.1 h 0.63 l 0.413 -0.823 l 0.406 0.823 H 6.6 l -0.681 -1.26 l 0.647 -1.19 H 5.942 l -0.385 0.763 L 5.172 9.65 H 4.535 l 0.648 1.2 Z M 6.932 12.1 h 0.525 v -1.365 c 0.0 -0.07 -0.002 -0.129 -0.007 -0.175 l -0.01 -0.175 h 0.013 l 0.032 0.095 c 0.01 0.025 0.018 0.052 0.025 0.08 c 0.01 0.025 0.018 0.053 0.027 0.08 l 0.04 0.095 l 0.335 0.875 h 0.455 l 0.336 -0.875 C 8.717 10.7 8.73 10.67 8.738 10.641 c 0.012 -0.028 0.02 -0.056 0.028 -0.081 l 0.028 -0.08 l 0.031 -0.095 H 8.84 c -0.007 0.07 -0.012 0.128 -0.015 0.175 c -0.002 0.046 -0.003 0.105 -0.003 0.175 V 12.1 h 0.525 V 9.65 H 8.668 L 8.15 10.997 L 7.632 9.65 h -0.7 v 2.45 Z m 2.973 0.0 h 1.505 v -0.49 h -0.959 V 9.65 H 9.905 v 2.45 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.36 1.34 c 0.157 0.114 0.3 0.258 0.473 0.434 L 9.868 1.81 l 2.836 2.887 l 0.036 0.036 c 0.177 0.18 0.32 0.329 0.432 0.493 H 11.1 c -0.4 0.0 -0.67 -0.001 -0.88 -0.018 c -0.202 -0.017 -0.302 -0.047 -0.37 -0.081 c -0.169 -0.086 -0.307 -0.224 -0.393 -0.394 c -0.034 -0.067 -0.064 -0.167 -0.08 -0.369 C 9.36 4.156 9.359 3.886 9.359 3.485 V 1.341 Z")
        )
    }.build()
}
