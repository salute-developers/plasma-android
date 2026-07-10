package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapVert24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapVert24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 20.78 16.03 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -2.22 2.22 V 5.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 16.0 4.586 16.0 5.0 v 12.19 l -2.22 -2.22 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 3.5 3.5 c 0.293 0.293 0.767 0.293 1.06 0.0 l 3.5 -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 11.28 7.97 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.292 0.293 -0.767 0.293 -1.06 0.0 L 8.0 6.81 V 19.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 6.5 19.414 6.5 19.0 V 6.81 L 4.28 9.03 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 3.5 -3.5 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 3.5 3.5 Z")
        )
    }.build()
}
