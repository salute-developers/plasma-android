package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarRecommendOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarRecommendOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.717 5.888 c -0.485 -1.184 -2.162 -1.184 -2.646 0.0 l -2.92 7.136 l -7.586 0.619 c -1.26 0.103 -1.776 1.672 -0.822 2.503 l 5.796 5.048 l -1.77 7.543 c -0.29 1.24 1.064 2.213 2.146 1.54 l 7.006 -4.35 c 0.47 -0.291 0.614 -0.908 0.322 -1.377 c -0.291 -0.47 -0.908 -0.613 -1.377 -0.322 l -5.835 3.623 l 1.534 -6.535 c 0.121 -0.516 -0.053 -1.057 -0.453 -1.405 l -5.035 -4.385 l 6.586 -0.537 c 0.536 -0.043 1.003 -0.385 1.207 -0.883 l 2.524 -6.17 l 2.624 6.414 c 0.209 0.511 0.793 0.756 1.304 0.547 c 0.511 -0.21 0.756 -0.793 0.547 -1.304 l -3.152 -7.705 Z m 7.374 7.956 c -0.385 -1.206 -2.091 -1.206 -2.477 0.0 l -1.5 4.695 h -4.859 c -1.254 0.0 -1.781 1.6 -0.772 2.345 l 3.949 2.917 l -1.508 4.718 c -0.384 1.202 0.996 2.191 2.01 1.442 l 3.919 -2.894 l 3.917 2.894 c 1.015 0.749 2.395 -0.24 2.011 -1.442 l -1.508 -4.718 l 3.95 -2.917 c 1.008 -0.745 0.481 -2.345 -0.773 -2.345 h -4.859 l -1.5 -4.695 Z m -2.228 5.79 l 0.99 -3.095 l 0.989 3.095 c 0.172 0.54 0.673 0.905 1.238 0.905 h 3.244 l -2.643 1.952 c -0.448 0.33 -0.635 0.91 -0.466 1.441 l 1.002 3.133 l -2.592 -1.914 c -0.46 -0.34 -1.086 -0.34 -1.545 0.0 l -2.592 1.914 l 1.002 -3.133 c 0.17 -0.53 -0.018 -1.11 -0.466 -1.441 l -2.643 -1.952 h 3.244 c 0.566 0.0 1.066 -0.366 1.238 -0.905 Z")
        )
    }.build()
}
