package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RuTubeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RuTubeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.178 14.227 c 0.466 0.0 0.79 0.08 0.953 0.222 c 0.162 0.142 0.262 0.405 0.263 0.79 v 1.133 c 0.0 0.405 -0.1 0.668 -0.263 0.81 c -0.163 0.142 -0.487 0.2 -0.953 0.2 H 13.2 v -3.155 h 7.977 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.16 4.5 c 3.501 0.0 6.34 2.839 6.34 6.34 v 14.32 c 0.0 3.501 -2.839 6.34 -6.34 6.34 H 10.84 c -0.437 0.0 -0.865 -0.044 -1.277 -0.129 C 6.672 30.78 4.5 28.223 4.5 25.16 V 10.841 c 0.0 -0.219 0.012 -0.435 0.033 -0.649 C 4.858 6.995 7.558 4.5 10.841 4.5 h 14.318 Z M 9.817 24.749 h 3.383 v -4.392 h 6.235 l 2.958 4.392 h 3.788 l -3.261 -4.412 c 1.202 -0.178 1.742 -0.547 2.187 -1.154 c 0.446 -0.608 0.668 -1.579 0.668 -2.874 v -1.013 c 0.0 -0.768 -0.08 -1.375 -0.222 -1.84 c -0.142 -0.466 -0.385 -0.872 -0.73 -1.235 c -0.364 -0.345 -0.77 -0.587 -1.256 -0.75 c -0.486 -0.141 -1.094 -0.221 -1.842 -0.221 H 9.818 v 13.499 Z M 18.148 6.5 c 0.172 1.161 0.492 2.274 0.94 3.32 l 2.637 -0.002 c 0.846 0.0 1.595 0.092 2.244 0.28 c 0.68 0.228 1.32 0.594 1.839 1.084 c 0.486 0.512 0.904 1.164 1.115 1.856 c 0.196 0.642 0.285 1.4 0.285 2.26 v 1.012 c 0.0 0.33 -0.013 0.658 -0.042 0.98 c 0.75 0.253 1.53 0.443 2.334 0.563 V 10.84 c 0.0 -2.397 -1.944 -4.34 -4.34 -4.341 h -7.012 Z")
        )
    }.build()
}
