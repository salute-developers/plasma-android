package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ProfileUnpinFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ProfileUnpinFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.489 20.372 C 2.196 20.666 2.2 21.136 2.5 21.421 c 0.3 0.284 0.78 0.276 1.074 -0.018 L 21.42 3.498 c 0.293 -0.294 0.288 -0.763 -0.011 -1.047 c -0.3 -0.285 -0.78 -0.277 -1.074 0.017 l -4.517 4.53 L 15.25 7.0 c -0.569 0.0 -1.003 0.517 -0.913 1.087 l 0.054 0.345 l -3.905 3.917 c -0.622 -0.114 -1.262 -0.176 -1.916 -0.176 c -2.143 0.0 -4.14 0.639 -5.807 1.734 c -0.639 0.42 -0.96 1.133 -0.96 1.834 c 0.0 1.274 1.034 2.306 2.307 2.307 h 0.696 L 2.49 20.372 Z m 10.57 -5.731 c -0.649 0.863 -0.041 2.108 1.03 2.109 h 2.644 v 4.124 L 17.564 22.0 l 0.838 -1.125 V 16.75 h 2.637 c 1.072 0.0 1.681 -1.245 1.031 -2.109 l -1.575 -2.093 c -0.215 -0.286 -0.305 -0.648 -0.249 -1.003 l 0.547 -3.46 C 20.883 7.521 20.456 7.01 19.895 7.0 l -5.025 5.02 c -0.039 0.189 -0.117 0.37 -0.235 0.527 l -1.575 2.094 Z M 4.722 7.636 c 0.0 2.125 1.724 3.848 3.85 3.848 c 2.125 0.0 3.848 -1.723 3.848 -3.848 c 0.0 -2.126 -1.723 -3.85 -3.849 -3.85 c -2.125 0.0 -3.849 1.724 -3.85 3.85 Z m 8.308 10.41 c 0.213 0.0 0.42 -0.031 0.616 -0.085 c -1.306 -0.222 -2.14 -1.401 -2.1 -2.619 l -2.707 2.705 h 4.19 Z")
        )
    }.build()
}
