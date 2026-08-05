package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PaletteOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PaletteOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.75 15.75 c 0.828 0.0 1.5 0.672 1.5 1.5 c 0.0 0.829 -0.672 1.5 -1.5 1.5 c -0.829 0.0 -1.5 -0.672 -1.5 -1.5 s 0.671 -1.5 1.5 -1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.5 12.0 C 7.328 12.0 8.0 12.672 8.0 13.5 C 8.0 14.33 7.328 15.0 6.5 15.0 C 5.67 15.0 5.0 14.33 5.0 13.5 C 5.0 12.672 5.67 12.0 6.5 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.0 8.0 c 0.828 0.0 1.5 0.672 1.5 1.5 c 0.0 0.829 -0.672 1.5 -1.5 1.5 c -0.829 0.0 -1.5 -0.671 -1.5 -1.5 C 15.5 8.672 16.17 8.0 17.0 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.5 7.0 C 8.328 7.0 9.0 7.672 9.0 8.5 C 9.0 9.33 8.328 10.0 7.5 10.0 C 6.67 10.0 6.0 9.328 6.0 8.5 S 6.67 7.0 7.5 7.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.5 5.0 C 13.327 5.0 14.0 5.672 14.0 6.5 C 14.0 7.33 13.327 8.0 12.5 8.0 C 11.67 8.0 11.0 7.328 11.0 6.5 S 11.67 5.0 12.5 5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.918 1.755 c 3.245 -0.36 6.093 0.871 8.055 2.723 c 1.934 1.825 3.09 4.338 2.815 6.633 c -0.017 0.401 -0.174 1.15 -0.497 1.891 c -0.34 0.785 -0.935 1.725 -1.915 2.215 c -1.164 0.582 -2.312 0.582 -3.109 0.64 c -0.835 0.06 -1.276 0.174 -1.626 0.64 c -0.146 0.194 -0.193 0.402 -0.174 0.678 c 0.022 0.313 0.12 0.636 0.242 1.073 c 0.106 0.386 0.243 0.904 0.19 1.42 c -0.058 0.584 -0.35 1.107 -0.942 1.502 c -0.94 0.626 -2.16 0.818 -3.4 0.702 c -1.25 -0.116 -2.588 -0.55 -3.83 -1.26 c -2.483 -1.418 -4.679 -4.002 -4.975 -7.55 C 1.26 7.149 5.554 2.353 10.918 1.756 Z m 7.026 3.815 c -1.683 -1.588 -4.106 -2.63 -6.86 -2.324 c -4.578 0.509 -8.26 4.608 -7.836 9.693 c 0.246 2.951 2.07 5.141 4.222 6.37 c 1.076 0.615 2.21 0.974 3.226 1.07 c 1.026 0.095 1.867 -0.083 2.428 -0.457 c 0.23 -0.153 0.27 -0.279 0.284 -0.405 c 0.02 -0.197 -0.031 -0.455 -0.146 -0.87 c -0.1 -0.362 -0.255 -0.865 -0.29 -1.366 c -0.039 -0.536 0.053 -1.13 0.469 -1.684 c 0.775 -1.034 1.834 -1.172 2.718 -1.236 c 0.921 -0.067 1.711 -0.068 2.547 -0.486 c 0.52 -0.26 0.926 -0.82 1.21 -1.472 c 0.284 -0.654 0.374 -1.238 0.375 -1.357 V 11.0 l 0.005 -0.047 c 0.213 -1.697 -0.65 -3.777 -2.352 -5.383 Z")
        )
    }.build()
}
