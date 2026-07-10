package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxTimeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxTimeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.884 6.328 c 0.205 0.205 0.206 0.537 0.002 0.743 l -1.618 1.624 c -0.136 0.143 -0.342 0.198 -0.531 0.142 c -0.043 -0.013 -0.084 -0.031 -0.123 -0.055 L 7.998 7.855 C 7.747 7.711 7.66 7.39 7.804 7.14 C 7.95 6.887 8.27 6.8 8.521 6.945 l 1.278 0.733 l 1.343 -1.349 c 0.204 -0.205 0.537 -0.206 0.742 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.914 13.468 c -1.627 0.0 -2.557 -2.102 -1.395 -3.735 L 6.06 3.775 C 6.259 3.518 6.493 3.29 6.764 3.1 C 7.342 2.694 8.019 2.5 8.734 2.5 c 1.705 -0.002 3.624 1.09 4.93 2.99 c 1.853 2.697 1.768 5.999 -0.19 7.376 c -0.503 0.354 -1.082 0.546 -1.695 0.59 c -0.088 0.007 -0.176 0.01 -0.265 0.01 l -8.6 0.002 Z m 8.596 -1.051 h 0.002 c 0.519 -0.002 0.977 -0.142 1.358 -0.41 c 0.64 -0.45 1.05 -1.267 1.079 -2.361 c 0.027 -1.092 -0.337 -2.377 -1.15 -3.561 c -0.814 -1.184 -1.876 -1.974 -2.89 -2.325 c -0.413 -0.143 -0.805 -0.21 -1.168 -0.21 c -0.529 0.0 -0.996 0.144 -1.373 0.41 C 7.186 4.088 7.027 4.24 6.89 4.417 L 6.888 4.42 L 6.873 4.44 C 6.027 5.563 6.007 7.797 7.44 9.882 c 1.156 1.683 2.774 2.53 4.05 2.535 h 0.02 Z")
        )
    }.build()
}
