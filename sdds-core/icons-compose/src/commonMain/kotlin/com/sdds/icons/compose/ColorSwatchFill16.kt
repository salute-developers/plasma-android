package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColorSwatchFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColorSwatchFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.11 11.0 l -3.5 3.5 h 6.834 c 0.28 0.0 0.548 -0.112 0.746 -0.31 c 0.198 -0.197 0.31 -0.466 0.31 -0.746 v -3.111 c 0.0 -0.28 -0.112 -0.548 -0.31 -0.746 c -0.197 -0.198 -0.466 -0.31 -0.746 -0.31 h -1.553 L 10.11 11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.556 1.5 c -0.28 0.0 -0.548 0.112 -0.746 0.31 C 1.612 2.008 1.5 2.276 1.5 2.556 v 9.333 c 0.0 0.692 0.275 1.357 0.765 1.846 c 0.49 0.49 1.154 0.765 1.846 0.765 c 0.693 0.0 1.356 -0.275 1.846 -0.765 s 0.766 -1.154 0.766 -1.846 V 2.556 c 0.0 -0.28 -0.112 -0.549 -0.31 -0.746 C 6.215 1.612 5.947 1.5 5.667 1.5 H 2.556 Z m 1.555 9.889 c 0.276 0.0 0.5 0.224 0.5 0.5 v 0.008 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -0.008 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.878 2.872 c -0.28 0.0 -0.55 0.112 -0.747 0.31 L 8.568 3.744 L 7.721 4.7 l 0.002 7.189 l -0.002 0.087 l 5.102 -5.103 c 0.198 -0.198 0.31 -0.466 0.31 -0.746 c 0.0 -0.28 -0.112 -0.548 -0.31 -0.746 l -2.199 -2.2 c -0.198 -0.197 -0.466 -0.309 -0.746 -0.309 Z")
        )
    }.build()
}
