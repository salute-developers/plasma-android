package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.244 3.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 2.88 c 0.0 1.725 0.774 3.359 2.11 4.45 l 2.896 2.4 c 0.29 0.238 0.458 0.593 0.458 0.968 v 6.302 c 0.0 0.235 0.11 0.457 0.299 0.599 c 0.188 0.142 0.431 0.187 0.657 0.122 l 2.584 -0.98 c 0.321 -0.092 0.543 -0.386 0.543 -0.721 v -5.303 c 0.0 -0.375 0.169 -0.73 0.459 -0.967 l 2.938 -2.42 c 1.334 -1.091 2.108 -2.725 2.108 -4.45 V 3.75 c 0.0 -0.414 -0.335 -0.75 -0.75 -0.75 H 5.244 Z m 7.506 3.25 C 12.336 6.25 12.0 6.586 12.0 7.0 s 0.336 0.75 0.75 0.75 h 4.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -4.0 Z")
        )
    }.build()
}
