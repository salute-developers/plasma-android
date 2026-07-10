package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Sb36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Sb36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.001 6.464 H 18.0 c -2.973 0.0 -5.686 1.13 -7.735 2.985 l 0.001 0.001 c -2.332 2.112 -3.798 5.162 -3.8 8.55 c 0.0 2.973 1.132 5.688 2.986 7.736 l 0.001 -0.001 c 2.112 2.332 5.163 3.8 8.55 3.8 c 2.973 0.0 5.687 -1.133 7.735 -2.986 l -0.001 -0.002 c 2.332 -2.111 3.8 -5.162 3.8 -8.549 c 0.0 -0.102 -0.003 -0.205 -0.005 -0.307 l 3.229 -2.38 C 32.917 16.184 33.0 17.081 33.0 18.0 c 0.0 4.143 -1.68 7.893 -4.394 10.607 C 25.891 31.32 22.141 33.0 18.0 33.0 h -0.037 c -4.127 -0.01 -7.863 -1.688 -10.569 -4.394 C 4.678 25.892 3.0 22.142 3.0 18.0 c 0.0 -4.141 1.679 -7.891 4.393 -10.605 C 10.108 4.679 13.858 3.0 18.0 3.0 H 18.0 c 3.57 0.0 6.846 1.246 9.42 3.328 l -2.917 2.15 C 22.8 7.31 20.768 6.586 18.576 6.478 v 0.002 c -0.103 -0.005 -0.206 -0.01 -0.309 -0.013 c -0.088 -0.002 -0.177 -0.003 -0.266 -0.003 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.668 11.81 c -0.484 -1.067 -1.09 -2.067 -1.798 -2.982 L 18.0 17.576 l -5.71 -3.58 v 4.307 l 5.71 3.58 L 31.669 11.81 Z")
        )
    }.build()
}
