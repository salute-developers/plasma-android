package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.786 5.314 c 0.449 -1.08 1.979 -1.08 2.428 0.0 l 3.178 7.64 l 8.248 0.661 c 1.166 0.094 1.639 1.549 0.75 2.31 l -6.284 5.383 l 1.92 8.048 c 0.271 1.138 -0.966 2.037 -1.965 1.427 L 18.0 26.47 l -7.061 4.314 c -0.999 0.61 -2.236 -0.29 -1.965 -1.428 l 1.92 -8.048 l -6.284 -5.383 c -0.889 -0.761 -0.416 -2.216 0.75 -2.31 l 8.248 -0.661 l 3.178 -7.64 Z M 18.0 7.603 l -2.706 6.505 c -0.19 0.455 -0.617 0.767 -1.109 0.806 l -7.023 0.563 l 5.35 4.584 c 0.375 0.32 0.539 0.824 0.424 1.304 l -1.634 6.853 l 6.012 -3.672 c 0.421 -0.258 0.95 -0.258 1.371 0.0 l 6.013 3.672 l -1.634 -6.853 c -0.115 -0.48 0.049 -0.983 0.423 -1.304 l 5.351 -4.584 l -7.023 -0.563 c -0.492 -0.04 -0.92 -0.35 -1.11 -0.806 L 18.0 7.603 Z")
        )
    }.build()
}
