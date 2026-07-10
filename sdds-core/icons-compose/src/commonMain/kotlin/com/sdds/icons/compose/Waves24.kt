package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Waves24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Waves24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.662 2.278 c 0.293 -0.293 0.768 -0.293 1.06 0.0 C 15.0 3.555 16.013 5.071 16.704 6.74 c 0.691 1.668 1.047 3.456 1.047 5.262 c 0.0 1.806 -0.356 3.594 -1.047 5.262 c -0.69 1.668 -1.704 3.184 -2.98 4.46 c -0.293 0.294 -0.768 0.294 -1.061 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 c 1.137 -1.137 2.04 -2.488 2.655 -3.974 c 0.616 -1.486 0.933 -3.08 0.933 -4.688 c 0.0 -1.609 -0.317 -3.202 -0.932 -4.688 c -0.616 -1.486 -1.518 -2.837 -2.656 -3.974 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.717 8.97 c 0.328 -0.251 0.8 -0.19 1.051 0.14 C 8.405 9.938 8.75 10.954 8.75 12.0 s -0.345 2.062 -0.982 2.892 c -0.252 0.328 -0.723 0.39 -1.051 0.138 c -0.329 -0.252 -0.39 -0.723 -0.139 -1.052 c 0.436 -0.567 0.672 -1.263 0.672 -1.978 c 0.0 -0.715 -0.236 -1.41 -0.672 -1.978 c -0.252 -0.33 -0.19 -0.8 0.139 -1.052 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.364 5.637 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 c -0.294 0.293 -0.294 0.768 0.0 1.06 c 0.696 0.697 1.248 1.524 1.625 2.434 c 0.377 0.91 0.571 1.885 0.571 2.87 c 0.0 0.985 -0.194 1.96 -0.57 2.87 c -0.378 0.91 -0.93 1.737 -1.627 2.433 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.294 0.768 0.294 1.06 0.0 c 0.837 -0.835 1.5 -1.827 1.952 -2.919 C 12.767 14.353 13.0 13.183 13.0 12.001 s -0.233 -2.352 -0.685 -3.444 c -0.452 -1.092 -1.115 -2.084 -1.951 -2.92 Z")
        )
    }.build()
}
