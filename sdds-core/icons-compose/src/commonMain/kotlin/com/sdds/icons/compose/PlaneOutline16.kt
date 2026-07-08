package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.494 5.49 C 1.887 5.1 1.796 4.248 2.307 3.737 C 2.773 3.27 3.46 3.102 4.087 3.299 l 4.589 1.44 l 1.687 -1.794 c 0.72 -0.766 1.93 -0.785 2.674 -0.041 c 0.743 0.743 0.725 1.954 -0.041 2.674 l -1.794 1.687 l 1.44 4.59 c 0.198 0.628 0.03 1.314 -0.436 1.78 c -0.511 0.511 -1.363 0.42 -1.755 -0.186 L 8.249 10.04 l -1.276 1.2 l 0.005 0.608 c 0.004 0.51 -0.196 1.0 -0.557 1.36 l -0.607 0.607 c -0.353 0.353 -0.955 0.214 -1.116 -0.26 L 4.11 11.832 l -1.726 -0.588 c -0.473 -0.162 -0.613 -0.763 -0.26 -1.117 L 2.732 9.52 c 0.36 -0.36 0.85 -0.56 1.36 -0.556 l 0.607 0.005 L 5.9 7.691 l -3.406 -2.2 Z m 2.575 6.057 l 0.407 1.193 l 0.238 -0.238 c 0.17 -0.171 0.266 -0.403 0.264 -0.645 L 5.97 11.031 c -0.002 -0.14 0.056 -0.273 0.157 -0.369 l 1.873 -1.76 C 8.11 8.8 8.257 8.751 8.404 8.768 c 0.147 0.018 0.28 0.1 0.36 0.225 l 2.527 3.912 c 0.046 0.072 0.147 0.083 0.208 0.022 c 0.202 -0.202 0.275 -0.5 0.19 -0.774 l -1.535 -4.889 c -0.058 -0.183 -0.005 -0.383 0.134 -0.514 l 2.023 -1.902 c 0.355 -0.333 0.363 -0.894 0.019 -1.238 c -0.344 -0.345 -0.905 -0.336 -1.239 0.019 L 9.19 5.653 c -0.132 0.14 -0.331 0.192 -0.514 0.134 L 3.788 4.253 C 3.515 4.167 3.217 4.24 3.014 4.443 c -0.06 0.06 -0.05 0.161 0.022 0.208 l 3.91 2.526 c 0.125 0.08 0.208 0.212 0.226 0.36 C 7.19 7.683 7.142 7.83 7.04 7.938 L 5.278 9.813 c -0.096 0.102 -0.23 0.159 -0.369 0.158 L 4.083 9.964 c -0.241 -0.002 -0.473 0.093 -0.644 0.263 L 3.2 10.466 l 1.193 0.406 c 0.07 -0.036 0.15 -0.056 0.23 -0.056 c 0.133 0.0 0.26 0.053 0.354 0.146 c 0.158 0.158 0.189 0.396 0.091 0.585 Z")
        )
    }.build()
}
