package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelOffOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelOffOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.0 6.63 c 0.0 1.725 -0.774 3.359 -2.108 4.451 l -2.934 2.4 c -0.29 0.237 -0.458 0.592 -0.458 0.967 v 5.302 c 0.0 0.335 -0.222 0.629 -0.544 0.72 l -3.5 1.0 c -0.226 0.065 -0.47 0.02 -0.657 -0.121 c -0.188 -0.142 -0.299 -0.364 -0.299 -0.6 v -4.096 l 1.5 -1.5 v 4.603 l 2.0 -0.572 v -4.736 c 0.0 -0.825 0.37 -1.606 1.009 -2.129 l 2.933 -2.4 c 0.67 -0.547 1.147 -1.28 1.385 -2.094 L 20.0 6.153 v 0.478 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.44 2.47 c 0.293 -0.293 0.768 -0.293 1.061 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 l -3.503 3.502 c -0.016 0.389 -0.327 0.7 -0.716 0.716 L 3.53 20.501 c -0.292 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 l 6.235 -6.237 l -2.596 -2.123 C 4.774 9.989 4.0 8.355 4.0 6.631 V 3.75 C 4.0 3.336 4.336 3.0 4.75 3.0 h 14.16 l 0.53 -0.53 Z M 5.5 6.63 c 0.0 1.275 0.572 2.483 1.559 3.29 l 2.712 2.219 l 4.39 -4.39 h -1.41 C 12.335 7.75 12.0 7.415 12.0 7.0 c 0.0 -0.413 0.335 -0.75 0.75 -0.75 h 2.91 l 1.75 -1.75 H 5.5 v 2.132 Z")
        )
    }.build()
}
