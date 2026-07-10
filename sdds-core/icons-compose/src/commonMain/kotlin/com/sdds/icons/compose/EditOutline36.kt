package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EditOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EditOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.454 4.545 c -2.06 -2.06 -5.399 -2.06 -7.459 0.0 L 6.09 22.45 c -0.724 0.724 -1.233 1.635 -1.47 2.631 l -1.592 6.685 c -0.08 0.338 0.02 0.694 0.266 0.94 c 0.245 0.245 0.6 0.345 0.939 0.265 l 6.685 -1.592 c 0.996 -0.237 1.907 -0.746 2.63 -1.47 l 17.907 -17.906 c 2.06 -2.06 2.06 -5.4 0.0 -7.46 Z M 25.41 5.959 c 1.278 -1.279 3.351 -1.279 4.63 0.0 s 1.279 3.352 0.0 4.63 l -1.136 1.136 c -0.427 -1.031 -1.055 -1.976 -1.854 -2.775 c -0.8 -0.8 -1.745 -1.428 -2.776 -1.855 l 1.136 -1.136 Z m 0.226 4.405 c 0.816 0.816 1.398 1.829 1.695 2.934 L 12.134 28.496 c -0.463 0.462 -1.044 0.787 -1.68 0.939 L 10.05 29.53 c -0.61 -1.656 -1.926 -2.971 -3.581 -3.582 l 0.096 -0.404 c 0.151 -0.636 0.476 -1.217 0.938 -1.68 L 22.701 8.668 c 1.105 0.297 2.119 0.88 2.935 1.696 Z")
        )
    }.build()
}
