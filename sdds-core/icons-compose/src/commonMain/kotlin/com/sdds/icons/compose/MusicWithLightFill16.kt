package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicWithLightFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicWithLightFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.825 1.348 c -0.04 -0.13 -0.226 -0.13 -0.267 0.0 L 8.41 1.82 C 8.27 2.263 7.923 2.608 7.48 2.742 L 6.997 2.888 c -0.133 0.04 -0.133 0.228 0.0 0.268 L 7.48 3.303 c 0.443 0.134 0.791 0.479 0.93 0.92 l 0.148 0.474 c 0.041 0.13 0.226 0.13 0.267 0.0 l 0.149 -0.474 c 0.139 -0.441 0.487 -0.786 0.93 -0.92 l 0.483 -0.147 c 0.132 -0.04 0.132 -0.227 0.0 -0.268 L 9.904 2.742 c -0.443 -0.134 -0.791 -0.479 -0.93 -0.92 L 8.825 1.347 Z M 3.54 4.918 c 0.053 -0.16 0.279 -0.16 0.332 0.0 l 0.203 0.606 c 0.211 0.632 0.71 1.126 1.345 1.331 l 0.62 0.2 c 0.162 0.053 0.162 0.282 0.0 0.334 l -0.62 0.2 c -0.634 0.205 -1.134 0.7 -1.345 1.332 L 3.87 9.527 c -0.053 0.159 -0.279 0.159 -0.332 0.0 L 3.336 8.92 c -0.211 -0.632 -0.71 -1.127 -1.345 -1.332 l -0.62 -0.2 c -0.162 -0.052 -0.162 -0.28 0.0 -0.333 l 0.62 -0.2 c 0.634 -0.206 1.134 -0.7 1.345 -1.332 L 3.54 4.918 Z m 9.875 0.39 c 0.677 -0.17 1.336 0.331 1.336 1.017 v 6.376 l 0.003 0.099 c 0.0 0.828 -0.683 1.5 -1.527 1.5 c -0.843 0.0 -1.526 -0.672 -1.526 -1.5 c 0.0 -0.829 0.683 -1.5 1.527 -1.5 c 0.158 0.0 0.31 0.023 0.454 0.067 V 8.425 L 9.23 9.555 v 3.68 c 0.015 0.087 0.023 0.175 0.023 0.265 c 0.0 0.828 -0.683 1.5 -1.526 1.5 s -1.527 -0.672 -1.527 -1.5 S 6.883 12.0 7.726 12.0 c 0.15 0.0 0.296 0.021 0.434 0.062 V 7.454 c 0.0 -0.478 0.33 -0.897 0.802 -1.016 l 4.452 -1.13 Z")
        )
    }.build()
}
