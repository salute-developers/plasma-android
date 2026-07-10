package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RublePlusDollar24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RublePlusDollar24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 3.75 C 4.5 3.336 4.836 3.0 5.25 3.0 H 8.0 c 1.657 0.0 3.0 1.343 3.0 3.0 S 9.657 9.0 8.0 9.0 H 6.0 v 1.0 h 1.75 c 0.414 0.0 0.75 0.336 0.75 0.75 S 8.164 11.5 7.75 11.5 H 6.0 v 0.75 C 6.0 12.664 5.664 13.0 5.25 13.0 S 4.5 12.664 4.5 12.25 V 11.5 H 3.75 C 3.336 11.5 3.0 11.164 3.0 10.75 S 3.336 10.0 3.75 10.0 H 4.5 V 9.0 H 3.75 C 3.336 9.0 3.0 8.664 3.0 8.25 S 3.336 7.5 3.75 7.5 H 4.5 V 3.75 Z M 6.0 7.5 h 2.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 S 8.828 4.5 8.0 4.5 H 6.0 v 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 20.78 4.28 l -16.5 16.5 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 16.5 -16.5 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 18.55 11.25 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 0.762 c -1.263 0.126 -2.25 1.192 -2.25 2.488 c 0.0 1.38 1.12 2.5 2.5 2.5 h 1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -2.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 1.0 v 0.75 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -0.762 c 1.263 -0.126 2.25 -1.192 2.25 -2.488 c 0.0 -1.38 -1.12 -2.5 -2.5 -2.5 h -1.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 2.25 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 19.964 12.0 19.55 12.0 h -1.0 v -0.75 Z")
        )
    }.build()
}
