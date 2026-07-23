package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EyeClosedOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EyeClosedOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.525 1.646 c 0.196 -0.195 0.513 -0.195 0.708 0.0 c 0.195 0.196 0.195 0.512 0.0 0.707 l -11.88 11.88 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.196 -0.195 -0.513 0.0 -0.708 l 1.818 -1.818 c -1.036 -0.648 -1.917 -1.51 -2.572 -2.524 l -0.01 -0.017 C 0.733 8.936 0.616 8.754 0.54 8.433 C 0.51 8.299 0.5 8.135 0.5 8.0 c 0.0 -0.135 0.01 -0.298 0.041 -0.432 c 0.075 -0.32 0.192 -0.502 0.34 -0.732 l 0.01 -0.017 C 2.374 4.523 5.007 3.0 8.0 3.0 c 1.23 0.0 2.398 0.258 3.451 0.72 l 2.074 -2.074 Z M 8.0 4.0 C 5.35 4.0 3.032 5.347 1.732 7.362 c -0.151 0.236 -0.184 0.29 -0.217 0.435 C 1.509 7.822 1.5 7.897 1.5 8.0 c 0.0 0.104 0.009 0.18 0.015 0.205 C 1.548 8.35 1.58 8.405 1.732 8.64 c 0.616 0.954 1.46 1.757 2.46 2.34 l 1.431 -1.432 C 5.314 9.106 5.135 8.573 5.135 8.0 c 0.0 -1.53 1.281 -2.77 2.863 -2.77 c 0.559 0.0 1.08 0.156 1.52 0.423 l 1.165 -1.165 C 9.85 4.175 8.947 4.0 8.0 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.224 4.77 c 0.74 0.573 1.378 1.266 1.882 2.048 l 0.011 0.016 c 0.149 0.23 0.266 0.412 0.341 0.733 c 0.031 0.134 0.041 0.297 0.041 0.432 s -0.01 0.298 -0.041 0.432 c -0.075 0.321 -0.192 0.503 -0.34 0.733 l -0.01 0.017 C 13.625 11.478 10.992 13.0 7.998 13.0 c -0.909 0.0 -1.785 -0.14 -2.605 -0.4 l 0.811 -0.812 C 6.78 11.927 7.38 12.001 8.0 12.001 c 2.65 0.0 4.968 -1.347 6.268 -3.362 c 0.151 -0.236 0.184 -0.29 0.217 -0.435 C 14.49 8.18 14.5 8.104 14.5 8.0 c 0.0 -0.104 -0.009 -0.18 -0.015 -0.204 c -0.033 -0.145 -0.066 -0.2 -0.217 -0.435 C 13.8 6.64 13.205 6.003 12.51 5.484 l 0.714 -0.714 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.754 7.24 c 0.07 0.241 0.108 0.497 0.108 0.76 c 0.0 1.53 -1.282 2.77 -2.864 2.77 c -0.238 0.0 -0.47 -0.03 -0.691 -0.082 l 3.447 -3.448 Z")
        )
    }.build()
}
