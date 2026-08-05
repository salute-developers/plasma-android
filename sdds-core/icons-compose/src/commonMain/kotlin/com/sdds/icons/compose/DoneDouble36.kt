package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoneDouble36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoneDouble36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.263 9.284 c 0.395 0.386 0.402 1.02 0.017 1.414 l -15.616 16.0 C 11.476 26.892 11.218 27.0 10.95 27.0 c -0.27 0.0 -0.528 -0.109 -0.716 -0.302 l -5.949 -6.095 C 3.9 20.208 3.906 19.575 4.302 19.19 c 0.395 -0.386 1.028 -0.378 1.414 0.017 l 5.233 5.362 l 14.9 -15.266 c 0.385 -0.396 1.018 -0.403 1.414 -0.018 Z m 7.436 0.0 c 0.395 0.386 0.402 1.02 0.017 1.414 l -15.616 16.0 c -0.386 0.396 -1.019 0.403 -1.414 0.018 c -0.395 -0.386 -0.403 -1.02 -0.017 -1.415 l 15.615 -16.0 C 33.67 8.907 34.304 8.9 34.7 9.285 Z")
        )
    }.build()
}
