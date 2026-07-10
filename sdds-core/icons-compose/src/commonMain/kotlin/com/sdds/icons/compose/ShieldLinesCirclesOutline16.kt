package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShieldLinesCirclesOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShieldLinesCirclesOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 2.063 c -0.396 0.254 -1.173 0.73 -2.1 1.172 c -0.935 0.445 -2.072 0.88 -3.145 0.992 c 0.028 1.47 0.19 2.72 0.441 3.78 l 4.637 -2.714 C 7.828 5.25 7.826 5.207 7.826 5.163 c 0.0 -0.68 0.546 -1.233 1.22 -1.233 c 0.674 0.0 1.22 0.552 1.22 1.233 S 9.72 6.396 9.046 6.396 c -0.268 0.0 -0.515 -0.087 -0.717 -0.235 L 3.473 9.003 c 0.51 1.579 1.226 2.655 1.927 3.389 c 1.142 1.195 2.294 1.527 2.6 1.598 c 0.306 -0.07 1.458 -0.403 2.6 -1.598 c 0.848 -0.887 1.716 -2.276 2.218 -4.445 l -4.65 2.722 c 0.004 0.043 0.007 0.087 0.007 0.131 c 0.0 0.681 -0.547 1.233 -1.22 1.233 c -0.674 0.0 -1.22 -0.552 -1.22 -1.233 c 0.0 -0.68 0.546 -1.233 1.22 -1.233 c 0.267 0.0 0.514 0.087 0.715 0.234 l 5.389 -3.154 c 0.104 -0.731 0.17 -1.536 0.187 -2.42 c -1.073 -0.111 -2.21 -0.547 -3.145 -0.992 C 9.173 2.793 8.396 2.317 8.0 2.063 Z m -0.375 -0.95 c 0.228 -0.15 0.522 -0.15 0.75 0.0 c 0.274 0.182 1.117 0.724 2.156 1.219 c 1.053 0.502 2.24 0.922 3.22 0.922 c 0.276 0.0 0.5 0.224 0.5 0.5 c 0.0 4.934 -1.413 7.744 -2.928 9.329 c -1.507 1.576 -3.057 1.879 -3.232 1.909 H 8.09 H 8.087 l -0.014 0.002 C 8.059 14.996 8.033 15.0 8.0 15.0 c -0.032 0.0 -0.058 -0.003 -0.072 -0.005 l -0.014 -0.002 H 7.91 H 7.909 c -0.175 -0.03 -1.725 -0.333 -3.232 -1.91 C 3.162 11.499 1.75 8.689 1.75 3.755 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 c 0.98 0.0 2.166 -0.42 3.22 -0.922 C 6.507 1.837 7.35 1.295 7.624 1.114 Z")
        )
    }.build()
}
