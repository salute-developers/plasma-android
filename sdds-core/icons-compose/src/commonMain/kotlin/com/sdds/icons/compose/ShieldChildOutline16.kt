package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldChildOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldChildOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.9 3.235 C 6.827 2.793 7.604 2.317 8.0 2.063 c 0.396 0.254 1.173 0.73 2.1 1.172 c 0.935 0.445 2.073 0.88 3.146 0.992 c -0.087 4.431 -1.389 6.85 -2.646 8.165 c -1.142 1.195 -2.294 1.527 -2.6 1.598 c -0.306 -0.07 -1.458 -0.403 -2.6 -1.598 c -1.257 -1.315 -2.559 -3.734 -2.645 -8.165 C 3.828 4.116 4.965 3.68 5.9 3.235 Z m 2.476 -2.121 c -0.229 -0.152 -0.523 -0.152 -0.751 0.0 C 7.35 1.295 6.508 1.837 5.469 2.332 C 4.416 2.834 3.23 3.254 2.25 3.254 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 4.934 1.412 7.744 2.927 9.329 c 1.507 1.576 3.057 1.879 3.232 1.909 h 0.002 h 0.003 l 0.014 0.002 C 7.942 14.996 7.968 15.0 8.0 15.0 c 0.033 0.0 0.059 -0.003 0.073 -0.005 l 0.014 -0.002 H 8.09 H 8.09 c 0.175 -0.03 1.725 -0.333 3.232 -1.91 c 1.515 -1.584 2.927 -4.394 2.927 -9.328 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 c -0.979 0.0 -2.166 -0.42 -3.22 -0.922 C 9.493 1.837 8.65 1.295 8.377 1.114 Z m -1.46 3.412 c 0.0 -0.605 0.486 -1.095 1.084 -1.095 c 0.599 0.0 1.084 0.49 1.084 1.095 S 8.599 5.622 8.0 5.622 c -0.598 0.0 -1.083 -0.49 -1.083 -1.096 Z m 0.024 1.86 C 7.113 6.189 7.364 6.06 7.647 6.06 h 0.706 c 0.284 0.0 0.534 0.128 0.708 0.327 l 1.823 1.702 c 0.189 0.177 0.2 0.476 0.026 0.667 c -0.175 0.191 -0.47 0.203 -0.66 0.026 L 9.797 8.36 C 9.607 8.182 9.3 8.318 9.3 8.579 v 0.655 l 0.177 2.595 c 0.022 0.316 -0.226 0.584 -0.539 0.584 c -0.284 0.0 -0.52 -0.222 -0.539 -0.509 l -0.111 -1.63 c -0.01 -0.152 -0.136 -0.27 -0.288 -0.27 c -0.151 0.0 -0.277 0.118 -0.287 0.27 l -0.111 1.63 c -0.02 0.287 -0.255 0.51 -0.54 0.51 c -0.313 0.0 -0.56 -0.269 -0.539 -0.585 L 6.7 9.237 V 8.578 c 0.0 -0.26 -0.307 -0.396 -0.496 -0.22 L 5.75 8.783 C 5.56 8.96 5.265 8.947 5.091 8.756 C 4.916 8.565 4.928 8.266 5.116 8.09 L 6.94 6.387 Z")
        )
    }.build()
}
