package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MarkerFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MarkerFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.117 13.127 L 2.871 10.88 l 0.374 -0.374 C 4.452 9.3 4.892 8.437 5.047 7.922 c 0.077 -0.257 0.084 -0.43 0.08 -0.524 V 7.392 l 3.479 3.48 H 8.6 c -0.093 -0.005 -0.267 0.002 -0.523 0.08 c -0.516 0.154 -1.379 0.594 -2.586 1.8 l -0.374 0.374 Z m 4.488 -2.741 L 5.612 6.394 l 5.578 -5.577 c 0.181 -0.182 0.478 -0.358 0.845 -0.309 c 0.466 0.062 1.254 0.329 2.191 1.265 c 0.937 0.937 1.203 1.725 1.265 2.191 c 0.05 0.367 -0.127 0.664 -0.308 0.845 l -5.578 5.577 Z m -5.61 2.616 l -0.998 -0.998 L 1.5 13.5 L 2.997 14.0 l 0.999 -0.998 Z")
        )
    }.build()
}
