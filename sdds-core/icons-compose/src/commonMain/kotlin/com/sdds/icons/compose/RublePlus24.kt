package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RublePlus24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RublePlus24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 2.75 C 4.5 2.336 4.836 2.0 5.25 2.0 H 8.0 c 1.657 0.0 3.0 1.343 3.0 3.0 S 9.657 8.0 8.0 8.0 H 6.0 v 1.0 h 1.75 C 8.164 9.0 8.5 9.336 8.5 9.75 S 8.164 10.5 7.75 10.5 H 6.0 v 0.75 C 6.0 11.664 5.664 12.0 5.25 12.0 S 4.5 11.664 4.5 11.25 V 10.5 H 3.75 C 3.336 10.5 3.0 10.164 3.0 9.75 S 3.336 9.0 3.75 9.0 H 4.5 V 8.0 H 3.75 C 3.336 8.0 3.0 7.664 3.0 7.25 S 3.336 6.5 3.75 6.5 H 4.5 V 2.75 Z M 6.0 6.5 h 2.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 S 8.828 3.5 8.0 3.5 H 6.0 v 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 20.78 3.22 c 0.293 0.293 0.293 0.767 0.0 1.06 l -16.5 16.5 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 16.5 -16.5 c 0.293 -0.293 0.767 -0.293 1.06 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 17.75 13.5 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 2.75 H 13.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 2.75 v 2.75 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -2.75 h 2.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -2.75 V 13.5 Z")
        )
    }.build()
}
