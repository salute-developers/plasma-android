package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EducationFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EducationFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.233 22.786 v -7.01 l 3.72 2.274 v 0.008 l 7.506 4.585 c 1.204 0.737 1.588 0.954 1.97 1.04 c 0.376 0.083 0.766 0.083 1.142 0.0 c 0.382 -0.086 0.766 -0.303 1.97 -1.04 l 7.506 -4.585 V 18.05 l 5.411 -3.306 c 0.34 -0.208 0.546 -0.583 0.542 -0.986 c -0.004 -0.403 -0.217 -0.773 -0.56 -0.974 l -12.06 -7.06 c -0.94 -0.553 -1.627 -0.955 -2.378 -1.117 c -0.66 -0.143 -1.343 -0.143 -2.004 0.0 c -0.75 0.162 -1.437 0.564 -2.379 1.116 l -12.06 7.06 C 2.215 12.987 2.0 13.364 2.0 13.77 v 9.017 c 0.0 0.628 0.5 1.137 1.116 1.137 c 0.617 0.0 1.117 -0.51 1.117 -1.137 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 28.047 20.695 l -6.484 3.961 c -0.988 0.605 -1.709 1.045 -2.502 1.222 c -0.699 0.156 -1.423 0.156 -2.122 0.0 c -0.793 -0.177 -1.514 -0.617 -2.502 -1.222 l -6.484 -3.96 v 6.318 c 0.0 0.333 0.144 0.65 0.393 0.865 C 11.029 30.208 14.449 31.5 18.0 31.5 s 6.971 -1.292 9.654 -3.62 c 0.25 -0.217 0.393 -0.533 0.393 -0.866 v -6.319 Z")
        )
    }.build()
}
