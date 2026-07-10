package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TagBadgeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TagBadgeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.05 3.0 c -0.967 0.0 -1.893 0.386 -2.574 1.072 L 5.16 17.494 c -1.547 1.56 -1.547 4.075 0.0 5.634 l 7.629 7.69 c 1.565 1.576 4.115 1.576 5.68 0.0 L 31.947 17.23 c 0.673 -0.68 1.051 -1.597 1.051 -2.553 V 6.625 C 33.0 4.623 31.376 3.0 29.374 3.0 H 21.05 Z m -1.154 2.48 C 20.201 5.173 20.616 5.0 21.05 5.0 h 8.324 C 30.272 5.0 31.0 5.728 31.0 6.625 v 8.053 c 0.0 0.428 -0.17 0.84 -0.471 1.144 L 17.048 29.41 c -0.782 0.788 -2.057 0.788 -2.84 0.0 l -7.628 -7.69 c -0.773 -0.78 -0.773 -2.037 0.0 -2.817 L 19.896 5.48 Z m 5.703 7.244 c 1.247 0.0 2.258 -1.02 2.258 -2.276 c 0.0 -1.257 -1.011 -2.276 -2.258 -2.276 S 23.34 9.19 23.34 10.448 s 1.01 2.276 2.258 2.276 Z")
        )
    }.build()
}
