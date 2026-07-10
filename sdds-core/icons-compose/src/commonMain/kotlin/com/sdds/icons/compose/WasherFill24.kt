package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WasherFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WasherFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 8.25 13.25 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 0.101 -0.004 0.202 -0.012 0.301 C 15.23 13.783 14.745 14.0 14.0 14.0 c -1.0 0.0 -1.5 -0.25 -2.0 -0.5 S 11.0 13.0 10.0 13.0 c -0.834 0.0 -1.32 0.174 -1.748 0.376 L 8.25 13.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.25 2.0 C 4.455 2.0 3.0 3.455 3.0 5.25 v 13.5 C 3.0 20.545 4.455 22.0 6.25 22.0 h 11.5 c 1.795 0.0 3.25 -1.455 3.25 -3.25 V 5.25 C 21.0 3.455 19.545 2.0 17.75 2.0 H 6.25 Z M 7.0 7.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 S 7.552 5.0 7.0 5.0 S 6.0 5.448 6.0 6.0 s 0.448 1.0 1.0 1.0 Z m 5.75 -1.75 C 12.336 5.25 12.0 5.586 12.0 6.0 s 0.336 0.75 0.75 0.75 h 4.5 C 17.664 6.75 18.0 6.414 18.0 6.0 s -0.336 -0.75 -0.75 -0.75 h -4.5 Z m -5.956 8.687 C 6.765 13.712 6.75 13.482 6.75 13.25 C 6.75 10.35 9.1 8.0 12.0 8.0 s 5.25 2.35 5.25 5.25 S 14.9 18.5 12.0 18.5 c -2.667 0.0 -4.87 -1.988 -5.206 -4.563 Z")
        )
    }.build()
}
