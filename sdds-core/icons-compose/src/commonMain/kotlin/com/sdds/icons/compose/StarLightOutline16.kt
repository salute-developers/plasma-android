package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarLightOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarLightOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.735 1.844 c 0.17 -0.238 0.119 -0.57 -0.116 -0.742 c -0.234 -0.173 -0.562 -0.12 -0.733 0.117 l -1.47 2.05 c -0.17 0.238 -0.119 0.57 0.116 0.743 c 0.234 0.172 0.562 0.12 0.733 -0.118 l 1.47 -2.05 Z M 4.114 1.219 C 3.944 0.982 3.615 0.93 3.38 1.102 C 3.146 1.274 3.094 1.606 3.265 1.844 l 1.47 2.05 c 0.17 0.237 0.499 0.29 0.733 0.118 c 0.235 -0.173 0.287 -0.505 0.116 -0.743 l -1.47 -2.05 Z M 3.567 9.56 c 0.275 -0.091 0.426 -0.391 0.337 -0.67 c -0.09 -0.28 -0.386 -0.432 -0.662 -0.341 L 0.862 9.33 C 0.588 9.42 0.437 9.72 0.527 10.0 c 0.09 0.278 0.385 0.431 0.661 0.34 l 2.38 -0.783 Z m 9.19 -1.011 c -0.275 -0.091 -0.571 0.062 -0.66 0.34 c -0.09 0.28 0.06 0.58 0.336 0.67 l 2.38 0.784 c 0.276 0.09 0.572 -0.063 0.661 -0.342 c 0.09 -0.279 -0.061 -0.579 -0.337 -0.67 l -2.38 -0.782 Z m -4.232 3.886 c 0.0 -0.293 -0.235 -0.531 -0.525 -0.531 c -0.29 0.0 -0.525 0.238 -0.525 0.531 v 2.535 C 7.475 15.262 7.71 15.5 8.0 15.5 c 0.29 0.0 0.525 -0.238 0.525 -0.531 v -2.534 Z m 0.13 -10.432 c -0.273 -0.541 -1.037 -0.541 -1.31 0.0 L 5.977 4.72 L 3.001 5.199 c -0.593 0.095 -0.829 0.83 -0.405 1.26 l 2.13 2.16 l -0.47 3.014 c -0.094 0.6 0.524 1.054 1.059 0.779 L 8.0 11.028 l 2.685 1.384 c 0.535 0.275 1.153 -0.18 1.06 -0.78 l -0.47 -3.014 l 2.129 -2.159 c 0.424 -0.43 0.188 -1.165 -0.405 -1.26 l -2.975 -0.48 l -1.37 -2.717 Z M 6.837 5.347 L 8.0 3.041 l 1.162 2.306 C 9.269 5.56 9.469 5.707 9.7 5.744 l 2.524 0.406 l -1.806 1.832 c -0.166 0.168 -0.242 0.407 -0.206 0.642 l 0.398 2.557 l -2.278 -1.174 c -0.21 -0.108 -0.457 -0.108 -0.666 0.0 l -2.278 1.174 l 0.398 -2.557 C 5.824 8.389 5.747 8.15 5.58 7.982 L 3.775 6.15 l 2.524 -0.406 c 0.232 -0.038 0.432 -0.185 0.54 -0.397 Z")
        )
    }.build()
}
