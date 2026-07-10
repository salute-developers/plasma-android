package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneDashOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneDashOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 28.446 14.066 c 2.22 -0.068 4.057 1.713 4.057 3.934 c 0.0 2.22 -1.837 4.002 -4.057 3.934 l -5.376 -0.166 l -4.832 9.226 C 17.593 32.227 16.316 33.0 14.924 33.0 c -1.51 0.0 -2.636 -1.394 -2.317 -2.871 l 0.912 -4.229 l 2.608 -2.609 l -1.565 7.26 C 14.512 30.78 14.688 31.0 14.924 31.0 c 0.648 0.0 1.242 -0.36 1.543 -0.934 l 5.122 -9.78 c 0.178 -0.34 0.534 -0.548 0.917 -0.536 l 6.002 0.185 c 1.091 0.033 1.995 -0.843 1.995 -1.935 s -0.903 -1.968 -1.995 -1.935 l -5.319 0.163 l 2.065 -2.064 l 3.192 -0.098 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.922 3.0 c 1.392 0.0 2.669 0.773 3.314 2.006 l 3.64 6.947 l 7.873 -7.873 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 30.95 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 8.096 -8.097 l -1.84 -0.056 l -0.953 0.967 c -0.752 0.762 -1.778 1.191 -2.849 1.191 H 4.875 c -1.018 0.0 -1.684 -1.07 -1.233 -1.983 L 5.396 18.0 l -1.754 -3.558 c -0.45 -0.913 0.215 -1.983 1.233 -1.983 h 1.872 c 1.07 0.0 2.097 0.43 2.849 1.191 l 0.952 0.966 l 3.916 -0.12 l -1.86 -8.625 C 12.287 4.394 13.412 3.0 14.923 3.0 Z m 0.0 2.0 c -0.236 0.0 -0.412 0.218 -0.362 0.45 l 2.112 9.798 c 0.062 0.29 -0.007 0.593 -0.19 0.827 c -0.182 0.234 -0.46 0.374 -0.756 0.383 l -5.553 0.17 c -0.278 0.01 -0.548 -0.099 -0.743 -0.297 l -1.258 -1.276 c -0.376 -0.382 -0.89 -0.596 -1.425 -0.596 H 5.88 l 1.27 2.576 C 7.573 17.152 7.884 17.54 7.884 18.0 c 0.0 0.46 -0.31 0.848 -0.734 0.965 L 5.88 21.54 h 0.867 c 0.536 0.0 1.05 -0.214 1.425 -0.596 l 1.259 -1.277 c 0.195 -0.198 0.465 -0.306 0.743 -0.298 l 4.157 0.127 l 6.063 -6.062 l -3.93 -7.501 C 16.165 5.36 15.57 5.0 14.923 5.0 Z")
        )
    }.build()
}
