package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Power24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Power24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 2.75 C 12.75 2.336 12.414 2.0 12.0 2.0 s -0.75 0.336 -0.75 0.75 v 7.5 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -7.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.5 5.206 c -0.359 -0.207 -0.817 -0.084 -1.024 0.274 c -0.208 0.359 -0.085 0.818 0.274 1.025 c 1.43 0.825 2.547 2.1 3.18 3.625 c 0.63 1.525 0.742 3.216 0.314 4.811 c -0.427 1.595 -1.369 3.004 -2.678 4.01 C 15.256 19.954 13.65 20.5 12.0 20.5 c -1.651 0.0 -3.256 -0.545 -4.566 -1.55 s -2.251 -2.414 -2.678 -4.009 c -0.428 -1.595 -0.317 -3.286 0.315 -4.811 s 1.75 -2.8 3.179 -3.625 C 8.609 6.298 8.732 5.839 8.525 5.48 C 8.317 5.122 7.859 5.0 7.5 5.206 c -1.716 0.99 -3.057 2.52 -3.815 4.35 c -0.758 1.83 -0.891 3.86 -0.378 5.773 c 0.512 1.914 1.642 3.605 3.214 4.811 S 10.02 22.0 12.0 22.0 c 1.981 0.0 3.907 -0.654 5.479 -1.86 s 2.702 -2.897 3.214 -4.81 c 0.513 -1.914 0.38 -3.944 -0.378 -5.774 s -2.1 -3.36 -3.815 -4.35 Z")
        )
    }.build()
}
