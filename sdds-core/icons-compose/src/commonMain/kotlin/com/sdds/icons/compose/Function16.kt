package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Function16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Function16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.561 3.089 c 0.201 -1.359 1.71 -2.056 2.861 -1.323 L 9.977 2.12 c 0.233 0.148 0.304 0.46 0.16 0.695 C 9.99 3.05 9.686 3.12 9.453 2.972 L 8.898 2.618 c -0.546 -0.347 -1.26 -0.016 -1.355 0.627 L 6.87 7.803 h 1.77 c 0.275 0.0 0.499 0.224 0.5 0.5 c 0.0 0.276 -0.225 0.5 -0.5 0.5 H 6.72 l -0.608 4.112 c -0.186 1.25 -1.496 1.969 -2.635 1.445 l -0.883 -0.406 c -0.25 -0.115 -0.363 -0.414 -0.25 -0.667 c 0.111 -0.253 0.405 -0.365 0.655 -0.25 l 0.883 0.406 c 0.54 0.248 1.16 -0.092 1.248 -0.684 l 0.585 -3.956 H 4.257 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 1.607 L 6.56 3.089 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.406 9.058 c 0.156 -0.227 0.465 -0.282 0.69 -0.122 c 0.225 0.16 0.28 0.475 0.124 0.703 l -1.258 1.826 l 1.52 2.208 c 0.156 0.227 0.1 0.542 -0.124 0.702 c -0.225 0.16 -0.534 0.105 -0.69 -0.122 l -1.312 -1.906 l -1.312 1.906 c -0.156 0.227 -0.465 0.282 -0.69 0.122 c -0.225 -0.16 -0.28 -0.475 -0.124 -0.702 l 1.518 -2.208 l -1.256 -1.826 C 9.335 9.41 9.39 9.097 9.616 8.936 c 0.225 -0.16 0.534 -0.105 0.69 0.122 l 1.05 1.525 l 1.05 -1.525 Z")
        )
    }.build()
}
