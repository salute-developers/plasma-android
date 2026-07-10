package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CartOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CartOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.75 4.5 c 0.686 0.0 0.873 0.007 1.02 0.05 c 0.3 0.089 0.558 0.287 0.72 0.555 C 3.564 5.231 3.618 5.401 3.776 6.0 H 3.776 l 2.026 7.656 l 0.03 0.112 l 0.057 0.217 l 0.134 0.505 l 0.018 -0.005 c 0.083 0.234 0.184 0.446 0.326 0.631 c 0.24 0.315 0.56 0.56 0.925 0.712 c 0.418 0.174 0.895 0.173 1.44 0.172 h 0.115 h 7.556 h 0.116 c 0.544 0.001 1.02 0.002 1.44 -0.172 c 0.365 -0.152 0.684 -0.397 0.924 -0.712 c 0.275 -0.36 0.397 -0.821 0.535 -1.348 l 0.03 -0.112 l 1.359 -5.134 c 0.066 -0.25 0.128 -0.483 0.162 -0.68 c 0.035 -0.21 0.057 -0.465 -0.023 -0.735 c -0.11 -0.367 -0.35 -0.68 -0.677 -0.88 c -0.24 -0.146 -0.493 -0.19 -0.705 -0.21 C 19.364 6.0 19.124 6.0 18.866 6.0 H 5.328 L 5.224 5.602 c -0.138 -0.523 -0.245 -0.93 -0.45 -1.27 C 4.418 3.74 3.854 3.304 3.192 3.11 C 2.81 2.999 2.389 3.0 1.848 3.0 H 1.75 C 1.336 3.0 1.0 3.336 1.0 3.75 S 1.336 4.5 1.75 4.5 Z m 3.974 3.0 l 1.532 5.787 c 0.184 0.693 0.234 0.83 0.303 0.918 c 0.08 0.105 0.186 0.187 0.308 0.238 c 0.104 0.043 0.25 0.057 0.98 0.057 h 7.556 c 0.73 0.0 0.876 -0.014 0.98 -0.057 c 0.122 -0.05 0.228 -0.133 0.308 -0.238 c 0.069 -0.09 0.12 -0.227 0.307 -0.933 l 1.351 -5.106 c 0.076 -0.287 0.12 -0.455 0.141 -0.578 c 0.006 -0.031 0.008 -0.053 0.01 -0.068 L 19.43 7.512 C 19.307 7.5 19.134 7.5 18.837 7.5 H 5.724 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.0 19.25 C 10.0 20.217 9.216 21.0 8.25 21.0 S 6.5 20.217 6.5 19.25 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 S 10.0 18.284 10.0 19.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.75 21.0 c 0.966 0.0 1.75 -0.783 1.75 -1.75 c 0.0 -0.966 -0.784 -1.75 -1.75 -1.75 S 15.0 18.284 15.0 19.25 c 0.0 0.967 0.784 1.75 1.75 1.75 Z")
        )
    }.build()
}
