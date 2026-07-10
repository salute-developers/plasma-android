package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RegionalFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RegionalFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.35 1.148 C 5.544 1.344 5.543 1.66 5.347 1.855 C 4.999 2.2 4.723 2.61 4.535 3.06 C 4.347 3.511 4.25 3.994 4.25 4.481 c 0.0 0.488 0.097 0.97 0.285 1.421 c 0.188 0.451 0.464 0.86 0.812 1.206 C 5.543 7.303 5.544 7.62 5.35 7.815 C 5.155 8.011 4.838 8.012 4.642 7.818 c -0.44 -0.438 -0.791 -0.958 -1.03 -1.53 C 3.373 5.715 3.25 5.1 3.25 4.48 c 0.0 -0.62 0.123 -1.233 0.362 -1.806 c 0.239 -0.572 0.59 -1.092 1.03 -1.53 C 4.838 0.95 5.155 0.95 5.35 1.148 Z m 6.006 -0.003 C 11.16 0.95 10.844 0.95 10.65 1.148 c -0.194 0.196 -0.193 0.512 0.003 0.707 C 11.0 2.2 11.276 2.61 11.464 3.06 c 0.188 0.451 0.285 0.934 0.285 1.421 c 0.0 0.488 -0.097 0.97 -0.285 1.421 c -0.188 0.451 -0.464 0.86 -0.812 1.206 c -0.196 0.195 -0.197 0.511 -0.003 0.707 c 0.195 0.196 0.511 0.197 0.707 0.003 c 0.442 -0.438 0.792 -0.958 1.03 -1.53 c 0.24 -0.573 0.363 -1.187 0.363 -1.807 c 0.0 -0.62 -0.123 -1.233 -0.362 -1.806 c -0.24 -0.572 -0.59 -1.092 -1.03 -1.53 Z M 8.225 7.108 C 8.15 7.114 8.075 7.118 8.0 7.118 c -0.075 0.0 -0.149 -0.003 -0.222 -0.01 L 6.6 11.269 l 2.231 -2.013 l -0.607 -2.147 Z m -1.41 -0.267 C 5.941 6.41 5.343 5.515 5.343 4.482 c 0.0 -1.455 1.189 -2.635 2.656 -2.635 c 1.466 0.0 2.655 1.18 2.655 2.635 c 0.0 1.032 -0.597 1.925 -1.467 2.358 l 2.127 7.52 c 0.075 0.266 -0.08 0.542 -0.345 0.617 c -0.266 0.075 -0.542 -0.079 -0.617 -0.345 L 9.136 10.33 l -3.047 2.748 l -0.44 1.555 c -0.075 0.266 -0.351 0.42 -0.617 0.345 c -0.266 -0.075 -0.42 -0.351 -0.345 -0.617 l 2.127 -7.519 Z")
        )
    }.build()
}
