package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Timer45Fill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Timer45Fill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 3.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 5.5 c 0.414 0.0 0.75 0.336 0.75 0.75 S 15.164 4.0 14.75 4.0 h -5.5 C 8.836 4.0 8.5 3.664 8.5 3.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.5 13.5 c 0.0 4.694 -3.806 8.5 -8.5 8.5 s -8.5 -3.806 -8.5 -8.5 S 7.306 5.0 12.0 5.0 c 1.95 0.0 3.745 0.656 5.18 1.76 l 0.79 -0.79 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 l -0.746 0.746 c 1.377 1.51 2.216 3.52 2.216 5.724 Z m -8.0 -2.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 3.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 14.0 V 13.0 h 1.75 c 0.966 0.0 1.75 0.784 1.75 1.75 v 1.0 c 0.0 0.966 -0.784 1.75 -1.75 1.75 h -2.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 12.836 16.0 13.25 16.0 h 2.5 c 0.138 0.0 0.25 -0.112 0.25 -0.25 v -1.0 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -2.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 v -3.0 Z m -4.5 0.0 C 8.0 10.336 7.664 10.0 7.25 10.0 S 6.5 10.336 6.5 10.75 v 3.0 c 0.0 0.414 0.336 0.75 0.75 0.75 H 10.0 v 2.25 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -6.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 10.0 10.336 10.0 10.75 V 13.0 H 8.0 v -2.25 Z")
        )
    }.build()
}
