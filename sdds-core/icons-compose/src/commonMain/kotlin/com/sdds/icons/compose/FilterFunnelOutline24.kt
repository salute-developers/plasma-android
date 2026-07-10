package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 6.25 C 12.336 6.25 12.0 6.586 12.0 7.0 s 0.336 0.75 0.75 0.75 h 3.5 C 16.664 7.75 17.0 7.414 17.0 7.0 s -0.336 -0.75 -0.75 -0.75 h -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.75 3.0 C 4.336 3.0 4.0 3.336 4.0 3.75 v 2.88 c 0.0 1.725 0.774 3.359 2.109 4.45 l 2.933 2.4 c 0.29 0.238 0.458 0.593 0.458 0.968 v 6.302 c 0.0 0.235 0.11 0.457 0.298 0.599 c 0.188 0.142 0.432 0.187 0.658 0.122 l 3.5 -1.0 c 0.322 -0.092 0.544 -0.386 0.544 -0.721 v -5.302 c 0.0 -0.375 0.168 -0.73 0.459 -0.968 l 2.932 -2.4 C 19.226 9.99 20.0 8.356 20.0 6.63 V 3.75 C 20.0 3.336 19.664 3.0 19.25 3.0 H 4.75 Z M 5.5 6.63 V 4.5 h 13.0 v 2.13 c 0.0 1.275 -0.572 2.483 -1.559 3.29 l -2.932 2.4 C 13.37 12.841 13.0 13.622 13.0 14.447 v 4.736 l -2.0 0.572 v -5.308 c 0.0 -0.825 -0.37 -1.606 -1.009 -2.129 L 7.06 9.92 C 6.072 9.114 5.5 7.906 5.5 6.632 Z")
        )
    }.build()
}
