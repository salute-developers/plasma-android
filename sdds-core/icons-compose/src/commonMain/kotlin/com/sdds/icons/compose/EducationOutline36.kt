package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EducationOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EducationOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.57 6.81 c -0.376 -0.08 -0.764 -0.08 -1.14 0.0 c -0.387 0.082 -0.774 0.291 -1.922 0.952 L 4.973 13.826 l 10.455 6.28 c 1.183 0.71 1.581 0.935 1.982 1.023 c 0.389 0.086 0.791 0.086 1.18 0.0 c 0.4 -0.088 0.8 -0.313 1.982 -1.023 l 10.455 -6.28 l -10.535 -6.064 c -1.148 -0.66 -1.535 -0.87 -1.922 -0.952 Z M 4.0 15.575 v 7.167 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 v -8.934 c 0.0 -0.358 0.191 -0.688 0.501 -0.867 l 12.01 -6.912 l 0.134 -0.078 c 0.959 -0.553 1.634 -0.942 2.37 -1.098 c 0.65 -0.137 1.32 -0.137 1.97 0.0 c 0.736 0.156 1.411 0.545 2.37 1.098 L 21.49 6.03 l 12.009 6.912 c 0.307 0.177 0.498 0.503 0.501 0.857 c 0.003 0.355 -0.181 0.684 -0.485 0.867 L 28.0 17.977 v 8.955 c 0.0 0.292 -0.128 0.57 -0.35 0.76 c -2.682 2.288 -6.1 3.558 -9.65 3.558 c -3.55 0.0 -6.968 -1.27 -9.65 -3.558 C 8.129 27.502 8.0 27.224 8.0 26.932 v -8.955 l -4.0 -2.402 Z m 6.0 3.604 v 7.28 c 2.265 1.799 5.081 2.791 8.0 2.791 c 2.919 0.0 5.735 -0.992 8.0 -2.79 v -7.281 l -4.398 2.641 l -0.139 0.084 c -0.987 0.593 -1.682 1.011 -2.444 1.179 c -0.671 0.147 -1.367 0.147 -2.038 0.0 c -0.762 -0.168 -1.457 -0.586 -2.444 -1.18 l -0.139 -0.083 L 10.0 19.18 Z")
        )
    }.build()
}
