package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarLightFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarLightFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.62 1.102 c 0.234 0.172 0.286 0.504 0.115 0.742 l -1.47 2.05 c -0.17 0.237 -0.499 0.29 -0.733 0.118 c -0.235 -0.173 -0.287 -0.505 -0.116 -0.743 l 1.47 -2.05 c 0.17 -0.237 0.499 -0.29 0.733 -0.117 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.38 1.102 c 0.235 -0.173 0.563 -0.12 0.734 0.117 l 1.47 2.05 c 0.17 0.238 0.119 0.57 -0.116 0.743 c -0.234 0.172 -0.562 0.12 -0.733 -0.118 l -1.47 -2.05 c -0.17 -0.238 -0.119 -0.57 0.116 -0.742 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.904 8.889 c 0.09 0.279 -0.062 0.579 -0.337 0.67 l -2.38 0.783 C 0.911 10.431 0.615 10.278 0.526 10.0 c -0.09 -0.279 0.061 -0.579 0.337 -0.67 l 2.38 -0.782 c 0.275 -0.091 0.571 0.062 0.66 0.34 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.096 8.889 c 0.09 -0.28 0.386 -0.432 0.662 -0.341 l 2.38 0.783 c 0.275 0.09 0.426 0.39 0.336 0.67 c -0.09 0.278 -0.385 0.431 -0.661 0.34 l -2.38 -0.783 c -0.275 -0.09 -0.426 -0.39 -0.337 -0.67 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 11.903 c 0.29 0.0 0.525 0.238 0.525 0.531 v 2.535 C 8.525 15.262 8.29 15.5 8.0 15.5 c -0.29 0.0 -0.525 -0.238 -0.525 -0.531 v -2.534 c 0.0 -0.294 0.235 -0.532 0.525 -0.532 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.346 2.002 c 0.272 -0.541 1.036 -0.541 1.308 0.0 l 1.37 2.718 l 2.975 0.479 c 0.593 0.095 0.829 0.83 0.405 1.26 l -2.13 2.16 l 0.47 3.014 c 0.094 0.6 -0.524 1.054 -1.059 0.779 L 8.0 11.028 l -2.685 1.384 c -0.535 0.275 -1.153 -0.18 -1.06 -0.78 l 0.47 -3.014 L 2.596 6.46 C 2.172 6.03 2.408 5.294 3.001 5.2 l 2.975 -0.48 l 1.37 -2.717 Z")
        )
    }.build()
}
