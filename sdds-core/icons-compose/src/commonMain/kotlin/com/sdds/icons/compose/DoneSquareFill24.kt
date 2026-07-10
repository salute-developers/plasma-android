package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoneSquareFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoneSquareFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.25 3.0 C 4.455 3.0 3.0 4.455 3.0 6.25 v 11.5 C 3.0 19.545 4.455 21.0 6.25 21.0 h 11.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 V 6.25 C 21.0 4.455 19.545 3.0 17.75 3.0 H 6.25 Z m 11.78 6.28 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 L 10.0 15.19 l -2.47 -2.47 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 3.0 3.0 c 0.293 0.293 0.768 0.293 1.06 0.0 l 7.5 -7.5 Z")
        )
    }.build()
}
