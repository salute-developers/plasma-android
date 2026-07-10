package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarRecommendFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarRecommendFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.292 3.919 c 0.352 -0.691 1.34 -0.691 1.692 0.0 l 2.314 4.533 l 0.08 0.013 c -0.06 0.084 -0.114 0.175 -0.163 0.271 l -1.127 2.207 l -2.447 0.39 c -1.697 0.27 -2.373 2.35 -1.158 3.566 l 1.75 1.753 l -0.253 1.605 l -4.378 2.228 c -0.692 0.351 -1.49 -0.229 -1.37 -0.995 l 0.793 -5.028 l -3.596 -3.601 c -0.548 -0.549 -0.243 -1.488 0.523 -1.61 l 5.026 -0.799 l 2.314 -4.533 Z m 5.274 5.472 c 0.076 -0.134 0.192 -0.224 0.321 -0.269 c 0.268 -0.093 0.593 0.006 0.741 0.296 l 1.473 2.887 l 3.201 0.509 c 0.488 0.078 0.682 0.675 0.333 1.025 l -2.29 2.293 l 0.505 3.201 c 0.077 0.488 -0.432 0.857 -0.872 0.634 l -2.889 -1.47 l -2.888 1.47 c -0.44 0.223 -0.949 -0.146 -0.872 -0.634 l 0.505 -3.201 l -2.29 -2.293 c -0.044 -0.044 -0.079 -0.091 -0.106 -0.141 c -0.19 -0.35 0.012 -0.816 0.439 -0.884 l 3.2 -0.51 l 1.474 -2.886 l 0.014 -0.027 Z")
        )
    }.build()
}
