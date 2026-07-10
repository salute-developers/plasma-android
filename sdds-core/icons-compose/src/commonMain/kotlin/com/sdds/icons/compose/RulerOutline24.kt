package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RulerOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RulerOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.24 2.543 c -0.685 -0.675 -1.787 -0.671 -2.467 0.009 L 2.563 16.765 c -0.68 0.68 -0.684 1.78 -0.01 2.465 l 2.218 2.254 c 0.682 0.693 1.799 0.697 2.486 0.01 L 21.493 7.238 c 0.686 -0.687 0.682 -1.801 -0.01 -2.483 L 19.24 2.543 Z m -1.406 1.07 c 0.097 -0.098 0.254 -0.098 0.352 -0.002 l 2.244 2.213 c 0.099 0.098 0.1 0.257 0.002 0.355 L 6.196 20.433 c -0.099 0.098 -0.258 0.098 -0.355 -0.001 l -2.218 -2.254 c -0.097 -0.098 -0.096 -0.255 0.001 -0.352 l 0.902 -0.903 l 1.142 1.143 c 0.293 0.292 0.768 0.292 1.06 0.0 c 0.294 -0.293 0.294 -0.768 0.0 -1.061 l -1.141 -1.142 l 1.767 -1.768 l 1.143 1.142 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 l -1.142 -1.143 l 1.767 -1.768 l 1.143 1.143 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.294 -0.293 0.294 -0.768 0.0 -1.061 l -1.142 -1.143 l 1.767 -1.768 l 1.144 1.143 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 l -1.143 -1.144 l 1.767 -1.768 l 1.144 1.144 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 L 16.9 4.546 l 0.935 -0.935 Z")
        )
    }.build()
}
