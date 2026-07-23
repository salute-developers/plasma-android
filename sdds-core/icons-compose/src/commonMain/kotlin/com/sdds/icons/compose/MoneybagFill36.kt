package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MoneybagFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MoneybagFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.675 4.5 c -0.408 0.0 -0.783 0.223 -0.98 0.582 C 7.498 5.441 7.51 5.879 7.729 6.226 l 3.235 5.149 h 14.072 l 3.235 -5.15 c 0.218 -0.346 0.231 -0.784 0.034 -1.143 S 27.733 4.5 27.325 4.5 H 8.675 Z m 17.661 8.875 H 9.664 c -2.202 1.672 -3.844 4.084 -4.538 6.931 L 5.0 20.823 C 3.677 26.257 7.77 31.5 13.333 31.5 h 9.334 c 5.564 0.0 9.656 -5.243 8.333 -10.677 l -0.126 -0.517 c -0.694 -2.847 -2.336 -5.259 -4.538 -6.931 Z")
        )
    }.build()
}
