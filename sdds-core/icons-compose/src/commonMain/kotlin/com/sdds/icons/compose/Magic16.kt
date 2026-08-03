package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Magic16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Magic16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.548 2.292 c 0.222 -0.69 1.197 -0.69 1.418 0.0 l 0.558 1.732 C 7.679 4.507 8.055 4.888 8.537 5.05 l 1.695 0.57 c 0.676 0.228 0.676 1.185 0.0 1.413 l -1.695 0.57 C 8.055 7.763 7.679 8.144 7.524 8.628 l -0.558 1.732 c -0.221 0.69 -1.196 0.69 -1.418 0.0 L 4.991 8.63 C 4.835 8.145 4.459 7.764 3.978 7.602 l -1.695 -0.57 c -0.677 -0.227 -0.677 -1.184 0.0 -1.412 l 1.695 -0.57 C 4.459 4.888 4.835 4.507 4.99 4.024 l 0.557 -1.732 Z m 0.71 1.06 L 5.942 4.33 C 5.69 5.116 5.079 5.735 4.296 5.998 L 3.32 6.326 l 0.976 0.329 C 5.08 6.918 5.69 7.537 5.943 8.323 L 6.257 9.3 l 0.315 -0.977 c 0.252 -0.786 0.864 -1.405 1.646 -1.668 l 0.976 -0.329 l -0.976 -0.328 C 7.436 5.735 6.824 5.116 6.572 4.33 L 6.257 3.353 Z m 3.029 8.588 c 0.027 -0.089 0.152 -0.089 0.179 0.0 l 0.095 0.315 c 0.089 0.295 0.318 0.527 0.613 0.62 l 0.306 0.097 c 0.087 0.027 0.087 0.15 0.0 0.178 l -0.306 0.097 c -0.295 0.092 -0.524 0.325 -0.613 0.62 l -0.095 0.315 c -0.027 0.089 -0.152 0.089 -0.179 0.0 l -0.095 -0.315 c -0.09 -0.295 -0.319 -0.528 -0.613 -0.62 L 8.272 13.15 c -0.087 -0.027 -0.087 -0.15 0.0 -0.178 l 0.307 -0.097 c 0.294 -0.093 0.524 -0.325 0.613 -0.62 l 0.095 -0.315 Z m 2.65 -4.814 c -0.04 -0.133 -0.227 -0.133 -0.267 0.0 L 11.364 8.14 c -0.134 0.443 -0.478 0.792 -0.92 0.93 l -0.99 0.313 c -0.13 0.041 -0.13 0.226 0.0 0.267 l 0.99 0.312 c 0.442 0.14 0.786 0.488 0.92 0.931 l 0.306 1.014 c 0.04 0.133 0.228 0.133 0.268 0.0 l 0.305 -1.014 c 0.134 -0.443 0.478 -0.792 0.92 -0.93 l 0.99 -0.313 c 0.13 -0.041 0.13 -0.226 0.0 -0.267 l -0.99 -0.312 c -0.442 -0.14 -0.786 -0.488 -0.92 -0.931 l -0.305 -1.014 Z")
        )
    }.build()
}
