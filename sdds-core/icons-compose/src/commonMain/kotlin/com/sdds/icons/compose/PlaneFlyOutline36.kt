package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlaneFlyOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlaneFlyOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.605 5.87 C 12.287 4.395 13.412 3.0 14.923 3.0 c 1.392 0.0 2.668 0.773 3.314 2.006 l 4.832 9.226 l 5.378 -0.166 c 2.22 -0.068 4.057 1.713 4.057 3.934 c 0.0 2.22 -1.837 4.002 -4.057 3.933 l -5.376 -0.165 l -4.832 9.226 C 17.593 32.227 16.317 33.0 14.925 33.0 c -1.511 0.0 -2.636 -1.394 -2.318 -2.87 l 1.86 -8.627 l -3.918 -0.12 l -0.952 0.966 c -0.752 0.763 -1.778 1.192 -2.849 1.192 H 4.876 c -1.018 0.0 -1.683 -1.07 -1.233 -1.983 L 5.397 18.0 l -1.754 -3.558 c -0.45 -0.914 0.215 -1.983 1.233 -1.983 h 1.872 c 1.071 0.0 2.097 0.43 2.849 1.192 l 0.952 0.965 l 3.916 -0.12 l -1.86 -8.625 Z M 7.151 18.966 l -1.27 2.576 h 0.867 c 0.536 0.0 1.049 -0.215 1.425 -0.596 l 1.259 -1.277 c 0.195 -0.198 0.464 -0.306 0.742 -0.297 l 5.554 0.17 c 0.297 0.01 0.574 0.15 0.757 0.384 c 0.183 0.233 0.253 0.537 0.19 0.827 l -2.113 9.799 C 14.512 30.78 14.688 31.0 14.925 31.0 c 0.647 0.0 1.242 -0.36 1.543 -0.934 l 5.122 -9.78 c 0.178 -0.34 0.534 -0.548 0.917 -0.536 l 6.002 0.184 c 1.091 0.034 1.995 -0.842 1.995 -1.934 c 0.0 -1.093 -0.904 -1.968 -1.995 -1.935 l -6.005 0.185 c -0.383 0.012 -0.738 -0.197 -0.916 -0.536 l -5.122 -9.78 C 16.165 5.36 15.57 5.0 14.923 5.0 c -0.237 0.0 -0.413 0.218 -0.363 0.45 l 2.113 9.798 c 0.063 0.29 -0.007 0.593 -0.19 0.827 c -0.183 0.233 -0.46 0.374 -0.757 0.383 l -5.552 0.17 c -0.278 0.01 -0.548 -0.099 -0.743 -0.297 l -1.258 -1.276 c -0.376 -0.381 -0.89 -0.596 -1.425 -0.596 H 5.881 l 1.27 2.576 C 7.574 17.152 7.885 17.54 7.885 18.0 c 0.0 0.46 -0.31 0.848 -0.734 0.965 Z")
        )
    }.build()
}
