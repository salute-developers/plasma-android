package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapHoriz24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapHoriz24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 16.03 3.22 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 2.22 2.22 H 5.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 4.586 8.0 5.0 8.0 h 12.19 l -2.22 2.22 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 3.5 -3.5 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -3.5 -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 7.97 12.72 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 L 6.81 16.0 H 19.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 19.414 17.5 19.0 17.5 H 6.81 l 2.22 2.22 c 0.293 0.293 0.293 0.768 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -3.5 -3.5 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 3.5 -3.5 Z")
        )
    }.build()
}
