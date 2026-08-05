package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WavesCross24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WavesCross24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.409 3.643 c 0.328 -0.252 0.799 -0.19 1.051 0.139 c 1.81 2.357 2.79 5.246 2.79 8.218 c 0.0 2.972 -0.98 5.86 -2.79 8.218 c -0.252 0.329 -0.723 0.39 -1.051 0.139 c -0.329 -0.252 -0.391 -0.723 -0.139 -1.052 c 1.608 -2.096 2.48 -4.663 2.48 -7.305 c 0.0 -2.642 -0.872 -5.21 -2.48 -7.305 c -0.252 -0.329 -0.19 -0.8 0.139 -1.052 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.53 8.47 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 L 16.94 12.0 l -2.47 2.47 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.292 0.293 0.767 0.293 1.06 0.0 L 18.0 13.06 l 2.47 2.47 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.292 0.293 -0.767 0.0 -1.06 L 19.06 12.0 l 2.47 -2.47 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 L 18.0 10.94 l -2.47 -2.47 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.114 9.625 C 3.906 9.266 3.448 9.143 3.089 9.351 c -0.359 0.207 -0.482 0.665 -0.275 1.024 C 3.1 10.869 3.25 11.43 3.25 12.0 c 0.0 0.57 -0.15 1.131 -0.436 1.625 c -0.207 0.359 -0.084 0.817 0.275 1.024 c 0.359 0.208 0.817 0.085 1.025 -0.274 C 4.53 13.653 4.75 12.834 4.75 12.0 c 0.0 -0.834 -0.22 -1.653 -0.636 -2.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.14 6.521 c -0.252 -0.328 -0.723 -0.39 -1.052 -0.138 C 5.76 6.635 5.698 7.106 5.95 7.434 C 6.955 8.744 7.5 10.35 7.5 12.0 c 0.0 1.651 -0.545 3.256 -1.55 4.566 c -0.252 0.328 -0.19 0.8 0.138 1.051 c 0.33 0.252 0.8 0.19 1.052 -0.138 C 8.346 15.907 9.0 13.98 9.0 12.0 c 0.0 -1.981 -0.654 -3.907 -1.86 -5.479 Z")
        )
    }.build()
}
