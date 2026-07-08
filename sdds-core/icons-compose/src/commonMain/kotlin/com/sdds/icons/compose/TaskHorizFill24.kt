package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TaskHorizFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TaskHorizFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.775 19.646 C 4.47 20.0 5.38 20.0 7.2 20.0 h 9.6 c 1.82 0.0 2.73 0.0 3.425 -0.354 c 0.612 -0.312 1.11 -0.809 1.42 -1.42 C 22.0 17.53 22.0 16.62 22.0 14.8 V 9.2 c 0.0 -1.82 0.0 -2.73 -0.354 -3.425 c -0.312 -0.612 -0.809 -1.11 -1.42 -1.42 C 19.53 4.0 18.62 4.0 16.8 4.0 H 7.2 C 5.38 4.0 4.47 4.0 3.775 4.354 c -0.612 0.312 -1.11 0.809 -1.42 1.42 C 2.0 6.47 2.0 7.38 2.0 9.2 v 5.6 c 0.0 1.82 0.0 2.73 0.354 3.425 c 0.312 0.612 0.809 1.11 1.42 1.42 Z M 16.53 10.03 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -4.97 4.97 l -1.97 -1.97 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 2.5 2.5 c 0.293 0.293 0.767 0.293 1.06 0.0 l 5.5 -5.5 Z")
        )
    }.build()
}
