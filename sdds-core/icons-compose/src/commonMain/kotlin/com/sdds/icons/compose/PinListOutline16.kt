package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinListOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinListOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.971 3.329 l -2.01 2.578 C 6.663 6.292 6.248 6.568 5.779 6.695 L 3.414 7.333 c -0.148 0.04 -0.197 0.226 -0.089 0.336 l 3.718 3.74 c 0.109 0.11 0.294 0.06 0.334 -0.09 L 8.01 8.943 c 0.126 -0.472 0.4 -0.89 0.783 -1.192 l 2.563 -2.021 l -2.386 -2.4 Z m -0.68 -0.753 C 8.604 2.174 9.197 2.138 9.557 2.5 l 2.624 2.64 c 0.36 0.362 0.324 0.959 -0.076 1.274 L 9.409 8.54 c -0.213 0.167 -0.365 0.4 -0.435 0.662 L 8.34 11.58 c -0.239 0.894 -1.35 1.194 -2.002 0.539 l -1.364 -1.373 L 2.236 13.5 L 1.0 13.748 l 0.248 -1.243 l 2.737 -2.754 L 2.62 8.378 C 1.97 7.723 2.267 6.604 3.156 6.364 l 2.363 -0.638 C 5.78 5.656 6.011 5.502 6.177 5.29 l 2.114 -2.713 Z m 2.015 9.736 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 h 4.02 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -4.02 Z m 2.472 -7.94 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 H 14.5 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -1.223 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 Z m -0.899 3.72 c -0.276 0.0 -0.5 0.224 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 h 2.622 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -2.622 Z")
        )
    }.build()
}
