package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandActionDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandActionDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.44 2.47 c 0.293 -0.293 0.768 -0.293 1.06 0.0 c 0.294 0.293 0.294 0.767 0.0 1.06 L 3.53 20.5 c -0.293 0.294 -0.768 0.294 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 l 4.225 -4.226 l -1.431 -1.535 c -0.377 -0.404 -0.354 -1.037 0.05 -1.413 c 0.403 -0.377 1.036 -0.355 1.412 0.048 L 8.11 13.8 l 0.354 -0.354 l -3.588 -3.848 C 4.5 9.193 4.52 8.56 4.925 8.184 c 0.404 -0.377 1.037 -0.355 1.414 0.048 l 3.54 3.797 l 0.354 -0.353 L 5.34 6.429 C 4.964 6.025 4.986 5.392 5.39 5.016 c 0.403 -0.377 1.036 -0.354 1.413 0.05 l 4.603 4.936 c 0.094 0.1 0.253 0.106 0.354 0.013 c 0.1 -0.094 0.106 -0.253 0.012 -0.354 l -3.58 -3.84 c -0.377 -0.404 -0.355 -1.036 0.05 -1.413 c 0.403 -0.376 1.036 -0.355 1.412 0.049 l 3.763 4.035 L 14.6 7.308 c -0.048 -0.168 -0.103 -0.351 -0.169 -0.558 c -0.125 -0.395 0.092 -0.785 0.45 -1.005 c 0.024 -0.012 0.048 -0.024 0.072 -0.034 c 0.37 -0.158 0.783 -0.073 1.063 0.18 L 19.44 2.47 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.514 11.533 c 1.24 2.923 -0.124 6.3 -3.047 7.54 c -2.278 0.967 -4.83 0.352 -6.434 -1.35 l -0.018 -0.022 l -0.272 -0.292 l 6.724 -6.722 c 0.083 0.071 0.204 0.082 0.298 0.02 c 0.102 -0.065 0.141 -0.194 0.094 -0.306 l -0.032 -0.076 L 17.352 8.8 l 1.162 2.733 Z")
        )
    }.build()
}
