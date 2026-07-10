package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BitbucketOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BitbucketOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.115 4.5 c 0.463 0.0 0.816 0.416 0.74 0.873 l -4.25 25.5 l -0.034 0.13 c -0.105 0.294 -0.386 0.497 -0.706 0.497 H 8.136 l -0.134 -0.012 c -0.307 -0.055 -0.553 -0.299 -0.606 -0.615 l -4.25 -25.5 C 3.075 4.945 3.38 4.553 3.8 4.505 L 3.886 4.5 h 28.229 Z m -22.92 25.0 h 17.611 L 29.39 14.0 h -5.64 l -1.167 9.343 C 22.536 23.718 22.217 24.0 21.839 24.0 h -7.676 l -0.139 -0.013 c -0.27 -0.05 -0.491 -0.246 -0.575 -0.507 l -0.03 -0.137 l -1.313 -10.5 c -0.052 -0.42 0.251 -0.793 0.661 -0.838 L 12.85 12.0 h 16.873 l 0.917 -5.5 H 5.36 l 3.835 23.0 Z m 6.071 -7.5 h 5.469 l 1.0 -8.0 h -7.469 l 1.0 8.0 Z")
        )
    }.build()
}
