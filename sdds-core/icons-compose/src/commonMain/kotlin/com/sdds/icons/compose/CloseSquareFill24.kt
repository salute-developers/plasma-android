package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloseSquareFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloseSquareFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.25 3.0 C 4.455 3.0 3.0 4.455 3.0 6.25 v 11.5 C 3.0 19.545 4.455 21.0 6.25 21.0 h 11.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 V 6.25 C 21.0 4.455 19.545 3.0 17.75 3.0 H 6.25 Z m 10.523 4.227 c 0.293 0.293 0.293 0.768 0.0 1.06 L 13.061 12.0 l 3.712 3.712 c 0.293 0.293 0.293 0.768 0.0 1.061 c -0.293 0.293 -0.768 0.293 -1.06 0.0 L 12.0 13.061 l -3.712 3.712 c -0.293 0.293 -0.768 0.293 -1.061 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 L 10.939 12.0 L 7.227 8.288 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 c 0.293 -0.294 0.768 -0.294 1.06 0.0 L 12.0 10.938 l 3.712 -3.712 c 0.293 -0.293 0.768 -0.293 1.061 0.0 Z")
        )
    }.build()
}
