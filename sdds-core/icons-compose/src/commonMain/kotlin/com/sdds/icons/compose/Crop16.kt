package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Crop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Crop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.595 1.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 1.6 h 6.7 l 0.215 0.01 c 1.059 0.108 1.885 1.002 1.885 2.09 v 6.71 h 1.575 l 0.1 0.01 c 0.229 0.047 0.4 0.249 0.4 0.49 c 0.0 0.242 -0.171 0.444 -0.4 0.49 l -0.1 0.01 h -1.6 v 1.59 l -0.01 0.1 C 12.813 14.83 12.61 15.0 12.37 15.0 c -0.242 0.0 -0.444 -0.172 -0.49 -0.4 l -0.01 -0.1 v -1.6 H 5.195 c -1.087 0.0 -1.981 -0.826 -2.089 -1.884 L 3.096 10.8 V 4.1 H 1.52 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 1.575 V 1.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z m 0.5 9.8 c 0.0 0.608 0.493 1.1 1.1 1.1 h 6.7 V 5.2 c 0.0 -0.608 -0.492 -1.1 -1.1 -1.1 h -6.7 v 6.7 Z")
        )
    }.build()
}
