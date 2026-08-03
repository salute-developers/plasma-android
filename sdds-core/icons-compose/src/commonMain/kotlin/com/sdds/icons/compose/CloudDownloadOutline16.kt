package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudDownloadOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudDownloadOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.002 8.266 c 0.0 -1.896 1.285 -3.494 3.03 -3.938 C 4.636 2.402 6.416 1.0 8.527 1.0 c 2.61 0.0 4.715 2.144 4.715 4.773 c 0.0 0.176 -0.01 0.35 -0.028 0.521 c 1.058 0.512 1.784 1.603 1.784 2.862 c 0.0 1.603 -1.177 2.935 -2.716 3.143 c -0.274 0.037 -0.525 -0.155 -0.562 -0.428 c -0.037 -0.274 0.155 -0.526 0.428 -0.563 c 1.04 -0.14 1.85 -1.046 1.85 -2.152 c 0.0 -0.973 -0.629 -1.793 -1.49 -2.07 c -0.241 -0.077 -0.386 -0.323 -0.337 -0.572 c 0.046 -0.239 0.071 -0.487 0.071 -0.74 C 12.242 3.682 10.572 2.0 8.527 2.0 C 7.029 2.0 5.733 2.902 5.146 4.207 c 1.072 0.035 2.038 0.496 2.736 1.219 C 8.074 5.624 8.07 5.94 7.871 6.133 C 7.672 6.325 7.355 6.319 7.164 6.12 c -0.548 -0.567 -1.309 -0.916 -2.15 -0.916 c -0.17 0.0 -0.336 0.014 -0.498 0.042 c -1.422 0.24 -2.514 1.496 -2.514 3.02 c 0.0 1.316 0.818 2.436 1.96 2.869 c 0.258 0.097 0.389 0.386 0.29 0.644 c -0.097 0.259 -0.386 0.389 -0.644 0.29 c -1.525 -0.577 -2.606 -2.064 -2.606 -3.804 Z m 7.353 6.586 C 8.26 14.946 8.133 14.999 8.0 14.999 c -0.133 0.0 -0.26 -0.053 -0.354 -0.147 l -2.108 -2.118 c -0.195 -0.196 -0.194 -0.512 0.002 -0.707 c 0.196 -0.195 0.512 -0.194 0.707 0.002 L 7.5 13.288 V 8.499 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 4.789 l 1.253 -1.26 c 0.195 -0.195 0.512 -0.196 0.707 -0.001 c 0.196 0.195 0.197 0.511 0.002 0.707 l -2.107 2.118 Z")
        )
    }.build()
}
